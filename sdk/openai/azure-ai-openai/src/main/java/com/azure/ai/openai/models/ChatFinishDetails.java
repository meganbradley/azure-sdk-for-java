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
 * An abstract representation of structured information about why a chat completions response terminated.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = ChatFinishDetails.class, visible = true)
@JsonTypeName("ChatFinishDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "stop", value = StopFinishDetails.class),
    @JsonSubTypes.Type(name = "max_tokens", value = MaxTokensFinishDetails.class) })
@Immutable
public class ChatFinishDetails {

    /**
     * Creates an instance of ChatFinishDetails class.
     */
    @Generated
    protected ChatFinishDetails() {
        this.type = "ChatFinishDetails";
    }

    /*
     * The object type.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }
}
