// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.DataDiskStorageTypeInfo;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import org.junit.jupiter.api.Assertions;

public final class DataDiskStorageTypeInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataDiskStorageTypeInfo model =
            BinaryData
                .fromString("{\"lun\":\"djrkvfgbvfvpd\",\"storageType\":\"Premium\"}")
                .toObject(DataDiskStorageTypeInfo.class);
        Assertions.assertEquals("djrkvfgbvfvpd", model.lun());
        Assertions.assertEquals(StorageType.PREMIUM, model.storageType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataDiskStorageTypeInfo model =
            new DataDiskStorageTypeInfo().withLun("djrkvfgbvfvpd").withStorageType(StorageType.PREMIUM);
        model = BinaryData.fromObject(model).toObject(DataDiskStorageTypeInfo.class);
        Assertions.assertEquals("djrkvfgbvfvpd", model.lun());
        Assertions.assertEquals(StorageType.PREMIUM, model.storageType());
    }
}
