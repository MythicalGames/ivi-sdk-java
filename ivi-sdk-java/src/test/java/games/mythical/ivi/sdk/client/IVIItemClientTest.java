package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.MockItemExecutor;
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
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IVIItemClientTest extends AbstractClientTest {
    private static final String currency = "BB";
    private MockItemServer itemServer;
    private MockItemExecutor itemExecutor;
    private IVIItemClient itemClient;
    private Map<String, Item> items;

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

        var metadata = new HashMap<String, Object>();
        for(var i = 0; i < 5; i++) {
            metadata.put(RandomStringUtils.randomAlphanumeric(10), RandomStringUtils.randomAlphanumeric(30));
        }

        itemClient.issueItem(item.getGameInventoryId(), item.getPlayerId(), item.getItemName(), item.getTokenName(),
                metadata, BigDecimal.valueOf(Double.parseDouble(item.getAmountPaid())), currency);

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
                .setPlayerId(item.getPlayerId())
                .setDgoodsId(dGoodsId)
                .setSerialNumber(serialNumber)
                .setTokenName(item.getTokenName())
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
        var memo = RandomStringUtils.randomAlphanumeric(60);
        var initialTrackingId = item.getTrackingId();

        // init item in the executor as if it's an existing db entry
        itemExecutor.setFromItem(item);

        itemClient.transferItem(gameInventoryId, item.getPlayerId(), newPlayerId, memo);

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertNotEquals(initialTrackingId, itemExecutor.getTrackingId());
        assertEquals(item.getDgoodsId(), itemExecutor.getDGoodsId());
        assertEquals(item.getSerialNumber(), itemExecutor.getSerialNumber());
        assertEquals(item.getMetadataUri(), itemExecutor.getMetadataUri());
        assertEquals(ItemState.PENDING_TRANSFERRED, itemExecutor.getItemState());

        itemServer.verifyCalls("TransferItem", 1);

        ConcurrentFinisher.start(itemExecutor.getTrackingId());

        var trackingId = itemExecutor.getTrackingId();
        itemServer.getItemStream().sendStatus(environmentId, Item.newBuilder()
                .setGameInventoryId(gameInventoryId)
                .setPlayerId(newPlayerId)
                .setDgoodsId(item.getDgoodsId())
                .setSerialNumber(item.getSerialNumber())
                .setTokenName(item.getTokenName())
                .setMetadataUri(item.getMetadataUri())
                .setTrackingId(trackingId)
                .build(), ItemState.TRANSFERRED);

        ConcurrentFinisher.wait(itemExecutor.getTrackingId());

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertEquals(trackingId, itemExecutor.getTrackingId());
        assertEquals(item.getDgoodsId(), itemExecutor.getDGoodsId());
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
        assertEquals(item.getDgoodsId(), itemExecutor.getDGoodsId());
        assertEquals(item.getSerialNumber(), itemExecutor.getSerialNumber());
        assertEquals(item.getMetadataUri(), itemExecutor.getMetadataUri());
        assertEquals(ItemState.PENDING_BURNED, itemExecutor.getItemState());

        itemServer.verifyCalls("BurnItem", 1);

        ConcurrentFinisher.start(itemExecutor.getTrackingId());

        var trackingId = itemExecutor.getTrackingId();
        itemServer.getItemStream().sendStatus(environmentId, Item.newBuilder()
                .setGameInventoryId(gameInventoryId)
                .setPlayerId(item.getPlayerId())
                .setDgoodsId(item.getDgoodsId())
                .setSerialNumber(item.getSerialNumber())
                .setTokenName(item.getTokenName())
                .setMetadataUri(item.getMetadataUri())
                .setTrackingId(trackingId)
                .build(), ItemState.BURNED);

        ConcurrentFinisher.wait(itemExecutor.getTrackingId());

        assertEquals(item.getGameInventoryId(), itemExecutor.getGameInventoryId());
        assertEquals(trackingId, itemExecutor.getTrackingId());
        assertEquals(item.getDgoodsId(), itemExecutor.getDGoodsId());
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
            assertEquals(items.get(item.getGameInventoryId()).getGameInventoryId(), item.getGameInventoryId());
            assertEquals(items.get(item.getGameInventoryId()).getTrackingId(), item.getTrackingId());
            assertEquals(items.get(item.getGameInventoryId()).getDgoodsId(), item.getDgoodsId());
            assertEquals(items.get(item.getGameInventoryId()).getSerialNumber(), item.getSerialNumber());
            assertEquals(items.get(item.getGameInventoryId()).getMetadataUri(), item.getMetadataUri());
            assertEquals(items.get(item.getGameInventoryId()).getItemState(), item.getItemState());
        }

        itemServer.verifyCalls("GetItems", 1);
    }
}