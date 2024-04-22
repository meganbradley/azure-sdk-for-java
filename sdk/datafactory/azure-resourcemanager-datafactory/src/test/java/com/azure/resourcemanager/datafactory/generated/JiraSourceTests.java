// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JiraSource;

public final class JiraSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JiraSource model = BinaryData.fromString(
            "{\"type\":\"jvskpbuo\",\"query\":\"dataoadjooer\",\"queryTimeout\":\"datautqebpuoycawptxq\",\"additionalColumns\":\"dataufdxpwj\",\"sourceRetryCount\":\"datacuk\",\"sourceRetryWait\":\"datacuvww\",\"maxConcurrentConnections\":\"datajjcaaoce\",\"disableMetricsCollection\":\"datawwilyxpq\",\"\":{\"zwybgaycjphoz\":\"dataifhjymqwjliivyat\",\"uoqnktl\":\"datamcypd\"}}")
            .toObject(JiraSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JiraSource model = new JiraSource().withSourceRetryCount("datacuk")
            .withSourceRetryWait("datacuvww")
            .withMaxConcurrentConnections("datajjcaaoce")
            .withDisableMetricsCollection("datawwilyxpq")
            .withQueryTimeout("datautqebpuoycawptxq")
            .withAdditionalColumns("dataufdxpwj")
            .withQuery("dataoadjooer");
        model = BinaryData.fromObject(model).toObject(JiraSource.class);
    }
}
