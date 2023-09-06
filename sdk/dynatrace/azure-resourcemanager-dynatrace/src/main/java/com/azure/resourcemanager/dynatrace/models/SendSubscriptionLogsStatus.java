// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates whether subscription logs are being sent. */
public final class SendSubscriptionLogsStatus extends ExpandableStringEnum<SendSubscriptionLogsStatus> {
    /** Static value Enabled for SendSubscriptionLogsStatus. */
    public static final SendSubscriptionLogsStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for SendSubscriptionLogsStatus. */
    public static final SendSubscriptionLogsStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of SendSubscriptionLogsStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SendSubscriptionLogsStatus() {
    }

    /**
     * Creates or finds a SendSubscriptionLogsStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SendSubscriptionLogsStatus.
     */
    @JsonCreator
    public static SendSubscriptionLogsStatus fromString(String name) {
        return fromString(name, SendSubscriptionLogsStatus.class);
    }

    /**
     * Gets known SendSubscriptionLogsStatus values.
     *
     * @return known SendSubscriptionLogsStatus values.
     */
    public static Collection<SendSubscriptionLogsStatus> values() {
        return values(SendSubscriptionLogsStatus.class);
    }
}
