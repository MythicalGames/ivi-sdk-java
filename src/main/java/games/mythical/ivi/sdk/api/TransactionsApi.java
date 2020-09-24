package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.TransactionEventDTO;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("games.mythical.ivi.sdk.api.TransactionsApi")
public class TransactionsApi {
    private ApiClient apiClient;

    public TransactionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all transaction events for an environment.
     * Get all transaction events for an environment with an optional time period specified.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param from  (optional)
     * @param to  (optional)
     * @param cursor  (optional)
     * @return List&lt;TransactionEventDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TransactionEventDTO> getAllTitleTransactions(String environmentId, String from, String to, String cursor) throws RestClientException {
        return getAllTitleTransactionsWithHttpInfo(environmentId, from, to, cursor).getBody();
    }

    /**
     * Get all transaction events for an environment.
     * Get all transaction events for an environment with an optional time period specified.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param from  (optional)
     * @param to  (optional)
     * @param cursor  (optional)
     * @return ResponseEntity&lt;List&lt;TransactionEventDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TransactionEventDTO>> getAllTitleTransactionsWithHttpInfo(String environmentId, String from, String to, String cursor) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getAllTitleTransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/transactions", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<TransactionEventDTO>> returnType = new ParameterizedTypeReference<List<TransactionEventDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get transaction events for transaction ID in an environment.
     * Get transaction events for transaction ID in an environment.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param transactionId  (required)
     * @param cursor  (optional)
     * @return List&lt;TransactionEventDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TransactionEventDTO> getTransactionEventsForTitle(String environmentId, String transactionId, String cursor) throws RestClientException {
        return getTransactionEventsForTitleWithHttpInfo(environmentId, transactionId, cursor).getBody();
    }

    /**
     * Get transaction events for transaction ID in an environment.
     * Get transaction events for transaction ID in an environment.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param transactionId  (required)
     * @param cursor  (optional)
     * @return ResponseEntity&lt;List&lt;TransactionEventDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TransactionEventDTO>> getTransactionEventsForTitleWithHttpInfo(String environmentId, String transactionId, String cursor) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getTransactionEventsForTitle");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionId' when calling getTransactionEventsForTitle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("transactionId", transactionId);
        String path = apiClient.expandPath("/environments/{environmentId}/transactions/{transactionId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<TransactionEventDTO>> returnType = new ParameterizedTypeReference<List<TransactionEventDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
