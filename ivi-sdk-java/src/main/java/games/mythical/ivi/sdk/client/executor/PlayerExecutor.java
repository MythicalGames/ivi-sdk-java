package games.mythical.ivi.sdk.client.executor;

import games.mythical.ivi.sdk.proto.common.player.PlayerState;

public interface PlayerExecutor {
    void updatePlayer(String playerId,
                      String iviUserId,
                      String sidechainAccountName,
                      String trackingId,
                      PlayerState playerState) throws Exception;

    void updatePlayerState(String playerId,
                           String trackingId,
                           PlayerState playerState) throws Exception;
}
