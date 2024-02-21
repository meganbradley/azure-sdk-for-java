// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;

/**
 * A single, existing message within an assistant thread.
 */
@Immutable
public final class ThreadMessage {

    /*
     * The identifier, which can be referenced in API endpoints.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The object type, which is always 'thread.message'.
     */
    @Generated
    @JsonProperty(value = "object")
    private String object = "thread.message";

    /*
     * The Unix timestamp, in seconds, representing when this object was created.
     */
    @Generated
    @JsonProperty(value = "created_at")
    private long createdAt;

    /*
     * The ID of the thread that this message belongs to.
     */
    @Generated
    @JsonProperty(value = "thread_id")
    private String threadId;

    /*
     * The role associated with the assistant thread message.
     */
    @Generated
    @JsonProperty(value = "role")
    private MessageRole role;

    /*
     * The list of content items associated with the assistant thread message.
     */
    @Generated
    @JsonProperty(value = "content")
    private List<MessageContent> content;

    /*
     * If applicable, the ID of the assistant that authored this message.
     */
    @Generated
    @JsonProperty(value = "assistant_id")
    private String assistantId;

    /*
     * If applicable, the ID of the run associated with the authoring of this message.
     */
    @Generated
    @JsonProperty(value = "run_id")
    private String runId;

    /*
     * A list of file IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can
     * access files.
     */
    @Generated
    @JsonProperty(value = "file_ids")
    private List<String> fileIds;

    /*
     * A set of up to 16 key/value pairs that can be attached to an object, used for storing additional information
     * about that object in a structured format. Keys may be up to 64 characters in length and values may be up to 512
     * characters in length.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private Map<String, String> metadata;

    /**
     * Get the id property: The identifier, which can be referenced in API endpoints.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the object property: The object type, which is always 'thread.message'.
     *
     * @return the object value.
     */
    @Generated
    public String getObject() {
        return this.object;
    }

    /**
     * Get the createdAt property: The Unix timestamp, in seconds, representing when this object was created.
     *
     * @return the createdAt value.
     */
    @Generated
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * Get the threadId property: The ID of the thread that this message belongs to.
     *
     * @return the threadId value.
     */
    @Generated
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * Get the role property: The role associated with the assistant thread message.
     *
     * @return the role value.
     */
    @Generated
    public MessageRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The list of content items associated with the assistant thread message.
     *
     * @return the content value.
     */
    @Generated
    public List<MessageContent> getContent() {
        return this.content;
    }

    /**
     * Get the assistantId property: If applicable, the ID of the assistant that authored this message.
     *
     * @return the assistantId value.
     */
    @Generated
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * Get the runId property: If applicable, the ID of the run associated with the authoring of this message.
     *
     * @return the runId value.
     */
    @Generated
    public String getRunId() {
        return this.runId;
    }

    /**
     * Get the fileIds property: A list of file IDs that the assistant should use. Useful for tools like retrieval and
     * code_interpreter that can
     * access files.
     *
     * @return the fileIds value.
     */
    @Generated
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * Get the metadata property: A set of up to 16 key/value pairs that can be attached to an object, used for storing
     * additional information about that object in a structured format. Keys may be up to 64 characters in length and
     * values may be up to 512 characters in length.
     *
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Creates an instance of ThreadMessage class.
     *
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param threadId the threadId value to set.
     * @param role the role value to set.
     * @param content the content value to set.
     * @param fileIds the fileIds value to set.
     * @param metadata the metadata value to set.
     */
    @Generated
    private ThreadMessage(String id, OffsetDateTime createdAt, String threadId, MessageRole role,
        List<MessageContent> content, List<String> fileIds, Map<String, String> metadata) {
        this.id = id;
        this.createdAt = createdAt.toEpochSecond();
        this.threadId = threadId;
        this.role = role;
        this.content = content;
        this.fileIds = fileIds;
        this.metadata = metadata;
    }

    @Generated
    @JsonCreator
    private ThreadMessage(@JsonProperty(value = "id") String id, @JsonProperty(value = "created_at") long createdAt,
        @JsonProperty(value = "thread_id") String threadId, @JsonProperty(value = "role") MessageRole role,
        @JsonProperty(value = "content") List<MessageContent> content,
        @JsonProperty(value = "file_ids") List<String> fileIds,
        @JsonProperty(value = "metadata") Map<String, String> metadata) {
        this(id, OffsetDateTime.ofInstant(Instant.ofEpochSecond(createdAt), ZoneOffset.UTC), threadId, role, content,
            fileIds, metadata);
    }
}
