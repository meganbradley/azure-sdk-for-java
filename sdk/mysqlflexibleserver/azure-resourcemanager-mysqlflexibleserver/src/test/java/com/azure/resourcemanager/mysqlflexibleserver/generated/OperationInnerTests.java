// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.OperationInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationDisplay;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"nrs\",\"display\":{\"provider\":\"qidybyx\",\"resource\":\"fclhaaxdbabphlwr\",\"operation\":\"fkts\",\"description\":\"sucocmnyyazttbtw\"},\"origin\":\"qpuedckzywbiex\",\"properties\":{\"qwalmuzyoxaepd\":\"datayueaxibxujwb\",\"d\":\"datazjancuxr\",\"dbpgnxytxhp\":\"databavxbniwdjswzt\",\"lcuhxwtctyqiklb\":\"dataxbzpfzab\"}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals("nrs", model.name());
        Assertions.assertEquals("qidybyx", model.display().provider());
        Assertions.assertEquals("fclhaaxdbabphlwr", model.display().resource());
        Assertions.assertEquals("fkts", model.display().operation());
        Assertions.assertEquals("sucocmnyyazttbtw", model.display().description());
        Assertions.assertEquals("qpuedckzywbiex", model.origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model =
            new OperationInner()
                .withName("nrs")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("qidybyx")
                        .withResource("fclhaaxdbabphlwr")
                        .withOperation("fkts")
                        .withDescription("sucocmnyyazttbtw"))
                .withOrigin("qpuedckzywbiex")
                .withProperties(
                    mapOf(
                        "qwalmuzyoxaepd",
                        "datayueaxibxujwb",
                        "d",
                        "datazjancuxr",
                        "dbpgnxytxhp",
                        "databavxbniwdjswzt",
                        "lcuhxwtctyqiklb",
                        "dataxbzpfzab"));
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals("nrs", model.name());
        Assertions.assertEquals("qidybyx", model.display().provider());
        Assertions.assertEquals("fclhaaxdbabphlwr", model.display().resource());
        Assertions.assertEquals("fkts", model.display().operation());
        Assertions.assertEquals("sucocmnyyazttbtw", model.display().description());
        Assertions.assertEquals("qpuedckzywbiex", model.origin());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
