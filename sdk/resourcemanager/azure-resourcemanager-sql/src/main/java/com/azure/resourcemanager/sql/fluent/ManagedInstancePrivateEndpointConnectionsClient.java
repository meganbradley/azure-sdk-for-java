// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.fluent.models.ManagedInstancePrivateEndpointConnectionInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedInstancePrivateEndpointConnectionsClient.
 */
public interface ManagedInstancePrivateEndpointConnectionsClient {
    /**
     * Gets a private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ManagedInstancePrivateEndpointConnectionInner>> getWithResponseAsync(String resourceGroupName,
        String managedInstanceName, String privateEndpointConnectionName);

    /**
     * Gets a private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedInstancePrivateEndpointConnectionInner> getAsync(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName);

    /**
     * Gets a private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedInstancePrivateEndpointConnectionInner> getWithResponse(String resourceGroupName,
        String managedInstanceName, String privateEndpointConnectionName, Context context);

    /**
     * Gets a private endpoint connection.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstancePrivateEndpointConnectionInner get(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName);

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String managedInstanceName, String privateEndpointConnectionName,
        ManagedInstancePrivateEndpointConnectionInner parameters);

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ManagedInstancePrivateEndpointConnectionInner>, ManagedInstancePrivateEndpointConnectionInner>
        beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName,
            String privateEndpointConnectionName, ManagedInstancePrivateEndpointConnectionInner parameters);

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedInstancePrivateEndpointConnectionInner>, ManagedInstancePrivateEndpointConnectionInner>
        beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, String privateEndpointConnectionName,
            ManagedInstancePrivateEndpointConnectionInner parameters);

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedInstancePrivateEndpointConnectionInner>, ManagedInstancePrivateEndpointConnectionInner>
        beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, String privateEndpointConnectionName,
            ManagedInstancePrivateEndpointConnectionInner parameters, Context context);

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedInstancePrivateEndpointConnectionInner> createOrUpdateAsync(String resourceGroupName,
        String managedInstanceName, String privateEndpointConnectionName,
        ManagedInstancePrivateEndpointConnectionInner parameters);

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstancePrivateEndpointConnectionInner createOrUpdate(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName, ManagedInstancePrivateEndpointConnectionInner parameters);

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstancePrivateEndpointConnectionInner createOrUpdate(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName, ManagedInstancePrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String managedInstanceName,
        String privateEndpointConnectionName, Context context);

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String managedInstanceName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String managedInstanceName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String managedInstanceName, String privateEndpointConnectionName,
        Context context);

    /**
     * Gets all private endpoint connections on a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections on a server as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ManagedInstancePrivateEndpointConnectionInner> listByManagedInstanceAsync(String resourceGroupName,
        String managedInstanceName);

    /**
     * Gets all private endpoint connections on a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections on a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedInstancePrivateEndpointConnectionInner> listByManagedInstance(String resourceGroupName,
        String managedInstanceName);

    /**
     * Gets all private endpoint connections on a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections on a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedInstancePrivateEndpointConnectionInner> listByManagedInstance(String resourceGroupName,
        String managedInstanceName, Context context);
}
