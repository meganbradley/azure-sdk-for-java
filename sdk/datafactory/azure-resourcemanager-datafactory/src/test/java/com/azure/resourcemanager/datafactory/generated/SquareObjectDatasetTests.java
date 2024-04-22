// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SquareObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SquareObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SquareObjectDataset model = BinaryData.fromString(
            "{\"type\":\"cwbshfihvl\",\"typeProperties\":{\"tableName\":\"datauxkdiumgsivxw\"},\"description\":\"ceylaulpuexyigxz\",\"structure\":\"dataecxdslspgnndefyh\",\"schema\":\"datayhwl\",\"linkedServiceName\":{\"referenceName\":\"svsyltap\",\"parameters\":{\"cuhbgftfvqukkmvz\":\"datafkmvzrkpmonxdw\",\"dqrjylwqqsemjhh\":\"dataneg\",\"hztb\":\"datalsub\",\"zwufi\":\"datajrdzwyktdp\"}},\"parameters\":{\"kmcykxmysmk\":{\"type\":\"Float\",\"defaultValue\":\"datahmjkykqf\"},\"ig\":{\"type\":\"Float\",\"defaultValue\":\"datanrihpjaxhcbeejn\"},\"ardvdpfgwdxmia\":{\"type\":\"Array\",\"defaultValue\":\"datalkrnpsbnmrmhkip\"}},\"annotations\":[\"datapbie\",\"datal\"],\"folder\":{\"name\":\"dvjlpbjszqjfs\"},\"\":{\"wknsbgh\":\"dataaycx\",\"pzcyhk\":\"datapbrzwi\"}}")
            .toObject(SquareObjectDataset.class);
        Assertions.assertEquals("ceylaulpuexyigxz", model.description());
        Assertions.assertEquals("svsyltap", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("kmcykxmysmk").type());
        Assertions.assertEquals("dvjlpbjszqjfs", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SquareObjectDataset model = new SquareObjectDataset().withDescription("ceylaulpuexyigxz")
            .withStructure("dataecxdslspgnndefyh")
            .withSchema("datayhwl")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("svsyltap")
                .withParameters(mapOf("cuhbgftfvqukkmvz", "datafkmvzrkpmonxdw", "dqrjylwqqsemjhh", "dataneg", "hztb",
                    "datalsub", "zwufi", "datajrdzwyktdp")))
            .withParameters(mapOf("kmcykxmysmk",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datahmjkykqf"), "ig",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datanrihpjaxhcbeejn"),
                "ardvdpfgwdxmia",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datalkrnpsbnmrmhkip")))
            .withAnnotations(Arrays.asList("datapbie", "datal"))
            .withFolder(new DatasetFolder().withName("dvjlpbjszqjfs"))
            .withTableName("datauxkdiumgsivxw");
        model = BinaryData.fromObject(model).toObject(SquareObjectDataset.class);
        Assertions.assertEquals("ceylaulpuexyigxz", model.description());
        Assertions.assertEquals("svsyltap", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("kmcykxmysmk").type());
        Assertions.assertEquals("dvjlpbjszqjfs", model.folder().name());
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
