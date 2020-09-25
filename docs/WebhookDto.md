

# WebhookDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTimestamp** | **Long** |  |  [optional]
**description** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**actionTypes** | [**List&lt;ActionTypesEnum&gt;**](#List&lt;ActionTypesEnum&gt;) |  |  [optional]
**requiredQueryParams** | **Map&lt;String, String&gt;** |  |  [optional]
**lastFailureReason** | **String** |  |  [optional]
**environmentId** | **String** |  |  [optional]
**requiredHeaders** | **Map&lt;String, String&gt;** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**disabled** | **Boolean** |  |  [optional]
**lastFailureTimestamp** | **Long** |  |  [optional]
**id** | **String** |  |  [optional]
**failureCount** | **Long** |  |  [optional]



## Enum: List&lt;ActionTypesEnum&gt;

Name | Value
---- | -----
FAILED | &quot;failed&quot;
ALL | &quot;all&quot;
CREATE | &quot;create&quot;
ISSUE | &quot;issue&quot;
TRANSFER_NFT | &quot;transfer_nft&quot;
BURN_NFT | &quot;burn_nft&quot;
NEW_ACCOUNT | &quot;new_account&quot;
BUY_NFT | &quot;buy_nft&quot;
LIST_SALE_NFT | &quot;list_sale_nft&quot;
CLOSE_SALE | &quot;close_sale&quot;
SOLD | &quot;sold&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;



