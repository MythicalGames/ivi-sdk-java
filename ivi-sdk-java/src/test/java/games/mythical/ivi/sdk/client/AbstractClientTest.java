package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.proto.api.itemtype.ItemType;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public abstract class AbstractClientTest {
    protected ItemType generateItemType(String environmentId) {
        var maxSupply = RandomUtils.nextInt();
        return ItemType.newBuilder()
                .setEnvironmentId(environmentId)
                .setItemTypeId("")
                .setDescription(RandomStringUtils.randomAlphanumeric(30))
                .setMaxSupply(maxSupply)
                .setCurrentSupply(maxSupply)
                .setIssuedSupply(0)
                .setIssuer(RandomStringUtils.randomAlphanumeric(30))
                .setIssueTimeSpan(RandomUtils.nextInt())
                .setCategory(RandomStringUtils.randomAlphanumeric(30))
                .setTokenName(RandomStringUtils.randomAlphanumeric(30))
                .setFungible(RandomUtils.nextBoolean())
                .setBurnable(RandomUtils.nextBoolean())
                .setTransferable(RandomUtils.nextBoolean())
                .setSellable(RandomUtils.nextBoolean())
                .setFinalized(false)
                .setBaseUri("")
                .setMemo("")
                .setTrackingId("")
                .build();
    }
}
