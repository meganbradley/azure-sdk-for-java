// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.IntervalInMins;
import com.azure.resourcemanager.compute.models.RequestRateByIntervalInput;
import java.time.OffsetDateTime;

/**
 * Samples for LogAnalytics ExportRequestRateByInterval.
 */
public final class LogAnalyticsExportRequestRateByIntervalSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/logAnalyticExamples
     * /LogAnalytics_RequestRateByInterval.json
     */
    /**
     * Sample code: Export logs which contain all Api requests made to Compute Resource Provider within the given time
     * period broken down by intervals.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        exportLogsWhichContainAllApiRequestsMadeToComputeResourceProviderWithinTheGivenTimePeriodBrokenDownByIntervals(
            com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getLogAnalytics().exportRequestRateByInterval("westus",
            new RequestRateByIntervalInput().withBlobContainerSasUri("https://somesasuri")
                .withFromTime(OffsetDateTime.parse("2018-01-21T01:54:06.862601Z"))
                .withToTime(OffsetDateTime.parse("2018-01-23T01:54:06.862601Z")).withGroupByResourceName(true)
                .withIntervalLength(IntervalInMins.FIVE_MINS),
            com.azure.core.util.Context.NONE);
    }
}
