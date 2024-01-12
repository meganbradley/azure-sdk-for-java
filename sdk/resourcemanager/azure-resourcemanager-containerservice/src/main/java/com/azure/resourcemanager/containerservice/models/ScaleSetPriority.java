// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The Virtual Machine Scale Set priority.
 */
public final class ScaleSetPriority extends ExpandableStringEnum<ScaleSetPriority> {
    /**
     * Static value Spot for ScaleSetPriority.
     */
    public static final ScaleSetPriority SPOT = fromString("Spot");

    /**
     * Static value Regular for ScaleSetPriority.
     */
    public static final ScaleSetPriority REGULAR = fromString("Regular");

    /**
     * Creates a new instance of ScaleSetPriority value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScaleSetPriority() {
    }

    /**
     * Creates or finds a ScaleSetPriority from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScaleSetPriority.
     */
    @JsonCreator
    public static ScaleSetPriority fromString(String name) {
        return fromString(name, ScaleSetPriority.class);
    }

    /**
     * Gets known ScaleSetPriority values.
     *
     * @return known ScaleSetPriority values.
     */
    public static Collection<ScaleSetPriority> values() {
        return values(ScaleSetPriority.class);
    }
}
