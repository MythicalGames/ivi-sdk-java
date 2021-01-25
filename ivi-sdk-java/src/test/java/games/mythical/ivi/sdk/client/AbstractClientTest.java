package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.api.item.Item;
import games.mythical.ivi.sdk.proto.api.itemtype.ItemType;
import games.mythical.ivi.sdk.proto.api.player.IVIPlayer;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public abstract class AbstractClientTest {
    protected static final String host = "localhost";
    protected static final String apiKey = "MOCK_API_KEY";
    protected static final String environmentId = "MOCK_ENV_ID";

    protected int port;
    protected ManagedChannel channel;

    protected void setUpConfig() {
        IVIConfiguration.setHost(host);
        IVIConfiguration.setPort(port);
        IVIConfiguration.setApiKey(apiKey);
        IVIConfiguration.setEnvironmentId(environmentId);
    }

    protected ItemType generateNewItemType() {
        var maxSupply = RandomUtils.nextInt(10, 100);
        return generateItemType("", maxSupply, maxSupply, 0, ItemTypeState.PENDING_CREATE);
    }

    protected ItemType generateItemType(String trackingId,
                                        int maxSupply,
                                        int currentSupply,
                                        int issuedSupply,
                                        ItemTypeState itemTypeState) {
        var tokenName = RandomStringUtils.randomAlphanumeric(30);
        var itemTypeId = environmentId + ":" + tokenName;
        return ItemType.newBuilder()
                .setItemTypeId(itemTypeId)
                .setDescription(RandomStringUtils.randomAlphanumeric(30))
                .setMaxSupply(maxSupply)
                .setCurrentSupply(currentSupply)
                .setIssuedSupply(issuedSupply)
                .setIssuer(RandomStringUtils.randomAlphanumeric(30))
                .setIssueTimeSpan(RandomUtils.nextInt())
                .setCategory(RandomStringUtils.randomAlphanumeric(30))
                .setTokenName(tokenName)
                .setFungible(RandomUtils.nextBoolean())
                .setBurnable(RandomUtils.nextBoolean())
                .setTransferable(RandomUtils.nextBoolean())
                .setSellable(RandomUtils.nextBoolean())
                .setFinalized(true)
                .setBaseUri(RandomStringUtils.randomAlphanumeric(30))
                .setMemo(RandomStringUtils.randomAlphanumeric(30))
                .setTrackingId(trackingId)
                .setItemTypeState(itemTypeState)
                .build();
    }

    @SuppressWarnings("SameParameterValue")
    protected Map<String, ItemType> generateItemTypes(int count) {
        var result = new HashMap<String, ItemType>();

        for (var i = 0; i < count; i++) {
            var trackingId = RandomStringUtils.randomAlphanumeric(30);
            var maxSupply = RandomUtils.nextInt(10, 100);
            var currentSupply = RandomUtils.nextInt(0, maxSupply);
            var issuedSupply = maxSupply - currentSupply;

            var itemType = generateItemType(trackingId, maxSupply, currentSupply, issuedSupply, ItemTypeState.CREATED);
            result.put(itemType.getItemTypeId(), itemType);
        }

        return result;
    }

    protected IVIPlayer generateIVIPlayer() {
        return IVIPlayer.newBuilder()
                .setPlayerId(RandomStringUtils.randomAlphanumeric(30))
                .setIviUserId(RandomStringUtils.randomAlphanumeric(30))
                .setSidechainAccountName(RandomStringUtils.randomAlphanumeric(30))
                .setTrackingId(RandomStringUtils.randomAlphanumeric(30))
                .setPlayerState(PlayerState.LINKED)
                .build();
    }

    @SuppressWarnings("SameParameterValue")
    protected Map<String, IVIPlayer> generateIVIPlayers(int count) {
        var result = new HashMap<String, IVIPlayer>();
        for(var i = 0; i < count; i++) {
            var player = generateIVIPlayer();
            result.put(player.getPlayerId(), player);
        }
        return result;
    }

    protected Item generateItem(long dGoodsId,
                                String sideChainAccount,
                                int serialNumber,
                                String metadataUri,
                                String trackingId,
                                ItemState state) {
        return Item.newBuilder()
                .setGameInventoryId(RandomStringUtils.randomAlphanumeric(30))
                .setCategory(RandomStringUtils.randomAlphanumeric(30))
                .setTokenName(RandomStringUtils.randomAlphanumeric(30))
                .setDgoodsId(dGoodsId)
                .setItemName(RandomStringUtils.randomAlphanumeric(30))
                .setPlayerId(RandomStringUtils.randomAlphanumeric(30))
                .setOwnerSidechainAccount(sideChainAccount)
                .setSerialNumber(serialNumber)
                .setAmountPaid(String.valueOf(RandomUtils.nextDouble()))
                .setCurrency(RandomStringUtils.randomAlphanumeric(30))
                .setMetadataUri(metadataUri)
                .setTrackingId(trackingId)
                .setItemState(state)
                .build();
    }

    protected Item generateNewItem() {
        return generateItem(0, "", 0, "", "", ItemState.PENDING_ISSUED);
    }

    @SuppressWarnings("SameParameterValue")
    protected Map<String, Item> generateItems(int count) {
        var result = new HashMap<String, Item>();
        for(var i = 0; i < count; i++) {
            var dGoodsId = RandomUtils.nextInt(100, 1000);
            var sidechain = RandomStringUtils.randomAlphanumeric(30);
            var serialNumber = RandomUtils.nextInt(10, 100);
            var metadataUri = RandomStringUtils.randomAlphanumeric(30);
            var trackingId = RandomStringUtils.randomAlphanumeric(30);
            var state = ItemState.ISSUED;
            var item = generateItem(dGoodsId, sidechain, serialNumber, metadataUri, trackingId, state);
            result.put(item.getGameInventoryId(), item);
        }
        return result;
    }
}
