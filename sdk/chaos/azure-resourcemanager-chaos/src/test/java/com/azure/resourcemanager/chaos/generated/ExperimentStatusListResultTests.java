// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentStatusListResult;

public final class ExperimentStatusListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentStatusListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"type\":\"bcswsrt\",\"id\":\"iplrbpbewtghfgb\",\"name\":\"gw\",\"properties\":{\"status\":\"lvqhjkbegibtnmx\",\"createdDateUtc\":\"2021-04-16T06:52:16Z\",\"endDateUtc\":\"2021-03-05T02:51:46Z\"}}],\"nextLink\":\"loayqcgw\"}")
                .toObject(ExperimentStatusListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentStatusListResult model = new ExperimentStatusListResult();
        model = BinaryData.fromObject(model).toObject(ExperimentStatusListResult.class);
    }
}
