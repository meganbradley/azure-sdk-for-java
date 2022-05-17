// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProviderName. */
public final class ProviderName extends ExpandableStringEnum<ProviderName> {
    /** Static value Microsoft.OperationalInsights/solutions for ProviderName. */
    public static final ProviderName MICROSOFT_OPERATIONAL_INSIGHTS_SOLUTIONS =
        fromString("Microsoft.OperationalInsights/solutions");

    /** Static value Microsoft.OperationalInsights/workspaces for ProviderName. */
    public static final ProviderName MICROSOFT_OPERATIONAL_INSIGHTS_WORKSPACES =
        fromString("Microsoft.OperationalInsights/workspaces");

    /** Static value Microsoft.OperationalInsights/workspaces/datasources for ProviderName. */
    public static final ProviderName MICROSOFT_OPERATIONAL_INSIGHTS_WORKSPACES_DATASOURCES =
        fromString("Microsoft.OperationalInsights/workspaces/datasources");

    /** Static value microsoft.aadiam/diagnosticSettings for ProviderName. */
    public static final ProviderName MICROSOFT_AADIAM_DIAGNOSTIC_SETTINGS =
        fromString("microsoft.aadiam/diagnosticSettings");

    /** Static value Microsoft.OperationalInsights/workspaces/sharedKeys for ProviderName. */
    public static final ProviderName MICROSOFT_OPERATIONAL_INSIGHTS_WORKSPACES_SHARED_KEYS =
        fromString("Microsoft.OperationalInsights/workspaces/sharedKeys");

    /** Static value Microsoft.Authorization/policyAssignments for ProviderName. */
    public static final ProviderName MICROSOFT_AUTHORIZATION_POLICY_ASSIGNMENTS =
        fromString("Microsoft.Authorization/policyAssignments");

    /**
     * Creates or finds a ProviderName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProviderName.
     */
    @JsonCreator
    public static ProviderName fromString(String name) {
        return fromString(name, ProviderName.class);
    }

    /**
     * Gets known ProviderName values.
     *
     * @return known ProviderName values.
     */
    public static Collection<ProviderName> values() {
        return values(ProviderName.class);
    }
}
