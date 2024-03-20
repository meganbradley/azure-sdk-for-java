// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SybaseTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SybaseTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SybaseTableDataset model = BinaryData.fromString(
            "{\"type\":\"SybaseTable\",\"typeProperties\":{\"tableName\":\"datacrolrzesbomp\"},\"description\":\"kymunwjivtb\",\"structure\":\"datazbdjrdfeujywdal\",\"schema\":\"datadeqngc\",\"linkedServiceName\":{\"referenceName\":\"ydzin\",\"parameters\":{\"xrsi\":\"dataulpozmdahyc\",\"oiaf\":\"dataoebld\",\"x\":\"datajkrtnhrevimxm\"}},\"parameters\":{\"oqtbfkvuozbzc\":{\"type\":\"Object\",\"defaultValue\":\"datatygvdwd\"},\"rlcydjht\":{\"type\":\"Object\",\"defaultValue\":\"dataekwanklp\"}},\"annotations\":[\"dataerwi\",\"datandurdonkgobxbl\",\"datadolenrsw\",\"datanpdrgnmzaofroe\"],\"folder\":{\"name\":\"kievyrej\"},\"\":{\"ftusdwmnrt\":\"databk\",\"nrovome\":\"datavbuc\"}}")
            .toObject(SybaseTableDataset.class);
        Assertions.assertEquals("kymunwjivtb", model.description());
        Assertions.assertEquals("ydzin", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("oqtbfkvuozbzc").type());
        Assertions.assertEquals("kievyrej", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SybaseTableDataset model = new SybaseTableDataset().withDescription("kymunwjivtb")
            .withStructure("datazbdjrdfeujywdal").withSchema("datadeqngc")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ydzin")
                .withParameters(mapOf("xrsi", "dataulpozmdahyc", "oiaf", "dataoebld", "x", "datajkrtnhrevimxm")))
            .withParameters(mapOf("oqtbfkvuozbzc",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datatygvdwd"), "rlcydjht",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataekwanklp")))
            .withAnnotations(Arrays.asList("dataerwi", "datandurdonkgobxbl", "datadolenrsw", "datanpdrgnmzaofroe"))
            .withFolder(new DatasetFolder().withName("kievyrej")).withTableName("datacrolrzesbomp");
        model = BinaryData.fromObject(model).toObject(SybaseTableDataset.class);
        Assertions.assertEquals("kymunwjivtb", model.description());
        Assertions.assertEquals("ydzin", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("oqtbfkvuozbzc").type());
        Assertions.assertEquals("kievyrej", model.folder().name());
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
