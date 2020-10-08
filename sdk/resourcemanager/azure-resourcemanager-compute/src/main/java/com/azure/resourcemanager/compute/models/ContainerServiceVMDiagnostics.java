// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for diagnostics on the container service VMs. */
@Fluent
public final class ContainerServiceVMDiagnostics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceVMDiagnostics.class);

    /*
     * Whether the VM diagnostic agent is provisioned on the VM.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The URI of the storage account where diagnostics are stored.
     */
    @JsonProperty(value = "storageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String storageUri;

    /**
     * Get the enabled property: Whether the VM diagnostic agent is provisioned on the VM.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the VM diagnostic agent is provisioned on the VM.
     *
     * @param enabled the enabled value to set.
     * @return the ContainerServiceVMDiagnostics object itself.
     */
    public ContainerServiceVMDiagnostics withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the storageUri property: The URI of the storage account where diagnostics are stored.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
