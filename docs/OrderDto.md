

# OrderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemTypes** | **String** |  |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**metadata** | **String** |  |  [optional]
**environmentId** | **String** |  |  [optional]
**address** | **String** |  |  [optional]
**orderId** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdTimestamp** | **String** |  |  [optional]
**requestIp** | **String** |  |  [optional]
**tax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**paymentProviderId** | [**PaymentProviderIdEnum**](#PaymentProviderIdEnum) |  |  [optional]
**paymentProviderData** | [**PaymentProviderData**](PaymentProviderData.md) |  |  [optional]



## Enum: PaymentProviderIdEnum

Name | Value
---- | -----
BRAINTREE | &quot;BRAINTREE&quot;
COINBASE | &quot;COINBASE&quot;
BITPAY | &quot;BITPAY&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;



