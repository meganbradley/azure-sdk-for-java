// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates whether the data migration should start right away. */
public final class StartDataMigrationEnum extends ExpandableStringEnum<StartDataMigrationEnum> {
    /** Static value True for StartDataMigrationEnum. */
    public static final StartDataMigrationEnum TRUE = fromString("True");

    /** Static value False for StartDataMigrationEnum. */
    public static final StartDataMigrationEnum FALSE = fromString("False");

    /**
     * Creates a new instance of StartDataMigrationEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StartDataMigrationEnum() {
    }

    /**
     * Creates or finds a StartDataMigrationEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StartDataMigrationEnum.
     */
    @JsonCreator
    public static StartDataMigrationEnum fromString(String name) {
        return fromString(name, StartDataMigrationEnum.class);
    }

    /**
     * Gets known StartDataMigrationEnum values.
     *
     * @return known StartDataMigrationEnum values.
     */
    public static Collection<StartDataMigrationEnum> values() {
        return values(StartDataMigrationEnum.class);
    }
}
