// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForDevOpsGitLabOffering;

public final class DefenderForDevOpsGitLabOfferingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForDevOpsGitLabOffering model =
            BinaryData
                .fromString("{\"offeringType\":\"DefenderForDevOpsGitLab\",\"description\":\"pp\"}")
                .toObject(DefenderForDevOpsGitLabOffering.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForDevOpsGitLabOffering model = new DefenderForDevOpsGitLabOffering();
        model = BinaryData.fromObject(model).toObject(DefenderForDevOpsGitLabOffering.class);
    }
}
