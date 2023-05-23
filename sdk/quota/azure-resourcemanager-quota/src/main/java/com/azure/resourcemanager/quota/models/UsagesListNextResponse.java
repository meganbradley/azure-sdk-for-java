// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the listNext operation. */
public final class UsagesListNextResponse extends ResponseBase<UsagesListNextHeaders, UsagesLimits> {
    /**
     * Creates an instance of UsagesListNextResponse.
     *
     * @param request the request which resulted in this UsagesListNextResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public UsagesListNextResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        UsagesLimits value,
        UsagesListNextHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public UsagesLimits getValue() {
        return super.getValue();
    }
}
