// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.models.MetadataEntity;
import org.junit.jupiter.api.Assertions;

public final class MetadataEntityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetadataEntity model = BinaryData.fromString(
            "{\"self\":\"x\",\"resource_name\":\"qgtz\",\"created_at\":\"pnqbqqwxrjfe\",\"updated_at\":\"lnwsubisn\",\"deleted_at\":\"mpmngnzscxaqwoo\"}")
            .toObject(MetadataEntity.class);
        Assertions.assertEquals("x", model.self());
        Assertions.assertEquals("qgtz", model.resourceName());
        Assertions.assertEquals("pnqbqqwxrjfe", model.createdAt());
        Assertions.assertEquals("lnwsubisn", model.updatedAt());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.deletedAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetadataEntity model = new MetadataEntity().withSelf("x").withResourceName("qgtz").withCreatedAt("pnqbqqwxrjfe")
            .withUpdatedAt("lnwsubisn").withDeletedAt("mpmngnzscxaqwoo");
        model = BinaryData.fromObject(model).toObject(MetadataEntity.class);
        Assertions.assertEquals("x", model.self());
        Assertions.assertEquals("qgtz", model.resourceName());
        Assertions.assertEquals("pnqbqqwxrjfe", model.createdAt());
        Assertions.assertEquals("lnwsubisn", model.updatedAt());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.deletedAt());
    }
}
