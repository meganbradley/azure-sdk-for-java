// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/** Samples for StorageAccounts RevokeUserDelegationKeys. */
public final class StorageAccountsRevokeUserDelegationKeysSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountRevokeUserDelegationKeys.json
     */
    /**
     * Sample code: StorageAccountRevokeUserDelegationKeys.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountRevokeUserDelegationKeys(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getStorageAccounts()
            .revokeUserDelegationKeysWithResponse("res4167", "sto3539", com.azure.core.util.Context.NONE);
    }
}
