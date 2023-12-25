// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for SyncMembers Get.
 */
public final class SyncMembersGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/SyncMemberGet.json
     */
    /**
     * Sample code: Get a sync member.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getASyncMember(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getSyncMembers().getWithResponse("syncgroupcrud-65440",
            "syncgroupcrud-8475", "syncgroupcrud-4328", "syncgroupcrud-3187", "syncmembercrud-4879",
            com.azure.core.util.Context.NONE);
    }
}
