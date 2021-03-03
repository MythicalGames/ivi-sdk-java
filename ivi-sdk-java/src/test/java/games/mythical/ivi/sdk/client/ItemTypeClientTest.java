package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.MockItemTypeExecutor;
import games.mythical.ivi.sdk.client.model.IVIItemType;
import games.mythical.ivi.sdk.proto.api.itemtype.ItemType;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import games.mythical.ivi.sdk.server.itemtype.MockItemTypeServer;
import games.mythical.ivi.sdk.util.ConcurrentFinisher;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.*;

import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ItemTypeClientTest extends AbstractClientTest {
    private MockItemTypeServer itemTypeServer;
    private MockItemTypeExecutor itemTypeExecutor;
    private IVIItemTypeClient itemTypeClient;
    private Map<String, IVIItemType> itemTypes;

    @BeforeEach
    void setUp() throws Exception {
        itemTypeServer = new MockItemTypeServer();
        itemTypeServer.start();
        port = itemTypeServer.getPort();
        setUpConfig();

        itemTypes = generateItemTypes(3);
        itemTypeServer.getItemTypeService().setItemTypes(itemTypes.values());

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        itemTypeExecutor = MockItemTypeExecutor.builder().build();
        itemTypeClient = new IVIItemTypeClient(itemTypeExecutor, channel);
    }

    @AfterEach
    void tearDown() throws Exception {
        itemTypeServer.stop();
        ConcurrentFinisher.reset();
    }

    @Test
    void testCreateItemType() throws Exception {
        var mockItemType = generateNewItemType();

        itemTypeClient.createItemType(mockItemType.getTokenName(),
                mockItemType.getCategory(),
                mockItemType.getMaxSupply(),
                mockItemType.getIssueTimeSpan(),
                mockItemType.isBurnable(),
                mockItemType.isTransferable(),
                mockItemType.isSellable(),
                mockItemType.getAgreementIds(),
                mockItemType.getMetadata());

        assertNotNull(itemTypeExecutor.getItemTypeId());
        assertFalse(StringUtils.isEmpty(itemTypeExecutor.getTrackingId()));
        assertEquals(ItemTypeState.PENDING_CREATE, itemTypeExecutor.getItemTypeState());

        itemTypeServer.verifyCalls("CreateItemType", 1);

        var itemTypeId = itemTypeExecutor.getItemTypeId();
        var trackingId = itemTypeExecutor.getTrackingId();
        var baseUrl = RandomStringUtils.randomAlphanumeric(30);
        var issueTimeSpan = RandomUtils.nextInt(10, 50);
        var maxSupply = mockItemType.getMaxSupply();

        ConcurrentFinisher.start(trackingId);

        itemTypeServer.getItemStream().sendStatus(environmentId, ItemType.newBuilder()
                .setItemTypeId(itemTypeId.toString())
                .setCurrentSupply(maxSupply)
                .setIssuedSupply(0)
                .setBaseUri(baseUrl)
                .setIssueTimeSpan(issueTimeSpan)
                .setTrackingId(trackingId)
                .build(), ItemTypeState.CREATED);

        ConcurrentFinisher.wait(trackingId);

        assertEquals(ItemTypeState.CREATED, itemTypeExecutor.getItemTypeState());
        assertEquals(itemTypeId, itemTypeExecutor.getItemTypeId());
        assertEquals(trackingId, itemTypeExecutor.getTrackingId());
        assertEquals(baseUrl, itemTypeExecutor.getBaseUri());
        assertEquals(issueTimeSpan, itemTypeExecutor.getIssueTimeSpan());
        assertEquals(maxSupply, itemTypeExecutor.getCurrentSupply());
        assertEquals(0, itemTypeExecutor.getIssuedSupply());

        itemTypeServer.verifyCalls("ItemTypeStatusStream", 1);
        itemTypeServer.verifyCalls("ItemTypeStatusConfirmation", 1);
    }

    @Test
    void testFreezeItemType() throws Exception {
        var maxSupply = RandomUtils.nextInt(10, 100);
        var currentSupply = RandomUtils.nextInt(0, maxSupply);
        var issuedSupply = maxSupply - currentSupply;
        var trackingId = RandomStringUtils.randomAlphanumeric(30);

        var mockItemType = generateItemType(trackingId, maxSupply, currentSupply,
                issuedSupply, ItemTypeState.CREATED);
        var itemTypeId = mockItemType.getItemTypeId();

        // set the starting state of the item type
        itemTypeExecutor.setFromItemType(mockItemType);

        itemTypeClient.freezeItemType(itemTypeId);

        assertNotEquals(itemTypeExecutor.getTrackingId(), trackingId);
        assertEquals(itemTypeId, itemTypeExecutor.getItemTypeId());
        assertEquals(ItemTypeState.PENDING_FREEZE, itemTypeExecutor.getItemTypeState());

        itemTypeServer.verifyCalls("FreezeItemType", 1);

        var newTrackingId = itemTypeExecutor.getTrackingId();
        var baseUrl = RandomStringUtils.randomAlphanumeric(30);
        var issueTimeSpan = RandomUtils.nextInt(10, 50);

        ConcurrentFinisher.start(newTrackingId);

        itemTypeServer.getItemStream().sendStatus(environmentId, ItemType.newBuilder()
                .setItemTypeId(itemTypeId.toString())
                .setCurrentSupply(currentSupply)
                .setIssuedSupply(issuedSupply)
                .setBaseUri(baseUrl)
                .setIssueTimeSpan(issueTimeSpan)
                .setTrackingId(newTrackingId)
                .build(), ItemTypeState.FROZEN);

        ConcurrentFinisher.wait(newTrackingId);

        assertEquals(ItemTypeState.FROZEN, itemTypeExecutor.getItemTypeState());
        assertEquals(itemTypeId, itemTypeExecutor.getItemTypeId());
        assertEquals(newTrackingId, itemTypeExecutor.getTrackingId());
        assertEquals(baseUrl, itemTypeExecutor.getBaseUri());
        assertEquals(issueTimeSpan, itemTypeExecutor.getIssueTimeSpan());
        assertEquals(currentSupply, itemTypeExecutor.getCurrentSupply());
        assertEquals(issuedSupply, itemTypeExecutor.getIssuedSupply());

        itemTypeServer.verifyCalls("ItemTypeStatusStream", 1);
        itemTypeServer.verifyCalls("ItemTypeStatusConfirmation", 1);
    }

    @Test
    void getItemType() throws Exception {
        var mockItemType = itemTypes.entrySet().iterator().next().getValue();
        var itemType = itemTypeClient.getItemType(mockItemType.getItemTypeId());

        assertTrue(itemType.isPresent());
        assertEquals(mockItemType.getItemTypeState(), itemType.get().getItemTypeState());
        assertEquals(mockItemType.getItemTypeId(), itemType.get().getItemTypeId());
        assertEquals(mockItemType.getTrackingId(), itemType.get().getTrackingId());
        assertEquals(mockItemType.getBaseUri(), itemType.get().getBaseUri());
        assertEquals(mockItemType.getIssueTimeSpan(), itemType.get().getIssueTimeSpan());
        assertEquals(mockItemType.getCurrentSupply(), itemType.get().getCurrentSupply());
        assertEquals(mockItemType.getIssuedSupply(), itemType.get().getIssuedSupply());

        itemTypeServer.verifyCalls("GetItemTypes", 1);
    }

    @Test
    void getItemTypeNonExisting() throws Exception {
        var itemType = itemTypeClient.getItemType(UUID.randomUUID());

        assertTrue(itemType.isEmpty());

        itemTypeServer.verifyCalls("GetItemTypes", 1);
    }

    @Test
    void getItemTypes() throws Exception {
        var result = itemTypeClient.getItemTypes(itemTypes.keySet().stream().map(UUID::fromString).collect(Collectors.toList()));

        for(var itemType : result) {
            assertEquals(itemTypes.get(itemType.getItemTypeId().toString()).getItemTypeState(), itemType.getItemTypeState());
            assertEquals(itemTypes.get(itemType.getItemTypeId().toString()).getItemTypeId(), itemType.getItemTypeId());
            assertEquals(itemTypes.get(itemType.getItemTypeId().toString()).getTrackingId(), itemType.getTrackingId());
            assertEquals(itemTypes.get(itemType.getItemTypeId().toString()).getBaseUri(), itemType.getBaseUri());
            assertEquals(itemTypes.get(itemType.getItemTypeId().toString()).getIssueTimeSpan(), itemType.getIssueTimeSpan());
            assertEquals(itemTypes.get(itemType.getItemTypeId().toString()).getCurrentSupply(), itemType.getCurrentSupply());
            assertEquals(itemTypes.get(itemType.getItemTypeId().toString()).getIssuedSupply(), itemType.getIssuedSupply());
        }

        itemTypeServer.verifyCalls("GetItemTypes", 1);
    }
}