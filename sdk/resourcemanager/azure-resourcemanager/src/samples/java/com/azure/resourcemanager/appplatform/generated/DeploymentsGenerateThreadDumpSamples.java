// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.models.DiagnosticParameters;

/** Samples for Deployments GenerateThreadDump. */
public final class DeploymentsGenerateThreadDumpSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/Deployments_GenerateThreadDump.json
     */
    /**
     * Sample code: Deployments_GenerateHeapDump.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploymentsGenerateHeapDump(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getDeployments()
            .generateThreadDump(
                "myResourceGroup",
                "myservice",
                "myapp",
                "mydeployment",
                new DiagnosticParameters().withAppInstance("myappinstance").withFilePath("/byos/diagnose"),
                com.azure.core.util.Context.NONE);
    }
}
