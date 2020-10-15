/*
 * IVI Engine
 * IVI Engine
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 * Contact: developer@mythical.games
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package games.mythical.ivi.sdk.api;

import games.mythical.ivi.sdk.model.CreateEnvironmentInstanceRequest;
import games.mythical.ivi.sdk.model.CreateTitleRequest;
import games.mythical.ivi.sdk.model.EnvironmentInstanceDto;
import games.mythical.ivi.sdk.model.TitleDto;
import games.mythical.ivi.sdk.IVIException;

import org.junit.Test;
import org.junit.Ignore;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

/**
* API tests for TitlesApi
*/
@Ignore
public class TitlesApiTest {

private final TitlesApi api = new TitlesApi();


    /**
    * Create environment instance for title
    *
    * Create new environment instance for a title
    *
    * @throws IVIException
    *          if the Api call fails
    */
    @Test
    public void addEnvironmentInstanceTest() {
        String titleId = null;
        CreateEnvironmentInstanceRequest createEnvironmentInstanceRequest = null;
    EnvironmentInstanceDto response = api.addEnvironmentInstance(titleId, createEnvironmentInstanceRequest);

        // TODO: test validations
        }

    /**
    * Get environment instances for title
    *
    * Get environment instances for a title
    *
    * @throws IVIException
    *          if the Api call fails
    */
    @Test
    public void getEnvironmentInstancesForTitleTest() {
        String titleId = null;
        Boolean includeInactive = null;
    List<EnvironmentInstanceDto> response = api.getEnvironmentInstancesForTitle(titleId, includeInactive);

        // TODO: test validations
        }

    /**
    * Get title
    *
    * Get title details
    *
    * @throws IVIException
    *          if the Api call fails
    */
    @Test
    public void getTitleByIdTest() {
        String titleId = null;
    TitleDto response = api.getTitleById(titleId);

        // TODO: test validations
        }

    /**
    * Set title to activated
    *
    * 
    *
    * @throws IVIException
    *          if the Api call fails
    */
    @Test
    public void setTitleActiveTest() {
        String titleId = null;
    api.setTitleActive(titleId);

        // TODO: test validations
        }

    /**
    * Set title to deactivated
    *
    * 
    *
    * @throws IVIException
    *          if the Api call fails
    */
    @Test
    public void setTitleInactiveTest() {
        String titleId = null;
    api.setTitleInactive(titleId);

        // TODO: test validations
        }

    /**
    * Update title
    *
    * Update title name.
    *
    * @throws IVIException
    *          if the Api call fails
    */
    @Test
    public void updateTitleTest() {
        String titleId = null;
        CreateTitleRequest createTitleRequest = null;
    api.updateTitle(titleId, createTitleRequest);

        // TODO: test validations
        }

    }
