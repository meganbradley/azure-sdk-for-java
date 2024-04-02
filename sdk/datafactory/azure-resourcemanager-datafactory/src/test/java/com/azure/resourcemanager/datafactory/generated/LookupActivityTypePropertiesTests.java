// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.LookupActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LookupActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LookupActivityTypeProperties model = BinaryData.fromString(
            "{\"source\":{\"type\":\"CopySource\",\"sourceRetryCount\":\"datagfojdb\",\"sourceRetryWait\":\"datasmnelqlqnwv\",\"maxConcurrentConnections\":\"dataxzdimnfnrpq\",\"disableMetricsCollection\":\"datazgncyksblre\",\"\":{\"xdemcyrblw\":\"dataakmibiylkfne\"}},\"dataset\":{\"referenceName\":\"hzyrugstbzpozqlu\",\"parameters\":{\"xol\":\"datagkttlp\",\"lqdotqe\":\"datajevww\"}},\"firstRowOnly\":\"dataenteucaojj\"}")
            .toObject(LookupActivityTypeProperties.class);
        Assertions.assertEquals("hzyrugstbzpozqlu", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LookupActivityTypeProperties model = new LookupActivityTypeProperties()
            .withSource(new CopySource().withSourceRetryCount("datagfojdb").withSourceRetryWait("datasmnelqlqnwv")
                .withMaxConcurrentConnections("dataxzdimnfnrpq").withDisableMetricsCollection("datazgncyksblre")
                .withAdditionalProperties(mapOf("type", "CopySource")))
            .withDataset(new DatasetReference().withReferenceName("hzyrugstbzpozqlu")
                .withParameters(mapOf("xol", "datagkttlp", "lqdotqe", "datajevww")))
            .withFirstRowOnly("dataenteucaojj");
        model = BinaryData.fromObject(model).toObject(LookupActivityTypeProperties.class);
        Assertions.assertEquals("hzyrugstbzpozqlu", model.dataset().referenceName());
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
