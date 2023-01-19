// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Customization Specification ip type. */
public final class CustomizationIpAddressType extends ExpandableStringEnum<CustomizationIpAddressType> {
    /** Static value CUSTOM for CustomizationIpAddressType. */
    public static final CustomizationIpAddressType CUSTOM = fromString("CUSTOM");

    /** Static value DHCP_IP for CustomizationIpAddressType. */
    public static final CustomizationIpAddressType DHCP_IP = fromString("DHCP_IP");

    /** Static value FIXED_IP for CustomizationIpAddressType. */
    public static final CustomizationIpAddressType FIXED_IP = fromString("FIXED_IP");

    /** Static value USER_DEFINED for CustomizationIpAddressType. */
    public static final CustomizationIpAddressType USER_DEFINED = fromString("USER_DEFINED");

    /**
     * Creates a new instance of CustomizationIpAddressType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomizationIpAddressType() {
    }

    /**
     * Creates or finds a CustomizationIpAddressType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomizationIpAddressType.
     */
    @JsonCreator
    public static CustomizationIpAddressType fromString(String name) {
        return fromString(name, CustomizationIpAddressType.class);
    }

    /**
     * Gets known CustomizationIpAddressType values.
     *
     * @return known CustomizationIpAddressType values.
     */
    public static Collection<CustomizationIpAddressType> values() {
        return values(CustomizationIpAddressType.class);
    }
}
