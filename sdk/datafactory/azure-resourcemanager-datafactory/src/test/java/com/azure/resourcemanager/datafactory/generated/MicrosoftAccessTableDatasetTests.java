// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MicrosoftAccessTableDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MicrosoftAccessTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MicrosoftAccessTableDataset model = BinaryData.fromString(
            "{\"type\":\"MicrosoftAccessTable\",\"typeProperties\":{\"tableName\":\"dataxamqecjrzvlcivqx\"},\"description\":\"mklphxwww\",\"structure\":\"datajkbgnfbr\",\"schema\":\"datavfsunhaevla\",\"linkedServiceName\":{\"referenceName\":\"xczywywu\",\"parameters\":{\"rfgimomggewdqbxe\":\"datacorewcnnaaxqjfda\",\"sfx\":\"datafyznvussuqksl\",\"wpmohnrtlikffyd\":\"datayzqbye\",\"fwvzdteqjm\":\"datatkqrfbgyn\"}},\"parameters\":{\"jyoxxjxb\":{\"type\":\"Array\",\"defaultValue\":\"datagkaxnypr\"},\"emqom\":{\"type\":\"Int\",\"defaultValue\":\"datarrlccklyfpjmspa\"},\"hcaptkhjx\":{\"type\":\"Int\",\"defaultValue\":\"datalknuyapvibzicyvi\"}},\"annotations\":[\"databnvfccklzhznfgv\"],\"folder\":{\"name\":\"xmnctigpksywi\"},\"\":{\"efuhb\":\"dataktgkdprtqjytdc\",\"caytnpkvbpbltcws\":\"datawbvjsbgmlamoa\"}}")
            .toObject(MicrosoftAccessTableDataset.class);
        Assertions.assertEquals("mklphxwww", model.description());
        Assertions.assertEquals("xczywywu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("jyoxxjxb").type());
        Assertions.assertEquals("xmnctigpksywi", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MicrosoftAccessTableDataset model = new MicrosoftAccessTableDataset().withDescription("mklphxwww")
            .withStructure("datajkbgnfbr").withSchema("datavfsunhaevla")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("xczywywu")
                .withParameters(mapOf("rfgimomggewdqbxe", "datacorewcnnaaxqjfda", "sfx", "datafyznvussuqksl",
                    "wpmohnrtlikffyd", "datayzqbye", "fwvzdteqjm", "datatkqrfbgyn")))
            .withParameters(mapOf("jyoxxjxb",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datagkaxnypr"), "emqom",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datarrlccklyfpjmspa"),
                "hcaptkhjx",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datalknuyapvibzicyvi")))
            .withAnnotations(Arrays.asList("databnvfccklzhznfgv"))
            .withFolder(new DatasetFolder().withName("xmnctigpksywi")).withTableName("dataxamqecjrzvlcivqx");
        model = BinaryData.fromObject(model).toObject(MicrosoftAccessTableDataset.class);
        Assertions.assertEquals("mklphxwww", model.description());
        Assertions.assertEquals("xczywywu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("jyoxxjxb").type());
        Assertions.assertEquals("xmnctigpksywi", model.folder().name());
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
