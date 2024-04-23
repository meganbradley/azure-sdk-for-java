// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Options for DTMF recognition.
 */
@Fluent
public final class DtmfOptionsInternal {
    /*
     * Time to wait between DTMF inputs to stop recognizing.
     */
    @JsonProperty(value = "interToneTimeoutInSeconds")
    private Integer interToneTimeoutInSeconds;

    /*
     * Maximum number of DTMF tones to be collected.
     */
    @JsonProperty(value = "maxTonesToCollect")
    private Integer maxTonesToCollect;

    /*
     * List of tones that will stop recognizing.
     */
    @JsonProperty(value = "stopTones")
    private List<DtmfToneInternal> stopTones;

    /**
     * Creates an instance of DtmfOptionsInternal class.
     */
    public DtmfOptionsInternal() {
    }

    /**
     * Get the interToneTimeoutInSeconds property: Time to wait between DTMF inputs to stop recognizing.
     * 
     * @return the interToneTimeoutInSeconds value.
     */
    public Integer getInterToneTimeoutInSeconds() {
        return this.interToneTimeoutInSeconds;
    }

    /**
     * Set the interToneTimeoutInSeconds property: Time to wait between DTMF inputs to stop recognizing.
     * 
     * @param interToneTimeoutInSeconds the interToneTimeoutInSeconds value to set.
     * @return the DtmfOptionsInternal object itself.
     */
    public DtmfOptionsInternal setInterToneTimeoutInSeconds(Integer interToneTimeoutInSeconds) {
        this.interToneTimeoutInSeconds = interToneTimeoutInSeconds;
        return this;
    }

    /**
     * Get the maxTonesToCollect property: Maximum number of DTMF tones to be collected.
     * 
     * @return the maxTonesToCollect value.
     */
    public Integer getMaxTonesToCollect() {
        return this.maxTonesToCollect;
    }

    /**
     * Set the maxTonesToCollect property: Maximum number of DTMF tones to be collected.
     * 
     * @param maxTonesToCollect the maxTonesToCollect value to set.
     * @return the DtmfOptionsInternal object itself.
     */
    public DtmfOptionsInternal setMaxTonesToCollect(Integer maxTonesToCollect) {
        this.maxTonesToCollect = maxTonesToCollect;
        return this;
    }

    /**
     * Get the stopTones property: List of tones that will stop recognizing.
     * 
     * @return the stopTones value.
     */
    public List<DtmfToneInternal> getStopTones() {
        return this.stopTones;
    }

    /**
     * Set the stopTones property: List of tones that will stop recognizing.
     * 
     * @param stopTones the stopTones value to set.
     * @return the DtmfOptionsInternal object itself.
     */
    public DtmfOptionsInternal setStopTones(List<DtmfToneInternal> stopTones) {
        this.stopTones = stopTones;
        return this;
    }
}
