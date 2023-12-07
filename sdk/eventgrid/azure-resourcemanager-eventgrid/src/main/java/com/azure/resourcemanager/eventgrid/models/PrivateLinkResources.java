// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of PrivateLinkResources.
 */
public interface PrivateLinkResources {
    /**
     * Get a private link resource.
     * 
     * Get properties of a private link resource.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or
     * \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner
     * namespace name or namespace name).
     * @param privateLinkResourceName The name of private link resource will be either topic, domain, partnerNamespace
     * or namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a private link resource along with {@link Response}.
     */
    Response<PrivateLinkResource> getWithResponse(String resourceGroupName, String parentType, String parentName,
        String privateLinkResourceName, Context context);

    /**
     * Get a private link resource.
     * 
     * Get properties of a private link resource.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or
     * \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner
     * namespace name or namespace name).
     * @param privateLinkResourceName The name of private link resource will be either topic, domain, partnerNamespace
     * or namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a private link resource.
     */
    PrivateLinkResource get(String resourceGroupName, String parentType, String parentName,
        String privateLinkResourceName);

    /**
     * List private link resources under specific topic, domain, or partner namespace or namespace.
     * 
     * List all the private link resources under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or
     * \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner
     * namespace or namespace name).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List private link resources operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByResource(String resourceGroupName, String parentType, String parentName);

    /**
     * List private link resources under specific topic, domain, or partner namespace or namespace.
     * 
     * List all the private link resources under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or
     * \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner
     * namespace or namespace name).
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
     * @return result of the List private link resources operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByResource(String resourceGroupName, String parentType, String parentName,
        String filter, Integer top, Context context);
}
