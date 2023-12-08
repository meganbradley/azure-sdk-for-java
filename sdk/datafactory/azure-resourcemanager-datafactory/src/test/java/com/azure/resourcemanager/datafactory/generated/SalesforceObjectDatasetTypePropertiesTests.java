// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SalesforceObjectDatasetTypeProperties;

public final class SalesforceObjectDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceObjectDatasetTypeProperties model = BinaryData.fromString("{\"objectApiName\":\"dataskk\"}")
            .toObject(SalesforceObjectDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceObjectDatasetTypeProperties model
            = new SalesforceObjectDatasetTypeProperties().withObjectApiName("dataskk");
        model = BinaryData.fromObject(model).toObject(SalesforceObjectDatasetTypeProperties.class);
    }
}
