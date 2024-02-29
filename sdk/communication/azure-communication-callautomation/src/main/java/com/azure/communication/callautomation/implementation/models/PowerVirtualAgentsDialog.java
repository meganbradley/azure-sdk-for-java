// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Power Virtual Agents Dialog. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("powerVirtualAgents")
@Fluent
public final class PowerVirtualAgentsDialog extends BaseDialog {
    /*
     * Bot identifier.
     */
    @JsonProperty(value = "botAppId", required = true)
    private String botAppId;

    /*
     * Language.
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * Get the botAppId property: Bot identifier.
     *
     * @return the botAppId value.
     */
    public String getBotAppId() {
        return this.botAppId;
    }

    /**
     * Set the botAppId property: Bot identifier.
     *
     * @param botAppId the botAppId value to set.
     * @return the PowerVirtualAgentsDialog object itself.
     */
    public PowerVirtualAgentsDialog setBotAppId(String botAppId) {
        this.botAppId = botAppId;
        return this;
    }

    /**
     * Get the language property: Language.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: Language.
     *
     * @param language the language value to set.
     * @return the PowerVirtualAgentsDialog object itself.
     */
    public PowerVirtualAgentsDialog setLanguage(String language) {
        this.language = language;
        return this;
    }
}
