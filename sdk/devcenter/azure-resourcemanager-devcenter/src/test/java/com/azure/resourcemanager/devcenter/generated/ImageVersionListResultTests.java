// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ImageVersionListResult;

public final class ImageVersionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageVersionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"name\":\"upqsx\",\"publishedDate\":\"2021-01-21T16:22:25Z\",\"excludeFromLatest\":false,\"osDiskImageSizeInGb\":1892680320,\"provisioningState\":\"Failed\"},\"id\":\"o\",\"name\":\"eil\",\"type\":\"vnotyfjfcnj\"},{\"properties\":{\"name\":\"nxdhbt\",\"publishedDate\":\"2020-12-23T07:25:08Z\",\"excludeFromLatest\":false,\"osDiskImageSizeInGb\":1501927720,\"provisioningState\":\"MovingResources\"},\"id\":\"t\",\"name\":\"qnermclfplphoxu\",\"type\":\"crpab\"},{\"properties\":{\"name\":\"psbjta\",\"publishedDate\":\"2021-10-14T16:25:44Z\",\"excludeFromLatest\":true,\"osDiskImageSizeInGb\":2007801220,\"provisioningState\":\"Created\"},\"id\":\"eef\",\"name\":\"zwfqkqujidsuyon\",\"type\":\"bglaocqxtccm\"}],\"nextLink\":\"udxytlmoyrx\"}")
            .toObject(ImageVersionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageVersionListResult model = new ImageVersionListResult();
        model = BinaryData.fromObject(model).toObject(ImageVersionListResult.class);
    }
}
