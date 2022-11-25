// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnection ListByBatchAccount. */
public final class PrivateEndpointConnectionListByBatchAccountSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-10-01/examples/PrivateEndpointConnectionsList.json
     */
    /**
     * Sample code: ListPrivateEndpointConnections.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void listPrivateEndpointConnections(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .privateEndpointConnections()
            .listByBatchAccount("default-azurebatch-japaneast", "sampleacct", null, Context.NONE);
    }
}
