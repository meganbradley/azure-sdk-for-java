// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * SQL Vulnerability Assessment baseline status.
 */
public final class RuleStatus extends ExpandableStringEnum<RuleStatus> {
    /**
     * Static value NonFinding for RuleStatus.
     */
    public static final RuleStatus NON_FINDING = fromString("NonFinding");

    /**
     * Static value Finding for RuleStatus.
     */
    public static final RuleStatus FINDING = fromString("Finding");

    /**
     * Static value InternalError for RuleStatus.
     */
    public static final RuleStatus INTERNAL_ERROR = fromString("InternalError");

    /**
     * Creates a new instance of RuleStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RuleStatus() {
    }

    /**
     * Creates or finds a RuleStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RuleStatus.
     */
    @JsonCreator
    public static RuleStatus fromString(String name) {
        return fromString(name, RuleStatus.class);
    }

    /**
     * Gets known RuleStatus values.
     * 
     * @return known RuleStatus values.
     */
    public static Collection<RuleStatus> values() {
        return values(RuleStatus.class);
    }
}
