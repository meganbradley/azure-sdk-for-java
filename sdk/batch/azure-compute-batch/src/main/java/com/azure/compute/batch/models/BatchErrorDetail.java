// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An item of additional information included in an Azure Batch error response.
 */
@Immutable
public final class BatchErrorDetail {

    /*
     * An identifier specifying the meaning of the Value property.
     */
    @Generated
    @JsonProperty(value = "key")
    private String key;

    /*
     * The additional information included with the error response.
     */
    @Generated
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of BatchErrorDetail class.
     */
    @Generated
    private BatchErrorDetail() {
    }

    /**
     * Get the key property: An identifier specifying the meaning of the Value property.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the value property: The additional information included with the error response.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }
}
