// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PlayRequest model. */
@Fluent
public final class PlayRequest {
    /*
     * The source of the audio to be played.
     */
    @JsonProperty(value = "playSources", required = true)
    private List<PlaySourceInternal> playSources;

    /*
     * The list of call participants play provided audio to.
     * Plays to everyone in the call when not provided.
     */
    @JsonProperty(value = "playTo")
    private List<CommunicationIdentifierModel> playTo;

    /*
     * Defines options for playing the audio.
     */
    @JsonProperty(value = "playOptions")
    private PlayOptionsInternal playOptions;

    /*
     * The value to identify context of the operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * The callback URI to override the main callback URI.
     */
    @JsonProperty(value = "overrideCallbackUri")
    private String overrideCallbackUri;

    /** Creates an instance of PlayRequest class. */
    public PlayRequest() {}

    /**
     * Get the playSources property: The source of the audio to be played.
     *
     * @return the playSources value.
     */
    public List<PlaySourceInternal> getPlaySources() {
        return this.playSources;
    }

    /**
     * Set the playSources property: The source of the audio to be played.
     *
     * @param playSources the playSources value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setPlaySources(List<PlaySourceInternal> playSources) {
        this.playSources = playSources;
        return this;
    }

    /**
     * Get the playTo property: The list of call participants play provided audio to. Plays to everyone in the call when
     * not provided.
     *
     * @return the playTo value.
     */
    public List<CommunicationIdentifierModel> getPlayTo() {
        return this.playTo;
    }

    /**
     * Set the playTo property: The list of call participants play provided audio to. Plays to everyone in the call when
     * not provided.
     *
     * @param playTo the playTo value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setPlayTo(List<CommunicationIdentifierModel> playTo) {
        this.playTo = playTo;
        return this;
    }

    /**
     * Get the playOptions property: Defines options for playing the audio.
     *
     * @return the playOptions value.
     */
    public PlayOptionsInternal getPlayOptions() {
        return this.playOptions;
    }

    /**
     * Set the playOptions property: Defines options for playing the audio.
     *
     * @param playOptions the playOptions value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setPlayOptions(PlayOptionsInternal playOptions) {
        this.playOptions = playOptions;
        return this;
    }

    /**
     * Get the operationContext property: The value to identify context of the operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The value to identify context of the operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the overrideCallbackUri property: The callback URI to override the main callback URI.
     *
     * @return the overrideCallbackUri value.
     */
    public String getOverrideCallbackUri() {
        return this.overrideCallbackUri;
    }

    /**
     * Set the overrideCallbackUri property: The callback URI to override the main callback URI.
     *
     * @param overrideCallbackUri the overrideCallbackUri value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setOverrideCallbackUri(String overrideCallbackUri) {
        this.overrideCallbackUri = overrideCallbackUri;
        return this;
    }
}
