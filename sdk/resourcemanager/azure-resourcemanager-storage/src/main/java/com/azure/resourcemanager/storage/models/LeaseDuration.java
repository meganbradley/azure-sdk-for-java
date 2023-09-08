// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specifies whether the lease on a container is of infinite or fixed duration, only when the container is leased. */
public final class LeaseDuration extends ExpandableStringEnum<LeaseDuration> {
    /** Static value Infinite for LeaseDuration. */
    public static final LeaseDuration INFINITE = fromString("Infinite");

    /** Static value Fixed for LeaseDuration. */
    public static final LeaseDuration FIXED = fromString("Fixed");

    /**
     * Creates a new instance of LeaseDuration value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LeaseDuration() {
    }

    /**
     * Creates or finds a LeaseDuration from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LeaseDuration.
     */
    @JsonCreator
    public static LeaseDuration fromString(String name) {
        return fromString(name, LeaseDuration.class);
    }

    /**
     * Gets known LeaseDuration values.
     *
     * @return known LeaseDuration values.
     */
    public static Collection<LeaseDuration> values() {
        return values(LeaseDuration.class);
    }
}
