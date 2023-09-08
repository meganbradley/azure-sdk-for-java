// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for GatewayRouteConfigs Get. */
public final class GatewayRouteConfigsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/GatewayRouteConfigs_Get.json
     */
    /**
     * Sample code: GatewayRouteConfigs_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gatewayRouteConfigsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getGatewayRouteConfigs()
            .getWithResponse("myResourceGroup", "myservice", "default", "myRouteConfig", Context.NONE);
    }
}
