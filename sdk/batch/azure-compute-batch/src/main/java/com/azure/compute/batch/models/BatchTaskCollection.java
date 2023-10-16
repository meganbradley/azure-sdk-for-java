// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of Azure Batch Tasks to add. */
@Immutable
public final class BatchTaskCollection {

    /*
     * The collection of Tasks to add. The maximum count of Tasks is 100. The total serialized size of this collection
     * must be less than 1MB. If it is greater than 1MB (for example if each Task has 100's of resource files or
     * environment variables), the request will fail with code 'RequestBodyTooLarge' and should be retried again with
     * fewer Tasks.
     */
    @Generated
    @JsonProperty(value = "value")
    private List<BatchTaskCreateOptions> value;

    /**
     * Creates an instance of BatchTaskCollection class.
     *
     * @param value the value value to set.
     */
    @Generated
    @JsonCreator
    public BatchTaskCollection(@JsonProperty(value = "value") List<BatchTaskCreateOptions> value) {
        this.value = value;
    }

    /**
     * Get the value property: The collection of Tasks to add. The maximum count of Tasks is 100. The total serialized
     * size of this collection must be less than 1MB. If it is greater than 1MB (for example if each Task has 100's of
     * resource files or environment variables), the request will fail with code 'RequestBodyTooLarge' and should be
     * retried again with fewer Tasks.
     *
     * @return the value value.
     */
    @Generated
    public List<BatchTaskCreateOptions> getValue() {
        return this.value;
    }
}
