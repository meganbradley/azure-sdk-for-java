// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.PartnerEventSubscriptionDestination;
import org.junit.jupiter.api.Assertions;

public final class PartnerEventSubscriptionDestinationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerEventSubscriptionDestination model = BinaryData
            .fromString("{\"endpointType\":\"PartnerDestination\",\"properties\":{\"resourceId\":\"bfvxovqkxiuxq\"}}")
            .toObject(PartnerEventSubscriptionDestination.class);
        Assertions.assertEquals("bfvxovqkxiuxq", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerEventSubscriptionDestination model
            = new PartnerEventSubscriptionDestination().withResourceId("bfvxovqkxiuxq");
        model = BinaryData.fromObject(model).toObject(PartnerEventSubscriptionDestination.class);
        Assertions.assertEquals("bfvxovqkxiuxq", model.resourceId());
    }
}
