// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the DDoS protection settings of the public IP. */
@Fluent
public final class DdosSettings {
    /*
     * The DDoS custom policy associated with the public IP.
     */
    @JsonProperty(value = "ddosCustomPolicy")
    private SubResource ddosCustomPolicy;

    /*
     * The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be
     * customized.
     */
    @JsonProperty(value = "protectionCoverage")
    private DdosSettingsProtectionCoverage protectionCoverage;

    /*
     * Enables DDoS protection on the public IP.
     */
    @JsonProperty(value = "protectedIP")
    private Boolean protectedIp;

    /**
     * Get the ddosCustomPolicy property: The DDoS custom policy associated with the public IP.
     *
     * @return the ddosCustomPolicy value.
     */
    public SubResource ddosCustomPolicy() {
        return this.ddosCustomPolicy;
    }

    /**
     * Set the ddosCustomPolicy property: The DDoS custom policy associated with the public IP.
     *
     * @param ddosCustomPolicy the ddosCustomPolicy value to set.
     * @return the DdosSettings object itself.
     */
    public DdosSettings withDdosCustomPolicy(SubResource ddosCustomPolicy) {
        this.ddosCustomPolicy = ddosCustomPolicy;
        return this;
    }

    /**
     * Get the protectionCoverage property: The DDoS protection policy customizability of the public IP. Only standard
     * coverage will have the ability to be customized.
     *
     * @return the protectionCoverage value.
     */
    public DdosSettingsProtectionCoverage protectionCoverage() {
        return this.protectionCoverage;
    }

    /**
     * Set the protectionCoverage property: The DDoS protection policy customizability of the public IP. Only standard
     * coverage will have the ability to be customized.
     *
     * @param protectionCoverage the protectionCoverage value to set.
     * @return the DdosSettings object itself.
     */
    public DdosSettings withProtectionCoverage(DdosSettingsProtectionCoverage protectionCoverage) {
        this.protectionCoverage = protectionCoverage;
        return this;
    }

    /**
     * Get the protectedIp property: Enables DDoS protection on the public IP.
     *
     * @return the protectedIp value.
     */
    public Boolean protectedIp() {
        return this.protectedIp;
    }

    /**
     * Set the protectedIp property: Enables DDoS protection on the public IP.
     *
     * @param protectedIp the protectedIp value to set.
     * @return the DdosSettings object itself.
     */
    public DdosSettings withProtectedIp(Boolean protectedIp) {
        this.protectedIp = protectedIp;
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
