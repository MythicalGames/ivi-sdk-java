package games.mythical.ivi.sdk.client;

import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import io.grpc.ManagedChannel;
import org.apache.commons.lang3.StringUtils;

public abstract class AbstractIVIClient {
    protected final String host;
    protected final int port;

    protected final String environmentId;
    protected final String apiKey;

    protected AbstractIVIClient() throws IVIException {
        if(StringUtils.isEmpty(IVIConfiguration.getEnvironmentId())) {
            throw new IVIException("Environment Id not set!", IVIErrorCode.ENVIRONMENT_ID_NOT_SET);
        }
        environmentId = IVIConfiguration.getEnvironmentId();

        if(StringUtils.isEmpty(IVIConfiguration.getApiKey())) {
            throw new IVIException("API Key not set!", IVIErrorCode.APIKEY_NOT_SET);
        }
        apiKey = IVIConfiguration.getApiKey();

        if(StringUtils.isEmpty(IVIConfiguration.getHost())) {
            throw new IVIException("Host not set!", IVIErrorCode.HOST_NOT_SET);
        }
        host = IVIConfiguration.getHost();

        if(IVIConfiguration.getPort() == null) {
            throw new IVIException("Port not set!", IVIErrorCode.PORT_NOT_SET);
        }
        port = IVIConfiguration.getPort();
    }

    abstract void initStub(ManagedChannel managedChannel);
}
