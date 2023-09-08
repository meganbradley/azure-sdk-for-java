// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.KubernetesClusterPatchProperties;
import com.azure.resourcemanager.networkcloud.models.ControlPlaneNodePatchConfiguration;
import org.junit.jupiter.api.Assertions;

public final class KubernetesClusterPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesClusterPatchProperties model =
            BinaryData
                .fromString(
                    "{\"controlPlaneNodeConfiguration\":{\"count\":8867328731498350162},\"kubernetesVersion\":\"zopjhbzxliohr\"}")
                .toObject(KubernetesClusterPatchProperties.class);
        Assertions.assertEquals(8867328731498350162L, model.controlPlaneNodeConfiguration().count());
        Assertions.assertEquals("zopjhbzxliohr", model.kubernetesVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesClusterPatchProperties model =
            new KubernetesClusterPatchProperties()
                .withControlPlaneNodeConfiguration(
                    new ControlPlaneNodePatchConfiguration().withCount(8867328731498350162L))
                .withKubernetesVersion("zopjhbzxliohr");
        model = BinaryData.fromObject(model).toObject(KubernetesClusterPatchProperties.class);
        Assertions.assertEquals(8867328731498350162L, model.controlPlaneNodeConfiguration().count());
        Assertions.assertEquals("zopjhbzxliohr", model.kubernetesVersion());
    }
}
