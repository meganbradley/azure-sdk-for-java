// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of AvailableWorkloadProfiles.
 */
public interface AvailableWorkloadProfiles {
    /**
     * Get available workload profiles by location.
     * 
     * Get all available workload profiles for a location.
     * 
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available workload profiles for a location as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailableWorkloadProfile> get(String location);

    /**
     * Get available workload profiles by location.
     * 
     * Get all available workload profiles for a location.
     * 
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available workload profiles for a location as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailableWorkloadProfile> get(String location, Context context);
}
