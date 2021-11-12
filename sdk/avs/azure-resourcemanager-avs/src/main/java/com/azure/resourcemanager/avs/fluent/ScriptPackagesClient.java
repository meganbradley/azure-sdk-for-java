// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.ScriptPackageInner;

/** An instance of this class provides access to all the operations defined in ScriptPackagesClient. */
public interface ScriptPackagesClient {
    /**
     * List script packages available to run on the private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the available script packages.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScriptPackageInner> list(String resourceGroupName, String privateCloudName);

    /**
     * List script packages available to run on the private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the available script packages.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScriptPackageInner> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get a script package available to run on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a script package available to run on a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScriptPackageInner get(String resourceGroupName, String privateCloudName, String scriptPackageName);

    /**
     * Get a script package available to run on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a script package available to run on a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScriptPackageInner> getWithResponse(
        String resourceGroupName, String privateCloudName, String scriptPackageName, Context context);
}
