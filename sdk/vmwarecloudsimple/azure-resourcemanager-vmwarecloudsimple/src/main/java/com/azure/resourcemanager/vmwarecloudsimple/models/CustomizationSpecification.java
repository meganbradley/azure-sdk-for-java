// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The specification for Customization Policy. */
@Fluent
public final class CustomizationSpecification {
    /*
     * Customization Identity. It contains data about user and hostname
     */
    @JsonProperty(value = "identity")
    private CustomizationIdentity identity;

    /*
     * Network interface settings
     */
    @JsonProperty(value = "nicSettings")
    private List<CustomizationNicSetting> nicSettings;

    /** Creates an instance of CustomizationSpecification class. */
    public CustomizationSpecification() {
    }

    /**
     * Get the identity property: Customization Identity. It contains data about user and hostname.
     *
     * @return the identity value.
     */
    public CustomizationIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Customization Identity. It contains data about user and hostname.
     *
     * @param identity the identity value to set.
     * @return the CustomizationSpecification object itself.
     */
    public CustomizationSpecification withIdentity(CustomizationIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the nicSettings property: Network interface settings.
     *
     * @return the nicSettings value.
     */
    public List<CustomizationNicSetting> nicSettings() {
        return this.nicSettings;
    }

    /**
     * Set the nicSettings property: Network interface settings.
     *
     * @param nicSettings the nicSettings value to set.
     * @return the CustomizationSpecification object itself.
     */
    public CustomizationSpecification withNicSettings(List<CustomizationNicSetting> nicSettings) {
        this.nicSettings = nicSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (nicSettings() != null) {
            nicSettings().forEach(e -> e.validate());
        }
    }
}
