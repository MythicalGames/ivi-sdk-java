package games.mythical.ivi.sdk.server.wallet;

import games.mythical.ivi.sdk.server.AbstractMockServer;

public class MockWalletServer extends AbstractMockServer {
    public final static String UPHOLD_ID = "uphold-id";
    public final static String UPHOLD_STATE = "uphold-state";
    public final static String UPHOLD_STATUS = "uphold-status";
    public final static String UPHOLD_CURRENT_BALANCE = "111.11000000";
    public final static String UPHOLD_PENDING_BALANCE = "222.22000000";
    public final static String UPHOLD_EMAIL = "test@example.com";
    public final static String UPHOLD_BIRTHDATE = "01-01-1970";

    public final static String CRYPTO_1_ID = "crypto-1";
    public final static String CRYPTO_1_CURRENCY = "DOGE";
    public final static String CRYPTO_1_BALANCE = "200.00000000";
    public final static String CRYPTO_1_NORM_CURRENCY = "USD";
    public final static String CRYTPO_1_NORM_BALANCE = "40.78000000";


    public final static String CRYPTO_2_ID = "crypto-2";
    public final static String CRYPTO_2_CURRENCY = "ARRR";
    public final static String CRYPTO_2_BALANCE = "150.00000000";
    public final static String CRYPTO_2_NORM_CURRENCY = "EUR";
    public final static String CRYTPO_2_NORM_BALANCE = "283.26000000";

    public MockWalletServer() throws Exception {
        super(new MockWalletServiceImpl());
    }

    @Override
    public void stop() {
        getWalletService().reset();
        super.stop();
    }

    public MockWalletServiceImpl getWalletService() {
        for(var service : super.getServices()) {
            if(service instanceof MockWalletServiceImpl) {
                return (MockWalletServiceImpl) service;
            }
        }
        throw new RuntimeException("Couldn't find MockWalletServiceImpl!");
    }
}
