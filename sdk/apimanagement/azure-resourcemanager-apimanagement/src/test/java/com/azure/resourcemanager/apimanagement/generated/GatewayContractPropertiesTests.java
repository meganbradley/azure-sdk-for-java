// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayContractProperties;
import com.azure.resourcemanager.apimanagement.models.ResourceLocationDataContract;
import org.junit.jupiter.api.Assertions;

public final class GatewayContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayContractProperties model =
            BinaryData
                .fromString(
                    "{\"locationData\":{\"name\":\"xkf\",\"city\":\"oaqymhcctopuowyr\",\"district\":\"kbyhqu\",\"countryOrRegion\":\"zygxvha\"},\"description\":\"xecxqnwh\"}")
                .toObject(GatewayContractProperties.class);
        Assertions.assertEquals("xkf", model.locationData().name());
        Assertions.assertEquals("oaqymhcctopuowyr", model.locationData().city());
        Assertions.assertEquals("kbyhqu", model.locationData().district());
        Assertions.assertEquals("zygxvha", model.locationData().countryOrRegion());
        Assertions.assertEquals("xecxqnwh", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayContractProperties model =
            new GatewayContractProperties()
                .withLocationData(
                    new ResourceLocationDataContract()
                        .withName("xkf")
                        .withCity("oaqymhcctopuowyr")
                        .withDistrict("kbyhqu")
                        .withCountryOrRegion("zygxvha"))
                .withDescription("xecxqnwh");
        model = BinaryData.fromObject(model).toObject(GatewayContractProperties.class);
        Assertions.assertEquals("xkf", model.locationData().name());
        Assertions.assertEquals("oaqymhcctopuowyr", model.locationData().city());
        Assertions.assertEquals("kbyhqu", model.locationData().district());
        Assertions.assertEquals("zygxvha", model.locationData().countryOrRegion());
        Assertions.assertEquals("xecxqnwh", model.description());
    }
}
