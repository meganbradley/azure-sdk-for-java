// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonRedshiftTableDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AmazonRedshiftTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonRedshiftTableDataset model = BinaryData.fromString(
            "{\"type\":\"AmazonRedshiftTable\",\"typeProperties\":{\"tableName\":\"datamhidyliuajkln\",\"table\":\"datagdnxqeon\",\"schema\":\"datarjjaojpz\"},\"description\":\"d\",\"structure\":\"dataigecwsadsqyuddkh\",\"schema\":\"datadmohheuyu\",\"linkedServiceName\":{\"referenceName\":\"nxmyevyigde\",\"parameters\":{\"ejwli\":\"datafi\"}},\"parameters\":{\"pqokhdyncra\":{\"type\":\"Bool\",\"defaultValue\":\"datajzwhajod\"},\"m\":{\"type\":\"Int\",\"defaultValue\":\"dataewb\"},\"clmslnunkqvz\":{\"type\":\"Int\",\"defaultValue\":\"datapmqnmelyksygih\"}},\"annotations\":[\"databajdexquawexi\",\"databfzetjizwh\",\"datanbmajvvyxtvvx\",\"dataakzixb\"],\"folder\":{\"name\":\"bfmlngfwhrmvlakn\"},\"\":{\"zblxna\":\"datawxn\",\"kovohwvpr\":\"datahsmfndcbsyhludzj\",\"cntjna\":\"datafdvtdurmdt\"}}")
            .toObject(AmazonRedshiftTableDataset.class);
        Assertions.assertEquals("d", model.description());
        Assertions.assertEquals("nxmyevyigde", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("pqokhdyncra").type());
        Assertions.assertEquals("bfmlngfwhrmvlakn", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonRedshiftTableDataset model = new AmazonRedshiftTableDataset().withDescription("d")
            .withStructure("dataigecwsadsqyuddkh").withSchema("datadmohheuyu")
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("nxmyevyigde").withParameters(mapOf("ejwli", "datafi")))
            .withParameters(mapOf("pqokhdyncra",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datajzwhajod"), "m",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataewb"), "clmslnunkqvz",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datapmqnmelyksygih")))
            .withAnnotations(Arrays.asList("databajdexquawexi", "databfzetjizwh", "datanbmajvvyxtvvx", "dataakzixb"))
            .withFolder(new DatasetFolder().withName("bfmlngfwhrmvlakn")).withTableName("datamhidyliuajkln")
            .withTable("datagdnxqeon").withSchemaTypePropertiesSchema("datarjjaojpz");
        model = BinaryData.fromObject(model).toObject(AmazonRedshiftTableDataset.class);
        Assertions.assertEquals("d", model.description());
        Assertions.assertEquals("nxmyevyigde", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("pqokhdyncra").type());
        Assertions.assertEquals("bfmlngfwhrmvlakn", model.folder().name());
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
