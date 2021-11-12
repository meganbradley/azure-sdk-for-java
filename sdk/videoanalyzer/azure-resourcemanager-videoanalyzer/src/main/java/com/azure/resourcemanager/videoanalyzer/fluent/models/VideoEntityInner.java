// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.models.VideoArchival;
import com.azure.resourcemanager.videoanalyzer.models.VideoContentUrls;
import com.azure.resourcemanager.videoanalyzer.models.VideoFlags;
import com.azure.resourcemanager.videoanalyzer.models.VideoMediaInfo;
import com.azure.resourcemanager.videoanalyzer.models.VideoType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a video resource within Azure Video Analyzer. Videos can be ingested from RTSP cameras through live
 * pipelines or can be created by exporting sequences from existing captured video through a pipeline job. Videos
 * ingested through live pipelines can be streamed through Azure Video Analyzer Player Widget or compatible players.
 * Exported videos can be downloaded as MP4 files.
 */
@Fluent
public final class VideoEntityInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoEntityInner.class);

    /*
     * The resource properties.
     */
    @JsonProperty(value = "properties")
    private VideoProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The resource properties.
     *
     * @return the innerProperties value.
     */
    private VideoProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the title property: Optional video title provided by the user. Value can be up to 256 characters long.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: Optional video title provided by the user. Value can be up to 256 characters long.
     *
     * @param title the title value to set.
     * @return the VideoEntityInner object itself.
     */
    public VideoEntityInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VideoProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the description property: Optional video description provided by the user. Value can be up to 2048 characters
     * long.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Optional video description provided by the user. Value can be up to 2048 characters
     * long.
     *
     * @param description the description value to set.
     * @return the VideoEntityInner object itself.
     */
    public VideoEntityInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VideoProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the type property: Video content type. Different content types are suitable for different applications and
     * scenarios.
     *
     * @return the type value.
     */
    public VideoType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Get the flags property: Video flags contain information about the available video actions and its dynamic
     * properties based on the current video state.
     *
     * @return the flags value.
     */
    public VideoFlags flags() {
        return this.innerProperties() == null ? null : this.innerProperties().flags();
    }

    /**
     * Get the contentUrls property: Set of URLs to the video content.
     *
     * @return the contentUrls value.
     */
    public VideoContentUrls contentUrls() {
        return this.innerProperties() == null ? null : this.innerProperties().contentUrls();
    }

    /**
     * Get the mediaInfo property: Contains information about the video and audio content.
     *
     * @return the mediaInfo value.
     */
    public VideoMediaInfo mediaInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().mediaInfo();
    }

    /**
     * Set the mediaInfo property: Contains information about the video and audio content.
     *
     * @param mediaInfo the mediaInfo value to set.
     * @return the VideoEntityInner object itself.
     */
    public VideoEntityInner withMediaInfo(VideoMediaInfo mediaInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VideoProperties();
        }
        this.innerProperties().withMediaInfo(mediaInfo);
        return this;
    }

    /**
     * Get the archival property: Video archival properties.
     *
     * @return the archival value.
     */
    public VideoArchival archival() {
        return this.innerProperties() == null ? null : this.innerProperties().archival();
    }

    /**
     * Set the archival property: Video archival properties.
     *
     * @param archival the archival value to set.
     * @return the VideoEntityInner object itself.
     */
    public VideoEntityInner withArchival(VideoArchival archival) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VideoProperties();
        }
        this.innerProperties().withArchival(archival);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
