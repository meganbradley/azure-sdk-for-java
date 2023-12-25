// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The identity type.
 */
public final class DatabaseIdentityType extends ExpandableStringEnum<DatabaseIdentityType> {
    /**
     * Static value None for DatabaseIdentityType.
     */
    public static final DatabaseIdentityType NONE = fromString("None");

    /**
     * Static value UserAssigned for DatabaseIdentityType.
     */
    public static final DatabaseIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Creates a new instance of DatabaseIdentityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabaseIdentityType() {
    }

    /**
     * Creates or finds a DatabaseIdentityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseIdentityType.
     */
    @JsonCreator
    public static DatabaseIdentityType fromString(String name) {
        return fromString(name, DatabaseIdentityType.class);
    }

    /**
     * Gets known DatabaseIdentityType values.
     * 
     * @return known DatabaseIdentityType values.
     */
    public static Collection<DatabaseIdentityType> values() {
        return values(DatabaseIdentityType.class);
    }
}
