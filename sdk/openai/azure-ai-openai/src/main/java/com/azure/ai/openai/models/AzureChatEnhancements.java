// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the output results of Azure enhancements to chat completions, as configured via the matching input
 * provided
 * in the request.
 */
@Immutable
public final class AzureChatEnhancements {

    /*
     * The grounding enhancement that returns the bounding box of the objects detected in the image.
     */
    @Generated
    @JsonProperty(value = "grounding")
    private AzureGroundingEnhancement grounding;

    /**
     * Creates an instance of AzureChatEnhancements class.
     */
    @Generated
    private AzureChatEnhancements() {
    }

    /**
     * Get the grounding property: The grounding enhancement that returns the bounding box of the objects detected in
     * the image.
     *
     * @return the grounding value.
     */
    @Generated
    public AzureGroundingEnhancement getGrounding() {
        return this.grounding;
    }
}
