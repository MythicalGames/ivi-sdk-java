# AccountsApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMythicalUser**](AccountsApi.md#createMythicalUser) | **POST** /orgs/{organizationId}/accounts | Create new mythical account
[**createMythicalUserWithHttpInfo**](AccountsApi.md#createMythicalUserWithHttpInfo) | **POST** /orgs/{organizationId}/accounts | Create new mythical account
[**findMythicalUser**](AccountsApi.md#findMythicalUser) | **GET** /orgs/{organizationId}/accounts/search | Find mythical accounts
[**findMythicalUserWithHttpInfo**](AccountsApi.md#findMythicalUserWithHttpInfo) | **GET** /orgs/{organizationId}/accounts/search | Find mythical accounts
[**getMythicalUser**](AccountsApi.md#getMythicalUser) | **GET** /orgs/{organizationId}/accounts/{platformUserId} | Get mythical platform user by id
[**getMythicalUserWithHttpInfo**](AccountsApi.md#getMythicalUserWithHttpInfo) | **GET** /orgs/{organizationId}/accounts/{platformUserId} | Get mythical platform user by id
[**resetPassword**](AccountsApi.md#resetPassword) | **POST** /environments/{environmentId}/players/{platformUserId}/reset-password | Reset user password
[**resetPasswordWithHttpInfo**](AccountsApi.md#resetPasswordWithHttpInfo) | **POST** /environments/{environmentId}/players/{platformUserId}/reset-password | Reset user password
[**updateProfileDetails**](AccountsApi.md#updateProfileDetails) | **PUT** /environments/{environmentId}/players/{platformUserId}/profile | Update user profile details
[**updateProfileDetailsWithHttpInfo**](AccountsApi.md#updateProfileDetailsWithHttpInfo) | **PUT** /environments/{environmentId}/players/{platformUserId}/profile | Update user profile details
[**updateProfilePicture**](AccountsApi.md#updateProfilePicture) | **PUT** /environments/{environmentId}/players/{platformUserId}/profile/picture | Update user profile picture
[**updateProfilePictureWithHttpInfo**](AccountsApi.md#updateProfilePictureWithHttpInfo) | **PUT** /environments/{environmentId}/players/{platformUserId}/profile/picture | Update user profile picture



## createMythicalUser

> MythicalUserDto createMythicalUser(organizationId, createMythicalUserRequest)

Create new mythical account

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        CreateMythicalUserRequest createMythicalUserRequest = new CreateMythicalUserRequest(); // CreateMythicalUserRequest | 
        try {
            MythicalUserDto result = apiInstance.createMythicalUser(organizationId, createMythicalUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#createMythicalUser");
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
 **organizationId** | **String**|  |
 **createMythicalUserRequest** | [**CreateMythicalUserRequest**](CreateMythicalUserRequest.md)|  |

### Return type

[**MythicalUserDto**](MythicalUserDto.md)


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

## createMythicalUserWithHttpInfo

> ApiResponse<MythicalUserDto> createMythicalUser createMythicalUserWithHttpInfo(organizationId, createMythicalUserRequest)

Create new mythical account

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        CreateMythicalUserRequest createMythicalUserRequest = new CreateMythicalUserRequest(); // CreateMythicalUserRequest | 
        try {
            ApiResponse<MythicalUserDto> response = apiInstance.createMythicalUserWithHttpInfo(organizationId, createMythicalUserRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#createMythicalUser");
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
 **organizationId** | **String**|  |
 **createMythicalUserRequest** | [**CreateMythicalUserRequest**](CreateMythicalUserRequest.md)|  |

### Return type

ApiResponse<[**MythicalUserDto**](MythicalUserDto.md)>


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


## findMythicalUser

> List<MythicalUserDto> findMythicalUser(organizationId, email, firstName, lastName)

Find mythical accounts

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String email = "email_example"; // String | 
        String firstName = "firstName_example"; // String | 
        String lastName = "lastName_example"; // String | 
        try {
            List<MythicalUserDto> result = apiInstance.findMythicalUser(organizationId, email, firstName, lastName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#findMythicalUser");
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
 **organizationId** | **String**|  |
 **email** | **String**|  |
 **firstName** | **String**|  | [optional]
 **lastName** | **String**|  | [optional]

### Return type

[**List&lt;MythicalUserDto&gt;**](MythicalUserDto.md)


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

## findMythicalUserWithHttpInfo

> ApiResponse<List<MythicalUserDto>> findMythicalUser findMythicalUserWithHttpInfo(organizationId, email, firstName, lastName)

Find mythical accounts

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String email = "email_example"; // String | 
        String firstName = "firstName_example"; // String | 
        String lastName = "lastName_example"; // String | 
        try {
            ApiResponse<List<MythicalUserDto>> response = apiInstance.findMythicalUserWithHttpInfo(organizationId, email, firstName, lastName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#findMythicalUser");
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
 **organizationId** | **String**|  |
 **email** | **String**|  |
 **firstName** | **String**|  | [optional]
 **lastName** | **String**|  | [optional]

### Return type

ApiResponse<[**List&lt;MythicalUserDto&gt;**](MythicalUserDto.md)>


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


## getMythicalUser

> MythicalUserDto getMythicalUser(organizationId, platformUserId)

Get mythical platform user by id

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        try {
            MythicalUserDto result = apiInstance.getMythicalUser(organizationId, platformUserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getMythicalUser");
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
 **organizationId** | **String**|  |
 **platformUserId** | **String**|  |

### Return type

[**MythicalUserDto**](MythicalUserDto.md)


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

## getMythicalUserWithHttpInfo

> ApiResponse<MythicalUserDto> getMythicalUser getMythicalUserWithHttpInfo(organizationId, platformUserId)

Get mythical platform user by id

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        try {
            ApiResponse<MythicalUserDto> response = apiInstance.getMythicalUserWithHttpInfo(organizationId, platformUserId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getMythicalUser");
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
 **organizationId** | **String**|  |
 **platformUserId** | **String**|  |

### Return type

ApiResponse<[**MythicalUserDto**](MythicalUserDto.md)>


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


## resetPassword

> void resetPassword(environmentId, platformUserId)

Reset user password

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        try {
            apiInstance.resetPassword(environmentId, platformUserId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#resetPassword");
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
 **platformUserId** | **String**|  |

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
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

## resetPasswordWithHttpInfo

> ApiResponse<Void> resetPassword resetPasswordWithHttpInfo(environmentId, platformUserId)

Reset user password

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.resetPasswordWithHttpInfo(environmentId, platformUserId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#resetPassword");
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
 **platformUserId** | **String**|  |

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
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## updateProfileDetails

> MythicalUserDto updateProfileDetails(environmentId, platformUserId, updateMythicalUserRequest)

Update user profile details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        UpdateMythicalUserRequest updateMythicalUserRequest = new UpdateMythicalUserRequest(); // UpdateMythicalUserRequest | 
        try {
            MythicalUserDto result = apiInstance.updateProfileDetails(environmentId, platformUserId, updateMythicalUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#updateProfileDetails");
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
 **platformUserId** | **String**|  |
 **updateMythicalUserRequest** | [**UpdateMythicalUserRequest**](UpdateMythicalUserRequest.md)|  |

### Return type

[**MythicalUserDto**](MythicalUserDto.md)


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

## updateProfileDetailsWithHttpInfo

> ApiResponse<MythicalUserDto> updateProfileDetails updateProfileDetailsWithHttpInfo(environmentId, platformUserId, updateMythicalUserRequest)

Update user profile details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        UpdateMythicalUserRequest updateMythicalUserRequest = new UpdateMythicalUserRequest(); // UpdateMythicalUserRequest | 
        try {
            ApiResponse<MythicalUserDto> response = apiInstance.updateProfileDetailsWithHttpInfo(environmentId, platformUserId, updateMythicalUserRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#updateProfileDetails");
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
 **platformUserId** | **String**|  |
 **updateMythicalUserRequest** | [**UpdateMythicalUserRequest**](UpdateMythicalUserRequest.md)|  |

### Return type

ApiResponse<[**MythicalUserDto**](MythicalUserDto.md)>


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


## updateProfilePicture

> ProfilePictureDto updateProfilePicture(environmentId, platformUserId, updateProfilePictureRequest)

Update user profile picture

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        UpdateProfilePictureRequest updateProfilePictureRequest = new UpdateProfilePictureRequest(); // UpdateProfilePictureRequest | 
        try {
            ProfilePictureDto result = apiInstance.updateProfilePicture(environmentId, platformUserId, updateProfilePictureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#updateProfilePicture");
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
 **platformUserId** | **String**|  |
 **updateProfilePictureRequest** | [**UpdateProfilePictureRequest**](UpdateProfilePictureRequest.md)|  |

### Return type

[**ProfilePictureDto**](ProfilePictureDto.md)


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

## updateProfilePictureWithHttpInfo

> ApiResponse<ProfilePictureDto> updateProfilePicture updateProfilePictureWithHttpInfo(environmentId, platformUserId, updateProfilePictureRequest)

Update user profile picture

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.AccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String environmentId = "environmentId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        UpdateProfilePictureRequest updateProfilePictureRequest = new UpdateProfilePictureRequest(); // UpdateProfilePictureRequest | 
        try {
            ApiResponse<ProfilePictureDto> response = apiInstance.updateProfilePictureWithHttpInfo(environmentId, platformUserId, updateProfilePictureRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#updateProfilePicture");
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
 **platformUserId** | **String**|  |
 **updateProfilePictureRequest** | [**UpdateProfilePictureRequest**](UpdateProfilePictureRequest.md)|  |

### Return type

ApiResponse<[**ProfilePictureDto**](ProfilePictureDto.md)>


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

