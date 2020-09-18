# VirtualCurrenciesApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSupportedCurrencyForEnvironment**](VirtualCurrenciesApi.md#addSupportedCurrencyForEnvironment) | **POST** /environments/{environmentId}/currencies | Add new virtual currency to environment
[**addSupportedCurrencyForEnvironmentWithHttpInfo**](VirtualCurrenciesApi.md#addSupportedCurrencyForEnvironmentWithHttpInfo) | **POST** /environments/{environmentId}/currencies | Add new virtual currency to environment
[**deleteSupportedCurrencyByAbbreviation**](VirtualCurrenciesApi.md#deleteSupportedCurrencyByAbbreviation) | **DELETE** /environments/{environmentId}/currencies/{abbreviation} | Delete virtual currency for environment by abbreviation
[**deleteSupportedCurrencyByAbbreviationWithHttpInfo**](VirtualCurrenciesApi.md#deleteSupportedCurrencyByAbbreviationWithHttpInfo) | **DELETE** /environments/{environmentId}/currencies/{abbreviation} | Delete virtual currency for environment by abbreviation
[**getSupportedCurrencyByAbbreviation**](VirtualCurrenciesApi.md#getSupportedCurrencyByAbbreviation) | **GET** /environments/{environmentId}/currencies/{abbreviation} | Get virtual currency for environment by abbreviation
[**getSupportedCurrencyByAbbreviationWithHttpInfo**](VirtualCurrenciesApi.md#getSupportedCurrencyByAbbreviationWithHttpInfo) | **GET** /environments/{environmentId}/currencies/{abbreviation} | Get virtual currency for environment by abbreviation
[**getSupportedCurrencyForEnvironment**](VirtualCurrenciesApi.md#getSupportedCurrencyForEnvironment) | **GET** /environments/{environmentId}/currencies | Get virtual currencies defined for environment
[**getSupportedCurrencyForEnvironmentWithHttpInfo**](VirtualCurrenciesApi.md#getSupportedCurrencyForEnvironmentWithHttpInfo) | **GET** /environments/{environmentId}/currencies | Get virtual currencies defined for environment



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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

## addSupportedCurrencyForEnvironmentWithHttpInfo

> ApiResponse<VirtualCurrencyDto> addSupportedCurrencyForEnvironment addSupportedCurrencyForEnvironmentWithHttpInfo(environmentId, createVirtualCurrencyRequest)

Add new virtual currency to environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        CreateVirtualCurrencyRequest createVirtualCurrencyRequest = new CreateVirtualCurrencyRequest(); // CreateVirtualCurrencyRequest | 
        try {
            ApiResponse<VirtualCurrencyDto> response = apiInstance.addSupportedCurrencyForEnvironmentWithHttpInfo(environmentId, createVirtualCurrencyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#addSupportedCurrencyForEnvironment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**VirtualCurrencyDto**](VirtualCurrencyDto.md)>


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


## deleteSupportedCurrencyByAbbreviation

> void deleteSupportedCurrencyByAbbreviation(environmentId, abbreviation)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Currency deleted successfully. |  -  |

## deleteSupportedCurrencyByAbbreviationWithHttpInfo

> ApiResponse<Void> deleteSupportedCurrencyByAbbreviation deleteSupportedCurrencyByAbbreviationWithHttpInfo(environmentId, abbreviation)

Delete virtual currency for environment by abbreviation

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String abbreviation = "abbreviation_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.deleteSupportedCurrencyByAbbreviationWithHttpInfo(environmentId, abbreviation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#deleteSupportedCurrencyByAbbreviation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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


ApiResponse<Void>

### Authorization

[api_key](../README.md#api_key)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

## getSupportedCurrencyByAbbreviationWithHttpInfo

> ApiResponse<VirtualCurrencyDto> getSupportedCurrencyByAbbreviation getSupportedCurrencyByAbbreviationWithHttpInfo(environmentId, abbreviation)

Get virtual currency for environment by abbreviation

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String abbreviation = "abbreviation_example"; // String | 
        try {
            ApiResponse<VirtualCurrencyDto> response = apiInstance.getSupportedCurrencyByAbbreviationWithHttpInfo(environmentId, abbreviation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#getSupportedCurrencyByAbbreviation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**VirtualCurrencyDto**](VirtualCurrencyDto.md)>


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


## getSupportedCurrencyForEnvironment

> List<VirtualCurrencyDto> getSupportedCurrencyForEnvironment(environmentId)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

## getSupportedCurrencyForEnvironmentWithHttpInfo

> ApiResponse<List<VirtualCurrencyDto>> getSupportedCurrencyForEnvironment getSupportedCurrencyForEnvironmentWithHttpInfo(environmentId)

Get virtual currencies defined for environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.VirtualCurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        VirtualCurrenciesApi apiInstance = new VirtualCurrenciesApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            ApiResponse<List<VirtualCurrencyDto>> response = apiInstance.getSupportedCurrencyForEnvironmentWithHttpInfo(environmentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCurrenciesApi#getSupportedCurrencyForEnvironment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**List&lt;VirtualCurrencyDto&gt;**](VirtualCurrencyDto.md)>


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

