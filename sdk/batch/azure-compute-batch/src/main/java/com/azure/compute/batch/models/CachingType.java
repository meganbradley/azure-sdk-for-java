// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * CachingType enums.
 */
public final class CachingType extends ExpandableStringEnum<CachingType> {

    /**
     * The caching mode for the disk is not enabled.
     */
    @Generated
    public static final CachingType NONE = fromString("none");

    /**
     * The caching mode for the disk is read only.
     */
    @Generated
    public static final CachingType READ_ONLY = fromString("readonly");

    /**
     * The caching mode for the disk is read and write.
     */
    @Generated
    public static final CachingType READ_WRITE = fromString("readwrite");

    /**
     * Creates a new instance of CachingType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CachingType() {
    }

    /**
     * Creates or finds a CachingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CachingType.
     */
    @Generated
    @JsonCreator
    public static CachingType fromString(String name) {
        return fromString(name, CachingType.class);
    }

    /**
     * Gets known CachingType values.
     *
     * @return known CachingType values.
     */
    @Generated
    public static Collection<CachingType> values() {
        return values(CachingType.class);
    }
}
