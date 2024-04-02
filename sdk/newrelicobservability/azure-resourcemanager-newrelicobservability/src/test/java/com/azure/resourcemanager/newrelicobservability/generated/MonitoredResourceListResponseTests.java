// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.MonitoredResourceListResponse;
import com.azure.resourcemanager.newrelicobservability.models.SendingLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendingMetricsStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoredResourceListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoredResourceListResponse model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"gyncocpecfvmmc\",\"sendingMetrics\":\"Disabled\",\"reasonForMetricsStatus\":\"xlzevgbmqjqabcy\",\"sendingLogs\":\"Disabled\",\"reasonForLogsStatus\":\"kwlzuvccfwnfn\"},{\"id\":\"cfionl\",\"sendingMetrics\":\"Enabled\",\"reasonForMetricsStatus\":\"tqgtzxdpnqbqq\",\"sendingLogs\":\"Disabled\",\"reasonForLogsStatus\":\"feallnwsu\"}],\"nextLink\":\"snjampmng\"}")
            .toObject(MonitoredResourceListResponse.class);
        Assertions.assertEquals("gyncocpecfvmmc", model.value().get(0).id());
        Assertions.assertEquals(SendingMetricsStatus.DISABLED, model.value().get(0).sendingMetrics());
        Assertions.assertEquals("xlzevgbmqjqabcy", model.value().get(0).reasonForMetricsStatus());
        Assertions.assertEquals(SendingLogsStatus.DISABLED, model.value().get(0).sendingLogs());
        Assertions.assertEquals("kwlzuvccfwnfn", model.value().get(0).reasonForLogsStatus());
        Assertions.assertEquals("snjampmng", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoredResourceListResponse model = new MonitoredResourceListResponse().withValue(Arrays.asList(
            new MonitoredResourceInner().withId("gyncocpecfvmmc").withSendingMetrics(SendingMetricsStatus.DISABLED)
                .withReasonForMetricsStatus("xlzevgbmqjqabcy").withSendingLogs(SendingLogsStatus.DISABLED)
                .withReasonForLogsStatus("kwlzuvccfwnfn"),
            new MonitoredResourceInner().withId("cfionl").withSendingMetrics(SendingMetricsStatus.ENABLED)
                .withReasonForMetricsStatus("tqgtzxdpnqbqq").withSendingLogs(SendingLogsStatus.DISABLED)
                .withReasonForLogsStatus("feallnwsu")))
            .withNextLink("snjampmng");
        model = BinaryData.fromObject(model).toObject(MonitoredResourceListResponse.class);
        Assertions.assertEquals("gyncocpecfvmmc", model.value().get(0).id());
        Assertions.assertEquals(SendingMetricsStatus.DISABLED, model.value().get(0).sendingMetrics());
        Assertions.assertEquals("xlzevgbmqjqabcy", model.value().get(0).reasonForMetricsStatus());
        Assertions.assertEquals(SendingLogsStatus.DISABLED, model.value().get(0).sendingLogs());
        Assertions.assertEquals("kwlzuvccfwnfn", model.value().get(0).reasonForLogsStatus());
        Assertions.assertEquals("snjampmng", model.nextLink());
    }
}
