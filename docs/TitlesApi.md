# TitlesApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEnvironmentInstance**](TitlesApi.md#addEnvironmentInstance) | **POST** /titles/{titleId}/environments | Create environment instance for title
[**addEnvironmentInstanceWithHttpInfo**](TitlesApi.md#addEnvironmentInstanceWithHttpInfo) | **POST** /titles/{titleId}/environments | Create environment instance for title
[**getEnvironmentInstancesForTitle**](TitlesApi.md#getEnvironmentInstancesForTitle) | **GET** /titles/{titleId}/environments | Get environment instances for title
[**getEnvironmentInstancesForTitleWithHttpInfo**](TitlesApi.md#getEnvironmentInstancesForTitleWithHttpInfo) | **GET** /titles/{titleId}/environments | Get environment instances for title
[**getTitleById**](TitlesApi.md#getTitleById) | **GET** /titles/{titleId} | Get title
[**getTitleByIdWithHttpInfo**](TitlesApi.md#getTitleByIdWithHttpInfo) | **GET** /titles/{titleId} | Get title
[**setTitleActive**](TitlesApi.md#setTitleActive) | **PUT** /titles/{titleId}/activate | Set title to activated
[**setTitleActiveWithHttpInfo**](TitlesApi.md#setTitleActiveWithHttpInfo) | **PUT** /titles/{titleId}/activate | Set title to activated
[**setTitleInactive**](TitlesApi.md#setTitleInactive) | **PUT** /titles/{titleId}/deactivate | Set title to deactivated
[**setTitleInactiveWithHttpInfo**](TitlesApi.md#setTitleInactiveWithHttpInfo) | **PUT** /titles/{titleId}/deactivate | Set title to deactivated
[**updateTitle**](TitlesApi.md#updateTitle) | **PUT** /titles/{titleId} | Update title
[**updateTitleWithHttpInfo**](TitlesApi.md#updateTitleWithHttpInfo) | **PUT** /titles/{titleId} | Update title



## addEnvironmentInstance

> EnvironmentInstanceDto addEnvironmentInstance(titleId, createEnvironmentInstanceRequest)

Create environment instance for title

Create new environment instance for a title

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest = new CreateEnvironmentInstanceRequest(); // CreateEnvironmentInstanceRequest | 
        try {
            EnvironmentInstanceDto result = apiInstance.addEnvironmentInstance(titleId, createEnvironmentInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#addEnvironmentInstance");
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
 **titleId** | **String**|  |
 **createEnvironmentInstanceRequest** | [**CreateEnvironmentInstanceRequest**](CreateEnvironmentInstanceRequest.md)|  |

### Return type

[**EnvironmentInstanceDto**](EnvironmentInstanceDto.md)


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

## addEnvironmentInstanceWithHttpInfo

> ApiResponse<EnvironmentInstanceDto> addEnvironmentInstance addEnvironmentInstanceWithHttpInfo(titleId, createEnvironmentInstanceRequest)

Create environment instance for title

Create new environment instance for a title

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest = new CreateEnvironmentInstanceRequest(); // CreateEnvironmentInstanceRequest | 
        try {
            ApiResponse<EnvironmentInstanceDto> response = apiInstance.addEnvironmentInstanceWithHttpInfo(titleId, createEnvironmentInstanceRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#addEnvironmentInstance");
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
 **titleId** | **String**|  |
 **createEnvironmentInstanceRequest** | [**CreateEnvironmentInstanceRequest**](CreateEnvironmentInstanceRequest.md)|  |

### Return type

ApiResponse<[**EnvironmentInstanceDto**](EnvironmentInstanceDto.md)>


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


## getEnvironmentInstancesForTitle

> List<EnvironmentInstanceDto> getEnvironmentInstancesForTitle(titleId, includeInactive)

Get environment instances for title

Get environment instances for a title

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        Boolean includeInactive = true; // Boolean | 
        try {
            List<EnvironmentInstanceDto> result = apiInstance.getEnvironmentInstancesForTitle(titleId, includeInactive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#getEnvironmentInstancesForTitle");
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
 **titleId** | **String**|  |
 **includeInactive** | **Boolean**|  | [optional]

### Return type

[**List&lt;EnvironmentInstanceDto&gt;**](EnvironmentInstanceDto.md)


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

## getEnvironmentInstancesForTitleWithHttpInfo

> ApiResponse<List<EnvironmentInstanceDto>> getEnvironmentInstancesForTitle getEnvironmentInstancesForTitleWithHttpInfo(titleId, includeInactive)

Get environment instances for title

Get environment instances for a title

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        Boolean includeInactive = true; // Boolean | 
        try {
            ApiResponse<List<EnvironmentInstanceDto>> response = apiInstance.getEnvironmentInstancesForTitleWithHttpInfo(titleId, includeInactive);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#getEnvironmentInstancesForTitle");
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
 **titleId** | **String**|  |
 **includeInactive** | **Boolean**|  | [optional]

### Return type

ApiResponse<[**List&lt;EnvironmentInstanceDto&gt;**](EnvironmentInstanceDto.md)>


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


## getTitleById

> TitleDto getTitleById(titleId)

Get title

Get title details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        try {
            TitleDto result = apiInstance.getTitleById(titleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#getTitleById");
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
 **titleId** | **String**|  |

### Return type

[**TitleDto**](TitleDto.md)


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

## getTitleByIdWithHttpInfo

> ApiResponse<TitleDto> getTitleById getTitleByIdWithHttpInfo(titleId)

Get title

Get title details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        try {
            ApiResponse<TitleDto> response = apiInstance.getTitleByIdWithHttpInfo(titleId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#getTitleById");
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
 **titleId** | **String**|  |

### Return type

ApiResponse<[**TitleDto**](TitleDto.md)>


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


## setTitleActive

> void setTitleActive(titleId)

Set title to activated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        try {
            apiInstance.setTitleActive(titleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#setTitleActive");
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
 **titleId** | **String**|  |

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
| **204** | Title state updated. |  -  |

## setTitleActiveWithHttpInfo

> ApiResponse<Void> setTitleActive setTitleActiveWithHttpInfo(titleId)

Set title to activated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.setTitleActiveWithHttpInfo(titleId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#setTitleActive");
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
 **titleId** | **String**|  |

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
| **204** | Title state updated. |  -  |


## setTitleInactive

> void setTitleInactive(titleId)

Set title to deactivated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        try {
            apiInstance.setTitleInactive(titleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#setTitleInactive");
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
 **titleId** | **String**|  |

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
| **204** | Title state updated. |  -  |

## setTitleInactiveWithHttpInfo

> ApiResponse<Void> setTitleInactive setTitleInactiveWithHttpInfo(titleId)

Set title to deactivated

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.setTitleInactiveWithHttpInfo(titleId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#setTitleInactive");
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
 **titleId** | **String**|  |

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
| **204** | Title state updated. |  -  |


## updateTitle

> void updateTitle(titleId, createTitleRequest)

Update title

Update title name.

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        CreateTitleRequest createTitleRequest = new CreateTitleRequest(); // CreateTitleRequest | 
        try {
            apiInstance.updateTitle(titleId, createTitleRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#updateTitle");
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
 **titleId** | **String**|  |
 **createTitleRequest** | [**CreateTitleRequest**](CreateTitleRequest.md)|  |

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
| **204** | The title was updated successfully. |  -  |

## updateTitleWithHttpInfo

> ApiResponse<Void> updateTitle updateTitleWithHttpInfo(titleId, createTitleRequest)

Update title

Update title name.

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TitlesApi apiInstance = new TitlesApi(defaultClient);
        String titleId = "titleId_example"; // String | 
        CreateTitleRequest createTitleRequest = new CreateTitleRequest(); // CreateTitleRequest | 
        try {
            ApiResponse<Void> response = apiInstance.updateTitleWithHttpInfo(titleId, createTitleRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TitlesApi#updateTitle");
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
 **titleId** | **String**|  |
 **createTitleRequest** | [**CreateTitleRequest**](CreateTitleRequest.md)|  |

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
| **204** | The title was updated successfully. |  -  |

