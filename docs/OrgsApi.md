# OrgsApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptInvitation**](OrgsApi.md#acceptInvitation) | **POST** /orgs/{organizationId}/invites/{inviteId}/accept | Accept an invitation to organization
[**createNewTitle**](OrgsApi.md#createNewTitle) | **POST** /orgs/{organizationId}/titles | Create title
[**getOrg**](OrgsApi.md#getOrg) | **GET** /orgs/{organizationId} | Get organization
[**getPendingInvites**](OrgsApi.md#getPendingInvites) | **GET** /orgs/{organizationId}/invites | Get organization pending invites
[**getTitles**](OrgsApi.md#getTitles) | **GET** /orgs/{organizationId}/titles | Get titles
[**getUsersForOrganization**](OrgsApi.md#getUsersForOrganization) | **GET** /orgs/{organizationId}/users | Get users
[**inviteUserToOrg**](OrgsApi.md#inviteUserToOrg) | **POST** /orgs/{organizationId}/invites | Invite a user to organization
[**updateOrg**](OrgsApi.md#updateOrg) | **PUT** /orgs/{organizationId} | Update organization details
[**updateOrgRole**](OrgsApi.md#updateOrgRole) | **PUT** /orgs/{organizationId}/{platformUserId}/role | Update organization user role
[**updatePartner**](OrgsApi.md#updatePartner) | **PUT** /orgs/{organizationId}/partner | Update partner details



## acceptInvitation

> acceptInvitation(organizationId, inviteId)

Accept an invitation to organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String inviteId = "inviteId_example"; // String | 
        try {
            apiInstance.acceptInvitation(organizationId, inviteId);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#acceptInvitation");
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
 **inviteId** | **String**|  |

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
| **204** | Success, no content |  -  |


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
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        CreateTitleRequest createTitleRequest = new CreateTitleRequest(); // CreateTitleRequest | 
        try {
            TitleDto result = apiInstance.createNewTitle(organizationId, createTitleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#createNewTitle");
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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: application/json
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
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        try {
            OrganizationDto result = apiInstance.getOrg(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#getOrg");
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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getPendingInvites

> List&lt;InviteDto&gt; getPendingInvites(organizationId)

Get organization pending invites

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        try {
            List<InviteDto> result = apiInstance.getPendingInvites(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#getPendingInvites");
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

[**List&lt;InviteDto&gt;**](InviteDto.md)

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
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        Boolean includeInactive = true; // Boolean | 
        try {
            List<TitleDto> result = apiInstance.getTitles(organizationId, includeInactive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#getTitles");
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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

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
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        try {
            List<UserDto> result = apiInstance.getUsersForOrganization(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#getUsersForOrganization");
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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## inviteUserToOrg

> List&lt;InviteDto&gt; inviteUserToOrg(organizationId, inviteUserToOrganizationRequest)

Invite a user to organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        List<InviteUserToOrganizationRequest> inviteUserToOrganizationRequest = Arrays.asList(); // List<InviteUserToOrganizationRequest> | 
        try {
            List<InviteDto> result = apiInstance.inviteUserToOrg(organizationId, inviteUserToOrganizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#inviteUserToOrg");
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
 **inviteUserToOrganizationRequest** | [**List&lt;InviteUserToOrganizationRequest&gt;**](InviteUserToOrganizationRequest.md)|  |

### Return type

[**List&lt;InviteDto&gt;**](InviteDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

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
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        UpdateOrganizationRequest updateOrganizationRequest = new UpdateOrganizationRequest(); // UpdateOrganizationRequest | 
        try {
            OrganizationDto result = apiInstance.updateOrg(organizationId, updateOrganizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#updateOrg");
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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

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
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String platformUserId = "platformUserId_example"; // String | 
        UpdateOrganizationRoleRequest updateOrganizationRoleRequest = new UpdateOrganizationRoleRequest(); // UpdateOrganizationRoleRequest | 
        try {
            apiInstance.updateOrgRole(organizationId, platformUserId, updateOrganizationRoleRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#updateOrgRole");
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

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | Success, no content |  -  |


## updatePartner

> PartnerDto updatePartner(organizationId, updatePartnerRequest)

Update partner details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.OrgsApi;

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

        OrgsApi apiInstance = new OrgsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        UpdatePartnerRequest updatePartnerRequest = new UpdatePartnerRequest(); // UpdatePartnerRequest | 
        try {
            PartnerDto result = apiInstance.updatePartner(organizationId, updatePartnerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrgsApi#updatePartner");
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
 **updatePartnerRequest** | [**UpdatePartnerRequest**](UpdatePartnerRequest.md)|  |

### Return type

[**PartnerDto**](PartnerDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

