package games.mythical.ivi.sdk.server.player;

import com.google.protobuf.Empty;
import games.mythical.ivi.sdk.proto.api.player.IVIPlayer;
import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import games.mythical.ivi.sdk.proto.streams.Subscribe;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.player.PlayerStreamGrpc;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class MockPlayerStreamImpl extends PlayerStreamGrpc.PlayerStreamImplBase {
    private final Map<String, StreamObserver<PlayerStatusUpdate>> streamObservers = new ConcurrentHashMap<>();
    public static final Map<String, AtomicBoolean> finished = new ConcurrentHashMap<>();

    @Override
    public void playerStatusStream(Subscribe request, StreamObserver<PlayerStatusUpdate> responseObserver) {
        streamObservers.putIfAbsent(request.getEnvironmentId(), responseObserver);
    }

    @Override
    public void playerStatusConfirmation(PlayerStatusConfirmRequest request, StreamObserver<Empty> responseObserver) {
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();

        if(finished.containsKey(request.getTrackingId())) {
            finished.get(request.getTrackingId()).set(true);
        }
    }

    public void sendStatus(String environmentId, IVIPlayer player, PlayerState state) {
        if(streamObservers.containsKey(environmentId)) {
            var observer = streamObservers.get(environmentId);
            var playerStatus = PlayerStatusUpdate.newBuilder()
                    .setPlayerId(player.getPlayerId())
                    .setIviUserId(player.getIviUserId())
                    .setSidechainAccountName(RandomStringUtils.randomAlphanumeric(30))
                    .setTrackingId(player.getTrackingId())
                    .setPlayerState(state)
                    .build();
            observer.onNext(playerStatus);
        }
    }

    public void reset() {
        for (var observer : streamObservers.values()) {
            observer.onCompleted();
        }

        streamObservers.clear();
        finished.clear();
    }
}
