// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.SqlElasticPoolResourceSettings;
import com.azure.resourcemanager.resourcemover.models.ZoneRedundant;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SqlElasticPoolResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlElasticPoolResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.Sql/servers/elasticPools\",\"tags\":{\"txmedj\":\"lgqg\",\"lynqwwncwzzh\":\"c\",\"ellwptfdy\":\"gktrmgucnapkte\",\"rhhuaopppcqeqx\":\"pfqbuaceopzf\"},\"zoneRedundant\":\"Enable\",\"targetResourceName\":\"ahzxctobgbk\",\"targetResourceGroupName\":\"oizpostmgrcfbun\"}")
                .toObject(SqlElasticPoolResourceSettings.class);
        Assertions.assertEquals("ahzxctobgbk", model.targetResourceName());
        Assertions.assertEquals("oizpostmgrcfbun", model.targetResourceGroupName());
        Assertions.assertEquals("lgqg", model.tags().get("txmedj"));
        Assertions.assertEquals(ZoneRedundant.ENABLE, model.zoneRedundant());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlElasticPoolResourceSettings model =
            new SqlElasticPoolResourceSettings()
                .withTargetResourceName("ahzxctobgbk")
                .withTargetResourceGroupName("oizpostmgrcfbun")
                .withTags(
                    mapOf(
                        "txmedj",
                        "lgqg",
                        "lynqwwncwzzh",
                        "c",
                        "ellwptfdy",
                        "gktrmgucnapkte",
                        "rhhuaopppcqeqx",
                        "pfqbuaceopzf"))
                .withZoneRedundant(ZoneRedundant.ENABLE);
        model = BinaryData.fromObject(model).toObject(SqlElasticPoolResourceSettings.class);
        Assertions.assertEquals("ahzxctobgbk", model.targetResourceName());
        Assertions.assertEquals("oizpostmgrcfbun", model.targetResourceGroupName());
        Assertions.assertEquals("lgqg", model.tags().get("txmedj"));
        Assertions.assertEquals(ZoneRedundant.ENABLE, model.zoneRedundant());
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
