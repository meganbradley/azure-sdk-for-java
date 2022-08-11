// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicebus.models.Encryption;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of the namespace. */
@Fluent
public final class SBNamespaceUpdateProperties {
    /*
     * Provisioning state of the namespace.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Status of the namespace.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The time the namespace was created
     */
    @JsonProperty(value = "createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    @JsonProperty(value = "updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Identifier for Azure Insights metrics
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Properties of BYOK Encryption description
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * List of private endpoint connections.
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * This property disables SAS authentication for the Service Bus namespace.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * Alternate name for namespace
     */
    @JsonProperty(value = "alternateName")
    private String alternateName;

    /**
     * Get the provisioningState property: Provisioning state of the namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Status of the namespace.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the encryption property: Properties of BYOK Encryption description.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Properties of BYOK Encryption description.
     *
     * @param encryption the encryption value to set.
     * @return the SBNamespaceUpdateProperties object itself.
     */
    public SBNamespaceUpdateProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the SBNamespaceUpdateProperties object itself.
     */
    public SBNamespaceUpdateProperties withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the SBNamespaceUpdateProperties object itself.
     */
    public SBNamespaceUpdateProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the alternateName property: Alternate name for namespace.
     *
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.alternateName;
    }

    /**
     * Set the alternateName property: Alternate name for namespace.
     *
     * @param alternateName the alternateName value to set.
     * @return the SBNamespaceUpdateProperties object itself.
     */
    public SBNamespaceUpdateProperties withAlternateName(String alternateName) {
        this.alternateName = alternateName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryption() != null) {
            encryption().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
