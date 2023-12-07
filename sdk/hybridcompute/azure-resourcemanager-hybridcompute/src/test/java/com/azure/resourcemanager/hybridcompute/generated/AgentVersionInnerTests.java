// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.AgentVersionInner;
import org.junit.jupiter.api.Assertions;

public final class AgentVersionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentVersionInner model =
            BinaryData
                .fromString("{\"agentVersion\":\"zbn\",\"downloadLink\":\"lylpstdb\",\"osType\":\"xsrz\"}")
                .toObject(AgentVersionInner.class);
        Assertions.assertEquals("zbn", model.agentVersion());
        Assertions.assertEquals("lylpstdb", model.downloadLink());
        Assertions.assertEquals("xsrz", model.osType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentVersionInner model =
            new AgentVersionInner().withAgentVersion("zbn").withDownloadLink("lylpstdb").withOsType("xsrz");
        model = BinaryData.fromObject(model).toObject(AgentVersionInner.class);
        Assertions.assertEquals("zbn", model.agentVersion());
        Assertions.assertEquals("lylpstdb", model.downloadLink());
        Assertions.assertEquals("xsrz", model.osType());
    }
}
