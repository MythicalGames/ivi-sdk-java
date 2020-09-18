# OrgsApi

All URIs are relative to *https://portal.iviengine.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updatePartner**](OrgsApi.md#updatePartner) | **PUT** /orgs/{organizationId}/partner | Update partner details



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
        defaultClient.setBasePath("https://portal.iviengine.com/api");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

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

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

