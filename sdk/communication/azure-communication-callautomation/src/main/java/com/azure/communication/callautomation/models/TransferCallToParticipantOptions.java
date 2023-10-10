// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.MicrosoftTeamsUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.annotation.Fluent;

/**
 * The options for adding participants.
 */
@Fluent
public final class TransferCallToParticipantOptions {

    private final CommunicationIdentifier targetParticipant;

    private String overrideCallbackUrl;

    /**
     *  Participant being transferred away
     */
    private CommunicationIdentifier transferee;



    /**
     * The operational context
     */
    private String operationContext;


    /**
     * Constructor
     *
     * @param targetParticipant {@link CommunicationIdentifier}contains information for TranferTarget.
     */
    public TransferCallToParticipantOptions(CommunicationIdentifier targetParticipant) {
        this.targetParticipant = targetParticipant;
    }

    /**
     * Constructor
     *
     * @param targetParticipant {@link CommunicationUserIdentifier}contains information for TranferTarget.
     */
    public TransferCallToParticipantOptions(CommunicationUserIdentifier targetParticipant) {
        this.targetParticipant = targetParticipant;
    }

    /**
     * Constructor
     *
     * @param targetParticipant {@link PhoneNumberIdentifier}contains information for TranferTarget.
     */
    public TransferCallToParticipantOptions(PhoneNumberIdentifier targetParticipant) {
        this.targetParticipant = targetParticipant;
    }

    /**
     * Constructor
     *
     * @param targetParticipant {@link MicrosoftTeamsUserIdentifier}contains information for TranferTarget.
     */
    public TransferCallToParticipantOptions(MicrosoftTeamsUserIdentifier targetParticipant) {
        this.targetParticipant = targetParticipant;
    }

    /**
     * Get the operationContext.
     *
     * @return the operationContext
     */
    public String  getOperationContext() {
        return operationContext;
    }

    /**
     * Set the operationContext.
     *
     * @param operationContext the operationContext to set
     * @return the TransferCallToParticipantOptions object itself.
     */
    public TransferCallToParticipantOptions setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get transferee.
     *
     * @return the transferee
     */
    public CommunicationIdentifier getTransferee() {
        return transferee;
    }

    /**
     * Set the transferee.
     *
     * @param transferee the transferee to set
     * @return the TransferCallToParticipantOptions object itself.
     */
    public TransferCallToParticipantOptions setTransferee(CommunicationIdentifier transferee) {
        this.transferee = transferee;
        return this;
    }

    /**
     * Get the call information to transfer target
     * @return a {@link CommunicationIdentifier} with information to transfer target
     */
    public CommunicationIdentifier getTargetParticipant() {
        return targetParticipant;
    }

    /**
     * Get the callbackUrlOverride.
     *
     * @return the callbackUrlOverride
     */
    public String getOverrideCallbackUrl() {
        return overrideCallbackUrl;
    }

    /**
     * Set the callbackUrl.
     *
     * @param overrideCallbackUrl the callbackUrlOverride to set
     * @return the TransferCallToParticipantOptions object itself.
     */
    public TransferCallToParticipantOptions setOverrideCallbackUrl(String overrideCallbackUrl) {
        this.overrideCallbackUrl = overrideCallbackUrl;
        return this;
    }
}
