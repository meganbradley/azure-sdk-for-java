// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OIDC issuer profile of the Managed Cluster.
 */
@Fluent
public final class ManagedClusterOidcIssuerProfile {
    /*
     * The OIDC issuer url of the Managed Cluster.
     */
    @JsonProperty(value = "issuerURL", access = JsonProperty.Access.WRITE_ONLY)
    private String issuerUrl;

    /*
     * Whether the OIDC issuer is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Creates an instance of ManagedClusterOidcIssuerProfile class.
     */
    public ManagedClusterOidcIssuerProfile() {
    }

    /**
     * Get the issuerUrl property: The OIDC issuer url of the Managed Cluster.
     * 
     * @return the issuerUrl value.
     */
    public String issuerUrl() {
        return this.issuerUrl;
    }

    /**
     * Get the enabled property: Whether the OIDC issuer is enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the OIDC issuer is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the ManagedClusterOidcIssuerProfile object itself.
     */
    public ManagedClusterOidcIssuerProfile withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
