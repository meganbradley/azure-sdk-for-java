// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** NX flag. */
public final class NxFlag extends ExpandableStringEnum<NxFlag> {
    /** Static value True for NxFlag. */
    public static final NxFlag TRUE = fromString("True");

    /** Static value False for NxFlag. */
    public static final NxFlag FALSE = fromString("False");

    /**
     * Creates a new instance of NxFlag value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NxFlag() {
    }

    /**
     * Creates or finds a NxFlag from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NxFlag.
     */
    @JsonCreator
    public static NxFlag fromString(String name) {
        return fromString(name, NxFlag.class);
    }

    /**
     * Gets known NxFlag values.
     *
     * @return known NxFlag values.
     */
    public static Collection<NxFlag> values() {
        return values(NxFlag.class);
    }
}
