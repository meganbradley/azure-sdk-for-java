// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.VideoAnalyzerOperationStatusesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoAnalyzerOperationStatusInner;
import com.azure.resourcemanager.videoanalyzer.models.VideoAnalyzerOperationStatus;
import com.azure.resourcemanager.videoanalyzer.models.VideoAnalyzerOperationStatuses;

public final class VideoAnalyzerOperationStatusesImpl implements VideoAnalyzerOperationStatuses {
    private static final ClientLogger LOGGER = new ClientLogger(VideoAnalyzerOperationStatusesImpl.class);

    private final VideoAnalyzerOperationStatusesClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public VideoAnalyzerOperationStatusesImpl(
        VideoAnalyzerOperationStatusesClient innerClient,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VideoAnalyzerOperationStatus get(String locationName, String operationId) {
        VideoAnalyzerOperationStatusInner inner = this.serviceClient().get(locationName, operationId);
        if (inner != null) {
            return new VideoAnalyzerOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VideoAnalyzerOperationStatus> getWithResponse(
        String locationName, String operationId, Context context) {
        Response<VideoAnalyzerOperationStatusInner> inner =
            this.serviceClient().getWithResponse(locationName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VideoAnalyzerOperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VideoAnalyzerOperationStatusesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }
}
