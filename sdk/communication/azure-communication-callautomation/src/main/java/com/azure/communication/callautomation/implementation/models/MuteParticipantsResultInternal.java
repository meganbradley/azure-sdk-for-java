// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result payload for muting participants from the call. */
@Fluent
public final class MuteParticipantsResultInternal {
    /*
     * The operation context provided by client.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /** Creates an instance of MuteParticipantsResultInternal class. */
    public MuteParticipantsResultInternal() {}

    /**
     * Get the operationContext property: The operation context provided by client.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context provided by client.
     *
     * @param operationContext the operationContext value to set.
     * @return the MuteParticipantsResultInternal object itself.
     */
    public MuteParticipantsResultInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
