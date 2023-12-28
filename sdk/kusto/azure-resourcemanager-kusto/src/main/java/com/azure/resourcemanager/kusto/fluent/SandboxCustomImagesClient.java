// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.SandboxCustomImageInner;
import com.azure.resourcemanager.kusto.models.SandboxCustomImagesCheckNameRequest;

/** An instance of this class provides access to all the operations defined in SandboxCustomImagesClient. */
public interface SandboxCustomImagesClient {
    /**
     * Returns the list of the existing sandbox custom images of the given Kusto cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto sandbox custom images operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SandboxCustomImageInner> listByCluster(String resourceGroupName, String clusterName);

    /**
     * Returns the list of the existing sandbox custom images of the given Kusto cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto sandbox custom images operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SandboxCustomImageInner> listByCluster(String resourceGroupName, String clusterName, Context context);

    /**
     * Returns a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto sandbox custom image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SandboxCustomImageInner> getWithResponse(
        String resourceGroupName, String clusterName, String sandboxCustomImageName, Context context);

    /**
     * Returns a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SandboxCustomImageInner get(String resourceGroupName, String clusterName, String sandboxCustomImageName);

    /**
     * Creates or updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SandboxCustomImageInner>, SandboxCustomImageInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters);

    /**
     * Creates or updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SandboxCustomImageInner>, SandboxCustomImageInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters,
        Context context);

    /**
     * Creates or updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SandboxCustomImageInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters);

    /**
     * Creates or updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SandboxCustomImageInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters,
        Context context);

    /**
     * Updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SandboxCustomImageInner>, SandboxCustomImageInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters);

    /**
     * Updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SandboxCustomImageInner>, SandboxCustomImageInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters,
        Context context);

    /**
     * Updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SandboxCustomImageInner update(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters);

    /**
     * Updates a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param parameters The sandbox custom image parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto sandbox custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SandboxCustomImageInner update(
        String resourceGroupName,
        String clusterName,
        String sandboxCustomImageName,
        SandboxCustomImageInner parameters,
        Context context);

    /**
     * Deletes a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String sandboxCustomImageName);

    /**
     * Deletes a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String sandboxCustomImageName, Context context);

    /**
     * Deletes a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String sandboxCustomImageName);

    /**
     * Deletes a sandbox custom image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param sandboxCustomImageName The name of the sandbox custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String sandboxCustomImageName, Context context);

    /**
     * Checks that the sandbox custom image resource name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameResultInner> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        SandboxCustomImagesCheckNameRequest resourceName,
        Context context);

    /**
     * Checks that the sandbox custom image resource name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameResultInner checkNameAvailability(
        String resourceGroupName, String clusterName, SandboxCustomImagesCheckNameRequest resourceName);
}
