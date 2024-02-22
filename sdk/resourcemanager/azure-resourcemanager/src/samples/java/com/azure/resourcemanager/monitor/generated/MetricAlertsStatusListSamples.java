// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/**
 * Samples for MetricAlertsStatus List.
 */
public final class MetricAlertsStatusListSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/stable/2018-03-01/examples/getMetricAlertStatus.json
     */
    /**
     * Sample code: Get an alert rule status.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnAlertRuleStatus(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getMetricAlertsStatus().listWithResponse("gigtest",
            "chiricutin", com.azure.core.util.Context.NONE);
    }
}
