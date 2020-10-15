package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.IVIException;

import games.mythical.ivi.sdk.model.CreateVirtualCurrencyRequest;
import games.mythical.ivi.sdk.model.VirtualCurrencyDto;

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
@Component("games.mythical.ivi.sdk.api.VirtualCurrenciesApi")
public class VirtualCurrenciesApi {
    private ApiClient apiClient;

    public VirtualCurrenciesApi() {
        this(new ApiClient());
    }

    @Autowired
    public VirtualCurrenciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add new virtual currency to environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createVirtualCurrencyRequest  (required)
     * @return VirtualCurrencyDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public VirtualCurrencyDto addSupportedCurrencyForEnvironment(String environmentId, CreateVirtualCurrencyRequest createVirtualCurrencyRequest) throws IVIException {
        return addSupportedCurrencyForEnvironmentWithHttpInfo(environmentId, createVirtualCurrencyRequest).getBody();
    }

    /**
     * Add new virtual currency to environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createVirtualCurrencyRequest  (required)
     * @return ResponseEntity&lt;VirtualCurrencyDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VirtualCurrencyDto> addSupportedCurrencyForEnvironmentWithHttpInfo(String environmentId, CreateVirtualCurrencyRequest createVirtualCurrencyRequest) throws IVIException {
        Object postBody = createVirtualCurrencyRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling addSupportedCurrencyForEnvironment");
        }
        
        // verify the required parameter 'createVirtualCurrencyRequest' is set
        if (createVirtualCurrencyRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createVirtualCurrencyRequest' when calling addSupportedCurrencyForEnvironment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/currencies", uriVariables);

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

        ParameterizedTypeReference<VirtualCurrencyDto> returnType = new ParameterizedTypeReference<VirtualCurrencyDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete virtual currency for environment by abbreviation
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Currency deleted successfully.
     * @param environmentId  (required)
     * @param abbreviation  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void deleteSupportedCurrencyByAbbreviation(String environmentId, String abbreviation) throws IVIException {
        deleteSupportedCurrencyByAbbreviationWithHttpInfo(environmentId, abbreviation);
    }

    /**
     * Delete virtual currency for environment by abbreviation
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Currency deleted successfully.
     * @param environmentId  (required)
     * @param abbreviation  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteSupportedCurrencyByAbbreviationWithHttpInfo(String environmentId, String abbreviation) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling deleteSupportedCurrencyByAbbreviation");
        }
        
        // verify the required parameter 'abbreviation' is set
        if (abbreviation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'abbreviation' when calling deleteSupportedCurrencyByAbbreviation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("abbreviation", abbreviation);
        String path = apiClient.expandPath("/environments/{environmentId}/currencies/{abbreviation}", uriVariables);

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
     * Get virtual currency for environment by abbreviation
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param abbreviation  (required)
     * @return VirtualCurrencyDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public VirtualCurrencyDto getSupportedCurrencyByAbbreviation(String environmentId, String abbreviation) throws IVIException {
        return getSupportedCurrencyByAbbreviationWithHttpInfo(environmentId, abbreviation).getBody();
    }

    /**
     * Get virtual currency for environment by abbreviation
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param abbreviation  (required)
     * @return ResponseEntity&lt;VirtualCurrencyDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VirtualCurrencyDto> getSupportedCurrencyByAbbreviationWithHttpInfo(String environmentId, String abbreviation) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getSupportedCurrencyByAbbreviation");
        }
        
        // verify the required parameter 'abbreviation' is set
        if (abbreviation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'abbreviation' when calling getSupportedCurrencyByAbbreviation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("abbreviation", abbreviation);
        String path = apiClient.expandPath("/environments/{environmentId}/currencies/{abbreviation}", uriVariables);

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

        ParameterizedTypeReference<VirtualCurrencyDto> returnType = new ParameterizedTypeReference<VirtualCurrencyDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get virtual currencies defined for environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return List&lt;VirtualCurrencyDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public List<VirtualCurrencyDto> getSupportedCurrencyForEnvironment(String environmentId) throws IVIException {
        return getSupportedCurrencyForEnvironmentWithHttpInfo(environmentId).getBody();
    }

    /**
     * Get virtual currencies defined for environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return ResponseEntity&lt;List&lt;VirtualCurrencyDto&gt;&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<VirtualCurrencyDto>> getSupportedCurrencyForEnvironmentWithHttpInfo(String environmentId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getSupportedCurrencyForEnvironment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/currencies", uriVariables);

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

        ParameterizedTypeReference<List<VirtualCurrencyDto>> returnType = new ParameterizedTypeReference<List<VirtualCurrencyDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
