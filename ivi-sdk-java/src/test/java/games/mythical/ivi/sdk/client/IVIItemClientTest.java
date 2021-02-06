package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.MockItemExecutor;
import games.mythical.ivi.sdk.client.model.IVIItem;
import games.mythical.ivi.sdk.client.model.IVIItemMetadata;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.item.Item;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import games.mythical.ivi.sdk.server.item.MockItemServer;
import games.mythical.ivi.sdk.util.ConcurrentFinisher;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IVIItemClientTest extends AbstractClientTest {
    private MockItemServer itemServer;
    private MockItemExecutor itemExecutor;
    private IVIItemClient itemClient;
    private Map<String, IVIItem> items;

    @BeforeEach
    void setUp() throws Exception {
        itemServer = new MockItemServer();
        itemServer.start();
        port = itemServer.getPort();
        setUpConfig();

        items = generateItems(3);
        itemServer.getItemService().setItems(items.values());

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        itemExecutor = MockItemExecutor.builder().build();
        itemClient = new IVIItemClient(itemExecutor, channel);
    }

    @AfterEach
    void tearDown() {
        itemServer.stop();
    }

    @Test
    void issueItem() throws Exception {
        var item = generateNewItem();

        var properties = generateProperties(5);

        itemClient.issueItem(item.getGameInventoryId(),
                item.getPlayerId(),
                item.getItemName(),
                item.getItemTypeId(),
                properties,
                BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)),
                currency);

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertFalse(StringUtils.isEmpty(itemExecutor.getTrackingId()));
        assertEquals(ItemState.PENDING_ISSUED, itemExecutor.getItemState());

        itemServer.verifyCalls("IssueItem", 1);

        ConcurrentFinisher.start(itemExecutor.getTrackingId());

        var trackingId = itemExecutor.getTrackingId();
        var dGoodsId = RandomUtils.nextInt(1,1000);
        var serialNumber = RandomUtils.nextInt(1, 1000);
        var metadataUri= RandomStringUtils.randomAlphanumeric(30);
        itemServer.getItemStream().sendStatus(environmentId, Item.newBuilder()
                .setGameInventoryId(item.getGameInventoryId())
                .setItemTypeId(item.getItemTypeId())
                .setPlayerId(item.getPlayerId())
                .setDgoodsId(dGoodsId)
                .setSerialNumber(serialNumber)
                .setMetadataUri(metadataUri)
                .setTrackingId(trackingId)
                .build(), ItemState.ISSUED);

        ConcurrentFinisher.wait(itemExecutor.getTrackingId());

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertEquals(trackingId, itemExecutor.getTrackingId());
        assertEquals(dGoodsId, itemExecutor.getDGoodsId());
        assertEquals(serialNumber, itemExecutor.getSerialNumber());
        assertEquals(metadataUri, itemExecutor.getMetadataUri());
        assertEquals(ItemState.ISSUED, itemExecutor.getItemState());

        itemServer.verifyCalls("ItemStatusStream", 1);
        itemServer.verifyCalls("ItemStatusConfirmation", 1);
    }

    @Test
    public void transferItem() throws Exception {
        var gameInventoryId= items.keySet().iterator().next();
        var item = items.get(gameInventoryId);
        var newPlayerId = RandomStringUtils.randomAlphanumeric(30);
        var initialTrackingId = item.getTrackingId();

        // init item in the executor as if it's an existing db entry
        itemExecutor.setFromItem(item);

        itemClient.transferItem(gameInventoryId, item.getPlayerId(), newPlayerId);

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertNotEquals(initialTrackingId, itemExecutor.getTrackingId());
        assertEquals(item.getDGoodsId(), itemExecutor.getDGoodsId());
        assertEquals(item.getSerialNumber(), itemExecutor.getSerialNumber());
        assertEquals(item.getMetadataUri(), itemExecutor.getMetadataUri());
        assertEquals(ItemState.PENDING_TRANSFERRED, itemExecutor.getItemState());

        itemServer.verifyCalls("TransferItem", 1);

        ConcurrentFinisher.start(itemExecutor.getTrackingId());

        var trackingId = itemExecutor.getTrackingId();
        itemServer.getItemStream().sendStatus(environmentId, Item.newBuilder()
                .setGameInventoryId(gameInventoryId)
                .setItemTypeId(item.getItemTypeId())
                .setPlayerId(newPlayerId)
                .setDgoodsId(item.getDGoodsId())
                .setSerialNumber(item.getSerialNumber())
                .setMetadataUri(item.getMetadataUri())
                .setTrackingId(trackingId)
                .build(), ItemState.TRANSFERRED);

        ConcurrentFinisher.wait(itemExecutor.getTrackingId());

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertEquals(trackingId, itemExecutor.getTrackingId());
        assertEquals(item.getDGoodsId(), itemExecutor.getDGoodsId());
        assertEquals(item.getSerialNumber(), itemExecutor.getSerialNumber());
        assertEquals(item.getMetadataUri(), itemExecutor.getMetadataUri());
        assertEquals(ItemState.TRANSFERRED, itemExecutor.getItemState());

        itemServer.verifyCalls("ItemStatusStream", 1);
        itemServer.verifyCalls("ItemStatusConfirmation", 1);

        var itemResponse = itemClient.getItem(gameInventoryId);
        assertTrue(itemResponse.isPresent());
        assertEquals(newPlayerId, itemResponse.get().getPlayerId());
    }

    @Test
    public void burnItem() throws Exception {
        var gameInventoryId= items.keySet().iterator().next();
        var item = items.get(gameInventoryId);
        var initialTrackingId = item.getTrackingId();

        // init item in the executor as if it's an existing db entry
        itemExecutor.setFromItem(item);

        itemClient.burnItem(gameInventoryId);

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertNotEquals(initialTrackingId, itemExecutor.getTrackingId());
        assertEquals(item.getDGoodsId(), itemExecutor.getDGoodsId());
        assertEquals(item.getSerialNumber(), itemExecutor.getSerialNumber());
        assertEquals(item.getMetadataUri(), itemExecutor.getMetadataUri());
        assertEquals(ItemState.PENDING_BURNED, itemExecutor.getItemState());

        itemServer.verifyCalls("BurnItem", 1);

        ConcurrentFinisher.start(itemExecutor.getTrackingId());

        var trackingId = itemExecutor.getTrackingId();
        itemServer.getItemStream().sendStatus(environmentId, Item.newBuilder()
                .setGameInventoryId(gameInventoryId)
                .setItemTypeId(item.getItemTypeId())
                .setPlayerId(item.getPlayerId())
                .setDgoodsId(item.getDGoodsId())
                .setSerialNumber(item.getSerialNumber())
                .setMetadataUri(item.getMetadataUri())
                .setTrackingId(trackingId)
                .build(), ItemState.BURNED);

        ConcurrentFinisher.wait(itemExecutor.getTrackingId());

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertEquals(trackingId, itemExecutor.getTrackingId());
        assertEquals(item.getDGoodsId(), itemExecutor.getDGoodsId());
        assertEquals(item.getSerialNumber(), itemExecutor.getSerialNumber());
        assertEquals(item.getMetadataUri(), itemExecutor.getMetadataUri());
        assertEquals(ItemState.BURNED, itemExecutor.getItemState());

        itemServer.verifyCalls("ItemStatusStream", 1);
        itemServer.verifyCalls("ItemStatusConfirmation", 1);
    }

    @Test
    public void getItem() throws Exception {
        var gameInventoryId= items.keySet().iterator().next();

        var itemResponse = itemClient.getItem(gameInventoryId);

        assertTrue(itemResponse.isPresent());
        var item = itemResponse.get();
        assertEquals(gameInventoryId, item.getGameInventoryId());

        gameInventoryId = RandomStringUtils.randomAlphanumeric(30);
        itemResponse = itemClient.getItem(gameInventoryId);

        assertTrue(itemResponse.isEmpty());

        itemServer.verifyCalls("GetItem", 2);
    }

    @Test
    public void getItems()  throws Exception {
        var itemIds = new ArrayList<>(items.keySet());
        itemIds.remove(0);
        itemIds.add(RandomStringUtils.randomAlphanumeric(30));

        var itemResult = itemClient.getItems(itemIds);

        assertEquals(itemIds.size() - 1, itemResult.size());

        for (var item : itemResult) {
            verifyItem(items.get(item.getGameInventoryId()), item);
        }

        itemServer.verifyCalls("GetItems", 1);
    }

    @Test
    public void updateItemMetadata() throws Exception {
        var item= items.values().iterator().next();

        item.setProperties(generateProperties(3));

        itemClient.updateItemMetadata(item.getGameInventoryId(), item.getProperties());

        itemServer.verifyCalls("UpdateItemMetadata", 1);

        var newItem = itemClient.getItem(item.getGameInventoryId());

        assertTrue(newItem.isPresent());
        verifyItem(item, newItem.get());

        itemServer.verifyCalls("GetItem", 1);
    }

    @Test
    public void updateItemMetadataComplete() throws Exception {
        var item= items.values().iterator().next();

        item.setProperties(generateProperties(3));
        item.setMetadata(generateItemMetadata(1).get(0));

        itemClient.updateItemMetadataComplete(item.getGameInventoryId(), item.getProperties(), item.getMetadata());

        itemServer.verifyCalls("UpdateItemMetadata", 1);

        var newItem = itemClient.getItem(item.getGameInventoryId());

        assertTrue(newItem.isPresent());
        verifyItem(item, newItem.get());

        itemServer.verifyCalls("GetItem", 1);
    }

    @Test
    public void updateItemMetadataNotFound() {
        var itemId = RandomStringUtils.randomAlphanumeric(30);

        try {
            itemClient.updateItemMetadata(itemId, generateProperties(1));
            fail("Should have thrown NOT FOUND exception!");
        } catch (IVIException e) {
            if(e.getCode() != IVIErrorCode.NOT_FOUND) {
                fail("Should have thrown NOT FOUND exception!");
            }
        }
    }

    void verifyItem(IVIItem expectedItem, IVIItem actualItem) {
        assertEquals(expectedItem.getGameInventoryId(), actualItem.getGameInventoryId());
        assertEquals(expectedItem.getItemTypeId(), actualItem.getItemTypeId());
        assertEquals(expectedItem.getItemName(), actualItem.getItemName());
        assertEquals(expectedItem.getDGoodsId(), actualItem.getDGoodsId());
        assertEquals(expectedItem.getPlayerId(), actualItem.getPlayerId());
        assertEquals(expectedItem.getOwnerSidechainAccount(), actualItem.getOwnerSidechainAccount());
        assertEquals(expectedItem.getSerialNumber(), actualItem.getSerialNumber());
        assertEquals(expectedItem.getCurrencyBase(), actualItem.getCurrencyBase());
        assertEquals(expectedItem.getMetadataUri(), actualItem.getMetadataUri());
        assertEquals(expectedItem.getTrackingId(), actualItem.getTrackingId());
        assertEquals(expectedItem.getItemState(), actualItem.getItemState());
        assertEquals(expectedItem.getCreatedTimestamp(), actualItem.getCreatedTimestamp());
        assertEquals(expectedItem.getUpdatedTimestamp(), actualItem.getUpdatedTimestamp());

        verifyProperties(expectedItem.getProperties(), actualItem.getProperties());
        verifyMetadata(expectedItem.getMetadata(), actualItem.getMetadata());
    }

    void verifyProperties(Map<String, String> expectedProperties, Map<String, String> actualProperties) {
        for (var key : expectedProperties.keySet()) {
            if(actualProperties.containsKey(key)) {
                assertEquals(expectedProperties.get(key), actualProperties.get(key));
            } else {
                fail("Property key " + key + " is missing!");
            }
        }
    }

    void verifyMetadata(IVIItemMetadata expectedMetadata, IVIItemMetadata actualMetadata) {
        assertEquals(expectedMetadata.getDescription(), actualMetadata.getDescription());
        assertEquals(expectedMetadata.getImageLargeUrl(), actualMetadata.getImageLargeUrl());
        assertEquals(expectedMetadata.getImageSmallUrl(), actualMetadata.getImageSmallUrl());
        assertEquals(expectedMetadata.getRender(), actualMetadata.getRender());
        assertEquals(expectedMetadata.getAuthenticityImage(), actualMetadata.getAuthenticityImage());
    }
}