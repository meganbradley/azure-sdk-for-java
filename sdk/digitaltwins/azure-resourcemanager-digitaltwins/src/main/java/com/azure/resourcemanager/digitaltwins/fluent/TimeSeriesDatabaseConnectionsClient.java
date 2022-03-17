// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.digitaltwins.fluent.models.TimeSeriesDatabaseConnectionInner;

/** An instance of this class provides access to all the operations defined in TimeSeriesDatabaseConnectionsClient. */
public interface TimeSeriesDatabaseConnectionsClient {
    /**
     * Get all existing time series database connections for this DigitalTwins instance.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all existing time series database connections for this DigitalTwins instance as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TimeSeriesDatabaseConnectionInner> list(String resourceGroupName, String resourceName);

    /**
     * Get all existing time series database connections for this DigitalTwins instance.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all existing time series database connections for this DigitalTwins instance as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TimeSeriesDatabaseConnectionInner> list(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get the description of an existing time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of an existing time series database connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TimeSeriesDatabaseConnectionInner get(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName);

    /**
     * Get the description of an existing time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of an existing time series database connection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TimeSeriesDatabaseConnectionInner> getWithResponse(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName, Context context);

    /**
     * Create or update a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param timeSeriesDatabaseConnectionDescription The time series database connection description.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TimeSeriesDatabaseConnectionInner>, TimeSeriesDatabaseConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String resourceName,
        String timeSeriesDatabaseConnectionName,
        TimeSeriesDatabaseConnectionInner timeSeriesDatabaseConnectionDescription);

    /**
     * Create or update a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param timeSeriesDatabaseConnectionDescription The time series database connection description.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TimeSeriesDatabaseConnectionInner>, TimeSeriesDatabaseConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String resourceName,
        String timeSeriesDatabaseConnectionName,
        TimeSeriesDatabaseConnectionInner timeSeriesDatabaseConnectionDescription,
        Context context);

    /**
     * Create or update a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param timeSeriesDatabaseConnectionDescription The time series database connection description.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TimeSeriesDatabaseConnectionInner createOrUpdate(
        String resourceGroupName,
        String resourceName,
        String timeSeriesDatabaseConnectionName,
        TimeSeriesDatabaseConnectionInner timeSeriesDatabaseConnectionDescription);

    /**
     * Create or update a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param timeSeriesDatabaseConnectionDescription The time series database connection description.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TimeSeriesDatabaseConnectionInner createOrUpdate(
        String resourceGroupName,
        String resourceName,
        String timeSeriesDatabaseConnectionName,
        TimeSeriesDatabaseConnectionInner timeSeriesDatabaseConnectionDescription,
        Context context);

    /**
     * Delete a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TimeSeriesDatabaseConnectionInner>, TimeSeriesDatabaseConnectionInner> beginDelete(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName);

    /**
     * Delete a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TimeSeriesDatabaseConnectionInner>, TimeSeriesDatabaseConnectionInner> beginDelete(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName, Context context);

    /**
     * Delete a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TimeSeriesDatabaseConnectionInner delete(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName);

    /**
     * Delete a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TimeSeriesDatabaseConnectionInner delete(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName, Context context);
}
