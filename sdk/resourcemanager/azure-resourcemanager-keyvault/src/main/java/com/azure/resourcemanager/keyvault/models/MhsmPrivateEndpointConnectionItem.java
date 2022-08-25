// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.keyvault.fluent.models.MhsmPrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private endpoint connection item. */
@Fluent
public final class MhsmPrivateEndpointConnectionItem {
    /*
     * Id of private endpoint connection.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Modified whenever there is a change in the state of private endpoint connection.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Private endpoint connection properties.
     */
    @JsonProperty(value = "properties")
    private MhsmPrivateEndpointConnectionProperties innerProperties;

    /**
     * Get the id property: Id of private endpoint connection.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of private endpoint connection.
     *
     * @param id the id value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the etag property: Modified whenever there is a change in the state of private endpoint connection.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Modified whenever there is a change in the state of private endpoint connection.
     *
     * @param etag the etag value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: Private endpoint connection properties.
     *
     * @return the innerProperties value.
     */
    private MhsmPrivateEndpointConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the privateEndpoint property: Properties of the private endpoint object.
     *
     * @return the privateEndpoint value.
     */
    public MhsmPrivateEndpoint privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Set the privateEndpoint property: Properties of the private endpoint object.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withPrivateEndpoint(MhsmPrivateEndpoint privateEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MhsmPrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Approval state of the private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public MhsmPrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: Approval state of the private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withPrivateLinkServiceConnectionState(
        MhsmPrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MhsmPrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the private endpoint connection.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the MhsmPrivateEndpointConnectionItem object itself.
     */
    public MhsmPrivateEndpointConnectionItem withProvisioningState(
        PrivateEndpointConnectionProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MhsmPrivateEndpointConnectionProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
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
    }
}
