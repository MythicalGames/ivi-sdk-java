# ivi-engine-sdk

IVI Engine

- API version: 1.0.0-SNAPSHOT

IVI Engine

    For more information, please visit [https://www.mythical.games/](https://www.mythical.games/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>games.mythical</groupId>
    <artifactId>ivi-engine-sdk</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation group: "games.mythical", name: "ivi-engine-sdk", version: "1.0.0-SNAPSHOT"
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

    import games.mythical.ivi.sdk.*;
    import games.mythical.ivi.sdk.auth.*;
    import games.mythical.ivi.sdk.model.*;
    import games.mythical.ivi.sdk.api.AccountsApi;

    public class AccountsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.iviengine.com");
        
            // Configure API key authorization: api_key
            ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
            api_key.setApiKey("YOUR API KEY");
            // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
            //api_key.setApiKeyPrefix("Token");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
            String organizationId = "organizationId_example"; // String | 
            CreateMythicalUserRequest createMythicalUserRequest = new CreateMythicalUserRequest(); // CreateMythicalUserRequest | 
        try {
            MythicalUserDto result = apiInstance.createMythicalUser(organizationId, createMythicalUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#createMythicalUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.iviengine.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**createMythicalUser**](docs/AccountsApi.md#createMythicalUser) | **POST** /orgs/{organizationId}/accounts | Create new mythical account
*AccountsApi* | [**findMythicalUser**](docs/AccountsApi.md#findMythicalUser) | **GET** /orgs/{organizationId}/accounts/search | Find mythical accounts
*AccountsApi* | [**getMythicalUser**](docs/AccountsApi.md#getMythicalUser) | **GET** /orgs/{organizationId}/accounts/{platformUserId} | Get mythical platform user by id
*AccountsApi* | [**resetPassword**](docs/AccountsApi.md#resetPassword) | **POST** /environments/{environmentId}/players/{platformUserId}/reset-password | Reset user password
*AccountsApi* | [**updateProfileDetails**](docs/AccountsApi.md#updateProfileDetails) | **PUT** /environments/{environmentId}/players/{platformUserId}/profile | Update user profile details
*AccountsApi* | [**updateProfilePicture**](docs/AccountsApi.md#updateProfilePicture) | **PUT** /environments/{environmentId}/players/{platformUserId}/profile/picture | Update user profile picture
*EnvironmentsApi* | [**getEnvironmentInstance**](docs/EnvironmentsApi.md#getEnvironmentInstance) | **GET** /environments/{environmentId} | Get title environment instance
*EnvironmentsApi* | [**setEnvironmentInstanceActive**](docs/EnvironmentsApi.md#setEnvironmentInstanceActive) | **PUT** /environments/{environmentId}/activate | Set environment to activated
*EnvironmentsApi* | [**setEnvironmentInstanceInactive**](docs/EnvironmentsApi.md#setEnvironmentInstanceInactive) | **PUT** /environments/{environmentId}/deactivate | Set environment to deactivated
*EnvironmentsApi* | [**updateEnvironmentInstanceName**](docs/EnvironmentsApi.md#updateEnvironmentInstanceName) | **PUT** /environments/{environmentId} | Update instance display name for title
*ItemsApi* | [**burnItem**](docs/ItemsApi.md#burnItem) | **POST** /environments/{environmentId}/items/burn | Burn issued item
*ItemsApi* | [**buyListing**](docs/ItemsApi.md#buyListing) | **POST** /environments/{environmentId}/items/buy | Purchase an item
*ItemsApi* | [**closeSale**](docs/ItemsApi.md#closeSale) | **PUT** /environments/{environmentId}/items/listed | Close a sale
*ItemsApi* | [**createItem**](docs/ItemsApi.md#createItem) | **POST** /environments/{environmentId}/items/types | Create item type
*ItemsApi* | [**getIssuedItems**](docs/ItemsApi.md#getIssuedItems) | **GET** /environments/{environmentId}/items/issued | Get all issued items for an environment.
*ItemsApi* | [**getItemTypes**](docs/ItemsApi.md#getItemTypes) | **GET** /environments/{environmentId}/items/types | Get all item types for an environment
*ItemsApi* | [**getListings**](docs/ItemsApi.md#getListings) | **GET** /environments/{environmentId}/items/listed | Get listed items
*ItemsApi* | [**getMetadata**](docs/ItemsApi.md#getMetadata) | **GET** /environments/{environmentId}/items/issued/metadata | Get metadata for an issued dgood 
*ItemsApi* | [**getSoldItems**](docs/ItemsApi.md#getSoldItems) | **GET** /environments/{environmentId}/items/buy | Get bought/sold items
*ItemsApi* | [**issueItem**](docs/ItemsApi.md#issueItem) | **POST** /environments/{environmentId}/items/issued | Issue item
*ItemsApi* | [**listItem**](docs/ItemsApi.md#listItem) | **POST** /environments/{environmentId}/items/listed | List an item for sale
*ItemsApi* | [**transferItem**](docs/ItemsApi.md#transferItem) | **POST** /environments/{environmentId}/items/transfer | Transfer issued item
*ItemsApi* | [**updateMetadata**](docs/ItemsApi.md#updateMetadata) | **PUT** /environments/{environmentId}/items/issued/metadata | Update metadata for a dgood
*MarketplaceApi* | [**getAllListings**](docs/MarketplaceApi.md#getAllListings) | **GET** /marketplace/environments/{environmentId}/items/listed | Get all items of an environment
*MarketplaceApi* | [**getItemHistory**](docs/MarketplaceApi.md#getItemHistory) | **GET** /marketplace/environments/{environmentId}/items/issued/history | Get the history of an item by DGood ID or Game ID
*MarketplaceApi* | [**getListing**](docs/MarketplaceApi.md#getListing) | **GET** /marketplace/environments/{environmentId}/items/listed/{listingId} | Get all information for the listing with the given id
*MarketplaceApi* | [**getMarketplaceItems**](docs/MarketplaceApi.md#getMarketplaceItems) | **GET** /marketplace/environments/{environmentId}/items/issued | Get all items owned by the logged in user.
*MarketplaceApi* | [**searchItems**](docs/MarketplaceApi.md#searchItems) | **GET** /marketplace/environments/{environmentId}/items/search | Search items
*OrdersApi* | [**createOrder**](docs/OrdersApi.md#createOrder) | **POST** /environments/{environmentId}/orders | Create Order
*OrdersApi* | [**deleteOrder**](docs/OrdersApi.md#deleteOrder) | **DELETE** /environments/{environmentId}/orders/{orderId} | Delete Order
*OrdersApi* | [**getOrder**](docs/OrdersApi.md#getOrder) | **GET** /environments/{environmentId}/orders | Get Order
*OrdersApi* | [**updateOrder**](docs/OrdersApi.md#updateOrder) | **PUT** /environments/{environmentId}/orders | Update Order
*OrganizationsApi* | [**createNewTitle**](docs/OrganizationsApi.md#createNewTitle) | **POST** /orgs/{organizationId}/titles | Create title
*OrganizationsApi* | [**getDefaultRoles**](docs/OrganizationsApi.md#getDefaultRoles) | **GET** /orgs/roles | Get default roles
*OrganizationsApi* | [**getOrg**](docs/OrganizationsApi.md#getOrg) | **GET** /orgs/{organizationId} | Get organization
*OrganizationsApi* | [**getOrgs**](docs/OrganizationsApi.md#getOrgs) | **GET** /orgs | Get organizations
*OrganizationsApi* | [**getRolesForOrg**](docs/OrganizationsApi.md#getRolesForOrg) | **GET** /orgs/{organizationId}/roles | Get roles for organization
*OrganizationsApi* | [**getTitles**](docs/OrganizationsApi.md#getTitles) | **GET** /orgs/{organizationId}/titles | Get titles
*OrganizationsApi* | [**getUsersForOrganization**](docs/OrganizationsApi.md#getUsersForOrganization) | **GET** /orgs/{organizationId}/users | Get users
*OrganizationsApi* | [**inviteUserToOrg**](docs/OrganizationsApi.md#inviteUserToOrg) | **POST** /orgs/{organizationId}/invites | Invite a user to organization
*OrganizationsApi* | [**updateOrg**](docs/OrganizationsApi.md#updateOrg) | **PUT** /orgs/{organizationId} | Update organization details
*OrganizationsApi* | [**updateOrgRole**](docs/OrganizationsApi.md#updateOrgRole) | **PUT** /orgs/{organizationId}/{platformUserId}/role | Update organization user role
*PartnersApi* | [**createNewAgreement**](docs/PartnersApi.md#createNewAgreement) | **POST** /orgs/{organizationId}/partner/{partnerId}/agreement | Create Agreement
*PartnersApi* | [**createNewPartner**](docs/PartnersApi.md#createNewPartner) | **POST** /orgs/{organizationId}/partner | Create Partner
*PartnersApi* | [**getAgreements**](docs/PartnersApi.md#getAgreements) | **GET** /orgs/{organizationId}/partner/{partnerId}/agreement | Get Agreements
*PartnersApi* | [**getPartners**](docs/PartnersApi.md#getPartners) | **GET** /orgs/{organizationId}/partner | Get Partners
*PartnersApi* | [**updateAgreement**](docs/PartnersApi.md#updateAgreement) | **PUT** /orgs/{organizationId}/partner/{partnerId}/agreement | Update agreement details
*PartnersApi* | [**updatePartner**](docs/PartnersApi.md#updatePartner) | **PUT** /orgs/{organizationId}/partner | Update partner details
*PaymentsApi* | [**completePayment**](docs/PaymentsApi.md#completePayment) | **POST** /environments/{environmentId}/payments/pay | Finalize Purchase
*PaymentsApi* | [**createCustomer**](docs/PaymentsApi.md#createCustomer) | **POST** /environments/{environmentId}/payments/customer | Create Customer
*PaymentsApi* | [**createPaymentMethod**](docs/PaymentsApi.md#createPaymentMethod) | **POST** /environments/{environmentId}/payments/customer/methods | Create Payment Method
*PaymentsApi* | [**deleteCustomer**](docs/PaymentsApi.md#deleteCustomer) | **DELETE** /environments/{environmentId}/payments/customer/{customerId} | Delete Customer
*PaymentsApi* | [**deletePaymentMethod**](docs/PaymentsApi.md#deletePaymentMethod) | **DELETE** /environments/{environmentId}/payments/customer/methods/{methodToken} | Delete a Payment Method
*PaymentsApi* | [**generateClientToken**](docs/PaymentsApi.md#generateClientToken) | **POST** /environments/{environmentId}/payments/token | Anonymous payment token
*PaymentsApi* | [**getCustomer**](docs/PaymentsApi.md#getCustomer) | **GET** /environments/{environmentId}/payments/customer | Get Customer
*PaymentsApi* | [**getPaymentMethod**](docs/PaymentsApi.md#getPaymentMethod) | **GET** /environments/{environmentId}/payments/customer/methods | Get Payment Method
*PaymentsApi* | [**getSalesTaxInfo**](docs/PaymentsApi.md#getSalesTaxInfo) | **GET** /environments/{environmentId}/payments/tax/rate | Get sales tax- rate and amount based on country, state, zip code and sales amount.
*PaymentsApi* | [**getSalesTaxTransaction**](docs/PaymentsApi.md#getSalesTaxTransaction) | **GET** /environments/{environmentId}/payments/tax/transaction/{orderId} | Get Transaction Details
*PaymentsApi* | [**updateCustomer**](docs/PaymentsApi.md#updateCustomer) | **PUT** /environments/{environmentId}/payments/customer | Update Customer
*PaymentsApi* | [**updatePaymentMethod**](docs/PaymentsApi.md#updatePaymentMethod) | **PUT** /environments/{environmentId}/payments/customer/methods/default | Update the default Payment Method
*PlayersApi* | [**getAllPlayers**](docs/PlayersApi.md#getAllPlayers) | **GET** /environments/{environmentId}/players | Get all players for a environment
*PlayersApi* | [**getPlayerData**](docs/PlayersApi.md#getPlayerData) | **GET** /environments/{environmentId}/players/{playerId} | Get player data
*PlayersApi* | [**linkPlayerToEnvironment**](docs/PlayersApi.md#linkPlayerToEnvironment) | **POST** /environments/{environmentId}/players | Link player to environment
*ServerSecretsApi* | [**createServerSecretForEnvironment**](docs/ServerSecretsApi.md#createServerSecretForEnvironment) | **POST** /orgs/{organizationId}/secrets | Create server secret for organization
*ServerSecretsApi* | [**deleteServerSecret**](docs/ServerSecretsApi.md#deleteServerSecret) | **DELETE** /orgs/{organizationId}/secrets/{secretId} | Delete server secret for environment by secret ID
*ServerSecretsApi* | [**disableServerSecret**](docs/ServerSecretsApi.md#disableServerSecret) | **PUT** /orgs/{organizationId}/secrets/{secretId}/disable | Disable server secret by secret ID
*ServerSecretsApi* | [**enableServerSecret**](docs/ServerSecretsApi.md#enableServerSecret) | **PUT** /orgs/{organizationId}/secrets/{secretId}/enable | Enable server secret by secret ID
*ServerSecretsApi* | [**getServerSecretById**](docs/ServerSecretsApi.md#getServerSecretById) | **GET** /orgs/{organizationId}/secrets/{secretId} | Get server secret for environment by secret ID
*ServerSecretsApi* | [**getServerSecretsForEnvironment**](docs/ServerSecretsApi.md#getServerSecretsForEnvironment) | **GET** /orgs/{organizationId}/secrets | Get server secrets defined for organization
*TitlesApi* | [**addEnvironmentInstance**](docs/TitlesApi.md#addEnvironmentInstance) | **POST** /titles/{titleId}/environments | Create environment instance for title
*TitlesApi* | [**getEnvironmentInstancesForTitle**](docs/TitlesApi.md#getEnvironmentInstancesForTitle) | **GET** /titles/{titleId}/environments | Get environment instances for title
*TitlesApi* | [**getTitleById**](docs/TitlesApi.md#getTitleById) | **GET** /titles/{titleId} | Get title
*TitlesApi* | [**setTitleActive**](docs/TitlesApi.md#setTitleActive) | **PUT** /titles/{titleId}/activate | Set title to activated
*TitlesApi* | [**setTitleInactive**](docs/TitlesApi.md#setTitleInactive) | **PUT** /titles/{titleId}/deactivate | Set title to deactivated
*TitlesApi* | [**updateTitle**](docs/TitlesApi.md#updateTitle) | **PUT** /titles/{titleId} | Update title
*TransactionsApi* | [**getAllTitleTransactions**](docs/TransactionsApi.md#getAllTitleTransactions) | **GET** /environments/{environmentId}/transactions | Get all transaction events for an environment.
*TransactionsApi* | [**getTransactionEventsForTitle**](docs/TransactionsApi.md#getTransactionEventsForTitle) | **GET** /environments/{environmentId}/transactions/{transactionId} | Get transaction events for transaction ID in an environment.
*UserSettingsApi* | [**getTheme**](docs/UserSettingsApi.md#getTheme) | **GET** /users/settings/theme | Get the display theme
*UserSettingsApi* | [**setTheme**](docs/UserSettingsApi.md#setTheme) | **POST** /users/settings/theme | Set the display theme
*UserSettingsApi* | [**updateTheme**](docs/UserSettingsApi.md#updateTheme) | **PUT** /users/settings/theme | Update the display theme
*VirtualCurrenciesApi* | [**addSupportedCurrencyForEnvironment**](docs/VirtualCurrenciesApi.md#addSupportedCurrencyForEnvironment) | **POST** /environments/{environmentId}/currencies | Add new virtual currency to environment
*VirtualCurrenciesApi* | [**deleteSupportedCurrencyByAbbreviation**](docs/VirtualCurrenciesApi.md#deleteSupportedCurrencyByAbbreviation) | **DELETE** /environments/{environmentId}/currencies/{abbreviation} | Delete virtual currency for environment by abbreviation
*VirtualCurrenciesApi* | [**getSupportedCurrencyByAbbreviation**](docs/VirtualCurrenciesApi.md#getSupportedCurrencyByAbbreviation) | **GET** /environments/{environmentId}/currencies/{abbreviation} | Get virtual currency for environment by abbreviation
*VirtualCurrenciesApi* | [**getSupportedCurrencyForEnvironment**](docs/VirtualCurrenciesApi.md#getSupportedCurrencyForEnvironment) | **GET** /environments/{environmentId}/currencies | Get virtual currencies defined for environment
*WebhooksApi* | [**createNewWebhook**](docs/WebhooksApi.md#createNewWebhook) | **POST** /environments/{environmentId}/webhooks | Create webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /environments/{environmentId}/webhooks/{webhookId} | Delete webhook
*WebhooksApi* | [**disableWebhook**](docs/WebhooksApi.md#disableWebhook) | **PUT** /environments/{environmentId}/webhooks/{webhookId}/disable | Disable webhook
*WebhooksApi* | [**enableWebhook**](docs/WebhooksApi.md#enableWebhook) | **PUT** /environments/{environmentId}/webhooks/{webhookId}/enable | Enable webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /environments/{environmentId}/webhooks/{webhookId} | Get webhook
*WebhooksApi* | [**getWebhooksForTitleId**](docs/WebhooksApi.md#getWebhooksForTitleId) | **GET** /environments/{environmentId}/webhooks | Get all webhooks for environment
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PUT** /environments/{environmentId}/webhooks/{webhookId} | Update webhook


## Documentation for Models

 - [AgreementDto](docs/AgreementDto.md)
 - [ApiLevel](docs/ApiLevel.md)
 - [BitPayOrderDto](docs/BitPayOrderDto.md)
 - [BitPayTokenDto](docs/BitPayTokenDto.md)
 - [BitPayTokenRequestData](docs/BitPayTokenRequestData.md)
 - [BraintreeOrderDto](docs/BraintreeOrderDto.md)
 - [BraintreePaymentRequestData](docs/BraintreePaymentRequestData.md)
 - [BraintreeTokenDto](docs/BraintreeTokenDto.md)
 - [BraintreeTokenRequestData](docs/BraintreeTokenRequestData.md)
 - [BurnItemRequest](docs/BurnItemRequest.md)
 - [BuyListingRequest](docs/BuyListingRequest.md)
 - [ClientPaymentTokenDto](docs/ClientPaymentTokenDto.md)
 - [CloseSaleRequest](docs/CloseSaleRequest.md)
 - [CoinbaseOrderDto](docs/CoinbaseOrderDto.md)
 - [CoinbasePaymentRequestData](docs/CoinbasePaymentRequestData.md)
 - [CreateAgreementRequest](docs/CreateAgreementRequest.md)
 - [CreateCustomerRequest](docs/CreateCustomerRequest.md)
 - [CreateEnvironmentInstanceRequest](docs/CreateEnvironmentInstanceRequest.md)
 - [CreateItemRequest](docs/CreateItemRequest.md)
 - [CreateMythicalUserRequest](docs/CreateMythicalUserRequest.md)
 - [CreateOrderRequest](docs/CreateOrderRequest.md)
 - [CreatePartnerRequest](docs/CreatePartnerRequest.md)
 - [CreatePaymentMethodRequest](docs/CreatePaymentMethodRequest.md)
 - [CreateServerSecretRequest](docs/CreateServerSecretRequest.md)
 - [CreateTitleRequest](docs/CreateTitleRequest.md)
 - [CreateVirtualCurrencyRequest](docs/CreateVirtualCurrencyRequest.md)
 - [CreateWebhookRequest](docs/CreateWebhookRequest.md)
 - [CustomerDto](docs/CustomerDto.md)
 - [DefaultRoleDto](docs/DefaultRoleDto.md)
 - [DgoodMetadataDto](docs/DgoodMetadataDto.md)
 - [ElasticDgood](docs/ElasticDgood.md)
 - [EnvironmentInstanceDto](docs/EnvironmentInstanceDto.md)
 - [FinalizePaymentRequest](docs/FinalizePaymentRequest.md)
 - [GenerateTokenRequest](docs/GenerateTokenRequest.md)
 - [InviteUserToOrganizationRequest](docs/InviteUserToOrganizationRequest.md)
 - [IssueItemRequest](docs/IssueItemRequest.md)
 - [IssuedItemDto](docs/IssuedItemDto.md)
 - [ItemActionDto](docs/ItemActionDto.md)
 - [ItemTypeDto](docs/ItemTypeDto.md)
 - [JsonArray](docs/JsonArray.md)
 - [JsonElement](docs/JsonElement.md)
 - [JsonNull](docs/JsonNull.md)
 - [JsonObject](docs/JsonObject.md)
 - [JsonPrimitive](docs/JsonPrimitive.md)
 - [LinkPlayerToEnvironmentRequest](docs/LinkPlayerToEnvironmentRequest.md)
 - [ListSaleRequest](docs/ListSaleRequest.md)
 - [ListingDto](docs/ListingDto.md)
 - [MarketplaceItemDto](docs/MarketplaceItemDto.md)
 - [MarketplaceListingDto](docs/MarketplaceListingDto.md)
 - [MythicalUserDto](docs/MythicalUserDto.md)
 - [OrderDto](docs/OrderDto.md)
 - [OrganizationDto](docs/OrganizationDto.md)
 - [PartnerDto](docs/PartnerDto.md)
 - [PaymentDto](docs/PaymentDto.md)
 - [PaymentMethodDto](docs/PaymentMethodDto.md)
 - [PaymentProviderOrderDto](docs/PaymentProviderOrderDto.md)
 - [PaymentRequestData](docs/PaymentRequestData.md)
 - [Permission](docs/Permission.md)
 - [PlayerDto](docs/PlayerDto.md)
 - [PostalAddress](docs/PostalAddress.md)
 - [ProfilePictureDto](docs/ProfilePictureDto.md)
 - [Role](docs/Role.md)
 - [SalesTaxInfoDto](docs/SalesTaxInfoDto.md)
 - [SalesTaxTransactionDto](docs/SalesTaxTransactionDto.md)
 - [SearchHit](docs/SearchHit.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [SearchTotal](docs/SearchTotal.md)
 - [ServerSecretDto](docs/ServerSecretDto.md)
 - [SoldItemDto](docs/SoldItemDto.md)
 - [ThemeDto](docs/ThemeDto.md)
 - [TitleDto](docs/TitleDto.md)
 - [TokenCategory](docs/TokenCategory.md)
 - [TokenRequestData](docs/TokenRequestData.md)
 - [TransactionDto](docs/TransactionDto.md)
 - [TransactionEventDTO](docs/TransactionEventDTO.md)
 - [TransferItemRequest](docs/TransferItemRequest.md)
 - [UpdateAgreementRequest](docs/UpdateAgreementRequest.md)
 - [UpdateCustomerRequest](docs/UpdateCustomerRequest.md)
 - [UpdateMetadataRequest](docs/UpdateMetadataRequest.md)
 - [UpdateMythicalUserRequest](docs/UpdateMythicalUserRequest.md)
 - [UpdateOrderRequest](docs/UpdateOrderRequest.md)
 - [UpdateOrganizationRequest](docs/UpdateOrganizationRequest.md)
 - [UpdateOrganizationRoleRequest](docs/UpdateOrganizationRoleRequest.md)
 - [UpdatePartnerRequest](docs/UpdatePartnerRequest.md)
 - [UpdatePaymentMethodDefaultRequest](docs/UpdatePaymentMethodDefaultRequest.md)
 - [UpdateProfilePictureRequest](docs/UpdateProfilePictureRequest.md)
 - [UpdateWebhookRequest](docs/UpdateWebhookRequest.md)
 - [UserDto](docs/UserDto.md)
 - [VirtualCurrencyDto](docs/VirtualCurrencyDto.md)
 - [WebhookDto](docs/WebhookDto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key


    - **Type**: API key
    - **API key parameter name**: API-KEY
    - **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developer@mythical.games

