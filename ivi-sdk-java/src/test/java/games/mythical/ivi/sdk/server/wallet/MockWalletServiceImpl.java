package games.mythical.ivi.sdk.server.wallet;

import games.mythical.ivi.sdk.proto.api.wallet.*;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class MockWalletServiceImpl extends WalletServiceGrpc.WalletServiceImplBase {
    private String environmentId = "";
    private String playerId = "";
    private String accountId = "";
    private String upholdExtId = "";

    private final UpholdCard card1 = UpholdCard.newBuilder()
            .setUpholdId(MockWalletServer.CRYPTO_1_ID)
            .setCurrency(MockWalletServer.CRYPTO_1_CURRENCY)
            .setBalance(MockWalletServer.CRYPTO_1_BALANCE)
            .setNormalizedCurrency(MockWalletServer.CRYPTO_1_NORM_CURRENCY)
            .setNormalizedBalance(MockWalletServer.CRYTPO_1_NORM_BALANCE)
            .build();

    private final UpholdCard card2 = UpholdCard.newBuilder()
            .setUpholdId(MockWalletServer.CRYPTO_2_ID)
            .setCurrency(MockWalletServer.CRYPTO_2_CURRENCY)
            .setBalance(MockWalletServer.CRYPTO_2_BALANCE)
            .setNormalizedCurrency(MockWalletServer.CRYPTO_2_NORM_CURRENCY)
            .setNormalizedBalance(MockWalletServer.CRYTPO_2_NORM_BALANCE)
            .build();

    private final Balance balance = Balance.newBuilder()
            .setCurrentBalance(MockWalletServer.UPHOLD_CURRENT_BALANCE)
            .setPendingBalance(MockWalletServer.UPHOLD_PENDING_BALANCE)
            .build();

    private final UpholdQuote quote = UpholdQuote.newBuilder()
            .setQuoteId(MockWalletServer.QUOTE_ID)
            .setRequestedAmount(MockWalletServer.QUOTE_REQUESTED_AMOUNT.toString())
            .setRequestedCurrency(MockWalletServer.QUOTE_REQUESTED_CURRENCY)
            .setQuotedAmount(MockWalletServer.QUOTE_QUOTED_AMOUNT.toString())
            .setQuotedCurrency(MockWalletServer.QUOTE_QUOTED_CURRENCY)
            .setNormalizedQuotedAmount(MockWalletServer.QUOTE_NORMALIZED_QUOTE_AMOUNT.toString())
            .setConversionFee(MockWalletServer.QUOTE_CONVERSION_FEE.toString())
            .setCreatedAt(MockWalletServer.QUOTE_CREATED_AT)
            .setExpireInMillis(MockWalletServer.QUOTE_EXPIRE_TIME)
            .build();

    public void setWallet(String environmentId, String playerId, String accountId, String upholdExtId) {
        this.environmentId = environmentId;
        this.playerId = playerId;
        this.accountId = accountId;
        this.upholdExtId = upholdExtId;
    }

    public void reset() {
        environmentId = "";
        playerId = "";
        accountId = "";
        upholdExtId = "";
    }

    @Override
    public void getWalletUser(GetWalletUserRequest request, StreamObserver<Wallet> responseObserver) {
        var responseBuilder = Wallet.newBuilder();
        if (environmentId.equals(request.getEnvironmentId())
            && playerId.equals(request.getPlayerId())
            && PayoutProviderId.UPHOLD == request.getProviderId()) {
            responseBuilder.setAccountId(accountId);
            var wallet = UpholdWallet.newBuilder()
                    .setUpholdId(MockWalletServer.UPHOLD_ID)
                    .setUpholdState(MockWalletServer.UPHOLD_STATE)
                    .setUpholdExternalCardId(upholdExtId)
                    .setBalance(balance)
                    .addAllCards(List.of(card1, card2))
                    .setEmail(MockWalletServer.UPHOLD_EMAIL)
                    .setStatus(MockWalletServer.UPHOLD_STATUS)
                    .setBirthDate(MockWalletServer.UPHOLD_BIRTHDATE)
                    .build();
            responseBuilder.setUphold(wallet);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void createUpholdQuote(CreateUpholdQuoteRequest request, StreamObserver<UpholdQuote> responseObserver) {
        var responseBuilder = UpholdQuote.newBuilder();
        if (environmentId.equals(request.getEnvironmentId())
            && playerId.equals(request.getPlayerId())
            && upholdExtId.equals(request.getExternalCardId())) {
            responseBuilder.setQuoteId(MockWalletServer.QUOTE_ID)
                    .setRequestedAmount(MockWalletServer.QUOTE_REQUESTED_AMOUNT.toString())
                    .setRequestedCurrency(MockWalletServer.QUOTE_REQUESTED_CURRENCY)
                    .setQuotedAmount(MockWalletServer.QUOTE_QUOTED_AMOUNT.toString())
                    .setQuotedCurrency(MockWalletServer.QUOTE_QUOTED_CURRENCY)
                    .setNormalizedQuotedAmount(MockWalletServer.QUOTE_NORMALIZED_QUOTE_AMOUNT.toString())
                    .setConversionFee(MockWalletServer.QUOTE_CONVERSION_FEE.toString())
                    .setCreatedAt(MockWalletServer.QUOTE_CREATED_AT)
                    .setExpireInMillis(MockWalletServer.QUOTE_EXPIRE_TIME);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }
}
