// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.KeyVaultReference;
import org.junit.jupiter.api.Assertions;

public final class KeyVaultReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KeyVaultReference model =
            BinaryData.fromString("{\"id\":\"lzl\",\"url\":\"j\"}").toObject(KeyVaultReference.class);
        Assertions.assertEquals("lzl", model.id());
        Assertions.assertEquals("j", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KeyVaultReference model = new KeyVaultReference().withId("lzl").withUrl("j");
        model = BinaryData.fromObject(model).toObject(KeyVaultReference.class);
        Assertions.assertEquals("lzl", model.id());
        Assertions.assertEquals("j", model.url());
    }
}
