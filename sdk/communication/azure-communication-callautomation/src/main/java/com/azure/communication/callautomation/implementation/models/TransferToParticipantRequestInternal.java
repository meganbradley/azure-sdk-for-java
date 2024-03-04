// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for transferring call to a participant. */
@Fluent
public final class TransferToParticipantRequestInternal {
    /*
     * The identity of the target where call should be transferred to.
     */
    @JsonProperty(value = "targetParticipant", required = true)
    private CommunicationIdentifierModel targetParticipant;

    /*
     * Used by customers when calling mid-call actions to correlate the request
     * to the response event.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * Transferee is the participant who is transferred away.
     */
    @JsonProperty(value = "transferee")
    private CommunicationIdentifierModel transferee;

    /*
     * Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation.
     * This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     */
    @JsonProperty(value = "operationCallbackUri")
    private String operationCallbackUri;

    /*
     * Used by customer to send custom calling context to targets
     */
    @JsonProperty(value = "customCallingContext")
    private CustomCallingContext customCallingContext;

    /**
     * Get the targetParticipant property: The identity of the target where call should be transferred to.
     *
     * @return the targetParticipant value.
     */
    public CommunicationIdentifierModel getTargetParticipant() {
        return this.targetParticipant;
    }

    /**
     * Set the targetParticipant property: The identity of the target where call should be transferred to.
     *
     * @param targetParticipant the targetParticipant value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setTargetParticipant(CommunicationIdentifierModel targetParticipant) {
        this.targetParticipant = targetParticipant;
        return this;
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @param operationContext the operationContext value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the transferee property: Transferee is the participant who is transferred away.
     *
     * @return the transferee value.
     */
    public CommunicationIdentifierModel getTransferee() {
        return this.transferee;
    }

    /**
     * Set the transferee property: Transferee is the participant who is transferred away.
     *
     * @param transferee the transferee value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setTransferee(CommunicationIdentifierModel transferee) {
        this.transferee = transferee;
        return this;
    }

    /**
     * Get the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation. This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     *
     * @return the operationCallbackUri value.
     */
    public String getOperationCallbackUri() {
        return this.operationCallbackUri;
    }

    /**
     * Set the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation. This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     *
     * @param operationCallbackUri the operationCallbackUri value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setOperationCallbackUri(String operationCallbackUri) {
        this.operationCallbackUri = operationCallbackUri;
        return this;
    }

    /**
     * Get the customCallingContext property: Used by customer to send custom calling context to targets.
     *
     * @return the customCallingContext value.
     */
    public CustomCallingContext getCustomCallingContext() {
        return this.customCallingContext;
    }

    /**
     * Set the customCallingContext property: Used by customer to send custom calling context to targets.
     *
     * @param customCallingContext the customCallingContext value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setCustomCallingContext(CustomCallingContext customCallingContext) {
        this.customCallingContext = customCallingContext;
        return this;
    }
}
