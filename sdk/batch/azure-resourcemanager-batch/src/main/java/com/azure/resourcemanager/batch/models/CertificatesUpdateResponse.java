// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.batch.fluent.models.CertificateInner;

/** Contains all response data for the update operation. */
public final class CertificatesUpdateResponse extends ResponseBase<CertificatesUpdateHeaders, CertificateInner> {
    /**
     * Creates an instance of CertificatesUpdateResponse.
     *
     * @param request the request which resulted in this CertificatesUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public CertificatesUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        CertificateInner value,
        CertificatesUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public CertificateInner getValue() {
        return super.getValue();
    }
}
