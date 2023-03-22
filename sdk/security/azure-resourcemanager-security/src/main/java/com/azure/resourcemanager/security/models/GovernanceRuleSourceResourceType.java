// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The governance rule source, what the rule affects, e.g. Assessments. */
public final class GovernanceRuleSourceResourceType extends ExpandableStringEnum<GovernanceRuleSourceResourceType> {
    /** Static value Assessments for GovernanceRuleSourceResourceType. */
    public static final GovernanceRuleSourceResourceType ASSESSMENTS = fromString("Assessments");

    /**
     * Creates a new instance of GovernanceRuleSourceResourceType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GovernanceRuleSourceResourceType() {
    }

    /**
     * Creates or finds a GovernanceRuleSourceResourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GovernanceRuleSourceResourceType.
     */
    @JsonCreator
    public static GovernanceRuleSourceResourceType fromString(String name) {
        return fromString(name, GovernanceRuleSourceResourceType.class);
    }

    /**
     * Gets known GovernanceRuleSourceResourceType values.
     *
     * @return known GovernanceRuleSourceResourceType values.
     */
    public static Collection<GovernanceRuleSourceResourceType> values() {
        return values(GovernanceRuleSourceResourceType.class);
    }
}
