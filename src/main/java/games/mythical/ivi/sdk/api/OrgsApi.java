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

import games.mythical.ivi.sdk.model.CreateTitleRequest;
import games.mythical.ivi.sdk.model.InviteDto;
import games.mythical.ivi.sdk.model.InviteUserToOrganizationRequest;
import games.mythical.ivi.sdk.model.OrganizationDto;
import games.mythical.ivi.sdk.model.PartnerDto;
import games.mythical.ivi.sdk.model.TitleDto;
import games.mythical.ivi.sdk.model.UpdateOrganizationRequest;
import games.mythical.ivi.sdk.model.UpdateOrganizationRoleRequest;
import games.mythical.ivi.sdk.model.UpdatePartnerRequest;
import games.mythical.ivi.sdk.model.UserDto;

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


@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-15T09:19:26.551556-07:00[America/Los_Angeles]")
public class OrgsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public OrgsApi() {
    this(new ApiClient());
  }

  public OrgsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Accept an invitation to organization
   * 
   * @param organizationId  (required)
   * @param inviteId  (required)
   * @throws ApiException if fails to make API call
   */
  public void acceptInvitation (String organizationId, String inviteId) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling acceptInvitation");
    }
    // verify the required parameter 'inviteId' is set
    if (inviteId == null) {
        throw new ApiException(400, "Missing the required parameter 'inviteId' when calling acceptInvitation");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/invites/{inviteId}/accept"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()))
        .replace("{inviteId}", ApiClient.urlEncode(inviteId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
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
              "acceptInvitation call received non-success response",
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
   * Create title
   * Create a new title in this organization.
   * @param organizationId  (required)
   * @param createTitleRequest  (required)
   * @return TitleDto
   * @throws ApiException if fails to make API call
   */
  public TitleDto createNewTitle (String organizationId, CreateTitleRequest createTitleRequest) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling createNewTitle");
    }
    // verify the required parameter 'createTitleRequest' is set
    if (createTitleRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'createTitleRequest' when calling createNewTitle");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/titles"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createTitleRequest);
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
              "createNewTitle call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TitleDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get organization
   * Get organization by id
   * @param organizationId  (required)
   * @return OrganizationDto
   * @throws ApiException if fails to make API call
   */
  public OrganizationDto getOrg (String organizationId) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrg");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

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
              "getOrg call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<OrganizationDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get organization pending invites
   * 
   * @param organizationId  (required)
   * @return List&lt;InviteDto&gt;
   * @throws ApiException if fails to make API call
   */
  public List<InviteDto> getPendingInvites (String organizationId) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getPendingInvites");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/invites"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

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
              "getPendingInvites call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<InviteDto>>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get titles
   * Get titles for organization
   * @param organizationId  (required)
   * @param includeInactive  (optional, default to true)
   * @return List&lt;TitleDto&gt;
   * @throws ApiException if fails to make API call
   */
  public List<TitleDto> getTitles (String organizationId, Boolean includeInactive) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getTitles");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/titles"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("includeInactive", includeInactive));

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
              "getTitles call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<TitleDto>>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get users
   * Get users for organization
   * @param organizationId  (required)
   * @return List&lt;UserDto&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UserDto> getUsersForOrganization (String organizationId) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getUsersForOrganization");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/users"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

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
              "getUsersForOrganization call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<UserDto>>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Invite a user to organization
   * 
   * @param organizationId  (required)
   * @param inviteUserToOrganizationRequest  (required)
   * @return List&lt;InviteDto&gt;
   * @throws ApiException if fails to make API call
   */
  public List<InviteDto> inviteUserToOrg (String organizationId, List<InviteUserToOrganizationRequest> inviteUserToOrganizationRequest) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling inviteUserToOrg");
    }
    // verify the required parameter 'inviteUserToOrganizationRequest' is set
    if (inviteUserToOrganizationRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'inviteUserToOrganizationRequest' when calling inviteUserToOrg");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/invites"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(inviteUserToOrganizationRequest);
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
              "inviteUserToOrg call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<InviteDto>>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Update organization details
   * 
   * @param organizationId  (required)
   * @param updateOrganizationRequest  (required)
   * @return OrganizationDto
   * @throws ApiException if fails to make API call
   */
  public OrganizationDto updateOrg (String organizationId, UpdateOrganizationRequest updateOrganizationRequest) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling updateOrg");
    }
    // verify the required parameter 'updateOrganizationRequest' is set
    if (updateOrganizationRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateOrganizationRequest' when calling updateOrg");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateOrganizationRequest);
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
              "updateOrg call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<OrganizationDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Update organization user role
   * 
   * @param organizationId  (required)
   * @param platformUserId  (required)
   * @param updateOrganizationRoleRequest  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrgRole (String organizationId, String platformUserId, UpdateOrganizationRoleRequest updateOrganizationRoleRequest) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling updateOrgRole");
    }
    // verify the required parameter 'platformUserId' is set
    if (platformUserId == null) {
        throw new ApiException(400, "Missing the required parameter 'platformUserId' when calling updateOrgRole");
    }
    // verify the required parameter 'updateOrganizationRoleRequest' is set
    if (updateOrganizationRoleRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateOrganizationRoleRequest' when calling updateOrgRole");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/{platformUserId}/role"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()))
        .replace("{platformUserId}", ApiClient.urlEncode(platformUserId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateOrganizationRoleRequest);
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
              "updateOrgRole call received non-success response",
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
   * Update partner details
   * 
   * @param organizationId  (required)
   * @param updatePartnerRequest  (required)
   * @return PartnerDto
   * @throws ApiException if fails to make API call
   */
  public PartnerDto updatePartner (String organizationId, UpdatePartnerRequest updatePartnerRequest) throws ApiException {
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling updatePartner");
    }
    // verify the required parameter 'updatePartnerRequest' is set
    if (updatePartnerRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'updatePartnerRequest' when calling updatePartner");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/orgs/{organizationId}/partner"
        .replace("{organizationId}", ApiClient.urlEncode(organizationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updatePartnerRequest);
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
              "updatePartner call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PartnerDto>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
