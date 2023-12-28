// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateEndpointConnectionWithSystemDataInner;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * List private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PrivateEndpointConnectionWithSystemDataInner> listByWorkspaceAsync(
        String resourceGroupName, String workspaceName);

    /**
     * List private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionWithSystemDataInner> listByWorkspace(
        String resourceGroupName, String workspaceName);

    /**
     * List private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionWithSystemDataInner> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionWithSystemDataInner>> getByWorkspaceWithResponseAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionWithSystemDataInner> getByWorkspaceAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> getByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner getByWorkspace(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteByWorkspaceWithResponseAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteByWorkspaceAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteByWorkspace(String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionWithSystemDataInner>> updateByWorkspaceWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionWithSystemDataInner> updateByWorkspaceAsync(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> updateByWorkspaceWithResponse(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection,
        Context context);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner updateByWorkspace(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);

    /**
     * List private endpoint connections associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param pageSize Number of items per page.
     * @param isDescending Indicates whether the collection is descending.
     * @param initialSkip Initial number of items to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PrivateEndpointConnectionWithSystemDataInner> listByHostPoolAsync(
        String resourceGroupName, String hostPoolName, Integer pageSize, Boolean isDescending, Integer initialSkip);

    /**
     * List private endpoint connections associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PrivateEndpointConnectionWithSystemDataInner> listByHostPoolAsync(
        String resourceGroupName, String hostPoolName);

    /**
     * List private endpoint connections associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionWithSystemDataInner> listByHostPool(
        String resourceGroupName, String hostPoolName);

    /**
     * List private endpoint connections associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param pageSize Number of items per page.
     * @param isDescending Indicates whether the collection is descending.
     * @param initialSkip Initial number of items to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionWithSystemDataInner> listByHostPool(
        String resourceGroupName,
        String hostPoolName,
        Integer pageSize,
        Boolean isDescending,
        Integer initialSkip,
        Context context);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionWithSystemDataInner>> getByHostPoolWithResponseAsync(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionWithSystemDataInner> getByHostPoolAsync(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> getByHostPoolWithResponse(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName, Context context);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner getByHostPool(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteByHostPoolWithResponseAsync(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteByHostPoolAsync(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteByHostPoolWithResponse(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName, Context context);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteByHostPool(String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionWithSystemDataInner>> updateByHostPoolWithResponseAsync(
        String resourceGroupName,
        String hostPoolName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionWithSystemDataInner> updateByHostPoolAsync(
        String resourceGroupName,
        String hostPoolName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> updateByHostPoolWithResponse(
        String resourceGroupName,
        String hostPoolName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection,
        Context context);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner updateByHostPool(
        String resourceGroupName,
        String hostPoolName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);
}
