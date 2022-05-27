// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource requirements for each container instance within an online deployment. */
@Fluent
public final class ContainerResourceRequirements {
    /*
     * Container resource limit info:
     */
    @JsonProperty(value = "containerResourceLimits")
    private ContainerResourceSettings containerResourceLimits;

    /*
     * Container resource request info:
     */
    @JsonProperty(value = "containerResourceRequests")
    private ContainerResourceSettings containerResourceRequests;

    /**
     * Get the containerResourceLimits property: Container resource limit info:.
     *
     * @return the containerResourceLimits value.
     */
    public ContainerResourceSettings containerResourceLimits() {
        return this.containerResourceLimits;
    }

    /**
     * Set the containerResourceLimits property: Container resource limit info:.
     *
     * @param containerResourceLimits the containerResourceLimits value to set.
     * @return the ContainerResourceRequirements object itself.
     */
    public ContainerResourceRequirements withContainerResourceLimits(
        ContainerResourceSettings containerResourceLimits) {
        this.containerResourceLimits = containerResourceLimits;
        return this;
    }

    /**
     * Get the containerResourceRequests property: Container resource request info:.
     *
     * @return the containerResourceRequests value.
     */
    public ContainerResourceSettings containerResourceRequests() {
        return this.containerResourceRequests;
    }

    /**
     * Set the containerResourceRequests property: Container resource request info:.
     *
     * @param containerResourceRequests the containerResourceRequests value to set.
     * @return the ContainerResourceRequirements object itself.
     */
    public ContainerResourceRequirements withContainerResourceRequests(
        ContainerResourceSettings containerResourceRequests) {
        this.containerResourceRequests = containerResourceRequests;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerResourceLimits() != null) {
            containerResourceLimits().validate();
        }
        if (containerResourceRequests() != null) {
            containerResourceRequests().validate();
        }
    }
}
