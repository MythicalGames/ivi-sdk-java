package games.mythical.ivi.sdk.util;

import javax.annotation.Nullable;

public enum HttpStatus {

    // --- 4xx Client Error ---

    /**
     * {@code 400 Bad Request}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.1">HTTP/1.1: Semantics and Content, section 6.5.1</a>
     */
    BAD_REQUEST(400, Series.CLIENT_ERROR, "Bad Request"),
    /**
     * {@code 401 Unauthorized}.
     * @see <a href="https://tools.ietf.org/html/rfc7235#section-3.1">HTTP/1.1: Authentication, section 3.1</a>
     */
    UNAUTHORIZED(401, Series.CLIENT_ERROR, "Unauthorized"),
    /**
     * {@code 402 Payment Required}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.2">HTTP/1.1: Semantics and Content, section 6.5.2</a>
     */
    PAYMENT_REQUIRED(402, Series.CLIENT_ERROR, "Payment Required"),
    /**
     * {@code 403 Forbidden}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.3">HTTP/1.1: Semantics and Content, section 6.5.3</a>
     */
    FORBIDDEN(403, Series.CLIENT_ERROR, "Forbidden"),
    /**
     * {@code 404 Not Found}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.4">HTTP/1.1: Semantics and Content, section 6.5.4</a>
     */
    NOT_FOUND(404, Series.CLIENT_ERROR, "Not Found"),
    /**
     * {@code 405 Method Not Allowed}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.5">HTTP/1.1: Semantics and Content, section 6.5.5</a>
     */
    METHOD_NOT_ALLOWED(405, Series.CLIENT_ERROR, "Method Not Allowed"),
    /**
     * {@code 406 Not Acceptable}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.6">HTTP/1.1: Semantics and Content, section 6.5.6</a>
     */
    NOT_ACCEPTABLE(406, Series.CLIENT_ERROR, "Not Acceptable"),
    /**
     * {@code 407 Proxy Authentication Required}.
     * @see <a href="https://tools.ietf.org/html/rfc7235#section-3.2">HTTP/1.1: Authentication, section 3.2</a>
     */
    PROXY_AUTHENTICATION_REQUIRED(407, Series.CLIENT_ERROR, "Proxy Authentication Required"),
    /**
     * {@code 408 Request Timeout}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.7">HTTP/1.1: Semantics and Content, section 6.5.7</a>
     */
    REQUEST_TIMEOUT(408, Series.CLIENT_ERROR, "Request Timeout"),
    /**
     * {@code 409 Conflict}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.8">HTTP/1.1: Semantics and Content, section 6.5.8</a>
     */
    CONFLICT(409, Series.CLIENT_ERROR, "Conflict"),
    /**
     * {@code 410 Gone}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.9">
     *     HTTP/1.1: Semantics and Content, section 6.5.9</a>
     */
    GONE(410, Series.CLIENT_ERROR, "Gone"),
    /**
     * {@code 411 Length Required}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.10">
     *     HTTP/1.1: Semantics and Content, section 6.5.10</a>
     */
    LENGTH_REQUIRED(411, Series.CLIENT_ERROR, "Length Required"),
    /**
     * {@code 412 Precondition failed}.
     * @see <a href="https://tools.ietf.org/html/rfc7232#section-4.2">
     *     HTTP/1.1: Conditional Requests, section 4.2</a>
     */
    PRECONDITION_FAILED(412, Series.CLIENT_ERROR, "Precondition Failed"),
    /**
     * {@code 413 Payload Too Large}.
     * @since 4.1
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.11">
     *     HTTP/1.1: Semantics and Content, section 6.5.11</a>
     */
    PAYLOAD_TOO_LARGE(413, Series.CLIENT_ERROR, "Payload Too Large"),
    /**
     * {@code 413 Request Entity Too Large}.
     * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.14">HTTP/1.1, section 10.4.14</a>
     * @deprecated in favor of {@link #PAYLOAD_TOO_LARGE} which will be
     * returned from {@code HttpStatus.valueOf(413)}
     */
    @Deprecated
    REQUEST_ENTITY_TOO_LARGE(413, Series.CLIENT_ERROR, "Request Entity Too Large"),
    /**
     * {@code 414 URI Too Long}.
     * @since 4.1
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.12">
     *     HTTP/1.1: Semantics and Content, section 6.5.12</a>
     */
    URI_TOO_LONG(414, Series.CLIENT_ERROR, "URI Too Long"),
    /**
     * {@code 414 Request-URI Too Long}.
     * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.15">HTTP/1.1, section 10.4.15</a>
     * @deprecated in favor of {@link #URI_TOO_LONG} which will be returned from {@code HttpStatus.valueOf(414)}
     */
    @Deprecated
    REQUEST_URI_TOO_LONG(414, Series.CLIENT_ERROR, "Request-URI Too Long"),
    /**
     * {@code 415 Unsupported Media Type}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.13">
     *     HTTP/1.1: Semantics and Content, section 6.5.13</a>
     */
    UNSUPPORTED_MEDIA_TYPE(415, Series.CLIENT_ERROR, "Unsupported Media Type"),
    /**
     * {@code 416 Requested Range Not Satisfiable}.
     * @see <a href="https://tools.ietf.org/html/rfc7233#section-4.4">HTTP/1.1: Range Requests, section 4.4</a>
     */
    REQUESTED_RANGE_NOT_SATISFIABLE(416, Series.CLIENT_ERROR, "Requested range not satisfiable"),
    /**
     * {@code 417 Expectation Failed}.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.14">
     *     HTTP/1.1: Semantics and Content, section 6.5.14</a>
     */
    EXPECTATION_FAILED(417, Series.CLIENT_ERROR, "Expectation Failed"),
    /**
     * {@code 418 I'm a teapot}.
     * @see <a href="https://tools.ietf.org/html/rfc2324#section-2.3.2">HTCPCP/1.0</a>
     */
    I_AM_A_TEAPOT(418, Series.CLIENT_ERROR, "I'm a teapot"),
    /**
     * @deprecated See
     * <a href="https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">
     *     WebDAV Draft Changes</a>
     */
    @Deprecated
    INSUFFICIENT_SPACE_ON_RESOURCE(419, Series.CLIENT_ERROR, "Insufficient Space On Resource"),
    /**
     * @deprecated See
     * <a href="https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">
     *     WebDAV Draft Changes</a>
     */
    @Deprecated
    METHOD_FAILURE(420, Series.CLIENT_ERROR, "Method Failure"),
    /**
     * @deprecated
     * See <a href="https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">
     *     WebDAV Draft Changes</a>
     */
    @Deprecated
    DESTINATION_LOCKED(421, Series.CLIENT_ERROR, "Destination Locked"),
    /**
     * {@code 422 Unprocessable Entity}.
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-11.2">WebDAV</a>
     */
    UNPROCESSABLE_ENTITY(422, Series.CLIENT_ERROR, "Unprocessable Entity"),
    /**
     * {@code 423 Locked}.
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-11.3">WebDAV</a>
     */
    LOCKED(423, Series.CLIENT_ERROR, "Locked"),
    /**
     * {@code 424 Failed Dependency}.
     * @see <a href="https://tools.ietf.org/html/rfc4918#section-11.4">WebDAV</a>
     */
    FAILED_DEPENDENCY(424, Series.CLIENT_ERROR, "Failed Dependency"),
    /**
     * {@code 425 Too Early}.
     * @since 5.2
     * @see <a href="https://tools.ietf.org/html/rfc8470">RFC 8470</a>
     */
    TOO_EARLY(425, Series.CLIENT_ERROR, "Too Early"),
    /**
     * {@code 426 Upgrade Required}.
     * @see <a href="https://tools.ietf.org/html/rfc2817#section-6">Upgrading to TLS Within HTTP/1.1</a>
     */
    UPGRADE_REQUIRED(426, Series.CLIENT_ERROR, "Upgrade Required"),
    /**
     * {@code 428 Precondition Required}.
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-3">Additional HTTP Status Codes</a>
     */
    PRECONDITION_REQUIRED(428, Series.CLIENT_ERROR, "Precondition Required"),
    /**
     * {@code 429 Too Many Requests}.
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-4">Additional HTTP Status Codes</a>
     */
    TOO_MANY_REQUESTS(429, Series.CLIENT_ERROR, "Too Many Requests"),
    /**
     * {@code 431 Request Header Fields Too Large}.
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-5">Additional HTTP Status Codes</a>
     */
    REQUEST_HEADER_FIELDS_TOO_LARGE(431, Series.CLIENT_ERROR, "Request Header Fields Too Large"),
    /**
     * {@code 451 Unavailable For Legal Reasons}.
     * @see <a href="https://tools.ietf.org/html/draft-ietf-httpbis-legally-restricted-status-04">
     * An HTTP Status Code to Report Legal Obstacles</a>
     * @since 4.3
     */
    UNAVAILABLE_FOR_LEGAL_REASONS(451, Series.CLIENT_ERROR, "Unavailable For Legal Reasons");

    private static final HttpStatus[] VALUES;

    static {
        VALUES = values();
    }


    private final int value;

    private final Series series;

    private final String reasonPhrase;

    HttpStatus(int value, Series series, String reasonPhrase) {
        this.value = value;
        this.series = series;
        this.reasonPhrase = reasonPhrase;
    }


    /**
     * Return the integer value of this status code.
     */
    public int value() {
        return this.value;
    }

    /**
     * Return the HTTP status series of this status code.
     * @see HttpStatus.Series
     */
    public Series series() {
        return this.series;
    }

    /**
     * Return the reason phrase of this status code.
     */
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public boolean is4xxClientError() {
        return (series() == Series.CLIENT_ERROR);
    }

    public boolean isError() {
        return (is4xxClientError());
    }

    /**
     * Return a string representation of this status code.
     */
    @Override
    public String toString() {
        return this.value + " " + name();
    }


    /**
     * Return the {@code HttpStatus} enum constant with the specified numeric value.
     * @param statusCode the numeric value of the enum to be returned
     * @return the enum constant with the specified numeric value
     * @throws IllegalArgumentException if this enum has no constant for the specified numeric value
     */
    public static HttpStatus valueOf(int statusCode) {
        HttpStatus status = resolve(statusCode);
        if (status == null) {
            throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
        }
        return status;
    }

    /**
     * Resolve the given status code to an {@code HttpStatus}, if possible.
     * @param statusCode the HTTP status code (potentially non-standard)
     * @return the corresponding {@code HttpStatus}, or {@code null} if not found
     * @since 5.0
     */
    @Nullable
    public static HttpStatus resolve(int statusCode) {
        // used cached VALUES instead of values() to prevent array allocation
        for (HttpStatus status : VALUES) {
            if (status.value == statusCode) {
                return status;
            }
        }
        return null;
    }


    /**
     * Enumeration of HTTP status series.
     * <p>Retrievable via {@link HttpStatus#series()}.
     */
    public enum Series {

        INFORMATIONAL(1),
        SUCCESSFUL(2),
        REDIRECTION(3),
        CLIENT_ERROR(4),
        SERVER_ERROR(5);

        private final int value;

        Series(int value) {
            this.value = value;
        }

        /**
         * Return the integer value of this status series. Ranges from 1 to 5.
         */
        public int value() {
            return this.value;
        }

        /**
         * Return the {@code Series} enum constant for the supplied {@code HttpStatus}.
         * @param status a standard HTTP status enum constant
         * @return the {@code Series} enum constant for the supplied {@code HttpStatus}
         * @deprecated as of 5.3, in favor of invoking {@link HttpStatus#series()} directly
         */
        @Deprecated
        public static Series valueOf(HttpStatus status) {
            return status.series;
        }

        /**
         * Return the {@code Series} enum constant for the supplied status code.
         * @param statusCode the HTTP status code (potentially non-standard)
         * @return the {@code Series} enum constant for the supplied status code
         * @throws IllegalArgumentException if this enum has no corresponding constant
         */
        public static Series valueOf(int statusCode) {
            Series series = resolve(statusCode);
            if (series == null) {
                throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
            }
            return series;
        }

        /**
         * Resolve the given status code to an {@code HttpStatus.Series}, if possible.
         * @param statusCode the HTTP status code (potentially non-standard)
         * @return the corresponding {@code Series}, or {@code null} if not found
         * @since 5.1.3
         */
        @Nullable
        public static Series resolve(int statusCode) {
            int seriesCode = statusCode / 100;
            for (Series series : values()) {
                if (series.value == seriesCode) {
                    return series;
                }
            }
            return null;
        }
    }

}

