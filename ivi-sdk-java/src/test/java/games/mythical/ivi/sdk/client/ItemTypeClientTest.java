package games.mythical.ivi.sdk.client;

import com.google.protobuf.Empty;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.api.itemtype.CreateItemAsyncResponse;
import games.mythical.ivi.sdk.proto.api.itemtype.FreezeItemTypeAsyncResponse;
import games.mythical.ivi.sdk.proto.api.itemtype.FreezeItemTypeRequest;
import games.mythical.ivi.sdk.proto.api.itemtype.ItemTypeServiceGrpc;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import games.mythical.ivi.sdk.proto.streams.itemtype.ItemTypeStatusStreamGrpc;
import games.mythical.ivi.sdk.proto.streams.itemtype.ItemTypeStatusUpdate;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.grpcmock.GrpcMock;
import org.grpcmock.junit5.GrpcMockExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.UUID;

import static org.grpcmock.GrpcMock.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(GrpcMockExtension.class)
class ItemTypeClientTest extends AbstractClientTest {
    private static final String host = "localhost";
    private static final int port = GrpcMock.getGlobalPort();
    private static final String apiKey = "MOCK_API_KEY";
    private static final String environmentId = "MOCK_ENV_ID";
    private MockItemTypeExecutor itemTypeExecutor;
    private ItemTypeClient itemTypeClient;
    private ManagedChannel channel;

    @BeforeEach
    void setUp() throws Exception {
        IVIConfiguration.setHost(host);
        IVIConfiguration.setPort(port);
        IVIConfiguration.setApiKey(apiKey);
        IVIConfiguration.setEnvironmentId(environmentId);

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        itemTypeExecutor = MockItemTypeExecutor.builder().build();
        itemTypeClient = new ItemTypeClient(itemTypeExecutor, channel);
    }

    @AfterEach
    void tearDown() { }

    @Test
    void testCreateItemType() throws Exception {
        var itemTypeId = UUID.randomUUID().toString();
        var trackingId = RandomStringUtils.randomAlphanumeric(30);

        var mockItemType = generateItemType(environmentId);

        var mockResponse = CreateItemAsyncResponse.newBuilder()
                .setItemTypeId(itemTypeId)
                .setTrackingId(trackingId)
                .setItemTypeState(ItemTypeState.PENDING_CREATE)
                .build();

        var mockStreamResponse = ItemTypeStatusUpdate.newBuilder()
                .setItemTypeId(itemTypeId)
                .setTrackingId(trackingId)
                .setBaseUri(RandomStringUtils.randomAlphanumeric(30))
                .setItemTypeState(ItemTypeState.CREATED)
                .build();

        stubFor(unaryMethod(ItemTypeServiceGrpc.getCreateItemTypeMethod())
                .willReturn(mockResponse));
        stubFor(serverStreamingMethod(ItemTypeStatusStreamGrpc.getItemTypeStatusStreamMethod())
                .willReturn(stream(response(mockStreamResponse).withFixedDelay(250))));
        stubFor(unaryMethod(ItemTypeStatusStreamGrpc.getItemTypeStatusConfirmationMethod())
                .willReturn(Empty.getDefaultInstance()));

        itemTypeClient.createItemType(mockItemType.getTokenName(),
                mockItemType.getCategory(),
                mockItemType.getMaxSupply(),
                mockItemType.getIssueTimeSpan(),
                mockItemType.getBurnable(),
                mockItemType.getTransferable(),
                mockItemType.getSellable(),
                mockItemType.getAgreementIdsList());

        assertEquals(itemTypeId, itemTypeExecutor.getItemTypeId());
        assertEquals(trackingId, itemTypeExecutor.getTrackingId());
        assertEquals(ItemTypeState.PENDING_CREATE, itemTypeExecutor.getItemTypeState());
        verifyThat(ItemTypeServiceGrpc.getCreateItemTypeMethod(), times(1));

        // wait for server message back
        Thread.sleep(1500);

        assertEquals(ItemTypeState.CREATED, itemTypeExecutor.getItemTypeState());
        verifyThat(ItemTypeStatusStreamGrpc.getItemTypeStatusStreamMethod(), times(1));

        verifyThat(ItemTypeStatusStreamGrpc.getItemTypeStatusConfirmationMethod(), times(1));
    }

    @Test
    void testFreezeItemType() throws Exception {
        var maxSupply = RandomUtils.nextInt();
        var currentSupply = RandomUtils.nextInt(0, maxSupply);
        var issuedSupply = maxSupply - currentSupply;
        var itemTypeId = UUID.randomUUID().toString();
        var trackingId = RandomStringUtils.randomAlphanumeric(30);

        var mockItemType = generateItemType(environmentId, itemTypeId, trackingId, maxSupply, currentSupply,
                issuedSupply, ItemTypeState.CREATED);

        // set the starting state of the item type
        itemTypeExecutor.setFromItemType(mockItemType);

        var mockTrackingId = RandomStringUtils.randomAlphanumeric(30);
        var mockResponse = FreezeItemTypeAsyncResponse.newBuilder()
                .setTrackingId(mockTrackingId)
                .setItemTypeState(ItemTypeState.PENDING_FREEZE)
                .build();

        var mockStreamResponse = ItemTypeStatusUpdate.newBuilder()
                .setItemTypeId(itemTypeId)
                .setTrackingId(mockTrackingId)
                .setBaseUri(mockItemType.getBaseUri())
                .setItemTypeState(ItemTypeState.FROZEN)
                .build();

        stubFor(unaryMethod(ItemTypeServiceGrpc.getFreezeItemTypeMethod())
                .willReturn(mockResponse));
        stubFor(serverStreamingMethod(ItemTypeStatusStreamGrpc.getItemTypeStatusStreamMethod())
                .willReturn(stream(response(mockStreamResponse).withFixedDelay(250))));
        stubFor(unaryMethod(ItemTypeStatusStreamGrpc.getItemTypeStatusConfirmationMethod())
                .willReturn(Empty.getDefaultInstance()));

        itemTypeClient.freezeItemType(itemTypeId);

        assertEquals(itemTypeId, itemTypeExecutor.getItemTypeId());
        assertEquals(mockTrackingId, itemTypeExecutor.getTrackingId());
        assertEquals(ItemTypeState.PENDING_FREEZE, itemTypeExecutor.getItemTypeState());
        verifyThat(ItemTypeServiceGrpc.getFreezeItemTypeMethod(), times(1));

        // wait for server message back
        Thread.sleep(1500);

        assertEquals(ItemTypeState.FROZEN, itemTypeExecutor.getItemTypeState());
        verifyThat(ItemTypeStatusStreamGrpc.getItemTypeStatusStreamMethod(), times(1));

        verifyThat(ItemTypeStatusStreamGrpc.getItemTypeStatusConfirmationMethod(), times(1));
    }
}