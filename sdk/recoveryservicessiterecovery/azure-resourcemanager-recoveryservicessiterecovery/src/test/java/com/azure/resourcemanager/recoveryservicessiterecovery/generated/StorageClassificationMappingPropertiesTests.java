// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingProperties;
import org.junit.jupiter.api.Assertions;

public final class StorageClassificationMappingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageClassificationMappingProperties model =
            BinaryData
                .fromString("{\"targetStorageClassificationId\":\"flbqvgaq\"}")
                .toObject(StorageClassificationMappingProperties.class);
        Assertions.assertEquals("flbqvgaq", model.targetStorageClassificationId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageClassificationMappingProperties model =
            new StorageClassificationMappingProperties().withTargetStorageClassificationId("flbqvgaq");
        model = BinaryData.fromObject(model).toObject(StorageClassificationMappingProperties.class);
        Assertions.assertEquals("flbqvgaq", model.targetStorageClassificationId());
    }
}
