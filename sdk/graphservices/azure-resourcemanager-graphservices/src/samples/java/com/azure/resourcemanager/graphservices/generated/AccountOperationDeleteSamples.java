// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.generated;

/** Samples for AccountOperation Delete. */
public final class AccountOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/graphservicesprod/resource-manager/Microsoft.GraphServices/preview/2022-09-22-preview/examples/Accounts_Delete.json
     */
    /**
     * Sample code: Delete account resource.
     *
     * @param manager Entry point to GraphServicesManager.
     */
    public static void deleteAccountResource(com.azure.resourcemanager.graphservices.GraphServicesManager manager) {
        manager
            .accountOperations()
            .deleteByResourceGroupWithResponse(
                "testResourceGroupGRAM", "11111111-aaaa-1111-bbbb-111111111111", com.azure.core.util.Context.NONE);
    }
}
