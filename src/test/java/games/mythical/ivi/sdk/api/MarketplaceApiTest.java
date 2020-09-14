/*
 * IVI Engine
 * IVI Engine
 *
 * The version of the OpenAPI document: unspecified
 * Contact: developer@mythical.games
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.model.MarketplaceItemDto;
import games.mythical.ivi.sdk.model.MarketplaceListingDto;
import games.mythical.ivi.sdk.model.SearchResponse;
import games.mythical.ivi.sdk.model.TransactionDto;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketplaceApi
 */
@Ignore
public class MarketplaceApiTest {

    private final MarketplaceApi api = new MarketplaceApi();

    
    /**
     * Get all items of an environment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllListingsTest() throws ApiException {
        String environmentId = null;
        Integer pageSize = null;
        Long createdTimestamp = null;
        String order = null;
        List<MarketplaceListingDto> response = api.getAllListings(environmentId, pageSize, createdTimestamp, order);

        // TODO: test validations
    }
    
    /**
     * Get the history of an item by DGood ID or Game ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemHistoryTest() throws ApiException {
        String environmentId = null;
        String gameInventoryId = null;
        Long dgoodId = null;
        List<TransactionDto> response = api.getItemHistory(environmentId, gameInventoryId, dgoodId);

        // TODO: test validations
    }
    
    /**
     * Get all information for the listing with the given id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListingTest() throws ApiException {
        String environmentId = null;
        String listingId = null;
        MarketplaceListingDto response = api.getListing(environmentId, listingId);

        // TODO: test validations
    }
    
    /**
     * Get all items owned by the logged in user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketplaceItemsTest() throws ApiException {
        String environmentId = null;
        UUID mythicalId = null;
        String playerId = null;
        List<MarketplaceItemDto> response = api.getMarketplaceItems(environmentId, mythicalId, playerId);

        // TODO: test validations
    }
    
    /**
     * Search items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchItemsTest() throws ApiException {
        String environmentId = null;
        String query = null;
        Boolean filters = null;
        String artists = null;
        String rarity = null;
        String levels = null;
        String category = null;
        String tokenName = null;
        String price = null;
        String status = null;
        Integer pageSize = null;
        Integer pageNum = null;
        SearchResponse response = api.searchItems(environmentId, query, filters, artists, rarity, levels, category, tokenName, price, status, pageSize, pageNum);

        // TODO: test validations
    }
    
}
