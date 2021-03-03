package games.mythical.ivi.sdk.client.observer;

import games.mythical.ivi.sdk.client.executor.IVIPlayerExecutor;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStreamGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IVIPlayerObserver implements StreamObserver<PlayerStatusUpdate> {
    private final IVIPlayerExecutor playerExecutor;
    private final PlayerStreamGrpc.PlayerStreamBlockingStub streamBlockingStub;

    public IVIPlayerObserver(IVIPlayerExecutor playerExecutor,
                             PlayerStreamGrpc.PlayerStreamBlockingStub playerStreamBlockingStub) {
        this.playerExecutor = playerExecutor;
        this.streamBlockingStub = playerStreamBlockingStub;
    }

    @Override
    public void onNext(PlayerStatusUpdate message) {
        log.trace("PlayerObserver.onNext for player id: {}", message.getPlayerId());
        try {
            playerExecutor.updatePlayer(message.getPlayerId(),
                    message.getIviUserId(),
                    message.getSidechainAccountName(),
                    message.getTrackingId(),
                    message.getPlayerState());
            updatePlayerConfirmation(message.getPlayerId(), message.getTrackingId(), message.getPlayerState());
        } catch (Exception e) {
            log.error("Exception calling updatePlayer", e);
        }
    }

    @Override
    public void onError(Throwable t) {
        log.error("PlayerObserver.onError", t);
        throw new StatusRuntimeException(Status.UNKNOWN);
    }

    @Override
    public void onCompleted() {
        log.info("PlayerObserver stream closed");
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void updatePlayerConfirmation(String playerId, String trackingId, PlayerState playerState) {
        var request = PlayerStatusConfirmRequest.newBuilder()
                .setEnvironmentId(IVIConfiguration.getEnvironmentId())
                .setPlayerId(playerId)
                .setTrackingId(trackingId)
                .setPlayerState(playerState)
                .build();
        streamBlockingStub.playerStatusConfirmation(request);
    }
}
