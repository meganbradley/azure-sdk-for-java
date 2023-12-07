// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of the parameter.
 */
public final class ScriptActivityParameterType extends ExpandableStringEnum<ScriptActivityParameterType> {
    /**
     * Static value Boolean for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType BOOLEAN = fromString("Boolean");

    /**
     * Static value DateTime for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType DATE_TIME = fromString("DateTime");

    /**
     * Static value DateTimeOffset for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType DATE_TIME_OFFSET = fromString("DateTimeOffset");

    /**
     * Static value Decimal for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType DECIMAL = fromString("Decimal");

    /**
     * Static value Double for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType DOUBLE = fromString("Double");

    /**
     * Static value Guid for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType GUID = fromString("Guid");

    /**
     * Static value Int16 for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType INT16 = fromString("Int16");

    /**
     * Static value Int32 for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType INT32 = fromString("Int32");

    /**
     * Static value Int64 for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType INT64 = fromString("Int64");

    /**
     * Static value Single for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType SINGLE = fromString("Single");

    /**
     * Static value String for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType STRING = fromString("String");

    /**
     * Static value Timespan for ScriptActivityParameterType.
     */
    public static final ScriptActivityParameterType TIMESPAN = fromString("Timespan");

    /**
     * Creates a new instance of ScriptActivityParameterType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScriptActivityParameterType() {
    }

    /**
     * Creates or finds a ScriptActivityParameterType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScriptActivityParameterType.
     */
    @JsonCreator
    public static ScriptActivityParameterType fromString(String name) {
        return fromString(name, ScriptActivityParameterType.class);
    }

    /**
     * Gets known ScriptActivityParameterType values.
     * 
     * @return known ScriptActivityParameterType values.
     */
    public static Collection<ScriptActivityParameterType> values() {
        return values(ScriptActivityParameterType.class);
    }
}
