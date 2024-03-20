// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates whether the extension is enabled.
 */
public final class IsEnabled extends ExpandableStringEnum<IsEnabled> {
    /**
     * Static value True for IsEnabled.
     */
    public static final IsEnabled TRUE = fromString("True");

    /**
     * Static value False for IsEnabled.
     */
    public static final IsEnabled FALSE = fromString("False");

    /**
     * Creates a new instance of IsEnabled value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IsEnabled() {
    }

    /**
     * Creates or finds a IsEnabled from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IsEnabled.
     */
    @JsonCreator
    public static IsEnabled fromString(String name) {
        return fromString(name, IsEnabled.class);
    }

    /**
     * Gets known IsEnabled values.
     * 
     * @return known IsEnabled values.
     */
    public static Collection<IsEnabled> values() {
        return values(IsEnabled.class);
    }
}
