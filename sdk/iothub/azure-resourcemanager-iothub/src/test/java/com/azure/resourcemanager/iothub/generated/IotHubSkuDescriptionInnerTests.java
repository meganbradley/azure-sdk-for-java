// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.fluent.models.IotHubSkuDescriptionInner;
import com.azure.resourcemanager.iothub.models.IotHubCapacity;
import com.azure.resourcemanager.iothub.models.IotHubSku;
import com.azure.resourcemanager.iothub.models.IotHubSkuInfo;
import org.junit.jupiter.api.Assertions;

public final class IotHubSkuDescriptionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotHubSkuDescriptionInner model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"lhrxsbkyvpyc\",\"sku\":{\"name\":\"S1\",\"tier\":\"Free\",\"capacity\":373365368946667415},\"capacity\":{\"minimum\":6075974132031509292,\"maximum\":3708510664132188472,\"default\":8812234948991108432,\"scaleType\":\"Automatic\"}}")
                .toObject(IotHubSkuDescriptionInner.class);
        Assertions.assertEquals(IotHubSku.S1, model.sku().name());
        Assertions.assertEquals(373365368946667415L, model.sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotHubSkuDescriptionInner model =
            new IotHubSkuDescriptionInner()
                .withSku(new IotHubSkuInfo().withName(IotHubSku.S1).withCapacity(373365368946667415L))
                .withCapacity(new IotHubCapacity());
        model = BinaryData.fromObject(model).toObject(IotHubSkuDescriptionInner.class);
        Assertions.assertEquals(IotHubSku.S1, model.sku().name());
        Assertions.assertEquals(373365368946667415L, model.sku().capacity());
    }
}
