package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.IVIException;

import games.mythical.ivi.sdk.model.CreateEnvironmentInstanceRequest;
import games.mythical.ivi.sdk.model.CreateTitleRequest;
import games.mythical.ivi.sdk.model.EnvironmentInstanceDto;
import games.mythical.ivi.sdk.model.TitleDto;

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
@Component("games.mythical.ivi.sdk.api.TitlesApi")
public class TitlesApi {
    private ApiClient apiClient;

    public TitlesApi() {
        this(new ApiClient());
    }

    @Autowired
    public TitlesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create environment instance for title
     * Create new environment instance for a title
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param titleId  (required)
     * @param createEnvironmentInstanceRequest  (required)
     * @return EnvironmentInstanceDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public EnvironmentInstanceDto addEnvironmentInstance(String titleId, CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest) throws IVIException {
        return addEnvironmentInstanceWithHttpInfo(titleId, createEnvironmentInstanceRequest).getBody();
    }

    /**
     * Create environment instance for title
     * Create new environment instance for a title
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param titleId  (required)
     * @param createEnvironmentInstanceRequest  (required)
     * @return ResponseEntity&lt;EnvironmentInstanceDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EnvironmentInstanceDto> addEnvironmentInstanceWithHttpInfo(String titleId, CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest) throws IVIException {
        Object postBody = createEnvironmentInstanceRequest;
        
        // verify the required parameter 'titleId' is set
        if (titleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'titleId' when calling addEnvironmentInstance");
        }
        
        // verify the required parameter 'createEnvironmentInstanceRequest' is set
        if (createEnvironmentInstanceRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createEnvironmentInstanceRequest' when calling addEnvironmentInstance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("titleId", titleId);
        String path = apiClient.expandPath("/titles/{titleId}/environments", uriVariables);

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

        ParameterizedTypeReference<EnvironmentInstanceDto> returnType = new ParameterizedTypeReference<EnvironmentInstanceDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get environment instances for title
     * Get environment instances for a title
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param titleId  (required)
     * @param includeInactive  (optional)
     * @return List&lt;EnvironmentInstanceDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public List<EnvironmentInstanceDto> getEnvironmentInstancesForTitle(String titleId, Boolean includeInactive) throws IVIException {
        return getEnvironmentInstancesForTitleWithHttpInfo(titleId, includeInactive).getBody();
    }

    /**
     * Get environment instances for title
     * Get environment instances for a title
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param titleId  (required)
     * @param includeInactive  (optional)
     * @return ResponseEntity&lt;List&lt;EnvironmentInstanceDto&gt;&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<EnvironmentInstanceDto>> getEnvironmentInstancesForTitleWithHttpInfo(String titleId, Boolean includeInactive) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'titleId' is set
        if (titleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'titleId' when calling getEnvironmentInstancesForTitle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("titleId", titleId);
        String path = apiClient.expandPath("/titles/{titleId}/environments", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeInactive", includeInactive));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<EnvironmentInstanceDto>> returnType = new ParameterizedTypeReference<List<EnvironmentInstanceDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get title
     * Get title details
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param titleId  (required)
     * @return TitleDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public TitleDto getTitleById(String titleId) throws IVIException {
        return getTitleByIdWithHttpInfo(titleId).getBody();
    }

    /**
     * Get title
     * Get title details
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param titleId  (required)
     * @return ResponseEntity&lt;TitleDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TitleDto> getTitleByIdWithHttpInfo(String titleId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'titleId' is set
        if (titleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'titleId' when calling getTitleById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("titleId", titleId);
        String path = apiClient.expandPath("/titles/{titleId}", uriVariables);

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

        ParameterizedTypeReference<TitleDto> returnType = new ParameterizedTypeReference<TitleDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Set title to activated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Title state updated.
     * @param titleId  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void setTitleActive(String titleId) throws IVIException {
        setTitleActiveWithHttpInfo(titleId);
    }

    /**
     * Set title to activated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Title state updated.
     * @param titleId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setTitleActiveWithHttpInfo(String titleId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'titleId' is set
        if (titleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'titleId' when calling setTitleActive");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("titleId", titleId);
        String path = apiClient.expandPath("/titles/{titleId}/activate", uriVariables);

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
     * Set title to deactivated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Title state updated.
     * @param titleId  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void setTitleInactive(String titleId) throws IVIException {
        setTitleInactiveWithHttpInfo(titleId);
    }

    /**
     * Set title to deactivated
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Title state updated.
     * @param titleId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setTitleInactiveWithHttpInfo(String titleId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'titleId' is set
        if (titleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'titleId' when calling setTitleInactive");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("titleId", titleId);
        String path = apiClient.expandPath("/titles/{titleId}/deactivate", uriVariables);

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
     * Update title
     * Update title name.
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - The title was updated successfully.
     * @param titleId  (required)
     * @param createTitleRequest  (required)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void updateTitle(String titleId, CreateTitleRequest createTitleRequest) throws IVIException {
        updateTitleWithHttpInfo(titleId, createTitleRequest);
    }

    /**
     * Update title
     * Update title name.
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - The title was updated successfully.
     * @param titleId  (required)
     * @param createTitleRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateTitleWithHttpInfo(String titleId, CreateTitleRequest createTitleRequest) throws IVIException {
        Object postBody = createTitleRequest;
        
        // verify the required parameter 'titleId' is set
        if (titleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'titleId' when calling updateTitle");
        }
        
        // verify the required parameter 'createTitleRequest' is set
        if (createTitleRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createTitleRequest' when calling updateTitle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("titleId", titleId);
        String path = apiClient.expandPath("/titles/{titleId}", uriVariables);

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
