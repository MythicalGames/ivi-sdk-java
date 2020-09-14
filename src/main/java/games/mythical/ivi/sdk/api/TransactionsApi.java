/*
 * IVI Engine
 * IVI Engine
 *
 * The version of the OpenAPI document: unspecified
 * Contact: developer@mythical.games
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.invoker.ApiCallback;
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.ApiResponse;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.Pair;
import games.mythical.ivi.sdk.invoker.ProgressRequestBody;
import games.mythical.ivi.sdk.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import games.mythical.ivi.sdk.model.TransactionEventDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionsApi {
    private ApiClient localVarApiClient;

    public TransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAllTitleTransactions
     * @param environmentId  (required)
     * @param from  (optional)
     * @param to  (optional)
     * @param cursor  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllTitleTransactionsCall(String environmentId, String from, String to, String cursor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/environments/{environmentId}/transactions"
            .replaceAll("\\{" + "environmentId" + "\\}", localVarApiClient.escapeString(environmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api_key", "spring_oauth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllTitleTransactionsValidateBeforeCall(String environmentId, String from, String to, String cursor, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new ApiException("Missing the required parameter 'environmentId' when calling getAllTitleTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = getAllTitleTransactionsCall(environmentId, from, to, cursor, _callback);
        return localVarCall;

    }

    /**
     * Get all transaction events for an environment.
     * Get all transaction events for an environment with an optional time period specified.
     * @param environmentId  (required)
     * @param from  (optional)
     * @param to  (optional)
     * @param cursor  (optional)
     * @return List&lt;TransactionEventDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public List<TransactionEventDTO> getAllTitleTransactions(String environmentId, String from, String to, String cursor) throws ApiException {
        ApiResponse<List<TransactionEventDTO>> localVarResp = getAllTitleTransactionsWithHttpInfo(environmentId, from, to, cursor);
        return localVarResp.getData();
    }

    /**
     * Get all transaction events for an environment.
     * Get all transaction events for an environment with an optional time period specified.
     * @param environmentId  (required)
     * @param from  (optional)
     * @param to  (optional)
     * @param cursor  (optional)
     * @return ApiResponse&lt;List&lt;TransactionEventDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TransactionEventDTO>> getAllTitleTransactionsWithHttpInfo(String environmentId, String from, String to, String cursor) throws ApiException {
        okhttp3.Call localVarCall = getAllTitleTransactionsValidateBeforeCall(environmentId, from, to, cursor, null);
        Type localVarReturnType = new TypeToken<List<TransactionEventDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all transaction events for an environment. (asynchronously)
     * Get all transaction events for an environment with an optional time period specified.
     * @param environmentId  (required)
     * @param from  (optional)
     * @param to  (optional)
     * @param cursor  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllTitleTransactionsAsync(String environmentId, String from, String to, String cursor, final ApiCallback<List<TransactionEventDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllTitleTransactionsValidateBeforeCall(environmentId, from, to, cursor, _callback);
        Type localVarReturnType = new TypeToken<List<TransactionEventDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransactionEventsForTitle
     * @param environmentId  (required)
     * @param transactionId  (required)
     * @param cursor  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionEventsForTitleCall(String environmentId, String transactionId, String cursor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/environments/{environmentId}/transactions/{transactionId}"
            .replaceAll("\\{" + "environmentId" + "\\}", localVarApiClient.escapeString(environmentId.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api_key", "spring_oauth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionEventsForTitleValidateBeforeCall(String environmentId, String transactionId, String cursor, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new ApiException("Missing the required parameter 'environmentId' when calling getTransactionEventsForTitle(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransactionEventsForTitle(Async)");
        }
        

        okhttp3.Call localVarCall = getTransactionEventsForTitleCall(environmentId, transactionId, cursor, _callback);
        return localVarCall;

    }

    /**
     * Get transaction events for transaction ID in an environment.
     * Get transaction events for transaction ID in an environment.
     * @param environmentId  (required)
     * @param transactionId  (required)
     * @param cursor  (optional)
     * @return List&lt;TransactionEventDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public List<TransactionEventDTO> getTransactionEventsForTitle(String environmentId, String transactionId, String cursor) throws ApiException {
        ApiResponse<List<TransactionEventDTO>> localVarResp = getTransactionEventsForTitleWithHttpInfo(environmentId, transactionId, cursor);
        return localVarResp.getData();
    }

    /**
     * Get transaction events for transaction ID in an environment.
     * Get transaction events for transaction ID in an environment.
     * @param environmentId  (required)
     * @param transactionId  (required)
     * @param cursor  (optional)
     * @return ApiResponse&lt;List&lt;TransactionEventDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TransactionEventDTO>> getTransactionEventsForTitleWithHttpInfo(String environmentId, String transactionId, String cursor) throws ApiException {
        okhttp3.Call localVarCall = getTransactionEventsForTitleValidateBeforeCall(environmentId, transactionId, cursor, null);
        Type localVarReturnType = new TypeToken<List<TransactionEventDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get transaction events for transaction ID in an environment. (asynchronously)
     * Get transaction events for transaction ID in an environment.
     * @param environmentId  (required)
     * @param transactionId  (required)
     * @param cursor  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionEventsForTitleAsync(String environmentId, String transactionId, String cursor, final ApiCallback<List<TransactionEventDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionEventsForTitleValidateBeforeCall(environmentId, transactionId, cursor, _callback);
        Type localVarReturnType = new TypeToken<List<TransactionEventDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
