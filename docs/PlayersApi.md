# PlayersApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllPlayers**](PlayersApi.md#getAllPlayers) | **GET** /environments/{environmentId}/players | Get all players for a environment
[**getAllPlayersWithHttpInfo**](PlayersApi.md#getAllPlayersWithHttpInfo) | **GET** /environments/{environmentId}/players | Get all players for a environment
[**getPlayerData**](PlayersApi.md#getPlayerData) | **GET** /environments/{environmentId}/players/{playerId} | Get player data
[**getPlayerDataWithHttpInfo**](PlayersApi.md#getPlayerDataWithHttpInfo) | **GET** /environments/{environmentId}/players/{playerId} | Get player data
[**linkPlayerToEnvironment**](PlayersApi.md#linkPlayerToEnvironment) | **POST** /environments/{environmentId}/players | Link player to environment
[**linkPlayerToEnvironmentWithHttpInfo**](PlayersApi.md#linkPlayerToEnvironmentWithHttpInfo) | **POST** /environments/{environmentId}/players | Link player to environment



## getAllPlayers

> List<PlayerDto> getAllPlayers(environmentId)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

## getAllPlayersWithHttpInfo

> ApiResponse<List<PlayerDto>> getAllPlayers getAllPlayersWithHttpInfo(environmentId)

Get all players for a environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PlayersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        try {
            ApiResponse<List<PlayerDto>> response = apiInstance.getAllPlayersWithHttpInfo(environmentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#getAllPlayers");
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

ApiResponse<[**List&lt;PlayerDto&gt;**](PlayerDto.md)>


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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

## getPlayerDataWithHttpInfo

> ApiResponse<PlayerDto> getPlayerData getPlayerDataWithHttpInfo(environmentId, playerId)

Get player data

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PlayersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String playerId = "playerId_example"; // String | 
        try {
            ApiResponse<PlayerDto> response = apiInstance.getPlayerDataWithHttpInfo(environmentId, playerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#getPlayerData");
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
 **playerId** | **String**|  |

### Return type

ApiResponse<[**PlayerDto**](PlayerDto.md)>


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


## linkPlayerToEnvironment

> void linkPlayerToEnvironment(environmentId, linkPlayerToEnvironmentRequest)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        LinkPlayerToEnvironmentRequest linkPlayerToEnvironmentRequest = new LinkPlayerToEnvironmentRequest(); // LinkPlayerToEnvironmentRequest | 
        try {
            apiInstance.linkPlayerToEnvironment(environmentId, linkPlayerToEnvironmentRequest);
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


null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The player linking has begun |  -  |
| **400** | Bad Request |  -  |

## linkPlayerToEnvironmentWithHttpInfo

> ApiResponse<Void> linkPlayerToEnvironment linkPlayerToEnvironmentWithHttpInfo(environmentId, linkPlayerToEnvironmentRequest)

Link player to environment

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PlayersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        LinkPlayerToEnvironmentRequest linkPlayerToEnvironmentRequest = new LinkPlayerToEnvironmentRequest(); // LinkPlayerToEnvironmentRequest | 
        try {
            ApiResponse<Void> response = apiInstance.linkPlayerToEnvironmentWithHttpInfo(environmentId, linkPlayerToEnvironmentRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#linkPlayerToEnvironment");
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
 **linkPlayerToEnvironmentRequest** | [**LinkPlayerToEnvironmentRequest**](LinkPlayerToEnvironmentRequest.md)|  |

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
| **200** | The player linking has begun |  -  |
| **400** | Bad Request |  -  |

