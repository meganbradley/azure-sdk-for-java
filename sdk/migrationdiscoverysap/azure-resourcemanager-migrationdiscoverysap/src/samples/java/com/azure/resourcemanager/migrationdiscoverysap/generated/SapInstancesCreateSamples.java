// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.generated;

import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SapInstances Create.
 */
public final class SapInstancesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/SAPDiscoverySites/preview/2023-10-01-preview/
     * examples/SAPInstances_Create.json
     */
    /**
     * Sample code: Creates the SAP Instance resource.
     * 
     * @param manager Entry point to MigrationDiscoverySapManager.
     */
    public static void createsTheSAPInstanceResource(
        com.azure.resourcemanager.migrationdiscoverysap.MigrationDiscoverySapManager manager) {
        manager.sapInstances().define("MPP_MPP").withRegion("eastus")
            .withExistingSapDiscoverySite("test-rg", "SampleSite")
            .withTags(mapOf("property1", "value1", "property2", "value2")).create();
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
