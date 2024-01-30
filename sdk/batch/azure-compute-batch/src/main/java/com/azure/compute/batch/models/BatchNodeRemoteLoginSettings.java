// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The remote login settings for a Compute Node.
 */
@Immutable
public final class BatchNodeRemoteLoginSettings {

    /*
     * The IP address used for remote login to the Compute Node.
     */
    @Generated
    @JsonProperty(value = "remoteLoginIPAddress")
    private String remoteLoginIpAddress;

    /*
     * The port used for remote login to the Compute Node.
     */
    @Generated
    @JsonProperty(value = "remoteLoginPort")
    private int remoteLoginPort;

    /**
     * Creates an instance of BatchNodeRemoteLoginSettings class.
     *
     * @param remoteLoginIpAddress the remoteLoginIpAddress value to set.
     * @param remoteLoginPort the remoteLoginPort value to set.
     */
    @Generated
    @JsonCreator
    private BatchNodeRemoteLoginSettings(@JsonProperty(value = "remoteLoginIPAddress") String remoteLoginIpAddress,
        @JsonProperty(value = "remoteLoginPort") int remoteLoginPort) {
        this.remoteLoginIpAddress = remoteLoginIpAddress;
        this.remoteLoginPort = remoteLoginPort;
    }

    /**
     * Get the remoteLoginIpAddress property: The IP address used for remote login to the Compute Node.
     *
     * @return the remoteLoginIpAddress value.
     */
    @Generated
    public String getRemoteLoginIpAddress() {
        return this.remoteLoginIpAddress;
    }

    /**
     * Get the remoteLoginPort property: The port used for remote login to the Compute Node.
     *
     * @return the remoteLoginPort value.
     */
    @Generated
    public int getRemoteLoginPort() {
        return this.remoteLoginPort;
    }
}
