# OrdersApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrder**](OrdersApi.md#createOrder) | **POST** /environments/{environmentId}/orders | Create Order
[**deleteOrder**](OrdersApi.md#deleteOrder) | **DELETE** /environments/{environmentId}/orders/{orderId} | Delete Order
[**getOrder**](OrdersApi.md#getOrder) | **GET** /environments/{environmentId}/orders | Get Order
[**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /environments/{environmentId}/orders | Update Order



## createOrder

> OrderDto createOrder(environmentId, createOrderRequest)

Create Order

Create New Order

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 
        try {
            OrderDto result = apiInstance.createOrder(environmentId, createOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#createOrder");
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
 **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  |

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## deleteOrder

> deleteOrder(environmentId, orderId)

Delete Order

Delete an existing Order

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String orderId = "orderId_example"; // String | 
        try {
            apiInstance.deleteOrder(environmentId, orderId);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#deleteOrder");
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
 **orderId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Order deleted |  -  |


## getOrder

> OrderDto getOrder(environmentId, orderId)

Get Order

Find an Order

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String orderId = "orderId_example"; // String | 
        try {
            OrderDto result = apiInstance.getOrder(environmentId, orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#getOrder");
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
 **orderId** | **String**|  |

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## updateOrder

> OrderDto updateOrder(environmentId, updateOrderRequest)

Update Order

Update fields on an existing Order

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        UpdateOrderRequest updateOrderRequest = new UpdateOrderRequest(); // UpdateOrderRequest | 
        try {
            OrderDto result = apiInstance.updateOrder(environmentId, updateOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#updateOrder");
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
 **updateOrderRequest** | [**UpdateOrderRequest**](UpdateOrderRequest.md)|  |

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

