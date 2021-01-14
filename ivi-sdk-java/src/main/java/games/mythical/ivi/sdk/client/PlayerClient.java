package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.PlayerExecutor;
import games.mythical.ivi.sdk.client.observer.PlayerObserver;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.player.GetPlayersRequest;
import games.mythical.ivi.sdk.proto.api.player.IVIPlayer;
import games.mythical.ivi.sdk.proto.api.player.LinkPlayerRequest;
import games.mythical.ivi.sdk.proto.api.player.PlayerServiceGrpc;
import games.mythical.ivi.sdk.proto.streams.Subscribe;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStreamGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
public class PlayerClient extends AbstractIVIClient {
    private PlayerServiceGrpc.PlayerServiceBlockingStub serviceBlockingStub;
    private PlayerExecutor playerExecutor;

    @SuppressWarnings("unused")
    protected PlayerClient(PlayerExecutor playerExecutor) throws IVIException {
        super();

        this.playerExecutor = playerExecutor;
        var channel = ManagedChannelBuilder.forAddress(host, port)
                .build();

        initStub(channel);
    }

    PlayerClient(PlayerExecutor playerExecutor, ManagedChannel channel) throws IVIException {
        this.playerExecutor = playerExecutor;
        initStub(channel);
    }

    @Override
    protected void initStub(ManagedChannel channel) {
        serviceBlockingStub = PlayerServiceGrpc.newBlockingStub(channel);

        // set up server stream
        var streamStub  = PlayerStreamGrpc.newStub(channel);
        var subscribe = Subscribe.newBuilder()
                .setEnvironmentId(environmentId)
                .build();
        streamStub.playerStatusStream(subscribe, new PlayerObserver(playerExecutor,
                PlayerStreamGrpc.newBlockingStub(channel)));
    }

    public void linkPlayer(String playerId, String iviUserId) {
        log.trace("PlayerClient.linkPlayer called from player: {}:{}", playerId, iviUserId);
        var request = LinkPlayerRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setPlayerId(playerId)
                .setIviUserId(iviUserId)
                .build();
        var result = serviceBlockingStub.linkPlayer(request);
        try {
            playerExecutor.updatePlayerState(playerId, result.getTrackingId(), result.getPlayerState());
        } catch (Exception e) {
            log.error("Exception calling updatePlayerState on linkPlayer, player will be in an invalid state!", e);
        }
    }

    public Optional<IVIPlayer> getPlayer(String playerId) {
        log.trace("PlayerClient.getPlayer called from player: {}", playerId);
        var result = getPlayers(Collections.singletonList(playerId));
        if(result.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(result.get(0));
        }
    }

    public List<IVIPlayer> getPlayers(Collection<String> playerIds) {
        log.trace("PlayerClient.getPlayers called from players: {}", playerIds);
        var request = GetPlayersRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .addAllPlayerIds(playerIds)
                .build();

        var result = serviceBlockingStub.getPlayers(request);
        return result.getIviPlayersList();
    }
}
