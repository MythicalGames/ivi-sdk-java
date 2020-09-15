# VirtualCurrenciesApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSupportedCurrencyForEnvironment**](VirtualCurrenciesApi.md#addSupportedCurrencyForEnvironment) | **POST** /environments/{environmentId}/currencies | Add new virtual currency to environment
[**deleteSupportedCurrencyByAbbreviation**](VirtualCurrenciesApi.md#deleteSupportedCurrencyByAbbreviation) | **DELETE** /environments/{environmentId}/currencies/{abbreviation} | Delete virtual currency for environment by abbreviation
[**getSupportedCurrencyByAbbreviation**](VirtualCurrenciesApi.md#getSupportedCurrencyByAbbreviation) | **GET** /environments/{environmentId}/currencies/{abbreviation} | Get virtual currency for environment by abbreviation
[**getSupportedCurrencyForEnvironment**](VirtualCurrenciesApi.md#getSupportedCurrencyForEnvironment) | **GET** /environments/{environmentId}/currencies | Get virtual currencies defined for environment



## addSupportedCurrencyForEnvironment

> VirtualCurrencyDto addSupportedCurrencyForEnvironment(environmentId, createVirtualCurrencyRequest)

Add new virtual currency to environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

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

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        CreateVirtualCurrencyRequest createVirtualCurrencyRequest = new CreateVirtualCurrencyRequest(); // CreateVirtualCurrencyRequest | 
        try {
            VirtualCurrencyDto result = apiInstance.addSupportedCurrencyForEnvironment(environmentId, createVirtualCurrencyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#addSupportedCurrencyForEnvironment");
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
 **createVirtualCurrencyRequest** | [**CreateVirtualCurrencyRequest**](CreateVirtualCurrencyRequest.md)|  |

### Return type

[**VirtualCurrencyDto**](VirtualCurrencyDto.md)

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


## deleteSupportedCurrencyByAbbreviation

> deleteSupportedCurrencyByAbbreviation(environmentId, abbreviation)

Delete virtual currency for environment by abbreviation

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

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

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String abbreviation = "abbreviation_example"; // String | 
        try {
            apiInstance.deleteSupportedCurrencyByAbbreviation(environmentId, abbreviation);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#deleteSupportedCurrencyByAbbreviation");
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
 **abbreviation** | **String**|  |

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
| **204** | Currency deleted successfully. |  -  |


## getSupportedCurrencyByAbbreviation

> VirtualCurrencyDto getSupportedCurrencyByAbbreviation(environmentId, abbreviation)

Get virtual currency for environment by abbreviation

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

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

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String abbreviation = "abbreviation_example"; // String | 
        try {
            VirtualCurrencyDto result = apiInstance.getSupportedCurrencyByAbbreviation(environmentId, abbreviation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#getSupportedCurrencyByAbbreviation");
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
 **abbreviation** | **String**|  |

### Return type

[**VirtualCurrencyDto**](VirtualCurrencyDto.md)

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


## getSupportedCurrencyForEnvironment

> List&lt;VirtualCurrencyDto&gt; getSupportedCurrencyForEnvironment(environmentId)

Get virtual currencies defined for environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

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

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            List<VirtualCurrencyDto> result = apiInstance.getSupportedCurrencyForEnvironment(environmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#getSupportedCurrencyForEnvironment");
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

### Return type

[**List&lt;VirtualCurrencyDto&gt;**](VirtualCurrencyDto.md)

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

