// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueUpdateContractProperties;
import com.azure.resourcemanager.apimanagement.models.State;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class IssueUpdateContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueUpdateContractProperties model =
            BinaryData
                .fromString(
                    "{\"title\":\"ru\",\"description\":\"igsyeipqdsmjt\",\"userId\":\"qgdgkkile\",\"createdDate\":\"2021-11-10T16:23:27Z\",\"state\":\"removed\",\"apiId\":\"knh\"}")
                .toObject(IssueUpdateContractProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-10T16:23:27Z"), model.createdDate());
        Assertions.assertEquals(State.REMOVED, model.state());
        Assertions.assertEquals("knh", model.apiId());
        Assertions.assertEquals("ru", model.title());
        Assertions.assertEquals("igsyeipqdsmjt", model.description());
        Assertions.assertEquals("qgdgkkile", model.userId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueUpdateContractProperties model =
            new IssueUpdateContractProperties()
                .withCreatedDate(OffsetDateTime.parse("2021-11-10T16:23:27Z"))
                .withState(State.REMOVED)
                .withApiId("knh")
                .withTitle("ru")
                .withDescription("igsyeipqdsmjt")
                .withUserId("qgdgkkile");
        model = BinaryData.fromObject(model).toObject(IssueUpdateContractProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-10T16:23:27Z"), model.createdDate());
        Assertions.assertEquals(State.REMOVED, model.state());
        Assertions.assertEquals("knh", model.apiId());
        Assertions.assertEquals("ru", model.title());
        Assertions.assertEquals("igsyeipqdsmjt", model.description());
        Assertions.assertEquals("qgdgkkile", model.userId());
    }
}
