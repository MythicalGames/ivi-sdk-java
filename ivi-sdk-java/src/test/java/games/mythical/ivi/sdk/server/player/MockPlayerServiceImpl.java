package games.mythical.ivi.sdk.server.player;

import games.mythical.ivi.sdk.proto.api.player.*;
import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MockPlayerServiceImpl extends PlayerServiceGrpc.PlayerServiceImplBase {
    private final Map<String, IVIPlayer> players = new ConcurrentHashMap<>();

    @Override
    public void linkPlayer(LinkPlayerRequest request, StreamObserver<LinkPlayerAsyncResponse> responseObserver) {
        var response = LinkPlayerAsyncResponse.newBuilder()
                .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                .setPlayerState(PlayerState.PENDING_LINKED)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getPlayers(GetPlayersRequest request, StreamObserver<IVIPlayers> responseObserver) {
        var iviPlayers = new ArrayList<IVIPlayer>();
        for(var playerId : request.getPlayerIdsList()) {
            if(players.containsKey(playerId)) {
                iviPlayers.add(players.get(playerId));
            }
        }

        responseObserver.onNext(IVIPlayers.newBuilder().addAllIviPlayers(iviPlayers).build());
        responseObserver.onCompleted();
    }

    public void setPlayers(Collection<IVIPlayer> players) {
        for (var player : players) {
            this.players.putIfAbsent(player.getPlayerId(), player);
        }
    }

    public void reset() {
        players.clear();
    }
}
