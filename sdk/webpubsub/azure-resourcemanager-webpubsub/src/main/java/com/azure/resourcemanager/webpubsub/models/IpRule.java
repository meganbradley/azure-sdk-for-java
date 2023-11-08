// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An IP rule. */
@Fluent
public final class IpRule {
    /*
     * An IP or CIDR or ServiceTag
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Azure Networking ACL Action.
     */
    @JsonProperty(value = "action")
    private AclAction action;

    /** Creates an instance of IpRule class. */
    public IpRule() {
    }

    /**
     * Get the value property: An IP or CIDR or ServiceTag.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: An IP or CIDR or ServiceTag.
     *
     * @param value the value value to set.
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the action property: Azure Networking ACL Action.
     *
     * @return the action value.
     */
    public AclAction action() {
        return this.action;
    }

    /**
     * Set the action property: Azure Networking ACL Action.
     *
     * @param action the action value to set.
     * @return the IpRule object itself.
     */
    public IpRule withAction(AclAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
