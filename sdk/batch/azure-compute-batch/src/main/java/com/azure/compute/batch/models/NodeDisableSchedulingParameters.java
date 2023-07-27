// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Options for disabling scheduling on a Compute Node. */
@Fluent
public final class NodeDisableSchedulingParameters {

    /*
     * The default value is requeue.
     */
    @Generated
    @JsonProperty(value = "nodeDisableSchedulingOption")
    private DisableBatchNodeSchedulingOption nodeDisableSchedulingOption;

    /** Creates an instance of NodeDisableSchedulingParameters class. */
    @Generated
    public NodeDisableSchedulingParameters() {}

    /**
     * Get the nodeDisableSchedulingOption property: The default value is requeue.
     *
     * @return the nodeDisableSchedulingOption value.
     */
    @Generated
    public DisableBatchNodeSchedulingOption getNodeDisableSchedulingOption() {
        return this.nodeDisableSchedulingOption;
    }

    /**
     * Set the nodeDisableSchedulingOption property: The default value is requeue.
     *
     * @param nodeDisableSchedulingOption the nodeDisableSchedulingOption value to set.
     * @return the NodeDisableSchedulingParameters object itself.
     */
    @Generated
    public NodeDisableSchedulingParameters setNodeDisableSchedulingOption(
            DisableBatchNodeSchedulingOption nodeDisableSchedulingOption) {
        this.nodeDisableSchedulingOption = nodeDisableSchedulingOption;
        return this;
    }
}
