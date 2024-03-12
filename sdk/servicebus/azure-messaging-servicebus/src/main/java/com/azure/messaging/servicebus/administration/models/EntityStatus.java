// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of a Service Bus resource.
 */
public final class EntityStatus extends ExpandableStringEnum<EntityStatus> {
    /**
     * Static value Active for EntityStatus.
     */
    public static final EntityStatus ACTIVE = fromString("Active");

    /**
     * Static value Creating for EntityStatus.
     */
    public static final EntityStatus CREATING = fromString("Creating");

    /**
     * Static value Deleting for EntityStatus.
     */
    public static final EntityStatus DELETING = fromString("Deleting");

    /**
     * Static value Disabled for EntityStatus.
     */
    public static final EntityStatus DISABLED = fromString("Disabled");

    /**
     * Static value ReceiveDisabled for EntityStatus.
     */
    public static final EntityStatus RECEIVE_DISABLED = fromString("ReceiveDisabled");

    /**
     * Static value Renaming for EntityStatus.
     */
    public static final EntityStatus RENAMING = fromString("Renaming");

    /**
     * Static value Restoring for EntityStatus.
     */
    public static final EntityStatus RESTORING = fromString("Restoring");

    /**
     * Static value SendDisabled for EntityStatus.
     */
    public static final EntityStatus SEND_DISABLED = fromString("SendDisabled");

    /**
     * Static value Unknown for EntityStatus.
     */
    public static final EntityStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of EntityStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EntityStatus() {
    }

    /**
     * Creates or finds a EntityStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EntityStatus.
     */
    public static EntityStatus fromString(String name) {
        return fromString(name, EntityStatus.class);
    }

    /**
     * Gets known EntityStatus values.
     * 
     * @return known EntityStatus values.
     */
    public static Collection<EntityStatus> values() {
        return values(EntityStatus.class);
    }
}
