// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for WorkspaceSettings Delete. */
public final class WorkspaceSettingsDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2017-08-01-preview/examples/WorkspaceSettings/DeleteWorkspaceSetting_example.json
     */
    /**
     * Sample code: Delete a workspace setting data for resource group.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteAWorkspaceSettingDataForResourceGroup(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.workspaceSettings().deleteWithResponse("default", com.azure.core.util.Context.NONE);
    }
}
