

# OrderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemTypes** | [**List&lt;TokenCategory&gt;**](TokenCategory.md) |  |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**metadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**environmentId** | **String** |  |  [optional]
**address** | [**PostalAddress**](PostalAddress.md) |  |  [optional]
**orderId** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdTimestamp** | **String** |  |  [optional]
**requestIp** | **String** |  |  [optional]
**tax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**paymentProviderId** | [**PaymentProviderIdEnum**](#PaymentProviderIdEnum) |  |  [optional]
**paymentProviderData** | [**PaymentProviderOrderDto**](PaymentProviderOrderDto.md) |  |  [optional]



## Enum: PaymentProviderIdEnum

Name | Value
---- | -----
BRAINTREE | &quot;BRAINTREE&quot;
COINBASE | &quot;COINBASE&quot;
BITPAY | &quot;BITPAY&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;



