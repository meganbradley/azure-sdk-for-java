// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.VMResourcesInner;
import com.azure.resourcemanager.elastic.models.VMHostListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VMHostListResponseTests {
    @Test
    public void testDeserialize() {
        VMHostListResponse model =
            BinaryData
                .fromString("{\"value\":[{\"vmResourceId\":\"uhrzayvvt\"}],\"nextLink\":\"vdfgiotk\"}")
                .toObject(VMHostListResponse.class);
        Assertions.assertEquals("uhrzayvvt", model.value().get(0).vmResourceId());
        Assertions.assertEquals("vdfgiotk", model.nextLink());
    }

    @Test
    public void testSerialize() {
        VMHostListResponse model =
            new VMHostListResponse()
                .withValue(Arrays.asList(new VMResourcesInner().withVmResourceId("uhrzayvvt")))
                .withNextLink("vdfgiotk");
        model = BinaryData.fromObject(model).toObject(VMHostListResponse.class);
        Assertions.assertEquals("uhrzayvvt", model.value().get(0).vmResourceId());
        Assertions.assertEquals("vdfgiotk", model.nextLink());
    }
}
