package games.mythical.ivi.sdk.exception;

import io.grpc.StatusRuntimeException;

public class IVIException extends Exception {
    private final IVIErrorCode code;

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

    public IVIErrorCode getCode() {
        return code;
    }

    public static IVIException fromGrpcException(StatusRuntimeException exception) {
        // TODO: figure out mapping, or if we need it
        switch (exception.getStatus().getCode()) {
            case NOT_FOUND:
                return new IVIException(IVIErrorCode.NOT_FOUND);
            default:
                return new IVIException(IVIErrorCode.UNKNOWN_GRPC_ERROR);
        }
    }
}
