// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.RoleInner;

/** Resource collection API of Roles. */
public interface Roles {
    /**
     * Lists all the roles configured in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the roles on the Data Box Edge device as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Role> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Lists all the roles configured in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the roles on the Data Box Edge device as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Role> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context);

    /**
     * Gets a specific role by name.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific role by name along with {@link Response}.
     */
    Response<Role> getWithResponse(String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Gets a specific role by name.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific role by name.
     */
    Role get(String deviceName, String name, String resourceGroupName);

    /**
     * Create or update a role.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param role The role properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute role.
     */
    Role createOrUpdate(String deviceName, String name, String resourceGroupName, RoleInner role);

    /**
     * Create or update a role.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param role The role properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute role.
     */
    Role createOrUpdate(String deviceName, String name, String resourceGroupName, RoleInner role, Context context);

    /**
     * Deletes the role on the device.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the role on the device.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String name, String resourceGroupName, Context context);
}
