// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.SchemaContractInner;
import org.junit.jupiter.api.Assertions;

public final class SchemaContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SchemaContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"contentType\":\"uuuercta\",\"document\":{\"value\":\"yintqpbrlcy\",\"definitions\":\"datauczkgofxyfsruc\",\"components\":\"datarrp\"}},\"id\":\"jttbstv\",\"name\":\"eaqnrmvvfkoxm\",\"type\":\"ghktuidvrm\"}")
                .toObject(SchemaContractInner.class);
        Assertions.assertEquals("uuuercta", model.contentType());
        Assertions.assertEquals("yintqpbrlcy", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SchemaContractInner model =
            new SchemaContractInner()
                .withContentType("uuuercta")
                .withValue("yintqpbrlcy")
                .withDefinitions("datauczkgofxyfsruc")
                .withComponents("datarrp");
        model = BinaryData.fromObject(model).toObject(SchemaContractInner.class);
        Assertions.assertEquals("uuuercta", model.contentType());
        Assertions.assertEquals("yintqpbrlcy", model.value());
    }
}
