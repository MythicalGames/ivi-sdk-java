

# Role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**displayName** | **String** |  |  [optional]
**roleName** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**apiLevel** | [**ApiLevelEnum**](#ApiLevelEnum) |  |  [optional]
**targets** | [**Map&lt;String, List&lt;String&gt;&gt;**](#Map&lt;String, List&lt;String&gt;&gt;) |  |  [optional]



## Enum: ApiLevelEnum

Name | Value
---- | -----
ORG | &quot;ORG&quot;
TITLE | &quot;TITLE&quot;
ENV | &quot;ENV&quot;
ADMIN | &quot;ADMIN&quot;
SUPER_ADMIN | &quot;SUPER_ADMIN&quot;



## Enum: Map&lt;String, List&lt;String&gt;&gt;

Name | Value
---- | -----
CREATE | &quot;CREATE&quot;
READ | &quot;READ&quot;
UPDATE | &quot;UPDATE&quot;
DELETE | &quot;DELETE&quot;



