// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The transfer call to participant request. */
@Fluent
public final class TransferToParticipantRequestInternal {
    /*
     * The identity of the target where call should be transferred to.
     */
    @JsonProperty(value = "targetParticipant", required = true)
    private CommunicationIdentifierModel targetParticipant;

    /*
     * The caller ID of the transferee when transferring to PSTN.
     */
    @JsonProperty(value = "transfereeCallerId")
    private PhoneNumberIdentifierModel transfereeCallerId;

    /*
     * The user to user information.
     */
    @JsonProperty(value = "userToUserInformation")
    private String userToUserInformation;

    /*
     * The operation context.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

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
     * Get the transfereeCallerId property: The caller ID of the transferee when transferring to PSTN.
     *
     * @return the transfereeCallerId value.
     */
    public PhoneNumberIdentifierModel getTransfereeCallerId() {
        return this.transfereeCallerId;
    }

    /**
     * Set the transfereeCallerId property: The caller ID of the transferee when transferring to PSTN.
     *
     * @param transfereeCallerId the transfereeCallerId value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setTransfereeCallerId(PhoneNumberIdentifierModel transfereeCallerId) {
        this.transfereeCallerId = transfereeCallerId;
        return this;
    }

    /**
     * Get the userToUserInformation property: The user to user information.
     *
     * @return the userToUserInformation value.
     */
    public String getUserToUserInformation() {
        return this.userToUserInformation;
    }

    /**
     * Set the userToUserInformation property: The user to user information.
     *
     * @param userToUserInformation the userToUserInformation value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setUserToUserInformation(String userToUserInformation) {
        this.userToUserInformation = userToUserInformation;
        return this;
    }

    /**
     * Get the operationContext property: The operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context.
     *
     * @param operationContext the operationContext value to set.
     * @return the TransferToParticipantRequestInternal object itself.
     */
    public TransferToParticipantRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
