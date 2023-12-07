// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Components.
 */
public interface Components {
    /**
     * Gets information about the specified application instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param componentName The name of the component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application instance resource along with {@link Response}.
     */
    Response<Component> getWithResponse(String resourceGroupName, String networkFunctionName, String componentName,
        Context context);

    /**
     * Gets information about the specified application instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param componentName The name of the component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application instance resource.
     */
    Component get(String resourceGroupName, String networkFunctionName, String componentName);

    /**
     * Lists all the component resources in a network function.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list component API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Component> listByNetworkFunction(String resourceGroupName, String networkFunctionName);

    /**
     * Lists all the component resources in a network function.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list component API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Component> listByNetworkFunction(String resourceGroupName, String networkFunctionName,
        Context context);
}
