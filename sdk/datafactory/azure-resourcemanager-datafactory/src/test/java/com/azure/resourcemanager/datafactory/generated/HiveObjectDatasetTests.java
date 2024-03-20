// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.HiveObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HiveObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HiveObjectDataset model = BinaryData.fromString(
            "{\"type\":\"HiveObject\",\"typeProperties\":{\"tableName\":\"datazsggd\",\"table\":\"datatfcbrtsrdplqdyza\",\"schema\":\"dataasfzrguzliyvsb\"},\"description\":\"inv\",\"structure\":\"datadjuljgxotuda\",\"schema\":\"datai\",\"linkedServiceName\":{\"referenceName\":\"a\",\"parameters\":{\"l\":\"datahulzugifgsp\"}},\"parameters\":{\"bwmgksrlmspp\":{\"type\":\"Float\",\"defaultValue\":\"datascygimizluk\"},\"zuqix\":{\"type\":\"Int\",\"defaultValue\":\"dataszthjtryjskdiylg\"},\"koe\":{\"type\":\"Int\",\"defaultValue\":\"databqowgvmxwbohxd\"}},\"annotations\":[\"datah\",\"datanakaj\",\"datascmne\",\"datavlumqeumz\"],\"folder\":{\"name\":\"mgqaeivjq\"},\"\":{\"dzahktxvcbic\":\"datarbgbzgfh\",\"tpxjvtwkyjdpayx\":\"dataecthotbkjwh\",\"qztjfkgb\":\"datapqiwuzr\",\"en\":\"dataqqjobsyn\"}}")
            .toObject(HiveObjectDataset.class);
        Assertions.assertEquals("inv", model.description());
        Assertions.assertEquals("a", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("bwmgksrlmspp").type());
        Assertions.assertEquals("mgqaeivjq", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HiveObjectDataset model = new HiveObjectDataset().withDescription("inv").withStructure("datadjuljgxotuda")
            .withSchema("datai")
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("a").withParameters(mapOf("l", "datahulzugifgsp")))
            .withParameters(mapOf("bwmgksrlmspp",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datascygimizluk"), "zuqix",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataszthjtryjskdiylg"),
                "koe", new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("databqowgvmxwbohxd")))
            .withAnnotations(Arrays.asList("datah", "datanakaj", "datascmne", "datavlumqeumz"))
            .withFolder(new DatasetFolder().withName("mgqaeivjq")).withTableName("datazsggd")
            .withTable("datatfcbrtsrdplqdyza").withSchemaTypePropertiesSchema("dataasfzrguzliyvsb");
        model = BinaryData.fromObject(model).toObject(HiveObjectDataset.class);
        Assertions.assertEquals("inv", model.description());
        Assertions.assertEquals("a", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("bwmgksrlmspp").type());
        Assertions.assertEquals("mgqaeivjq", model.folder().name());
    }

    // Use "Map.of" if available
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
