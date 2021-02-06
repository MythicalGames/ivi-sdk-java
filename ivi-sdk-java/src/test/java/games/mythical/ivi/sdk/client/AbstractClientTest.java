package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.model.*;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.item.Item;
import games.mythical.ivi.sdk.proto.api.itemtype.ItemType;
import games.mythical.ivi.sdk.proto.api.order.Order;
import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.proto.api.order.PurchasedItems;
import games.mythical.ivi.sdk.proto.api.player.IVIPlayer;
import games.mythical.ivi.sdk.proto.common.item.ItemState;
import games.mythical.ivi.sdk.proto.common.item.OptionalInformation;
import games.mythical.ivi.sdk.proto.common.itemtype.ItemTypeState;
import games.mythical.ivi.sdk.proto.common.order.OrderState;
import games.mythical.ivi.sdk.proto.common.player.PlayerState;
import games.mythical.ivi.sdk.util.ConversionUtils;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public abstract class AbstractClientTest {
    protected static final String host = "localhost";
    protected static final String apiKey = "MOCK_API_KEY";
    protected static final String environmentId = "MOCK_ENV_ID";
    protected static final String currency = "BB";

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

    protected IVIItem generateItem(long dGoodsId,
                                String sideChainAccount,
                                int serialNumber,
                                String metadataUri,
                                String trackingId,
                                ItemState state) throws IVIException {
        var itemMetadata = generateItemMetadata(1).get(0);

        var item = Item.newBuilder()
                .setGameInventoryId(RandomStringUtils.randomAlphanumeric(30))
                .setItemTypeId(RandomStringUtils.randomAlphanumeric(30))
                .setDgoodsId(dGoodsId)
                .setItemName(RandomStringUtils.randomAlphanumeric(30))
                .setPlayerId(RandomStringUtils.randomAlphanumeric(30))
                .setOwnerSidechainAccount(sideChainAccount)
                .setSerialNumber(serialNumber)
                .setCurrencyBase(RandomStringUtils.randomAlphanumeric(30))
                .setMetadataUri(metadataUri)
                .setTrackingId(trackingId)
                .setProperties(ConversionUtils.convertProperties(generateProperties(5)))
                .setOptionalInformation(OptionalInformation.newBuilder()
                        .setDescription(itemMetadata.getDescription())
                        .setImageLarge(itemMetadata.getImageLargeUrl())
                        .setImageSmall(itemMetadata.getImageSmallUrl())
                        .setRender(itemMetadata.getRender())
                        .setAuthenticityImage(itemMetadata.getAuthenticityImage())
                        .build())
                .setItemState(state)
                .setCreatedTimestamp(Instant.now().getEpochSecond() - 86400)
                .setUpdatedTimestamp(Instant.now().getEpochSecond())
                .build();

        return IVIItem.fromProto(item);
    }

    protected IVIItem generateNewItem() throws IVIException {
        return generateItem(0, "", 0, "", "", ItemState.PENDING_ISSUED);
    }

    @SuppressWarnings("SameParameterValue")
    protected Map<String, IVIItem> generateItems(int count) throws IVIException {
        var result = new HashMap<String, IVIItem>();
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

    protected Map<String, IVIOrder> generateOrders(int count) throws IVIException {
        var orders = new HashMap<String, IVIOrder>();
        for(var i = 0; i < count; i++) {
            var isPrimary = RandomUtils.nextBoolean();
            var orderBuilder = Order.newBuilder()
                    .setOrderId(RandomStringUtils.randomAlphanumeric(30))
                    .setStoreId(RandomStringUtils.randomAlphanumeric(30))
                    .setBuyerPlayerId(RandomStringUtils.randomAlphanumeric(30))
                    .setTax(String.valueOf(RandomUtils.nextDouble(0, 10)))
                    .setTotal(String.valueOf(RandomUtils.nextDouble(0, 200)))
                    .setAddress(generateAddress().toProto())
                    .setPaymentProviderId(PaymentProviderId.BRAINTREE)
                    .setOrderStatus(OrderState.COMPLETE);

            if(isPrimary) {
                var purchasedItems = generatePurchasedItems(3).stream()
                        .map(IVIPurchasedItem::toProto)
                        .collect(Collectors.toList());
                orderBuilder.setPurchasedItems(PurchasedItems.newBuilder()
                        .addAllPurchasedItems(purchasedItems)
                        .build());
            } else {
                orderBuilder.setListingId(RandomStringUtils.randomAlphanumeric(30));
            }

            var order = orderBuilder.build();
            orders.put(order.getOrderId(), IVIOrder.fromProto(order));
        }

        return orders;
    }

    @SuppressWarnings("SameParameterValue")
    protected List<IVIPurchasedItem> generatePurchasedItems(int count) throws IVIException {
        var items = new ArrayList<IVIPurchasedItem>();
        for(var i = 0; i < count; i++) {
            var hasOptionalProperties = RandomUtils.nextBoolean();

            var iviPurchasedItemBuilder = IVIPurchasedItem.builder()
                    .gameInventoryId(RandomStringUtils.randomAlphanumeric(30))
                    .itemName(RandomStringUtils.randomAlphanumeric(30))
                    .itemTypeId(RandomStringUtils.randomAlphanumeric(30))
                    .amountPaid(BigDecimal.valueOf(RandomUtils.nextDouble()))
                    .currency(RandomStringUtils.randomAlphanumeric(3))
                    .properties(generateProperties(3));

            if (hasOptionalProperties) {
                iviPurchasedItemBuilder.description(RandomStringUtils.randomAlphanumeric(30))
                        .imageSmallUrl(RandomStringUtils.randomAlphanumeric(30))
                        .imageLargeUrl(RandomStringUtils.randomAlphanumeric(30))
                        .render(RandomStringUtils.randomAlphanumeric(30));
            }

            items.add(iviPurchasedItemBuilder.build());
        }

        return items;
    }

    protected IVIOrderAddress generateAddress() {
        return IVIOrderAddress.builder()
                .firstName(RandomStringUtils.randomAlphanumeric(30))
                .lastName(RandomStringUtils.randomAlphanumeric(30))
                .addressLine1(RandomStringUtils.randomAlphanumeric(30))
                .addressLine2(RandomStringUtils.randomAlphanumeric(30))
                .city(RandomStringUtils.randomAlphanumeric(30))
                .state(RandomStringUtils.randomAlphanumeric(30))
                .postalCode(RandomStringUtils.randomNumeric(10))
                .countryName(RandomStringUtils.randomAlphanumeric(30))
                .countryIsoAlpha2(RandomStringUtils.randomAlphanumeric(5))
                .build();
    }

    protected Map<String, String> generateProperties(int count) {
        var properties = new HashMap<String, String>();
        for(var i = 0; i < count; i++) {
            properties.put(RandomStringUtils.randomAlphanumeric(10), RandomStringUtils.randomAlphanumeric(30));
        }

        return properties;
    }

    @SuppressWarnings("SameParameterValue")
    protected List<IVIItemMetadata> generateItemMetadata(int count) {
        var metadataList = new ArrayList<IVIItemMetadata>();
        for(var i = 0; i < count; i++) {
            metadataList.add(IVIItemMetadata.builder()
                    .description(RandomStringUtils.randomAlphanumeric(30))
                    .imageLargeUrl(RandomStringUtils.randomAlphanumeric(30))
                    .imageSmallUrl(RandomStringUtils.randomAlphanumeric(30))
                    .render(RandomStringUtils.randomAlphanumeric(30))
                    .authenticityImage(RandomStringUtils.randomAlphanumeric(30))
                    .build());
        }

        return metadataList;
    }
}
