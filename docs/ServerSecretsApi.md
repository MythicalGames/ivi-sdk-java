# ServerSecretsApi

All URIs are relative to *https://api.iviengine.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServerSecretForEnvironment**](ServerSecretsApi.md#createServerSecretForEnvironment) | **POST** /orgs/{organizationId}/secrets | Create server secret for organization
[**deleteServerSecret**](ServerSecretsApi.md#deleteServerSecret) | **DELETE** /orgs/{organizationId}/secrets/{secretId} | Delete server secret for environment by secret ID
[**disableServerSecret**](ServerSecretsApi.md#disableServerSecret) | **PUT** /orgs/{organizationId}/secrets/{secretId}/disable | Disable server secret by secret ID
[**enableServerSecret**](ServerSecretsApi.md#enableServerSecret) | **PUT** /orgs/{organizationId}/secrets/{secretId}/enable | Enable server secret by secret ID
[**getServerSecretById**](ServerSecretsApi.md#getServerSecretById) | **GET** /orgs/{organizationId}/secrets/{secretId} | Get server secret for environment by secret ID
[**getServerSecretsForEnvironment**](ServerSecretsApi.md#getServerSecretsForEnvironment) | **GET** /orgs/{organizationId}/secrets | Get server secrets defined for organization



## createServerSecretForEnvironment

> ServerSecretDto createServerSecretForEnvironment(organizationId, createServerSecretRequest)

Create server secret for organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        CreateServerSecretRequest createServerSecretRequest = new CreateServerSecretRequest(); // CreateServerSecretRequest | 
        try {
            ServerSecretDto result = apiInstance.createServerSecretForEnvironment(organizationId, createServerSecretRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#createServerSecretForEnvironment");
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
 **organizationId** | [**UUID**](.md)|  |
 **createServerSecretRequest** | [**CreateServerSecretRequest**](CreateServerSecretRequest.md)|  |

### Return type

[**ServerSecretDto**](ServerSecretDto.md)

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


## deleteServerSecret

> deleteServerSecret(organizationId, secretId)

Delete server secret for environment by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            apiInstance.deleteServerSecret(organizationId, secretId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#deleteServerSecret");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

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
| **204** | Secret deleted successfully. |  -  |


## disableServerSecret

> disableServerSecret(organizationId, secretId)

Disable server secret by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            apiInstance.disableServerSecret(organizationId, secretId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#disableServerSecret");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

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
| **204** | Secret disabled successfully. |  -  |


## enableServerSecret

> enableServerSecret(organizationId, secretId)

Enable server secret by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            apiInstance.enableServerSecret(organizationId, secretId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#enableServerSecret");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

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
| **204** | Secret enabled successfully. |  -  |


## getServerSecretById

> ServerSecretDto getServerSecretById(organizationId, secretId)

Get server secret for environment by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            ServerSecretDto result = apiInstance.getServerSecretById(organizationId, secretId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#getServerSecretById");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

### Return type

[**ServerSecretDto**](ServerSecretDto.md)

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


## getServerSecretsForEnvironment

> List&lt;ServerSecretDto&gt; getServerSecretsForEnvironment(organizationId)

Get server secrets defined for organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        try {
            List<ServerSecretDto> result = apiInstance.getServerSecretsForEnvironment(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#getServerSecretsForEnvironment");
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
 **organizationId** | [**UUID**](.md)|  |

### Return type

[**List&lt;ServerSecretDto&gt;**](ServerSecretDto.md)

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

