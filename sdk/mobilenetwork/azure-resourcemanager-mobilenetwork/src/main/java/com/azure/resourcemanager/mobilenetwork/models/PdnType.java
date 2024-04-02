// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Packet Data Network Type.
 */
public final class PdnType extends ExpandableStringEnum<PdnType> {
    /**
     * Static value IPV4 for PdnType.
     */
    public static final PdnType IPV4 = fromString("IPV4");

    /**
     * Creates a new instance of PdnType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PdnType() {
    }

    /**
     * Creates or finds a PdnType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PdnType.
     */
    @JsonCreator
    public static PdnType fromString(String name) {
        return fromString(name, PdnType.class);
    }

    /**
     * Gets known PdnType values.
     * 
     * @return known PdnType values.
     */
    public static Collection<PdnType> values() {
        return values(PdnType.class);
    }
}
