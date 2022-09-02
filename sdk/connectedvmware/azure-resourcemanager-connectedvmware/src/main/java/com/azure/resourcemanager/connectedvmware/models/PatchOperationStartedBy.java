// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PatchOperationStartedBy. */
public final class PatchOperationStartedBy extends ExpandableStringEnum<PatchOperationStartedBy> {
    /** Static value User for PatchOperationStartedBy. */
    public static final PatchOperationStartedBy USER = fromString("User");

    /** Static value Platform for PatchOperationStartedBy. */
    public static final PatchOperationStartedBy PLATFORM = fromString("Platform");

    /**
     * Creates or finds a PatchOperationStartedBy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PatchOperationStartedBy.
     */
    @JsonCreator
    public static PatchOperationStartedBy fromString(String name) {
        return fromString(name, PatchOperationStartedBy.class);
    }

    /**
     * Gets known PatchOperationStartedBy values.
     *
     * @return known PatchOperationStartedBy values.
     */
    public static Collection<PatchOperationStartedBy> values() {
        return values(PatchOperationStartedBy.class);
    }
}
