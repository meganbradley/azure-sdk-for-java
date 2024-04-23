// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/**
 * Samples for ProjectCatalogEnvironmentDefinitions GetErrorDetails.
 */
public final class ProjectCatalogEnvironmentDefinitionsGetErrorDetailsSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/ProjectCatalogEnvironmentDefinitions_GetErrorDetails.json
     */
    /**
     * Sample code: ProjectCatalogEnvironmentDefinitions_GetErrorDetails.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void projectCatalogEnvironmentDefinitionsGetErrorDetails(
        com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.projectCatalogEnvironmentDefinitions()
            .getErrorDetailsWithResponse("rg1", "DevProject", "myCatalog", "myEnvironmentDefinition",
                com.azure.core.util.Context.NONE);
    }
}
