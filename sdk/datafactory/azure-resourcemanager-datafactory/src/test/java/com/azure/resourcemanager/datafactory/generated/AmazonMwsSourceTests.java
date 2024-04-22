// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonMwsSource;

public final class AmazonMwsSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonMwsSource model = BinaryData.fromString(
            "{\"type\":\"imvziyicxnxci\",\"query\":\"datahdlwlehhqxy\",\"queryTimeout\":\"dataakzgryfxwwqbey\",\"additionalColumns\":\"datadnjmjies\",\"sourceRetryCount\":\"datalvzxucnpa\",\"sourceRetryWait\":\"datarairefifbisljhg\",\"maxConcurrentConnections\":\"datajm\",\"disableMetricsCollection\":\"datam\",\"\":{\"hjhpxjlgiurmli\":\"datagcbrmmweeuy\"}}")
            .toObject(AmazonMwsSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonMwsSource model = new AmazonMwsSource().withSourceRetryCount("datalvzxucnpa")
            .withSourceRetryWait("datarairefifbisljhg")
            .withMaxConcurrentConnections("datajm")
            .withDisableMetricsCollection("datam")
            .withQueryTimeout("dataakzgryfxwwqbey")
            .withAdditionalColumns("datadnjmjies")
            .withQuery("datahdlwlehhqxy");
        model = BinaryData.fromObject(model).toObject(AmazonMwsSource.class);
    }
}
