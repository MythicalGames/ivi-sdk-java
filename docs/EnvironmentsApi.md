# EnvironmentsApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentInstance**](EnvironmentsApi.md#getEnvironmentInstance) | **GET** /environments/{environmentId} | Get title environment instance
[**setEnvironmentInstanceActive**](EnvironmentsApi.md#setEnvironmentInstanceActive) | **PUT** /environments/{environmentId}/activate | Set environment to activated
[**setEnvironmentInstanceInactive**](EnvironmentsApi.md#setEnvironmentInstanceInactive) | **PUT** /environments/{environmentId}/deactivate | Set environment to deactivated
[**updateEnvironmentInstanceName**](EnvironmentsApi.md#updateEnvironmentInstanceName) | **PUT** /environments/{environmentId} | Update instance display name for title



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
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## setEnvironmentInstanceActive

> setEnvironmentInstanceActive(environmentId)

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
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Environment state updated. |  -  |


## setEnvironmentInstanceInactive

> setEnvironmentInstanceInactive(environmentId)

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
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Environment state updated. |  -  |


## updateEnvironmentInstanceName

> updateEnvironmentInstanceName(environmentId, createEnvironmentInstanceRequest)

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
        defaultClient.setBasePath("http://localhost:8081/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: spring_oauth
        OAuth spring_oauth = (OAuth) defaultClient.getAuthentication("spring_oauth");
        spring_oauth.setAccessToken("YOUR ACCESS TOKEN");

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Environment name updated. |  -  |

