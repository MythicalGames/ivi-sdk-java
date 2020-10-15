package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.IVIException;

import games.mythical.ivi.sdk.model.CreateOrderRequest;
import games.mythical.ivi.sdk.model.OrderDto;
import games.mythical.ivi.sdk.model.UpdateOrderRequest;

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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("games.mythical.ivi.sdk.api.OrdersApi")
public class OrdersApi {
    private ApiClient apiClient;

    public OrdersApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrdersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Order
     * Create New Order
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createOrderRequest  (required)
     * @return OrderDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public OrderDto createOrder(String environmentId, CreateOrderRequest createOrderRequest) throws IVIException {
        return createOrderWithHttpInfo(environmentId, createOrderRequest).getBody();
    }

    /**
     * Create Order
     * Create New Order
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createOrderRequest  (required)
     * @return ResponseEntity&lt;OrderDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderDto> createOrderWithHttpInfo(String environmentId, CreateOrderRequest createOrderRequest) throws IVIException {
        Object postBody = createOrderRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling createOrder");
        }
        
        // verify the required parameter 'createOrderRequest' is set
        if (createOrderRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createOrderRequest' when calling createOrder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/orders", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<OrderDto> returnType = new ParameterizedTypeReference<OrderDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete Order
     * Delete an existing Order
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Order deleted
     * @param environmentId  (required)
     * @param orderId  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void deleteOrder(String environmentId, String orderId) throws IVIException {
        deleteOrderWithHttpInfo(environmentId, orderId);
    }

    /**
     * Delete Order
     * Delete an existing Order
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Order deleted
     * @param environmentId  (required)
     * @param orderId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteOrderWithHttpInfo(String environmentId, String orderId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling deleteOrder");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling deleteOrder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("orderId", orderId);
        String path = apiClient.expandPath("/environments/{environmentId}/orders/{orderId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Order
     * Find an Order
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param orderId  (required)
     * @return OrderDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public OrderDto getOrder(String environmentId, String orderId) throws IVIException {
        return getOrderWithHttpInfo(environmentId, orderId).getBody();
    }

    /**
     * Get Order
     * Find an Order
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param orderId  (required)
     * @return ResponseEntity&lt;OrderDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderDto> getOrderWithHttpInfo(String environmentId, String orderId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getOrder");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling getOrder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/orders", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderId", orderId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<OrderDto> returnType = new ParameterizedTypeReference<OrderDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update Order
     * Update fields on an existing Order
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updateOrderRequest  (required)
     * @return OrderDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public OrderDto updateOrder(String environmentId, UpdateOrderRequest updateOrderRequest) throws IVIException {
        return updateOrderWithHttpInfo(environmentId, updateOrderRequest).getBody();
    }

    /**
     * Update Order
     * Update fields on an existing Order
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updateOrderRequest  (required)
     * @return ResponseEntity&lt;OrderDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderDto> updateOrderWithHttpInfo(String environmentId, UpdateOrderRequest updateOrderRequest) throws IVIException {
        Object postBody = updateOrderRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updateOrder");
        }
        
        // verify the required parameter 'updateOrderRequest' is set
        if (updateOrderRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateOrderRequest' when calling updateOrder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/orders", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<OrderDto> returnType = new ParameterizedTypeReference<OrderDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
