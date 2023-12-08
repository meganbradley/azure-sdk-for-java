// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MongoDbAtlasSink;

public final class MongoDbAtlasSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbAtlasSink model = BinaryData.fromString(
            "{\"type\":\"MongoDbAtlasSink\",\"writeBehavior\":\"datasghbdvsorvhbygwt\",\"writeBatchSize\":\"dataqlzzkb\",\"writeBatchTimeout\":\"datancggamxbtqizydai\",\"sinkRetryCount\":\"datank\",\"sinkRetryWait\":\"datahlexvqhbnwmokz\",\"maxConcurrentConnections\":\"dataltbpqjfoujeiagny\",\"disableMetricsCollection\":\"datafjssayrwyf\",\"\":{\"xrpxdhzwdy\":\"datae\",\"hwexwho\":\"dataayhv\"}}")
            .toObject(MongoDbAtlasSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbAtlasSink model = new MongoDbAtlasSink().withWriteBatchSize("dataqlzzkb")
            .withWriteBatchTimeout("datancggamxbtqizydai").withSinkRetryCount("datank")
            .withSinkRetryWait("datahlexvqhbnwmokz").withMaxConcurrentConnections("dataltbpqjfoujeiagny")
            .withDisableMetricsCollection("datafjssayrwyf").withWriteBehavior("datasghbdvsorvhbygwt");
        model = BinaryData.fromObject(model).toObject(MongoDbAtlasSink.class);
    }
}
