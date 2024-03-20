// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models.channels;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The template bindings component button for WhatsApp.
 */
@Immutable
public final class WhatsAppMessageTemplateBindingsButton {

    /*
     * The WhatsApp button sub type
     */
    @Generated
    @JsonProperty(value = "subType")
    private WhatsAppMessageButtonSubType subType;

    /*
     * The name of the referenced item in the template values.
     */
    @Generated
    @JsonProperty(value = "refValue")
    private String refValue;

    /**
     * Creates an instance of WhatsAppMessageTemplateBindingsButton class.
     *
     * @param subType the subType value to set.
     * @param refValue the refValue value to set.
     */
    @Generated
    @JsonCreator
    public WhatsAppMessageTemplateBindingsButton(@JsonProperty(value = "subType") WhatsAppMessageButtonSubType subType,
        @JsonProperty(value = "refValue") String refValue) {
        this.subType = subType;
        this.refValue = refValue;
    }

    /**
     * Get the subType property: The WhatsApp button sub type.
     *
     * @return the subType value.
     */
    @Generated
    public WhatsAppMessageButtonSubType getSubType() {
        return this.subType;
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
