// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimes GetConnectionInfo. */
public final class IntegrationRuntimesGetConnectionInfoSamples {
    /*
     * operationId: IntegrationRuntimes_GetConnectionInfo
     * api-version: 2018-06-01
     * x-ms-examples: IntegrationRuntimes_GetConnectionInfo
     */
    /**
     * Sample code: IntegrationRuntimes_GetConnectionInfo.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void integrationRuntimesGetConnectionInfo(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .integrationRuntimes()
            .getConnectionInfoWithResponse(
                "exampleResourceGroup", "exampleFactoryName", "exampleIntegrationRuntime", Context.NONE);
    }
}
