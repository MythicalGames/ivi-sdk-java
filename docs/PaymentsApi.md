# PaymentsApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completePayment**](PaymentsApi.md#completePayment) | **POST** /environments/{environmentId}/payments/pay | Finalize Purchase
[**createCustomer**](PaymentsApi.md#createCustomer) | **POST** /environments/{environmentId}/payments/customer | Create Customer
[**createPaymentMethod**](PaymentsApi.md#createPaymentMethod) | **POST** /environments/{environmentId}/payments/customer/methods | Create Payment Method
[**deleteCustomer**](PaymentsApi.md#deleteCustomer) | **DELETE** /environments/{environmentId}/payments/customer/{customerId} | Delete Customer
[**deletePaymentMethod**](PaymentsApi.md#deletePaymentMethod) | **DELETE** /environments/{environmentId}/payments/customer/methods/{methodToken} | Delete a Payment Method
[**generateClientToken**](PaymentsApi.md#generateClientToken) | **GET** /environments/{environmentId}/payments/token | Anonymous payment token
[**getCustomer**](PaymentsApi.md#getCustomer) | **GET** /environments/{environmentId}/payments/customer | Get Customer
[**getPaymentMethod**](PaymentsApi.md#getPaymentMethod) | **GET** /environments/{environmentId}/payments/customer/methods | Get Payment Method
[**getSalesTaxInfo**](PaymentsApi.md#getSalesTaxInfo) | **GET** /environments/{environmentId}/payments/tax/rate | Get sales tax- rate and amount based on country, state, zip code and sales amount.
[**getSalesTaxTransaction**](PaymentsApi.md#getSalesTaxTransaction) | **GET** /environments/{environmentId}/payments/tax/transaction/{orderId} | Get Transaction Details
[**updateCustomer**](PaymentsApi.md#updateCustomer) | **PUT** /environments/{environmentId}/payments/customer | Update Customer
[**updatePaymentMethod**](PaymentsApi.md#updatePaymentMethod) | **PUT** /environments/{environmentId}/payments/customer/methods/default | Update the default Payment Method


<a name="completePayment"></a>
# **completePayment**
> PaymentDto completePayment(environmentId, finalizePaymentRequest)

Finalize Purchase

Make the final payment

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    FinalizePaymentRequest finalizePaymentRequest = new FinalizePaymentRequest(); // FinalizePaymentRequest | 
    try {
      PaymentDto result = apiInstance.completePayment(environmentId, finalizePaymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#completePayment");
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
 **finalizePaymentRequest** | [**FinalizePaymentRequest**](FinalizePaymentRequest.md)|  |

### Return type

[**PaymentDto**](PaymentDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Authentication failure. |  -  |
**500** | Internal Server Error. |  -  |
**403** | You do not have the correct access rights to make this request. |  -  |

<a name="createCustomer"></a>
# **createCustomer**
> CustomerDto createCustomer(environmentId, createCustomerRequest)

Create Customer

Create Payment Customer

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest(); // CreateCustomerRequest | 
    try {
      CustomerDto result = apiInstance.createCustomer(environmentId, createCustomerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#createCustomer");
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
 **createCustomerRequest** | [**CreateCustomerRequest**](CreateCustomerRequest.md)|  |

### Return type

[**CustomerDto**](CustomerDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="createPaymentMethod"></a>
# **createPaymentMethod**
> PaymentMethodDto createPaymentMethod(environmentId, createPaymentMethodRequest)

Create Payment Method

Create Payment Method

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    CreatePaymentMethodRequest createPaymentMethodRequest = new CreatePaymentMethodRequest(); // CreatePaymentMethodRequest | 
    try {
      PaymentMethodDto result = apiInstance.createPaymentMethod(environmentId, createPaymentMethodRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#createPaymentMethod");
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
 **createPaymentMethodRequest** | [**CreatePaymentMethodRequest**](CreatePaymentMethodRequest.md)|  |

### Return type

[**PaymentMethodDto**](PaymentMethodDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="deleteCustomer"></a>
# **deleteCustomer**
> deleteCustomer(environmentId, customerId)

Delete Customer

Delete an existing Payment Customer

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    try {
      apiInstance.deleteCustomer(environmentId, customerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#deleteCustomer");
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
 **customerId** | **String**|  |

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
**400** | Bad Request |  -  |
**204** | Customer deleted |  -  |

<a name="deletePaymentMethod"></a>
# **deletePaymentMethod**
> deletePaymentMethod(environmentId, methodToken)

Delete a Payment Method

Delete an existing Payment Method

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String methodToken = "methodToken_example"; // String | 
    try {
      apiInstance.deletePaymentMethod(environmentId, methodToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#deletePaymentMethod");
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
 **methodToken** | **String**|  |

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
**400** | Bad Request |  -  |
**204** | Payment Method deleted |  -  |

<a name="generateClientToken"></a>
# **generateClientToken**
> ClientPaymentTokenDto generateClientToken(environmentId, customerId)

Anonymous payment token

Get an anonymous payment token for a customer

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    try {
      ClientPaymentTokenDto result = apiInstance.generateClientToken(environmentId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#generateClientToken");
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
 **customerId** | **String**|  | [optional]

### Return type

[**ClientPaymentTokenDto**](ClientPaymentTokenDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getCustomer"></a>
# **getCustomer**
> CustomerDto getCustomer(environmentId, customerId)

Get Customer

Find a Payment Customer

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    try {
      CustomerDto result = apiInstance.getCustomer(environmentId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getCustomer");
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
 **customerId** | **String**|  |

### Return type

[**CustomerDto**](CustomerDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getPaymentMethod"></a>
# **getPaymentMethod**
> PaymentMethodDto getPaymentMethod(environmentId, paymentMethodToken)

Get Payment Method

Find a Payment Method for a customer

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String paymentMethodToken = "paymentMethodToken_example"; // String | 
    try {
      PaymentMethodDto result = apiInstance.getPaymentMethod(environmentId, paymentMethodToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentMethod");
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
 **paymentMethodToken** | **String**|  |

### Return type

[**PaymentMethodDto**](PaymentMethodDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getSalesTaxInfo"></a>
# **getSalesTaxInfo**
> SalesTaxInfoDto getSalesTaxInfo(environmentId, countryIsoCode, stateIsoCode, zipCode, isSecondaryMarketplace)

Get sales tax- rate and amount based on country, state, zip code and sales amount.

Get sales tax rate and tax amount based on country ISO code, state ISO code, zip code and sales amount.

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String countryIsoCode = "countryIsoCode_example"; // String | 
    String stateIsoCode = "stateIsoCode_example"; // String | 
    String zipCode = "zipCode_example"; // String | 
    Boolean isSecondaryMarketplace = true; // Boolean | 
    try {
      SalesTaxInfoDto result = apiInstance.getSalesTaxInfo(environmentId, countryIsoCode, stateIsoCode, zipCode, isSecondaryMarketplace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getSalesTaxInfo");
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
 **countryIsoCode** | **String**|  |
 **stateIsoCode** | **String**|  |
 **zipCode** | **String**|  |
 **isSecondaryMarketplace** | **Boolean**|  |

### Return type

[**SalesTaxInfoDto**](SalesTaxInfoDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getSalesTaxTransaction"></a>
# **getSalesTaxTransaction**
> SalesTaxTransactionDto getSalesTaxTransaction(environmentId, orderId)

Get Transaction Details

Find transaction details for a transaction id

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    String orderId = "orderId_example"; // String | 
    try {
      SalesTaxTransactionDto result = apiInstance.getSalesTaxTransaction(environmentId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getSalesTaxTransaction");
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
 **orderId** | **String**|  |

### Return type

[**SalesTaxTransactionDto**](SalesTaxTransactionDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="updateCustomer"></a>
# **updateCustomer**
> CustomerDto updateCustomer(environmentId, updateCustomerRequest)

Update Customer

Update fields on an existing Payment Customer

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest(); // UpdateCustomerRequest | 
    try {
      CustomerDto result = apiInstance.updateCustomer(environmentId, updateCustomerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#updateCustomer");
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
 **updateCustomerRequest** | [**UpdateCustomerRequest**](UpdateCustomerRequest.md)|  |

### Return type

[**CustomerDto**](CustomerDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="updatePaymentMethod"></a>
# **updatePaymentMethod**
> PaymentMethodDto updatePaymentMethod(environmentId, updatePaymentMethodDefaultRequest)

Update the default Payment Method

Set a payment method as a default

### Example
```java
// Import classes:
import games.mythical.ivi.sdk.invoker.ApiClient;
import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.invoker.Configuration;
import games.mythical.ivi.sdk.invoker.auth.*;
import games.mythical.ivi.sdk.invoker.models.*;
import games.mythical.ivi.sdk.api.PaymentsApi;

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

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | 
    UpdatePaymentMethodDefaultRequest updatePaymentMethodDefaultRequest = new UpdatePaymentMethodDefaultRequest(); // UpdatePaymentMethodDefaultRequest | 
    try {
      PaymentMethodDto result = apiInstance.updatePaymentMethod(environmentId, updatePaymentMethodDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#updatePaymentMethod");
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
 **updatePaymentMethodDefaultRequest** | [**UpdatePaymentMethodDefaultRequest**](UpdatePaymentMethodDefaultRequest.md)|  |

### Return type

[**PaymentMethodDto**](PaymentMethodDto.md)

### Authorization

[api_key](../README.md#api_key), [spring_oauth](../README.md#spring_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

