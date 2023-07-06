// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkSecurityGroupRuleAccess. */
public final class NetworkSecurityGroupRuleAccess extends ExpandableStringEnum<NetworkSecurityGroupRuleAccess> {

    /** Allow access. */
    public static final NetworkSecurityGroupRuleAccess ALLOW = fromString("allow");

    /** Deny access. */
    public static final NetworkSecurityGroupRuleAccess DENY = fromString("deny");

    /**
     * Creates a new instance of NetworkSecurityGroupRuleAccess value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkSecurityGroupRuleAccess() {}

    /**
     * Creates or finds a NetworkSecurityGroupRuleAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkSecurityGroupRuleAccess.
     */
    @JsonCreator
    public static NetworkSecurityGroupRuleAccess fromString(String name) {
        return fromString(name, NetworkSecurityGroupRuleAccess.class);
    }

    /**
     * Gets known NetworkSecurityGroupRuleAccess values.
     *
     * @return known NetworkSecurityGroupRuleAccess values.
     */
    public static Collection<NetworkSecurityGroupRuleAccess> values() {
        return values(NetworkSecurityGroupRuleAccess.class);
    }
}
