// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cosmos.fluent.models.GraphResourceGetResultsInner;
import com.azure.resourcemanager.cosmos.models.GraphResourceCreateUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in GraphResourcesClient.
 */
public interface GraphResourcesClient {
    /**
     * Lists the graphs under an existing Azure Cosmos DB database account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Graph resource and their properties as paginated response
     * with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<GraphResourceGetResultsInner> listGraphsAsync(String resourceGroupName, String accountName);

    /**
     * Lists the graphs under an existing Azure Cosmos DB database account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Graph resource and their properties as paginated response
     * with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GraphResourceGetResultsInner> listGraphs(String resourceGroupName, String accountName);

    /**
     * Lists the graphs under an existing Azure Cosmos DB database account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Graph resource and their properties as paginated response
     * with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GraphResourceGetResultsInner> listGraphs(String resourceGroupName, String accountName,
        Context context);

    /**
     * Gets the Graph resource under an existing Azure Cosmos DB database account with the provided name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Graph resource under an existing Azure Cosmos DB database account with the provided name along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<GraphResourceGetResultsInner>> getGraphWithResponseAsync(String resourceGroupName, String accountName,
        String graphName);

    /**
     * Gets the Graph resource under an existing Azure Cosmos DB database account with the provided name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Graph resource under an existing Azure Cosmos DB database account with the provided name on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GraphResourceGetResultsInner> getGraphAsync(String resourceGroupName, String accountName, String graphName);

    /**
     * Gets the Graph resource under an existing Azure Cosmos DB database account with the provided name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Graph resource under an existing Azure Cosmos DB database account with the provided name along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GraphResourceGetResultsInner> getGraphWithResponse(String resourceGroupName, String accountName,
        String graphName, Context context);

    /**
     * Gets the Graph resource under an existing Azure Cosmos DB database account with the provided name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Graph resource under an existing Azure Cosmos DB database account with the provided name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GraphResourceGetResultsInner getGraph(String resourceGroupName, String accountName, String graphName);

    /**
     * Create or update an Azure Cosmos DB Graph.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param createUpdateGraphParameters The parameters to provide for the current graph.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB Graph resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createUpdateGraphWithResponseAsync(String resourceGroupName, String accountName,
        String graphName, GraphResourceCreateUpdateParameters createUpdateGraphParameters);

    /**
     * Create or update an Azure Cosmos DB Graph.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param createUpdateGraphParameters The parameters to provide for the current graph.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an Azure Cosmos DB Graph resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<GraphResourceGetResultsInner>, GraphResourceGetResultsInner> beginCreateUpdateGraphAsync(
        String resourceGroupName, String accountName, String graphName,
        GraphResourceCreateUpdateParameters createUpdateGraphParameters);

    /**
     * Create or update an Azure Cosmos DB Graph.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param createUpdateGraphParameters The parameters to provide for the current graph.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB Graph resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GraphResourceGetResultsInner>, GraphResourceGetResultsInner> beginCreateUpdateGraph(
        String resourceGroupName, String accountName, String graphName,
        GraphResourceCreateUpdateParameters createUpdateGraphParameters);

    /**
     * Create or update an Azure Cosmos DB Graph.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param createUpdateGraphParameters The parameters to provide for the current graph.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Azure Cosmos DB Graph resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GraphResourceGetResultsInner>, GraphResourceGetResultsInner> beginCreateUpdateGraph(
        String resourceGroupName, String accountName, String graphName,
        GraphResourceCreateUpdateParameters createUpdateGraphParameters, Context context);

    /**
     * Create or update an Azure Cosmos DB Graph.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param createUpdateGraphParameters The parameters to provide for the current graph.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB Graph resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GraphResourceGetResultsInner> createUpdateGraphAsync(String resourceGroupName, String accountName,
        String graphName, GraphResourceCreateUpdateParameters createUpdateGraphParameters);

    /**
     * Create or update an Azure Cosmos DB Graph.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param createUpdateGraphParameters The parameters to provide for the current graph.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB Graph resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GraphResourceGetResultsInner createUpdateGraph(String resourceGroupName, String accountName, String graphName,
        GraphResourceCreateUpdateParameters createUpdateGraphParameters);

    /**
     * Create or update an Azure Cosmos DB Graph.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param createUpdateGraphParameters The parameters to provide for the current graph.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB Graph resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GraphResourceGetResultsInner createUpdateGraph(String resourceGroupName, String accountName, String graphName,
        GraphResourceCreateUpdateParameters createUpdateGraphParameters, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Graph Resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteGraphResourceWithResponseAsync(String resourceGroupName, String accountName,
        String graphName);

    /**
     * Deletes an existing Azure Cosmos DB Graph Resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteGraphResourceAsync(String resourceGroupName, String accountName,
        String graphName);

    /**
     * Deletes an existing Azure Cosmos DB Graph Resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteGraphResource(String resourceGroupName, String accountName,
        String graphName);

    /**
     * Deletes an existing Azure Cosmos DB Graph Resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteGraphResource(String resourceGroupName, String accountName,
        String graphName, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Graph Resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteGraphResourceAsync(String resourceGroupName, String accountName, String graphName);

    /**
     * Deletes an existing Azure Cosmos DB Graph Resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteGraphResource(String resourceGroupName, String accountName, String graphName);

    /**
     * Deletes an existing Azure Cosmos DB Graph Resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param graphName Cosmos DB graph resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteGraphResource(String resourceGroupName, String accountName, String graphName, Context context);
}
