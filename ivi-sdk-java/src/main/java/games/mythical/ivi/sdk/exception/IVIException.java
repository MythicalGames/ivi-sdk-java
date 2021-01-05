package games.mythical.ivi.sdk.exception;

public class IVIException extends Exception {
    private IVIErrorCode code;

    public IVIException(IVIErrorCode code) {
        this.code = code;
    }

    public IVIException(String message, IVIErrorCode code) {
        super(message);
        this.code = code;
    }

    public IVIException(String message, Throwable cause, IVIErrorCode code) {
        super(message, cause);
        this.code = code;
    }

    public IVIException(Throwable cause, IVIErrorCode code) {
        super(cause);
        this.code = code;
    }

    public IVIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, IVIErrorCode code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
