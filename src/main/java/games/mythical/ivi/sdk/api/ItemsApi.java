package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;

import games.mythical.ivi.sdk.model.BurnItemRequest;
import games.mythical.ivi.sdk.model.BuyListingRequest;
import games.mythical.ivi.sdk.model.CloseSaleRequest;
import games.mythical.ivi.sdk.model.CreateItemRequest;
import games.mythical.ivi.sdk.model.DgoodMetadataDto;
import games.mythical.ivi.sdk.model.IssueItemRequest;
import games.mythical.ivi.sdk.model.IssuedItemDto;
import games.mythical.ivi.sdk.model.ItemActionDto;
import games.mythical.ivi.sdk.model.ItemTypeDto;
import games.mythical.ivi.sdk.model.ListSaleRequest;
import games.mythical.ivi.sdk.model.ListingDto;
import games.mythical.ivi.sdk.model.SoldItemDto;
import games.mythical.ivi.sdk.model.TransferItemRequest;
import games.mythical.ivi.sdk.model.UpdateMetadataRequest;

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
@Component("games.mythical.ivi.sdk.api.ItemsApi")
public class ItemsApi {
    private ApiClient apiClient;

    public ItemsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ItemsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Burn issued item
     * Burn an issued item
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param burnItemRequest  (required)
     * @return ItemActionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ItemActionDto burnItem(String environmentId, BurnItemRequest burnItemRequest) throws RestClientException {
        return burnItemWithHttpInfo(environmentId, burnItemRequest).getBody();
    }

    /**
     * Burn issued item
     * Burn an issued item
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param burnItemRequest  (required)
     * @return ResponseEntity&lt;ItemActionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ItemActionDto> burnItemWithHttpInfo(String environmentId, BurnItemRequest burnItemRequest) throws RestClientException {
        Object postBody = burnItemRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling burnItem");
        }
        
        // verify the required parameter 'burnItemRequest' is set
        if (burnItemRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'burnItemRequest' when calling burnItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/burn", uriVariables);

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

        ParameterizedTypeReference<ItemActionDto> returnType = new ParameterizedTypeReference<ItemActionDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Purchase an item
     * Buy an item that is for sale
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param buyListingRequest  (required)
     * @return SoldItemDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SoldItemDto buyListing(String environmentId, BuyListingRequest buyListingRequest) throws RestClientException {
        return buyListingWithHttpInfo(environmentId, buyListingRequest).getBody();
    }

    /**
     * Purchase an item
     * Buy an item that is for sale
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param buyListingRequest  (required)
     * @return ResponseEntity&lt;SoldItemDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SoldItemDto> buyListingWithHttpInfo(String environmentId, BuyListingRequest buyListingRequest) throws RestClientException {
        Object postBody = buyListingRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling buyListing");
        }
        
        // verify the required parameter 'buyListingRequest' is set
        if (buyListingRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'buyListingRequest' when calling buyListing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/buy", uriVariables);

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

        ParameterizedTypeReference<SoldItemDto> returnType = new ParameterizedTypeReference<SoldItemDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Close a sale
     * Close a listed item sale
     * <p><b>400</b> - Bad Request
     * <p><b>202</b> - The request was accepted. Expect a response via configured webhook. Response will contain this transactionId.
     * @param environmentId  (required)
     * @param closeSaleRequest  (required)
     * @return ItemActionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ItemActionDto closeSale(String environmentId, CloseSaleRequest closeSaleRequest) throws RestClientException {
        return closeSaleWithHttpInfo(environmentId, closeSaleRequest).getBody();
    }

    /**
     * Close a sale
     * Close a listed item sale
     * <p><b>400</b> - Bad Request
     * <p><b>202</b> - The request was accepted. Expect a response via configured webhook. Response will contain this transactionId.
     * @param environmentId  (required)
     * @param closeSaleRequest  (required)
     * @return ResponseEntity&lt;ItemActionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ItemActionDto> closeSaleWithHttpInfo(String environmentId, CloseSaleRequest closeSaleRequest) throws RestClientException {
        Object postBody = closeSaleRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling closeSale");
        }
        
        // verify the required parameter 'closeSaleRequest' is set
        if (closeSaleRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'closeSaleRequest' when calling closeSale");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/listed", uriVariables);

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

        ParameterizedTypeReference<ItemActionDto> returnType = new ParameterizedTypeReference<ItemActionDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Create item type
     * Create a new type of item on the blockchain that can be issued to players.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createItemRequest  (required)
     * @return ItemTypeDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ItemTypeDto createItem(String environmentId, CreateItemRequest createItemRequest) throws RestClientException {
        return createItemWithHttpInfo(environmentId, createItemRequest).getBody();
    }

    /**
     * Create item type
     * Create a new type of item on the blockchain that can be issued to players.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param createItemRequest  (required)
     * @return ResponseEntity&lt;ItemTypeDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ItemTypeDto> createItemWithHttpInfo(String environmentId, CreateItemRequest createItemRequest) throws RestClientException {
        Object postBody = createItemRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling createItem");
        }
        
        // verify the required parameter 'createItemRequest' is set
        if (createItemRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createItemRequest' when calling createItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/types", uriVariables);

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

        ParameterizedTypeReference<ItemTypeDto> returnType = new ParameterizedTypeReference<ItemTypeDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get all issued items for an environment.
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param playerId  (optional)
     * @param gameInventoryId  (optional)
     * @param dgoodId  (optional, default to -1l)
     * @return List&lt;IssuedItemDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<IssuedItemDto> getIssuedItems(String environmentId, String playerId, String gameInventoryId, Long dgoodId) throws RestClientException {
        return getIssuedItemsWithHttpInfo(environmentId, playerId, gameInventoryId, dgoodId).getBody();
    }

    /**
     * Get all issued items for an environment.
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param playerId  (optional)
     * @param gameInventoryId  (optional)
     * @param dgoodId  (optional, default to -1l)
     * @return ResponseEntity&lt;List&lt;IssuedItemDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<IssuedItemDto>> getIssuedItemsWithHttpInfo(String environmentId, String playerId, String gameInventoryId, Long dgoodId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getIssuedItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/issued", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "playerId", playerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "gameInventoryId", gameInventoryId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dgoodId", dgoodId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<IssuedItemDto>> returnType = new ParameterizedTypeReference<List<IssuedItemDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get all item types for an environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param category  (optional)
     * @param token  (optional)
     * @return List&lt;ItemTypeDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ItemTypeDto> getItemTypes(String environmentId, String category, String token) throws RestClientException {
        return getItemTypesWithHttpInfo(environmentId, category, token).getBody();
    }

    /**
     * Get all item types for an environment
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param category  (optional)
     * @param token  (optional)
     * @return ResponseEntity&lt;List&lt;ItemTypeDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ItemTypeDto>> getItemTypesWithHttpInfo(String environmentId, String category, String token) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getItemTypes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/types", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "category", category));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "token", token));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<ItemTypeDto>> returnType = new ParameterizedTypeReference<List<ItemTypeDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get listed items
     * Get all listed item for sale
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param pageSize  (optional, default to 30)
     * @param createdTimestamp  (optional, default to -1l)
     * @param order  (optional, default to DESCENDING)
     * @param playerId  (optional)
     * @return List&lt;ListingDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ListingDto> getListings(String environmentId, Integer pageSize, Long createdTimestamp, String order, String playerId) throws RestClientException {
        return getListingsWithHttpInfo(environmentId, pageSize, createdTimestamp, order, playerId).getBody();
    }

    /**
     * Get listed items
     * Get all listed item for sale
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param pageSize  (optional, default to 30)
     * @param createdTimestamp  (optional, default to -1l)
     * @param order  (optional, default to DESCENDING)
     * @param playerId  (optional)
     * @return ResponseEntity&lt;List&lt;ListingDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ListingDto>> getListingsWithHttpInfo(String environmentId, Integer pageSize, Long createdTimestamp, String order, String playerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getListings");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/listed", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdTimestamp", createdTimestamp));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "playerId", playerId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<ListingDto>> returnType = new ParameterizedTypeReference<List<ListingDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get metadata for an issued dgood 
     * Get metadata for a dgood id.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param gameInventoryId  (optional)
     * @param dgoodId  (optional, default to -1l)
     * @return List&lt;DgoodMetadataDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DgoodMetadataDto> getMetadata(String environmentId, String gameInventoryId, Long dgoodId) throws RestClientException {
        return getMetadataWithHttpInfo(environmentId, gameInventoryId, dgoodId).getBody();
    }

    /**
     * Get metadata for an issued dgood 
     * Get metadata for a dgood id.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param gameInventoryId  (optional)
     * @param dgoodId  (optional, default to -1l)
     * @return ResponseEntity&lt;List&lt;DgoodMetadataDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DgoodMetadataDto>> getMetadataWithHttpInfo(String environmentId, String gameInventoryId, Long dgoodId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/issued/metadata", uriVariables);

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

        ParameterizedTypeReference<List<DgoodMetadataDto>> returnType = new ParameterizedTypeReference<List<DgoodMetadataDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get bought/sold items
     * Get all bought/sold items for a player
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param pageSize  (optional, default to 30)
     * @param createdTimestamp  (optional, default to -1l)
     * @param order  (optional, default to DESCENDING)
     * @param buyerPlayerId  (optional)
     * @param sellerPlayerId  (optional)
     * @return List&lt;SoldItemDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SoldItemDto> getSoldItems(String environmentId, Integer pageSize, Long createdTimestamp, String order, String buyerPlayerId, String sellerPlayerId) throws RestClientException {
        return getSoldItemsWithHttpInfo(environmentId, pageSize, createdTimestamp, order, buyerPlayerId, sellerPlayerId).getBody();
    }

    /**
     * Get bought/sold items
     * Get all bought/sold items for a player
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param pageSize  (optional, default to 30)
     * @param createdTimestamp  (optional, default to -1l)
     * @param order  (optional, default to DESCENDING)
     * @param buyerPlayerId  (optional)
     * @param sellerPlayerId  (optional)
     * @return ResponseEntity&lt;List&lt;SoldItemDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SoldItemDto>> getSoldItemsWithHttpInfo(String environmentId, Integer pageSize, Long createdTimestamp, String order, String buyerPlayerId, String sellerPlayerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getSoldItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/buy", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdTimestamp", createdTimestamp));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "buyerPlayerId", buyerPlayerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sellerPlayerId", sellerPlayerId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<SoldItemDto>> returnType = new ParameterizedTypeReference<List<SoldItemDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Issue item
     * Issue instance(s) of an item type to a player
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param issueItemRequest  (required)
     * @return IssuedItemDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssuedItemDto issueItem(String environmentId, IssueItemRequest issueItemRequest) throws RestClientException {
        return issueItemWithHttpInfo(environmentId, issueItemRequest).getBody();
    }

    /**
     * Issue item
     * Issue instance(s) of an item type to a player
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param issueItemRequest  (required)
     * @return ResponseEntity&lt;IssuedItemDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IssuedItemDto> issueItemWithHttpInfo(String environmentId, IssueItemRequest issueItemRequest) throws RestClientException {
        Object postBody = issueItemRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling issueItem");
        }
        
        // verify the required parameter 'issueItemRequest' is set
        if (issueItemRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueItemRequest' when calling issueItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/issued", uriVariables);

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

        ParameterizedTypeReference<IssuedItemDto> returnType = new ParameterizedTypeReference<IssuedItemDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * List an item for sale
     * List an issued item for sale
     * <p><b>400</b> - Bad Request
     * <p><b>202</b> - The request was accepted. Expect a response via configured webhook. Response will contain this transactionId.
     * @param environmentId  (required)
     * @param listSaleRequest  (required)
     * @return ListingDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListingDto listItem(String environmentId, ListSaleRequest listSaleRequest) throws RestClientException {
        return listItemWithHttpInfo(environmentId, listSaleRequest).getBody();
    }

    /**
     * List an item for sale
     * List an issued item for sale
     * <p><b>400</b> - Bad Request
     * <p><b>202</b> - The request was accepted. Expect a response via configured webhook. Response will contain this transactionId.
     * @param environmentId  (required)
     * @param listSaleRequest  (required)
     * @return ResponseEntity&lt;ListingDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListingDto> listItemWithHttpInfo(String environmentId, ListSaleRequest listSaleRequest) throws RestClientException {
        Object postBody = listSaleRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling listItem");
        }
        
        // verify the required parameter 'listSaleRequest' is set
        if (listSaleRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listSaleRequest' when calling listItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/listed", uriVariables);

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

        ParameterizedTypeReference<ListingDto> returnType = new ParameterizedTypeReference<ListingDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Transfer issued item
     * Transfer an issued item
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param transferItemRequest  (required)
     * @return ItemActionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ItemActionDto transferItem(String environmentId, TransferItemRequest transferItemRequest) throws RestClientException {
        return transferItemWithHttpInfo(environmentId, transferItemRequest).getBody();
    }

    /**
     * Transfer issued item
     * Transfer an issued item
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param transferItemRequest  (required)
     * @return ResponseEntity&lt;ItemActionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ItemActionDto> transferItemWithHttpInfo(String environmentId, TransferItemRequest transferItemRequest) throws RestClientException {
        Object postBody = transferItemRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling transferItem");
        }
        
        // verify the required parameter 'transferItemRequest' is set
        if (transferItemRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transferItemRequest' when calling transferItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/transfer", uriVariables);

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

        ParameterizedTypeReference<ItemActionDto> returnType = new ParameterizedTypeReference<ItemActionDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update metadata for a dgood
     * Update metadata for a dgood
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updateMetadataRequest  (required)
     * @return DgoodMetadataDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DgoodMetadataDto updateMetadata(String environmentId, UpdateMetadataRequest updateMetadataRequest) throws RestClientException {
        return updateMetadataWithHttpInfo(environmentId, updateMetadataRequest).getBody();
    }

    /**
     * Update metadata for a dgood
     * Update metadata for a dgood
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param environmentId  (required)
     * @param updateMetadataRequest  (required)
     * @return ResponseEntity&lt;DgoodMetadataDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DgoodMetadataDto> updateMetadataWithHttpInfo(String environmentId, UpdateMetadataRequest updateMetadataRequest) throws RestClientException {
        Object postBody = updateMetadataRequest;
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling updateMetadata");
        }
        
        // verify the required parameter 'updateMetadataRequest' is set
        if (updateMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateMetadataRequest' when calling updateMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = apiClient.expandPath("/environments/{environmentId}/items/issued/metadata", uriVariables);

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

        ParameterizedTypeReference<DgoodMetadataDto> returnType = new ParameterizedTypeReference<DgoodMetadataDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
