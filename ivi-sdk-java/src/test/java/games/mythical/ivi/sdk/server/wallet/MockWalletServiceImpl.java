package games.mythical.ivi.sdk.server.wallet;

import games.mythical.ivi.sdk.proto.api.wallet.*;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class MockWalletServiceImpl extends WalletServiceGrpc.WalletServiceImplBase {
    private String environmentId = "";
    private String playerId = "";
    private String accountId = "";
    private String upholdExtId = "";

    private final UpholdCryptoCard card1 = UpholdCryptoCard.newBuilder()
            .setUpholdId(MockWalletServer.CRYPTO_1_ID)
            .setCurrency(MockWalletServer.CRYPTO_1_CURRENCY)
            .setBalance(MockWalletServer.CRYPTO_1_BALANCE)
            .setNormalizedCurrency(MockWalletServer.CRYPTO_1_NORM_CURRENCY)
            .setNormalizedBalance(MockWalletServer.CRYTPO_1_NORM_BALANCE)
            .build();

    private final UpholdCryptoCard card2 = UpholdCryptoCard.newBuilder()
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
                    .addAllCryptoCards(List.of(card1, card2))
                    .setEmail(MockWalletServer.UPHOLD_EMAIL)
                    .setStatus(MockWalletServer.UPHOLD_STATUS)
                    .setBirthDate(MockWalletServer.UPHOLD_BIRTHDATE)
                    .build();
            responseBuilder.setUphold(wallet);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }
}
