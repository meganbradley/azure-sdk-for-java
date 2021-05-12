// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import java.util.Map;

/**
 * Job processing event data. Schema of the data property of an EventGridEvent for a Microsoft.Media.JobProcessing
 * event.
 */
@Immutable
public final class MediaJobProcessingEventData extends MediaJobStateChangeEventData {
    /** {@inheritDoc} */
    @Override
    public MediaJobProcessingEventData setCorrelationData(Map<String, String> correlationData) {
        super.setCorrelationData(correlationData);
        return this;
    }
}
