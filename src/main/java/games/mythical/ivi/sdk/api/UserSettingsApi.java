package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.IVIException;

import games.mythical.ivi.sdk.model.ThemeDto;

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
@Component("games.mythical.ivi.sdk.api.UserSettingsApi")
public class UserSettingsApi {
    private ApiClient apiClient;

    public UserSettingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the display theme
     * Returns the user&#39;s preferred display theme: DARK or LIGHT.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @return ThemeDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ThemeDto getTheme() throws IVIException {
        return getThemeWithHttpInfo().getBody();
    }

    /**
     * Get the display theme
     * Returns the user&#39;s preferred display theme: DARK or LIGHT.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @return ResponseEntity&lt;ThemeDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ThemeDto> getThemeWithHttpInfo() throws IVIException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/users/settings/theme", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ThemeDto> returnType = new ParameterizedTypeReference<ThemeDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Set the display theme
     * Set the user&#39;s preferred display theme: DARK or LIGHT.
     * <p><b>200</b> - Display theme successfully set.
     * <p><b>400</b> - Bad Request
     * @param body  (optional)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void setTheme(String body) throws IVIException {
        setThemeWithHttpInfo(body);
    }

    /**
     * Set the display theme
     * Set the user&#39;s preferred display theme: DARK or LIGHT.
     * <p><b>200</b> - Display theme successfully set.
     * <p><b>400</b> - Bad Request
     * @param body  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setThemeWithHttpInfo(String body) throws IVIException {
        Object postBody = body;
        
        String path = apiClient.expandPath("/users/settings/theme", Collections.<String, Object>emptyMap());

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update the display theme
     * Update the user&#39;s preferred display theme: DARK or LIGHT.
     * <p><b>200</b> - Display theme successfully updated.
     * <p><b>400</b> - Bad Request
     * @param body  (optional)
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public void updateTheme(String body) throws IVIException {
        updateThemeWithHttpInfo(body);
    }

    /**
     * Update the display theme
     * Update the user&#39;s preferred display theme: DARK or LIGHT.
     * <p><b>200</b> - Display theme successfully updated.
     * <p><b>400</b> - Bad Request
     * @param body  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateThemeWithHttpInfo(String body) throws IVIException {
        Object postBody = body;
        
        String path = apiClient.expandPath("/users/settings/theme", Collections.<String, Object>emptyMap());

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
