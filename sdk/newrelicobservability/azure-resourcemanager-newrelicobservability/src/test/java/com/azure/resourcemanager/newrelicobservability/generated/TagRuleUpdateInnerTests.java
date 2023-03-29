// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.TagRuleUpdateInner;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TagRuleUpdateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagRuleUpdateInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[]},\"metricRules\":{\"sendMetrics\":\"Disabled\",\"filteringTags\":[],\"userEmail\":\"xfvjrbirp\"}}}")
                .toObject(TagRuleUpdateInner.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("xfvjrbirp", model.metricRules().userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagRuleUpdateInner model =
            new TagRuleUpdateInner()
                .withLogRules(
                    new LogRules()
                        .withSendAadLogs(SendAadLogsStatus.DISABLED)
                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                        .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                        .withFilteringTags(Arrays.asList()))
                .withMetricRules(
                    new MetricRulesInner()
                        .withSendMetrics(SendMetricsStatus.DISABLED)
                        .withFilteringTags(Arrays.asList())
                        .withUserEmail("xfvjrbirp"));
        model = BinaryData.fromObject(model).toObject(TagRuleUpdateInner.class);
        Assertions.assertEquals(SendAadLogsStatus.DISABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("xfvjrbirp", model.metricRules().userEmail());
    }
}
