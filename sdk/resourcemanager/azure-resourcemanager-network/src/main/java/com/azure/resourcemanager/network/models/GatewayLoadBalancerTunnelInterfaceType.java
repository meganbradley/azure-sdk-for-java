// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Traffic type of gateway load balancer tunnel interface. */
public final class GatewayLoadBalancerTunnelInterfaceType
    extends ExpandableStringEnum<GatewayLoadBalancerTunnelInterfaceType> {
    /** Static value None for GatewayLoadBalancerTunnelInterfaceType. */
    public static final GatewayLoadBalancerTunnelInterfaceType NONE = fromString("None");

    /** Static value Internal for GatewayLoadBalancerTunnelInterfaceType. */
    public static final GatewayLoadBalancerTunnelInterfaceType INTERNAL = fromString("Internal");

    /** Static value External for GatewayLoadBalancerTunnelInterfaceType. */
    public static final GatewayLoadBalancerTunnelInterfaceType EXTERNAL = fromString("External");

    /**
     * Creates or finds a GatewayLoadBalancerTunnelInterfaceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GatewayLoadBalancerTunnelInterfaceType.
     */
    @JsonCreator
    public static GatewayLoadBalancerTunnelInterfaceType fromString(String name) {
        return fromString(name, GatewayLoadBalancerTunnelInterfaceType.class);
    }

    /**
     * Gets known GatewayLoadBalancerTunnelInterfaceType values.
     *
     * @return known GatewayLoadBalancerTunnelInterfaceType values.
     */
    public static Collection<GatewayLoadBalancerTunnelInterfaceType> values() {
        return values(GatewayLoadBalancerTunnelInterfaceType.class);
    }
}
