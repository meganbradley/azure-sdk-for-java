// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFullUrl;

public final class EventSubscriptionFullUrlImpl implements EventSubscriptionFullUrl {
    private EventSubscriptionFullUrlInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    EventSubscriptionFullUrlImpl(EventSubscriptionFullUrlInner innerObject,
        com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String endpointUrl() {
        return this.innerModel().endpointUrl();
    }

    public EventSubscriptionFullUrlInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }
}
