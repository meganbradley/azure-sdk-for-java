// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudV2Source;

public final class SalesforceServiceCloudV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudV2Source model = BinaryData.fromString(
            "{\"type\":\"SalesforceServiceCloudV2Source\",\"SOQLQuery\":\"datacry\",\"includeDeletedObjects\":\"datafglwm\",\"additionalColumns\":\"databxusn\",\"sourceRetryCount\":\"dataqnzxsdbfbkqice\",\"sourceRetryWait\":\"datamztffngrducoz\",\"maxConcurrentConnections\":\"databhtfmgpioxzhp\",\"disableMetricsCollection\":\"datahhuimgdfo\",\"\":{\"l\":\"dataeuotfavmdpe\"}}")
            .toObject(SalesforceServiceCloudV2Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudV2Source model = new SalesforceServiceCloudV2Source()
            .withSourceRetryCount("dataqnzxsdbfbkqice").withSourceRetryWait("datamztffngrducoz")
            .withMaxConcurrentConnections("databhtfmgpioxzhp").withDisableMetricsCollection("datahhuimgdfo")
            .withSoqlQuery("datacry").withIncludeDeletedObjects("datafglwm").withAdditionalColumns("databxusn");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudV2Source.class);
    }
}
