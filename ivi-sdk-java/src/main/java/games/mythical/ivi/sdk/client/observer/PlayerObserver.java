package games.mythical.ivi.sdk.client.observer;

import games.mythical.ivi.sdk.client.executor.PlayerExecutor;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStreamGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayerObserver implements StreamObserver<PlayerStatusUpdate> {
    private final PlayerExecutor playerExecutor;
    private final PlayerStreamGrpc.PlayerStreamBlockingStub streamBlockingStub;

    public PlayerObserver(PlayerExecutor playerExecutor,
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
            updatePlayerConfirmation(message.getPlayerId(), message.getTrackingId());
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

    private void updatePlayerConfirmation(String playerId, String trackingId) {
        var request = PlayerStatusConfirmRequest.newBuilder()
                .setPlayerId(playerId)
                .setTrackingId(trackingId)
                .build();
        streamBlockingStub.playerStatusConfirmation(request);
    }
}
