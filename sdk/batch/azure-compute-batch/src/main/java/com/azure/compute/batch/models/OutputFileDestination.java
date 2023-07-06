// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The destination to which a file should be uploaded. */
@Fluent
public final class OutputFileDestination {

    /*
     * Specifies a file upload destination within an Azure blob storage container.
     */
    @JsonProperty(value = "container")
    private OutputFileBlobContainerDestination container;

    /** Creates an instance of OutputFileDestination class. */
    public OutputFileDestination() {}

    /**
     * Get the container property: Specifies a file upload destination within an Azure blob storage container.
     *
     * @return the container value.
     */
    public OutputFileBlobContainerDestination getContainer() {
        return this.container;
    }

    /**
     * Set the container property: Specifies a file upload destination within an Azure blob storage container.
     *
     * @param container the container value to set.
     * @return the OutputFileDestination object itself.
     */
    public OutputFileDestination setContainer(OutputFileBlobContainerDestination container) {
        this.container = container;
        return this;
    }
}
