// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.fluent.models.OperationsDiscoveryCollectionInner;
import com.azure.resourcemanager.resourcemover.models.Display;
import com.azure.resourcemanager.resourcemover.models.OperationsDiscovery;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationsDiscoveryCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsDiscoveryCollectionInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"gdtjixhbkuofqwey\",\"isDataAction\":true,\"display\":{\"provider\":\"evfyexfwhybcib\",\"resource\":\"vdcsitynn\",\"operation\":\"mdectehfiqscjey\",\"description\":\"hezrkgq\"},\"origin\":\"jrefovgmkqsle\",\"properties\":\"datavxyqjpkcattpngjc\"},{\"name\":\"czsqpjhvm\",\"isDataAction\":true,\"display\":{\"provider\":\"ysou\",\"resource\":\"e\",\"operation\":\"noae\",\"description\":\"fhyhltrpmopjmcma\"},\"origin\":\"okth\",\"properties\":\"dataiuaod\"},{\"name\":\"cpkvxodp\",\"isDataAction\":true,\"display\":{\"provider\":\"zydagfuaxbezyiuo\",\"resource\":\"twhrdxwzywqsm\",\"operation\":\"ureximoryocfs\",\"description\":\"s\"},\"origin\":\"ddystkiiuxhqy\",\"properties\":\"dataxorrqnb\"}],\"nextLink\":\"czvyifq\"}")
                .toObject(OperationsDiscoveryCollectionInner.class);
        Assertions.assertEquals("gdtjixhbkuofqwey", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("evfyexfwhybcib", model.value().get(0).display().provider());
        Assertions.assertEquals("vdcsitynn", model.value().get(0).display().resource());
        Assertions.assertEquals("mdectehfiqscjey", model.value().get(0).display().operation());
        Assertions.assertEquals("hezrkgq", model.value().get(0).display().description());
        Assertions.assertEquals("jrefovgmkqsle", model.value().get(0).origin());
        Assertions.assertEquals("czvyifq", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsDiscoveryCollectionInner model =
            new OperationsDiscoveryCollectionInner()
                .withValue(
                    Arrays
                        .asList(
                            new OperationsDiscovery()
                                .withName("gdtjixhbkuofqwey")
                                .withIsDataAction(true)
                                .withDisplay(
                                    new Display()
                                        .withProvider("evfyexfwhybcib")
                                        .withResource("vdcsitynn")
                                        .withOperation("mdectehfiqscjey")
                                        .withDescription("hezrkgq"))
                                .withOrigin("jrefovgmkqsle")
                                .withProperties("datavxyqjpkcattpngjc"),
                            new OperationsDiscovery()
                                .withName("czsqpjhvm")
                                .withIsDataAction(true)
                                .withDisplay(
                                    new Display()
                                        .withProvider("ysou")
                                        .withResource("e")
                                        .withOperation("noae")
                                        .withDescription("fhyhltrpmopjmcma"))
                                .withOrigin("okth")
                                .withProperties("dataiuaod"),
                            new OperationsDiscovery()
                                .withName("cpkvxodp")
                                .withIsDataAction(true)
                                .withDisplay(
                                    new Display()
                                        .withProvider("zydagfuaxbezyiuo")
                                        .withResource("twhrdxwzywqsm")
                                        .withOperation("ureximoryocfs")
                                        .withDescription("s"))
                                .withOrigin("ddystkiiuxhqy")
                                .withProperties("dataxorrqnb")))
                .withNextLink("czvyifq");
        model = BinaryData.fromObject(model).toObject(OperationsDiscoveryCollectionInner.class);
        Assertions.assertEquals("gdtjixhbkuofqwey", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("evfyexfwhybcib", model.value().get(0).display().provider());
        Assertions.assertEquals("vdcsitynn", model.value().get(0).display().resource());
        Assertions.assertEquals("mdectehfiqscjey", model.value().get(0).display().operation());
        Assertions.assertEquals("hezrkgq", model.value().get(0).display().description());
        Assertions.assertEquals("jrefovgmkqsle", model.value().get(0).origin());
        Assertions.assertEquals("czvyifq", model.nextLink());
    }
}
