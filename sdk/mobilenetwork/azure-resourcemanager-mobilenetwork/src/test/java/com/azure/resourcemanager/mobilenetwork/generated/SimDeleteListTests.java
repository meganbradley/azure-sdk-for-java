// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.SimDeleteList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SimDeleteListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimDeleteList model = BinaryData.fromString("{\"sims\":[\"dvk\"]}").toObject(SimDeleteList.class);
        Assertions.assertEquals("dvk", model.sims().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimDeleteList model = new SimDeleteList().withSims(Arrays.asList("dvk"));
        model = BinaryData.fromObject(model).toObject(SimDeleteList.class);
        Assertions.assertEquals("dvk", model.sims().get(0));
    }
}
