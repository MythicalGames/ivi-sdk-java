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

import games.mythical.ivi.sdk.ApiException;
import games.mythical.ivi.sdk.model.CreateWebhookRequest;
import games.mythical.ivi.sdk.model.UpdateWebhookRequest;
import games.mythical.ivi.sdk.model.WebhookDto;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Create webhook
     *
     * Define a new webhook that will be called to inform a game backend of platform events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewWebhookTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //CreateWebhookRequest createWebhookRequest = null;
        //
        //WebhookDto response = api.createNewWebhook(environmentId, createWebhookRequest);

        // TODO: test validations
    }
    /**
     * Delete webhook
     *
     * Delete a webhook
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String webhookId = null;
        //
        //api.deleteWebhook(environmentId, webhookId);

        // TODO: test validations
    }
    /**
     * Disable webhook
     *
     * Set a webhook to disabled.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableWebhookTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String webhookId = null;
        //
        //api.disableWebhook(environmentId, webhookId);

        // TODO: test validations
    }
    /**
     * Enable webhook
     *
     * Set a webhook to enabled.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableWebhookTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String webhookId = null;
        //
        //api.enableWebhook(environmentId, webhookId);

        // TODO: test validations
    }
    /**
     * Get webhook
     *
     * Get details for a webhook
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String webhookId = null;
        //
        //WebhookDto response = api.getWebhook(environmentId, webhookId);

        // TODO: test validations
    }
    /**
     * Get all webhooks for environment
     *
     * Get details for all webhooks defined for this environment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhooksForTitleIdTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //List<WebhookDto> response = api.getWebhooksForTitleId(environmentId);

        // TODO: test validations
    }
    /**
     * Update webhook
     *
     * Update an existing webhook. All details must be included in the request, not just what is being updated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws ApiException {
        //
        //String environmentId = null;
        //
        //String webhookId = null;
        //
        //UpdateWebhookRequest updateWebhookRequest = null;
        //
        //WebhookDto response = api.updateWebhook(environmentId, webhookId, updateWebhookRequest);

        // TODO: test validations
    }
}
