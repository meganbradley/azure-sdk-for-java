// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Required inbound or outbound traffic for Azure Spring Apps resource.
 */
@Immutable
public final class RequiredTraffic {
    /*
     * The protocol of required traffic
     */
    @JsonProperty(value = "protocol", access = JsonProperty.Access.WRITE_ONLY)
    private String protocol;

    /*
     * The port of required traffic
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /*
     * The ip list of required traffic
     */
    @JsonProperty(value = "ips", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> ips;

    /*
     * The FQDN list of required traffic
     */
    @JsonProperty(value = "fqdns", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> fqdns;

    /*
     * The direction of required traffic
     */
    @JsonProperty(value = "direction", access = JsonProperty.Access.WRITE_ONLY)
    private TrafficDirection direction;

    /**
     * Creates an instance of RequiredTraffic class.
     */
    public RequiredTraffic() {
    }

    /**
     * Get the protocol property: The protocol of required traffic.
     * 
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Get the port property: The port of required traffic.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Get the ips property: The ip list of required traffic.
     * 
     * @return the ips value.
     */
    public List<String> ips() {
        return this.ips;
    }

    /**
     * Get the fqdns property: The FQDN list of required traffic.
     * 
     * @return the fqdns value.
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Get the direction property: The direction of required traffic.
     * 
     * @return the direction value.
     */
    public TrafficDirection direction() {
        return this.direction;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
