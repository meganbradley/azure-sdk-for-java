// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworkPropertiesInfraVnetProfileHci;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkPropertiesInfraVnetProfileHciTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkPropertiesInfraVnetProfileHci model
            = BinaryData.fromString("{\"mocGroup\":\"tgqr\",\"mocLocation\":\"tmuwlauwzi\",\"mocVnetName\":\"bm\"}")
                .toObject(VirtualNetworkPropertiesInfraVnetProfileHci.class);
        Assertions.assertEquals("tgqr", model.mocGroup());
        Assertions.assertEquals("tmuwlauwzi", model.mocLocation());
        Assertions.assertEquals("bm", model.mocVnetName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkPropertiesInfraVnetProfileHci model = new VirtualNetworkPropertiesInfraVnetProfileHci()
            .withMocGroup("tgqr").withMocLocation("tmuwlauwzi").withMocVnetName("bm");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkPropertiesInfraVnetProfileHci.class);
        Assertions.assertEquals("tgqr", model.mocGroup());
        Assertions.assertEquals("tmuwlauwzi", model.mocLocation());
        Assertions.assertEquals("bm", model.mocVnetName());
    }
}
