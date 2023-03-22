// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.RegionInfoAvailabilityZoneMappingsItem;
import org.junit.jupiter.api.Assertions;

public final class RegionInfoAvailabilityZoneMappingsItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionInfoAvailabilityZoneMappingsItem model =
            BinaryData
                .fromString("{\"availabilityZone\":\"pg\",\"isAvailable\":false}")
                .toObject(RegionInfoAvailabilityZoneMappingsItem.class);
        Assertions.assertEquals("pg", model.availabilityZone());
        Assertions.assertEquals(false, model.isAvailable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionInfoAvailabilityZoneMappingsItem model =
            new RegionInfoAvailabilityZoneMappingsItem().withAvailabilityZone("pg").withIsAvailable(false);
        model = BinaryData.fromObject(model).toObject(RegionInfoAvailabilityZoneMappingsItem.class);
        Assertions.assertEquals("pg", model.availabilityZone());
        Assertions.assertEquals(false, model.isAvailable());
    }
}
