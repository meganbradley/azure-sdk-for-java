// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointConnectionProxyProvisioningState;
import com.azure.resourcemanager.deviceupdate.models.RemotePrivateEndpoint;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private endpoint connection proxy details. */
@Fluent
public final class PrivateEndpointConnectionProxyInner extends ProxyResource {
    /*
     * Private endpoint connection proxy object property bag.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProxyProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * ETag from NRP.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Remote private endpoint details.
     */
    @JsonProperty(value = "remotePrivateEndpoint")
    private RemotePrivateEndpoint remotePrivateEndpoint;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the innerProperties property: Private endpoint connection proxy object property bag.
     *
     * @return the innerProperties value.
     */
    private PrivateEndpointConnectionProxyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: ETag from NRP.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the remotePrivateEndpoint property: Remote private endpoint details.
     *
     * @return the remotePrivateEndpoint value.
     */
    public RemotePrivateEndpoint remotePrivateEndpoint() {
        return this.remotePrivateEndpoint;
    }

    /**
     * Set the remotePrivateEndpoint property: Remote private endpoint details.
     *
     * @param remotePrivateEndpoint the remotePrivateEndpoint value to set.
     * @return the PrivateEndpointConnectionProxyInner object itself.
     */
    public PrivateEndpointConnectionProxyInner withRemotePrivateEndpoint(RemotePrivateEndpoint remotePrivateEndpoint) {
        this.remotePrivateEndpoint = remotePrivateEndpoint;
        return this;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     *
     * @param status the status value to set.
     * @return the PrivateEndpointConnectionProxyInner object itself.
     */
    public PrivateEndpointConnectionProxyInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint connection proxy resource.
     *
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProxyProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (remotePrivateEndpoint() != null) {
            remotePrivateEndpoint().validate();
        }
    }
}
