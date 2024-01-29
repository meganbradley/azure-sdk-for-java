// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;

public final class LinkedIntegrationRuntimeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinkedIntegrationRuntime model = BinaryData.fromString(
            "{\"name\":\"uhw\",\"subscriptionId\":\"unw\",\"dataFactoryName\":\"bphylnuzgz\",\"dataFactoryLocation\":\"xdusebkc\",\"createTime\":\"2021-09-21T00:32:46Z\"}")
            .toObject(LinkedIntegrationRuntime.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinkedIntegrationRuntime model = new LinkedIntegrationRuntime();
        model = BinaryData.fromObject(model).toObject(LinkedIntegrationRuntime.class);
    }
}
