package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.wallet.PayoutProviderId;
import games.mythical.ivi.sdk.server.wallet.MockWalletServer;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IVIWalletClientTest extends AbstractClientTest{
    private final static String ENV_ID = "env-id";
    private final static String PLAYER_ID = "player-id";
    private final static String ACCOUNT_ID = UUID.randomUUID().toString();
    private final static String UPHOLD_EXT_ID = "uphold-external-id";

    private MockWalletServer walletServer;
    private IVIWalletClient walletClient;

    @BeforeEach
    void setup() throws Exception {
        walletServer = new MockWalletServer();
        walletServer.start();
        port = walletServer.getPort();
        setUpConfig();

        walletServer.getWalletService().setWallet(ENV_ID, PLAYER_ID, ACCOUNT_ID, UPHOLD_EXT_ID);

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        walletClient = new IVIWalletClient(channel);
    }

    @AfterEach
    void tearDown() { walletServer.stop(); }

    @Test
    void getUpholdWallet() throws IVIException {
        var wallet = walletClient.getWalletUser(ENV_ID, PLAYER_ID, PayoutProviderId.UPHOLD);
        assertEquals(ACCOUNT_ID, wallet.getAccountId());

        var upholdWallet = wallet.getUphold();
        assertEquals(MockWalletServer.UPHOLD_ID, upholdWallet.getUpholdId());
        assertEquals(UPHOLD_EXT_ID, upholdWallet.getUpholdExternalCardId());
        assertEquals(MockWalletServer.UPHOLD_STATE, upholdWallet.getUpholdState());
        assertEquals(MockWalletServer.UPHOLD_STATUS, upholdWallet.getStatus());
        assertEquals(MockWalletServer.UPHOLD_EMAIL, upholdWallet.getEmail());
        assertEquals(MockWalletServer.UPHOLD_BIRTHDATE, upholdWallet.getBirthDate());

        var upholdBalance = upholdWallet.getBalance();
        assertEquals(new BigDecimal(MockWalletServer.UPHOLD_CURRENT_BALANCE), upholdBalance.getCurrentBalance());
        assertEquals(new BigDecimal(MockWalletServer.UPHOLD_PENDING_BALANCE), upholdBalance.getPendingBalance());

        var cards = upholdWallet.getCryptoCards();
        assertEquals(2, cards.size());

        var card1 = cards.get(0);
        assertEquals(MockWalletServer.CRYPTO_1_ID, card1.getUpholdId());
        assertEquals(new BigDecimal(MockWalletServer.CRYPTO_1_BALANCE), card1.getBalance());
        assertEquals(MockWalletServer.CRYPTO_1_CURRENCY, card1.getCurrency());
        assertEquals(new BigDecimal(MockWalletServer.CRYTPO_1_NORM_BALANCE), card1.getNormalizedBalance());
        assertEquals(MockWalletServer.CRYPTO_1_NORM_CURRENCY, card1.getNormalizedCurrency());

        var card2 = cards.get(1);
        assertEquals(MockWalletServer.CRYPTO_2_ID, card2.getUpholdId());
        assertEquals(new BigDecimal(MockWalletServer.CRYPTO_2_BALANCE), card2.getBalance());
        assertEquals(MockWalletServer.CRYPTO_2_CURRENCY, card2.getCurrency());
        assertEquals(new BigDecimal(MockWalletServer.CRYTPO_2_NORM_BALANCE), card2.getNormalizedBalance());
        assertEquals(MockWalletServer.CRYPTO_2_NORM_CURRENCY, card2.getNormalizedCurrency());
    }
}
