// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OraclePartitionSettings;

public final class OraclePartitionSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OraclePartitionSettings model = BinaryData.fromString(
            "{\"partitionNames\":\"datajugoazzyz\",\"partitionColumnName\":\"datawuzanpoyrqjoniln\",\"partitionUpperBound\":\"datazest\",\"partitionLowerBound\":\"datacloq\"}")
            .toObject(OraclePartitionSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OraclePartitionSettings model = new OraclePartitionSettings().withPartitionNames("datajugoazzyz")
            .withPartitionColumnName("datawuzanpoyrqjoniln").withPartitionUpperBound("datazest")
            .withPartitionLowerBound("datacloq");
        model = BinaryData.fromObject(model).toObject(OraclePartitionSettings.class);
    }
}
