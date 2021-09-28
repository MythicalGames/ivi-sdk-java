package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.client.model.IVIWallet;
import games.mythical.ivi.sdk.exception.IVIException;
import games.mythical.ivi.sdk.proto.api.wallet.GetWalletUserRequest;
import games.mythical.ivi.sdk.proto.api.wallet.PayoutProviderId;
import games.mythical.ivi.sdk.proto.api.wallet.WalletServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class IVIWalletClient extends AbstractIVIClient {
    private WalletServiceGrpc.WalletServiceBlockingStub serviceBlockingStub;

    public IVIWalletClient() throws IVIException {
        super();
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .build();
        initStub();
    }

    IVIWalletClient(ManagedChannel channel) throws IVIException {
        this.channel = channel;
        initStub();
    }

    @Override
    void initStub() {
        serviceBlockingStub = WalletServiceGrpc.newBlockingStub(channel).withCallCredentials(addAuthentication());
    }

    public IVIWallet getWalletUser(String environmentId,
                                   String playerId,
                                   PayoutProviderId payoutProviderId) throws IVIException {
        var request = GetWalletUserRequest.newBuilder()
                .setEnvironmentId(environmentId)
                .setPlayerId(playerId)
                .setProviderId(payoutProviderId)
                .build();
        try {
            var wallet = serviceBlockingStub.getWalletUser(request);
            return IVIWallet.fromProto(wallet);
        } catch (StatusRuntimeException e) {
            throw IVIException.fromGrpcException(e);
        }
    }
}
