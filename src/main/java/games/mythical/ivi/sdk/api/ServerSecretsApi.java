package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.IVIException;

import games.mythical.ivi.sdk.model.CreateServerSecretRequest;
import games.mythical.ivi.sdk.model.ServerSecretDto;
import java.util.UUID;

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
@Component("games.mythical.ivi.sdk.api.ServerSecretsApi")
public class ServerSecretsApi {
    private ApiClient apiClient;

    public ServerSecretsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ServerSecretsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create server secret for organization
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createServerSecretRequest  (required)
     * @return ServerSecretDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ServerSecretDto createServerSecretForEnvironment(UUID organizationId, CreateServerSecretRequest createServerSecretRequest) throws IVIException {
        return createServerSecretForEnvironmentWithHttpInfo(organizationId, createServerSecretRequest).getBody();
    }

    /**
     * Create server secret for organization
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createServerSecretRequest  (required)
     * @return ResponseEntity&lt;ServerSecretDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServerSecretDto> createServerSecretForEnvironmentWithHttpInfo(UUID organizationId, CreateServerSecretRequest createServerSecretRequest) throws IVIException {
        Object postBody = createServerSecretRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling createServerSecretForEnvironment");
        }
        
        // verify the required parameter 'createServerSecretRequest' is set
        if (createServerSecretRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createServerSecretRequest' when calling createServerSecretForEnvironment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/secrets", uriVariables);

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

        ParameterizedTypeReference<ServerSecretDto> returnType = new ParameterizedTypeReference<ServerSecretDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete server secret for environment by secret ID
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Secret deleted successfully.
     * @param organizationId  (required)
     * @param secretId  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void deleteServerSecret(UUID organizationId, String secretId) throws IVIException {
        deleteServerSecretWithHttpInfo(organizationId, secretId);
    }

    /**
     * Delete server secret for environment by secret ID
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Secret deleted successfully.
     * @param organizationId  (required)
     * @param secretId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteServerSecretWithHttpInfo(UUID organizationId, String secretId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling deleteServerSecret");
        }
        
        // verify the required parameter 'secretId' is set
        if (secretId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secretId' when calling deleteServerSecret");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("secretId", secretId);
        String path = apiClient.expandPath("/orgs/{organizationId}/secrets/{secretId}", uriVariables);

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
     * Disable server secret by secret ID
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Secret disabled successfully.
     * @param organizationId  (required)
     * @param secretId  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void disableServerSecret(UUID organizationId, String secretId) throws IVIException {
        disableServerSecretWithHttpInfo(organizationId, secretId);
    }

    /**
     * Disable server secret by secret ID
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Secret disabled successfully.
     * @param organizationId  (required)
     * @param secretId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> disableServerSecretWithHttpInfo(UUID organizationId, String secretId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling disableServerSecret");
        }
        
        // verify the required parameter 'secretId' is set
        if (secretId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secretId' when calling disableServerSecret");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("secretId", secretId);
        String path = apiClient.expandPath("/orgs/{organizationId}/secrets/{secretId}/disable", uriVariables);

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
     * Enable server secret by secret ID
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Secret enabled successfully.
     * @param organizationId  (required)
     * @param secretId  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void enableServerSecret(UUID organizationId, String secretId) throws IVIException {
        enableServerSecretWithHttpInfo(organizationId, secretId);
    }

    /**
     * Enable server secret by secret ID
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Secret enabled successfully.
     * @param organizationId  (required)
     * @param secretId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> enableServerSecretWithHttpInfo(UUID organizationId, String secretId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling enableServerSecret");
        }
        
        // verify the required parameter 'secretId' is set
        if (secretId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secretId' when calling enableServerSecret");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("secretId", secretId);
        String path = apiClient.expandPath("/orgs/{organizationId}/secrets/{secretId}/enable", uriVariables);

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
     * Get server secret for environment by secret ID
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param secretId  (required)
     * @return ServerSecretDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ServerSecretDto getServerSecretById(UUID organizationId, String secretId) throws IVIException {
        return getServerSecretByIdWithHttpInfo(organizationId, secretId).getBody();
    }

    /**
     * Get server secret for environment by secret ID
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param secretId  (required)
     * @return ResponseEntity&lt;ServerSecretDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServerSecretDto> getServerSecretByIdWithHttpInfo(UUID organizationId, String secretId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getServerSecretById");
        }
        
        // verify the required parameter 'secretId' is set
        if (secretId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secretId' when calling getServerSecretById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("secretId", secretId);
        String path = apiClient.expandPath("/orgs/{organizationId}/secrets/{secretId}", uriVariables);

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

        ParameterizedTypeReference<ServerSecretDto> returnType = new ParameterizedTypeReference<ServerSecretDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get server secrets defined for organization
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return List&lt;ServerSecretDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public List<ServerSecretDto> getServerSecretsForEnvironment(UUID organizationId) throws IVIException {
        return getServerSecretsForEnvironmentWithHttpInfo(organizationId).getBody();
    }

    /**
     * Get server secrets defined for organization
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return ResponseEntity&lt;List&lt;ServerSecretDto&gt;&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ServerSecretDto>> getServerSecretsForEnvironmentWithHttpInfo(UUID organizationId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getServerSecretsForEnvironment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/secrets", uriVariables);

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

        ParameterizedTypeReference<List<ServerSecretDto>> returnType = new ParameterizedTypeReference<List<ServerSecretDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
