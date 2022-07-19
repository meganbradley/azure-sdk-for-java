// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RestoreMode. */
public final class RestoreMode extends ExpandableStringEnum<RestoreMode> {
    /** Static value PointInTime for RestoreMode. */
    public static final RestoreMode POINT_IN_TIME = fromString("PointInTime");

    /**
     * Creates or finds a RestoreMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestoreMode.
     */
    @JsonCreator
    public static RestoreMode fromString(String name) {
        return fromString(name, RestoreMode.class);
    }

    /**
     * Gets known RestoreMode values.
     *
     * @return known RestoreMode values.
     */
    public static Collection<RestoreMode> values() {
        return values(RestoreMode.class);
    }
}
