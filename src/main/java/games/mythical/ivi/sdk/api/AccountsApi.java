package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.CreateMythicalUserRequest;
import games.mythical.ivi.sdk.model.MythicalUserDto;
import games.mythical.ivi.sdk.model.ProfilePictureDto;
import games.mythical.ivi.sdk.model.UpdateMythicalUserRequest;
import games.mythical.ivi.sdk.model.UpdateProfilePictureRequest;

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
@Component("games.mythical.ivi.sdk.api.AccountsApi")
public class AccountsApi {
    private ApiClient apiClient;

    public AccountsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create new mythical account
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createMythicalUserRequest  (required)
     * @return MythicalUserDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MythicalUserDto createMythicalUser(String organizationId, CreateMythicalUserRequest createMythicalUserRequest) throws RestClientException {
        return createMythicalUserWithHttpInfo(organizationId, createMythicalUserRequest).getBody();
    }

    /**
     * Create new mythical account
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createMythicalUserRequest  (required)
     * @return ResponseEntity&lt;MythicalUserDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MythicalUserDto> createMythicalUserWithHttpInfo(String organizationId, CreateMythicalUserRequest createMythicalUserRequest) throws RestClientException {
        Object postBody = createMythicalUserRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling createMythicalUser");
        }
        
        // verify the required parameter 'createMythicalUserRequest' is set
        if (createMythicalUserRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createMythicalUserRequest' when calling createMythicalUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/accounts", uriVariables);

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

        ParameterizedTypeReference<MythicalUserDto> returnType = new ParameterizedTypeReference<MythicalUserDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Find mythical accounts
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param email  (required)
     * @param firstName  (optional)
     * @param lastName  (optional)
     * @return List&lt;MythicalUserDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MythicalUserDto> findMythicalUser(String organizationId, String email, String firstName, String lastName) throws RestClientException {
        return findMythicalUserWithHttpInfo(organizationId, email, firstName, lastName).getBody();
    }

    /**
     * Find mythical accounts
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param email  (required)
     * @param firstName  (optional)
     * @param lastName  (optional)
     * @return ResponseEntity&lt;List&lt;MythicalUserDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MythicalUserDto>> findMythicalUserWithHttpInfo(String organizationId, String email, String firstName, String lastName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling findMythicalUser");
        }
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling findMythicalUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/accounts/search", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<MythicalUserDto>> returnType = new ParameterizedTypeReference<List<MythicalUserDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get mythical platform user by id
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param platformUserId  (required)
     * @return MythicalUserDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MythicalUserDto getMythicalUser(String organizationId, String platformUserId) throws RestClientException {
        return getMythicalUserWithHttpInfo(organizationId, platformUserId).getBody();
    }

    /**
     * Get mythical platform user by id
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param platformUserId  (required)
     * @return ResponseEntity&lt;MythicalUserDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MythicalUserDto> getMythicalUserWithHttpInfo(String organizationId, String platformUserId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getMythicalUser");
        }
        
        // verify the required parameter 'platformUserId' is set
        if (platformUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platformUserId' when calling getMythicalUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("platformUserId", platformUserId);
        String path = apiClient.expandPath("/orgs/{organizationId}/accounts/{platformUserId}", uriVariables);

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

        ParameterizedTypeReference<MythicalUserDto> returnType = new ParameterizedTypeReference<MythicalUserDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Reset user password
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param platformUserId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void resetPassword(String environmentId, String platformUserId) throws RestClientException {
        resetPasswordWithHttpInfo(environmentId, platformUserId);
    }

    /**
     * Reset user password
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param platformUserId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> resetPasswordWithHttpInfo(String environmentId, String platformUserId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling resetPassword");
        }
        
        // verify the required parameter 'platformUserId' is set
        if (platformUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platformUserId' when calling resetPassword");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("platformUserId", platformUserId);
        String path = apiClient.expandPath("/environments/{environmentId}/players/{platformUserId}/reset-password", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update user profile details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param platformUserId  (required)
     * @param updateMythicalUserRequest  (required)
     * @return MythicalUserDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MythicalUserDto updateProfileDetails(String environmentId, String platformUserId, UpdateMythicalUserRequest updateMythicalUserRequest) throws RestClientException {
        return updateProfileDetailsWithHttpInfo(environmentId, platformUserId, updateMythicalUserRequest).getBody();
    }

    /**
     * Update user profile details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param platformUserId  (required)
     * @param updateMythicalUserRequest  (required)
     * @return ResponseEntity&lt;MythicalUserDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MythicalUserDto> updateProfileDetailsWithHttpInfo(String environmentId, String platformUserId, UpdateMythicalUserRequest updateMythicalUserRequest) throws RestClientException {
        Object postBody = updateMythicalUserRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updateProfileDetails");
        }
        
        // verify the required parameter 'platformUserId' is set
        if (platformUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platformUserId' when calling updateProfileDetails");
        }
        
        // verify the required parameter 'updateMythicalUserRequest' is set
        if (updateMythicalUserRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateMythicalUserRequest' when calling updateProfileDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("platformUserId", platformUserId);
        String path = apiClient.expandPath("/environments/{environmentId}/players/{platformUserId}/profile", uriVariables);

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

        ParameterizedTypeReference<MythicalUserDto> returnType = new ParameterizedTypeReference<MythicalUserDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update user profile picture
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param platformUserId  (required)
     * @param updateProfilePictureRequest  (required)
     * @return ProfilePictureDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProfilePictureDto updateProfilePicture(String environmentId, String platformUserId, UpdateProfilePictureRequest updateProfilePictureRequest) throws RestClientException {
        return updateProfilePictureWithHttpInfo(environmentId, platformUserId, updateProfilePictureRequest).getBody();
    }

    /**
     * Update user profile picture
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param platformUserId  (required)
     * @param updateProfilePictureRequest  (required)
     * @return ResponseEntity&lt;ProfilePictureDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProfilePictureDto> updateProfilePictureWithHttpInfo(String environmentId, String platformUserId, UpdateProfilePictureRequest updateProfilePictureRequest) throws RestClientException {
        Object postBody = updateProfilePictureRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updateProfilePicture");
        }
        
        // verify the required parameter 'platformUserId' is set
        if (platformUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platformUserId' when calling updateProfilePicture");
        }
        
        // verify the required parameter 'updateProfilePictureRequest' is set
        if (updateProfilePictureRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateProfilePictureRequest' when calling updateProfilePicture");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("platformUserId", platformUserId);
        String path = apiClient.expandPath("/environments/{environmentId}/players/{platformUserId}/profile/picture", uriVariables);

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

        ParameterizedTypeReference<ProfilePictureDto> returnType = new ParameterizedTypeReference<ProfilePictureDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
