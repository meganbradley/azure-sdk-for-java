// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.springappdiscovery.fluent.models.OperationInner;
import com.azure.resourcemanager.springappdiscovery.models.OperationDisplay;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model = BinaryData.fromString(
            "{\"name\":\"pjkjlxofpdv\",\"isDataAction\":true,\"display\":{\"provider\":\"ypininm\",\"resource\":\"huyb\",\"operation\":\"podepoo\",\"description\":\"nuvamiheogna\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}")
            .toObject(OperationInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model = new OperationInner().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
    }
}
