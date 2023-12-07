// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.KubernetesVersionCapabilities;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class KubernetesVersionCapabilitiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesVersionCapabilities model = BinaryData
            .fromString("{\"supportPlan\":[\"sxnkjzkdeslpvlo\",\"wiyighxpkdw\",\"baiuebbaumny\",\"upedeojnabckhs\"]}")
            .toObject(KubernetesVersionCapabilities.class);
        Assertions.assertEquals("sxnkjzkdeslpvlo", model.supportPlan().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesVersionCapabilities model = new KubernetesVersionCapabilities()
            .withSupportPlan(Arrays.asList("sxnkjzkdeslpvlo", "wiyighxpkdw", "baiuebbaumny", "upedeojnabckhs"));
        model = BinaryData.fromObject(model).toObject(KubernetesVersionCapabilities.class);
        Assertions.assertEquals("sxnkjzkdeslpvlo", model.supportPlan().get(0));
    }
}
