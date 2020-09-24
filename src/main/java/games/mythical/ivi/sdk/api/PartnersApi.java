package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.AgreementDto;
import games.mythical.ivi.sdk.model.CreateAgreementRequest;
import games.mythical.ivi.sdk.model.CreatePartnerRequest;
import games.mythical.ivi.sdk.model.PartnerDto;
import games.mythical.ivi.sdk.model.UpdateAgreementRequest;
import games.mythical.ivi.sdk.model.UpdatePartnerRequest;

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
@Component("games.mythical.ivi.sdk.api.PartnersApi")
public class PartnersApi {
    private ApiClient apiClient;

    public PartnersApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Agreement
     * Create a new agreement for a partner
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param partnerId  (required)
     * @param createAgreementRequest  (required)
     * @return AgreementDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgreementDto createNewAgreement(String organizationId, String partnerId, CreateAgreementRequest createAgreementRequest) throws RestClientException {
        return createNewAgreementWithHttpInfo(organizationId, partnerId, createAgreementRequest).getBody();
    }

    /**
     * Create Agreement
     * Create a new agreement for a partner
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param partnerId  (required)
     * @param createAgreementRequest  (required)
     * @return ResponseEntity&lt;AgreementDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgreementDto> createNewAgreementWithHttpInfo(String organizationId, String partnerId, CreateAgreementRequest createAgreementRequest) throws RestClientException {
        Object postBody = createAgreementRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling createNewAgreement");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling createNewAgreement");
        }
        
        // verify the required parameter 'createAgreementRequest' is set
        if (createAgreementRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createAgreementRequest' when calling createNewAgreement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("partnerId", partnerId);
        String path = apiClient.expandPath("/orgs/{organizationId}/partner/{partnerId}/agreement", uriVariables);

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

        ParameterizedTypeReference<AgreementDto> returnType = new ParameterizedTypeReference<AgreementDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Create Partner
     * Create a new partner for an organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createPartnerRequest  (required)
     * @return PartnerDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PartnerDto createNewPartner(String organizationId, CreatePartnerRequest createPartnerRequest) throws RestClientException {
        return createNewPartnerWithHttpInfo(organizationId, createPartnerRequest).getBody();
    }

    /**
     * Create Partner
     * Create a new partner for an organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param createPartnerRequest  (required)
     * @return ResponseEntity&lt;PartnerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PartnerDto> createNewPartnerWithHttpInfo(String organizationId, CreatePartnerRequest createPartnerRequest) throws RestClientException {
        Object postBody = createPartnerRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling createNewPartner");
        }
        
        // verify the required parameter 'createPartnerRequest' is set
        if (createPartnerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createPartnerRequest' when calling createNewPartner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/partner", uriVariables);

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

        ParameterizedTypeReference<PartnerDto> returnType = new ParameterizedTypeReference<PartnerDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Agreements
     * Get all agreements for an partner
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param partnerId  (required)
     * @return List&lt;AgreementDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AgreementDto> getAgreements(String organizationId, String partnerId) throws RestClientException {
        return getAgreementsWithHttpInfo(organizationId, partnerId).getBody();
    }

    /**
     * Get Agreements
     * Get all agreements for an partner
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param partnerId  (required)
     * @return ResponseEntity&lt;List&lt;AgreementDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AgreementDto>> getAgreementsWithHttpInfo(String organizationId, String partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getAgreements");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling getAgreements");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("partnerId", partnerId);
        String path = apiClient.expandPath("/orgs/{organizationId}/partner/{partnerId}/agreement", uriVariables);

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

        ParameterizedTypeReference<List<AgreementDto>> returnType = new ParameterizedTypeReference<List<AgreementDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Partners
     * Get all partners for an organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return List&lt;PartnerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PartnerDto> getPartners(String organizationId) throws RestClientException {
        return getPartnersWithHttpInfo(organizationId).getBody();
    }

    /**
     * Get Partners
     * Get all partners for an organization
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @return ResponseEntity&lt;List&lt;PartnerDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PartnerDto>> getPartnersWithHttpInfo(String organizationId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling getPartners");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/partner", uriVariables);

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

        ParameterizedTypeReference<List<PartnerDto>> returnType = new ParameterizedTypeReference<List<PartnerDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update agreement details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param partnerId  (required)
     * @param updateAgreementRequest  (required)
     * @return AgreementDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgreementDto updateAgreement(String organizationId, String partnerId, UpdateAgreementRequest updateAgreementRequest) throws RestClientException {
        return updateAgreementWithHttpInfo(organizationId, partnerId, updateAgreementRequest).getBody();
    }

    /**
     * Update agreement details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param partnerId  (required)
     * @param updateAgreementRequest  (required)
     * @return ResponseEntity&lt;AgreementDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgreementDto> updateAgreementWithHttpInfo(String organizationId, String partnerId, UpdateAgreementRequest updateAgreementRequest) throws RestClientException {
        Object postBody = updateAgreementRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling updateAgreement");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling updateAgreement");
        }
        
        // verify the required parameter 'updateAgreementRequest' is set
        if (updateAgreementRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateAgreementRequest' when calling updateAgreement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        uriVariables.put("partnerId", partnerId);
        String path = apiClient.expandPath("/orgs/{organizationId}/partner/{partnerId}/agreement", uriVariables);

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

        ParameterizedTypeReference<AgreementDto> returnType = new ParameterizedTypeReference<AgreementDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update partner details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param updatePartnerRequest  (required)
     * @return PartnerDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PartnerDto updatePartner(String organizationId, UpdatePartnerRequest updatePartnerRequest) throws RestClientException {
        return updatePartnerWithHttpInfo(organizationId, updatePartnerRequest).getBody();
    }

    /**
     * Update partner details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param organizationId  (required)
     * @param updatePartnerRequest  (required)
     * @return ResponseEntity&lt;PartnerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PartnerDto> updatePartnerWithHttpInfo(String organizationId, UpdatePartnerRequest updatePartnerRequest) throws RestClientException {
        Object postBody = updatePartnerRequest;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling updatePartner");
        }
        
        // verify the required parameter 'updatePartnerRequest' is set
        if (updatePartnerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updatePartnerRequest' when calling updatePartner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);
        String path = apiClient.expandPath("/orgs/{organizationId}/partner", uriVariables);

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

        ParameterizedTypeReference<PartnerDto> returnType = new ParameterizedTypeReference<PartnerDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
