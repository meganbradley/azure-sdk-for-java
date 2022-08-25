// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.models.MigrationConfigurationName;

/** Samples for MigrationConfigs Delete. */
public final class MigrationConfigsDeleteSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/Migrationconfigurations/SBMigrationconfigurationDelete.json
     */
    /**
     * Sample code: MigrationConfigurationsDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void migrationConfigurationsDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getMigrationConfigs()
            .deleteWithResponse("ResourceGroup", "sdk-Namespace-41", MigrationConfigurationName.DEFAULT, Context.NONE);
    }
}
