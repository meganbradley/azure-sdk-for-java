// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The target VM security type.
 */
public final class SecurityType extends ExpandableStringEnum<SecurityType> {
    /**
     * Static value None for SecurityType.
     */
    public static final SecurityType NONE = fromString("None");

    /**
     * Static value TrustedLaunch for SecurityType.
     */
    public static final SecurityType TRUSTED_LAUNCH = fromString("TrustedLaunch");

    /**
     * Static value ConfidentialVM for SecurityType.
     */
    public static final SecurityType CONFIDENTIAL_VM = fromString("ConfidentialVM");

    /**
     * Creates a new instance of SecurityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecurityType() {
    }

    /**
     * Creates or finds a SecurityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SecurityType.
     */
    @JsonCreator
    public static SecurityType fromString(String name) {
        return fromString(name, SecurityType.class);
    }

    /**
     * Gets known SecurityType values.
     * 
     * @return known SecurityType values.
     */
    public static Collection<SecurityType> values() {
        return values(SecurityType.class);
    }
}
