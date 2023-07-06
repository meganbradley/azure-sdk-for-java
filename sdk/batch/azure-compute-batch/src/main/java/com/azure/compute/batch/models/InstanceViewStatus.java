// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The instance view status. */
@Immutable
public final class InstanceViewStatus {

    /*
     * The status code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The localized label for the status.
     */
    @JsonProperty(value = "displayStatus")
    private String displayStatus;

    /*
     * Level code.
     */
    @JsonProperty(value = "level")
    private StatusLevelTypes level;

    /*
     * The detailed status message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The time of the status.
     */
    @JsonProperty(value = "time")
    private String time;

    /** Creates an instance of InstanceViewStatus class. */
    private InstanceViewStatus() {}

    /**
     * Get the code property: The status code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the displayStatus property: The localized label for the status.
     *
     * @return the displayStatus value.
     */
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    /**
     * Get the level property: Level code.
     *
     * @return the level value.
     */
    public StatusLevelTypes getLevel() {
        return this.level;
    }

    /**
     * Get the message property: The detailed status message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the time property: The time of the status.
     *
     * @return the time value.
     */
    public String getTime() {
        return this.time;
    }
}
