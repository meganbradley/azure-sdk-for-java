// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Egress NAT.
 */
public final class EgressNat extends ExpandableStringEnum<EgressNat> {
    /**
     * Static value DISABLED for EgressNat.
     */
    public static final EgressNat DISABLED = fromString("DISABLED");

    /**
     * Static value ENABLED for EgressNat.
     */
    public static final EgressNat ENABLED = fromString("ENABLED");

    /**
     * Creates a new instance of EgressNat value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EgressNat() {
    }

    /**
     * Creates or finds a EgressNat from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EgressNat.
     */
    @JsonCreator
    public static EgressNat fromString(String name) {
        return fromString(name, EgressNat.class);
    }

    /**
     * Gets known EgressNat values.
     * 
     * @return known EgressNat values.
     */
    public static Collection<EgressNat> values() {
        return values(EgressNat.class);
    }
}
