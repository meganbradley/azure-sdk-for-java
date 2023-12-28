// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Action to perform based on the match or no match of the IpMask.
 */
public final class IpActionType extends ExpandableStringEnum<IpActionType> {
    /**
     * Static value Allow for IpActionType.
     */
    public static final IpActionType ALLOW = fromString("Allow");

    /**
     * Creates a new instance of IpActionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpActionType() {
    }

    /**
     * Creates or finds a IpActionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IpActionType.
     */
    @JsonCreator
    public static IpActionType fromString(String name) {
        return fromString(name, IpActionType.class);
    }

    /**
     * Gets known IpActionType values.
     * 
     * @return known IpActionType values.
     */
    public static Collection<IpActionType> values() {
        return values(IpActionType.class);
    }
}
