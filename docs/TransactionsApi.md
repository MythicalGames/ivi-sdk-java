# TransactionsApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllTitleTransactions**](TransactionsApi.md#getAllTitleTransactions) | **GET** /environments/{environmentId}/transactions | Get all transaction events for an environment.
[**getTransactionEventsForTitle**](TransactionsApi.md#getTransactionEventsForTitle) | **GET** /environments/{environmentId}/transactions/{transactionId} | Get transaction events for transaction ID in an environment.


<a name="getAllTitleTransactions"></a>
# **getAllTitleTransactions**
> List&lt;TransactionEventDTO&gt; getAllTitleTransactions(environmentId, from, to, cursor)

Get all transaction events for an environment.

Get all transaction events for an environment with an optional time period specified.

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TransactionsApi;

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

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String from = "from_example"; // String | 
    String to = "to_example"; // String | 
    String cursor = "cursor_example"; // String | 
    try {
      List<TransactionEventDTO> result = apiInstance.getAllTitleTransactions(environmentId, from, to, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getAllTitleTransactions");
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
 **from** | **String**|  | [optional]
 **to** | **String**|  | [optional]
 **cursor** | **String**|  | [optional]

### Return type

[**List&lt;TransactionEventDTO&gt;**](TransactionEventDTO.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getTransactionEventsForTitle"></a>
# **getTransactionEventsForTitle**
> List&lt;TransactionEventDTO&gt; getTransactionEventsForTitle(environmentId, transactionId, cursor)

Get transaction events for transaction ID in an environment.

Get transaction events for transaction ID in an environment.

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TransactionsApi;

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

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String transactionId = "transactionId_example"; // String | 
    String cursor = "cursor_example"; // String | 
    try {
      List<TransactionEventDTO> result = apiInstance.getTransactionEventsForTitle(environmentId, transactionId, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionEventsForTitle");
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
 **transactionId** | **String**|  |
 **cursor** | **String**|  | [optional]

### Return type

[**List&lt;TransactionEventDTO&gt;**](TransactionEventDTO.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

