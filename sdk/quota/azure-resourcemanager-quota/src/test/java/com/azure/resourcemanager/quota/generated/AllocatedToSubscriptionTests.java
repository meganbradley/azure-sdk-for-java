// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.models.AllocatedToSubscription;
import org.junit.jupiter.api.Assertions;

public final class AllocatedToSubscriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllocatedToSubscription model
            = BinaryData.fromString("{\"subscriptionId\":\"o\",\"quotaAllocated\":1618958611063103358}")
                .toObject(AllocatedToSubscription.class);
        Assertions.assertEquals("o", model.subscriptionId());
        Assertions.assertEquals(1618958611063103358L, model.quotaAllocated());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllocatedToSubscription model
            = new AllocatedToSubscription().withSubscriptionId("o").withQuotaAllocated(1618958611063103358L);
        model = BinaryData.fromObject(model).toObject(AllocatedToSubscription.class);
        Assertions.assertEquals("o", model.subscriptionId());
        Assertions.assertEquals(1618958611063103358L, model.quotaAllocated());
    }
}
