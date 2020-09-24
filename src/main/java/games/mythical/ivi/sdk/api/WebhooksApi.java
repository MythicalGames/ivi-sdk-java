package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.CreateWebhookRequest;
import games.mythical.ivi.sdk.model.UpdateWebhookRequest;
import games.mythical.ivi.sdk.model.WebhookDto;

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
@Component("games.mythical.ivi.sdk.api.WebhooksApi")
public class WebhooksApi {
    private ApiClient apiClient;

    public WebhooksApi() {
        this(new ApiClient());
    }

    @Autowired
    public WebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create webhook
     * Define a new webhook that will be called to inform a game backend of platform events.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createWebhookRequest  (required)
     * @return WebhookDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookDto createNewWebhook(String environmentId, CreateWebhookRequest createWebhookRequest) throws RestClientException {
        return createNewWebhookWithHttpInfo(environmentId, createWebhookRequest).getBody();
    }

    /**
     * Create webhook
     * Define a new webhook that will be called to inform a game backend of platform events.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createWebhookRequest  (required)
     * @return ResponseEntity&lt;WebhookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookDto> createNewWebhookWithHttpInfo(String environmentId, CreateWebhookRequest createWebhookRequest) throws RestClientException {
        Object postBody = createWebhookRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling createNewWebhook");
        }
        
        // verify the required parameter 'createWebhookRequest' is set
        if (createWebhookRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createWebhookRequest' when calling createNewWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/webhooks", uriVariables);

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

        ParameterizedTypeReference<WebhookDto> returnType = new ParameterizedTypeReference<WebhookDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete webhook
     * Delete a webhook
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Webhook successfully deleted
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteWebhook(String environmentId, String webhookId) throws RestClientException {
        deleteWebhookWithHttpInfo(environmentId, webhookId);
    }

    /**
     * Delete webhook
     * Delete a webhook
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Webhook successfully deleted
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteWebhookWithHttpInfo(String environmentId, String webhookId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling deleteWebhook");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling deleteWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("webhookId", webhookId);
        String path = apiClient.expandPath("/environments/{environmentId}/webhooks/{webhookId}", uriVariables);

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
     * Disable webhook
     * Set a webhook to disabled.
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Webhook successfully disabled
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void disableWebhook(String environmentId, String webhookId) throws RestClientException {
        disableWebhookWithHttpInfo(environmentId, webhookId);
    }

    /**
     * Disable webhook
     * Set a webhook to disabled.
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Webhook successfully disabled
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> disableWebhookWithHttpInfo(String environmentId, String webhookId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling disableWebhook");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling disableWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("webhookId", webhookId);
        String path = apiClient.expandPath("/environments/{environmentId}/webhooks/{webhookId}/disable", uriVariables);

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
     * Enable webhook
     * Set a webhook to enabled.
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Webhook successfully enabled
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void enableWebhook(String environmentId, String webhookId) throws RestClientException {
        enableWebhookWithHttpInfo(environmentId, webhookId);
    }

    /**
     * Enable webhook
     * Set a webhook to enabled.
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Webhook successfully enabled
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> enableWebhookWithHttpInfo(String environmentId, String webhookId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling enableWebhook");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling enableWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("webhookId", webhookId);
        String path = apiClient.expandPath("/environments/{environmentId}/webhooks/{webhookId}/enable", uriVariables);

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
     * Get webhook
     * Get details for a webhook
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @return WebhookDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookDto getWebhook(String environmentId, String webhookId) throws RestClientException {
        return getWebhookWithHttpInfo(environmentId, webhookId).getBody();
    }

    /**
     * Get webhook
     * Get details for a webhook
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @return ResponseEntity&lt;WebhookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookDto> getWebhookWithHttpInfo(String environmentId, String webhookId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getWebhook");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling getWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("webhookId", webhookId);
        String path = apiClient.expandPath("/environments/{environmentId}/webhooks/{webhookId}", uriVariables);

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

        ParameterizedTypeReference<WebhookDto> returnType = new ParameterizedTypeReference<WebhookDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get all webhooks for environment
     * Get details for all webhooks defined for this environment.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return List&lt;WebhookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<WebhookDto> getWebhooksForTitleId(String environmentId) throws RestClientException {
        return getWebhooksForTitleIdWithHttpInfo(environmentId).getBody();
    }

    /**
     * Get all webhooks for environment
     * Get details for all webhooks defined for this environment.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return ResponseEntity&lt;List&lt;WebhookDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<WebhookDto>> getWebhooksForTitleIdWithHttpInfo(String environmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getWebhooksForTitleId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/webhooks", uriVariables);

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

        ParameterizedTypeReference<List<WebhookDto>> returnType = new ParameterizedTypeReference<List<WebhookDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update webhook
     * Update an existing webhook. All details must be included in the request, not just what is being updated.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @param updateWebhookRequest  (required)
     * @return WebhookDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookDto updateWebhook(String environmentId, String webhookId, UpdateWebhookRequest updateWebhookRequest) throws RestClientException {
        return updateWebhookWithHttpInfo(environmentId, webhookId, updateWebhookRequest).getBody();
    }

    /**
     * Update webhook
     * Update an existing webhook. All details must be included in the request, not just what is being updated.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param webhookId  (required)
     * @param updateWebhookRequest  (required)
     * @return ResponseEntity&lt;WebhookDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookDto> updateWebhookWithHttpInfo(String environmentId, String webhookId, UpdateWebhookRequest updateWebhookRequest) throws RestClientException {
        Object postBody = updateWebhookRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updateWebhook");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookId' when calling updateWebhook");
        }
        
        // verify the required parameter 'updateWebhookRequest' is set
        if (updateWebhookRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateWebhookRequest' when calling updateWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("webhookId", webhookId);
        String path = apiClient.expandPath("/environments/{environmentId}/webhooks/{webhookId}", uriVariables);

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

        ParameterizedTypeReference<WebhookDto> returnType = new ParameterizedTypeReference<WebhookDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
