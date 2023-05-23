// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.fluent.models.DeletedConfigurationStoreProperties;

public final class DeletedConfigurationStorePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeletedConfigurationStoreProperties model =
            BinaryData
                .fromString(
                    "{\"configurationStoreId\":\"epcyvahfnlj\",\"location\":\"qxj\",\"deletionDate\":\"2021-01-29T11:34:22Z\",\"scheduledPurgeDate\":\"2021-01-04T05:40:41Z\",\"tags\":{\"yoxgvcltbgsnc\":\"dokgjl\",\"htxfvgxbfsmxnehm\":\"hkjeszzhbi\"},\"purgeProtectionEnabled\":false}")
                .toObject(DeletedConfigurationStoreProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeletedConfigurationStoreProperties model = new DeletedConfigurationStoreProperties();
        model = BinaryData.fromObject(model).toObject(DeletedConfigurationStoreProperties.class);
    }
}
