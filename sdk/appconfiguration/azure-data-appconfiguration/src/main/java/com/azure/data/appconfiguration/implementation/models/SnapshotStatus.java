// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The current status of the snapshot. */
public final class SnapshotStatus extends ExpandableStringEnum<SnapshotStatus> {
    /** Static value provisioning for SnapshotStatus. */
    public static final SnapshotStatus PROVISIONING = fromString("provisioning");

    /** Static value ready for SnapshotStatus. */
    public static final SnapshotStatus READY = fromString("ready");

    /** Static value archived for SnapshotStatus. */
    public static final SnapshotStatus ARCHIVED = fromString("archived");

    /** Static value failed for SnapshotStatus. */
    public static final SnapshotStatus FAILED = fromString("failed");

    /**
     * Creates a new instance of SnapshotStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SnapshotStatus() {}

    /**
     * Creates or finds a SnapshotStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SnapshotStatus.
     */
    @JsonCreator
    public static SnapshotStatus fromString(String name) {
        return fromString(name, SnapshotStatus.class);
    }

    /**
     * Gets known SnapshotStatus values.
     *
     * @return known SnapshotStatus values.
     */
    public static Collection<SnapshotStatus> values() {
        return values(SnapshotStatus.class);
    }
}
