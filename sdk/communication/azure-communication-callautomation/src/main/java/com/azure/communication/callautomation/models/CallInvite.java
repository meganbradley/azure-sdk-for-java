// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.


package com.azure.communication.callautomation.models;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.MicrosoftTeamsUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.annotation.Fluent;

/**
 *  Call invitee details.
 */
@Fluent
public final class CallInvite {
    private final CommunicationIdentifier targetParticipant;
    private final PhoneNumberIdentifier sourceCallerIdNumber;
    private String sourceDisplayName;

    /**
     *  Create a CallInvite object with PhoneNumberIdentifierr
     * @param targetIdentity Target's PhoneNumberIdentifier
     * @param callerIdNumber Caller's phone number identifier
     */
    public CallInvite(PhoneNumberIdentifier targetIdentity, PhoneNumberIdentifier callerIdNumber) {
        targetParticipant = targetIdentity;
        sourceCallerIdNumber = callerIdNumber;
    }

    /**
     * Create a CallInvite object with CommunicationUserIdentifier
     * @param targetIdentity Target's CommunicationUserIdentifier
     */
    public CallInvite(CommunicationUserIdentifier targetIdentity) {
        this.targetParticipant = targetIdentity;
        this.sourceCallerIdNumber = null;
    }

    /**
     * Create a CallInvite object with MicrosoftTeamsUserIdentifier
     * @param targetIdentity Target's MicrosoftTeamsUserIdentifier
     */
    public CallInvite(MicrosoftTeamsUserIdentifier targetIdentity) {
        this.targetParticipant = targetIdentity;
        this.sourceCallerIdNumber = null;
    }

    /**
     * Get target's CommunicationIdentifier
     * @return target's CommunicationIdentifier
     */
    public CommunicationIdentifier getTargetParticipant() {
        return targetParticipant;
    }

    /**
     * get caller's display name
     * @return display name for caller
     */
    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    /**
     * set display name for caller
     * @param sourceDisplayName display name for caller
     * @return the CallInvite object itself
     */
    public CallInvite setSourceDisplayName(String sourceDisplayName) {
        this.sourceDisplayName = sourceDisplayName;
        return this;
    }

    /**
     * get PhoneNumberIdentifier for PSTN caller
     * @return PhoneNumberIdentifier for PSTN caller
     */
    public PhoneNumberIdentifier getSourceCallerIdNumber() {
        return sourceCallerIdNumber;
    }
}
