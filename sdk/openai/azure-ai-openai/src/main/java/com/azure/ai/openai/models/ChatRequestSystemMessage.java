// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A request chat message containing system instructions that influence how the model will generate a chat completions
 * response.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "role",
    defaultImpl = ChatRequestSystemMessage.class,
    visible = true)
@JsonTypeName("system")
@Fluent
public final class ChatRequestSystemMessage extends ChatRequestMessage {

    /*
     * The contents of the system message.
     */
    @Generated
    @JsonProperty(value = "content")
    private final String content;

    /*
     * An optional name for the participant.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of ChatRequestSystemMessage class.
     *
     * @param content the content value to set.
     */
    @Generated
    @JsonCreator
    public ChatRequestSystemMessage(@JsonProperty(value = "content") String content) {
        this.content = content;
    }

    /**
     * Get the content property: The contents of the system message.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Get the name property: An optional name for the participant.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: An optional name for the participant.
     *
     * @param name the name value to set.
     * @return the ChatRequestSystemMessage object itself.
     */
    @Generated
    public ChatRequestSystemMessage setName(String name) {
        this.name = name;
        return this;
    }

    /*
     * The chat role associated with this message.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "role")
    private ChatRole role = ChatRole.SYSTEM;

    /**
     * Get the role property: The chat role associated with this message.
     *
     * @return the role value.
     */
    @Generated
    @Override
    public ChatRole getRole() {
        return this.role;
    }
}
