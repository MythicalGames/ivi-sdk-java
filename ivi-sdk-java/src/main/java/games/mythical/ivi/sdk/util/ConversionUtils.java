package games.mythical.ivi.sdk.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;
import games.mythical.ivi.sdk.exception.IVIErrorCode;
import games.mythical.ivi.sdk.exception.IVIException;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class ConversionUtils {
    public static Struct convertProperties(Map<String, String> properties) throws IVIException {
        try {
            var metadata = (JsonObject) new Gson().toJsonTree(properties);
            var structBuilder = Struct.newBuilder();
            JsonFormat.parser().merge(metadata.toString(), structBuilder);
            return structBuilder.build();
        } catch (InvalidProtocolBufferException e) {
            log.error("ConversionUtils: couldn't convert item properties!", e);
            throw new IVIException(IVIErrorCode.PARSING_DATA_EXCEPTION);
        }
    }

    public static Map<String, String> convertProperties(Struct properties) throws IVIException {
        try {
            var objectMapper = new ObjectMapper();
            var propertiesString = JsonFormat.printer().print(properties);
            return objectMapper.readValue(propertiesString, new TypeReference<>() {});
        } catch (Exception  e) {
            log.error("ConversionUtils: couldn't convert item properties!", e);
            throw new IVIException(IVIErrorCode.PARSING_DATA_EXCEPTION);
        }
    }
}
