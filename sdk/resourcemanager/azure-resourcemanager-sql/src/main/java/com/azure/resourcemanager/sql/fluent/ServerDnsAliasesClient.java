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
import com.azure.resourcemanager.sql.fluent.models.ServerDnsAliasInner;
import com.azure.resourcemanager.sql.models.ServerDnsAliasAcquisition;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServerDnsAliasesClient.
 */
public interface ServerDnsAliasesClient {
    /**
     * Gets a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ServerDnsAliasInner>> getWithResponseAsync(String resourceGroupName, String serverName,
        String dnsAliasName);

    /**
     * Gets a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerDnsAliasInner> getAsync(String resourceGroupName, String serverName, String dnsAliasName);

    /**
     * Gets a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerDnsAliasInner> getWithResponse(String resourceGroupName, String serverName, String dnsAliasName,
        Context context);

    /**
     * Gets a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerDnsAliasInner get(String resourceGroupName, String serverName, String dnsAliasName);

    /**
     * Creates a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName,
        String dnsAliasName);

    /**
     * Creates a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ServerDnsAliasInner>, ServerDnsAliasInner> beginCreateOrUpdateAsync(String resourceGroupName,
        String serverName, String dnsAliasName);

    /**
     * Creates a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerDnsAliasInner>, ServerDnsAliasInner> beginCreateOrUpdate(String resourceGroupName,
        String serverName, String dnsAliasName);

    /**
     * Creates a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerDnsAliasInner>, ServerDnsAliasInner> beginCreateOrUpdate(String resourceGroupName,
        String serverName, String dnsAliasName, Context context);

    /**
     * Creates a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerDnsAliasInner> createOrUpdateAsync(String resourceGroupName, String serverName, String dnsAliasName);

    /**
     * Creates a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerDnsAliasInner createOrUpdate(String resourceGroupName, String serverName, String dnsAliasName);

    /**
     * Creates a server DNS alias.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerDnsAliasInner createOrUpdate(String resourceGroupName, String serverName, String dnsAliasName,
        Context context);

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName,
        String dnsAliasName);

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serverName,
        String dnsAliasName);

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, String dnsAliasName);

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, String dnsAliasName,
        Context context);

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName, String dnsAliasName);

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String dnsAliasName);

    /**
     * Deletes the server DNS alias with the given name.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String dnsAliasName, Context context);

    /**
     * Gets a list of server DNS aliases for a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server DNS aliases for a server as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServerDnsAliasInner> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Gets a list of server DNS aliases for a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server DNS aliases for a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerDnsAliasInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets a list of server DNS aliases for a server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server DNS aliases for a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerDnsAliasInner> listByServer(String resourceGroupName, String serverName, Context context);

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param parameters A server dns alias acquisition request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> acquireWithResponseAsync(String resourceGroupName, String serverName,
        String dnsAliasName, ServerDnsAliasAcquisition parameters);

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param parameters A server dns alias acquisition request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ServerDnsAliasInner>, ServerDnsAliasInner> beginAcquireAsync(String resourceGroupName,
        String serverName, String dnsAliasName, ServerDnsAliasAcquisition parameters);

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param parameters A server dns alias acquisition request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerDnsAliasInner>, ServerDnsAliasInner> beginAcquire(String resourceGroupName,
        String serverName, String dnsAliasName, ServerDnsAliasAcquisition parameters);

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param parameters A server dns alias acquisition request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerDnsAliasInner>, ServerDnsAliasInner> beginAcquire(String resourceGroupName,
        String serverName, String dnsAliasName, ServerDnsAliasAcquisition parameters, Context context);

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param parameters A server dns alias acquisition request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerDnsAliasInner> acquireAsync(String resourceGroupName, String serverName, String dnsAliasName,
        ServerDnsAliasAcquisition parameters);

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param parameters A server dns alias acquisition request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerDnsAliasInner acquire(String resourceGroupName, String serverName, String dnsAliasName,
        ServerDnsAliasAcquisition parameters);

    /**
     * Acquires server DNS alias from another server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server that the alias is pointing to.
     * @param dnsAliasName The name of the server dns alias.
     * @param parameters A server dns alias acquisition request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server DNS alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerDnsAliasInner acquire(String resourceGroupName, String serverName, String dnsAliasName,
        ServerDnsAliasAcquisition parameters, Context context);
}
