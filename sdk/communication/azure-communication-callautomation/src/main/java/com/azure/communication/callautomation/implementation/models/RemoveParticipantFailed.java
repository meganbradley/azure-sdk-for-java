// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The failed to remove participant event. */
@Fluent
public final class RemoveParticipantFailed {
    /*
     * Call connection ID.
     */
    @JsonProperty(value = "callConnectionId")
    private String callConnectionId;

    /*
     * Server call ID.
     */
    @JsonProperty(value = "serverCallId")
    private String serverCallId;

    /*
     * Correlation ID for event to call correlation. Also called ChainId for skype chain ID.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /*
     * Used by customers when calling mid-call actions to correlate the request to the response event.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * Contains the resulting SIP code, sub-code and message.
     */
    @JsonProperty(value = "resultInformation")
    private ResultInformation resultInformation;

    /*
     * Participant
     */
    @JsonProperty(value = "participant")
    private CommunicationIdentifierModel participant;

    /** Creates an instance of RemoveParticipantFailed class. */
    public RemoveParticipantFailed() {}

    /**
     * Get the callConnectionId property: Call connection ID.
     *
     * @return the callConnectionId value.
     */
    public String getCallConnectionId() {
        return this.callConnectionId;
    }

    /**
     * Set the callConnectionId property: Call connection ID.
     *
     * @param callConnectionId the callConnectionId value to set.
     * @return the RemoveParticipantFailed object itself.
     */
    public RemoveParticipantFailed setCallConnectionId(String callConnectionId) {
        this.callConnectionId = callConnectionId;
        return this;
    }

    /**
     * Get the serverCallId property: Server call ID.
     *
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Set the serverCallId property: Server call ID.
     *
     * @param serverCallId the serverCallId value to set.
     * @return the RemoveParticipantFailed object itself.
     */
    public RemoveParticipantFailed setServerCallId(String serverCallId) {
        this.serverCallId = serverCallId;
        return this;
    }

    /**
     * Get the correlationId property: Correlation ID for event to call correlation. Also called ChainId for skype chain
     * ID.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Correlation ID for event to call correlation. Also called ChainId for skype chain
     * ID.
     *
     * @param correlationId the correlationId value to set.
     * @return the RemoveParticipantFailed object itself.
     */
    public RemoveParticipantFailed setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
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
     * @return the RemoveParticipantFailed object itself.
     */
    public RemoveParticipantFailed setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the resultInformation property: Contains the resulting SIP code, sub-code and message.
     *
     * @return the resultInformation value.
     */
    public ResultInformation getResultInformation() {
        return this.resultInformation;
    }

    /**
     * Set the resultInformation property: Contains the resulting SIP code, sub-code and message.
     *
     * @param resultInformation the resultInformation value to set.
     * @return the RemoveParticipantFailed object itself.
     */
    public RemoveParticipantFailed setResultInformation(ResultInformation resultInformation) {
        this.resultInformation = resultInformation;
        return this;
    }

    /**
     * Get the participant property: Participant.
     *
     * @return the participant value.
     */
    public CommunicationIdentifierModel getParticipant() {
        return this.participant;
    }

    /**
     * Set the participant property: Participant.
     *
     * @param participant the participant value to set.
     * @return the RemoveParticipantFailed object itself.
     */
    public RemoveParticipantFailed setParticipant(CommunicationIdentifierModel participant) {
        this.participant = participant;
        return this;
    }
}
