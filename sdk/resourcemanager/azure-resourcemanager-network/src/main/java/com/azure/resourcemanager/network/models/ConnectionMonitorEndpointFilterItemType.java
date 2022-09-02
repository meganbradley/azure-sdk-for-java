// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of item included in the filter. Currently only 'AgentAddress' is supported. */
public final class ConnectionMonitorEndpointFilterItemType
    extends ExpandableStringEnum<ConnectionMonitorEndpointFilterItemType> {
    /** Static value AgentAddress for ConnectionMonitorEndpointFilterItemType. */
    public static final ConnectionMonitorEndpointFilterItemType AGENT_ADDRESS = fromString("AgentAddress");

    /**
     * Creates or finds a ConnectionMonitorEndpointFilterItemType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionMonitorEndpointFilterItemType.
     */
    @JsonCreator
    public static ConnectionMonitorEndpointFilterItemType fromString(String name) {
        return fromString(name, ConnectionMonitorEndpointFilterItemType.class);
    }

    /**
     * Gets known ConnectionMonitorEndpointFilterItemType values.
     *
     * @return known ConnectionMonitorEndpointFilterItemType values.
     */
    public static Collection<ConnectionMonitorEndpointFilterItemType> values() {
        return values(ConnectionMonitorEndpointFilterItemType.class);
    }
}
