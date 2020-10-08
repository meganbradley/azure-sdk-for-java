// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AcsChatMessageReceivedEventData model. */
@Fluent
public final class AcsChatMessageReceivedEventData extends AcsChatMessageEventBaseProperties {
    /*
     * The body of the chat message
     */
    @JsonProperty(value = "messageBody")
    private String messageBody;

    /**
     * Get the messageBody property: The body of the chat message.
     *
     * @return the messageBody value.
     */
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * Set the messageBody property: The body of the chat message.
     *
     * @param messageBody the messageBody value to set.
     * @return the AcsChatMessageReceivedEventData object itself.
     */
    public AcsChatMessageReceivedEventData setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
}
