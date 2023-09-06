// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dynatrace.models.MarketplaceSaaSResourceDetailsRequest;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceSaaSResourceDetailsRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceSaaSResourceDetailsRequest model =
            BinaryData.fromString("{\"tenantId\":\"a\"}").toObject(MarketplaceSaaSResourceDetailsRequest.class);
        Assertions.assertEquals("a", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceSaaSResourceDetailsRequest model = new MarketplaceSaaSResourceDetailsRequest().withTenantId("a");
        model = BinaryData.fromObject(model).toObject(MarketplaceSaaSResourceDetailsRequest.class);
        Assertions.assertEquals("a", model.tenantId());
    }
}
