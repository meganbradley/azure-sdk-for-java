// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContinuousDtmfRecognitionRequestInternal model. */
@Fluent
public final class ContinuousDtmfRecognitionRequestInternal {
    /*
     * Defines options for recognition.
     */
    @JsonProperty(value = "targetParticipant", required = true)
    private CommunicationIdentifierModel targetParticipant;

    /*
     * The value to identify context of the operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /** Creates an instance of ContinuousDtmfRecognitionRequestInternal class. */
    public ContinuousDtmfRecognitionRequestInternal() {}

    /**
     * Get the targetParticipant property: Defines options for recognition.
     *
     * @return the targetParticipant value.
     */
    public CommunicationIdentifierModel getTargetParticipant() {
        return this.targetParticipant;
    }

    /**
     * Set the targetParticipant property: Defines options for recognition.
     *
     * @param targetParticipant the targetParticipant value to set.
     * @return the ContinuousDtmfRecognitionRequestInternal object itself.
     */
    public ContinuousDtmfRecognitionRequestInternal setTargetParticipant(
            CommunicationIdentifierModel targetParticipant) {
        this.targetParticipant = targetParticipant;
        return this;
    }

    /**
     * Get the operationContext property: The value to identify context of the operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The value to identify context of the operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the ContinuousDtmfRecognitionRequestInternal object itself.
     */
    public ContinuousDtmfRecognitionRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
