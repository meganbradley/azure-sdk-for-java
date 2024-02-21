// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of CloudHsmClusterPrivateLinkResources.
 */
public interface CloudHsmClusterPrivateLinkResources {
    /**
     * Gets the private link resources supported for the Cloud Hsm Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudHsmClusterName The name of the Cloud HSM Cluster within the specified resource group. Cloud HSM
     * Cluster names must be between 3 and 24 characters in length.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources supported for the Cloud Hsm Cluster along with {@link Response}.
     */
    Response<PrivateLinkResourceListResult> listByCloudHsmClusterWithResponse(String resourceGroupName,
        String cloudHsmClusterName, Context context);

    /**
     * Gets the private link resources supported for the Cloud Hsm Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudHsmClusterName The name of the Cloud HSM Cluster within the specified resource group. Cloud HSM
     * Cluster names must be between 3 and 24 characters in length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources supported for the Cloud Hsm Cluster.
     */
    PrivateLinkResourceListResult listByCloudHsmCluster(String resourceGroupName, String cloudHsmClusterName);
}
