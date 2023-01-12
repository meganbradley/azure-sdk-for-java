// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

/** Samples for Products ListDetails. */
public final class ProductsListDetailsSamples {
    /*
     * x-ms-original-file: specification/azurestack/resource-manager/Microsoft.AzureStack/stable/2022-06-01/examples/Product/Post.json
     */
    /**
     * Sample code: Returns the extended properties of a product.
     *
     * @param manager Entry point to AzureStackManager.
     */
    public static void returnsTheExtendedPropertiesOfAProduct(
        com.azure.resourcemanager.azurestack.AzureStackManager manager) {
        manager
            .products()
            .listDetailsWithResponse(
                "azurestack",
                "testregistration",
                "Microsoft.OSTCExtensions.VMAccessForLinux.1.4.7.1",
                com.azure.core.util.Context.NONE);
    }
}
