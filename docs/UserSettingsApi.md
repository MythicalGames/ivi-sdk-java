# UserSettingsApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTheme**](UserSettingsApi.md#getTheme) | **GET** /users/settings/theme | Get the display theme
[**setTheme**](UserSettingsApi.md#setTheme) | **POST** /users/settings/theme | Set the display theme
[**updateTheme**](UserSettingsApi.md#updateTheme) | **PUT** /users/settings/theme | Update the display theme


<a name="getTheme"></a>
# **getTheme**
> ThemeDto getTheme()

Get the display theme

Returns the user&#39;s preferred display theme: DARK or LIGHT.

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.UserSettingsApi;

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

    UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
    try {
      ThemeDto result = apiInstance.getTheme();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSettingsApi#getTheme");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ThemeDto**](ThemeDto.md)

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

<a name="setTheme"></a>
# **setTheme**
> setTheme(body)

Set the display theme

Set the user&#39;s preferred display theme: DARK or LIGHT.

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.UserSettingsApi;

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

    UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      apiInstance.setTheme(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSettingsApi#setTheme");
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
 **body** | **String**|  | [optional]

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
**200** | Display theme successfully set. |  -  |
**400** | Bad Request |  -  |

<a name="updateTheme"></a>
# **updateTheme**
> updateTheme(body)

Update the display theme

Update the user&#39;s preferred display theme: DARK or LIGHT.

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.UserSettingsApi;

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

    UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      apiInstance.updateTheme(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSettingsApi#updateTheme");
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
 **body** | **String**|  | [optional]

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
**200** | Display theme successfully updated. |  -  |
**400** | Bad Request |  -  |

