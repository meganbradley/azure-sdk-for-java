// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SubvolumeModelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumeModelInner model = BinaryData.fromString(
            "{\"id\":\"wuenvr\",\"name\":\"yo\",\"type\":\"ibreb\",\"properties\":{\"path\":\"ysjkixqtnqttez\",\"parentPath\":\"fffiak\",\"size\":7989893119356760730,\"bytesUsed\":167842444741645493,\"permissions\":\"d\",\"creationTimeStamp\":\"2021-09-01T21:15:43Z\",\"accessedTimeStamp\":\"2021-03-09T02:32:12Z\",\"modifiedTimeStamp\":\"2021-08-03T11:39:14Z\",\"changedTimeStamp\":\"2021-01-23T06:09:40Z\",\"provisioningState\":\"zphv\"}}")
            .toObject(SubvolumeModelInner.class);
        Assertions.assertEquals("ysjkixqtnqttez", model.path());
        Assertions.assertEquals("fffiak", model.parentPath());
        Assertions.assertEquals(7989893119356760730L, model.size());
        Assertions.assertEquals(167842444741645493L, model.bytesUsed());
        Assertions.assertEquals("d", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-01T21:15:43Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-09T02:32:12Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T11:39:14Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-23T06:09:40Z"), model.changedTimestamp());
        Assertions.assertEquals("zphv", model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumeModelInner model = new SubvolumeModelInner().withPath("ysjkixqtnqttez").withParentPath("fffiak")
            .withSize(7989893119356760730L).withBytesUsed(167842444741645493L).withPermissions("d")
            .withCreationTimestamp(OffsetDateTime.parse("2021-09-01T21:15:43Z"))
            .withAccessedTimestamp(OffsetDateTime.parse("2021-03-09T02:32:12Z"))
            .withModifiedTimestamp(OffsetDateTime.parse("2021-08-03T11:39:14Z"))
            .withChangedTimestamp(OffsetDateTime.parse("2021-01-23T06:09:40Z")).withProvisioningState("zphv");
        model = BinaryData.fromObject(model).toObject(SubvolumeModelInner.class);
        Assertions.assertEquals("ysjkixqtnqttez", model.path());
        Assertions.assertEquals("fffiak", model.parentPath());
        Assertions.assertEquals(7989893119356760730L, model.size());
        Assertions.assertEquals(167842444741645493L, model.bytesUsed());
        Assertions.assertEquals("d", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-01T21:15:43Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-09T02:32:12Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T11:39:14Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-23T06:09:40Z"), model.changedTimestamp());
        Assertions.assertEquals("zphv", model.provisioningState());
    }
}
