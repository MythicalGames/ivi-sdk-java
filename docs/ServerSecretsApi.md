# ServerSecretsApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServerSecretForEnvironment**](ServerSecretsApi.md#createServerSecretForEnvironment) | **POST** /orgs/{organizationId}/secrets | Create server secret for organization
[**createServerSecretForEnvironmentWithHttpInfo**](ServerSecretsApi.md#createServerSecretForEnvironmentWithHttpInfo) | **POST** /orgs/{organizationId}/secrets | Create server secret for organization
[**deleteServerSecret**](ServerSecretsApi.md#deleteServerSecret) | **DELETE** /orgs/{organizationId}/secrets/{secretId} | Delete server secret for environment by secret ID
[**deleteServerSecretWithHttpInfo**](ServerSecretsApi.md#deleteServerSecretWithHttpInfo) | **DELETE** /orgs/{organizationId}/secrets/{secretId} | Delete server secret for environment by secret ID
[**disableServerSecret**](ServerSecretsApi.md#disableServerSecret) | **PUT** /orgs/{organizationId}/secrets/{secretId}/disable | Disable server secret by secret ID
[**disableServerSecretWithHttpInfo**](ServerSecretsApi.md#disableServerSecretWithHttpInfo) | **PUT** /orgs/{organizationId}/secrets/{secretId}/disable | Disable server secret by secret ID
[**enableServerSecret**](ServerSecretsApi.md#enableServerSecret) | **PUT** /orgs/{organizationId}/secrets/{secretId}/enable | Enable server secret by secret ID
[**enableServerSecretWithHttpInfo**](ServerSecretsApi.md#enableServerSecretWithHttpInfo) | **PUT** /orgs/{organizationId}/secrets/{secretId}/enable | Enable server secret by secret ID
[**getServerSecretById**](ServerSecretsApi.md#getServerSecretById) | **GET** /orgs/{organizationId}/secrets/{secretId} | Get server secret for environment by secret ID
[**getServerSecretByIdWithHttpInfo**](ServerSecretsApi.md#getServerSecretByIdWithHttpInfo) | **GET** /orgs/{organizationId}/secrets/{secretId} | Get server secret for environment by secret ID
[**getServerSecretsForEnvironment**](ServerSecretsApi.md#getServerSecretsForEnvironment) | **GET** /orgs/{organizationId}/secrets | Get server secrets defined for organization
[**getServerSecretsForEnvironmentWithHttpInfo**](ServerSecretsApi.md#getServerSecretsForEnvironmentWithHttpInfo) | **GET** /orgs/{organizationId}/secrets | Get server secrets defined for organization



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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
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

## createServerSecretForEnvironmentWithHttpInfo

> ApiResponse<ServerSecretDto> createServerSecretForEnvironment createServerSecretForEnvironmentWithHttpInfo(organizationId, createServerSecretRequest)

Create server secret for organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        CreateServerSecretRequest createServerSecretRequest = new CreateServerSecretRequest(); // CreateServerSecretRequest | 
        try {
            ApiResponse<ServerSecretDto> response = apiInstance.createServerSecretForEnvironmentWithHttpInfo(organizationId, createServerSecretRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#createServerSecretForEnvironment");
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
 **organizationId** | [**UUID**](.md)|  |
 **createServerSecretRequest** | [**CreateServerSecretRequest**](CreateServerSecretRequest.md)|  |

### Return type

ApiResponse<[**ServerSecretDto**](ServerSecretDto.md)>


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

> void deleteServerSecret(organizationId, secretId)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
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

## deleteServerSecretWithHttpInfo

> ApiResponse<Void> deleteServerSecret deleteServerSecretWithHttpInfo(organizationId, secretId)

Delete server secret for environment by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.deleteServerSecretWithHttpInfo(organizationId, secretId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#deleteServerSecret");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

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
| **204** | Secret deleted successfully. |  -  |


## disableServerSecret

> void disableServerSecret(organizationId, secretId)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
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

## disableServerSecretWithHttpInfo

> ApiResponse<Void> disableServerSecret disableServerSecretWithHttpInfo(organizationId, secretId)

Disable server secret by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.disableServerSecretWithHttpInfo(organizationId, secretId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#disableServerSecret");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

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
| **204** | Secret disabled successfully. |  -  |


## enableServerSecret

> void enableServerSecret(organizationId, secretId)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
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

## enableServerSecretWithHttpInfo

> ApiResponse<Void> enableServerSecret enableServerSecretWithHttpInfo(organizationId, secretId)

Enable server secret by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.enableServerSecretWithHttpInfo(organizationId, secretId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#enableServerSecret");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
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

## getServerSecretByIdWithHttpInfo

> ApiResponse<ServerSecretDto> getServerSecretById getServerSecretByIdWithHttpInfo(organizationId, secretId)

Get server secret for environment by secret ID

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        String secretId = "secretId_example"; // String | 
        try {
            ApiResponse<ServerSecretDto> response = apiInstance.getServerSecretByIdWithHttpInfo(organizationId, secretId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#getServerSecretById");
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
 **organizationId** | [**UUID**](.md)|  |
 **secretId** | **String**|  |

### Return type

ApiResponse<[**ServerSecretDto**](ServerSecretDto.md)>


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

> List<ServerSecretDto> getServerSecretsForEnvironment(organizationId)

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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
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

## getServerSecretsForEnvironmentWithHttpInfo

> ApiResponse<List<ServerSecretDto>> getServerSecretsForEnvironment getServerSecretsForEnvironmentWithHttpInfo(organizationId)

Get server secrets defined for organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.ServerSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ServerSecretsApi apiInstance = new ServerSecretsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        try {
            ApiResponse<List<ServerSecretDto>> response = apiInstance.getServerSecretsForEnvironmentWithHttpInfo(organizationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerSecretsApi#getServerSecretsForEnvironment");
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
 **organizationId** | [**UUID**](.md)|  |

### Return type

ApiResponse<[**List&lt;ServerSecretDto&gt;**](ServerSecretDto.md)>


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

