// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * "inherited" = "True" indicates that the current scope inherits its pricing configuration from its parent. The ID of
 * the parent scope that provides the inherited configuration is displayed in the "inheritedFrom" field. On the other
 * hand, "inherited" = "False" indicates that the current scope has its own pricing configuration explicitly set, and
 * does not inherit from its parent. This field is read only and available only for resource-level pricing.
 */
public final class Inherited extends ExpandableStringEnum<Inherited> {
    /**
     * Static value True for Inherited.
     */
    public static final Inherited TRUE = fromString("True");

    /**
     * Static value False for Inherited.
     */
    public static final Inherited FALSE = fromString("False");

    /**
     * Creates a new instance of Inherited value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Inherited() {
    }

    /**
     * Creates or finds a Inherited from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Inherited.
     */
    @JsonCreator
    public static Inherited fromString(String name) {
        return fromString(name, Inherited.class);
    }

    /**
     * Gets known Inherited values.
     * 
     * @return known Inherited values.
     */
    public static Collection<Inherited> values() {
        return values(Inherited.class);
    }
}
