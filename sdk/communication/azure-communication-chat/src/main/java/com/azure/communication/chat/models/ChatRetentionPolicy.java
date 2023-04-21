// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Data retention policy for auto deletion. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "policyType",
        defaultImpl = ChatRetentionPolicy.class)
@JsonTypeName("ChatRetentionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "basedOnThreadCreationDate", value = ThreadCreationDateRetentionPolicy.class)
})
@Immutable
public abstract class ChatRetentionPolicy {
    /** kind of the ChatRetentionPolicy*/
    private final Kind kind;

    /**
     * Kind of retention policy. Available values are ["THREAD_CREATION_DATE"]
     * @param kind kind of the retention policy
     */
    public ChatRetentionPolicy(Kind kind) {
        this.kind = kind;
    }

    /**
     * Get the kind property: Chat kind of the retention policy.
     *
     * @return the kind.
     */
    public Kind getChatRetentionPolicyKind() {
        return kind;
    }
}
