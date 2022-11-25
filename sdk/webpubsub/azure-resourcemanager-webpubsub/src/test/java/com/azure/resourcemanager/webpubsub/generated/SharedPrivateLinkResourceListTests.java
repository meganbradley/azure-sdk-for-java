// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.webpubsub.models.SharedPrivateLinkResourceList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SharedPrivateLinkResourceListTests {
    @Test
    public void testDeserialize() {
        SharedPrivateLinkResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"nedgfbc\",\"privateLinkResourceId\":\"kcvqvpke\",\"provisioningState\":\"Deleting\",\"requestMessage\":\"drhvoodsotbo\",\"status\":\"Pending\"},\"id\":\"opcjwvnhd\",\"name\":\"d\",\"type\":\"mgxcxrslpm\"},{\"properties\":{\"groupId\":\"uoegrpkhjwniyqs\",\"privateLinkResourceId\":\"uicpd\",\"provisioningState\":\"Updating\",\"requestMessage\":\"zl\",\"status\":\"Timeout\"},\"id\":\"mpaxmodfvuefywsb\",\"name\":\"fvmwy\",\"type\":\"rfouyftaakcpw\"},{\"properties\":{\"groupId\":\"vqtmnub\",\"privateLinkResourceId\":\"xkp\",\"provisioningState\":\"Moving\",\"requestMessage\":\"ondjmq\",\"status\":\"Rejected\"},\"id\":\"ypomgkopkwho\",\"name\":\"v\",\"type\":\"ajqgxy\"}],\"nextLink\":\"ocmbqfqvmkcxoza\"}")
                .toObject(SharedPrivateLinkResourceList.class);
        Assertions.assertEquals("nedgfbc", model.value().get(0).groupId());
        Assertions.assertEquals("kcvqvpke", model.value().get(0).privateLinkResourceId());
        Assertions.assertEquals("drhvoodsotbo", model.value().get(0).requestMessage());
        Assertions.assertEquals("ocmbqfqvmkcxoza", model.nextLink());
    }

    @Test
    public void testSerialize() {
        SharedPrivateLinkResourceList model =
            new SharedPrivateLinkResourceList()
                .withValue(
                    Arrays
                        .asList(
                            new SharedPrivateLinkResourceInner()
                                .withGroupId("nedgfbc")
                                .withPrivateLinkResourceId("kcvqvpke")
                                .withRequestMessage("drhvoodsotbo"),
                            new SharedPrivateLinkResourceInner()
                                .withGroupId("uoegrpkhjwniyqs")
                                .withPrivateLinkResourceId("uicpd")
                                .withRequestMessage("zl"),
                            new SharedPrivateLinkResourceInner()
                                .withGroupId("vqtmnub")
                                .withPrivateLinkResourceId("xkp")
                                .withRequestMessage("ondjmq")))
                .withNextLink("ocmbqfqvmkcxoza");
        model = BinaryData.fromObject(model).toObject(SharedPrivateLinkResourceList.class);
        Assertions.assertEquals("nedgfbc", model.value().get(0).groupId());
        Assertions.assertEquals("kcvqvpke", model.value().get(0).privateLinkResourceId());
        Assertions.assertEquals("drhvoodsotbo", model.value().get(0).requestMessage());
        Assertions.assertEquals("ocmbqfqvmkcxoza", model.nextLink());
    }
}
