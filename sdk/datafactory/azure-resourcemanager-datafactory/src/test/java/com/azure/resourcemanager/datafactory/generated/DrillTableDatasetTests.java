// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DrillTableDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DrillTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DrillTableDataset model = BinaryData.fromString(
            "{\"type\":\"DrillTable\",\"typeProperties\":{\"tableName\":\"dataugdcr\",\"table\":\"databplvhmhur\",\"schema\":\"datadjlz\"},\"description\":\"m\",\"structure\":\"dataghqeuyaorservpv\",\"schema\":\"dataorsbeg\",\"linkedServiceName\":{\"referenceName\":\"lmexafjqzyhz\",\"parameters\":{\"nsskydigt\":\"datavtuqvirl\",\"ocsvjekejchxzj\":\"datajx\",\"yfyixecmasjnfgng\":\"datacwuzs\"}},\"parameters\":{\"wxtxuzhvojyf\":{\"type\":\"String\",\"defaultValue\":\"dataeyvfxbfckmoaljax\"},\"jef\":{\"type\":\"Float\",\"defaultValue\":\"datalbkjcdzuiygtcyz\"},\"lrlkbh\":{\"type\":\"Int\",\"defaultValue\":\"dataaldjcgldry\"},\"xefppq\":{\"type\":\"String\",\"defaultValue\":\"datamxcaujbfomfbozpj\"}},\"annotations\":[\"datannjjthpsnxebycy\",\"datapohxubn\"],\"folder\":{\"name\":\"sebcxno\"},\"\":{\"gspjlf\":\"datadyzssjlmykdygj\",\"ngwqxcrbcrgyoim\":\"datah\",\"z\":\"datas\",\"htvagwnnw\":\"datacctvkog\"}}")
            .toObject(DrillTableDataset.class);
        Assertions.assertEquals("m", model.description());
        Assertions.assertEquals("lmexafjqzyhz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("wxtxuzhvojyf").type());
        Assertions.assertEquals("sebcxno", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DrillTableDataset model = new DrillTableDataset().withDescription("m").withStructure("dataghqeuyaorservpv")
            .withSchema("dataorsbeg")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("lmexafjqzyhz").withParameters(
                mapOf("nsskydigt", "datavtuqvirl", "ocsvjekejchxzj", "datajx", "yfyixecmasjnfgng", "datacwuzs")))
            .withParameters(mapOf("wxtxuzhvojyf",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataeyvfxbfckmoaljax"),
                "jef",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datalbkjcdzuiygtcyz"),
                "lrlkbh", new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataaldjcgldry"),
                "xefppq",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datamxcaujbfomfbozpj")))
            .withAnnotations(Arrays.asList("datannjjthpsnxebycy", "datapohxubn"))
            .withFolder(new DatasetFolder().withName("sebcxno")).withTableName("dataugdcr").withTable("databplvhmhur")
            .withSchemaTypePropertiesSchema("datadjlz");
        model = BinaryData.fromObject(model).toObject(DrillTableDataset.class);
        Assertions.assertEquals("m", model.description());
        Assertions.assertEquals("lmexafjqzyhz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("wxtxuzhvojyf").type());
        Assertions.assertEquals("sebcxno", model.folder().name());
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
