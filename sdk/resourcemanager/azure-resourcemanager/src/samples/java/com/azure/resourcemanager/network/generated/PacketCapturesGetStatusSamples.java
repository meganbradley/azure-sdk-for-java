// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for PacketCaptures GetStatus. */
public final class PacketCapturesGetStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkWatcherPacketCaptureQueryStatus.json
     */
    /**
     * Sample code: Query packet capture status.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void queryPacketCaptureStatus(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getPacketCaptures().getStatus("rg1", "nw1", "pc1", Context.NONE);
    }
}
