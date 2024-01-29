// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies whether the container is registered or not.
 */
public final class ProtectionStatus extends ExpandableStringEnum<ProtectionStatus> {
    /**
     * Static value Invalid for ProtectionStatus.
     */
    public static final ProtectionStatus INVALID = fromString("Invalid");

    /**
     * Static value NotProtected for ProtectionStatus.
     */
    public static final ProtectionStatus NOT_PROTECTED = fromString("NotProtected");

    /**
     * Static value Protecting for ProtectionStatus.
     */
    public static final ProtectionStatus PROTECTING = fromString("Protecting");

    /**
     * Static value Protected for ProtectionStatus.
     */
    public static final ProtectionStatus PROTECTED = fromString("Protected");

    /**
     * Static value ProtectionFailed for ProtectionStatus.
     */
    public static final ProtectionStatus PROTECTION_FAILED = fromString("ProtectionFailed");

    /**
     * Creates a new instance of ProtectionStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProtectionStatus() {
    }

    /**
     * Creates or finds a ProtectionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProtectionStatus.
     */
    @JsonCreator
    public static ProtectionStatus fromString(String name) {
        return fromString(name, ProtectionStatus.class);
    }

    /**
     * Gets known ProtectionStatus values.
     * 
     * @return known ProtectionStatus values.
     */
    public static Collection<ProtectionStatus> values() {
        return values(ProtectionStatus.class);
    }
}
