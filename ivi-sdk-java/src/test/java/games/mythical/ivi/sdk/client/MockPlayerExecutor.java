package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.executor.PlayerExecutor;
import games.mythical.ivi.sdk.proto.api.player.IVIPlayer;
import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MockPlayerExecutor implements PlayerExecutor {
    private String playerId;
    private String iviUserId;
    private String sidechainAccountName;
    private String trackingId;
    private PlayerState playerState;

    @Override
    public void updatePlayer(String playerId,
                             String iviUserId,
                             String sidechainAccountName,
                             String trackingId,
                             PlayerState playerState) throws Exception {
        this.playerId = playerId;
        this.iviUserId = iviUserId;
        this.sidechainAccountName = sidechainAccountName;
        this.trackingId = trackingId;
        this.playerState = playerState;
    }

    @Override
    public void updatePlayerState(String playerId,
                                  String trackingId,
                                  PlayerState playerState) throws Exception {
        this.trackingId = trackingId;
        this.playerState = playerState;
    }
}
