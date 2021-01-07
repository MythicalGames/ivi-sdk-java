package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.proto.api.itemtype.ItemType;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public abstract class AbstractClientTest {
    @SuppressWarnings("SameParameterValue")
    protected ItemType generateItemType(String environmentId) {
        var maxSupply = RandomUtils.nextInt();
        return generateItemType(environmentId, "", "", maxSupply, maxSupply, 0, ItemTypeState.PENDING_CREATE);
    }

    protected ItemType generateItemType(String environmentId,
                                        String itemTypeId,
                                        String trackingId,
                                        int maxSupply,
                                        int currentSupply,
                                        int issuedSupply,
                                        ItemTypeState itemTypeState) {
        return ItemType.newBuilder()
                .setEnvironmentId(environmentId)
                .setItemTypeId(itemTypeId)
                .setDescription(RandomStringUtils.randomAlphanumeric(30))
                .setMaxSupply(maxSupply)
                .setCurrentSupply(currentSupply)
                .setIssuedSupply(issuedSupply)
                .setIssuer(RandomStringUtils.randomAlphanumeric(30))
                .setIssueTimeSpan(RandomUtils.nextInt())
                .setCategory(RandomStringUtils.randomAlphanumeric(30))
                .setTokenName(RandomStringUtils.randomAlphanumeric(30))
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
}
