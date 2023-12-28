// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List VM scale set extension operation response.
 */
@Fluent
public final class VirtualMachineScaleSetExtensionListResult {
    /*
     * The list of VM scale set extensions.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineScaleSetExtensionInner> value;

    /*
     * The uri to fetch the next page of VM scale set extensions. Call ListNext() with this to fetch the next page of
     * VM scale set extensions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of VirtualMachineScaleSetExtensionListResult class.
     */
    public VirtualMachineScaleSetExtensionListResult() {
    }

    /**
     * Get the value property: The list of VM scale set extensions.
     * 
     * @return the value value.
     */
    public List<VirtualMachineScaleSetExtensionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of VM scale set extensions.
     * 
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetExtensionListResult object itself.
     */
    public VirtualMachineScaleSetExtensionListResult withValue(List<VirtualMachineScaleSetExtensionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of VM scale set extensions. Call ListNext() with this
     * to fetch the next page of VM scale set extensions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of VM scale set extensions. Call ListNext() with this
     * to fetch the next page of VM scale set extensions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetExtensionListResult object itself.
     */
    public VirtualMachineScaleSetExtensionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property value in model VirtualMachineScaleSetExtensionListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetExtensionListResult.class);
}
