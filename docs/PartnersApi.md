# PartnersApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewAgreement**](PartnersApi.md#createNewAgreement) | **POST** /orgs/{organizationId}/partner/{partnerId}/agreement | Create Agreement
[**createNewPartner**](PartnersApi.md#createNewPartner) | **POST** /orgs/{organizationId}/partner | Create Partner
[**getAgreements**](PartnersApi.md#getAgreements) | **GET** /orgs/{organizationId}/partner/{partnerId}/agreement | Get Agreements
[**getPartners**](PartnersApi.md#getPartners) | **GET** /orgs/{organizationId}/partner | Get Partners
[**updateAgreement**](PartnersApi.md#updateAgreement) | **PUT** /orgs/{organizationId}/partner/{partnerId}/agreement | Update agreement details



## createNewAgreement

> AgreementDto createNewAgreement(organizationId, partnerId, createAgreementRequest)

Create Agreement

Create a new agreement for a partner

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String partnerId = "partnerId_example"; // String | 
        CreateAgreementRequest createAgreementRequest = new CreateAgreementRequest(); // CreateAgreementRequest | 
        try {
            AgreementDto result = apiInstance.createNewAgreement(organizationId, partnerId, createAgreementRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#createNewAgreement");
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
 **partnerId** | **String**|  |
 **createAgreementRequest** | [**CreateAgreementRequest**](CreateAgreementRequest.md)|  |

### Return type

[**AgreementDto**](AgreementDto.md)

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


## createNewPartner

> PartnerDto createNewPartner(organizationId, createPartnerRequest)

Create Partner

Create a new partner for an organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        CreatePartnerRequest createPartnerRequest = new CreatePartnerRequest(); // CreatePartnerRequest | 
        try {
            PartnerDto result = apiInstance.createNewPartner(organizationId, createPartnerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#createNewPartner");
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
 **createPartnerRequest** | [**CreatePartnerRequest**](CreatePartnerRequest.md)|  |

### Return type

[**PartnerDto**](PartnerDto.md)

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


## getAgreements

> List&lt;AgreementDto&gt; getAgreements(organizationId, partnerId)

Get Agreements

Get all agreements for an partner

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String partnerId = "partnerId_example"; // String | 
        try {
            List<AgreementDto> result = apiInstance.getAgreements(organizationId, partnerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#getAgreements");
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
 **partnerId** | **String**|  |

### Return type

[**List&lt;AgreementDto&gt;**](AgreementDto.md)

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


## getPartners

> List&lt;PartnerDto&gt; getPartners(organizationId)

Get Partners

Get all partners for an organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        try {
            List<PartnerDto> result = apiInstance.getPartners(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#getPartners");
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

[**List&lt;PartnerDto&gt;**](PartnerDto.md)

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


## updateAgreement

> AgreementDto updateAgreement(organizationId, partnerId, updateAgreementRequest)

Update agreement details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Configuration;
import games.mythical.ivi.sdk.auth.*;
import games.mythical.ivi.sdk.models.*;
import games.mythical.ivi.sdk.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        String partnerId = "partnerId_example"; // String | 
        UpdateAgreementRequest updateAgreementRequest = new UpdateAgreementRequest(); // UpdateAgreementRequest | 
        try {
            AgreementDto result = apiInstance.updateAgreement(organizationId, partnerId, updateAgreementRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#updateAgreement");
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
 **partnerId** | **String**|  |
 **updateAgreementRequest** | [**UpdateAgreementRequest**](UpdateAgreementRequest.md)|  |

### Return type

[**AgreementDto**](AgreementDto.md)

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

