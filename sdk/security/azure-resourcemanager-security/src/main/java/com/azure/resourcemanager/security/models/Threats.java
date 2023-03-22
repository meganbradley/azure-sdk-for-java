// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Threats impact of the assessment. */
public final class Threats extends ExpandableStringEnum<Threats> {
    /** Static value accountBreach for Threats. */
    public static final Threats ACCOUNT_BREACH = fromString("accountBreach");

    /** Static value dataExfiltration for Threats. */
    public static final Threats DATA_EXFILTRATION = fromString("dataExfiltration");

    /** Static value dataSpillage for Threats. */
    public static final Threats DATA_SPILLAGE = fromString("dataSpillage");

    /** Static value maliciousInsider for Threats. */
    public static final Threats MALICIOUS_INSIDER = fromString("maliciousInsider");

    /** Static value elevationOfPrivilege for Threats. */
    public static final Threats ELEVATION_OF_PRIVILEGE = fromString("elevationOfPrivilege");

    /** Static value threatResistance for Threats. */
    public static final Threats THREAT_RESISTANCE = fromString("threatResistance");

    /** Static value missingCoverage for Threats. */
    public static final Threats MISSING_COVERAGE = fromString("missingCoverage");

    /** Static value denialOfService for Threats. */
    public static final Threats DENIAL_OF_SERVICE = fromString("denialOfService");

    /**
     * Creates a new instance of Threats value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Threats() {
    }

    /**
     * Creates or finds a Threats from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Threats.
     */
    @JsonCreator
    public static Threats fromString(String name) {
        return fromString(name, Threats.class);
    }

    /**
     * Gets known Threats values.
     *
     * @return known Threats values.
     */
    public static Collection<Threats> values() {
        return values(Threats.class);
    }
}
