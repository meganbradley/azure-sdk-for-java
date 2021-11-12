// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Optional flags used to change how video is published. These are only allowed for topologies where "kind" is set to
 * "live".
 */
@Fluent
public final class VideoPublishingOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoPublishingOptions.class);

    /*
     * When set to 'true' content will not be archived or recorded. This is
     * used, for example, when the topology is used only for low latency video
     * streaming. Default is 'false'.  If set to 'true', then
     * "disableRtspPublishing" must be set to 'false'.
     */
    @JsonProperty(value = "disableArchive")
    private String disableArchive;

    /*
     * When set to 'true' the RTSP playback URL will not be published,
     * disabling low latency streaming. This is used, for example, when the
     * topology is used only for archiving content. Default is 'false'.  If set
     * to 'true', then "disableArchive" must be set to 'false'.
     */
    @JsonProperty(value = "disableRtspPublishing")
    private String disableRtspPublishing;

    /**
     * Get the disableArchive property: When set to 'true' content will not be archived or recorded. This is used, for
     * example, when the topology is used only for low latency video streaming. Default is 'false'. If set to 'true',
     * then "disableRtspPublishing" must be set to 'false'.
     *
     * @return the disableArchive value.
     */
    public String disableArchive() {
        return this.disableArchive;
    }

    /**
     * Set the disableArchive property: When set to 'true' content will not be archived or recorded. This is used, for
     * example, when the topology is used only for low latency video streaming. Default is 'false'. If set to 'true',
     * then "disableRtspPublishing" must be set to 'false'.
     *
     * @param disableArchive the disableArchive value to set.
     * @return the VideoPublishingOptions object itself.
     */
    public VideoPublishingOptions withDisableArchive(String disableArchive) {
        this.disableArchive = disableArchive;
        return this;
    }

    /**
     * Get the disableRtspPublishing property: When set to 'true' the RTSP playback URL will not be published, disabling
     * low latency streaming. This is used, for example, when the topology is used only for archiving content. Default
     * is 'false'. If set to 'true', then "disableArchive" must be set to 'false'.
     *
     * @return the disableRtspPublishing value.
     */
    public String disableRtspPublishing() {
        return this.disableRtspPublishing;
    }

    /**
     * Set the disableRtspPublishing property: When set to 'true' the RTSP playback URL will not be published, disabling
     * low latency streaming. This is used, for example, when the topology is used only for archiving content. Default
     * is 'false'. If set to 'true', then "disableArchive" must be set to 'false'.
     *
     * @param disableRtspPublishing the disableRtspPublishing value to set.
     * @return the VideoPublishingOptions object itself.
     */
    public VideoPublishingOptions withDisableRtspPublishing(String disableRtspPublishing) {
        this.disableRtspPublishing = disableRtspPublishing;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
