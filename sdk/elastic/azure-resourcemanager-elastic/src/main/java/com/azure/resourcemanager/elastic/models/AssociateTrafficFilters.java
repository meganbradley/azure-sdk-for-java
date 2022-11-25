// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.util.Context;

/** Resource collection API of AssociateTrafficFilters. */
public interface AssociateTrafficFilters {
    /**
     * Associate traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void associate(String resourceGroupName, String monitorName);

    /**
     * Associate traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param rulesetId Ruleset Id of the filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void associate(String resourceGroupName, String monitorName, String rulesetId, Context context);
}
