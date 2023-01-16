// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sdkreleaseplannertest.models.NetworkAdapter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of network settings. */
@Immutable
public final class NetworkSettingsProperties {
    /*
     * The network adapter list on the device.
     */
    @JsonProperty(value = "networkAdapters", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkAdapter> networkAdapters;

    /** Creates an instance of NetworkSettingsProperties class. */
    public NetworkSettingsProperties() {
    }

    /**
     * Get the networkAdapters property: The network adapter list on the device.
     *
     * @return the networkAdapters value.
     */
    public List<NetworkAdapter> networkAdapters() {
        return this.networkAdapters;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkAdapters() != null) {
            networkAdapters().forEach(e -> e.validate());
        }
    }
}
