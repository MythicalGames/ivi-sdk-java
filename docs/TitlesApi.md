# TitlesApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEnvironmentInstance**](TitlesApi.md#addEnvironmentInstance) | **POST** /titles/{titleId}/environments | Create environment instance for title
[**getEnvironmentInstancesForTitle**](TitlesApi.md#getEnvironmentInstancesForTitle) | **GET** /titles/{titleId}/environments | Get environment instances for title
[**getTitleById**](TitlesApi.md#getTitleById) | **GET** /titles/{titleId} | Get title
[**setTitleActive**](TitlesApi.md#setTitleActive) | **PUT** /titles/{titleId}/activate | Set title to activated
[**setTitleInactive**](TitlesApi.md#setTitleInactive) | **PUT** /titles/{titleId}/deactivate | Set title to deactivated
[**updateTitle**](TitlesApi.md#updateTitle) | **PUT** /titles/{titleId} | Update title


<a name="addEnvironmentInstance"></a>
# **addEnvironmentInstance**
> EnvironmentInstanceDto addEnvironmentInstance(titleId, createEnvironmentInstanceRequest)

Create environment instance for title

Create new environment instance for a title

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getEnvironmentInstancesForTitle"></a>
# **getEnvironmentInstancesForTitle**
> List&lt;EnvironmentInstanceDto&gt; getEnvironmentInstancesForTitle(titleId, includeInactive)

Get environment instances for title

Get environment instances for a title

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getTitleById"></a>
# **getTitleById**
> TitleDto getTitleById(titleId)

Get title

Get title details

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="setTitleActive"></a>
# **setTitleActive**
> setTitleActive(titleId)

Set title to activated

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**204** | Title state updated. |  -  |

<a name="setTitleInactive"></a>
# **setTitleInactive**
> setTitleInactive(titleId)

Set title to deactivated

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**204** | Title state updated. |  -  |

<a name="updateTitle"></a>
# **updateTitle**
> updateTitle(titleId, createTitleRequest)

Update title

Update title name.

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.TitlesApi;

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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**204** | The title was updated successfully. |  -  |

