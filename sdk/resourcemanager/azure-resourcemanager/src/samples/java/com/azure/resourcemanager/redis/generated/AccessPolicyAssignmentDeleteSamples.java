// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

/** Samples for AccessPolicyAssignment Delete. */
public final class AccessPolicyAssignmentDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2023-08-01/examples/RedisCacheAccessPolicyAssignmentDelete.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyAssignmentDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheAccessPolicyAssignmentDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getAccessPolicyAssignments()
            .delete("rg1", "cache1", "accessPolicyAssignmentName1", com.azure.core.util.Context.NONE);
    }
}
