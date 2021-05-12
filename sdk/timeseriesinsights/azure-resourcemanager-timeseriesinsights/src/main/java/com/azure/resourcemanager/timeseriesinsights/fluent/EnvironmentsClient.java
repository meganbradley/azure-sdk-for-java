// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentListResponseInner;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentResourceInner;
import com.azure.resourcemanager.timeseriesinsights.models.EnvironmentCreateOrUpdateParameters;
import com.azure.resourcemanager.timeseriesinsights.models.EnvironmentUpdateParameters;

/** An instance of this class provides access to all the operations defined in EnvironmentsClient. */
public interface EnvironmentsClient {
    /**
     * Create or update an environment in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName Name of the environment.
     * @param parameters Parameters for creating an environment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EnvironmentResourceInner>, EnvironmentResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String environmentName, EnvironmentCreateOrUpdateParameters parameters);

    /**
     * Create or update an environment in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName Name of the environment.
     * @param parameters Parameters for creating an environment resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EnvironmentResourceInner>, EnvironmentResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String environmentName,
        EnvironmentCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Create or update an environment in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName Name of the environment.
     * @param parameters Parameters for creating an environment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentResourceInner createOrUpdate(
        String resourceGroupName, String environmentName, EnvironmentCreateOrUpdateParameters parameters);

    /**
     * Create or update an environment in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName Name of the environment.
     * @param parameters Parameters for creating an environment resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentResourceInner createOrUpdate(
        String resourceGroupName,
        String environmentName,
        EnvironmentCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Gets the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the environment with the specified name in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentResourceInner getByResourceGroup(String resourceGroupName, String environmentName);

    /**
     * Gets the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param expand Setting $expand=status will include the status of the internal services of the environment in the
     *     Time Series Insights service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the environment with the specified name in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnvironmentResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String environmentName, String expand, Context context);

    /**
     * Updates the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param environmentUpdateParameters Request object that contains the updated information for the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EnvironmentResourceInner>, EnvironmentResourceInner> beginUpdate(
        String resourceGroupName, String environmentName, EnvironmentUpdateParameters environmentUpdateParameters);

    /**
     * Updates the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param environmentUpdateParameters Request object that contains the updated information for the environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<EnvironmentResourceInner>, EnvironmentResourceInner> beginUpdate(
        String resourceGroupName,
        String environmentName,
        EnvironmentUpdateParameters environmentUpdateParameters,
        Context context);

    /**
     * Updates the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param environmentUpdateParameters Request object that contains the updated information for the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentResourceInner update(
        String resourceGroupName, String environmentName, EnvironmentUpdateParameters environmentUpdateParameters);

    /**
     * Updates the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param environmentUpdateParameters Request object that contains the updated information for the environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment is a set of time-series data available for query, and is the top level Azure Time Series
     *     Insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentResourceInner update(
        String resourceGroupName,
        String environmentName,
        EnvironmentUpdateParameters environmentUpdateParameters,
        Context context);

    /**
     * Deletes the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String environmentName);

    /**
     * Deletes the environment with the specified name in the specified subscription and resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String environmentName, Context context);

    /**
     * Lists all the available environments associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Environments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentListResponseInner listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the available environments associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Environments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnvironmentListResponseInner> listByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Lists all the available environments within a subscription, irrespective of the resource groups.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Environments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentListResponseInner listBySubscription();

    /**
     * Lists all the available environments within a subscription, irrespective of the resource groups.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Environments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnvironmentListResponseInner> listBySubscriptionWithResponse(Context context);
}
