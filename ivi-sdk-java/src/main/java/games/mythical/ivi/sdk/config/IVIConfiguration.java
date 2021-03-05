package games.mythical.ivi.sdk.config;

public class IVIConfiguration {
    private static String environmentId;
    private static String apiKey;
    private static String host = "sdk-api.iviengine.com";
    private static Integer port = 443;

    public static String getEnvironmentId() {
        return IVIConfiguration.environmentId;
    }

    public static void setEnvironmentId(String environmentId) {
        IVIConfiguration.environmentId = environmentId;
    }

    public static String getApiKey() {
        return IVIConfiguration.apiKey;
    }

    public static void setApiKey(String apiKey) {
        IVIConfiguration.apiKey = apiKey;
    }

    public static String getHost() {
        return IVIConfiguration.host;
    }

    public static void setHost(String host) {
        IVIConfiguration.host = host;
    }

    public static Integer getPort() {
        return IVIConfiguration.port;
    }

    public static void setPort(Integer port) {
        IVIConfiguration.port = port;
    }
}
