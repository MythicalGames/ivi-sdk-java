

# MarketplaceListingDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**saleAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**dgoodsMetadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**createdTimestamp** | **Long** |  |  [optional]
**sellerPlayerId** | **String** |  |  [optional]
**batchId** | **Long** |  |  [optional]
**finalized** | **Boolean** |  |  [optional]
**sellByDate** | **Long** |  |  [optional]
**environmentId** | **String** |  |  [optional]
**gameItems** | **Map&lt;String, Object&gt;** |  |  [optional]
**saleModel** | [**SaleModelEnum**](#SaleModelEnum) |  |  [optional]
**closed** | **Boolean** |  |  [optional]
**currency** | **String** |  |  [optional]
**dgoodIds** | **List&lt;Long&gt;** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]



## Enum: SaleModelEnum

Name | Value
---- | -----
FIXED_PRICE | &quot;FIXED_PRICE&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;



