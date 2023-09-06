// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Clusters. */
public interface Clusters {
    /**
     * Lists the HDInsight cluster pools under a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list cluster operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByClusterPoolName(String resourceGroupName, String clusterPoolName);

    /**
     * Lists the HDInsight cluster pools under a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list cluster operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByClusterPoolName(String resourceGroupName, String clusterPoolName, Context context);

    /**
     * Resize an existing Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param clusterResizeRequest Resize a cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster.
     */
    Cluster resize(
        String resourceGroupName, String clusterPoolName, String clusterName, ClusterResizeData clusterResizeRequest);

    /**
     * Resize an existing Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param clusterResizeRequest Resize a cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster.
     */
    Cluster resize(
        String resourceGroupName,
        String clusterPoolName,
        String clusterName,
        ClusterResizeData clusterResizeRequest,
        Context context);

    /**
     * Gets a HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HDInsight cluster along with {@link Response}.
     */
    Response<Cluster> getWithResponse(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context);

    /**
     * Gets a HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HDInsight cluster.
     */
    Cluster get(String resourceGroupName, String clusterPoolName, String clusterName);

    /**
     * Deletes a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterPoolName, String clusterName);

    /**
     * Deletes a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterPoolName, String clusterName, Context context);

    /**
     * Lists the config dump of all services running in cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster instance service configs api response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceConfigResult> listServiceConfigs(
        String resourceGroupName, String clusterPoolName, String clusterName);

    /**
     * Lists the config dump of all services running in cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster instance service configs api response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceConfigResult> listServiceConfigs(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context);

    /**
     * Lists the lists of instance views.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the instance view of a HDInsight Cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterInstanceViewResult> listInstanceViews(
        String resourceGroupName, String clusterPoolName, String clusterName);

    /**
     * Lists the lists of instance views.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the instance view of a HDInsight Cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterInstanceViewResult> listInstanceViews(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context);

    /**
     * Gets the status of a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a cluster instance along with {@link Response}.
     */
    Response<ClusterInstanceViewResult> getInstanceViewWithResponse(
        String resourceGroupName, String clusterPoolName, String clusterName, Context context);

    /**
     * Gets the status of a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a cluster instance.
     */
    ClusterInstanceViewResult getInstanceView(String resourceGroupName, String clusterPoolName, String clusterName);

    /**
     * Gets a HDInsight cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HDInsight cluster along with {@link Response}.
     */
    Cluster getById(String id);

    /**
     * Gets a HDInsight cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HDInsight cluster along with {@link Response}.
     */
    Response<Cluster> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Cluster resource.
     *
     * @param name resource name.
     * @return the first stage of the new Cluster definition.
     */
    Cluster.DefinitionStages.Blank define(String name);
}
