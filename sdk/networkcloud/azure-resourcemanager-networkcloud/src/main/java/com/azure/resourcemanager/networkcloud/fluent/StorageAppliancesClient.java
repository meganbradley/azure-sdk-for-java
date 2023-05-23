// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.networkcloud.fluent.models.StorageApplianceInner;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceEnableRemoteVendorManagementParameters;
import com.azure.resourcemanager.networkcloud.models.StorageAppliancePatchParameters;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceRunReadCommandsParameters;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceValidateHardwareParameters;

/** An instance of this class provides access to all the operations defined in StorageAppliancesClient. */
public interface StorageAppliancesClient {
    /**
     * List storage appliances in the subscription.
     *
     * <p>Get a list of storage appliances in the provided subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of storage appliances in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageApplianceInner> list();

    /**
     * List storage appliances in the subscription.
     *
     * <p>Get a list of storage appliances in the provided subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of storage appliances in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageApplianceInner> list(Context context);

    /**
     * List storage appliances in the resource group.
     *
     * <p>Get a list of storage appliances in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of storage appliances in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageApplianceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List storage appliances in the resource group.
     *
     * <p>Get a list of storage appliances in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of storage appliances in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageApplianceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve the storage appliance.
     *
     * <p>Get properties of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided storage appliance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StorageApplianceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String storageApplianceName, Context context);

    /**
     * Retrieve the storage appliance.
     *
     * <p>Get properties of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided storage appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageApplianceInner getByResourceGroup(String resourceGroupName, String storageApplianceName);

    /**
     * Create or update the storage appliance.
     *
     * <p>Create a new storage appliance or update the properties of the existing one. All customer initiated requests
     * will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of storageAppliance represents on-premises Network Cloud storage
     *     appliance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageApplianceInner>, StorageApplianceInner> beginCreateOrUpdate(
        String resourceGroupName, String storageApplianceName, StorageApplianceInner storageApplianceParameters);

    /**
     * Create or update the storage appliance.
     *
     * <p>Create a new storage appliance or update the properties of the existing one. All customer initiated requests
     * will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of storageAppliance represents on-premises Network Cloud storage
     *     appliance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageApplianceInner>, StorageApplianceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceInner storageApplianceParameters,
        Context context);

    /**
     * Create or update the storage appliance.
     *
     * <p>Create a new storage appliance or update the properties of the existing one. All customer initiated requests
     * will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storageAppliance represents on-premises Network Cloud storage appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageApplianceInner createOrUpdate(
        String resourceGroupName, String storageApplianceName, StorageApplianceInner storageApplianceParameters);

    /**
     * Create or update the storage appliance.
     *
     * <p>Create a new storage appliance or update the properties of the existing one. All customer initiated requests
     * will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storageAppliance represents on-premises Network Cloud storage appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageApplianceInner createOrUpdate(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceInner storageApplianceParameters,
        Context context);

    /**
     * Delete the storage appliance.
     *
     * <p>Delete the provided storage appliance. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String storageApplianceName);

    /**
     * Delete the storage appliance.
     *
     * <p>Delete the provided storage appliance. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String storageApplianceName, Context context);

    /**
     * Delete the storage appliance.
     *
     * <p>Delete the provided storage appliance. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageApplianceName);

    /**
     * Delete the storage appliance.
     *
     * <p>Delete the provided storage appliance. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageApplianceName, Context context);

    /**
     * Patch the storage appliance.
     *
     * <p>Patch properties of the provided bare metal machine, or update tags associated with the bare metal machine.
     * Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of storageAppliance represents on-premises Network Cloud storage
     *     appliance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageApplianceInner>, StorageApplianceInner> beginUpdate(
        String resourceGroupName, String storageApplianceName);

    /**
     * Patch the storage appliance.
     *
     * <p>Patch properties of the provided bare metal machine, or update tags associated with the bare metal machine.
     * Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceUpdateParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of storageAppliance represents on-premises Network Cloud storage
     *     appliance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageApplianceInner>, StorageApplianceInner> beginUpdate(
        String resourceGroupName,
        String storageApplianceName,
        StorageAppliancePatchParameters storageApplianceUpdateParameters,
        Context context);

    /**
     * Patch the storage appliance.
     *
     * <p>Patch properties of the provided bare metal machine, or update tags associated with the bare metal machine.
     * Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storageAppliance represents on-premises Network Cloud storage appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageApplianceInner update(String resourceGroupName, String storageApplianceName);

    /**
     * Patch the storage appliance.
     *
     * <p>Patch properties of the provided bare metal machine, or update tags associated with the bare metal machine.
     * Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceUpdateParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storageAppliance represents on-premises Network Cloud storage appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageApplianceInner update(
        String resourceGroupName,
        String storageApplianceName,
        StorageAppliancePatchParameters storageApplianceUpdateParameters,
        Context context);

    /**
     * Turn off remote vendor management for a storage appliance, if supported.
     *
     * <p>Disable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableRemoteVendorManagement(
        String resourceGroupName, String storageApplianceName);

    /**
     * Turn off remote vendor management for a storage appliance, if supported.
     *
     * <p>Disable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableRemoteVendorManagement(
        String resourceGroupName, String storageApplianceName, Context context);

    /**
     * Turn off remote vendor management for a storage appliance, if supported.
     *
     * <p>Disable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableRemoteVendorManagement(String resourceGroupName, String storageApplianceName);

    /**
     * Turn off remote vendor management for a storage appliance, if supported.
     *
     * <p>Disable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableRemoteVendorManagement(String resourceGroupName, String storageApplianceName, Context context);

    /**
     * Turn on remote vendor management for a storage appliance, if supported.
     *
     * <p>Enable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableRemoteVendorManagement(
        String resourceGroupName, String storageApplianceName);

    /**
     * Turn on remote vendor management for a storage appliance, if supported.
     *
     * <p>Enable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceEnableRemoteVendorManagementParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableRemoteVendorManagement(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceEnableRemoteVendorManagementParameters storageApplianceEnableRemoteVendorManagementParameters,
        Context context);

    /**
     * Turn on remote vendor management for a storage appliance, if supported.
     *
     * <p>Enable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableRemoteVendorManagement(String resourceGroupName, String storageApplianceName);

    /**
     * Turn on remote vendor management for a storage appliance, if supported.
     *
     * <p>Enable remote vendor management of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceEnableRemoteVendorManagementParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableRemoteVendorManagement(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceEnableRemoteVendorManagementParameters storageApplianceEnableRemoteVendorManagementParameters,
        Context context);

    /**
     * Retrieve output from read-only commands exercised against a storage appliance.
     *
     * <p>Run and retrieve output from read only commands on the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceRunReadCommandsParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRunReadCommands(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceRunReadCommandsParameters storageApplianceRunReadCommandsParameters);

    /**
     * Retrieve output from read-only commands exercised against a storage appliance.
     *
     * <p>Run and retrieve output from read only commands on the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceRunReadCommandsParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRunReadCommands(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceRunReadCommandsParameters storageApplianceRunReadCommandsParameters,
        Context context);

    /**
     * Retrieve output from read-only commands exercised against a storage appliance.
     *
     * <p>Run and retrieve output from read only commands on the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceRunReadCommandsParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void runReadCommands(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceRunReadCommandsParameters storageApplianceRunReadCommandsParameters);

    /**
     * Retrieve output from read-only commands exercised against a storage appliance.
     *
     * <p>Run and retrieve output from read only commands on the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceRunReadCommandsParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void runReadCommands(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceRunReadCommandsParameters storageApplianceRunReadCommandsParameters,
        Context context);

    /**
     * Trigger hardware validation of the storage appliance.
     *
     * <p>Validate the hardware of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceValidateHardwareParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginValidateHardware(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceValidateHardwareParameters storageApplianceValidateHardwareParameters);

    /**
     * Trigger hardware validation of the storage appliance.
     *
     * <p>Validate the hardware of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceValidateHardwareParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginValidateHardware(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceValidateHardwareParameters storageApplianceValidateHardwareParameters,
        Context context);

    /**
     * Trigger hardware validation of the storage appliance.
     *
     * <p>Validate the hardware of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceValidateHardwareParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateHardware(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceValidateHardwareParameters storageApplianceValidateHardwareParameters);

    /**
     * Trigger hardware validation of the storage appliance.
     *
     * <p>Validate the hardware of the provided storage appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageApplianceName The name of the storage appliance.
     * @param storageApplianceValidateHardwareParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateHardware(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceValidateHardwareParameters storageApplianceValidateHardwareParameters,
        Context context);
}
