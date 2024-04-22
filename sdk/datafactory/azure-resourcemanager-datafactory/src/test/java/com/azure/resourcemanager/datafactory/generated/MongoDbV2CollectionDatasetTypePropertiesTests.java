// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.MongoDbV2CollectionDatasetTypeProperties;

public final class MongoDbV2CollectionDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2CollectionDatasetTypeProperties model
            = BinaryData.fromString("{\"collection\":\"dataqnfforxsqtzngxbs\"}")
                .toObject(MongoDbV2CollectionDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2CollectionDatasetTypeProperties model
            = new MongoDbV2CollectionDatasetTypeProperties().withCollection("dataqnfforxsqtzngxbs");
        model = BinaryData.fromObject(model).toObject(MongoDbV2CollectionDatasetTypeProperties.class);
    }
}
