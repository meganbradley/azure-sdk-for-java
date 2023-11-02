// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LiveTokens. */
public interface LiveTokens {
    /**
     * **Gets an access token for live metrics stream data.**.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a live token query along with {@link Response}.
     */
    Response<LiveTokenResponse> getWithResponse(String resourceUri, Context context);

    /**
     * **Gets an access token for live metrics stream data.**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a live token query.
     */
    LiveTokenResponse get(String resourceUri);
}
