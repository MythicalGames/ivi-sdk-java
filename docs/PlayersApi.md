# PlayersApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllPlayers**](PlayersApi.md#getAllPlayers) | **GET** /environments/{environmentId}/players | Get all players for a environment
[**getPlayerData**](PlayersApi.md#getPlayerData) | **GET** /environments/{environmentId}/players/{playerId} | Get player data
[**linkPlayerToEnvironment**](PlayersApi.md#linkPlayerToEnvironment) | **POST** /environments/{environmentId}/players | Link player to environment



## getAllPlayers

> List&lt;PlayerDto&gt; getAllPlayers(environmentId)

Get all players for a environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PlayersApi;

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

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            List<PlayerDto> result = apiInstance.getAllPlayers(environmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#getAllPlayers");
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

[**List&lt;PlayerDto&gt;**](PlayerDto.md)

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


## getPlayerData

> PlayerDto getPlayerData(environmentId, playerId)

Get player data

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PlayersApi;

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

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String playerId = "playerId_example"; // String | 
        try {
            PlayerDto result = apiInstance.getPlayerData(environmentId, playerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#getPlayerData");
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
 **playerId** | **String**|  |

### Return type

[**PlayerDto**](PlayerDto.md)

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


## linkPlayerToEnvironment

> PlayerDto linkPlayerToEnvironment(environmentId, linkPlayerToEnvironmentRequest)

Link player to environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PlayersApi;

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

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        LinkPlayerToEnvironmentRequest linkPlayerToEnvironmentRequest = new LinkPlayerToEnvironmentRequest(); // LinkPlayerToEnvironmentRequest | 
        try {
            PlayerDto result = apiInstance.linkPlayerToEnvironment(environmentId, linkPlayerToEnvironmentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#linkPlayerToEnvironment");
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
 **linkPlayerToEnvironmentRequest** | [**LinkPlayerToEnvironmentRequest**](LinkPlayerToEnvironmentRequest.md)|  |

### Return type

[**PlayerDto**](PlayerDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The player was successfully linked |  -  |
| **400** | Bad Request |  -  |

