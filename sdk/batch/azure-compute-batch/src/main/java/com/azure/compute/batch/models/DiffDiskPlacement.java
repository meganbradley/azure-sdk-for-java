// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * AccessDiffDiskPlacementScope enums.
 */
public final class DiffDiskPlacement extends ExpandableStringEnum<DiffDiskPlacement> {

    /**
     * The Ephemeral OS Disk is stored on the VM cache.
     */
    @Generated
    public static final DiffDiskPlacement CACHE_DISK = fromString("cachedisk");

    /**
     * Creates a new instance of DiffDiskPlacement value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DiffDiskPlacement() {
    }

    /**
     * Creates or finds a DiffDiskPlacement from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiffDiskPlacement.
     */
    @Generated
    @JsonCreator
    public static DiffDiskPlacement fromString(String name) {
        return fromString(name, DiffDiskPlacement.class);
    }

    /**
     * Gets known DiffDiskPlacement values.
     *
     * @return known DiffDiskPlacement values.
     */
    @Generated
    public static Collection<DiffDiskPlacement> values() {
        return values(DiffDiskPlacement.class);
    }
}
