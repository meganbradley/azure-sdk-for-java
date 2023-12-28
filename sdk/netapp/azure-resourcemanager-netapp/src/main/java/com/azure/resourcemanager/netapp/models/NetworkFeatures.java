// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Network features
 * 
 * Network features available to the volume, or current state of update.
 */
public final class NetworkFeatures extends ExpandableStringEnum<NetworkFeatures> {
    /**
     * Static value Basic for NetworkFeatures.
     */
    public static final NetworkFeatures BASIC = fromString("Basic");

    /**
     * Static value Standard for NetworkFeatures.
     */
    public static final NetworkFeatures STANDARD = fromString("Standard");

    /**
     * Static value Basic_Standard for NetworkFeatures.
     */
    public static final NetworkFeatures BASIC_STANDARD = fromString("Basic_Standard");

    /**
     * Static value Standard_Basic for NetworkFeatures.
     */
    public static final NetworkFeatures STANDARD_BASIC = fromString("Standard_Basic");

    /**
     * Creates a new instance of NetworkFeatures value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkFeatures() {
    }

    /**
     * Creates or finds a NetworkFeatures from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkFeatures.
     */
    @JsonCreator
    public static NetworkFeatures fromString(String name) {
        return fromString(name, NetworkFeatures.class);
    }

    /**
     * Gets known NetworkFeatures values.
     * 
     * @return known NetworkFeatures values.
     */
    public static Collection<NetworkFeatures> values() {
        return values(NetworkFeatures.class);
    }
}
