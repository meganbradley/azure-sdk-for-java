// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkResource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"xzvlvqhjkbegib\",\"requiredMembers\":[\"xiebwwaloayqcg\",\"rtzju\"],\"requiredZoneNames\":[\"yzm\",\"txon\",\"mtsavjcbpwxqp\"]},\"id\":\"knftguvriuh\",\"name\":\"rwmdyvxqtay\",\"type\":\"iwwroyqbexrmc\"}],\"nextLink\":\"bycnojvkn\"}")
                .toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("yzm", model.value().get(0).requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceListResultInner model =
            new PrivateLinkResourceListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResource()
                                .withRequiredZoneNames(Arrays.asList("yzm", "txon", "mtsavjcbpwxqp"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("yzm", model.value().get(0).requiredZoneNames().get(0));
    }
}
