// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models.channels;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The template bindings component for WhatsApp.
 */
@Immutable
public final class WhatsAppMessageTemplateBindingsComponent {

    /*
     * The name of the referenced item in the template values.
     */
    @Generated
    @JsonProperty(value = "refValue")
    private String refValue;

    /**
     * Creates an instance of WhatsAppMessageTemplateBindingsComponent class.
     *
     * @param refValue the refValue value to set.
     */
    @Generated
    @JsonCreator
    public WhatsAppMessageTemplateBindingsComponent(@JsonProperty(value = "refValue") String refValue) {
        this.refValue = refValue;
    }

    /**
     * Get the refValue property: The name of the referenced item in the template values.
     *
     * @return the refValue value.
     */
    @Generated
    public String getRefValue() {
        return this.refValue;
    }
}
