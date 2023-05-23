// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceHardwareValidationCategory;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceValidateHardwareParameters;
import org.junit.jupiter.api.Assertions;

public final class StorageApplianceValidateHardwareParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageApplianceValidateHardwareParameters model =
            BinaryData
                .fromString("{\"validationCategory\":\"BasicValidation\"}")
                .toObject(StorageApplianceValidateHardwareParameters.class);
        Assertions
            .assertEquals(StorageApplianceHardwareValidationCategory.BASIC_VALIDATION, model.validationCategory());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageApplianceValidateHardwareParameters model =
            new StorageApplianceValidateHardwareParameters()
                .withValidationCategory(StorageApplianceHardwareValidationCategory.BASIC_VALIDATION);
        model = BinaryData.fromObject(model).toObject(StorageApplianceValidateHardwareParameters.class);
        Assertions
            .assertEquals(StorageApplianceHardwareValidationCategory.BASIC_VALIDATION, model.validationCategory());
    }
}
