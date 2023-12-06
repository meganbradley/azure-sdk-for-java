// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The custom calling context which will be sent to the target. */
@Fluent
public final class CustomCallingContext {
    /*
     * Custom calling context VoiP headers
     */
    @JsonProperty(value = "voipHeaders")
    private Map<String, String> voipHeaders;

    /*
     * Custom calling context SIP headers
     */
    @JsonProperty(value = "sipHeaders")
    private Map<String, String> sipHeaders;

    /** Creates an instance of CustomCallingContext class. */
    public CustomCallingContext() {}

    /**
     * Get the voipHeaders property: Custom calling context VoiP headers.
     *
     * @return the voipHeaders value.
     */
    public Map<String, String> getVoipHeaders() {
        return this.voipHeaders;
    }

    /**
     * Set the voipHeaders property: Custom calling context VoiP headers.
     *
     * @param voipHeaders the voipHeaders value to set.
     * @return the CustomCallingContext object itself.
     */
    public CustomCallingContext setVoipHeaders(Map<String, String> voipHeaders) {
        this.voipHeaders = voipHeaders;
        return this;
    }

    /**
     * Get the sipHeaders property: Custom calling context SIP headers.
     *
     * @return the sipHeaders value.
     */
    public Map<String, String> getSipHeaders() {
        return this.sipHeaders;
    }

    /**
     * Set the sipHeaders property: Custom calling context SIP headers.
     *
     * @param sipHeaders the sipHeaders value to set.
     * @return the CustomCallingContext object itself.
     */
    public CustomCallingContext setSipHeaders(Map<String, String> sipHeaders) {
        this.sipHeaders = sipHeaders;
        return this;
    }
}
