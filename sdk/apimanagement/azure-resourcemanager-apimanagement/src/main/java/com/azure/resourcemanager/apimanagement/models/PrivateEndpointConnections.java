// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateEndpointConnections. */
public interface PrivateEndpointConnections {
    /**
     * Lists all private endpoint connections of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists all private endpoint connections of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> listByService(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Gets the details of the Private Endpoint Connection specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param privateEndpointConnectionName Name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Private Endpoint Connection specified by its identifier along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getByNameWithResponse(
        String resourceGroupName, String serviceName, String privateEndpointConnectionName, Context context);

    /**
     * Gets the details of the Private Endpoint Connection specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param privateEndpointConnectionName Name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Private Endpoint Connection specified by its identifier.
     */
    PrivateEndpointConnection getByName(
        String resourceGroupName, String serviceName, String privateEndpointConnectionName);

    /**
     * Deletes the specified Private Endpoint Connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param privateEndpointConnectionName Name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String privateEndpointConnectionName);

    /**
     * Deletes the specified Private Endpoint Connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param privateEndpointConnectionName Name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String privateEndpointConnectionName, Context context);

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources along with {@link Response}.
     */
    Response<PrivateLinkResourceListResult> listPrivateLinkResourcesWithResponse(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources.
     */
    PrivateLinkResourceListResult listPrivateLinkResources(String resourceGroupName, String serviceName);

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param privateLinkSubResourceName Name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources along with {@link Response}.
     */
    Response<PrivateLinkResource> getPrivateLinkResourceWithResponse(
        String resourceGroupName, String serviceName, String privateLinkSubResourceName, Context context);

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param privateLinkSubResourceName Name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources.
     */
    PrivateLinkResource getPrivateLinkResource(
        String resourceGroupName, String serviceName, String privateLinkSubResourceName);

    /**
     * Gets the details of the Private Endpoint Connection specified by its identifier.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Private Endpoint Connection specified by its identifier along with {@link Response}.
     */
    PrivateEndpointConnection getById(String id);

    /**
     * Gets the details of the Private Endpoint Connection specified by its identifier.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Private Endpoint Connection specified by its identifier along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified Private Endpoint Connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified Private Endpoint Connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PrivateEndpointConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new PrivateEndpointConnection definition.
     */
    PrivateEndpointConnection.DefinitionStages.Blank define(String name);
}
