// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for Topology List. */
public final class TopologyListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/Topology/GetTopologySubscription_example.json
     */
    /**
     * Sample code: Get topology on a subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getTopologyOnASubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.topologies().list(com.azure.core.util.Context.NONE);
    }
}
