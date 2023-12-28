// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueCommentContractInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class IssueCommentContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueCommentContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"text\":\"kuwxeoiojfizfavk\",\"createdDate\":\"2020-12-30T15:26:53Z\",\"userId\":\"fbcyaykmm\"},\"id\":\"zs\",\"name\":\"fwxrzxmdew\",\"type\":\"rsxkr\"}")
                .toObject(IssueCommentContractInner.class);
        Assertions.assertEquals("kuwxeoiojfizfavk", model.text());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T15:26:53Z"), model.createdDate());
        Assertions.assertEquals("fbcyaykmm", model.userId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueCommentContractInner model =
            new IssueCommentContractInner()
                .withText("kuwxeoiojfizfavk")
                .withCreatedDate(OffsetDateTime.parse("2020-12-30T15:26:53Z"))
                .withUserId("fbcyaykmm");
        model = BinaryData.fromObject(model).toObject(IssueCommentContractInner.class);
        Assertions.assertEquals("kuwxeoiojfizfavk", model.text());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T15:26:53Z"), model.createdDate());
        Assertions.assertEquals("fbcyaykmm", model.userId());
    }
}
