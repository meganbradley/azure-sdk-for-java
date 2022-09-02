// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for Projects Delete. */
public final class ProjectsDeleteSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-08-01-preview/examples/Projects_Delete.json
     */
    /**
     * Sample code: Projects_Delete.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void projectsDelete(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.projects().delete("rg1", "{projectName}", Context.NONE);
    }
}
