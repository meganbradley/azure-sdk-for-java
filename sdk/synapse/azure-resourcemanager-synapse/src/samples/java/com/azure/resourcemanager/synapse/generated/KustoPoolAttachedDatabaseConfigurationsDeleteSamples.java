// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoPoolAttachedDatabaseConfigurations Delete. */
public final class KustoPoolAttachedDatabaseConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolAttachedDatabaseConfigurationsDelete.json
     */
    /**
     * Sample code: KustoPoolAttachedDatabaseConfigurationsDelete.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolAttachedDatabaseConfigurationsDelete(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolAttachedDatabaseConfigurations()
            .delete(
                "kustorptest", "kustoclusterrptest4", "attachedDatabaseConfigurations1", "kustorptest", Context.NONE);
    }
}
