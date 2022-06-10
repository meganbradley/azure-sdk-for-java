// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SapDatabaseScaleMethod. */
public final class SapDatabaseScaleMethod extends ExpandableStringEnum<SapDatabaseScaleMethod> {
    /** Static value ScaleUp for SapDatabaseScaleMethod. */
    public static final SapDatabaseScaleMethod SCALE_UP = fromString("ScaleUp");

    /**
     * Creates or finds a SapDatabaseScaleMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SapDatabaseScaleMethod.
     */
    @JsonCreator
    public static SapDatabaseScaleMethod fromString(String name) {
        return fromString(name, SapDatabaseScaleMethod.class);
    }

    /**
     * Gets known SapDatabaseScaleMethod values.
     *
     * @return known SapDatabaseScaleMethod values.
     */
    public static Collection<SapDatabaseScaleMethod> values() {
        return values(SapDatabaseScaleMethod.class);
    }
}
