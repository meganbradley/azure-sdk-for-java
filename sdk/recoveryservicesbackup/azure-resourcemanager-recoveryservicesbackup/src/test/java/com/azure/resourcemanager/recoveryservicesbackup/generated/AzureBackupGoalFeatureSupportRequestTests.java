// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureBackupGoalFeatureSupportRequest;

public final class AzureBackupGoalFeatureSupportRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupGoalFeatureSupportRequest model = BinaryData.fromString("{\"featureType\":\"AzureBackupGoals\"}")
            .toObject(AzureBackupGoalFeatureSupportRequest.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupGoalFeatureSupportRequest model = new AzureBackupGoalFeatureSupportRequest();
        model = BinaryData.fromObject(model).toObject(AzureBackupGoalFeatureSupportRequest.class);
    }
}
