// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in PartnerTopicEventSubscriptionsClient.
 */
public interface PartnerTopicEventSubscriptionsClient {
    /**
     * Get an event subscription of a partner topic.
     * 
     * Get properties of an event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be found. Event subscription names must be between
     * 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a partner topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventSubscriptionInner> getWithResponse(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, Context context);

    /**
     * Get an event subscription of a partner topic.
     * 
     * Get properties of an event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be found. Event subscription names must be between
     * 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a partner topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner get(String resourceGroupName, String partnerTopicName, String eventSubscriptionName);

    /**
     * Create or update an event subscription of a partner topic.
     * 
     * Asynchronously creates or updates an event subscription of a partner topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginCreateOrUpdate(String resourceGroupName,
        String partnerTopicName, String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo);

    /**
     * Create or update an event subscription of a partner topic.
     * 
     * Asynchronously creates or updates an event subscription of a partner topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginCreateOrUpdate(String resourceGroupName,
        String partnerTopicName, String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo,
        Context context);

    /**
     * Create or update an event subscription of a partner topic.
     * 
     * Asynchronously creates or updates an event subscription of a partner topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner createOrUpdate(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo);

    /**
     * Create or update an event subscription of a partner topic.
     * 
     * Asynchronously creates or updates an event subscription of a partner topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner createOrUpdate(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, EventSubscriptionInner eventSubscriptionInfo, Context context);

    /**
     * Delete an event subscription of a partner topic.
     * 
     * Delete an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName);

    /**
     * Delete an event subscription of a partner topic.
     * 
     * Delete an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, Context context);

    /**
     * Delete an event subscription of a partner topic.
     * 
     * Delete an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerTopicName, String eventSubscriptionName);

    /**
     * Delete an event subscription of a partner topic.
     * 
     * Delete an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerTopicName, String eventSubscriptionName, Context context);

    /**
     * Update event subscription of a partner topic.
     * 
     * Update an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginUpdate(String resourceGroupName,
        String partnerTopicName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update event subscription of a partner topic.
     * 
     * Update an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginUpdate(String resourceGroupName,
        String partnerTopicName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters, Context context);

    /**
     * Update event subscription of a partner topic.
     * 
     * Update an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner update(String resourceGroupName, String partnerTopicName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update event subscription of a partner topic.
     * 
     * Update an existing event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner update(String resourceGroupName, String partnerTopicName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters, Context context);

    /**
     * Get full URL of an event subscription of a partner topic.
     * 
     * Get the full endpoint URL for an event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription of a partner topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventSubscriptionFullUrlInner> getFullUrlWithResponse(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName, Context context);

    /**
     * Get full URL of an event subscription of a partner topic.
     * 
     * Get the full endpoint URL for an event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription of a partner topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionFullUrlInner getFullUrl(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName);

    /**
     * List event subscriptions of a partner topic.
     * 
     * List event subscriptions that belong to a specific partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSubscriptionInner> listByPartnerTopic(String resourceGroupName, String partnerTopicName);

    /**
     * List event subscriptions of a partner topic.
     * 
     * List event subscriptions that belong to a specific partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSubscriptionInner> listByPartnerTopic(String resourceGroupName, String partnerTopicName,
        String filter, Integer top, Context context);

    /**
     * Get delivery attributes for an event subscription of a partner topic.
     * 
     * Get all delivery attributes for an event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription of a partner topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeliveryAttributeListResultInner> getDeliveryAttributesWithResponse(String resourceGroupName,
        String partnerTopicName, String eventSubscriptionName, Context context);

    /**
     * Get delivery attributes for an event subscription of a partner topic.
     * 
     * Get all delivery attributes for an event subscription of a partner topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription of a partner topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeliveryAttributeListResultInner getDeliveryAttributes(String resourceGroupName, String partnerTopicName,
        String eventSubscriptionName);
}
