// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.AdditionalErrorInfo;
import org.junit.jupiter.api.Assertions;

public final class AdditionalErrorInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdditionalErrorInfo model =
            BinaryData
                .fromString("{\"info\":\"datakujysvlejuvfq\",\"type\":\"rlyxwjkcprbnw\"}")
                .toObject(AdditionalErrorInfo.class);
        Assertions.assertEquals("rlyxwjkcprbnw", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdditionalErrorInfo model = new AdditionalErrorInfo().withInfo("datakujysvlejuvfq").withType("rlyxwjkcprbnw");
        model = BinaryData.fromObject(model).toObject(AdditionalErrorInfo.class);
        Assertions.assertEquals("rlyxwjkcprbnw", model.type());
    }
}
