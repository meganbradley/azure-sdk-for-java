// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An abstract representation of a response format configuration usable by Chat Completions. Can be used to enable JSON
 * mode.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = ChatCompletionsResponseFormat.class,
    visible = true)
@JsonTypeName("ChatCompletionsResponseFormat")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "text", value = ChatCompletionsTextResponseFormat.class),
    @JsonSubTypes.Type(name = "json_object", value = ChatCompletionsJsonResponseFormat.class) })
@Immutable
public class ChatCompletionsResponseFormat {

    /**
     * Creates an instance of ChatCompletionsResponseFormat class.
     */
    @Generated
    public ChatCompletionsResponseFormat() {
        this.type = "ChatCompletionsResponseFormat";
    }

    /*
     * The discriminated type for the response format.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the type property: The discriminated type for the response format.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }
}
