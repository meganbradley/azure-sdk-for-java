// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for TopicSpaces ListByNamespace.
 */
public final class TopicSpacesListByNamespaceSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * TopicSpaces_ListByNamespace.json
     */
    /**
     * Sample code: TopicSpaces_ListByNamespace.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void topicSpacesListByNamespace(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topicSpaces().listByNamespace("examplerg", "namespace123", null, null,
            com.azure.core.util.Context.NONE);
    }
}
