// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network ACLs for the resource. */
@Fluent
public final class WebPubSubNetworkACLs {
    /*
     * Azure Networking ACL Action.
     */
    @JsonProperty(value = "defaultAction")
    private AclAction defaultAction;

    /*
     * Network ACL
     */
    @JsonProperty(value = "publicNetwork")
    private NetworkAcl publicNetwork;

    /*
     * ACLs for requests from private endpoints
     */
    @JsonProperty(value = "privateEndpoints")
    private List<PrivateEndpointAcl> privateEndpoints;

    /*
     * IP rules for filtering public traffic
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /** Creates an instance of WebPubSubNetworkACLs class. */
    public WebPubSubNetworkACLs() {
    }

    /**
     * Get the defaultAction property: Azure Networking ACL Action.
     *
     * @return the defaultAction value.
     */
    public AclAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: Azure Networking ACL Action.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the WebPubSubNetworkACLs object itself.
     */
    public WebPubSubNetworkACLs withDefaultAction(AclAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the publicNetwork property: Network ACL.
     *
     * @return the publicNetwork value.
     */
    public NetworkAcl publicNetwork() {
        return this.publicNetwork;
    }

    /**
     * Set the publicNetwork property: Network ACL.
     *
     * @param publicNetwork the publicNetwork value to set.
     * @return the WebPubSubNetworkACLs object itself.
     */
    public WebPubSubNetworkACLs withPublicNetwork(NetworkAcl publicNetwork) {
        this.publicNetwork = publicNetwork;
        return this;
    }

    /**
     * Get the privateEndpoints property: ACLs for requests from private endpoints.
     *
     * @return the privateEndpoints value.
     */
    public List<PrivateEndpointAcl> privateEndpoints() {
        return this.privateEndpoints;
    }

    /**
     * Set the privateEndpoints property: ACLs for requests from private endpoints.
     *
     * @param privateEndpoints the privateEndpoints value to set.
     * @return the WebPubSubNetworkACLs object itself.
     */
    public WebPubSubNetworkACLs withPrivateEndpoints(List<PrivateEndpointAcl> privateEndpoints) {
        this.privateEndpoints = privateEndpoints;
        return this;
    }

    /**
     * Get the ipRules property: IP rules for filtering public traffic.
     *
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: IP rules for filtering public traffic.
     *
     * @param ipRules the ipRules value to set.
     * @return the WebPubSubNetworkACLs object itself.
     */
    public WebPubSubNetworkACLs withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicNetwork() != null) {
            publicNetwork().validate();
        }
        if (privateEndpoints() != null) {
            privateEndpoints().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
    }
}
