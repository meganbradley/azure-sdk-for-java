// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.models.CatalogResourceValidationStatus;
import com.azure.resourcemanager.devcenter.models.CustomizationTaskInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents a Task to be used in customizing a Dev Box. */
@Immutable
public final class CustomizationTaskInner extends ProxyResource {
    /*
     * Task properties
     */
    @JsonProperty(value = "properties")
    private CustomizationTaskProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CustomizationTaskInner class. */
    public CustomizationTaskInner() {
    }

    /**
     * Get the innerProperties property: Task properties.
     *
     * @return the innerProperties value.
     */
    private CustomizationTaskProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the inputs property: Inputs to the task.
     *
     * @return the inputs value.
     */
    public Map<String, CustomizationTaskInput> inputs() {
        return this.innerProperties() == null ? null : this.innerProperties().inputs();
    }

    /**
     * Get the timeout property: The default timeout for the task.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.innerProperties() == null ? null : this.innerProperties().timeout();
    }

    /**
     * Get the validationStatus property: Validation status for the Task.
     *
     * @return the validationStatus value.
     */
    public CatalogResourceValidationStatus validationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().validationStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
