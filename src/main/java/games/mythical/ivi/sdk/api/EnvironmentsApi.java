package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.CreateEnvironmentInstanceRequest;
import games.mythical.ivi.sdk.model.EnvironmentInstanceDto;

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
@Component("games.mythical.ivi.sdk.api.EnvironmentsApi")
public class EnvironmentsApi {
    private ApiClient apiClient;

    public EnvironmentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnvironmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get title environment instance
     * Get environment instance details
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return EnvironmentInstanceDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnvironmentInstanceDto getEnvironmentInstance(String environmentId) throws RestClientException {
        return getEnvironmentInstanceWithHttpInfo(environmentId).getBody();
    }

    /**
     * Get title environment instance
     * Get environment instance details
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return ResponseEntity&lt;EnvironmentInstanceDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EnvironmentInstanceDto> getEnvironmentInstanceWithHttpInfo(String environmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getEnvironmentInstance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}", uriVariables);

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

        ParameterizedTypeReference<EnvironmentInstanceDto> returnType = new ParameterizedTypeReference<EnvironmentInstanceDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Set environment to activated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Environment state updated.
     * @param environmentId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setEnvironmentInstanceActive(String environmentId) throws RestClientException {
        setEnvironmentInstanceActiveWithHttpInfo(environmentId);
    }

    /**
     * Set environment to activated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Environment state updated.
     * @param environmentId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setEnvironmentInstanceActiveWithHttpInfo(String environmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling setEnvironmentInstanceActive");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/activate", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Set environment to deactivated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Environment state updated.
     * @param environmentId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setEnvironmentInstanceInactive(String environmentId) throws RestClientException {
        setEnvironmentInstanceInactiveWithHttpInfo(environmentId);
    }

    /**
     * Set environment to deactivated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Environment state updated.
     * @param environmentId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setEnvironmentInstanceInactiveWithHttpInfo(String environmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling setEnvironmentInstanceInactive");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/deactivate", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update instance display name for title
     * Update environment instance display name for a title
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Environment name updated.
     * @param environmentId  (required)
     * @param createEnvironmentInstanceRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateEnvironmentInstanceName(String environmentId, CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest) throws RestClientException {
        updateEnvironmentInstanceNameWithHttpInfo(environmentId, createEnvironmentInstanceRequest);
    }

    /**
     * Update instance display name for title
     * Update environment instance display name for a title
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Environment name updated.
     * @param environmentId  (required)
     * @param createEnvironmentInstanceRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateEnvironmentInstanceNameWithHttpInfo(String environmentId, CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest) throws RestClientException {
        Object postBody = createEnvironmentInstanceRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updateEnvironmentInstanceName");
        }
        
        // verify the required parameter 'createEnvironmentInstanceRequest' is set
        if (createEnvironmentInstanceRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createEnvironmentInstanceRequest' when calling updateEnvironmentInstanceName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
