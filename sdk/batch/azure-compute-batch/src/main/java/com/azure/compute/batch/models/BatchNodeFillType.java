// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** BatchNodeFillType enums. */
public final class BatchNodeFillType extends ExpandableStringEnum<BatchNodeFillType> {

    /** Tasks should be assigned evenly across all Compute Nodes in the Pool. */
    @Generated public static final BatchNodeFillType SPREAD = fromString("spread");

    /**
     * As many Tasks as possible (taskSlotsPerNode) should be assigned to each Compute Node in the Pool before any Tasks
     * are assigned to the next Compute Node in the Pool.
     */
    @Generated public static final BatchNodeFillType PACK = fromString("pack");

    /**
     * Creates a new instance of BatchNodeFillType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BatchNodeFillType() {}

    /**
     * Creates or finds a BatchNodeFillType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BatchNodeFillType.
     */
    @Generated
    @JsonCreator
    public static BatchNodeFillType fromString(String name) {
        return fromString(name, BatchNodeFillType.class);
    }

    /**
     * Gets known BatchNodeFillType values.
     *
     * @return known BatchNodeFillType values.
     */
    @Generated
    public static Collection<BatchNodeFillType> values() {
        return values(BatchNodeFillType.class);
    }
}
