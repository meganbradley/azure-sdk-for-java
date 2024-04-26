// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileSubscriptionStatus;
import com.azure.resourcemanager.hybridcompute.models.ProductFeature;
import org.junit.jupiter.api.Assertions;

public final class ProductFeatureTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductFeature model = BinaryData.fromString(
            "{\"name\":\"rhpdjpjumas\",\"subscriptionStatus\":\"Unknown\",\"billingStartDate\":\"2021-05-13T06:58:13Z\",\"enrollmentDate\":\"2021-03-30T03:12:08Z\",\"disenrollmentDate\":\"2021-10-08T22:25:54Z\"}")
            .toObject(ProductFeature.class);
        Assertions.assertEquals("rhpdjpjumas", model.name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatus.UNKNOWN, model.subscriptionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductFeature model = new ProductFeature().withName("rhpdjpjumas")
            .withSubscriptionStatus(LicenseProfileSubscriptionStatus.UNKNOWN);
        model = BinaryData.fromObject(model).toObject(ProductFeature.class);
        Assertions.assertEquals("rhpdjpjumas", model.name());
        Assertions.assertEquals(LicenseProfileSubscriptionStatus.UNKNOWN, model.subscriptionStatus());
    }
}
