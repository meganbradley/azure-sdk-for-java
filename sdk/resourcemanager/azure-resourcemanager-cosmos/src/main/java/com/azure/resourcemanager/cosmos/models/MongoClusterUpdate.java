// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.fluent.models.MongoClusterProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Represents a mongo cluster resource for updates.
 */
@Fluent
public final class MongoClusterUpdate {
    /*
     * Properties of the mongo cluster.
     */
    @JsonProperty(value = "properties")
    private MongoClusterProperties innerProperties;

    /*
     * Application-specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Creates an instance of MongoClusterUpdate class.
     */
    public MongoClusterUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of the mongo cluster.
     * 
     * @return the innerProperties value.
     */
    private MongoClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Application-specific metadata in the form of key-value pairs.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application-specific metadata in the form of key-value pairs.
     * 
     * @param tags the tags value to set.
     * @return the MongoClusterUpdate object itself.
     */
    public MongoClusterUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the createMode property: The mode to create a mongo cluster.
     * 
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.innerProperties() == null ? null : this.innerProperties().createMode();
    }

    /**
     * Set the createMode property: The mode to create a mongo cluster.
     * 
     * @param createMode the createMode value to set.
     * @return the MongoClusterUpdate object itself.
     */
    public MongoClusterUpdate withCreateMode(CreateMode createMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoClusterProperties();
        }
        this.innerProperties().withCreateMode(createMode);
        return this;
    }

    /**
     * Get the restoreParameters property: Parameters used for restore operations.
     * 
     * @return the restoreParameters value.
     */
    public MongoClusterRestoreParameters restoreParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().restoreParameters();
    }

    /**
     * Set the restoreParameters property: Parameters used for restore operations.
     * 
     * @param restoreParameters the restoreParameters value to set.
     * @return the MongoClusterUpdate object itself.
     */
    public MongoClusterUpdate withRestoreParameters(MongoClusterRestoreParameters restoreParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoClusterProperties();
        }
        this.innerProperties().withRestoreParameters(restoreParameters);
        return this;
    }

    /**
     * Get the administratorLogin property: The administrator's login for the mongo cluster.
     * 
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorLogin();
    }

    /**
     * Set the administratorLogin property: The administrator's login for the mongo cluster.
     * 
     * @param administratorLogin the administratorLogin value to set.
     * @return the MongoClusterUpdate object itself.
     */
    public MongoClusterUpdate withAdministratorLogin(String administratorLogin) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoClusterProperties();
        }
        this.innerProperties().withAdministratorLogin(administratorLogin);
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     * 
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorLoginPassword();
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     * 
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the MongoClusterUpdate object itself.
     */
    public MongoClusterUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoClusterProperties();
        }
        this.innerProperties().withAdministratorLoginPassword(administratorLoginPassword);
        return this;
    }

    /**
     * Get the serverVersion property: The Mongo DB server version. Defaults to the latest available version if not
     * specified.
     * 
     * @return the serverVersion value.
     */
    public String serverVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().serverVersion();
    }

    /**
     * Set the serverVersion property: The Mongo DB server version. Defaults to the latest available version if not
     * specified.
     * 
     * @param serverVersion the serverVersion value to set.
     * @return the MongoClusterUpdate object itself.
     */
    public MongoClusterUpdate withServerVersion(String serverVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoClusterProperties();
        }
        this.innerProperties().withServerVersion(serverVersion);
        return this;
    }

    /**
     * Get the connectionString property: The default mongo connection string for the cluster.
     * 
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionString();
    }

    /**
     * Get the earliestRestoreTime property: Earliest restore timestamp in UTC ISO8601 format.
     * 
     * @return the earliestRestoreTime value.
     */
    public String earliestRestoreTime() {
        return this.innerProperties() == null ? null : this.innerProperties().earliestRestoreTime();
    }

    /**
     * Get the provisioningState property: A provisioning state of the mongo cluster.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the clusterStatus property: A status of the mongo cluster.
     * 
     * @return the clusterStatus value.
     */
    public MongoClusterStatus clusterStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterStatus();
    }

    /**
     * Get the nodeGroupSpecs property: The list of node group specs in the cluster.
     * 
     * @return the nodeGroupSpecs value.
     */
    public List<NodeGroupSpec> nodeGroupSpecs() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeGroupSpecs();
    }

    /**
     * Set the nodeGroupSpecs property: The list of node group specs in the cluster.
     * 
     * @param nodeGroupSpecs the nodeGroupSpecs value to set.
     * @return the MongoClusterUpdate object itself.
     */
    public MongoClusterUpdate withNodeGroupSpecs(List<NodeGroupSpec> nodeGroupSpecs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoClusterProperties();
        }
        this.innerProperties().withNodeGroupSpecs(nodeGroupSpecs);
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
