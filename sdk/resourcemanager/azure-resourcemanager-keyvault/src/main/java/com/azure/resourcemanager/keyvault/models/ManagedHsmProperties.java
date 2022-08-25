// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Properties of the managed HSM Pool. */
@Fluent
public final class ManagedHsmProperties {
    /*
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the managed HSM pool.
     */
    @JsonProperty(value = "tenantId")
    private UUID tenantId;

    /*
     * Array of initial administrators object ids for this managed hsm pool.
     */
    @JsonProperty(value = "initialAdminObjectIds")
    private List<String> initialAdminObjectIds;

    /*
     * The URI of the managed hsm pool for performing operations on keys.
     */
    @JsonProperty(value = "hsmUri", access = JsonProperty.Access.WRITE_ONLY)
    private String hsmUri;

    /*
     * Property to specify whether the 'soft delete' functionality is enabled for this managed HSM pool. If it's not
     * set to any value(true or false) when creating new managed HSM pool, it will be set to true by default. Once set
     * to true, it cannot be reverted to false.
     */
    @JsonProperty(value = "enableSoftDelete")
    private Boolean enableSoftDelete;

    /*
     * softDelete data retention days. It accepts >=7 and <=90.
     */
    @JsonProperty(value = "softDeleteRetentionInDays")
    private Integer softDeleteRetentionInDays;

    /*
     * Property specifying whether protection against purge is enabled for this managed HSM pool. Setting this property
     * to true activates protection against purge for this managed HSM pool and its content - only the Managed HSM
     * service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also
     * enabled. Enabling this functionality is irreversible.
     */
    @JsonProperty(value = "enablePurgeProtection")
    private Boolean enablePurgeProtection;

    /*
     * The create mode to indicate whether the resource is being created or is being recovered from a deleted resource.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * Resource Status Message.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /*
     * Provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Rules governing the accessibility of the key vault from specific network locations.
     */
    @JsonProperty(value = "networkAcls")
    private MhsmNetworkRuleSet networkAcls;

    /*
     * List of private endpoint connections associated with the managed hsm pool.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<MhsmPrivateEndpointConnectionItem> privateEndpointConnections;

    /*
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The scheduled purge date in UTC.
     */
    @JsonProperty(value = "scheduledPurgeDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime scheduledPurgeDate;

    /**
     * Get the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the managed HSM pool.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the managed HSM pool.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the initialAdminObjectIds property: Array of initial administrators object ids for this managed hsm pool.
     *
     * @return the initialAdminObjectIds value.
     */
    public List<String> initialAdminObjectIds() {
        return this.initialAdminObjectIds;
    }

    /**
     * Set the initialAdminObjectIds property: Array of initial administrators object ids for this managed hsm pool.
     *
     * @param initialAdminObjectIds the initialAdminObjectIds value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withInitialAdminObjectIds(List<String> initialAdminObjectIds) {
        this.initialAdminObjectIds = initialAdminObjectIds;
        return this;
    }

    /**
     * Get the hsmUri property: The URI of the managed hsm pool for performing operations on keys.
     *
     * @return the hsmUri value.
     */
    public String hsmUri() {
        return this.hsmUri;
    }

    /**
     * Get the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this managed HSM pool. If it's not set to any value(true or false) when creating new managed HSM pool, it will be
     * set to true by default. Once set to true, it cannot be reverted to false.
     *
     * @return the enableSoftDelete value.
     */
    public Boolean enableSoftDelete() {
        return this.enableSoftDelete;
    }

    /**
     * Set the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this managed HSM pool. If it's not set to any value(true or false) when creating new managed HSM pool, it will be
     * set to true by default. Once set to true, it cannot be reverted to false.
     *
     * @param enableSoftDelete the enableSoftDelete value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withEnableSoftDelete(Boolean enableSoftDelete) {
        this.enableSoftDelete = enableSoftDelete;
        return this;
    }

    /**
     * Get the softDeleteRetentionInDays property: softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     *
     * @return the softDeleteRetentionInDays value.
     */
    public Integer softDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    /**
     * Set the softDeleteRetentionInDays property: softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     *
     * @param softDeleteRetentionInDays the softDeleteRetentionInDays value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays = softDeleteRetentionInDays;
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * managed HSM pool. Setting this property to true activates protection against purge for this managed HSM pool and
     * its content - only the Managed HSM service may initiate a hard, irrecoverable deletion. The setting is effective
     * only if soft delete is also enabled. Enabling this functionality is irreversible.
     *
     * @return the enablePurgeProtection value.
     */
    public Boolean enablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * managed HSM pool. Setting this property to true activates protection against purge for this managed HSM pool and
     * its content - only the Managed HSM service may initiate a hard, irrecoverable deletion. The setting is effective
     * only if soft delete is also enabled. Enabling this functionality is irreversible.
     *
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.enablePurgeProtection = enablePurgeProtection;
        return this;
    }

    /**
     * Get the createMode property: The create mode to indicate whether the resource is being created or is being
     * recovered from a deleted resource.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The create mode to indicate whether the resource is being created or is being
     * recovered from a deleted resource.
     *
     * @param createMode the createMode value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the statusMessage property: Resource Status Message.
     *
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkAcls property: Rules governing the accessibility of the key vault from specific network locations.
     *
     * @return the networkAcls value.
     */
    public MhsmNetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: Rules governing the accessibility of the key vault from specific network locations.
     *
     * @param networkAcls the networkAcls value to set.
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withNetworkAcls(MhsmNetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections associated with the managed hsm
     * pool.
     *
     * @return the privateEndpointConnections value.
     */
    public List<MhsmPrivateEndpointConnectionItem> privateEndpointConnections() {
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
     * @return the ManagedHsmProperties object itself.
     */
    public ManagedHsmProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the scheduledPurgeDate property: The scheduled purge date in UTC.
     *
     * @return the scheduledPurgeDate value.
     */
    public OffsetDateTime scheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkAcls() != null) {
            networkAcls().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
