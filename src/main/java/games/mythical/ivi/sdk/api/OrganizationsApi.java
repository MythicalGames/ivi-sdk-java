package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.CreateTitleRequest;
import games.mythical.ivi.sdk.model.DefaultRoleDto;
import games.mythical.ivi.sdk.model.InviteUserToOrganizationRequest;
import games.mythical.ivi.sdk.model.OrganizationDto;
import games.mythical.ivi.sdk.model.Role;
import games.mythical.ivi.sdk.model.TitleDto;
import java.util.UUID;
import games.mythical.ivi.sdk.model.UpdateOrganizationRequest;
import games.mythical.ivi.sdk.model.UpdateOrganizationRoleRequest;
import games.mythical.ivi.sdk.model.UserDto;

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
@Component("games.mythical.ivi.sdk.api.OrganizationsApi")
public class OrganizationsApi {
    private ApiClient apiClient;

    public OrganizationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrganizationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create title
     * Create a new title in this organization.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createTitleRequest  (required)
     * @return TitleDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TitleDto createNewTitle(String organizationId, CreateTitleRequest createTitleRequest) throws RestClientException {
        return createNewTitleWithHttpInfo(organizationId, createTitleRequest).getBody();
    }

    /**
     * Create title
     * Create a new title in this organization.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createTitleRequest  (required)
     * @return ResponseEntity&lt;TitleDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TitleDto> createNewTitleWithHttpInfo(String organizationId, CreateTitleRequest createTitleRequest) throws RestClientException {
        Object postBody = createTitleRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling createNewTitle");
        }
        
        // verify the required parameter 'createTitleRequest' is set
        if (createTitleRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createTitleRequest' when calling createNewTitle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/titles", uriVariables);

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

        ParameterizedTypeReference<TitleDto> returnType = new ParameterizedTypeReference<TitleDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get default roles
     * Get the default roles that can be be created for your organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @return List&lt;DefaultRoleDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DefaultRoleDto> getDefaultRoles() throws RestClientException {
        return getDefaultRolesWithHttpInfo().getBody();
    }

    /**
     * Get default roles
     * Get the default roles that can be be created for your organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @return ResponseEntity&lt;List&lt;DefaultRoleDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DefaultRoleDto>> getDefaultRolesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/orgs/roles", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<DefaultRoleDto>> returnType = new ParameterizedTypeReference<List<DefaultRoleDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get organization
     * Get organization by id
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return OrganizationDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrganizationDto getOrg(String organizationId) throws RestClientException {
        return getOrgWithHttpInfo(organizationId).getBody();
    }

    /**
     * Get organization
     * Get organization by id
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return ResponseEntity&lt;OrganizationDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrganizationDto> getOrgWithHttpInfo(String organizationId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getOrg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}", uriVariables);

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

        ParameterizedTypeReference<OrganizationDto> returnType = new ParameterizedTypeReference<OrganizationDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get organizations
     * Get all organizations by user
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @return List&lt;OrganizationDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<OrganizationDto> getOrgs() throws RestClientException {
        return getOrgsWithHttpInfo().getBody();
    }

    /**
     * Get organizations
     * Get all organizations by user
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @return ResponseEntity&lt;List&lt;OrganizationDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<OrganizationDto>> getOrgsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/orgs", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<OrganizationDto>> returnType = new ParameterizedTypeReference<List<OrganizationDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get roles for organization
     * Get the roles that can be be assigned to users or server secrets
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return List&lt;Role&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Role> getRolesForOrg(UUID organizationId) throws RestClientException {
        return getRolesForOrgWithHttpInfo(organizationId).getBody();
    }

    /**
     * Get roles for organization
     * Get the roles that can be be assigned to users or server secrets
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return ResponseEntity&lt;List&lt;Role&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Role>> getRolesForOrgWithHttpInfo(UUID organizationId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getRolesForOrg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/roles", uriVariables);

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

        ParameterizedTypeReference<List<Role>> returnType = new ParameterizedTypeReference<List<Role>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get titles
     * Get titles for organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param includeInactive  (optional, default to true)
     * @return List&lt;TitleDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TitleDto> getTitles(String organizationId, Boolean includeInactive) throws RestClientException {
        return getTitlesWithHttpInfo(organizationId, includeInactive).getBody();
    }

    /**
     * Get titles
     * Get titles for organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param includeInactive  (optional, default to true)
     * @return ResponseEntity&lt;List&lt;TitleDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TitleDto>> getTitlesWithHttpInfo(String organizationId, Boolean includeInactive) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getTitles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/titles", uriVariables);

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

        ParameterizedTypeReference<List<TitleDto>> returnType = new ParameterizedTypeReference<List<TitleDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get users
     * Get users for organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return List&lt;UserDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserDto> getUsersForOrganization(String organizationId) throws RestClientException {
        return getUsersForOrganizationWithHttpInfo(organizationId).getBody();
    }

    /**
     * Get users
     * Get users for organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return ResponseEntity&lt;List&lt;UserDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserDto>> getUsersForOrganizationWithHttpInfo(String organizationId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getUsersForOrganization");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/users", uriVariables);

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

        ParameterizedTypeReference<List<UserDto>> returnType = new ParameterizedTypeReference<List<UserDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Invite a user to organization
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param inviteUserToOrganizationRequest  (required)
     * @return List&lt;UserDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserDto> inviteUserToOrg(UUID organizationId, List<InviteUserToOrganizationRequest> inviteUserToOrganizationRequest) throws RestClientException {
        return inviteUserToOrgWithHttpInfo(organizationId, inviteUserToOrganizationRequest).getBody();
    }

    /**
     * Invite a user to organization
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param inviteUserToOrganizationRequest  (required)
     * @return ResponseEntity&lt;List&lt;UserDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserDto>> inviteUserToOrgWithHttpInfo(UUID organizationId, List<InviteUserToOrganizationRequest> inviteUserToOrganizationRequest) throws RestClientException {
        Object postBody = inviteUserToOrganizationRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling inviteUserToOrg");
        }
        
        // verify the required parameter 'inviteUserToOrganizationRequest' is set
        if (inviteUserToOrganizationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inviteUserToOrganizationRequest' when calling inviteUserToOrg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/invites", uriVariables);

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

        ParameterizedTypeReference<List<UserDto>> returnType = new ParameterizedTypeReference<List<UserDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update organization details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param updateOrganizationRequest  (required)
     * @return OrganizationDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrganizationDto updateOrg(String organizationId, UpdateOrganizationRequest updateOrganizationRequest) throws RestClientException {
        return updateOrgWithHttpInfo(organizationId, updateOrganizationRequest).getBody();
    }

    /**
     * Update organization details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param updateOrganizationRequest  (required)
     * @return ResponseEntity&lt;OrganizationDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrganizationDto> updateOrgWithHttpInfo(String organizationId, UpdateOrganizationRequest updateOrganizationRequest) throws RestClientException {
        Object postBody = updateOrganizationRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling updateOrg");
        }
        
        // verify the required parameter 'updateOrganizationRequest' is set
        if (updateOrganizationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateOrganizationRequest' when calling updateOrg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}", uriVariables);

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

        ParameterizedTypeReference<OrganizationDto> returnType = new ParameterizedTypeReference<OrganizationDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update organization user role
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Success, no content
     * @param organizationId  (required)
     * @param platformUserId  (required)
     * @param updateOrganizationRoleRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateOrgRole(String organizationId, String platformUserId, UpdateOrganizationRoleRequest updateOrganizationRoleRequest) throws RestClientException {
        updateOrgRoleWithHttpInfo(organizationId, platformUserId, updateOrganizationRoleRequest);
    }

    /**
     * Update organization user role
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>204</b> - Success, no content
     * @param organizationId  (required)
     * @param platformUserId  (required)
     * @param updateOrganizationRoleRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateOrgRoleWithHttpInfo(String organizationId, String platformUserId, UpdateOrganizationRoleRequest updateOrganizationRoleRequest) throws RestClientException {
        Object postBody = updateOrganizationRoleRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling updateOrgRole");
        }
        
        // verify the required parameter 'platformUserId' is set
        if (platformUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platformUserId' when calling updateOrgRole");
        }
        
        // verify the required parameter 'updateOrganizationRoleRequest' is set
        if (updateOrganizationRoleRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateOrganizationRoleRequest' when calling updateOrgRole");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("platformUserId", platformUserId);
        String path = apiClient.expandPath("/orgs/{organizationId}/{platformUserId}/role", uriVariables);

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
