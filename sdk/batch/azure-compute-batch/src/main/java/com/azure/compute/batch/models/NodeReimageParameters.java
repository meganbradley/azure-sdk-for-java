// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Options for reimaging a Compute Node. */
@Fluent
public final class NodeReimageParameters {

    /*
     * The default value is requeue.
     */
    @Generated
    @JsonProperty(value = "nodeReimageOption")
    private BatchNodeReimageOption nodeReimageOption;

    /** Creates an instance of NodeReimageParameters class. */
    @Generated
    public NodeReimageParameters() {}

    /**
     * Get the nodeReimageOption property: The default value is requeue.
     *
     * @return the nodeReimageOption value.
     */
    @Generated
    public BatchNodeReimageOption getNodeReimageOption() {
        return this.nodeReimageOption;
    }

    /**
     * Set the nodeReimageOption property: The default value is requeue.
     *
     * @param nodeReimageOption the nodeReimageOption value to set.
     * @return the NodeReimageParameters object itself.
     */
    @Generated
    public NodeReimageParameters setNodeReimageOption(BatchNodeReimageOption nodeReimageOption) {
        this.nodeReimageOption = nodeReimageOption;
        return this;
    }
}
