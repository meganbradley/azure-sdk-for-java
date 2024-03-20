// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ConnectionType.
 */
public final class ConnectionType extends ExpandableStringEnum<ConnectionType> {
    /**
     * Static value Internal for ConnectionType.
     */
    public static final ConnectionType INTERNAL = fromString("Internal");

    /**
     * Static value External for ConnectionType.
     */
    public static final ConnectionType EXTERNAL = fromString("External");

    /**
     * Creates a new instance of ConnectionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConnectionType() {
    }

    /**
     * Creates or finds a ConnectionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConnectionType.
     */
    @JsonCreator
    public static ConnectionType fromString(String name) {
        return fromString(name, ConnectionType.class);
    }

    /**
     * Gets known ConnectionType values.
     * 
     * @return known ConnectionType values.
     */
    public static Collection<ConnectionType> values() {
        return values(ConnectionType.class);
    }
}
