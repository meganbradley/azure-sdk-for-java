// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for TimeZones ListByLocation.
 */
public final class TimeZonesListByLocationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * ManagedInstanceTimeZoneListByLocation.json
     */
    /**
     * Sample code: List managed instance time zones by location.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedInstanceTimeZonesByLocation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getTimeZones().listByLocation("canadaeast",
            com.azure.core.util.Context.NONE);
    }
}
