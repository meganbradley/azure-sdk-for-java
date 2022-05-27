// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateEndpointConnectionInner;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * List all the private endpoint connections associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified workspace as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String workspaceName);

    /**
     * List all the private endpoint connections associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified workspace as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Gets the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context);

    /**
     * Update the state of specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties);

    /**
     * Update the state of specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties,
        Context context);

    /**
     * Deletes the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context);
}
