// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.fluent.models.ScopeMapInner;
import java.util.Arrays;

/**
 * Samples for ScopeMaps Create.
 */
public final class ScopeMapsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/
     * ScopeMapCreate.json
     */
    /**
     * Sample code: ScopeMapCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void scopeMapCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getScopeMaps().create("myResourceGroup", "myRegistry",
            "myScopeMap",
            new ScopeMapInner().withDescription("Developer Scopes").withActions(
                Arrays.asList("repositories/myrepository/contentWrite", "repositories/myrepository/delete")),
            com.azure.core.util.Context.NONE);
    }
}
