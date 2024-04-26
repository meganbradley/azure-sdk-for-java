// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.models.AdditionalAttributesPatch;
import com.azure.resourcemanager.quota.models.EnvironmentType;
import com.azure.resourcemanager.quota.models.GroupingId;
import com.azure.resourcemanager.quota.models.GroupingIdType;
import com.azure.resourcemanager.quota.models.GroupQuotasEntityBasePatch;
import com.azure.resourcemanager.quota.models.GroupQuotasEntityPatch;
import org.junit.jupiter.api.Assertions;

public final class GroupQuotasEntityPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupQuotasEntityPatch model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":\"xrifkwmrvkts\",\"additionalAttributes\":{\"groupId\":{\"groupingIdType\":\"BillingId\",\"value\":\"ipa\"},\"environment\":\"NonProduction\"},\"provisioningState\":\"Succeeded\"},\"id\":\"qucmpo\",\"name\":\"fdkfogk\",\"type\":\"ygjofjdd\"}")
            .toObject(GroupQuotasEntityPatch.class);
        Assertions.assertEquals("xrifkwmrvkts", model.properties().displayName());
        Assertions.assertEquals(GroupingIdType.BILLING_ID,
            model.properties().additionalAttributes().groupId().groupingIdType());
        Assertions.assertEquals("ipa", model.properties().additionalAttributes().groupId().value());
        Assertions.assertEquals(EnvironmentType.NON_PRODUCTION,
            model.properties().additionalAttributes().environment());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupQuotasEntityPatch model = new GroupQuotasEntityPatch()
            .withProperties(new GroupQuotasEntityBasePatch().withDisplayName("xrifkwmrvkts")
                .withAdditionalAttributes(new AdditionalAttributesPatch()
                    .withGroupId(new GroupingId().withGroupingIdType(GroupingIdType.BILLING_ID).withValue("ipa"))
                    .withEnvironment(EnvironmentType.NON_PRODUCTION)));
        model = BinaryData.fromObject(model).toObject(GroupQuotasEntityPatch.class);
        Assertions.assertEquals("xrifkwmrvkts", model.properties().displayName());
        Assertions.assertEquals(GroupingIdType.BILLING_ID,
            model.properties().additionalAttributes().groupId().groupingIdType());
        Assertions.assertEquals("ipa", model.properties().additionalAttributes().groupId().value());
        Assertions.assertEquals(EnvironmentType.NON_PRODUCTION,
            model.properties().additionalAttributes().environment());
    }
}
