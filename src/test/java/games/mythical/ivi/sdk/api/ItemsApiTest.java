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

import games.mythical.ivi.sdk.ApiException;
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
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemsApi
 */
public class ItemsApiTest {

    private final ItemsApi api = new ItemsApi();

    /**
     * Burn issued item
     *
     * Burn an issued item
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void burnItemTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //BurnItemRequest burnItemRequest = null;
        //
        //ItemActionDto response = api.burnItem(environmentId, burnItemRequest);

        // TODO: test validations
    }
    /**
     * Purchase an item
     *
     * Buy an item that is for sale
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void buyListingTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //BuyListingRequest buyListingRequest = null;
        //
        //SoldItemDto response = api.buyListing(environmentId, buyListingRequest);

        // TODO: test validations
    }
    /**
     * Close a sale
     *
     * Close a listed item sale
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void closeSaleTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //CloseSaleRequest closeSaleRequest = null;
        //
        //ItemActionDto response = api.closeSale(environmentId, closeSaleRequest);

        // TODO: test validations
    }
    /**
     * Create item type
     *
     * Create a new type of item on the blockchain that can be issued to players.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createItemTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //CreateItemRequest createItemRequest = null;
        //
        //ItemTypeDto response = api.createItem(environmentId, createItemRequest);

        // TODO: test validations
    }
    /**
     * Get all issued items for an environment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssuedItemsTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String playerId = null;
        //
        //String gameInventoryId = null;
        //
        //Long dgoodId = null;
        //
        //List<IssuedItemDto> response = api.getIssuedItems(environmentId, playerId, gameInventoryId, dgoodId);

        // TODO: test validations
    }
    /**
     * Get all item types for an environment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemTypesTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String category = null;
        //
        //String token = null;
        //
        //List<ItemTypeDto> response = api.getItemTypes(environmentId, category, token);

        // TODO: test validations
    }
    /**
     * Get listed items
     *
     * Get all listed item for sale
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListingsTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //Integer pageSize = null;
        //
        //Long createdTimestamp = null;
        //
        //String order = null;
        //
        //String playerId = null;
        //
        //List<ListingDto> response = api.getListings(environmentId, pageSize, createdTimestamp, order, playerId);

        // TODO: test validations
    }
    /**
     * Get metadata for an issued dgood 
     *
     * Get metadata for a dgood id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetadataTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String gameInventoryId = null;
        //
        //Long dgoodId = null;
        //
        //List<DgoodMetadataDto> response = api.getMetadata(environmentId, gameInventoryId, dgoodId);

        // TODO: test validations
    }
    /**
     * Get bought/sold items
     *
     * Get all bought/sold items for a player
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSoldItemsTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //Integer pageSize = null;
        //
        //Long createdTimestamp = null;
        //
        //String order = null;
        //
        //String buyerPlayerId = null;
        //
        //String sellerPlayerId = null;
        //
        //List<SoldItemDto> response = api.getSoldItems(environmentId, pageSize, createdTimestamp, order, buyerPlayerId, sellerPlayerId);

        // TODO: test validations
    }
    /**
     * Issue item
     *
     * Issue instance(s) of an item type to a player
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueItemTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //IssueItemRequest issueItemRequest = null;
        //
        //IssuedItemDto response = api.issueItem(environmentId, issueItemRequest);

        // TODO: test validations
    }
    /**
     * List an item for sale
     *
     * List an issued item for sale
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listItemTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //ListSaleRequest listSaleRequest = null;
        //
        //ListingDto response = api.listItem(environmentId, listSaleRequest);

        // TODO: test validations
    }
    /**
     * Transfer issued item
     *
     * Transfer an issued item
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferItemTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //TransferItemRequest transferItemRequest = null;
        //
        //ItemActionDto response = api.transferItem(environmentId, transferItemRequest);

        // TODO: test validations
    }
    /**
     * Update metadata for a dgood
     *
     * Update metadata for a dgood
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMetadataTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //UpdateMetadataRequest updateMetadataRequest = null;
        //
        //DgoodMetadataDto response = api.updateMetadata(environmentId, updateMetadataRequest);

        // TODO: test validations
    }
}
