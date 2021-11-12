// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.azure.resourcemanager.synapse.models.TableLevelSharingProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class representing an attached database configuration. */
@Fluent
public final class AttachedDatabaseConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AttachedDatabaseConfigurationInner.class);

    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The properties of the attached database configuration.
     */
    @JsonProperty(value = "properties")
    private AttachedDatabaseConfigurationProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the attached database configuration.
     *
     * @return the innerProperties value.
     */
    private AttachedDatabaseConfigurationProperties innerProperties() {
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
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Set the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     *
     * @param databaseName the databaseName value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withDatabaseName(String databaseName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDatabaseConfigurationProperties();
        }
        this.innerProperties().withDatabaseName(databaseName);
        return this;
    }

    /**
     * Get the kustoPoolResourceId property: The resource id of the kusto pool where the databases you would like to
     * attach reside.
     *
     * @return the kustoPoolResourceId value.
     */
    public String kustoPoolResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().kustoPoolResourceId();
    }

    /**
     * Set the kustoPoolResourceId property: The resource id of the kusto pool where the databases you would like to
     * attach reside.
     *
     * @param kustoPoolResourceId the kustoPoolResourceId value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withKustoPoolResourceId(String kustoPoolResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDatabaseConfigurationProperties();
        }
        this.innerProperties().withKustoPoolResourceId(kustoPoolResourceId);
        return this;
    }

    /**
     * Get the attachedDatabaseNames property: The list of databases from the clusterResourceId which are currently
     * attached to the kusto pool.
     *
     * @return the attachedDatabaseNames value.
     */
    public List<String> attachedDatabaseNames() {
        return this.innerProperties() == null ? null : this.innerProperties().attachedDatabaseNames();
    }

    /**
     * Get the defaultPrincipalsModificationKind property: The default principals modification kind.
     *
     * @return the defaultPrincipalsModificationKind value.
     */
    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultPrincipalsModificationKind();
    }

    /**
     * Set the defaultPrincipalsModificationKind property: The default principals modification kind.
     *
     * @param defaultPrincipalsModificationKind the defaultPrincipalsModificationKind value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withDefaultPrincipalsModificationKind(
        DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDatabaseConfigurationProperties();
        }
        this.innerProperties().withDefaultPrincipalsModificationKind(defaultPrincipalsModificationKind);
        return this;
    }

    /**
     * Get the tableLevelSharingProperties property: Table level sharing specifications.
     *
     * @return the tableLevelSharingProperties value.
     */
    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().tableLevelSharingProperties();
    }

    /**
     * Set the tableLevelSharingProperties property: Table level sharing specifications.
     *
     * @param tableLevelSharingProperties the tableLevelSharingProperties value to set.
     * @return the AttachedDatabaseConfigurationInner object itself.
     */
    public AttachedDatabaseConfigurationInner withTableLevelSharingProperties(
        TableLevelSharingProperties tableLevelSharingProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDatabaseConfigurationProperties();
        }
        this.innerProperties().withTableLevelSharingProperties(tableLevelSharingProperties);
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
