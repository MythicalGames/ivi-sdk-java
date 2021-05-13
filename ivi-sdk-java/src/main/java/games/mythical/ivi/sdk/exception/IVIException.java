package games.mythical.ivi.sdk.exception;

import io.grpc.Metadata;
import io.grpc.Status.Code;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import org.apache.commons.lang3.StringUtils;

import java.net.HttpURLConnection;

public class IVIException extends Exception {
    public static final int UNPROCESSABLE_ENTITY = 422;

    private final IVIErrorCode code;
    private static final String HTTP_CODE_KEY = "HttpCode";

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

    public static IVIException fromGrpcException(StatusException exception) {
        return fromGrpcExceptionMessaging(exception.getStatus().getCode(),
                                          exception.getTrailers());
    }

    public static IVIException fromGrpcException(StatusRuntimeException exception) {
        return fromGrpcExceptionMessaging(exception.getStatus().getCode(),
                                          exception.getTrailers());
    }

    private static IVIException fromGrpcExceptionMessaging(Code exception, Metadata metadata) {

        IVIErrorCode ivierrorcode;

        // GRPC Status doesn't handle all http codes, so check if one was added
        if (metadata != null) {
            String httpCodeString = metadata.get(Metadata.Key.of(HTTP_CODE_KEY, Metadata.ASCII_STRING_MARSHALLER));
            if (StringUtils.isNotBlank(httpCodeString)) {
                ivierrorcode = fromStatusCode(Integer.parseInt(httpCodeString));
                return new IVIException(ivierrorcode);
            }
        }

        switch (exception) {
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

    private static IVIErrorCode fromStatusCode(int statusCode) {
        switch (statusCode) {
            case HttpURLConnection.HTTP_BAD_REQUEST:
                return IVIErrorCode.BAD_REQUEST;
            case HttpURLConnection.HTTP_UNAUTHORIZED:
                return IVIErrorCode.NOT_AUTHORIZED;
            case HttpURLConnection.HTTP_FORBIDDEN:
                return IVIErrorCode.FORBIDDEN;
            case HttpURLConnection.HTTP_NOT_FOUND:
                return IVIErrorCode.NOT_FOUND;
            case HttpURLConnection.HTTP_CONFLICT:
                return IVIErrorCode.CONFLICT;
            case HttpURLConnection.HTTP_CLIENT_TIMEOUT:
                return IVIErrorCode.TIMEOUT;
            case UNPROCESSABLE_ENTITY:
                return IVIErrorCode.UNPROCESSABLE_ENTITY;
            default:
                return IVIErrorCode.SERVER_ERROR;
        }
    }
}
