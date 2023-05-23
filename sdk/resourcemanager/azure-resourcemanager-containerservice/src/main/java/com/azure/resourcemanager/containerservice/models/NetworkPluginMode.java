// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The mode the network plugin should use. */
public final class NetworkPluginMode extends ExpandableStringEnum<NetworkPluginMode> {
    /** Static value overlay for NetworkPluginMode. */
    public static final NetworkPluginMode OVERLAY = fromString("overlay");

    /**
     * Creates a new instance of NetworkPluginMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkPluginMode() {
    }

    /**
     * Creates or finds a NetworkPluginMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkPluginMode.
     */
    @JsonCreator
    public static NetworkPluginMode fromString(String name) {
        return fromString(name, NetworkPluginMode.class);
    }

    /**
     * Gets known NetworkPluginMode values.
     *
     * @return known NetworkPluginMode values.
     */
    public static Collection<NetworkPluginMode> values() {
        return values(NetworkPluginMode.class);
    }
}
