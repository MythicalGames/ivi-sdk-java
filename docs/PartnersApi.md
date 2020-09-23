# PartnersApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewAgreement**](PartnersApi.md#createNewAgreement) | **POST** /orgs/{organizationId}/partner/{partnerId}/agreement | Create Agreement
[**createNewAgreementWithHttpInfo**](PartnersApi.md#createNewAgreementWithHttpInfo) | **POST** /orgs/{organizationId}/partner/{partnerId}/agreement | Create Agreement
[**createNewPartner**](PartnersApi.md#createNewPartner) | **POST** /orgs/{organizationId}/partner | Create Partner
[**createNewPartnerWithHttpInfo**](PartnersApi.md#createNewPartnerWithHttpInfo) | **POST** /orgs/{organizationId}/partner | Create Partner
[**getAgreements**](PartnersApi.md#getAgreements) | **GET** /orgs/{organizationId}/partner/{partnerId}/agreement | Get Agreements
[**getAgreementsWithHttpInfo**](PartnersApi.md#getAgreementsWithHttpInfo) | **GET** /orgs/{organizationId}/partner/{partnerId}/agreement | Get Agreements
[**getPartners**](PartnersApi.md#getPartners) | **GET** /orgs/{organizationId}/partner | Get Partners
[**getPartnersWithHttpInfo**](PartnersApi.md#getPartnersWithHttpInfo) | **GET** /orgs/{organizationId}/partner | Get Partners
[**updateAgreement**](PartnersApi.md#updateAgreement) | **PUT** /orgs/{organizationId}/partner/{partnerId}/agreement | Update agreement details
[**updateAgreementWithHttpInfo**](PartnersApi.md#updateAgreementWithHttpInfo) | **PUT** /orgs/{organizationId}/partner/{partnerId}/agreement | Update agreement details
[**updatePartner**](PartnersApi.md#updatePartner) | **PUT** /orgs/{organizationId}/partner | Update partner details
[**updatePartnerWithHttpInfo**](PartnersApi.md#updatePartnerWithHttpInfo) | **PUT** /orgs/{organizationId}/partner | Update partner details



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

## createNewAgreementWithHttpInfo

> ApiResponse<AgreementDto> createNewAgreement createNewAgreementWithHttpInfo(organizationId, partnerId, createAgreementRequest)

Create Agreement

Create a new agreement for a partner

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
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
            ApiResponse<AgreementDto> response = apiInstance.createNewAgreementWithHttpInfo(organizationId, partnerId, createAgreementRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#createNewAgreement");
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
 **partnerId** | **String**|  |
 **createAgreementRequest** | [**CreateAgreementRequest**](CreateAgreementRequest.md)|  |

### Return type

ApiResponse<[**AgreementDto**](AgreementDto.md)>


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

## createNewPartnerWithHttpInfo

> ApiResponse<PartnerDto> createNewPartner createNewPartnerWithHttpInfo(organizationId, createPartnerRequest)

Create Partner

Create a new partner for an organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
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
            ApiResponse<PartnerDto> response = apiInstance.createNewPartnerWithHttpInfo(organizationId, createPartnerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#createNewPartner");
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
 **createPartnerRequest** | [**CreatePartnerRequest**](CreatePartnerRequest.md)|  |

### Return type

ApiResponse<[**PartnerDto**](PartnerDto.md)>


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

> List<AgreementDto> getAgreements(organizationId, partnerId)

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

## getAgreementsWithHttpInfo

> ApiResponse<List<AgreementDto>> getAgreements getAgreementsWithHttpInfo(organizationId, partnerId)

Get Agreements

Get all agreements for an partner

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
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
            ApiResponse<List<AgreementDto>> response = apiInstance.getAgreementsWithHttpInfo(organizationId, partnerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#getAgreements");
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
 **partnerId** | **String**|  |

### Return type

ApiResponse<[**List&lt;AgreementDto&gt;**](AgreementDto.md)>


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

> List<PartnerDto> getPartners(organizationId)

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

## getPartnersWithHttpInfo

> ApiResponse<List<PartnerDto>> getPartners getPartnersWithHttpInfo(organizationId)

Get Partners

Get all partners for an organization

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
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
            ApiResponse<List<PartnerDto>> response = apiInstance.getPartnersWithHttpInfo(organizationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#getPartners");
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

### Return type

ApiResponse<[**List&lt;PartnerDto&gt;**](PartnerDto.md)>


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

## updateAgreementWithHttpInfo

> ApiResponse<AgreementDto> updateAgreement updateAgreementWithHttpInfo(organizationId, partnerId, updateAgreementRequest)

Update agreement details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
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
            ApiResponse<AgreementDto> response = apiInstance.updateAgreementWithHttpInfo(organizationId, partnerId, updateAgreementRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#updateAgreement");
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
 **partnerId** | **String**|  |
 **updateAgreementRequest** | [**UpdateAgreementRequest**](UpdateAgreementRequest.md)|  |

### Return type

ApiResponse<[**AgreementDto**](AgreementDto.md)>


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
        UpdatePartnerRequest updatePartnerRequest = new UpdatePartnerRequest(); // UpdatePartnerRequest | 
        try {
            PartnerDto result = apiInstance.updatePartner(organizationId, updatePartnerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#updatePartner");
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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

## updatePartnerWithHttpInfo

> ApiResponse<PartnerDto> updatePartner updatePartnerWithHttpInfo(organizationId, updatePartnerRequest)

Update partner details

### Example

```java
// Import classes:
import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.ApiResponse;
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
        UpdatePartnerRequest updatePartnerRequest = new UpdatePartnerRequest(); // UpdatePartnerRequest | 
        try {
            ApiResponse<PartnerDto> response = apiInstance.updatePartnerWithHttpInfo(organizationId, updatePartnerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#updatePartner");
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
 **updatePartnerRequest** | [**UpdatePartnerRequest**](UpdatePartnerRequest.md)|  |

### Return type

ApiResponse<[**PartnerDto**](PartnerDto.md)>


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

