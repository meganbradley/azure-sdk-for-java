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
import java.util.List;

/**
 * A request chat message representing response or action from the assistant.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "role",
    defaultImpl = ChatRequestAssistantMessage.class,
    visible = true)
@JsonTypeName("assistant")
@Fluent
public final class ChatRequestAssistantMessage extends ChatRequestMessage {

    /*
     * The content of the message.
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

    /*
     * The tool calls that must be resolved and have their outputs appended to subsequent input messages for the chat
     * completions request to resolve as configured.
     */
    @Generated
    @JsonProperty(value = "tool_calls")
    private List<ChatCompletionsToolCall> toolCalls;

    /*
     * The function call that must be resolved and have its output appended to subsequent input messages for the chat
     * completions request to resolve as configured.
     */
    @Generated
    @JsonProperty(value = "function_call")
    private FunctionCall functionCall;

    /**
     * Creates an instance of ChatRequestAssistantMessage class.
     *
     * @param content the content value to set.
     */
    @Generated
    @JsonCreator
    public ChatRequestAssistantMessage(@JsonProperty(value = "content") String content) {
        this.content = content;
    }

    /**
     * Get the content property: The content of the message.
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
     * @return the ChatRequestAssistantMessage object itself.
     */
    @Generated
    public ChatRequestAssistantMessage setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the toolCalls property: The tool calls that must be resolved and have their outputs appended to subsequent
     * input messages for the chat
     * completions request to resolve as configured.
     *
     * @return the toolCalls value.
     */
    @Generated
    public List<ChatCompletionsToolCall> getToolCalls() {
        return this.toolCalls;
    }

    /**
     * Set the toolCalls property: The tool calls that must be resolved and have their outputs appended to subsequent
     * input messages for the chat
     * completions request to resolve as configured.
     *
     * @param toolCalls the toolCalls value to set.
     * @return the ChatRequestAssistantMessage object itself.
     */
    @Generated
    public ChatRequestAssistantMessage setToolCalls(List<ChatCompletionsToolCall> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    /**
     * Get the functionCall property: The function call that must be resolved and have its output appended to subsequent
     * input messages for the chat
     * completions request to resolve as configured.
     *
     * @return the functionCall value.
     */
    @Generated
    public FunctionCall getFunctionCall() {
        return this.functionCall;
    }

    /**
     * Set the functionCall property: The function call that must be resolved and have its output appended to subsequent
     * input messages for the chat
     * completions request to resolve as configured.
     *
     * @param functionCall the functionCall value to set.
     * @return the ChatRequestAssistantMessage object itself.
     */
    @Generated
    public ChatRequestAssistantMessage setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
        return this;
    }

    /*
     * The chat role associated with this message.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "role")
    private ChatRole role = ChatRole.ASSISTANT;

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
