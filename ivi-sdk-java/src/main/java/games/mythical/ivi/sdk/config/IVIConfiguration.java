package games.mythical.ivi.sdk.config;

public class IVIConfiguration {
    private static String EnvironmentId;
    private static String ApiKey;
    private static String Host = "api.iviengine.com";
    private static Integer Port = 10081;

    public static String getEnvironmentId() {
        return EnvironmentId;
    }

    public static void setEnvironmentId(String environmentId) {
        EnvironmentId = environmentId;
    }

    public static String getApiKey() {
        return ApiKey;
    }

    public static void setApiKey(String apiKey) {
        ApiKey = apiKey;
    }

    public static String getHost() {
        return Host;
    }

    public static void setHost(String host) {
        Host = host;
    }

    public static Integer getPort() {
        return Port;
    }

    public static void setPort(Integer port) {
        Port = port;
    }
}
