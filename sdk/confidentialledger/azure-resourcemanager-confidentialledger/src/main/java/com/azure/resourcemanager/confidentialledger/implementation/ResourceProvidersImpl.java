// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.confidentialledger.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.confidentialledger.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.confidentialledger.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.confidentialledger.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.confidentialledger.models.ResourceProviders;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager;

    public ResourceProvidersImpl(ResourceProvidersClient innerClient,
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CheckNameAvailabilityResponse>
        checkNameAvailabilityWithResponse(CheckNameAvailabilityRequest nameAvailabilityRequest, Context context) {
        Response<CheckNameAvailabilityResponseInner> inner
            = this.serviceClient().checkNameAvailabilityWithResponse(nameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResponse checkNameAvailability(CheckNameAvailabilityRequest nameAvailabilityRequest) {
        CheckNameAvailabilityResponseInner inner = this.serviceClient().checkNameAvailability(nameAvailabilityRequest);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager() {
        return this.serviceManager;
    }
}
