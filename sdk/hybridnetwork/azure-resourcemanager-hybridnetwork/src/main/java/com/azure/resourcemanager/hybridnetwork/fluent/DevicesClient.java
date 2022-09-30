// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridnetwork.fluent.models.DeviceInner;
import com.azure.resourcemanager.hybridnetwork.fluent.models.DeviceRegistrationKeyInner;
import com.azure.resourcemanager.hybridnetwork.models.TagsObject;

/** An instance of this class provides access to all the operations defined in DevicesClient. */
public interface DevicesClient {
    /**
     * Deletes the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deviceName);

    /**
     * Deletes the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deviceName, Context context);

    /**
     * Deletes the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deviceName);

    /**
     * Deletes the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deviceName, Context context);

    /**
     * Gets information about the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified device along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeviceInner> getByResourceGroupWithResponse(String resourceGroupName, String deviceName, Context context);

    /**
     * Gets information about the specified device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeviceInner getByResourceGroup(String resourceGroupName, String deviceName);

    /**
     * Creates or updates a device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName Resource name for the device resource.
     * @param parameters Parameters supplied to the create or update device operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of device resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeviceInner>, DeviceInner> beginCreateOrUpdate(
        String resourceGroupName, String deviceName, DeviceInner parameters);

    /**
     * Creates or updates a device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName Resource name for the device resource.
     * @param parameters Parameters supplied to the create or update device operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of device resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeviceInner>, DeviceInner> beginCreateOrUpdate(
        String resourceGroupName, String deviceName, DeviceInner parameters, Context context);

    /**
     * Creates or updates a device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName Resource name for the device resource.
     * @param parameters Parameters supplied to the create or update device operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeviceInner createOrUpdate(String resourceGroupName, String deviceName, DeviceInner parameters);

    /**
     * Creates or updates a device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName Resource name for the device resource.
     * @param parameters Parameters supplied to the create or update device operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeviceInner createOrUpdate(String resourceGroupName, String deviceName, DeviceInner parameters, Context context);

    /**
     * Updates device tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param parameters Parameters supplied to the update device tags operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeviceInner> updateTagsWithResponse(
        String resourceGroupName, String deviceName, TagsObject parameters, Context context);

    /**
     * Updates device tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param parameters Parameters supplied to the update device tags operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeviceInner updateTags(String resourceGroupName, String deviceName, TagsObject parameters);

    /**
     * Lists all the devices in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceInner> list();

    /**
     * Lists all the devices in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceInner> list(Context context);

    /**
     * Lists all the device resource in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the device resource in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for devices API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List the registration key for the device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device registration key along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeviceRegistrationKeyInner> listRegistrationKeyWithResponse(
        String resourceGroupName, String deviceName, Context context);

    /**
     * List the registration key for the device.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deviceName The name of the device resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device registration key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeviceRegistrationKeyInner listRegistrationKey(String resourceGroupName, String deviceName);
}
