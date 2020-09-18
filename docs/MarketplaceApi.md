# MarketplaceApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllListings**](MarketplaceApi.md#getAllListings) | **GET** /marketplace/environments/{environmentId}/items/listed | Get all items of an environment
[**getItemHistory**](MarketplaceApi.md#getItemHistory) | **GET** /marketplace/environments/{environmentId}/items/issued/history | Get the history of an item by DGood ID or Game ID
[**getListing**](MarketplaceApi.md#getListing) | **GET** /marketplace/environments/{environmentId}/items/listed/{listingId} | Get all information for the listing with the given id
[**getMarketplaceItems**](MarketplaceApi.md#getMarketplaceItems) | **GET** /marketplace/environments/{environmentId}/items/issued | Get all items owned by the logged in user.
[**searchItems**](MarketplaceApi.md#searchItems) | **GET** /marketplace/environments/{environmentId}/items/search | Search items



## getAllListings

> List&lt;MarketplaceListingDto&gt; getAllListings(environmentId, pageSize, createdTimestamp, order)

Get all items of an environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.MarketplaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        MarketplaceApi apiInstance = new MarketplaceApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        Integer pageSize = 30; // Integer | 
        Long createdTimestamp = -1lL; // Long | 
        String order = "DESCENDING"; // String | 
        try {
            List<MarketplaceListingDto> result = apiInstance.getAllListings(environmentId, pageSize, createdTimestamp, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceApi#getAllListings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentId** | **String**|  |
 **pageSize** | **Integer**|  | [optional] [default to 30]
 **createdTimestamp** | **Long**|  | [optional] [default to -1l]
 **order** | **String**|  | [optional] [default to DESCENDING] [enum: ASCENDING, DESCENDING, UNRECOGNIZED]

### Return type

[**List&lt;MarketplaceListingDto&gt;**](MarketplaceListingDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getItemHistory

> List&lt;TransactionDto&gt; getItemHistory(environmentId, gameInventoryId, dgoodId)

Get the history of an item by DGood ID or Game ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.MarketplaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        MarketplaceApi apiInstance = new MarketplaceApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String gameInventoryId = "gameInventoryId_example"; // String | 
        Long dgoodId = -1lL; // Long | 
        try {
            List<TransactionDto> result = apiInstance.getItemHistory(environmentId, gameInventoryId, dgoodId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceApi#getItemHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentId** | **String**|  |
 **gameInventoryId** | **String**|  | [optional]
 **dgoodId** | **Long**|  | [optional] [default to -1l]

### Return type

[**List&lt;TransactionDto&gt;**](TransactionDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getListing

> MarketplaceListingDto getListing(environmentId, listingId)

Get all information for the listing with the given id

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.MarketplaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        MarketplaceApi apiInstance = new MarketplaceApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String listingId = "listingId_example"; // String | 
        try {
            MarketplaceListingDto result = apiInstance.getListing(environmentId, listingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceApi#getListing");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentId** | **String**|  |
 **listingId** | **String**|  |

### Return type

[**MarketplaceListingDto**](MarketplaceListingDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getMarketplaceItems

> List&lt;MarketplaceItemDto&gt; getMarketplaceItems(environmentId, mythicalId, playerId)

Get all items owned by the logged in user.

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.MarketplaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        MarketplaceApi apiInstance = new MarketplaceApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        UUID mythicalId = new UUID(); // UUID | 
        String playerId = "playerId_example"; // String | 
        try {
            List<MarketplaceItemDto> result = apiInstance.getMarketplaceItems(environmentId, mythicalId, playerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceApi#getMarketplaceItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentId** | **String**|  |
 **mythicalId** | [**UUID**](.md)|  | [optional]
 **playerId** | **String**|  | [optional]

### Return type

[**List&lt;MarketplaceItemDto&gt;**](MarketplaceItemDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## searchItems

> SearchResponse searchItems(environmentId, query, filters, artists, rarity, levels, category, tokenName, price, status, pageSize, pageNum)

Search items

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.MarketplaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        MarketplaceApi apiInstance = new MarketplaceApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String query = "query_example"; // String | 
        Boolean filters = true; // Boolean | 
        String artists = "artists_example"; // String | 
        String rarity = "rarity_example"; // String | 
        String levels = "levels_example"; // String | 
        String category = "category_example"; // String | 
        String tokenName = "tokenName_example"; // String | 
        String price = "price_example"; // String | 
        String status = "status_example"; // String | 
        Integer pageSize = 30; // Integer | 
        Integer pageNum = 0; // Integer | 
        try {
            SearchResponse result = apiInstance.searchItems(environmentId, query, filters, artists, rarity, levels, category, tokenName, price, status, pageSize, pageNum);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceApi#searchItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentId** | **String**|  |
 **query** | **String**|  | [optional]
 **filters** | **Boolean**|  | [optional]
 **artists** | **String**|  | [optional]
 **rarity** | **String**|  | [optional]
 **levels** | **String**|  | [optional]
 **category** | **String**|  | [optional]
 **tokenName** | **String**|  | [optional]
 **price** | **String**|  | [optional]
 **status** | **String**|  | [optional]
 **pageSize** | **Integer**|  | [optional] [default to 30]
 **pageNum** | **Integer**|  | [optional] [default to 0]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

