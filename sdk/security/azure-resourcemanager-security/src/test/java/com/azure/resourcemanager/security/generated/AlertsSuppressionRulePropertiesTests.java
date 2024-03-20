// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AlertsSuppressionRuleProperties;
import com.azure.resourcemanager.security.models.RuleState;
import com.azure.resourcemanager.security.models.ScopeElement;
import com.azure.resourcemanager.security.models.SuppressionAlertsScope;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AlertsSuppressionRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertsSuppressionRuleProperties model = BinaryData.fromString(
            "{\"alertType\":\"y\",\"lastModifiedUtc\":\"2021-01-23T15:12:07Z\",\"expirationDateUtc\":\"2020-12-25T06:53:33Z\",\"reason\":\"uqqkpik\",\"state\":\"Disabled\",\"comment\":\"gvtqagnbuynh\",\"suppressionAlertsScope\":{\"allOf\":[{\"field\":\"mebf\",\"\":{\"rcvpnazzmhjrunmp\":\"datarbu\"}}]}}")
            .toObject(AlertsSuppressionRuleProperties.class);
        Assertions.assertEquals("y", model.alertType());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T06:53:33Z"), model.expirationDateUtc());
        Assertions.assertEquals("uqqkpik", model.reason());
        Assertions.assertEquals(RuleState.DISABLED, model.state());
        Assertions.assertEquals("gvtqagnbuynh", model.comment());
        Assertions.assertEquals("mebf", model.suppressionAlertsScope().allOf().get(0).field());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertsSuppressionRuleProperties model = new AlertsSuppressionRuleProperties().withAlertType("y")
            .withExpirationDateUtc(OffsetDateTime.parse("2020-12-25T06:53:33Z")).withReason("uqqkpik")
            .withState(RuleState.DISABLED).withComment("gvtqagnbuynh")
            .withSuppressionAlertsScope(new SuppressionAlertsScope()
                .withAllOf(Arrays.asList(new ScopeElement().withField("mebf").withAdditionalProperties(mapOf()))));
        model = BinaryData.fromObject(model).toObject(AlertsSuppressionRuleProperties.class);
        Assertions.assertEquals("y", model.alertType());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T06:53:33Z"), model.expirationDateUtc());
        Assertions.assertEquals("uqqkpik", model.reason());
        Assertions.assertEquals(RuleState.DISABLED, model.state());
        Assertions.assertEquals("gvtqagnbuynh", model.comment());
        Assertions.assertEquals("mebf", model.suppressionAlertsScope().allOf().get(0).field());
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
