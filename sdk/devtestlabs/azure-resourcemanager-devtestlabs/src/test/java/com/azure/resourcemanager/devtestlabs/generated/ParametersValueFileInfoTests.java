// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ParametersValueFileInfo;
import org.junit.jupiter.api.Assertions;

public final class ParametersValueFileInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ParametersValueFileInfo model =
            BinaryData
                .fromString("{\"fileName\":\"ruoujmk\",\"parametersValueInfo\":\"datahwqytj\"}")
                .toObject(ParametersValueFileInfo.class);
        Assertions.assertEquals("ruoujmk", model.fileName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ParametersValueFileInfo model =
            new ParametersValueFileInfo().withFileName("ruoujmk").withParametersValueInfo("datahwqytj");
        model = BinaryData.fromObject(model).toObject(ParametersValueFileInfo.class);
        Assertions.assertEquals("ruoujmk", model.fileName());
    }
}
