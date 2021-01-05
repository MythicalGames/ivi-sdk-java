package games.mythical.ivi.sdk.exception;

public enum IVIErrorCode {
    ENVIRONMENT_ID_NOT_SET(1000),
    APIKEY_NOT_SET(1001),
    HOST_NOT_SET(1002),
    PORT_NOT_SET(1003);

    private int value;

    IVIErrorCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
