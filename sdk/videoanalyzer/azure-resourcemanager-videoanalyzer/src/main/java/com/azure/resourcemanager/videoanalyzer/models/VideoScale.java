// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The video scaling information. */
@Fluent
public final class VideoScale {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoScale.class);

    /*
     * The desired output video height.
     */
    @JsonProperty(value = "height")
    private String height;

    /*
     * The desired output video width.
     */
    @JsonProperty(value = "width")
    private String width;

    /*
     * Describes the video scaling mode to be applied. Default mode is 'Pad'.
     * If the mode is 'Pad' or 'Stretch' then both width and height must be
     * specified. Else if the mode is 'PreserveAspectRatio' then only one of
     * width or height need be provided.
     */
    @JsonProperty(value = "mode")
    private VideoScaleMode mode;

    /**
     * Get the height property: The desired output video height.
     *
     * @return the height value.
     */
    public String height() {
        return this.height;
    }

    /**
     * Set the height property: The desired output video height.
     *
     * @param height the height value to set.
     * @return the VideoScale object itself.
     */
    public VideoScale withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * Get the width property: The desired output video width.
     *
     * @return the width value.
     */
    public String width() {
        return this.width;
    }

    /**
     * Set the width property: The desired output video width.
     *
     * @param width the width value to set.
     * @return the VideoScale object itself.
     */
    public VideoScale withWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * Get the mode property: Describes the video scaling mode to be applied. Default mode is 'Pad'. If the mode is
     * 'Pad' or 'Stretch' then both width and height must be specified. Else if the mode is 'PreserveAspectRatio' then
     * only one of width or height need be provided.
     *
     * @return the mode value.
     */
    public VideoScaleMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Describes the video scaling mode to be applied. Default mode is 'Pad'. If the mode is
     * 'Pad' or 'Stretch' then both width and height must be specified. Else if the mode is 'PreserveAspectRatio' then
     * only one of width or height need be provided.
     *
     * @param mode the mode value to set.
     * @return the VideoScale object itself.
     */
    public VideoScale withMode(VideoScaleMode mode) {
        this.mode = mode;
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
