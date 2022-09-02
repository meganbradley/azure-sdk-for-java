// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.communication.fluent.models.EmailServiceResourceInner;
import com.azure.resourcemanager.communication.models.EmailServiceResourceUpdate;
import java.util.List;

/** An instance of this class provides access to all the operations defined in EmailServicesClient. */
public interface EmailServicesClient {
    /**
     * Get
     *
     * <p>Get the EmailService and its properties.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the EmailService and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailServiceResourceInner getByResourceGroup(String resourceGroupName, String emailServiceName);

    /**
     * Get
     *
     * <p>Get the EmailService and its properties.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the EmailService and its properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EmailServiceResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String emailServiceName, Context context);

    /**
     * Create Or Update
     *
     * <p>Create a new EmailService or update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EmailServiceResourceInner>, EmailServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String emailServiceName, EmailServiceResourceInner parameters);

    /**
     * Create Or Update
     *
     * <p>Create a new EmailService or update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EmailServiceResourceInner>, EmailServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String emailServiceName, EmailServiceResourceInner parameters, Context context);

    /**
     * Create Or Update
     *
     * <p>Create a new EmailService or update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailServiceResourceInner createOrUpdate(
        String resourceGroupName, String emailServiceName, EmailServiceResourceInner parameters);

    /**
     * Create Or Update
     *
     * <p>Create a new EmailService or update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailServiceResourceInner createOrUpdate(
        String resourceGroupName, String emailServiceName, EmailServiceResourceInner parameters, Context context);

    /**
     * Delete
     *
     * <p>Operation to delete a EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String emailServiceName);

    /**
     * Delete
     *
     * <p>Operation to delete a EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String emailServiceName, Context context);

    /**
     * Delete
     *
     * <p>Operation to delete a EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String emailServiceName);

    /**
     * Delete
     *
     * <p>Operation to delete a EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String emailServiceName, Context context);

    /**
     * Update
     *
     * <p>Operation to update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EmailServiceResourceInner>, EmailServiceResourceInner> beginUpdate(
        String resourceGroupName, String emailServiceName, EmailServiceResourceUpdate parameters);

    /**
     * Update
     *
     * <p>Operation to update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EmailServiceResourceInner>, EmailServiceResourceInner> beginUpdate(
        String resourceGroupName, String emailServiceName, EmailServiceResourceUpdate parameters, Context context);

    /**
     * Update
     *
     * <p>Operation to update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailServiceResourceInner update(
        String resourceGroupName, String emailServiceName, EmailServiceResourceUpdate parameters);

    /**
     * Update
     *
     * <p>Operation to update an existing EmailService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param parameters Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing an EmailService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EmailServiceResourceInner update(
        String resourceGroupName, String emailServiceName, EmailServiceResourceUpdate parameters, Context context);

    /**
     * List By Subscription
     *
     * <p>Handles requests to list all resources in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of EmailServices and a possible link for next set as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EmailServiceResourceInner> list();

    /**
     * List By Subscription
     *
     * <p>Handles requests to list all resources in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of EmailServices and a possible link for next set as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EmailServiceResourceInner> list(Context context);

    /**
     * List By Resource Group
     *
     * <p>Handles requests to list all resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of EmailServices and a possible link for next set as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EmailServiceResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List By Resource Group
     *
     * <p>Handles requests to list all resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of EmailServices and a possible link for next set as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EmailServiceResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List Verified Domains From Exchange Online
     *
     * <p>Get a list of domains that are fully verified in Exchange Online.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains that are fully verified in Exchange Online.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<String> listVerifiedExchangeOnlineDomains();

    /**
     * List Verified Domains From Exchange Online
     *
     * <p>Get a list of domains that are fully verified in Exchange Online.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains that are fully verified in Exchange Online along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<String>> listVerifiedExchangeOnlineDomainsWithResponse(Context context);
}
