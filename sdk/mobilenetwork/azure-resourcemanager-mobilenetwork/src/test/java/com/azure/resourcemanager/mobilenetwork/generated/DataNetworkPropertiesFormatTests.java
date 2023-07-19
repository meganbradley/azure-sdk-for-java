// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.DataNetworkPropertiesFormat;
import org.junit.jupiter.api.Assertions;

public final class DataNetworkPropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataNetworkPropertiesFormat model =
            BinaryData
                .fromString("{\"provisioningState\":\"Failed\",\"description\":\"mdwzjeiachboo\"}")
                .toObject(DataNetworkPropertiesFormat.class);
        Assertions.assertEquals("mdwzjeiachboo", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataNetworkPropertiesFormat model = new DataNetworkPropertiesFormat().withDescription("mdwzjeiachboo");
        model = BinaryData.fromObject(model).toObject(DataNetworkPropertiesFormat.class);
        Assertions.assertEquals("mdwzjeiachboo", model.description());
    }
}
