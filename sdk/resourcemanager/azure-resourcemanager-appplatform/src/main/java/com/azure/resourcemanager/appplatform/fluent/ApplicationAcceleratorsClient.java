// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appplatform.fluent.models.ApplicationAcceleratorResourceInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ApplicationAcceleratorsClient. */
public interface ApplicationAcceleratorsClient {
    /**
     * Handle requests to list all application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of application accelerator resources and a possible link for next set as
     *     paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationAcceleratorResourceInner> listAsync(String resourceGroupName, String serviceName);

    /**
     * Handle requests to list all application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of application accelerator resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationAcceleratorResourceInner> list(String resourceGroupName, String serviceName);

    /**
     * Handle requests to list all application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of application accelerator resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationAcceleratorResourceInner> list(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Get the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application accelerator along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ApplicationAcceleratorResourceInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Get the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application accelerator on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ApplicationAcceleratorResourceInner> getAsync(
        String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Get the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application accelerator along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationAcceleratorResourceInner> getWithResponse(
        String resourceGroupName, String serviceName, String applicationAcceleratorName, Context context);

    /**
     * Get the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application accelerator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationAcceleratorResourceInner get(
        String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Create or update the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param applicationAcceleratorResource The application accelerator for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application accelerator resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String applicationAcceleratorName,
        ApplicationAcceleratorResourceInner applicationAcceleratorResource);

    /**
     * Create or update the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param applicationAcceleratorResource The application accelerator for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of application accelerator resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ApplicationAcceleratorResourceInner>, ApplicationAcceleratorResourceInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String serviceName,
            String applicationAcceleratorName,
            ApplicationAcceleratorResourceInner applicationAcceleratorResource);

    /**
     * Create or update the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param applicationAcceleratorResource The application accelerator for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of application accelerator resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ApplicationAcceleratorResourceInner>, ApplicationAcceleratorResourceInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String serviceName,
            String applicationAcceleratorName,
            ApplicationAcceleratorResourceInner applicationAcceleratorResource);

    /**
     * Create or update the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param applicationAcceleratorResource The application accelerator for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of application accelerator resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ApplicationAcceleratorResourceInner>, ApplicationAcceleratorResourceInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String serviceName,
            String applicationAcceleratorName,
            ApplicationAcceleratorResourceInner applicationAcceleratorResource,
            Context context);

    /**
     * Create or update the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param applicationAcceleratorResource The application accelerator for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application accelerator resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ApplicationAcceleratorResourceInner> createOrUpdateAsync(
        String resourceGroupName,
        String serviceName,
        String applicationAcceleratorName,
        ApplicationAcceleratorResourceInner applicationAcceleratorResource);

    /**
     * Create or update the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param applicationAcceleratorResource The application accelerator for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application accelerator resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationAcceleratorResourceInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String applicationAcceleratorName,
        ApplicationAcceleratorResourceInner applicationAcceleratorResource);

    /**
     * Create or update the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param applicationAcceleratorResource The application accelerator for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application accelerator resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationAcceleratorResourceInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String applicationAcceleratorName,
        ApplicationAcceleratorResourceInner applicationAcceleratorResource,
        Context context);

    /**
     * Delete the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Delete the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Delete the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Delete the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceName, String applicationAcceleratorName, Context context);

    /**
     * Delete the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Delete the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String applicationAcceleratorName);

    /**
     * Delete the application accelerator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String applicationAcceleratorName, Context context);
}
