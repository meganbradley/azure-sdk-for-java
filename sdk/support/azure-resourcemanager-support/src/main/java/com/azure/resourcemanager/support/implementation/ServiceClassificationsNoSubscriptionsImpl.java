// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.ServiceClassificationsNoSubscriptionsClient;
import com.azure.resourcemanager.support.fluent.models.ServiceClassificationOutputInner;
import com.azure.resourcemanager.support.models.ServiceClassificationOutput;
import com.azure.resourcemanager.support.models.ServiceClassificationRequest;
import com.azure.resourcemanager.support.models.ServiceClassificationsNoSubscriptions;

public final class ServiceClassificationsNoSubscriptionsImpl implements ServiceClassificationsNoSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(ServiceClassificationsNoSubscriptionsImpl.class);

    private final ServiceClassificationsNoSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public ServiceClassificationsNoSubscriptionsImpl(ServiceClassificationsNoSubscriptionsClient innerClient,
        com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ServiceClassificationOutput>
        classifyServicesWithResponse(ServiceClassificationRequest serviceClassificationRequest, Context context) {
        Response<ServiceClassificationOutputInner> inner
            = this.serviceClient().classifyServicesWithResponse(serviceClassificationRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ServiceClassificationOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceClassificationOutput classifyServices(ServiceClassificationRequest serviceClassificationRequest) {
        ServiceClassificationOutputInner inner = this.serviceClient().classifyServices(serviceClassificationRequest);
        if (inner != null) {
            return new ServiceClassificationOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ServiceClassificationsNoSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
