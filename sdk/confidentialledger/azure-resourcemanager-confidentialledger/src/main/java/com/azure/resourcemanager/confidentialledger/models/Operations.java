// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Operations. */
public interface Operations {
    /**
     * Retrieves a list of available API operations under this Resource Provider.
     *
     * <p>Retrieves a list of available API operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list containing this Resource Provider's available operations as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ResourceProviderOperationDefinition> list();

    /**
     * Retrieves a list of available API operations under this Resource Provider.
     *
     * <p>Retrieves a list of available API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list containing this Resource Provider's available operations as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ResourceProviderOperationDefinition> list(Context context);
}
