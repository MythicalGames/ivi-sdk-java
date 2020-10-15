package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.IVIException;

import games.mythical.ivi.sdk.model.MarketplaceItemDto;
import games.mythical.ivi.sdk.model.MarketplaceListingDto;
import games.mythical.ivi.sdk.model.SearchResponse;
import games.mythical.ivi.sdk.model.TransactionDto;
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
@Component("games.mythical.ivi.sdk.api.MarketplaceApi")
public class MarketplaceApi {
    private ApiClient apiClient;

    public MarketplaceApi() {
        this(new ApiClient());
    }

    @Autowired
    public MarketplaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all items of an environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param pageSize  (optional, default to 30)
     * @param createdTimestamp  (optional, default to -1l)
     * @param order  (optional, default to DESCENDING)
     * @return List&lt;MarketplaceListingDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public List<MarketplaceListingDto> getAllListings(String environmentId, Integer pageSize, Long createdTimestamp, String order) throws IVIException {
        return getAllListingsWithHttpInfo(environmentId, pageSize, createdTimestamp, order).getBody();
    }

    /**
     * Get all items of an environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param pageSize  (optional, default to 30)
     * @param createdTimestamp  (optional, default to -1l)
     * @param order  (optional, default to DESCENDING)
     * @return ResponseEntity&lt;List&lt;MarketplaceListingDto&gt;&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketplaceListingDto>> getAllListingsWithHttpInfo(String environmentId, Integer pageSize, Long createdTimestamp, String order) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getAllListings");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/marketplace/environments/{environmentId}/items/listed", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdTimestamp", createdTimestamp));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<MarketplaceListingDto>> returnType = new ParameterizedTypeReference<List<MarketplaceListingDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get the history of an item by DGood ID or Game ID
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param gameInventoryId  (optional)
     * @param dgoodId  (optional, default to -1l)
     * @return List&lt;TransactionDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public List<TransactionDto> getItemHistory(String environmentId, String gameInventoryId, Long dgoodId) throws IVIException {
        return getItemHistoryWithHttpInfo(environmentId, gameInventoryId, dgoodId).getBody();
    }

    /**
     * Get the history of an item by DGood ID or Game ID
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param gameInventoryId  (optional)
     * @param dgoodId  (optional, default to -1l)
     * @return ResponseEntity&lt;List&lt;TransactionDto&gt;&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TransactionDto>> getItemHistoryWithHttpInfo(String environmentId, String gameInventoryId, Long dgoodId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getItemHistory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/marketplace/environments/{environmentId}/items/issued/history", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "gameInventoryId", gameInventoryId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dgoodId", dgoodId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<TransactionDto>> returnType = new ParameterizedTypeReference<List<TransactionDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get all information for the listing with the given id
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param listingId  (required)
     * @return MarketplaceListingDto
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public MarketplaceListingDto getListing(String environmentId, String listingId) throws IVIException {
        return getListingWithHttpInfo(environmentId, listingId).getBody();
    }

    /**
     * Get all information for the listing with the given id
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param listingId  (required)
     * @return ResponseEntity&lt;MarketplaceListingDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MarketplaceListingDto> getListingWithHttpInfo(String environmentId, String listingId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getListing");
        }
        
        // verify the required parameter 'listingId' is set
        if (listingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listingId' when calling getListing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("listingId", listingId);
        String path = apiClient.expandPath("/marketplace/environments/{environmentId}/items/listed/{listingId}", uriVariables);

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

        ParameterizedTypeReference<MarketplaceListingDto> returnType = new ParameterizedTypeReference<MarketplaceListingDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get all items owned by the logged in user.
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param mythicalId  (optional)
     * @param playerId  (optional)
     * @return List&lt;MarketplaceItemDto&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public List<MarketplaceItemDto> getMarketplaceItems(String environmentId, UUID mythicalId, String playerId) throws IVIException {
        return getMarketplaceItemsWithHttpInfo(environmentId, mythicalId, playerId).getBody();
    }

    /**
     * Get all items owned by the logged in user.
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param mythicalId  (optional)
     * @param playerId  (optional)
     * @return ResponseEntity&lt;List&lt;MarketplaceItemDto&gt;&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketplaceItemDto>> getMarketplaceItemsWithHttpInfo(String environmentId, UUID mythicalId, String playerId) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getMarketplaceItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/marketplace/environments/{environmentId}/items/issued", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mythicalId", mythicalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "playerId", playerId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<MarketplaceItemDto>> returnType = new ParameterizedTypeReference<List<MarketplaceItemDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Search items
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param query  (optional)
     * @param filters  (optional)
     * @param artists  (optional)
     * @param rarity  (optional)
     * @param levels  (optional)
     * @param category  (optional)
     * @param tokenName  (optional)
     * @param price  (optional)
     * @param status  (optional)
     * @param pageSize  (optional, default to 30)
     * @param pageNum  (optional, default to 0)
     * @return SearchResponse
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public SearchResponse searchItems(String environmentId, String query, Boolean filters, String artists, String rarity, String levels, String category, String tokenName, String price, String status, Integer pageSize, Integer pageNum) throws IVIException {
        return searchItemsWithHttpInfo(environmentId, query, filters, artists, rarity, levels, category, tokenName, price, status, pageSize, pageNum).getBody();
    }

    /**
     * Search items
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param query  (optional)
     * @param filters  (optional)
     * @param artists  (optional)
     * @param rarity  (optional)
     * @param levels  (optional)
     * @param category  (optional)
     * @param tokenName  (optional)
     * @param price  (optional)
     * @param status  (optional)
     * @param pageSize  (optional, default to 30)
     * @param pageNum  (optional, default to 0)
     * @return ResponseEntity&lt;SearchResponse&gt;
     * @throws IVIException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchResponse> searchItemsWithHttpInfo(String environmentId, String query, Boolean filters, String artists, String rarity, String levels, String category, String tokenName, String price, String status, Integer pageSize, Integer pageNum) throws IVIException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling searchItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/marketplace/environments/{environmentId}/items/search", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filters", filters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "artists", artists));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rarity", rarity));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "levels", levels));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "category", category));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tokenName", tokenName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "price", price));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNum", pageNum));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<SearchResponse> returnType = new ParameterizedTypeReference<SearchResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
