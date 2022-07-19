// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Appliances operation. */
@Fluent
public final class ApplianceOperationInner {
    /*
     * Describes the properties of an Appliances Operation Value Display.
     */
    @JsonProperty(value = "display")
    private ApplianceOperationValueDisplay innerDisplay;

    /*
     * Is this Operation a data plane operation
     */
    @JsonProperty(value = "isDataAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDataAction;

    /*
     * The name of the compute operation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The origin of the compute operation.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /**
     * Get the innerDisplay property: Describes the properties of an Appliances Operation Value Display.
     *
     * @return the innerDisplay value.
     */
    private ApplianceOperationValueDisplay innerDisplay() {
        return this.innerDisplay;
    }

    /**
     * Get the isDataAction property: Is this Operation a data plane operation.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Get the name property: The name of the compute operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the origin property: The origin of the compute operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the description property: The description of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerDisplay() == null ? null : this.innerDisplay().description();
    }

    /**
     * Get the operation property: The display name of the compute operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.innerDisplay() == null ? null : this.innerDisplay().operation();
    }

    /**
     * Get the provider property: The resource provider for the operation.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.innerDisplay() == null ? null : this.innerDisplay().provider();
    }

    /**
     * Get the resource property: The display name of the resource the operation applies to.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.innerDisplay() == null ? null : this.innerDisplay().resource();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerDisplay() != null) {
            innerDisplay().validate();
        }
    }
}
