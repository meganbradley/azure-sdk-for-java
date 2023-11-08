// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ValidateResult model. */
@Immutable
public final class ValidateResult {

    /*
     * This is the top-level error object whose code matches the x-ms-error-code response header.
     */
    @Generated
    @JsonProperty(value = "error")
    private ErrorDetail error;

    /** Creates an instance of ValidateResult class. */
    @Generated
    private ValidateResult() {}

    /**
     * Get the error property: This is the top-level error object whose code matches the x-ms-error-code response
     * header.
     *
     * @return the error value.
     */
    @Generated
    public ErrorDetail getError() {
        return this.error;
    }
}
