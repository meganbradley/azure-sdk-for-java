// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.ClientEncryptionKeyCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.models.ClientEncryptionKeyResource;
import com.azure.resourcemanager.cosmos.models.KeyWrapMetadata;

/** Samples for SqlResources CreateUpdateClientEncryptionKey. */
public final class SqlResourcesCreateUpdateClientEncryptionKeySamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBSqlClientEncryptionKeyCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBClientEncryptionKeyCreateUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBClientEncryptionKeyCreateUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .createUpdateClientEncryptionKey(
                "rgName",
                "accountName",
                "databaseName",
                "cekName",
                new ClientEncryptionKeyCreateUpdateParameters()
                    .withResource(
                        new ClientEncryptionKeyResource()
                            .withId("cekName")
                            .withEncryptionAlgorithm("AEAD_AES_256_CBC_HMAC_SHA256")
                            .withWrappedDataEncryptionKey("U3dhZ2dlciByb2Nrcw==".getBytes())
                            .withKeyWrapMetadata(
                                new KeyWrapMetadata()
                                    .withName("customerManagedKey")
                                    .withType("AzureKeyVault")
                                    .withValue("AzureKeyVault Key URL")
                                    .withAlgorithm("RSA-OAEP"))),
                com.azure.core.util.Context.NONE);
    }
}
