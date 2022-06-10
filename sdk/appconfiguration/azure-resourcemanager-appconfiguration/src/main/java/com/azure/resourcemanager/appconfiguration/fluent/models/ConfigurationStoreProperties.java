// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appconfiguration.models.CreateMode;
import com.azure.resourcemanager.appconfiguration.models.EncryptionProperties;
import com.azure.resourcemanager.appconfiguration.models.PrivateEndpointConnectionReference;
import com.azure.resourcemanager.appconfiguration.models.ProvisioningState;
import com.azure.resourcemanager.appconfiguration.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The properties of a configuration store. */
@Fluent
public final class ConfigurationStoreProperties {
    /*
     * The provisioning state of the configuration store.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The creation date of configuration store.
     */
    @JsonProperty(value = "creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The DNS endpoint where the configuration store API will be available.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * The encryption settings of the configuration store.
     */
    @JsonProperty(value = "encryption")
    private EncryptionProperties encryption;

    /*
     * The list of private endpoint connections that are set up for this
     * resource.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionReference> privateEndpointConnections;

    /*
     * Control permission for data plane traffic coming from public networks
     * while private endpoint is enabled.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Disables all authentication methods other than AAD authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * The amount of time in days that the configuration store will be retained
     * when it is soft deleted.
     */
    @JsonProperty(value = "softDeleteRetentionInDays")
    private Integer softDeleteRetentionInDays;

    /*
     * Property specifying whether protection against purge is enabled for this
     * configuration store.
     */
    @JsonProperty(value = "enablePurgeProtection")
    private Boolean enablePurgeProtection;

    /*
     * Indicates whether the configuration store need to be recovered.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /**
     * Get the provisioningState property: The provisioning state of the configuration store.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creationDate property: The creation date of configuration store.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the endpoint property: The DNS endpoint where the configuration store API will be available.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the encryption property: The encryption settings of the configuration store.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption settings of the configuration store.
     *
     * @param encryption the encryption value to set.
     * @return the ConfigurationStoreProperties object itself.
     */
    public ConfigurationStoreProperties withEncryption(EncryptionProperties encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The list of private endpoint connections that are set up for this
     * resource.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionReference> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ConfigurationStoreProperties object itself.
     */
    public ConfigurationStoreProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Disables all authentication methods other than AAD authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Disables all authentication methods other than AAD authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the ConfigurationStoreProperties object itself.
     */
    public ConfigurationStoreProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the softDeleteRetentionInDays property: The amount of time in days that the configuration store will be
     * retained when it is soft deleted.
     *
     * @return the softDeleteRetentionInDays value.
     */
    public Integer softDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    /**
     * Set the softDeleteRetentionInDays property: The amount of time in days that the configuration store will be
     * retained when it is soft deleted.
     *
     * @param softDeleteRetentionInDays the softDeleteRetentionInDays value to set.
     * @return the ConfigurationStoreProperties object itself.
     */
    public ConfigurationStoreProperties withSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays = softDeleteRetentionInDays;
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * configuration store.
     *
     * @return the enablePurgeProtection value.
     */
    public Boolean enablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * configuration store.
     *
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the ConfigurationStoreProperties object itself.
     */
    public ConfigurationStoreProperties withEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.enablePurgeProtection = enablePurgeProtection;
        return this;
    }

    /**
     * Get the createMode property: Indicates whether the configuration store need to be recovered.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Indicates whether the configuration store need to be recovered.
     *
     * @param createMode the createMode value to set.
     * @return the ConfigurationStoreProperties object itself.
     */
    public ConfigurationStoreProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
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
