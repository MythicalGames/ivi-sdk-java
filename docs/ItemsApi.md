# ItemsApi

All URIs are relative to *https://api.iviengine.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**burnItem**](ItemsApi.md#burnItem) | **POST** /environments/{environmentId}/items/burn | Burn issued item
[**buyListing**](ItemsApi.md#buyListing) | **POST** /environments/{environmentId}/items/buy | Purchase an item
[**closeSale**](ItemsApi.md#closeSale) | **PUT** /environments/{environmentId}/items/listed | Close a sale
[**createItem**](ItemsApi.md#createItem) | **POST** /environments/{environmentId}/items/types | Create item type
[**getIssuedItems**](ItemsApi.md#getIssuedItems) | **GET** /environments/{environmentId}/items/issued | Get all issued items for an environment.
[**getItemTypes**](ItemsApi.md#getItemTypes) | **GET** /environments/{environmentId}/items/types | Get all item types for an environment
[**getListings**](ItemsApi.md#getListings) | **GET** /environments/{environmentId}/items/listed | Get listed items
[**getMetadata**](ItemsApi.md#getMetadata) | **GET** /environments/{environmentId}/items/issued/metadata | Get metadata for an issued dgood 
[**getSoldItems**](ItemsApi.md#getSoldItems) | **GET** /environments/{environmentId}/items/buy | Get bought/sold items
[**issueItem**](ItemsApi.md#issueItem) | **POST** /environments/{environmentId}/items/issued | Issue item
[**listItem**](ItemsApi.md#listItem) | **POST** /environments/{environmentId}/items/listed | List an item for sale
[**transferItem**](ItemsApi.md#transferItem) | **POST** /environments/{environmentId}/items/transfer | Transfer issued item
[**updateMetadata**](ItemsApi.md#updateMetadata) | **PUT** /environments/{environmentId}/items/issued/metadata | Update metadata for a dgood



## burnItem

> ItemActionDto burnItem(environmentId, burnItemRequest)

Burn issued item

Burn an issued item

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        BurnItemRequest burnItemRequest = new BurnItemRequest(); // BurnItemRequest | 
        try {
            ItemActionDto result = apiInstance.burnItem(environmentId, burnItemRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#burnItem");
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
 **burnItemRequest** | [**BurnItemRequest**](BurnItemRequest.md)|  |

### Return type

[**ItemActionDto**](ItemActionDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## buyListing

> SoldItemDto buyListing(environmentId, buyListingRequest)

Purchase an item

Buy an item that is for sale

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        BuyListingRequest buyListingRequest = new BuyListingRequest(); // BuyListingRequest | 
        try {
            SoldItemDto result = apiInstance.buyListing(environmentId, buyListingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#buyListing");
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
 **buyListingRequest** | [**BuyListingRequest**](BuyListingRequest.md)|  |

### Return type

[**SoldItemDto**](SoldItemDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## closeSale

> ItemActionDto closeSale(environmentId, closeSaleRequest)

Close a sale

Close a listed item sale

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        CloseSaleRequest closeSaleRequest = new CloseSaleRequest(); // CloseSaleRequest | 
        try {
            ItemActionDto result = apiInstance.closeSale(environmentId, closeSaleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#closeSale");
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
 **closeSaleRequest** | [**CloseSaleRequest**](CloseSaleRequest.md)|  |

### Return type

[**ItemActionDto**](ItemActionDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **202** | The request was accepted. Expect a response via configured webhook. Response will contain this transactionId. |  -  |


## createItem

> ItemTypeDto createItem(environmentId, createItemRequest)

Create item type

Create a new type of item on the blockchain that can be issued to players.

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        CreateItemRequest createItemRequest = new CreateItemRequest(); // CreateItemRequest | 
        try {
            ItemTypeDto result = apiInstance.createItem(environmentId, createItemRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#createItem");
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
 **createItemRequest** | [**CreateItemRequest**](CreateItemRequest.md)|  |

### Return type

[**ItemTypeDto**](ItemTypeDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getIssuedItems

> List&lt;IssuedItemDto&gt; getIssuedItems(environmentId, playerId, gameInventoryId, dgoodId)

Get all issued items for an environment.

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String playerId = "playerId_example"; // String | 
        String gameInventoryId = "gameInventoryId_example"; // String | 
        Long dgoodId = -1lL; // Long | 
        try {
            List<IssuedItemDto> result = apiInstance.getIssuedItems(environmentId, playerId, gameInventoryId, dgoodId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getIssuedItems");
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
 **playerId** | **String**|  | [optional]
 **gameInventoryId** | **String**|  | [optional]
 **dgoodId** | **Long**|  | [optional] [default to -1l]

### Return type

[**List&lt;IssuedItemDto&gt;**](IssuedItemDto.md)

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


## getItemTypes

> List&lt;ItemTypeDto&gt; getItemTypes(environmentId, category, token)

Get all item types for an environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String category = "category_example"; // String | 
        String token = "token_example"; // String | 
        try {
            List<ItemTypeDto> result = apiInstance.getItemTypes(environmentId, category, token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItemTypes");
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
 **category** | **String**|  | [optional]
 **token** | **String**|  | [optional]

### Return type

[**List&lt;ItemTypeDto&gt;**](ItemTypeDto.md)

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


## getListings

> List&lt;ListingDto&gt; getListings(environmentId, pageSize, createdTimestamp, order, playerId)

Get listed items

Get all listed item for sale

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        Integer pageSize = 30; // Integer | 
        Long createdTimestamp = -1lL; // Long | 
        String order = "DESCENDING"; // String | 
        String playerId = "playerId_example"; // String | 
        try {
            List<ListingDto> result = apiInstance.getListings(environmentId, pageSize, createdTimestamp, order, playerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getListings");
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
 **playerId** | **String**|  | [optional]

### Return type

[**List&lt;ListingDto&gt;**](ListingDto.md)

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


## getMetadata

> List&lt;DgoodMetadataDto&gt; getMetadata(environmentId, gameInventoryId, dgoodId)

Get metadata for an issued dgood 

Get metadata for a dgood id.

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String gameInventoryId = "gameInventoryId_example"; // String | 
        Long dgoodId = -1lL; // Long | 
        try {
            List<DgoodMetadataDto> result = apiInstance.getMetadata(environmentId, gameInventoryId, dgoodId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getMetadata");
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

[**List&lt;DgoodMetadataDto&gt;**](DgoodMetadataDto.md)

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


## getSoldItems

> List&lt;SoldItemDto&gt; getSoldItems(environmentId, pageSize, createdTimestamp, order, buyerPlayerId, sellerPlayerId)

Get bought/sold items

Get all bought/sold items for a player

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        Integer pageSize = 30; // Integer | 
        Long createdTimestamp = -1lL; // Long | 
        String order = "DESCENDING"; // String | 
        String buyerPlayerId = "buyerPlayerId_example"; // String | 
        String sellerPlayerId = "sellerPlayerId_example"; // String | 
        try {
            List<SoldItemDto> result = apiInstance.getSoldItems(environmentId, pageSize, createdTimestamp, order, buyerPlayerId, sellerPlayerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getSoldItems");
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
 **buyerPlayerId** | **String**|  | [optional]
 **sellerPlayerId** | **String**|  | [optional]

### Return type

[**List&lt;SoldItemDto&gt;**](SoldItemDto.md)

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


## issueItem

> IssuedItemDto issueItem(environmentId, issueItemRequest)

Issue item

Issue instance(s) of an item type to a player

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        IssueItemRequest issueItemRequest = new IssueItemRequest(); // IssueItemRequest | 
        try {
            IssuedItemDto result = apiInstance.issueItem(environmentId, issueItemRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#issueItem");
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
 **issueItemRequest** | [**IssueItemRequest**](IssueItemRequest.md)|  |

### Return type

[**IssuedItemDto**](IssuedItemDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## listItem

> ListingDto listItem(environmentId, listSaleRequest)

List an item for sale

List an issued item for sale

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        ListSaleRequest listSaleRequest = new ListSaleRequest(); // ListSaleRequest | 
        try {
            ListingDto result = apiInstance.listItem(environmentId, listSaleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#listItem");
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
 **listSaleRequest** | [**ListSaleRequest**](ListSaleRequest.md)|  |

### Return type

[**ListingDto**](ListingDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **202** | The request was accepted. Expect a response via configured webhook. Response will contain this transactionId. |  -  |


## transferItem

> ItemActionDto transferItem(environmentId, transferItemRequest)

Transfer issued item

Transfer an issued item

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        TransferItemRequest transferItemRequest = new TransferItemRequest(); // TransferItemRequest | 
        try {
            ItemActionDto result = apiInstance.transferItem(environmentId, transferItemRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#transferItem");
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
 **transferItemRequest** | [**TransferItemRequest**](TransferItemRequest.md)|  |

### Return type

[**ItemActionDto**](ItemActionDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## updateMetadata

> DgoodMetadataDto updateMetadata(environmentId, updateMetadataRequest)

Update metadata for a dgood

Update metadata for a dgood

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        UpdateMetadataRequest updateMetadataRequest = new UpdateMetadataRequest(); // UpdateMetadataRequest | 
        try {
            DgoodMetadataDto result = apiInstance.updateMetadata(environmentId, updateMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#updateMetadata");
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
 **updateMetadataRequest** | [**UpdateMetadataRequest**](UpdateMetadataRequest.md)|  |

### Return type

[**DgoodMetadataDto**](DgoodMetadataDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

