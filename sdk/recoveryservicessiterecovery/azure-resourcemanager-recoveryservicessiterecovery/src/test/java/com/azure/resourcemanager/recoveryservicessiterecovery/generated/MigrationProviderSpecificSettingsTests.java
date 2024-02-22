// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationProviderSpecificSettings;

public final class MigrationProviderSpecificSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrationProviderSpecificSettings model
            = BinaryData.fromString("{\"instanceType\":\"MigrationProviderSpecificSettings\"}")
                .toObject(MigrationProviderSpecificSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrationProviderSpecificSettings model = new MigrationProviderSpecificSettings();
        model = BinaryData.fromObject(model).toObject(MigrationProviderSpecificSettings.class);
    }
}
