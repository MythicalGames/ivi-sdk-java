package games.mythical.ivi.sdk.client.executor;

import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MockPlayerExecutor implements IVIPlayerExecutor {
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
