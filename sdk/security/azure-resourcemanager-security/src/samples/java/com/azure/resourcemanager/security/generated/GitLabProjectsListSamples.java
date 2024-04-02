// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for GitLabProjects List.
 */
public final class GitLabProjectsListSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2023-09-01-preview/examples/
     * SecurityConnectorsDevOps/ListGitLabProjects_example.json
     */
    /**
     * Sample code: List_GitLabProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listGitLabProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitLabProjects().list("myRg", "mySecurityConnectorName", "myGitLabGroup$mySubGroup",
            com.azure.core.util.Context.NONE);
    }
}
