// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.support.models.MessageProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Describes the properties of a Chat Transcript Details resource.
 */
@Fluent
public final class ChatTranscriptDetailsProperties {
    /*
     * List of chat transcript communication resources.
     */
    @JsonProperty(value = "messages")
    private List<MessageProperties> messages;

    /*
     * Time in UTC (ISO 8601 format) when the chat began.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /**
     * Creates an instance of ChatTranscriptDetailsProperties class.
     */
    public ChatTranscriptDetailsProperties() {
    }

    /**
     * Get the messages property: List of chat transcript communication resources.
     * 
     * @return the messages value.
     */
    public List<MessageProperties> messages() {
        return this.messages;
    }

    /**
     * Set the messages property: List of chat transcript communication resources.
     * 
     * @param messages the messages value to set.
     * @return the ChatTranscriptDetailsProperties object itself.
     */
    public ChatTranscriptDetailsProperties withMessages(List<MessageProperties> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Get the startTime property: Time in UTC (ISO 8601 format) when the chat began.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (messages() != null) {
            messages().forEach(e -> e.validate());
        }
    }
}
