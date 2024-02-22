// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Severity of error.
 */
public final class Severity extends ExpandableStringEnum<Severity> {
    /**
     * Static value NONE for Severity.
     */
    public static final Severity NONE = fromString("NONE");

    /**
     * Static value Warning for Severity.
     */
    public static final Severity WARNING = fromString("Warning");

    /**
     * Static value Error for Severity.
     */
    public static final Severity ERROR = fromString("Error");

    /**
     * Static value Info for Severity.
     */
    public static final Severity INFO = fromString("Info");

    /**
     * Creates a new instance of Severity value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Severity() {
    }

    /**
     * Creates or finds a Severity from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Severity.
     */
    @JsonCreator
    public static Severity fromString(String name) {
        return fromString(name, Severity.class);
    }

    /**
     * Gets known Severity values.
     * 
     * @return known Severity values.
     */
    public static Collection<Severity> values() {
        return values(Severity.class);
    }
}
