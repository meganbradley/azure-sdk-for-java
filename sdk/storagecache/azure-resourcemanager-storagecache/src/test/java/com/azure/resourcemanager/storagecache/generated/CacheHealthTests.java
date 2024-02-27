// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.CacheHealth;
import com.azure.resourcemanager.storagecache.models.HealthStateType;
import org.junit.jupiter.api.Assertions;

public final class CacheHealthTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CacheHealth model = BinaryData.fromString(
            "{\"state\":\"Stopping\",\"statusDescription\":\"gwyzm\",\"conditions\":[{\"timestamp\":\"2021-03-28T18:58:28Z\",\"message\":\"mtsavjcbpwxqp\"},{\"timestamp\":\"2021-07-31T13:26:15Z\",\"message\":\"ftguv\"},{\"timestamp\":\"2021-11-24T12:31:24Z\",\"message\":\"prwmdyvxqt\"},{\"timestamp\":\"2021-09-21T09:24:54Z\",\"message\":\"ww\"}]}")
            .toObject(CacheHealth.class);
        Assertions.assertEquals(HealthStateType.STOPPING, model.state());
        Assertions.assertEquals("gwyzm", model.statusDescription());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CacheHealth model = new CacheHealth().withState(HealthStateType.STOPPING).withStatusDescription("gwyzm");
        model = BinaryData.fromObject(model).toObject(CacheHealth.class);
        Assertions.assertEquals(HealthStateType.STOPPING, model.state());
        Assertions.assertEquals("gwyzm", model.statusDescription());
    }
}
