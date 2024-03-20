// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appcontainers.fluent.models.BuildResourceInner;

/**
 * An instance of this class provides access to all the operations defined in BuildsClient.
 */
public interface BuildsClient {
    /**
     * Get a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a BuildResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BuildResourceInner> getWithResponse(String resourceGroupName, String builderName, String buildName,
        Context context);

    /**
     * Get a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a BuildResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BuildResourceInner get(String resourceGroupName, String builderName, String buildName);

    /**
     * Create a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @param buildEnvelope Resource create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of information pertaining to an individual build.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BuildResourceInner>, BuildResourceInner> beginCreateOrUpdate(String resourceGroupName,
        String builderName, String buildName, BuildResourceInner buildEnvelope);

    /**
     * Create a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @param buildEnvelope Resource create or update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of information pertaining to an individual build.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BuildResourceInner>, BuildResourceInner> beginCreateOrUpdate(String resourceGroupName,
        String builderName, String buildName, BuildResourceInner buildEnvelope, Context context);

    /**
     * Create a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @param buildEnvelope Resource create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information pertaining to an individual build.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BuildResourceInner createOrUpdate(String resourceGroupName, String builderName, String buildName,
        BuildResourceInner buildEnvelope);

    /**
     * Create a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @param buildEnvelope Resource create or update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information pertaining to an individual build.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BuildResourceInner createOrUpdate(String resourceGroupName, String builderName, String buildName,
        BuildResourceInner buildEnvelope, Context context);

    /**
     * Delete a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String builderName, String buildName);

    /**
     * Delete a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String builderName, String buildName,
        Context context);

    /**
     * Delete a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String builderName, String buildName);

    /**
     * Delete a BuildResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param builderName The name of the builder.
     * @param buildName The name of a build.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String builderName, String buildName, Context context);
}
