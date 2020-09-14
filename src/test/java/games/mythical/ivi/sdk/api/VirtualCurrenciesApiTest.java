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

import games.mythical.ivi.sdk.invoker.ApiException;
import games.mythical.ivi.sdk.model.CreateVirtualCurrencyRequest;
import games.mythical.ivi.sdk.model.VirtualCurrencyDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VirtualCurrenciesApi
 */
@Ignore
public class VirtualCurrenciesApiTest {

    private final VirtualCurrenciesApi api = new VirtualCurrenciesApi();

    
    /**
     * Add new virtual currency to environment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSupportedCurrencyForEnvironmentTest() throws ApiException {
        String environmentId = null;
        CreateVirtualCurrencyRequest createVirtualCurrencyRequest = null;
        VirtualCurrencyDto response = api.addSupportedCurrencyForEnvironment(environmentId, createVirtualCurrencyRequest);

        // TODO: test validations
    }
    
    /**
     * Delete virtual currency for environment by abbreviation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSupportedCurrencyByAbbreviationTest() throws ApiException {
        String environmentId = null;
        String abbreviation = null;
        api.deleteSupportedCurrencyByAbbreviation(environmentId, abbreviation);

        // TODO: test validations
    }
    
    /**
     * Get virtual currency for environment by abbreviation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedCurrencyByAbbreviationTest() throws ApiException {
        String environmentId = null;
        String abbreviation = null;
        VirtualCurrencyDto response = api.getSupportedCurrencyByAbbreviation(environmentId, abbreviation);

        // TODO: test validations
    }
    
    /**
     * Get virtual currencies defined for environment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedCurrencyForEnvironmentTest() throws ApiException {
        String environmentId = null;
        List<VirtualCurrencyDto> response = api.getSupportedCurrencyForEnvironment(environmentId);

        // TODO: test validations
    }
    
}
