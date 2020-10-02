package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.LinkPlayerToEnvironmentRequest;
import games.mythical.ivi.sdk.model.PlayerDto;

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
@Component("games.mythical.ivi.sdk.api.PlayersApi")
public class PlayersApi {
    private ApiClient apiClient;

    public PlayersApi() {
        this(new ApiClient());
    }

    @Autowired
    public PlayersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all players for a environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return List&lt;PlayerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PlayerDto> getAllPlayers(String environmentId) throws RestClientException {
        return getAllPlayersWithHttpInfo(environmentId).getBody();
    }

    /**
     * Get all players for a environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @return ResponseEntity&lt;List&lt;PlayerDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PlayerDto>> getAllPlayersWithHttpInfo(String environmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getAllPlayers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/players", uriVariables);

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

        ParameterizedTypeReference<List<PlayerDto>> returnType = new ParameterizedTypeReference<List<PlayerDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get player data
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param playerId  (required)
     * @return PlayerDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlayerDto getPlayerData(String environmentId, String playerId) throws RestClientException {
        return getPlayerDataWithHttpInfo(environmentId, playerId).getBody();
    }

    /**
     * Get player data
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param playerId  (required)
     * @return ResponseEntity&lt;PlayerDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlayerDto> getPlayerDataWithHttpInfo(String environmentId, String playerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getPlayerData");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling getPlayerData");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("playerId", playerId);
        String path = apiClient.expandPath("/environments/{environmentId}/players/{playerId}", uriVariables);

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

        ParameterizedTypeReference<PlayerDto> returnType = new ParameterizedTypeReference<PlayerDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Link player to environment
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>202</b> - The player linking was accepted
     * @param environmentId  (required)
     * @param linkPlayerToEnvironmentRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void linkPlayerToEnvironment(String environmentId, LinkPlayerToEnvironmentRequest linkPlayerToEnvironmentRequest) throws RestClientException {
        linkPlayerToEnvironmentWithHttpInfo(environmentId, linkPlayerToEnvironmentRequest);
    }

    /**
     * Link player to environment
     * 
     * <p><b>400</b> - Bad Request
     * <p><b>202</b> - The player linking was accepted
     * @param environmentId  (required)
     * @param linkPlayerToEnvironmentRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> linkPlayerToEnvironmentWithHttpInfo(String environmentId, LinkPlayerToEnvironmentRequest linkPlayerToEnvironmentRequest) throws RestClientException {
        Object postBody = linkPlayerToEnvironmentRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling linkPlayerToEnvironment");
        }
        
        // verify the required parameter 'linkPlayerToEnvironmentRequest' is set
        if (linkPlayerToEnvironmentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkPlayerToEnvironmentRequest' when calling linkPlayerToEnvironment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/players", uriVariables);

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
}
