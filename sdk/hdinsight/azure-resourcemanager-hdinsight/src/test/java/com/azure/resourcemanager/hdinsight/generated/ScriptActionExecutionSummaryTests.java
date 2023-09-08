// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.ScriptActionExecutionSummary;

public final class ScriptActionExecutionSummaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptActionExecutionSummary model =
            BinaryData
                .fromString("{\"status\":\"wpgdak\",\"instanceCount\":1202587998}")
                .toObject(ScriptActionExecutionSummary.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptActionExecutionSummary model = new ScriptActionExecutionSummary();
        model = BinaryData.fromObject(model).toObject(ScriptActionExecutionSummary.class);
    }
}
