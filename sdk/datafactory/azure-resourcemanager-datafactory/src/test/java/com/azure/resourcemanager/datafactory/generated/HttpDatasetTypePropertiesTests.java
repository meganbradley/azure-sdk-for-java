// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.HttpDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import java.util.HashMap;
import java.util.Map;

public final class HttpDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpDatasetTypeProperties model = BinaryData.fromString(
            "{\"relativeUrl\":\"datatlrglhxso\",\"requestMethod\":\"dataguhbnhogsezreneg\",\"requestBody\":\"datadtyzpx\",\"additionalHeaders\":\"datatwkejmgem\",\"format\":{\"type\":\"pehskvsdfvhr\",\"serializer\":\"datae\",\"deserializer\":\"datammpkapvnpeukg\",\"\":{\"vktfp\":\"dataakeqnitromlc\",\"fxjtxla\":\"datarowsh\",\"fqdmll\":\"datamvdyqabjrop\"}},\"compression\":{\"type\":\"datayjyuwqlzw\",\"level\":\"datapvhwirilamqtrh\",\"\":{\"dedpkwdtobpgdc\":\"dataxdega\",\"q\":\"datadpd\",\"ddlirqqcl\":\"datarm\",\"k\":\"dataaqifepdureevi\"}}}")
            .toObject(HttpDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpDatasetTypeProperties model = new HttpDatasetTypeProperties().withRelativeUrl("datatlrglhxso")
            .withRequestMethod("dataguhbnhogsezreneg")
            .withRequestBody("datadtyzpx")
            .withAdditionalHeaders("datatwkejmgem")
            .withFormat(new DatasetStorageFormat().withSerializer("datae")
                .withDeserializer("datammpkapvnpeukg")
                .withAdditionalProperties(mapOf("type", "pehskvsdfvhr")))
            .withCompression(new DatasetCompression().withType("datayjyuwqlzw")
                .withLevel("datapvhwirilamqtrh")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(HttpDatasetTypeProperties.class);
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
