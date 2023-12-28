// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for redirecting the call. */
@Fluent
public final class RedirectCallRequestInternal {
    /*
     * The context associated with the call.
     */
    @JsonProperty(value = "incomingCallContext", required = true)
    private String incomingCallContext;

    /*
     * The target identity to redirect the call to.
     */
    @JsonProperty(value = "target", required = true)
    private CommunicationIdentifierModel target;

    /*
     * Used by customer to send custom calling context to targets
     */
    @JsonProperty(value = "customCallingContext")
    private CustomCallingContext customCallingContext;

    /**
     * Get the incomingCallContext property: The context associated with the call.
     *
     * @return the incomingCallContext value.
     */
    public String getIncomingCallContext() {
        return this.incomingCallContext;
    }

    /**
     * Set the incomingCallContext property: The context associated with the call.
     *
     * @param incomingCallContext the incomingCallContext value to set.
     * @return the RedirectCallRequestInternal object itself.
     */
    public RedirectCallRequestInternal setIncomingCallContext(String incomingCallContext) {
        this.incomingCallContext = incomingCallContext;
        return this;
    }

    /**
     * Get the target property: The target identity to redirect the call to.
     *
     * @return the target value.
     */
    public CommunicationIdentifierModel getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target identity to redirect the call to.
     *
     * @param target the target value to set.
     * @return the RedirectCallRequestInternal object itself.
     */
    public RedirectCallRequestInternal setTarget(CommunicationIdentifierModel target) {
        this.target = target;
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
     * @return the RedirectCallRequestInternal object itself.
     */
    public RedirectCallRequestInternal setCustomCallingContext(CustomCallingContext customCallingContext) {
        this.customCallingContext = customCallingContext;
        return this;
    }
}
