// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.workloads.models.ProviderInstancePropertiesErrors;
import com.azure.resourcemanager.workloads.models.ProviderSpecificProperties;
import com.azure.resourcemanager.workloads.models.WorkloadMonitorProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a provider instance. */
@Fluent
public final class ProviderInstanceProperties {
    /*
     * State of provisioning of the provider instance
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkloadMonitorProvisioningState provisioningState;

    /*
     * Defines the provider instance errors.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private ProviderInstancePropertiesErrors errors;

    /*
     * Defines the provider instance errors.
     */
    @JsonProperty(value = "providerSettings")
    private ProviderSpecificProperties providerSettings;

    /**
     * Get the provisioningState property: State of provisioning of the provider instance.
     *
     * @return the provisioningState value.
     */
    public WorkloadMonitorProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the errors property: Defines the provider instance errors.
     *
     * @return the errors value.
     */
    public ProviderInstancePropertiesErrors errors() {
        return this.errors;
    }

    /**
     * Get the providerSettings property: Defines the provider instance errors.
     *
     * @return the providerSettings value.
     */
    public ProviderSpecificProperties providerSettings() {
        return this.providerSettings;
    }

    /**
     * Set the providerSettings property: Defines the provider instance errors.
     *
     * @param providerSettings the providerSettings value to set.
     * @return the ProviderInstanceProperties object itself.
     */
    public ProviderInstanceProperties withProviderSettings(ProviderSpecificProperties providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().validate();
        }
        if (providerSettings() != null) {
            providerSettings().validate();
        }
    }
}
