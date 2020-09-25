package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.ClientPaymentTokenDto;
import games.mythical.ivi.sdk.model.CreateCustomerRequest;
import games.mythical.ivi.sdk.model.CreatePaymentMethodRequest;
import games.mythical.ivi.sdk.model.CustomerDto;
import games.mythical.ivi.sdk.model.FinalizePaymentRequest;
import games.mythical.ivi.sdk.model.GenerateTokenRequest;
import games.mythical.ivi.sdk.model.PaymentDto;
import games.mythical.ivi.sdk.model.PaymentMethodDto;
import games.mythical.ivi.sdk.model.SalesTaxInfoDto;
import games.mythical.ivi.sdk.model.SalesTaxTransactionDto;
import games.mythical.ivi.sdk.model.UpdateCustomerRequest;
import games.mythical.ivi.sdk.model.UpdatePaymentMethodDefaultRequest;

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
@Component("games.mythical.ivi.sdk.api.PaymentsApi")
public class PaymentsApi {
    private ApiClient apiClient;

    public PaymentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Finalize Purchase
     * Make the final payment
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Authentication failure.
     * <p><b>500</b> - Internal Server Error.
     * <p><b>403</b> - You do not have the correct access rights to make this request.
     * @param environmentId  (required)
     * @param finalizePaymentRequest  (required)
     * @return PaymentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentDto completePayment(String environmentId, FinalizePaymentRequest finalizePaymentRequest) throws RestClientException {
        return completePaymentWithHttpInfo(environmentId, finalizePaymentRequest).getBody();
    }

    /**
     * Finalize Purchase
     * Make the final payment
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Authentication failure.
     * <p><b>500</b> - Internal Server Error.
     * <p><b>403</b> - You do not have the correct access rights to make this request.
     * @param environmentId  (required)
     * @param finalizePaymentRequest  (required)
     * @return ResponseEntity&lt;PaymentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentDto> completePaymentWithHttpInfo(String environmentId, FinalizePaymentRequest finalizePaymentRequest) throws RestClientException {
        Object postBody = finalizePaymentRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling completePayment");
        }
        
        // verify the required parameter 'finalizePaymentRequest' is set
        if (finalizePaymentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'finalizePaymentRequest' when calling completePayment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/pay", uriVariables);

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

        ParameterizedTypeReference<PaymentDto> returnType = new ParameterizedTypeReference<PaymentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Create Customer
     * Create Payment Customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createCustomerRequest  (required)
     * @return CustomerDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerDto createCustomer(String environmentId, CreateCustomerRequest createCustomerRequest) throws RestClientException {
        return createCustomerWithHttpInfo(environmentId, createCustomerRequest).getBody();
    }

    /**
     * Create Customer
     * Create Payment Customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createCustomerRequest  (required)
     * @return ResponseEntity&lt;CustomerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerDto> createCustomerWithHttpInfo(String environmentId, CreateCustomerRequest createCustomerRequest) throws RestClientException {
        Object postBody = createCustomerRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling createCustomer");
        }
        
        // verify the required parameter 'createCustomerRequest' is set
        if (createCustomerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createCustomerRequest' when calling createCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer", uriVariables);

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

        ParameterizedTypeReference<CustomerDto> returnType = new ParameterizedTypeReference<CustomerDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Create Payment Method
     * Create Payment Method
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createPaymentMethodRequest  (required)
     * @return PaymentMethodDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentMethodDto createPaymentMethod(String environmentId, CreatePaymentMethodRequest createPaymentMethodRequest) throws RestClientException {
        return createPaymentMethodWithHttpInfo(environmentId, createPaymentMethodRequest).getBody();
    }

    /**
     * Create Payment Method
     * Create Payment Method
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createPaymentMethodRequest  (required)
     * @return ResponseEntity&lt;PaymentMethodDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentMethodDto> createPaymentMethodWithHttpInfo(String environmentId, CreatePaymentMethodRequest createPaymentMethodRequest) throws RestClientException {
        Object postBody = createPaymentMethodRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling createPaymentMethod");
        }
        
        // verify the required parameter 'createPaymentMethodRequest' is set
        if (createPaymentMethodRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createPaymentMethodRequest' when calling createPaymentMethod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer/methods", uriVariables);

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

        ParameterizedTypeReference<PaymentMethodDto> returnType = new ParameterizedTypeReference<PaymentMethodDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete Customer
     * Delete an existing Payment Customer
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Customer deleted
     * @param environmentId  (required)
     * @param customerId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomer(String environmentId, String customerId) throws RestClientException {
        deleteCustomerWithHttpInfo(environmentId, customerId);
    }

    /**
     * Delete Customer
     * Delete an existing Payment Customer
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Customer deleted
     * @param environmentId  (required)
     * @param customerId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerWithHttpInfo(String environmentId, String customerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling deleteCustomer");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling deleteCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("customerId", customerId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer/{customerId}", uriVariables);

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
     * Delete a Payment Method
     * Delete an existing Payment Method
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Payment Method deleted
     * @param environmentId  (required)
     * @param methodToken  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePaymentMethod(String environmentId, String methodToken) throws RestClientException {
        deletePaymentMethodWithHttpInfo(environmentId, methodToken);
    }

    /**
     * Delete a Payment Method
     * Delete an existing Payment Method
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Payment Method deleted
     * @param environmentId  (required)
     * @param methodToken  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePaymentMethodWithHttpInfo(String environmentId, String methodToken) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling deletePaymentMethod");
        }
        
        // verify the required parameter 'methodToken' is set
        if (methodToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'methodToken' when calling deletePaymentMethod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("methodToken", methodToken);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer/methods/{methodToken}", uriVariables);

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
     * Anonymous payment token
     * Get an anonymous payment token for a customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param generateTokenRequest  (required)
     * @return ClientPaymentTokenDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientPaymentTokenDto generateClientToken(String environmentId, GenerateTokenRequest generateTokenRequest) throws RestClientException {
        return generateClientTokenWithHttpInfo(environmentId, generateTokenRequest).getBody();
    }

    /**
     * Anonymous payment token
     * Get an anonymous payment token for a customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param generateTokenRequest  (required)
     * @return ResponseEntity&lt;ClientPaymentTokenDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientPaymentTokenDto> generateClientTokenWithHttpInfo(String environmentId, GenerateTokenRequest generateTokenRequest) throws RestClientException {
        Object postBody = generateTokenRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling generateClientToken");
        }
        
        // verify the required parameter 'generateTokenRequest' is set
        if (generateTokenRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'generateTokenRequest' when calling generateClientToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/token", uriVariables);

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

        ParameterizedTypeReference<ClientPaymentTokenDto> returnType = new ParameterizedTypeReference<ClientPaymentTokenDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Customer
     * Find a Payment Customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param customerId  (required)
     * @return CustomerDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerDto getCustomer(String environmentId, String customerId) throws RestClientException {
        return getCustomerWithHttpInfo(environmentId, customerId).getBody();
    }

    /**
     * Get Customer
     * Find a Payment Customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param customerId  (required)
     * @return ResponseEntity&lt;CustomerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerDto> getCustomerWithHttpInfo(String environmentId, String customerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getCustomer");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "customerId", customerId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<CustomerDto> returnType = new ParameterizedTypeReference<CustomerDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Payment Method
     * Find a Payment Method for a customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param paymentMethodToken  (required)
     * @return PaymentMethodDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentMethodDto getPaymentMethod(String environmentId, String paymentMethodToken) throws RestClientException {
        return getPaymentMethodWithHttpInfo(environmentId, paymentMethodToken).getBody();
    }

    /**
     * Get Payment Method
     * Find a Payment Method for a customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param paymentMethodToken  (required)
     * @return ResponseEntity&lt;PaymentMethodDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentMethodDto> getPaymentMethodWithHttpInfo(String environmentId, String paymentMethodToken) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getPaymentMethod");
        }
        
        // verify the required parameter 'paymentMethodToken' is set
        if (paymentMethodToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paymentMethodToken' when calling getPaymentMethod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer/methods", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paymentMethodToken", paymentMethodToken));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<PaymentMethodDto> returnType = new ParameterizedTypeReference<PaymentMethodDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get sales tax- rate and amount based on country, state, zip code and sales amount.
     * Get sales tax rate and tax amount based on country ISO code, state ISO code, zip code and sales amount.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param countryIsoCode  (required)
     * @param stateIsoCode  (required)
     * @param zipCode  (required)
     * @param isSecondaryMarketplace  (required)
     * @return SalesTaxInfoDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SalesTaxInfoDto getSalesTaxInfo(String environmentId, String countryIsoCode, String stateIsoCode, String zipCode, Boolean isSecondaryMarketplace) throws RestClientException {
        return getSalesTaxInfoWithHttpInfo(environmentId, countryIsoCode, stateIsoCode, zipCode, isSecondaryMarketplace).getBody();
    }

    /**
     * Get sales tax- rate and amount based on country, state, zip code and sales amount.
     * Get sales tax rate and tax amount based on country ISO code, state ISO code, zip code and sales amount.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param countryIsoCode  (required)
     * @param stateIsoCode  (required)
     * @param zipCode  (required)
     * @param isSecondaryMarketplace  (required)
     * @return ResponseEntity&lt;SalesTaxInfoDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SalesTaxInfoDto> getSalesTaxInfoWithHttpInfo(String environmentId, String countryIsoCode, String stateIsoCode, String zipCode, Boolean isSecondaryMarketplace) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getSalesTaxInfo");
        }
        
        // verify the required parameter 'countryIsoCode' is set
        if (countryIsoCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryIsoCode' when calling getSalesTaxInfo");
        }
        
        // verify the required parameter 'stateIsoCode' is set
        if (stateIsoCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stateIsoCode' when calling getSalesTaxInfo");
        }
        
        // verify the required parameter 'zipCode' is set
        if (zipCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'zipCode' when calling getSalesTaxInfo");
        }
        
        // verify the required parameter 'isSecondaryMarketplace' is set
        if (isSecondaryMarketplace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isSecondaryMarketplace' when calling getSalesTaxInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/tax/rate", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "countryIsoCode", countryIsoCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "stateIsoCode", stateIsoCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "zipCode", zipCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isSecondaryMarketplace", isSecondaryMarketplace));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<SalesTaxInfoDto> returnType = new ParameterizedTypeReference<SalesTaxInfoDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Transaction Details
     * Find transaction details for a transaction id
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param orderId  (required)
     * @return SalesTaxTransactionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SalesTaxTransactionDto getSalesTaxTransaction(String environmentId, String orderId) throws RestClientException {
        return getSalesTaxTransactionWithHttpInfo(environmentId, orderId).getBody();
    }

    /**
     * Get Transaction Details
     * Find transaction details for a transaction id
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param orderId  (required)
     * @return ResponseEntity&lt;SalesTaxTransactionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SalesTaxTransactionDto> getSalesTaxTransactionWithHttpInfo(String environmentId, String orderId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getSalesTaxTransaction");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling getSalesTaxTransaction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("orderId", orderId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/tax/transaction/{orderId}", uriVariables);

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

        ParameterizedTypeReference<SalesTaxTransactionDto> returnType = new ParameterizedTypeReference<SalesTaxTransactionDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update Customer
     * Update fields on an existing Payment Customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updateCustomerRequest  (required)
     * @return CustomerDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerDto updateCustomer(String environmentId, UpdateCustomerRequest updateCustomerRequest) throws RestClientException {
        return updateCustomerWithHttpInfo(environmentId, updateCustomerRequest).getBody();
    }

    /**
     * Update Customer
     * Update fields on an existing Payment Customer
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updateCustomerRequest  (required)
     * @return ResponseEntity&lt;CustomerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerDto> updateCustomerWithHttpInfo(String environmentId, UpdateCustomerRequest updateCustomerRequest) throws RestClientException {
        Object postBody = updateCustomerRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updateCustomer");
        }
        
        // verify the required parameter 'updateCustomerRequest' is set
        if (updateCustomerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateCustomerRequest' when calling updateCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer", uriVariables);

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

        ParameterizedTypeReference<CustomerDto> returnType = new ParameterizedTypeReference<CustomerDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update the default Payment Method
     * Set a payment method as a default
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updatePaymentMethodDefaultRequest  (required)
     * @return PaymentMethodDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentMethodDto updatePaymentMethod(String environmentId, UpdatePaymentMethodDefaultRequest updatePaymentMethodDefaultRequest) throws RestClientException {
        return updatePaymentMethodWithHttpInfo(environmentId, updatePaymentMethodDefaultRequest).getBody();
    }

    /**
     * Update the default Payment Method
     * Set a payment method as a default
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updatePaymentMethodDefaultRequest  (required)
     * @return ResponseEntity&lt;PaymentMethodDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentMethodDto> updatePaymentMethodWithHttpInfo(String environmentId, UpdatePaymentMethodDefaultRequest updatePaymentMethodDefaultRequest) throws RestClientException {
        Object postBody = updatePaymentMethodDefaultRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updatePaymentMethod");
        }
        
        // verify the required parameter 'updatePaymentMethodDefaultRequest' is set
        if (updatePaymentMethodDefaultRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updatePaymentMethodDefaultRequest' when calling updatePaymentMethod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/payments/customer/methods/default", uriVariables);

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

        ParameterizedTypeReference<PaymentMethodDto> returnType = new ParameterizedTypeReference<PaymentMethodDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
