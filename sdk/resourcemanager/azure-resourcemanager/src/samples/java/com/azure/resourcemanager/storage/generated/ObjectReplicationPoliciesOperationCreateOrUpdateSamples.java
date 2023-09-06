// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.fluent.models.ObjectReplicationPolicyInner;
import com.azure.resourcemanager.storage.models.ObjectReplicationPolicyFilter;
import com.azure.resourcemanager.storage.models.ObjectReplicationPolicyRule;
import java.util.Arrays;

/** Samples for ObjectReplicationPoliciesOperation CreateOrUpdate. */
public final class ObjectReplicationPoliciesOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountCreateObjectReplicationPolicyOnSource.json
     */
    /**
     * Sample code: StorageAccountCreateObjectReplicationPolicyOnSource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountCreateObjectReplicationPolicyOnSource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getObjectReplicationPoliciesOperations()
            .createOrUpdateWithResponse(
                "res7687",
                "src1122",
                "2a20bb73-5717-4635-985a-5d4cf777438f",
                new ObjectReplicationPolicyInner()
                    .withSourceAccount("src1122")
                    .withDestinationAccount("dst112")
                    .withRules(
                        Arrays
                            .asList(
                                new ObjectReplicationPolicyRule()
                                    .withRuleId("d5d18a48-8801-4554-aeaa-74faf65f5ef9")
                                    .withSourceContainer("scont139")
                                    .withDestinationContainer("dcont139")
                                    .withFilters(
                                        new ObjectReplicationPolicyFilter()
                                            .withPrefixMatch(Arrays.asList("blobA", "blobB"))
                                            .withMinCreationTime("2020-02-19T16:05:00Z")))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountUpdateObjectReplicationPolicyOnDestination.json
     */
    /**
     * Sample code: StorageAccountUpdateObjectReplicationPolicyOnDestination.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountUpdateObjectReplicationPolicyOnDestination(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getObjectReplicationPoliciesOperations()
            .createOrUpdateWithResponse(
                "res7687",
                "dst112",
                "2a20bb73-5717-4635-985a-5d4cf777438f",
                new ObjectReplicationPolicyInner()
                    .withSourceAccount("src1122")
                    .withDestinationAccount("dst112")
                    .withRules(
                        Arrays
                            .asList(
                                new ObjectReplicationPolicyRule()
                                    .withRuleId("d5d18a48-8801-4554-aeaa-74faf65f5ef9")
                                    .withSourceContainer("scont139")
                                    .withDestinationContainer("dcont139")
                                    .withFilters(
                                        new ObjectReplicationPolicyFilter()
                                            .withPrefixMatch(Arrays.asList("blobA", "blobB"))),
                                new ObjectReplicationPolicyRule()
                                    .withSourceContainer("scont179")
                                    .withDestinationContainer("dcont179"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountCreateObjectReplicationPolicyOnDestination.json
     */
    /**
     * Sample code: StorageAccountCreateObjectReplicationPolicyOnDestination.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountCreateObjectReplicationPolicyOnDestination(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getObjectReplicationPoliciesOperations()
            .createOrUpdateWithResponse(
                "res7687",
                "dst112",
                "default",
                new ObjectReplicationPolicyInner()
                    .withSourceAccount("src1122")
                    .withDestinationAccount("dst112")
                    .withRules(
                        Arrays
                            .asList(
                                new ObjectReplicationPolicyRule()
                                    .withSourceContainer("scont139")
                                    .withDestinationContainer("dcont139")
                                    .withFilters(
                                        new ObjectReplicationPolicyFilter()
                                            .withPrefixMatch(Arrays.asList("blobA", "blobB"))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountUpdateObjectReplicationPolicyOnSource.json
     */
    /**
     * Sample code: StorageAccountUpdateObjectReplicationPolicyOnSource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountUpdateObjectReplicationPolicyOnSource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getObjectReplicationPoliciesOperations()
            .createOrUpdateWithResponse(
                "res7687",
                "src1122",
                "2a20bb73-5717-4635-985a-5d4cf777438f",
                new ObjectReplicationPolicyInner()
                    .withSourceAccount("src1122")
                    .withDestinationAccount("dst112")
                    .withRules(
                        Arrays
                            .asList(
                                new ObjectReplicationPolicyRule()
                                    .withRuleId("d5d18a48-8801-4554-aeaa-74faf65f5ef9")
                                    .withSourceContainer("scont139")
                                    .withDestinationContainer("dcont139")
                                    .withFilters(
                                        new ObjectReplicationPolicyFilter()
                                            .withPrefixMatch(Arrays.asList("blobA", "blobB"))),
                                new ObjectReplicationPolicyRule()
                                    .withRuleId("cfbb4bc2-8b60-429f-b05a-d1e0942b33b2")
                                    .withSourceContainer("scont179")
                                    .withDestinationContainer("dcont179"))),
                com.azure.core.util.Context.NONE);
    }
}
