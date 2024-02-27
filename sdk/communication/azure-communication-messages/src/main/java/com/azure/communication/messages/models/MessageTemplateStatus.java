// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The aggregated template status.
 */
public final class MessageTemplateStatus extends ExpandableStringEnum<MessageTemplateStatus> {

    /**
     * Message template is approved.
     */
    @Generated
    public static final MessageTemplateStatus APPROVED = fromString("approved");

    /**
     * Message template is rejected.
     */
    @Generated
    public static final MessageTemplateStatus REJECTED = fromString("rejected");

    /**
     * Message template is pending.
     */
    @Generated
    public static final MessageTemplateStatus PENDING = fromString("pending");

    /**
     * Message template is paused.
     */
    @Generated
    public static final MessageTemplateStatus PAUSED = fromString("paused");

    /**
     * Creates a new instance of MessageTemplateStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public MessageTemplateStatus() {
    }

    /**
     * Creates or finds a MessageTemplateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MessageTemplateStatus.
     */
    @Generated
    @JsonCreator
    public static MessageTemplateStatus fromString(String name) {
        return fromString(name, MessageTemplateStatus.class);
    }

    /**
     * Gets known MessageTemplateStatus values.
     *
     * @return known MessageTemplateStatus values.
     */
    @Generated
    public static Collection<MessageTemplateStatus> values() {
        return values(MessageTemplateStatus.class);
    }
}
