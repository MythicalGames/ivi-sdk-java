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

import games.mythical.ivi.sdk.model.CreateMythicalUserRequest;
import games.mythical.ivi.sdk.model.MythicalUserDto;
import games.mythical.ivi.sdk.model.ProfilePictureDto;
import games.mythical.ivi.sdk.model.UpdateMythicalUserRequest;
import games.mythical.ivi.sdk.model.UpdateProfilePictureRequest;

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
public class AccountsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public AccountsApi() {
    this(new ApiClient());
  }

  public AccountsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Create new mythical account
   * 
   * @param organizationId  (required)
   * @param createMythicalUserRequest  (required)
   * @return MythicalUserDto
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<MythicalUserDto> createMythicalUser (String organizationId, CreateMythicalUserRequest createMythicalUserRequest) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'organizationId' when calling createMythicalUser"));
    }
    // verify the required parameter 'createMythicalUserRequest' is set
    if (createMythicalUserRequest == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'createMythicalUserRequest' when calling createMythicalUser"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/accounts"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createMythicalUserRequest);
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
                  "createMythicalUser call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MythicalUserDto>() {})
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
   * Find mythical accounts
   * 
   * @param organizationId  (required)
   * @param email  (required)
   * @param firstName  (optional)
   * @param lastName  (optional)
   * @return List&lt;MythicalUserDto&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<List<MythicalUserDto>> findMythicalUser (String organizationId, String email, String firstName, String lastName) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'organizationId' when calling findMythicalUser"));
    }
    // verify the required parameter 'email' is set
    if (email == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'email' when calling findMythicalUser"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/accounts/search"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("email", email));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("firstName", firstName));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("lastName", lastName));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

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
                  "findMythicalUser call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<MythicalUserDto>>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * Get mythical platform user by id
   * 
   * @param organizationId  (required)
   * @param platformUserId  (required)
   * @return MythicalUserDto
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<MythicalUserDto> getMythicalUser (String organizationId, String platformUserId) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'organizationId' when calling getMythicalUser"));
    }
    // verify the required parameter 'platformUserId' is set
    if (platformUserId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'platformUserId' when calling getMythicalUser"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/accounts/{platformUserId}"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()))
        .replace("{platformUserId}", ApiClient.urlEncode(platformUserId.toString()));

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
                  "getMythicalUser call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MythicalUserDto>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * Reset user password
   * 
   * @param environmentId  (required)
   * @param platformUserId  (required)
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> resetPassword (String environmentId, String platformUserId) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling resetPassword"));
    }
    // verify the required parameter 'platformUserId' is set
    if (platformUserId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'platformUserId' when calling resetPassword"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/players/{platformUserId}/reset-password"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{platformUserId}", ApiClient.urlEncode(platformUserId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
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
                  "resetPassword call received non-success response",
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
   * Update user profile details
   * 
   * @param environmentId  (required)
   * @param platformUserId  (required)
   * @param updateMythicalUserRequest  (required)
   * @return MythicalUserDto
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<MythicalUserDto> updateProfileDetails (String environmentId, String platformUserId, UpdateMythicalUserRequest updateMythicalUserRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling updateProfileDetails"));
    }
    // verify the required parameter 'platformUserId' is set
    if (platformUserId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'platformUserId' when calling updateProfileDetails"));
    }
    // verify the required parameter 'updateMythicalUserRequest' is set
    if (updateMythicalUserRequest == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'updateMythicalUserRequest' when calling updateProfileDetails"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/players/{platformUserId}/profile"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{platformUserId}", ApiClient.urlEncode(platformUserId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateMythicalUserRequest);
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
                  "updateProfileDetails call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MythicalUserDto>() {})
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
   * Update user profile picture
   * 
   * @param environmentId  (required)
   * @param platformUserId  (required)
   * @param updateProfilePictureRequest  (required)
   * @return ProfilePictureDto
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ProfilePictureDto> updateProfilePicture (String environmentId, String platformUserId, UpdateProfilePictureRequest updateProfilePictureRequest) throws ApiException {
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'environmentId' when calling updateProfilePicture"));
    }
    // verify the required parameter 'platformUserId' is set
    if (platformUserId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'platformUserId' when calling updateProfilePicture"));
    }
    // verify the required parameter 'updateProfilePictureRequest' is set
    if (updateProfilePictureRequest == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'updateProfilePictureRequest' when calling updateProfilePicture"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/environments/{environmentId}/players/{platformUserId}/profile/picture"
        .replace("{environmentId}", ApiClient.urlEncode(environmentId.toString()))
        .replace("{platformUserId}", ApiClient.urlEncode(platformUserId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateProfilePictureRequest);
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
                  "updateProfilePicture call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ProfilePictureDto>() {})
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
