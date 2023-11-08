// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Column data type. */
public final class ColumnTypeEnum extends ExpandableStringEnum<ColumnTypeEnum> {
    /** Static value string for ColumnTypeEnum. */
    public static final ColumnTypeEnum STRING = fromString("string");

    /** Static value int for ColumnTypeEnum. */
    public static final ColumnTypeEnum INT = fromString("int");

    /** Static value long for ColumnTypeEnum. */
    public static final ColumnTypeEnum LONG = fromString("long");

    /** Static value real for ColumnTypeEnum. */
    public static final ColumnTypeEnum REAL = fromString("real");

    /** Static value boolean for ColumnTypeEnum. */
    public static final ColumnTypeEnum BOOLEAN = fromString("boolean");

    /** Static value dateTime for ColumnTypeEnum. */
    public static final ColumnTypeEnum DATE_TIME = fromString("dateTime");

    /** Static value guid for ColumnTypeEnum. */
    public static final ColumnTypeEnum GUID = fromString("guid");

    /** Static value dynamic for ColumnTypeEnum. */
    public static final ColumnTypeEnum DYNAMIC = fromString("dynamic");

    /**
     * Creates a new instance of ColumnTypeEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ColumnTypeEnum() {
    }

    /**
     * Creates or finds a ColumnTypeEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ColumnTypeEnum.
     */
    @JsonCreator
    public static ColumnTypeEnum fromString(String name) {
        return fromString(name, ColumnTypeEnum.class);
    }

    /**
     * Gets known ColumnTypeEnum values.
     *
     * @return known ColumnTypeEnum values.
     */
    public static Collection<ColumnTypeEnum> values() {
        return values(ColumnTypeEnum.class);
    }
}
