// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.connectedvmware.fluent.models.VCenterInner;
import com.azure.resourcemanager.connectedvmware.models.ResourcePatch;

/** An instance of this class provides access to all the operations defined in VCentersClient. */
public interface VCentersClient {
    /**
     * Implements vCenter PUT method.
     *
     * <p>Create Or Update vCenter.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines the vCenter.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VCenterInner>, VCenterInner> beginCreate(
        String resourceGroupName, String vcenterName, VCenterInner body);

    /**
     * Implements vCenter PUT method.
     *
     * <p>Create Or Update vCenter.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines the vCenter.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VCenterInner>, VCenterInner> beginCreate(
        String resourceGroupName, String vcenterName, VCenterInner body, Context context);

    /**
     * Implements vCenter PUT method.
     *
     * <p>Create Or Update vCenter.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the vCenter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VCenterInner create(String resourceGroupName, String vcenterName, VCenterInner body);

    /**
     * Implements vCenter PUT method.
     *
     * <p>Create Or Update vCenter.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the vCenter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VCenterInner create(String resourceGroupName, String vcenterName);

    /**
     * Implements vCenter PUT method.
     *
     * <p>Create Or Update vCenter.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the vCenter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VCenterInner create(String resourceGroupName, String vcenterName, VCenterInner body, Context context);

    /**
     * Gets a vCenter.
     *
     * <p>Implements vCenter GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the vCenter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VCenterInner getByResourceGroup(String resourceGroupName, String vcenterName);

    /**
     * Gets a vCenter.
     *
     * <p>Implements vCenter GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the vCenter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VCenterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String vcenterName, Context context);

    /**
     * Updates a vCenter.
     *
     * <p>API to update certain properties of the vCenter resource.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the vCenter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VCenterInner update(String resourceGroupName, String vcenterName);

    /**
     * Updates a vCenter.
     *
     * <p>API to update certain properties of the vCenter resource.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param body Resource properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the vCenter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VCenterInner> updateWithResponse(
        String resourceGroupName, String vcenterName, ResourcePatch body, Context context);

    /**
     * Deletes an vCenter.
     *
     * <p>Implements vCenter DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param force Whether force delete was specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vcenterName, Boolean force);

    /**
     * Deletes an vCenter.
     *
     * <p>Implements vCenter DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vcenterName, Boolean force, Context context);

    /**
     * Deletes an vCenter.
     *
     * <p>Implements vCenter DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param force Whether force delete was specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vcenterName, Boolean force);

    /**
     * Deletes an vCenter.
     *
     * <p>Implements vCenter DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vcenterName);

    /**
     * Deletes an vCenter.
     *
     * <p>Implements vCenter DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vcenterName, Boolean force, Context context);

    /**
     * Implements GET vCenters in a subscription.
     *
     * <p>List of vCenters in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VCenters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VCenterInner> list();

    /**
     * Implements GET vCenters in a subscription.
     *
     * <p>List of vCenters in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VCenters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VCenterInner> list(Context context);

    /**
     * Implements GET vCenters in a resource group.
     *
     * <p>List of vCenters in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VCenters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VCenterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Implements GET vCenters in a resource group.
     *
     * <p>List of vCenters in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VCenters as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VCenterInner> listByResourceGroup(String resourceGroupName, Context context);
}
