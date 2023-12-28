// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vpn Client Parameters for package generation.
 */
@Fluent
public final class P2SVpnProfileParameters {
    /*
     * VPN client authentication method.
     */
    @JsonProperty(value = "authenticationMethod")
    private AuthenticationMethod authenticationMethod;

    /**
     * Creates an instance of P2SVpnProfileParameters class.
     */
    public P2SVpnProfileParameters() {
    }

    /**
     * Get the authenticationMethod property: VPN client authentication method.
     * 
     * @return the authenticationMethod value.
     */
    public AuthenticationMethod authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set the authenticationMethod property: VPN client authentication method.
     * 
     * @param authenticationMethod the authenticationMethod value to set.
     * @return the P2SVpnProfileParameters object itself.
     */
    public P2SVpnProfileParameters withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
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
