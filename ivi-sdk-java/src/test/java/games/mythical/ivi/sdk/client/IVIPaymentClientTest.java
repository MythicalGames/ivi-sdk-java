package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.model.IVIToken;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.order.PaymentProviderId;
import games.mythical.ivi.sdk.server.payment.order.MockPaymentServer;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IVIPaymentClientTest extends AbstractClientTest {
    private MockPaymentServer paymentServer;
    private IVIPaymentClient paymentClient;
    private Map<String, IVIToken> tokens;

    @BeforeEach
    void setUp() throws Exception {
        paymentServer = new MockPaymentServer();
        paymentServer.start();
        port = paymentServer.getPort();
        setUpConfig();


        tokens = generateTokens(3);
        paymentServer.getPaymentService().setTokens(tokens.values());

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        paymentClient = new IVIPaymentClient(channel);
    }

    @AfterEach
    void tearDown() {
        paymentServer.stop();
    }

    protected Map<String, IVIToken> generateTokens(int count) {
        var result = new HashMap<String, IVIToken>();
        for(var i = 0; i < count; i++) {
            var braintreeToken = RandomStringUtils.randomAlphanumeric(30);

            var token = IVIToken.builder()
                    .braintreeToken(braintreeToken)
                    .build();
            result.put(String.valueOf(i), token);
        }
        return result;
    }

    @Test
    void createBraintreeToken() throws IVIException {
        var playerId = RandomStringUtils.randomAlphanumeric(30);
        var token = paymentClient.getToken(PaymentProviderId.BRAINTREE, playerId, "");

        assertNotNull(token.getBraintreeToken());
    }

    @Test
    void createCybersourceToken() throws IVIException {
        var origin = RandomStringUtils.randomAlphanumeric(30);
        var token = paymentClient.getToken(PaymentProviderId.CYBERSOURCE, "", origin);

        assertNotNull(token.getCybersourceJWK());
        assertTrue(StringUtils.isNotBlank(token.getCybersourceJWK().getKty()));
        assertTrue(StringUtils.isNotBlank(token.getCybersourceJWK().getE()));
        assertTrue(StringUtils.isNotBlank(token.getCybersourceJWK().getUse()));
        assertTrue(StringUtils.isNotBlank(token.getCybersourceJWK().getN()));
        assertTrue(StringUtils.isNotBlank(token.getCybersourceJWK().getKid()));
    }

    @Test
    public void testCreateCybersourcePaymentMethod() throws Exception {
        var method = paymentClient.createCybersourcePaymentMethod(
                RandomStringUtils.randomAlphanumeric(10),
                RandomStringUtils.randomAlphanumeric(10),
                RandomStringUtils.randomAlphanumeric(10),
                RandomStringUtils.randomAlphanumeric(10),
                RandomStringUtils.randomAlphanumeric(10),
                generateAddress()
        );

        assertNotNull(method);
        assertEquals("valid", method.getCardType());
    }

    @Test
    public void testCreateCybersourcePaymentMethodFailure() {
        assertThrows(IVIException.class, () -> {
            paymentClient.createCybersourcePaymentMethod(
                    RandomStringUtils.randomAlphanumeric(10),
                    "invalid",
                    RandomStringUtils.randomAlphanumeric(10),
                    RandomStringUtils.randomAlphanumeric(10),
                    RandomStringUtils.randomAlphanumeric(10),
                    generateAddress()
            );
        });
    }
}