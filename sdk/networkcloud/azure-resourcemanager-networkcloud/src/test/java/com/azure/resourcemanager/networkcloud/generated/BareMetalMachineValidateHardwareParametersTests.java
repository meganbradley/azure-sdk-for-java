// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineHardwareValidationCategory;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineValidateHardwareParameters;
import org.junit.jupiter.api.Assertions;

public final class BareMetalMachineValidateHardwareParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BareMetalMachineValidateHardwareParameters model =
            BinaryData
                .fromString("{\"validationCategory\":\"BasicValidation\"}")
                .toObject(BareMetalMachineValidateHardwareParameters.class);
        Assertions
            .assertEquals(BareMetalMachineHardwareValidationCategory.BASIC_VALIDATION, model.validationCategory());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BareMetalMachineValidateHardwareParameters model =
            new BareMetalMachineValidateHardwareParameters()
                .withValidationCategory(BareMetalMachineHardwareValidationCategory.BASIC_VALIDATION);
        model = BinaryData.fromObject(model).toObject(BareMetalMachineValidateHardwareParameters.class);
        Assertions
            .assertEquals(BareMetalMachineHardwareValidationCategory.BASIC_VALIDATION, model.validationCategory());
    }
}
