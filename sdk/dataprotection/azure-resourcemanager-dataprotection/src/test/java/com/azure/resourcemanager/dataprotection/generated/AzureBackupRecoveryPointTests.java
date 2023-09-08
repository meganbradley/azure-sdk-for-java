// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRecoveryPoint;

public final class AzureBackupRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupRecoveryPoint model =
            BinaryData
                .fromString("{\"objectType\":\"AzureBackupRecoveryPoint\"}")
                .toObject(AzureBackupRecoveryPoint.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupRecoveryPoint model = new AzureBackupRecoveryPoint();
        model = BinaryData.fromObject(model).toObject(AzureBackupRecoveryPoint.class);
    }
}
