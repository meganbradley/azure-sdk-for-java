// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for TrunkedNetworks CreateOrUpdate. */
public final class TrunkedNetworksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/TrunkedNetworks_Create.json
     */
    /**
     * Sample code: Create or update trunked network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void createOrUpdateTrunkedNetwork(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .trunkedNetworks()
            .define("trunkedNetworkName")
            .withRegion("location")
            .withExistingResourceGroup("resourceGroupName")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withName(
                        "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ExtendedLocation/customLocations/clusterExtendedLocationName")
                    .withType("CustomLocation"))
            .withIsolationDomainIds(
                Arrays
                    .asList(
                        "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/l2IsolationDomains/l2IsolationDomainName",
                        "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/l3IsolationDomains/l3IsolationDomainName"))
            .withVlans(Arrays.asList(12L, 14L))
            .withTags(mapOf("key1", "myvalue1", "key2", "myvalue2"))
            .withHybridAksPluginType(HybridAksPluginType.DPDK)
            .withInterfaceName("eth0")
            .create();
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
