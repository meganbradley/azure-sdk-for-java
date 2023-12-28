// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CosmosDbMongoDbApiCollectionDatasetTypeProperties;

public final class CosmosDbMongoDbApiCollectionDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbMongoDbApiCollectionDatasetTypeProperties model = BinaryData.fromString("{\"collection\":\"databiba\"}")
            .toObject(CosmosDbMongoDbApiCollectionDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbMongoDbApiCollectionDatasetTypeProperties model
            = new CosmosDbMongoDbApiCollectionDatasetTypeProperties().withCollection("databiba");
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiCollectionDatasetTypeProperties.class);
    }
}
