// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

/**
 * Samples for Deployments ListByResourceGroup.
 */
public final class DeploymentsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/nginx/resource-manager/NGINX.NGINXPLUS/stable/2023-04-01/examples/Deployments_ListByResourceGroup.
     * json
     */
    /**
     * Sample code: Deployments_ListByResourceGroup.
     * 
     * @param manager Entry point to NginxManager.
     */
    public static void deploymentsListByResourceGroup(com.azure.resourcemanager.nginx.NginxManager manager) {
        manager.deployments().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
