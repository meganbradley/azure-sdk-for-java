// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.WebTestPropertiesValidationRulesContentValidation;
import org.junit.jupiter.api.Assertions;

public final class WebTestPropertiesValidationRulesContentValidationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebTestPropertiesValidationRulesContentValidation model =
            BinaryData
                .fromString("{\"ContentMatch\":\"ureximoryocfs\",\"IgnoreCase\":false,\"PassIfTextFound\":true}")
                .toObject(WebTestPropertiesValidationRulesContentValidation.class);
        Assertions.assertEquals("ureximoryocfs", model.contentMatch());
        Assertions.assertEquals(false, model.ignoreCase());
        Assertions.assertEquals(true, model.passIfTextFound());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebTestPropertiesValidationRulesContentValidation model =
            new WebTestPropertiesValidationRulesContentValidation()
                .withContentMatch("ureximoryocfs")
                .withIgnoreCase(false)
                .withPassIfTextFound(true);
        model = BinaryData.fromObject(model).toObject(WebTestPropertiesValidationRulesContentValidation.class);
        Assertions.assertEquals("ureximoryocfs", model.contentMatch());
        Assertions.assertEquals(false, model.ignoreCase());
        Assertions.assertEquals(true, model.passIfTextFound());
    }
}
