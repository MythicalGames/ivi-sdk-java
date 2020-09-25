

# UpdateWebhookRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requiredHeaders** | **Map&lt;String, String&gt;** |  |  [optional]
**activeActions** | [**Set&lt;ActiveActionsEnum&gt;**](#Set&lt;ActiveActionsEnum&gt;) |  |  [optional]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**disabled** | **Boolean** |  |  [optional]
**url** | **String** |  | 
**requiredQueryParams** | **Map&lt;String, String&gt;** |  |  [optional]



## Enum: Set&lt;ActiveActionsEnum&gt;

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



