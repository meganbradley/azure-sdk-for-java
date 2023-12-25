// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Minimal TLS version. Allowed values: 'None', 1.0', '1.1', '1.2', '1.3'.
 */
public final class MinimalTlsVersion extends ExpandableStringEnum<MinimalTlsVersion> {
    /**
     * Static value None for MinimalTlsVersion.
     */
    public static final MinimalTlsVersion NONE = fromString("None");

    /**
     * Static value 1.0 for MinimalTlsVersion.
     */
    public static final MinimalTlsVersion ONE_ZERO = fromString("1.0");

    /**
     * Static value 1.1 for MinimalTlsVersion.
     */
    public static final MinimalTlsVersion ONE_ONE = fromString("1.1");

    /**
     * Static value 1.2 for MinimalTlsVersion.
     */
    public static final MinimalTlsVersion ONE_TWO = fromString("1.2");

    /**
     * Static value 1.3 for MinimalTlsVersion.
     */
    public static final MinimalTlsVersion ONE_THREE = fromString("1.3");

    /**
     * Creates a new instance of MinimalTlsVersion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MinimalTlsVersion() {
    }

    /**
     * Creates or finds a MinimalTlsVersion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MinimalTlsVersion.
     */
    @JsonCreator
    public static MinimalTlsVersion fromString(String name) {
        return fromString(name, MinimalTlsVersion.class);
    }

    /**
     * Gets known MinimalTlsVersion values.
     * 
     * @return known MinimalTlsVersion values.
     */
    public static Collection<MinimalTlsVersion> values() {
        return values(MinimalTlsVersion.class);
    }
}
