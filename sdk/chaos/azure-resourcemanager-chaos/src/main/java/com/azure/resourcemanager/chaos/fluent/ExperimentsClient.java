// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentCancelOperationResultInner;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentExecutionDetailsInner;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentInner;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentStartOperationResultInner;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentStatusInner;
import com.azure.resourcemanager.chaos.models.ExperimentUpdate;

/** An instance of this class provides access to all the operations defined in ExperimentsClient. */
public interface ExperimentsClient {
    /**
     * Get a list of Experiment resources in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiment resources in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentInner> list();

    /**
     * Get a list of Experiment resources in a subscription.
     *
     * @param running Optional value that indicates whether to filter results based on if the Experiment is currently
     *     running. If null, then the results will not be filtered.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiment resources in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentInner> list(Boolean running, String continuationToken, Context context);

    /**
     * Get a list of Experiment resources in a resource group.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiment resources in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of Experiment resources in a resource group.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param running Optional value that indicates whether to filter results based on if the Experiment is currently
     *     running. If null, then the results will not be filtered.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiment resources in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentInner> listByResourceGroup(
        String resourceGroupName, Boolean running, String continuationToken, Context context);

    /**
     * Delete a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String experimentName, Context context);

    /**
     * Delete a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String experimentName);

    /**
     * Get a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Experiment resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentInner> getByResourceGroupWithResponse(
        String resourceGroupName, String experimentName, Context context);

    /**
     * Get a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Experiment resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner getByResourceGroup(String resourceGroupName, String experimentName);

    /**
     * Create or update a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param experiment Experiment resource to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Experiment resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentInner> createOrUpdateWithResponse(
        String resourceGroupName, String experimentName, ExperimentInner experiment, Context context);

    /**
     * Create or update a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param experiment Experiment resource to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Experiment resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner createOrUpdate(String resourceGroupName, String experimentName, ExperimentInner experiment);

    /**
     * The operation to update an experiment.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param experiment Parameters supplied to the Update experiment operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Experiment resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentInner> updateWithResponse(
        String resourceGroupName, String experimentName, ExperimentUpdate experiment, Context context);

    /**
     * The operation to update an experiment.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param experiment Parameters supplied to the Update experiment operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Experiment resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentInner update(String resourceGroupName, String experimentName, ExperimentUpdate experiment);

    /**
     * Cancel a running Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents the result of a cancel Experiment operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentCancelOperationResultInner> cancelWithResponse(
        String resourceGroupName, String experimentName, Context context);

    /**
     * Cancel a running Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents the result of a cancel Experiment operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentCancelOperationResultInner cancel(String resourceGroupName, String experimentName);

    /**
     * Start a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents the result of a start Experiment operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentStartOperationResultInner> startWithResponse(
        String resourceGroupName, String experimentName, Context context);

    /**
     * Start a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents the result of a start Experiment operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentStartOperationResultInner start(String resourceGroupName, String experimentName);

    /**
     * Get a list of statuses of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statuses of a Experiment resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentStatusInner> listAllStatuses(String resourceGroupName, String experimentName);

    /**
     * Get a list of statuses of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of statuses of a Experiment resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentStatusInner> listAllStatuses(
        String resourceGroupName, String experimentName, Context context);

    /**
     * Get a status of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param statusId GUID that represents a Experiment status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a status of a Experiment resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentStatusInner> getStatusWithResponse(
        String resourceGroupName, String experimentName, String statusId, Context context);

    /**
     * Get a status of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param statusId GUID that represents a Experiment status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a status of a Experiment resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentStatusInner getStatus(String resourceGroupName, String experimentName, String statusId);

    /**
     * Get a list of execution details of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of execution details of a Experiment resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentExecutionDetailsInner> listExecutionDetails(
        String resourceGroupName, String experimentName);

    /**
     * Get a list of execution details of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of execution details of a Experiment resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExperimentExecutionDetailsInner> listExecutionDetails(
        String resourceGroupName, String experimentName, Context context);

    /**
     * Get an execution detail of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param executionDetailsId GUID that represents a Experiment execution detail.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an execution detail of a Experiment resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExperimentExecutionDetailsInner> getExecutionDetailsWithResponse(
        String resourceGroupName, String experimentName, String executionDetailsId, Context context);

    /**
     * Get an execution detail of a Experiment resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param experimentName String that represents a Experiment resource name.
     * @param executionDetailsId GUID that represents a Experiment execution detail.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an execution detail of a Experiment resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExperimentExecutionDetailsInner getExecutionDetails(
        String resourceGroupName, String experimentName, String executionDetailsId);
}
