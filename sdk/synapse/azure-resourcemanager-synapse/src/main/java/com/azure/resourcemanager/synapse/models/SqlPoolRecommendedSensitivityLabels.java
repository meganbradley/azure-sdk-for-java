// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlPoolRecommendedSensitivityLabels. */
public interface SqlPoolRecommendedSensitivityLabels {
    /**
     * Update recommended sensitivity labels states of a given SQL Pool using an operations batch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters A list of recommended sensitivity label update operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        RecommendedSensitivityLabelUpdateList parameters);

    /**
     * Update recommended sensitivity labels states of a given SQL Pool using an operations batch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters A list of recommended sensitivity label update operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        RecommendedSensitivityLabelUpdateList parameters,
        Context context);
}
