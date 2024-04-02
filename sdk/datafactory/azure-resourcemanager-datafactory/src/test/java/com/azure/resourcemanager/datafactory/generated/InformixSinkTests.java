// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.InformixSink;

public final class InformixSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InformixSink model = BinaryData.fromString(
            "{\"type\":\"InformixSink\",\"preCopyScript\":\"dataamgjy\",\"writeBatchSize\":\"datakttit\",\"writeBatchTimeout\":\"datamnx\",\"sinkRetryCount\":\"dataoadjooer\",\"sinkRetryWait\":\"datalzzmy\",\"maxConcurrentConnections\":\"datautqebpuoycawptxq\",\"disableMetricsCollection\":\"dataufdxpwj\",\"\":{\"cuk\":\"datavskpbuoc\",\"cepp\":\"datatcuvwwfgjjcaa\"}}")
            .toObject(InformixSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InformixSink model = new InformixSink().withWriteBatchSize("datakttit").withWriteBatchTimeout("datamnx")
            .withSinkRetryCount("dataoadjooer").withSinkRetryWait("datalzzmy")
            .withMaxConcurrentConnections("datautqebpuoycawptxq").withDisableMetricsCollection("dataufdxpwj")
            .withPreCopyScript("dataamgjy");
        model = BinaryData.fromObject(model).toObject(InformixSink.class);
    }
}
