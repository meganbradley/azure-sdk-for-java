// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides remote connection information for a Dev Box.
 */
@Immutable
public final class RemoteConnection {

    /*
     * URL to open a browser based RDP session.
     */
    @Generated
    @JsonProperty(value = "webUrl")
    private String webUrl;

    /*
     * Link to open a Remote Desktop session.
     */
    @Generated
    @JsonProperty(value = "rdpConnectionUrl")
    private String rdpConnectionUrl;

    /**
     * Creates an instance of RemoteConnection class.
     */
    @Generated
    private RemoteConnection() {
    }

    /**
     * Get the webUrl property: URL to open a browser based RDP session.
     *
     * @return the webUrl value.
     */
    @Generated
    public String getWebUrl() {
        return this.webUrl;
    }

    /**
     * Get the rdpConnectionUrl property: Link to open a Remote Desktop session.
     *
     * @return the rdpConnectionUrl value.
     */
    @Generated
    public String getRdpConnectionUrl() {
        return this.rdpConnectionUrl;
    }
}
