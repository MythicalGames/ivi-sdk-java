# OrganizationsApi

All URIs are relative to *https://api.iviengine.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewTitle**](OrganizationsApi.md#createNewTitle) | **POST** /orgs/{organizationId}/titles | Create title
[**getDefaultRoles**](OrganizationsApi.md#getDefaultRoles) | **GET** /orgs/roles | Get default roles
[**getOrg**](OrganizationsApi.md#getOrg) | **GET** /orgs/{organizationId} | Get organization
[**getOrgs**](OrganizationsApi.md#getOrgs) | **GET** /orgs | Get organizations
[**getRolesForOrg**](OrganizationsApi.md#getRolesForOrg) | **GET** /orgs/{organizationId}/roles | Get roles for organization
[**getTitles**](OrganizationsApi.md#getTitles) | **GET** /orgs/{organizationId}/titles | Get titles
[**getUsersForOrganization**](OrganizationsApi.md#getUsersForOrganization) | **GET** /orgs/{organizationId}/users | Get users
[**inviteUserToOrg**](OrganizationsApi.md#inviteUserToOrg) | **POST** /orgs/{organizationId}/invites | Invite a user to organization
[**updateOrg**](OrganizationsApi.md#updateOrg) | **PUT** /orgs/{organizationId} | Update organization details
[**updateOrgRole**](OrganizationsApi.md#updateOrgRole) | **PUT** /orgs/{organizationId}/{platformUserId}/role | Update organization user role



## createNewTitle

> TitleDto createNewTitle(organizationId, createTitleRequest)

Create title

Create a new title in this organization.

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        CreateTitleRequest createTitleRequest = new CreateTitleRequest(); // CreateTitleRequest | 
        try {
            TitleDto result = apiInstance.createNewTitle(organizationId, createTitleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#createNewTitle");
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
 **createTitleRequest** | [**CreateTitleRequest**](CreateTitleRequest.md)|  |

### Return type

[**TitleDto**](TitleDto.md)

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


## getDefaultRoles

> List&lt;DefaultRoleDto&gt; getDefaultRoles()

Get default roles

Get the default roles that can be be created for your organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        try {
            List<DefaultRoleDto> result = apiInstance.getDefaultRoles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getDefaultRoles");
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

[**List&lt;DefaultRoleDto&gt;**](DefaultRoleDto.md)

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


## getOrg

> OrganizationDto getOrg(organizationId)

Get organization

Get organization by id

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        try {
            OrganizationDto result = apiInstance.getOrg(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getOrg");
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

### Return type

[**OrganizationDto**](OrganizationDto.md)

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


## getOrgs

> List&lt;OrganizationDto&gt; getOrgs()

Get organizations

Get all organizations by user

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        try {
            List<OrganizationDto> result = apiInstance.getOrgs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getOrgs");
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

[**List&lt;OrganizationDto&gt;**](OrganizationDto.md)

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


## getRolesForOrg

> List&lt;Role&gt; getRolesForOrg(organizationId)

Get roles for organization

Get the roles that can be be assigned to users or server secrets

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        try {
            List<Role> result = apiInstance.getRolesForOrg(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getRolesForOrg");
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

[**List&lt;Role&gt;**](Role.md)

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


## getTitles

> List&lt;TitleDto&gt; getTitles(organizationId, includeInactive)

Get titles

Get titles for organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        Boolean includeInactive = true; // Boolean | 
        try {
            List<TitleDto> result = apiInstance.getTitles(organizationId, includeInactive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getTitles");
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
 **includeInactive** | **Boolean**|  | [optional] [default to true]

### Return type

[**List&lt;TitleDto&gt;**](TitleDto.md)

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


## getUsersForOrganization

> List&lt;UserDto&gt; getUsersForOrganization(organizationId)

Get users

Get users for organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        try {
            List<UserDto> result = apiInstance.getUsersForOrganization(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getUsersForOrganization");
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

### Return type

[**List&lt;UserDto&gt;**](UserDto.md)

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


## inviteUserToOrg

> List&lt;UserDto&gt; inviteUserToOrg(organizationId, inviteUserToOrganizationRequest)

Invite a user to organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        UUID organizationId = new UUID(); // UUID | 
        List<InviteUserToOrganizationRequest> inviteUserToOrganizationRequest = Arrays.asList(); // List<InviteUserToOrganizationRequest> | 
        try {
            List<UserDto> result = apiInstance.inviteUserToOrg(organizationId, inviteUserToOrganizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#inviteUserToOrg");
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
 **inviteUserToOrganizationRequest** | [**List&lt;InviteUserToOrganizationRequest&gt;**](InviteUserToOrganizationRequest.md)|  |

### Return type

[**List&lt;UserDto&gt;**](UserDto.md)

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


## updateOrg

> OrganizationDto updateOrg(organizationId, updateOrganizationRequest)

Update organization details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        UpdateOrganizationRequest updateOrganizationRequest = new UpdateOrganizationRequest(); // UpdateOrganizationRequest | 
        try {
            OrganizationDto result = apiInstance.updateOrg(organizationId, updateOrganizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#updateOrg");
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
 **updateOrganizationRequest** | [**UpdateOrganizationRequest**](UpdateOrganizationRequest.md)|  |

### Return type

[**OrganizationDto**](OrganizationDto.md)

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


## updateOrgRole

> updateOrgRole(organizationId, platformUserId, updateOrganizationRoleRequest)

Update organization user role

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        UpdateOrganizationRoleRequest updateOrganizationRoleRequest = new UpdateOrganizationRoleRequest(); // UpdateOrganizationRoleRequest | 
        try {
            apiInstance.updateOrgRole(organizationId, platformUserId, updateOrganizationRoleRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#updateOrgRole");
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
 **updateOrganizationRoleRequest** | [**UpdateOrganizationRoleRequest**](UpdateOrganizationRoleRequest.md)|  |

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
| **204** | Success, no content |  -  |

