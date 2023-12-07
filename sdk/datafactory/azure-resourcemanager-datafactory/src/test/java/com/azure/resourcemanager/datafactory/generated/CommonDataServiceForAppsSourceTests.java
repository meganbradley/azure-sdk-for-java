// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CommonDataServiceForAppsSource;

public final class CommonDataServiceForAppsSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommonDataServiceForAppsSource model = BinaryData.fromString(
            "{\"type\":\"CommonDataServiceForAppsSource\",\"query\":\"datamdjzgovmkplrjk\",\"additionalColumns\":\"dataaxoe\",\"sourceRetryCount\":\"datapofaogvmq\",\"sourceRetryWait\":\"datagrqcqhwfskmkd\",\"maxConcurrentConnections\":\"datakdpn\",\"disableMetricsCollection\":\"datadwcxjv\",\"\":{\"otqocnryyp\":\"datautxcmcc\"}}")
            .toObject(CommonDataServiceForAppsSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommonDataServiceForAppsSource model = new CommonDataServiceForAppsSource()
            .withSourceRetryCount("datapofaogvmq").withSourceRetryWait("datagrqcqhwfskmkd")
            .withMaxConcurrentConnections("datakdpn").withDisableMetricsCollection("datadwcxjv")
            .withQuery("datamdjzgovmkplrjk").withAdditionalColumns("dataaxoe");
        model = BinaryData.fromObject(model).toObject(CommonDataServiceForAppsSource.class);
    }
}
