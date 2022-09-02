// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of EnvironmentTypes. */
public interface EnvironmentTypes {
    /**
     * Lists environment types for the devcenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the environment type list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EnvironmentType> listByDevCenter(String resourceGroupName, String devCenterName);

    /**
     * Lists environment types for the devcenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the environment type list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EnvironmentType> listByDevCenter(
        String resourceGroupName, String devCenterName, Integer top, Context context);

    /**
     * Gets an environment type.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param environmentTypeName The name of the environment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment type.
     */
    EnvironmentType get(String resourceGroupName, String devCenterName, String environmentTypeName);

    /**
     * Gets an environment type.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param environmentTypeName The name of the environment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment type along with {@link Response}.
     */
    Response<EnvironmentType> getWithResponse(
        String resourceGroupName, String devCenterName, String environmentTypeName, Context context);

    /**
     * Deletes an environment type.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param environmentTypeName The name of the environment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String devCenterName, String environmentTypeName);

    /**
     * Deletes an environment type.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param environmentTypeName The name of the environment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String devCenterName, String environmentTypeName, Context context);

    /**
     * Gets an environment type.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment type along with {@link Response}.
     */
    EnvironmentType getById(String id);

    /**
     * Gets an environment type.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment type along with {@link Response}.
     */
    Response<EnvironmentType> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an environment type.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an environment type.
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
     * Begins definition for a new EnvironmentType resource.
     *
     * @param name resource name.
     * @return the first stage of the new EnvironmentType definition.
     */
    EnvironmentType.DefinitionStages.Blank define(String name);
}
