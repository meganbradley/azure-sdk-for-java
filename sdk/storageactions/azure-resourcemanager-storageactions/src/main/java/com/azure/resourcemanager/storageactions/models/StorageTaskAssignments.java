// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of StorageTaskAssignments.
 */
public interface StorageTaskAssignments {
    /**
     * Lists all the storage tasks available under the given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageTaskName The name of the storage task within the specified resource group. Storage task names must
     * be between 3 and 18 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Tasks operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<StorageTaskAssignment> list(String resourceGroupName, String storageTaskName);

    /**
     * Lists all the storage tasks available under the given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageTaskName The name of the storage task within the specified resource group. Storage task names must
     * be between 3 and 18 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment Ids to be included in the
     * list response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Tasks operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<StorageTaskAssignment> list(String resourceGroupName, String storageTaskName, String maxpagesize,
        Context context);
}
