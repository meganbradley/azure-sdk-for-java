// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of Azure Batch Tasks to add. */
@Immutable
public final class BatchTaskCollection {

    /*
     * The total serialized size of this collection must be less than 1MB. If it is
     * greater than 1MB (for example if each Task has 100's of resource files or
     * environment variables), the request will fail with code 'RequestBodyTooLarge'
     * and should be retried again with fewer Tasks.
     */
    @JsonProperty(value = "value", required = true)
    private List<BatchTask> value;

    /**
     * Creates an instance of BatchTaskCollection class.
     *
     * @param value the value value to set.
     */
    @JsonCreator
    public BatchTaskCollection(@JsonProperty(value = "value", required = true) List<BatchTask> value) {
        this.value = value;
    }

    /**
     * Get the value property: The total serialized size of this collection must be less than 1MB. If it is greater than
     * 1MB (for example if each Task has 100's of resource files or environment variables), the request will fail with
     * code 'RequestBodyTooLarge' and should be retried again with fewer Tasks.
     *
     * @return the value value.
     */
    public List<BatchTask> getValue() {
        return this.value;
    }
}
