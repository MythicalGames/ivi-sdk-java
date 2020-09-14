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
import games.mythical.ivi.sdk.model.AgreementDto;
import games.mythical.ivi.sdk.model.CreateAgreementRequest;
import games.mythical.ivi.sdk.model.CreatePartnerRequest;
import games.mythical.ivi.sdk.model.PartnerDto;
import games.mythical.ivi.sdk.model.UpdateAgreementRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartnersApi
 */
@Ignore
public class PartnersApiTest {

    private final PartnersApi api = new PartnersApi();

    
    /**
     * Create Agreement
     *
     * Create a new agreement for a partner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewAgreementTest() throws ApiException {
        String organizationId = null;
        String partnerId = null;
        CreateAgreementRequest createAgreementRequest = null;
        AgreementDto response = api.createNewAgreement(organizationId, partnerId, createAgreementRequest);

        // TODO: test validations
    }
    
    /**
     * Create Partner
     *
     * Create a new partner for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewPartnerTest() throws ApiException {
        String organizationId = null;
        CreatePartnerRequest createPartnerRequest = null;
        PartnerDto response = api.createNewPartner(organizationId, createPartnerRequest);

        // TODO: test validations
    }
    
    /**
     * Get Agreements
     *
     * Get all agreements for an partner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgreementsTest() throws ApiException {
        String organizationId = null;
        String partnerId = null;
        List<AgreementDto> response = api.getAgreements(organizationId, partnerId);

        // TODO: test validations
    }
    
    /**
     * Get Partners
     *
     * Get all partners for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPartnersTest() throws ApiException {
        String organizationId = null;
        List<PartnerDto> response = api.getPartners(organizationId);

        // TODO: test validations
    }
    
    /**
     * Update agreement details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAgreementTest() throws ApiException {
        String organizationId = null;
        String partnerId = null;
        UpdateAgreementRequest updateAgreementRequest = null;
        AgreementDto response = api.updateAgreement(organizationId, partnerId, updateAgreementRequest);

        // TODO: test validations
    }
    
}
