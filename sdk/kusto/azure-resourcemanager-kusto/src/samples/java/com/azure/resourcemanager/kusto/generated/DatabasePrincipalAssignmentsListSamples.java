// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

/** Samples for DatabasePrincipalAssignments List. */
public final class DatabasePrincipalAssignmentsListSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoDatabasePrincipalAssignmentsList.json
     */
    /**
     * Sample code: KustoPrincipalAssignmentsList.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoPrincipalAssignmentsList(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .databasePrincipalAssignments()
            .list("kustorptest", "kustoCluster", "Kustodatabase8", com.azure.core.util.Context.NONE);
    }
}
