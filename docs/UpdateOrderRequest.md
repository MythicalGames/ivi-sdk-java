

# UpdateOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemTypes** | [**List&lt;TokenCategory&gt;**](TokenCategory.md) |  |  [optional]
**metadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**address** | [**PostalAddress**](PostalAddress.md) |  |  [optional]
**orderId** | **String** |  | 
**platformUserId** | **String** |  |  [optional]
**tax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**subTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**paymentProviderId** | [**PaymentProviderIdEnum**](#PaymentProviderIdEnum) |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]



## Enum: PaymentProviderIdEnum

Name | Value
---- | -----
BRAINTREE | &quot;BRAINTREE&quot;
COINBASE | &quot;COINBASE&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;



## Enum: StatusEnum

Name | Value
---- | -----
STARTED | &quot;STARTED&quot;
COMPLETE | &quot;COMPLETE&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;



