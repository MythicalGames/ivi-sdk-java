

# CreateOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemTypes** | [**List&lt;TokenCategory&gt;**](TokenCategory.md) |  |  [optional]
**metadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**address** | [**PostalAddress**](PostalAddress.md) |  |  [optional]
**platformUserId** | **String** |  | 
**requestIp** | **String** |  | 
**subTotal** | [**BigDecimal**](BigDecimal.md) |  | 
**paymentProviderId** | [**PaymentProviderIdEnum**](#PaymentProviderIdEnum) |  | 



## Enum: PaymentProviderIdEnum

Name | Value
---- | -----
BRAINTREE | &quot;BRAINTREE&quot;
COINBASE | &quot;COINBASE&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;



