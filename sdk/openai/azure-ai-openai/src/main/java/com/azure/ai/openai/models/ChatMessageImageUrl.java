// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An internet location from which the model may retrieve an image.
 */
@Fluent
public final class ChatMessageImageUrl {

    /*
     * The URL of the image.
     */
    @Generated
    @JsonProperty(value = "url")
    private final String url;

    /**
     * Creates an instance of ChatMessageImageUrl class.
     *
     * @param url the url value to set.
     */
    @Generated
    @JsonCreator
    public ChatMessageImageUrl(@JsonProperty(value = "url") String url) {
        this.url = url;
    }

    /**
     * Get the url property: The URL of the image.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /*
     * The evaluation quality setting to use, which controls relative prioritization of speed, token consumption, and
     * accuracy.
     */
    @Generated
    @JsonProperty(value = "detail")
    private ChatMessageImageDetailLevel detail;

    /**
     * Get the detail property: The evaluation quality setting to use, which controls relative prioritization of speed,
     * token consumption, and
     * accuracy.
     *
     * @return the detail value.
     */
    @Generated
    public ChatMessageImageDetailLevel getDetail() {
        return this.detail;
    }

    /**
     * Set the detail property: The evaluation quality setting to use, which controls relative prioritization of speed,
     * token consumption, and
     * accuracy.
     *
     * @param detail the detail value to set.
     * @return the ChatMessageImageUrl object itself.
     */
    @Generated
    public ChatMessageImageUrl setDetail(ChatMessageImageDetailLevel detail) {
        this.detail = detail;
        return this;
    }
}
