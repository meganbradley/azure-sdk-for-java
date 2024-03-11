// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for DataTransferJobs Resume.
 */
public final class DataTransferJobsResumeSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/data-transfer-
     * service/CosmosDBDataTransferJobResume.json
     */
    /**
     * Sample code: CosmosDBDataTransferJobResume.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDataTransferJobResume(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getDataTransferJobs().resumeWithResponse("rg1", "ddb1", "j1",
            com.azure.core.util.Context.NONE);
    }
}
