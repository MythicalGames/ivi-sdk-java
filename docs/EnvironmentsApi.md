# EnvironmentsApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentInstance**](EnvironmentsApi.md#getEnvironmentInstance) | **GET** /environments/{environmentId} | Get title environment instance
[**getEnvironmentInstanceWithHttpInfo**](EnvironmentsApi.md#getEnvironmentInstanceWithHttpInfo) | **GET** /environments/{environmentId} | Get title environment instance
[**setEnvironmentInstanceActive**](EnvironmentsApi.md#setEnvironmentInstanceActive) | **PUT** /environments/{environmentId}/activate | Set environment to activated
[**setEnvironmentInstanceActiveWithHttpInfo**](EnvironmentsApi.md#setEnvironmentInstanceActiveWithHttpInfo) | **PUT** /environments/{environmentId}/activate | Set environment to activated
[**setEnvironmentInstanceInactive**](EnvironmentsApi.md#setEnvironmentInstanceInactive) | **PUT** /environments/{environmentId}/deactivate | Set environment to deactivated
[**setEnvironmentInstanceInactiveWithHttpInfo**](EnvironmentsApi.md#setEnvironmentInstanceInactiveWithHttpInfo) | **PUT** /environments/{environmentId}/deactivate | Set environment to deactivated
[**updateEnvironmentInstanceName**](EnvironmentsApi.md#updateEnvironmentInstanceName) | **PUT** /environments/{environmentId} | Update instance display name for title
[**updateEnvironmentInstanceNameWithHttpInfo**](EnvironmentsApi.md#updateEnvironmentInstanceNameWithHttpInfo) | **PUT** /environments/{environmentId} | Update instance display name for title



## getEnvironmentInstance

> EnvironmentInstanceDto getEnvironmentInstance(environmentId)

Get title environment instance

Get environment instance details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            EnvironmentInstanceDto result = apiInstance.getEnvironmentInstance(environmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#getEnvironmentInstance");
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

[**EnvironmentInstanceDto**](EnvironmentInstanceDto.md)


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

## getEnvironmentInstanceWithHttpInfo

> ApiResponse<EnvironmentInstanceDto> getEnvironmentInstance getEnvironmentInstanceWithHttpInfo(environmentId)

Get title environment instance

Get environment instance details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            ApiResponse<EnvironmentInstanceDto> response = apiInstance.getEnvironmentInstanceWithHttpInfo(environmentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#getEnvironmentInstance");
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

ApiResponse<[**EnvironmentInstanceDto**](EnvironmentInstanceDto.md)>


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


## setEnvironmentInstanceActive

> void setEnvironmentInstanceActive(environmentId)

Set environment to activated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            apiInstance.setEnvironmentInstanceActive(environmentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#setEnvironmentInstanceActive");
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
| **204** | Environment state updated. |  -  |

## setEnvironmentInstanceActiveWithHttpInfo

> ApiResponse<Void> setEnvironmentInstanceActive setEnvironmentInstanceActiveWithHttpInfo(environmentId)

Set environment to activated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.setEnvironmentInstanceActiveWithHttpInfo(environmentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#setEnvironmentInstanceActive");
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
| **204** | Environment state updated. |  -  |


## setEnvironmentInstanceInactive

> void setEnvironmentInstanceInactive(environmentId)

Set environment to deactivated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            apiInstance.setEnvironmentInstanceInactive(environmentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#setEnvironmentInstanceInactive");
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
| **204** | Environment state updated. |  -  |

## setEnvironmentInstanceInactiveWithHttpInfo

> ApiResponse<Void> setEnvironmentInstanceInactive setEnvironmentInstanceInactiveWithHttpInfo(environmentId)

Set environment to deactivated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.setEnvironmentInstanceInactiveWithHttpInfo(environmentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#setEnvironmentInstanceInactive");
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
| **204** | Environment state updated. |  -  |


## updateEnvironmentInstanceName

> void updateEnvironmentInstanceName(environmentId, createEnvironmentInstanceRequest)

Update instance display name for title

Update environment instance display name for a title

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest = new CreateEnvironmentInstanceRequest(); // CreateEnvironmentInstanceRequest | 
        try {
            apiInstance.updateEnvironmentInstanceName(environmentId, createEnvironmentInstanceRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#updateEnvironmentInstanceName");
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
 **createEnvironmentInstanceRequest** | [**CreateEnvironmentInstanceRequest**](CreateEnvironmentInstanceRequest.md)|  |

### Return type


null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Environment name updated. |  -  |

## updateEnvironmentInstanceNameWithHttpInfo

> ApiResponse<Void> updateEnvironmentInstanceName updateEnvironmentInstanceNameWithHttpInfo(environmentId, createEnvironmentInstanceRequest)

Update instance display name for title

Update environment instance display name for a title

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.EnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest = new CreateEnvironmentInstanceRequest(); // CreateEnvironmentInstanceRequest | 
        try {
            ApiResponse<Void> response = apiInstance.updateEnvironmentInstanceNameWithHttpInfo(environmentId, createEnvironmentInstanceRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentsApi#updateEnvironmentInstanceName");
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
 **createEnvironmentInstanceRequest** | [**CreateEnvironmentInstanceRequest**](CreateEnvironmentInstanceRequest.md)|  |

### Return type


ApiResponse<Void>

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Environment name updated. |  -  |

