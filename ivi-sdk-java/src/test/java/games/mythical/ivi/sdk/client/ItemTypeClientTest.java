package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.proto.api.itemtype.ItemType;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import games.mythical.ivi.sdk.server.itemtype.MockItemTypeServer;
import games.mythical.ivi.sdk.server.itemtype.MockItemTypeStreamImpl;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.*;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.*;

class ItemTypeClientTest extends AbstractClientTest {
    private MockItemTypeServer itemTypeServer;
    private MockItemTypeExecutor itemTypeExecutor;
    private ItemTypeClient itemTypeClient;
    private Map<String, ItemType> itemTypes;

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
        itemTypeClient = new ItemTypeClient(itemTypeExecutor, channel);
    }

    @AfterEach
    void tearDown() throws Exception {
        itemTypeServer.stop();
    }

    @Test
    void testCreateItemType() throws Exception {
        var mockItemType = generateNewItemType();

        itemTypeClient.createItemType(mockItemType.getTokenName(),
                mockItemType.getCategory(),
                mockItemType.getMaxSupply(),
                mockItemType.getIssueTimeSpan(),
                mockItemType.getBurnable(),
                mockItemType.getTransferable(),
                mockItemType.getSellable(),
                mockItemType.getAgreementIdsList());

        assertFalse(StringUtils.isEmpty(itemTypeExecutor.getItemTypeId()));
        assertFalse(StringUtils.isEmpty(itemTypeExecutor.getTrackingId()));
        assertEquals(ItemTypeState.PENDING_CREATE, itemTypeExecutor.getItemTypeState());

        itemTypeServer.verifyCalls("CreateItemType", 1);

        var itemTypeId = itemTypeExecutor.getItemTypeId();
        var trackingId = itemTypeExecutor.getTrackingId();
        var baseUrl = RandomStringUtils.randomAlphanumeric(30);
        var issueTimeSpan = RandomUtils.nextInt(10, 50);
        var maxSupply = mockItemType.getMaxSupply();

        var finished = new AtomicBoolean();
        finished.set(false);
        MockItemTypeStreamImpl.finished.put(trackingId, finished);

        itemTypeServer.getItemStream().sendStatus(environmentId, ItemType.newBuilder()
                .setItemTypeId(itemTypeId)
                .setCurrentSupply(maxSupply)
                .setIssuedSupply(0)
                .setBaseUri(baseUrl)
                .setIssueTimeSpan(issueTimeSpan)
                .setTrackingId(trackingId)
                .build(), ItemTypeState.CREATED);

        while (!finished.compareAndSet(true, false)) {
            Thread.sleep(10);
        }

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

        var finished = new AtomicBoolean();
        finished.set(false);
        MockItemTypeStreamImpl.finished.put(newTrackingId, finished);

        itemTypeServer.getItemStream().sendStatus(environmentId, ItemType.newBuilder()
                .setItemTypeId(itemTypeId)
                .setCurrentSupply(currentSupply)
                .setIssuedSupply(issuedSupply)
                .setBaseUri(baseUrl)
                .setIssueTimeSpan(issueTimeSpan)
                .setTrackingId(newTrackingId)
                .build(), ItemTypeState.FROZEN);

        while (!finished.compareAndSet(true, false)) {
            Thread.sleep(10);
        }

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
    void getItemType() {
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
    void getItemTypeNonExisting() {
        var itemType = itemTypeClient.getItemType(RandomStringUtils.randomAlphanumeric(30));

        assertTrue(itemType.isEmpty());

        itemTypeServer.verifyCalls("GetItemTypes", 1);
    }

    @Test
    void getItemTypes() {
        var result = itemTypeClient.getItemTypes(itemTypes.keySet());

        for(var itemType : result) {
            assertEquals(itemTypes.get(itemType.getItemTypeId()).getItemTypeState(), itemType.getItemTypeState());
            assertEquals(itemTypes.get(itemType.getItemTypeId()).getItemTypeId(), itemType.getItemTypeId());
            assertEquals(itemTypes.get(itemType.getItemTypeId()).getTrackingId(), itemType.getTrackingId());
            assertEquals(itemTypes.get(itemType.getItemTypeId()).getBaseUri(), itemType.getBaseUri());
            assertEquals(itemTypes.get(itemType.getItemTypeId()).getIssueTimeSpan(), itemType.getIssueTimeSpan());
            assertEquals(itemTypes.get(itemType.getItemTypeId()).getCurrentSupply(), itemType.getCurrentSupply());
            assertEquals(itemTypes.get(itemType.getItemTypeId()).getIssuedSupply(), itemType.getIssuedSupply());
        }

        itemTypeServer.verifyCalls("GetItemTypes", 1);
    }
}