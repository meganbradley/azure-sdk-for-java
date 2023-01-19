// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.vmwarecloudsimple.models.AvailableOperationDisplayPropertyServiceSpecificationMetricsList;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Available operation display property service specification model. */
@Fluent
public final class AvailableOperationDisplayPropertyServiceSpecification {
    /*
     * The list of specification's service metrics
     */
    @JsonProperty(value = "serviceSpecification")
    private AvailableOperationDisplayPropertyServiceSpecificationMetricsList serviceSpecification;

    /** Creates an instance of AvailableOperationDisplayPropertyServiceSpecification class. */
    public AvailableOperationDisplayPropertyServiceSpecification() {
    }

    /**
     * Get the serviceSpecification property: The list of specification's service metrics.
     *
     * @return the serviceSpecification value.
     */
    public AvailableOperationDisplayPropertyServiceSpecificationMetricsList serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: The list of specification's service metrics.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the AvailableOperationDisplayPropertyServiceSpecification object itself.
     */
    public AvailableOperationDisplayPropertyServiceSpecification withServiceSpecification(
        AvailableOperationDisplayPropertyServiceSpecificationMetricsList serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}
