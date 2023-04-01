// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An error message received in an Azure Batch error response. */
@Immutable
public final class ErrorMessage {
    /*
     * The language code of the error message
     */
    @JsonProperty(value = "lang")
    private String lang;

    /*
     * The text of the message.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of ErrorMessage class. */
    private ErrorMessage() {}

    /**
     * Get the lang property: The language code of the error message.
     *
     * @return the lang value.
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * Get the value property: The text of the message.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }
}
