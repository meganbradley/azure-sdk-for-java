// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.resourcemanager.kusto.models.BlobStorageEventType;
import com.azure.resourcemanager.kusto.models.CosmosDbDataConnection;
import com.azure.resourcemanager.kusto.models.DatabaseRouting;
import com.azure.resourcemanager.kusto.models.EventGridDataConnection;
import com.azure.resourcemanager.kusto.models.EventGridDataFormat;
import com.azure.resourcemanager.kusto.models.EventHubDataConnection;
import java.time.OffsetDateTime;

/** Samples for DataConnections Update. */
public final class DataConnectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoDataConnectionsCosmosDbUpdate.json
     */
    /**
     * Sample code: KustoDataConnectionsCosmosDbUpdate.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionsCosmosDbUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .update(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase1",
                "dataConnectionTest",
                new CosmosDbDataConnection()
                    .withLocation("westus")
                    .withTableName("TestTable")
                    .withMappingRuleName("TestMapping")
                    .withManagedIdentityResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.ManagedIdentity/userAssignedIdentities/managedidentityTest1")
                    .withCosmosDbAccountResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.DocumentDb/databaseAccounts/cosmosDbAccountTest1")
                    .withCosmosDbDatabase("cosmosDbDatabaseTest")
                    .withCosmosDbContainer("cosmosDbContainerTest")
                    .withRetrievalStartDate(OffsetDateTime.parse("2022-07-29T12:00:00.6554616Z")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoDataConnectionsUpdate.json
     */
    /**
     * Sample code: KustoDataConnectionsUpdate.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionsUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .update(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                "dataConnectionTest",
                new EventHubDataConnection()
                    .withLocation("westus")
                    .withEventHubResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.EventHub/namespaces/eventhubTestns1/eventhubs/eventhubTest1")
                    .withConsumerGroup("testConsumerGroup1")
                    .withManagedIdentityResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.ManagedIdentity/userAssignedIdentities/managedidentityTest1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoDataConnectionsEventGridUpdate.json
     */
    /**
     * Sample code: KustoDataConnectionsEventGridUpdate.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionsEventGridUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .update(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                "dataConnectionTest",
                new EventGridDataConnection()
                    .withLocation("westus")
                    .withStorageAccountResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Storage/storageAccounts/teststorageaccount")
                    .withEventGridResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Storage/storageAccounts/teststorageaccount/providers/Microsoft.EventGrid/eventSubscriptions/eventSubscriptionTest")
                    .withEventHubResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.EventHub/namespaces/eventhubTestns1/eventhubs/eventhubTest2")
                    .withConsumerGroup("$Default")
                    .withTableName("TestTable")
                    .withMappingRuleName("TestMapping")
                    .withDataFormat(EventGridDataFormat.JSON)
                    .withIgnoreFirstRecord(false)
                    .withBlobStorageEventType(BlobStorageEventType.MICROSOFT_STORAGE_BLOB_CREATED)
                    .withManagedIdentityResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.ManagedIdentity/userAssignedIdentities/managedidentityTest1")
                    .withDatabaseRouting(DatabaseRouting.SINGLE),
                com.azure.core.util.Context.NONE);
    }
}
