/*
 * IVI Engine
 * IVI Engine
 *
 * The version of the OpenAPI document: unspecified
 * Contact: developer@mythical.games
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.ApiClient;
import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.Pair;

import games.mythical.ivi.sdk.model.ClientPaymentTokenDto;
import games.mythical.ivi.sdk.model.CreateCustomerRequest;
import games.mythical.ivi.sdk.model.CreatePaymentMethodRequest;
import games.mythical.ivi.sdk.model.CustomerDto;
import games.mythical.ivi.sdk.model.FinalizePaymentRequest;
import games.mythical.ivi.sdk.model.PaymentDto;
import games.mythical.ivi.sdk.model.PaymentMethodDto;
import games.mythical.ivi.sdk.model.SalesTaxInfoDto;
import games.mythical.ivi.sdk.model.SalesTaxTransactionDto;
import games.mythical.ivi.sdk.model.UpdateCustomerRequest;
import games.mythical.ivi.sdk.model.UpdatePaymentMethodDefaultRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;


@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:53:22.361116-07:00[America/Los_Angeles]")
public class PaymentsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public PaymentsApi() {
    this(new ApiClient());
  }

  public PaymentsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Finalize Purchase
   * Make the final payment
   * @param environmentId  (required)
   * @param finalizePaymentRequest  (required)
   * @return PaymentDto
   * @throws ApiException if fails to make API call
   */
  public PaymentDto completePayment (String environmentId, FinalizePaymentRequest finalizePaymentRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling completePayment");
    }
    // verify the required parameter 'finalizePaymentRequest' is set
    if (finalizePaymentRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'finalizePaymentRequest' when calling completePayment");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/pay"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(finalizePaymentRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "completePayment call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PaymentDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Create Customer
   * Create Payment Customer
   * @param environmentId  (required)
   * @param createCustomerRequest  (required)
   * @return CustomerDto
   * @throws ApiException if fails to make API call
   */
  public CustomerDto createCustomer (String environmentId, CreateCustomerRequest createCustomerRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling createCustomer");
    }
    // verify the required parameter 'createCustomerRequest' is set
    if (createCustomerRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'createCustomerRequest' when calling createCustomer");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createCustomerRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "createCustomer call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CustomerDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Create Payment Method
   * Create Payment Method
   * @param environmentId  (required)
   * @param createPaymentMethodRequest  (required)
   * @return PaymentMethodDto
   * @throws ApiException if fails to make API call
   */
  public PaymentMethodDto createPaymentMethod (String environmentId, CreatePaymentMethodRequest createPaymentMethodRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling createPaymentMethod");
    }
    // verify the required parameter 'createPaymentMethodRequest' is set
    if (createPaymentMethodRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'createPaymentMethodRequest' when calling createPaymentMethod");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer/methods"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createPaymentMethodRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "createPaymentMethod call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PaymentMethodDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Delete Customer
   * Delete an existing Payment Customer
   * @param environmentId  (required)
   * @param customerId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomer (String environmentId, String customerId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling deleteCustomer");
    }
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
        throw new ApiException(400, "Missing the required parameter 'customerId' when calling deleteCustomer");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer/{customerId}"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{customerId}", ApiClient.urlEncode(customerId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "deleteCustomer call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Delete a Payment Method
   * Delete an existing Payment Method
   * @param environmentId  (required)
   * @param methodToken  (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePaymentMethod (String environmentId, String methodToken) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling deletePaymentMethod");
    }
    // verify the required parameter 'methodToken' is set
    if (methodToken == null) {
        throw new ApiException(400, "Missing the required parameter 'methodToken' when calling deletePaymentMethod");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer/methods/{methodToken}"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{methodToken}", ApiClient.urlEncode(methodToken.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "deletePaymentMethod call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Anonymous payment token
   * Get an anonymous payment token for a customer
   * @param environmentId  (required)
   * @param customerId  (optional)
   * @return ClientPaymentTokenDto
   * @throws ApiException if fails to make API call
   */
  public ClientPaymentTokenDto generateClientToken (String environmentId, String customerId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling generateClientToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/token"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("customerId", customerId));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "generateClientToken call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ClientPaymentTokenDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get Customer
   * Find a Payment Customer
   * @param environmentId  (required)
   * @param customerId  (required)
   * @return CustomerDto
   * @throws ApiException if fails to make API call
   */
  public CustomerDto getCustomer (String environmentId, String customerId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling getCustomer");
    }
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
        throw new ApiException(400, "Missing the required parameter 'customerId' when calling getCustomer");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("customerId", customerId));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getCustomer call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CustomerDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get Payment Method
   * Find a Payment Method for a customer
   * @param environmentId  (required)
   * @param paymentMethodToken  (required)
   * @return PaymentMethodDto
   * @throws ApiException if fails to make API call
   */
  public PaymentMethodDto getPaymentMethod (String environmentId, String paymentMethodToken) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling getPaymentMethod");
    }
    // verify the required parameter 'paymentMethodToken' is set
    if (paymentMethodToken == null) {
        throw new ApiException(400, "Missing the required parameter 'paymentMethodToken' when calling getPaymentMethod");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer/methods"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("paymentMethodToken", paymentMethodToken));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getPaymentMethod call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PaymentMethodDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get sales tax- rate and amount based on country, state, zip code and sales amount.
   * Get sales tax rate and tax amount based on country ISO code, state ISO code, zip code and sales amount.
   * @param environmentId  (required)
   * @param countryIsoCode  (required)
   * @param stateIsoCode  (required)
   * @param zipCode  (required)
   * @param isSecondaryMarketplace  (required)
   * @return SalesTaxInfoDto
   * @throws ApiException if fails to make API call
   */
  public SalesTaxInfoDto getSalesTaxInfo (String environmentId, String countryIsoCode, String stateIsoCode, String zipCode, Boolean isSecondaryMarketplace) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling getSalesTaxInfo");
    }
    // verify the required parameter 'countryIsoCode' is set
    if (countryIsoCode == null) {
        throw new ApiException(400, "Missing the required parameter 'countryIsoCode' when calling getSalesTaxInfo");
    }
    // verify the required parameter 'stateIsoCode' is set
    if (stateIsoCode == null) {
        throw new ApiException(400, "Missing the required parameter 'stateIsoCode' when calling getSalesTaxInfo");
    }
    // verify the required parameter 'zipCode' is set
    if (zipCode == null) {
        throw new ApiException(400, "Missing the required parameter 'zipCode' when calling getSalesTaxInfo");
    }
    // verify the required parameter 'isSecondaryMarketplace' is set
    if (isSecondaryMarketplace == null) {
        throw new ApiException(400, "Missing the required parameter 'isSecondaryMarketplace' when calling getSalesTaxInfo");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/tax/rate"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("countryIsoCode", countryIsoCode));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("stateIsoCode", stateIsoCode));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("zipCode", zipCode));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isSecondaryMarketplace", isSecondaryMarketplace));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getSalesTaxInfo call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SalesTaxInfoDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get Transaction Details
   * Find transaction details for a transaction id
   * @param environmentId  (required)
   * @param orderId  (required)
   * @return SalesTaxTransactionDto
   * @throws ApiException if fails to make API call
   */
  public SalesTaxTransactionDto getSalesTaxTransaction (String environmentId, String orderId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling getSalesTaxTransaction");
    }
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
        throw new ApiException(400, "Missing the required parameter 'orderId' when calling getSalesTaxTransaction");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/tax/transaction/{orderId}"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{orderId}", ApiClient.urlEncode(orderId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getSalesTaxTransaction call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SalesTaxTransactionDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Update Customer
   * Update fields on an existing Payment Customer
   * @param environmentId  (required)
   * @param updateCustomerRequest  (required)
   * @return CustomerDto
   * @throws ApiException if fails to make API call
   */
  public CustomerDto updateCustomer (String environmentId, UpdateCustomerRequest updateCustomerRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling updateCustomer");
    }
    // verify the required parameter 'updateCustomerRequest' is set
    if (updateCustomerRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateCustomerRequest' when calling updateCustomer");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateCustomerRequest);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "updateCustomer call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CustomerDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Update the default Payment Method
   * Set a payment method as a default
   * @param environmentId  (required)
   * @param updatePaymentMethodDefaultRequest  (required)
   * @return PaymentMethodDto
   * @throws ApiException if fails to make API call
   */
  public PaymentMethodDto updatePaymentMethod (String environmentId, UpdatePaymentMethodDefaultRequest updatePaymentMethodDefaultRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'environmentId' when calling updatePaymentMethod");
    }
    // verify the required parameter 'updatePaymentMethodDefaultRequest' is set
    if (updatePaymentMethodDefaultRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'updatePaymentMethodDefaultRequest' when calling updatePaymentMethod");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/payments/customer/methods/default"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updatePaymentMethodDefaultRequest);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "updatePaymentMethod call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PaymentMethodDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
