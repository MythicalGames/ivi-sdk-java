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

import games.mythical.ivi.sdk.model.CreateWebhookRequest;
import games.mythical.ivi.sdk.model.UpdateWebhookRequest;
import games.mythical.ivi.sdk.model.WebhookDto;

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

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T00:43:19.928192-07:00[America/Los_Angeles]")
public class WebhooksApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public WebhooksApi() {
    this(new ApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Create webhook
   * Define a new webhook that will be called to inform a game backend of platform events.
   * @param environmentId  (required)
   * @param createWebhookRequest  (required)
   * @return WebhookDto
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<WebhookDto> createNewWebhook (String environmentId, CreateWebhookRequest createWebhookRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling createNewWebhook"));
    }
    // verify the required parameter 'createWebhookRequest' is set
    if (createWebhookRequest == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'createWebhookRequest' when calling createNewWebhook"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/webhooks"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createWebhookRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "createNewWebhook call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebhookDto>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
    } catch (IOException e) {
      return CompletableFuture.failedFuture(new ApiException(e));
    }
  }
  /**
   * Delete webhook
   * Delete a webhook
   * @param environmentId  (required)
   * @param webhookId  (required)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> deleteWebhook (String environmentId, String webhookId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling deleteWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'webhookId' when calling deleteWebhook"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/webhooks/{webhookId}"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{webhookId}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "deleteWebhook call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          null
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * Disable webhook
   * Set a webhook to disabled.
   * @param environmentId  (required)
   * @param webhookId  (required)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> disableWebhook (String environmentId, String webhookId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling disableWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'webhookId' when calling disableWebhook"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/webhooks/{webhookId}/disable"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{webhookId}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "disableWebhook call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          null
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * Enable webhook
   * Set a webhook to enabled.
   * @param environmentId  (required)
   * @param webhookId  (required)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> enableWebhook (String environmentId, String webhookId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling enableWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'webhookId' when calling enableWebhook"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/webhooks/{webhookId}/enable"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{webhookId}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "enableWebhook call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          null
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * Get webhook
   * Get details for a webhook
   * @param environmentId  (required)
   * @param webhookId  (required)
   * @return WebhookDto
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<WebhookDto> getWebhook (String environmentId, String webhookId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling getWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'webhookId' when calling getWebhook"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/webhooks/{webhookId}"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{webhookId}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "getWebhook call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebhookDto>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * Get all webhooks for environment
   * Get details for all webhooks defined for this environment.
   * @param environmentId  (required)
   * @return List&lt;WebhookDto&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<List<WebhookDto>> getWebhooksForTitleId (String environmentId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling getWebhooksForTitleId"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/webhooks"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "getWebhooksForTitleId call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<WebhookDto>>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * Update webhook
   * Update an existing webhook. All details must be included in the request, not just what is being updated.
   * @param environmentId  (required)
   * @param webhookId  (required)
   * @param updateWebhookRequest  (required)
   * @return WebhookDto
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<WebhookDto> updateWebhook (String environmentId, String webhookId, UpdateWebhookRequest updateWebhookRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling updateWebhook"));
    }
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'webhookId' when calling updateWebhook"));
    }
    // verify the required parameter 'updateWebhookRequest' is set
    if (updateWebhookRequest == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'updateWebhookRequest' when calling updateWebhook"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/webhooks/{webhookId}"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{webhookId}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateWebhookRequest);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "updateWebhook call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebhookDto>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
    } catch (IOException e) {
      return CompletableFuture.failedFuture(new ApiException(e));
    }
  }
}
