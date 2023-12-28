// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AsyncOperationStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AsyncOperationStatusInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"s\",\"name\":\"ddystkiiuxhqy\",\"status\":\"dxorrqnbpoczv\",\"resourceId\":\"fqrvkdvjsllrmvvd\",\"startTime\":\"2021-07-25T18:56:56Z\",\"endTime\":\"2021-08-07T11:35:41Z\",\"percentComplete\":4.838999534427835,\"properties\":\"datalexxbczwtru\"}")
                .toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("s", model.id());
        Assertions.assertEquals("ddystkiiuxhqy", model.name());
        Assertions.assertEquals("dxorrqnbpoczv", model.status());
        Assertions.assertEquals("fqrvkdvjsllrmvvd", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-25T18:56:56Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-07T11:35:41Z"), model.endTime());
        Assertions.assertEquals(4.838999534427835D, model.percentComplete());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AsyncOperationStatusInner model =
            new AsyncOperationStatusInner()
                .withId("s")
                .withName("ddystkiiuxhqy")
                .withStatus("dxorrqnbpoczv")
                .withResourceId("fqrvkdvjsllrmvvd")
                .withStartTime(OffsetDateTime.parse("2021-07-25T18:56:56Z"))
                .withEndTime(OffsetDateTime.parse("2021-08-07T11:35:41Z"))
                .withPercentComplete(4.838999534427835D)
                .withProperties("datalexxbczwtru");
        model = BinaryData.fromObject(model).toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("s", model.id());
        Assertions.assertEquals("ddystkiiuxhqy", model.name());
        Assertions.assertEquals("dxorrqnbpoczv", model.status());
        Assertions.assertEquals("fqrvkdvjsllrmvvd", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-25T18:56:56Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-07T11:35:41Z"), model.endTime());
        Assertions.assertEquals(4.838999534427835D, model.percentComplete());
    }
}
