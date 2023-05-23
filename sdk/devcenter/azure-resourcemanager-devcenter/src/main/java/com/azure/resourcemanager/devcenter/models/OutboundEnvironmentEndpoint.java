// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.resourcemanager.devcenter.fluent.models.OutboundEnvironmentEndpointInner;
import java.util.List;

/** An immutable client-side representation of OutboundEnvironmentEndpoint. */
public interface OutboundEnvironmentEndpoint {
    /**
     * Gets the category property: The type of service that the agent connects to.
     *
     * @return the category value.
     */
    String category();

    /**
     * Gets the endpoints property: The endpoints for this service for which the agent requires outbound access.
     *
     * @return the endpoints value.
     */
    List<EndpointDependency> endpoints();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.OutboundEnvironmentEndpointInner object.
     *
     * @return the inner object.
     */
    OutboundEnvironmentEndpointInner innerModel();
}
