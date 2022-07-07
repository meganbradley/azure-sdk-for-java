// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EndpointType. */
public final class EndpointType extends ExpandableStringEnum<EndpointType> {
    /** Static value WebHook for EndpointType. */
    public static final EndpointType WEB_HOOK = fromString("WebHook");

    /** Static value EventHub for EndpointType. */
    public static final EndpointType EVENT_HUB = fromString("EventHub");

    /** Static value StorageQueue for EndpointType. */
    public static final EndpointType STORAGE_QUEUE = fromString("StorageQueue");

    /** Static value HybridConnection for EndpointType. */
    public static final EndpointType HYBRID_CONNECTION = fromString("HybridConnection");

    /** Static value ServiceBusQueue for EndpointType. */
    public static final EndpointType SERVICE_BUS_QUEUE = fromString("ServiceBusQueue");

    /** Static value ServiceBusTopic for EndpointType. */
    public static final EndpointType SERVICE_BUS_TOPIC = fromString("ServiceBusTopic");

    /** Static value AzureFunction for EndpointType. */
    public static final EndpointType AZURE_FUNCTION = fromString("AzureFunction");

    /**
     * Creates or finds a EndpointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EndpointType.
     */
    @JsonCreator
    public static EndpointType fromString(String name) {
        return fromString(name, EndpointType.class);
    }

    /**
     * Gets known EndpointType values.
     *
     * @return known EndpointType values.
     */
    public static Collection<EndpointType> values() {
        return values(EndpointType.class);
    }
}
