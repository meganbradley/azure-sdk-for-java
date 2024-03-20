// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Microsoft Defender for Server VM scanning configuration.
 */
@Fluent
public final class DefenderCspmGcpOfferingVmScanners {
    /*
     * Is Microsoft Defender for Server VM scanning enabled
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * configuration for Microsoft Defender for Server VM scanning
     */
    @JsonProperty(value = "configuration")
    private DefenderCspmGcpOfferingVmScannersConfiguration configuration;

    /**
     * Creates an instance of DefenderCspmGcpOfferingVmScanners class.
     */
    public DefenderCspmGcpOfferingVmScanners() {
    }

    /**
     * Get the enabled property: Is Microsoft Defender for Server VM scanning enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is Microsoft Defender for Server VM scanning enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the DefenderCspmGcpOfferingVmScanners object itself.
     */
    public DefenderCspmGcpOfferingVmScanners withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the configuration property: configuration for Microsoft Defender for Server VM scanning.
     * 
     * @return the configuration value.
     */
    public DefenderCspmGcpOfferingVmScannersConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: configuration for Microsoft Defender for Server VM scanning.
     * 
     * @param configuration the configuration value to set.
     * @return the DefenderCspmGcpOfferingVmScanners object itself.
     */
    public DefenderCspmGcpOfferingVmScanners
        withConfiguration(DefenderCspmGcpOfferingVmScannersConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
    }
}
