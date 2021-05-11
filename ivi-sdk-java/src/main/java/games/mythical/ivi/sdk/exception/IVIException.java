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

        switch (exception.getStatus().getCode()) {
            case INVALID_ARGUMENT:
                return new IVIException(IVIErrorCode.INVALID_ARGUMENT);
            case NOT_FOUND:
                return new IVIException(IVIErrorCode.NOT_FOUND);
            case PERMISSION_DENIED:
                return new IVIException(IVIErrorCode.PERMISSION_DENIED);
            case UNIMPLEMENTED:
                return new IVIException(IVIErrorCode.UNIMPLEMENTED);
            case UNAUTHENTICATED:
                return new IVIException(IVIErrorCode.UNAUTHENTICATED);
            case UNAVAILABLE:
                return new IVIException(IVIErrorCode.UNAVAILABLE);
            case RESOURCE_EXHAUSTED:
                return new IVIException(IVIErrorCode.RESOURCE_EXHAUSTED);
            case ABORTED:
                return new IVIException(IVIErrorCode.ABORTED);
            case DATA_LOSS:
                return new IVIException(IVIErrorCode.DATA_LOSS);
            case DEADLINE_EXCEEDED:
            case FAILED_PRECONDITION:
            case OUT_OF_RANGE:
                return new IVIException(IVIErrorCode.BAD_REQUEST);
            case ALREADY_EXISTS:
                return new IVIException(IVIErrorCode.CONFLICT);
            case INTERNAL:
            case UNKNOWN:
                return new IVIException(IVIErrorCode.SERVER_ERROR);
            default:
                return new IVIException(IVIErrorCode.UNKNOWN_GRPC_ERROR);
        }
    }
}
