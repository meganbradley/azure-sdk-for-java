// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NamespaceTopics. */
public interface NamespaceTopics {
    /**
     * Get a namespace topic.
     *
     * <p>Get properties of a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a namespace topic along with {@link Response}.
     */
    Response<NamespaceTopic> getWithResponse(
        String resourceGroupName, String namespaceName, String topicName, Context context);

    /**
     * Get a namespace topic.
     *
     * <p>Get properties of a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a namespace topic.
     */
    NamespaceTopic get(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String topicName, Context context);

    /**
     * List namespace topics under a namespace.
     *
     * <p>List all the namespace topics under a namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List namespace topics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NamespaceTopic> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * List namespace topics under a namespace.
     *
     * <p>List all the namespace topics under a namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List namespace topics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NamespaceTopic> listByNamespace(
        String resourceGroupName, String namespaceName, String filter, Integer top, Context context);

    /**
     * List keys for a namespace topic.
     *
     * <p>List the two keys used to publish to a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic along with {@link Response}.
     */
    Response<TopicSharedAccessKeys> listSharedAccessKeysWithResponse(
        String resourceGroupName, String namespaceName, String topicName, Context context);

    /**
     * List keys for a namespace topic.
     *
     * <p>List the two keys used to publish to a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys listSharedAccessKeys(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Regenerate key for a namespace topic.
     *
     * <p>Regenerate a shared access key for a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate key for a namespace topic.
     *
     * <p>Regenerate a shared access key for a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    TopicSharedAccessKeys regenerateKey(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest,
        Context context);

    /**
     * Get a namespace topic.
     *
     * <p>Get properties of a namespace topic.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a namespace topic along with {@link Response}.
     */
    NamespaceTopic getById(String id);

    /**
     * Get a namespace topic.
     *
     * <p>Get properties of a namespace topic.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a namespace topic along with {@link Response}.
     */
    Response<NamespaceTopic> getByIdWithResponse(String id, Context context);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NamespaceTopic resource.
     *
     * @param name resource name.
     * @return the first stage of the new NamespaceTopic definition.
     */
    NamespaceTopic.DefinitionStages.Blank define(String name);
}
