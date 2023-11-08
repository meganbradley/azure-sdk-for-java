// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.LogAnalyticsQueryPackInner;

/** Resource collection API of QueryPacks. */
public interface QueryPacks {
    /**
     * Gets a list of all Log Analytics QueryPacks within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Log Analytics QueryPacks within a subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<LogAnalyticsQueryPack> list();

    /**
     * Gets a list of all Log Analytics QueryPacks within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Log Analytics QueryPacks within a subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<LogAnalyticsQueryPack> list(Context context);

    /**
     * Gets a list of Log Analytics QueryPacks within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Log Analytics QueryPacks within a resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<LogAnalyticsQueryPack> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Log Analytics QueryPacks within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Log Analytics QueryPacks within a resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<LogAnalyticsQueryPack> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Creates a Log Analytics QueryPack. Note: You cannot specify a different value for InstrumentationKey nor AppId in
     * the Put operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param logAnalyticsQueryPackPayload Properties that need to be specified to create or update a Log Analytics
     *     QueryPack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Analytics QueryPack definition along with {@link Response}.
     */
    Response<LogAnalyticsQueryPack> createOrUpdateWithoutNameWithResponse(
        String resourceGroupName, LogAnalyticsQueryPackInner logAnalyticsQueryPackPayload, Context context);

    /**
     * Creates a Log Analytics QueryPack. Note: You cannot specify a different value for InstrumentationKey nor AppId in
     * the Put operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param logAnalyticsQueryPackPayload Properties that need to be specified to create or update a Log Analytics
     *     QueryPack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Analytics QueryPack definition.
     */
    LogAnalyticsQueryPack createOrUpdateWithoutName(
        String resourceGroupName, LogAnalyticsQueryPackInner logAnalyticsQueryPackPayload);

    /**
     * Deletes a Log Analytics QueryPack.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param queryPackName The name of the Log Analytics QueryPack resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String queryPackName, Context context);

    /**
     * Deletes a Log Analytics QueryPack.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param queryPackName The name of the Log Analytics QueryPack resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String queryPackName);

    /**
     * Returns a Log Analytics QueryPack.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param queryPackName The name of the Log Analytics QueryPack resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Analytics QueryPack definition along with {@link Response}.
     */
    Response<LogAnalyticsQueryPack> getByResourceGroupWithResponse(
        String resourceGroupName, String queryPackName, Context context);

    /**
     * Returns a Log Analytics QueryPack.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param queryPackName The name of the Log Analytics QueryPack resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Analytics QueryPack definition.
     */
    LogAnalyticsQueryPack getByResourceGroup(String resourceGroupName, String queryPackName);

    /**
     * Returns a Log Analytics QueryPack.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Analytics QueryPack definition along with {@link Response}.
     */
    LogAnalyticsQueryPack getById(String id);

    /**
     * Returns a Log Analytics QueryPack.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Analytics QueryPack definition along with {@link Response}.
     */
    Response<LogAnalyticsQueryPack> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Log Analytics QueryPack.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Log Analytics QueryPack.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LogAnalyticsQueryPack resource.
     *
     * @param name resource name.
     * @return the first stage of the new LogAnalyticsQueryPack definition.
     */
    LogAnalyticsQueryPack.DefinitionStages.Blank define(String name);
}
