package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.proto.api.player.IVIPlayer;
import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import games.mythical.ivi.sdk.server.player.MockPlayerServer;
import games.mythical.ivi.sdk.util.ConcurrentFinisher;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PlayerClientTest extends AbstractClientTest {
    private MockPlayerServer playerServer;
    private MockPlayerExecutor playerExecutor;
    private PlayerClient playerClient;
    private Map<String, IVIPlayer> iviPlayers;

    @BeforeEach
    void setUp() throws Exception {
        playerServer = new MockPlayerServer();
        playerServer.start();
        port = playerServer.getPort();
        setUpConfig();

        iviPlayers = generateIVIPlayers(3);
        playerServer.getPlayerService().setPlayers(iviPlayers.values());

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        playerExecutor = MockPlayerExecutor.builder().build();
        playerClient = new PlayerClient(playerExecutor, channel);
    }

    @AfterEach
    void tearDown() throws Exception {
        playerServer.stop();
        ConcurrentFinisher.reset();
    }

    @Test
    void linkPlayer() throws Exception {
        var playerId = UUID.randomUUID().toString();
        var iviUserId = UUID.randomUUID().toString();

        playerExecutor.setPlayerId(playerId);
        playerExecutor.setIviUserId(iviUserId);

        playerClient.linkPlayer(playerId, iviUserId);

        assertEquals(playerId, playerExecutor.getPlayerId());
        assertEquals(iviUserId, playerExecutor.getIviUserId());
        assertFalse(StringUtils.isEmpty(playerExecutor.getTrackingId()));
        assertEquals(PlayerState.PENDING_LINKED, playerExecutor.getPlayerState());

        playerServer.verifyCalls("LinkPlayer", 1);

        ConcurrentFinisher.start(playerExecutor.getTrackingId());
        playerServer.getPlayerStream().sendStatus(environmentId, IVIPlayer.newBuilder()
                .setPlayerId(playerId)
                .setIviUserId(iviUserId)
                .setTrackingId(playerExecutor.getTrackingId())
                .build(), PlayerState.LINKED);

        ConcurrentFinisher.wait(playerExecutor.getTrackingId());

        assertEquals(playerId, playerExecutor.getPlayerId());
        assertEquals(iviUserId, playerExecutor.getIviUserId());
        assertFalse(StringUtils.isEmpty(playerExecutor.getTrackingId()));
        assertFalse(StringUtils.isEmpty(playerExecutor.getSidechainAccountName()));
        assertEquals(PlayerState.LINKED, playerExecutor.getPlayerState());

        playerServer.verifyCalls("PlayerStatusStream", 1);
        playerServer.verifyCalls("PlayerStatusConfirmation", 1);
    }

    @Test
    void getPlayer() {
        var mockPlayer = iviPlayers.entrySet().iterator().next().getValue();
        var player = playerClient.getPlayer(mockPlayer.getPlayerId());

        assertTrue(player.isPresent());
        assertEquals(mockPlayer.getPlayerId(), player.get().getPlayerId());
        assertEquals(mockPlayer.getIviUserId(), player.get().getIviUserId());
        assertEquals(mockPlayer.getSidechainAccountName(), player.get().getSidechainAccountName());
        assertEquals(mockPlayer.getTrackingId(), player.get().getTrackingId());
        assertEquals(mockPlayer.getPlayerState(), player.get().getPlayerState());

        playerServer.verifyCalls("GetPlayers", 1);
    }

    @Test
    void getPlayerNonExisting() {
        var player = playerClient.getPlayer(RandomStringUtils.randomAlphanumeric(30));

        assertTrue(player.isEmpty());

        playerServer.verifyCalls("GetPlayers", 1);
    }

    @Test
    void getPlayers() {
        var players = playerClient.getPlayers(iviPlayers.keySet());

        for(var player : players) {
            assertEquals(iviPlayers.get(player.getPlayerId()).getPlayerId(), player.getPlayerId());
            assertEquals(iviPlayers.get(player.getPlayerId()).getIviUserId(), player.getIviUserId());
            assertEquals(iviPlayers.get(player.getPlayerId()).getSidechainAccountName(), player.getSidechainAccountName());
            assertEquals(iviPlayers.get(player.getPlayerId()).getTrackingId(), player.getTrackingId());
            assertEquals(iviPlayers.get(player.getPlayerId()).getPlayerState(), player.getPlayerState());
        }

        playerServer.verifyCalls("GetPlayers", 1);
    }
}