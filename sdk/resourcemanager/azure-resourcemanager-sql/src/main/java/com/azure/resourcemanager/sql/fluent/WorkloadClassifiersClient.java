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
import com.azure.resourcemanager.sql.fluent.models.WorkloadClassifierInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in WorkloadClassifiersClient.
 */
public interface WorkloadClassifiersClient {
    /**
     * Gets a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<WorkloadClassifierInner>> getWithResponseAsync(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName, String workloadClassifierName);

    /**
     * Gets a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WorkloadClassifierInner> getAsync(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName);

    /**
     * Gets a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkloadClassifierInner> getWithResponse(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName, Context context);

    /**
     * Gets a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkloadClassifierInner get(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName);

    /**
     * Creates or updates a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters The properties of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName, String workloadClassifierName,
        WorkloadClassifierInner parameters);

    /**
     * Creates or updates a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters The properties of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<WorkloadClassifierInner>, WorkloadClassifierInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName, WorkloadClassifierInner parameters);

    /**
     * Creates or updates a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters The properties of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkloadClassifierInner>, WorkloadClassifierInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName, WorkloadClassifierInner parameters);

    /**
     * Creates or updates a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters The properties of the workload classifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkloadClassifierInner>, WorkloadClassifierInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName, WorkloadClassifierInner parameters, Context context);

    /**
     * Creates or updates a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters The properties of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WorkloadClassifierInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName, WorkloadClassifierInner parameters);

    /**
     * Creates or updates a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters The properties of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkloadClassifierInner createOrUpdate(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName, WorkloadClassifierInner parameters);

    /**
     * Creates or updates a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters The properties of the workload classifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkloadClassifierInner createOrUpdate(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName, WorkloadClassifierInner parameters, Context context);

    /**
     * Deletes a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName, String workloadClassifierName);

    /**
     * Deletes a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName, String workloadClassifierName);

    /**
     * Deletes a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName);

    /**
     * Deletes a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName, Context context);

    /**
     * Deletes a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName);

    /**
     * Deletes a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName);

    /**
     * Deletes a workload classifier.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName, Context context);

    /**
     * Gets the list of workload classifiers for a workload group.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WorkloadClassifierInner> listByWorkloadGroupAsync(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName);

    /**
     * Gets the list of workload classifiers for a workload group.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkloadClassifierInner> listByWorkloadGroup(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName);

    /**
     * Gets the list of workload classifiers for a workload group.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkloadClassifierInner> listByWorkloadGroup(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName, Context context);
}
