// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The current state of the backup.
 */
public final class BackupState extends ExpandableStringEnum<BackupState> {
    /**
     * Static value Initiated for BackupState.
     */
    public static final BackupState INITIATED = fromString("Initiated");

    /**
     * Static value InProgress for BackupState.
     */
    public static final BackupState IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Succeeded for BackupState.
     */
    public static final BackupState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for BackupState.
     */
    public static final BackupState FAILED = fromString("Failed");

    /**
     * Creates a new instance of BackupState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackupState() {
    }

    /**
     * Creates or finds a BackupState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BackupState.
     */
    @JsonCreator
    public static BackupState fromString(String name) {
        return fromString(name, BackupState.class);
    }

    /**
     * Gets known BackupState values.
     * 
     * @return known BackupState values.
     */
    public static Collection<BackupState> values() {
        return values(BackupState.class);
    }
}
