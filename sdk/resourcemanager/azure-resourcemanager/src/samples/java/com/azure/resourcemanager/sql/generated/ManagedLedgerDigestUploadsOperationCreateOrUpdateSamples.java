// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.ManagedLedgerDigestUploadsInner;
import com.azure.resourcemanager.sql.models.ManagedLedgerDigestUploadsName;

/**
 * Samples for ManagedLedgerDigestUploadsOperation CreateOrUpdate.
 */
public final class ManagedLedgerDigestUploadsOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/
     * ManagedLedgerDigestUploadsEnable.json
     */
    /**
     * Sample code: Enables managed ledger digest upload configuration for a database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void enablesManagedLedgerDigestUploadConfigurationForADatabase(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedLedgerDigestUploadsOperations().createOrUpdate(
            "ledgertestrg", "ledgertestserver", "testdb", ManagedLedgerDigestUploadsName.CURRENT,
            new ManagedLedgerDigestUploadsInner().withDigestStorageEndpoint("https://MyAccount.blob.core.windows.net"),
            com.azure.core.util.Context.NONE);
    }
}
