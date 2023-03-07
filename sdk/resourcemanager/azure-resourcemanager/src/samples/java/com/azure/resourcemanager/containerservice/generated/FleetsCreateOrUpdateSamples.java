// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.fluent.models.FleetInner;
import com.azure.resourcemanager.containerservice.models.FleetHubProfile;
import java.util.HashMap;
import java.util.Map;

/** Samples for Fleets CreateOrUpdate. */
public final class FleetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/preview/2022-09-02-preview/examples/Fleets_CreateOrUpdate.json
     */
    /**
     * Sample code: Creates or update a fleet resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createsOrUpdateAFleetResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getFleets()
            .createOrUpdate(
                "rg1",
                "fleet-1",
                new FleetInner()
                    .withLocation("East US")
                    .withTags(mapOf("archv2", "", "tier", "production"))
                    .withHubProfile(new FleetHubProfile().withDnsPrefix("dnsprefix1")),
                null,
                null,
                com.azure.core.util.Context.NONE);
    }

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
