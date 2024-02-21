// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration needed to perform TLS termination &amp; initiation.
 */
@Fluent
public final class FirewallPolicyTransportSecurity {
    /*
     * The CA used for intermediate CA generation.
     */
    @JsonProperty(value = "certificateAuthority")
    private FirewallPolicyCertificateAuthority certificateAuthority;

    /**
     * Creates an instance of FirewallPolicyTransportSecurity class.
     */
    public FirewallPolicyTransportSecurity() {
    }

    /**
     * Get the certificateAuthority property: The CA used for intermediate CA generation.
     * 
     * @return the certificateAuthority value.
     */
    public FirewallPolicyCertificateAuthority certificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Set the certificateAuthority property: The CA used for intermediate CA generation.
     * 
     * @param certificateAuthority the certificateAuthority value to set.
     * @return the FirewallPolicyTransportSecurity object itself.
     */
    public FirewallPolicyTransportSecurity
        withCertificateAuthority(FirewallPolicyCertificateAuthority certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateAuthority() != null) {
            certificateAuthority().validate();
        }
    }
}
