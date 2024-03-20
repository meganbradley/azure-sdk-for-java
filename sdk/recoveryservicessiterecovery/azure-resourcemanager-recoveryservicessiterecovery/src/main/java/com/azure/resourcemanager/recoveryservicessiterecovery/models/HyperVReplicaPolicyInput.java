// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Hyper-V Replica specific policy Input.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = HyperVReplicaPolicyInput.class)
@JsonTypeName("HyperVReplica2012")
@JsonSubTypes({ @JsonSubTypes.Type(name = "HyperVReplica2012R2", value = HyperVReplicaBluePolicyInput.class) })
@Fluent
public class HyperVReplicaPolicyInput extends PolicyProviderSpecificInput {
    /*
     * A value indicating the number of recovery points.
     */
    @JsonProperty(value = "recoveryPoints")
    private Integer recoveryPoints;

    /*
     * A value indicating the application consistent frequency.
     */
    @JsonProperty(value = "applicationConsistentSnapshotFrequencyInHours")
    private Integer applicationConsistentSnapshotFrequencyInHours;

    /*
     * A value indicating whether compression has to be enabled.
     */
    @JsonProperty(value = "compression")
    private String compression;

    /*
     * A value indicating whether IR is online.
     */
    @JsonProperty(value = "initialReplicationMethod")
    private String initialReplicationMethod;

    /*
     * A value indicating the online IR start time.
     */
    @JsonProperty(value = "onlineReplicationStartTime")
    private String onlineReplicationStartTime;

    /*
     * A value indicating the offline IR import path.
     */
    @JsonProperty(value = "offlineReplicationImportPath")
    private String offlineReplicationImportPath;

    /*
     * A value indicating the offline IR export path.
     */
    @JsonProperty(value = "offlineReplicationExportPath")
    private String offlineReplicationExportPath;

    /*
     * A value indicating the recovery HTTPS port.
     */
    @JsonProperty(value = "replicationPort")
    private Integer replicationPort;

    /*
     * A value indicating the authentication type.
     */
    @JsonProperty(value = "allowedAuthenticationType")
    private Integer allowedAuthenticationType;

    /*
     * A value indicating whether the VM has to be auto deleted.
     */
    @JsonProperty(value = "replicaDeletion")
    private String replicaDeletion;

    /**
     * Creates an instance of HyperVReplicaPolicyInput class.
     */
    public HyperVReplicaPolicyInput() {
    }

    /**
     * Get the recoveryPoints property: A value indicating the number of recovery points.
     * 
     * @return the recoveryPoints value.
     */
    public Integer recoveryPoints() {
        return this.recoveryPoints;
    }

    /**
     * Set the recoveryPoints property: A value indicating the number of recovery points.
     * 
     * @param recoveryPoints the recoveryPoints value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withRecoveryPoints(Integer recoveryPoints) {
        this.recoveryPoints = recoveryPoints;
        return this;
    }

    /**
     * Get the applicationConsistentSnapshotFrequencyInHours property: A value indicating the application consistent
     * frequency.
     * 
     * @return the applicationConsistentSnapshotFrequencyInHours value.
     */
    public Integer applicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * Set the applicationConsistentSnapshotFrequencyInHours property: A value indicating the application consistent
     * frequency.
     * 
     * @param applicationConsistentSnapshotFrequencyInHours the applicationConsistentSnapshotFrequencyInHours value to
     * set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput
        withApplicationConsistentSnapshotFrequencyInHours(Integer applicationConsistentSnapshotFrequencyInHours) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        return this;
    }

    /**
     * Get the compression property: A value indicating whether compression has to be enabled.
     * 
     * @return the compression value.
     */
    public String compression() {
        return this.compression;
    }

    /**
     * Set the compression property: A value indicating whether compression has to be enabled.
     * 
     * @param compression the compression value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withCompression(String compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the initialReplicationMethod property: A value indicating whether IR is online.
     * 
     * @return the initialReplicationMethod value.
     */
    public String initialReplicationMethod() {
        return this.initialReplicationMethod;
    }

    /**
     * Set the initialReplicationMethod property: A value indicating whether IR is online.
     * 
     * @param initialReplicationMethod the initialReplicationMethod value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withInitialReplicationMethod(String initialReplicationMethod) {
        this.initialReplicationMethod = initialReplicationMethod;
        return this;
    }

    /**
     * Get the onlineReplicationStartTime property: A value indicating the online IR start time.
     * 
     * @return the onlineReplicationStartTime value.
     */
    public String onlineReplicationStartTime() {
        return this.onlineReplicationStartTime;
    }

    /**
     * Set the onlineReplicationStartTime property: A value indicating the online IR start time.
     * 
     * @param onlineReplicationStartTime the onlineReplicationStartTime value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withOnlineReplicationStartTime(String onlineReplicationStartTime) {
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        return this;
    }

    /**
     * Get the offlineReplicationImportPath property: A value indicating the offline IR import path.
     * 
     * @return the offlineReplicationImportPath value.
     */
    public String offlineReplicationImportPath() {
        return this.offlineReplicationImportPath;
    }

    /**
     * Set the offlineReplicationImportPath property: A value indicating the offline IR import path.
     * 
     * @param offlineReplicationImportPath the offlineReplicationImportPath value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withOfflineReplicationImportPath(String offlineReplicationImportPath) {
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        return this;
    }

    /**
     * Get the offlineReplicationExportPath property: A value indicating the offline IR export path.
     * 
     * @return the offlineReplicationExportPath value.
     */
    public String offlineReplicationExportPath() {
        return this.offlineReplicationExportPath;
    }

    /**
     * Set the offlineReplicationExportPath property: A value indicating the offline IR export path.
     * 
     * @param offlineReplicationExportPath the offlineReplicationExportPath value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withOfflineReplicationExportPath(String offlineReplicationExportPath) {
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        return this;
    }

    /**
     * Get the replicationPort property: A value indicating the recovery HTTPS port.
     * 
     * @return the replicationPort value.
     */
    public Integer replicationPort() {
        return this.replicationPort;
    }

    /**
     * Set the replicationPort property: A value indicating the recovery HTTPS port.
     * 
     * @param replicationPort the replicationPort value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withReplicationPort(Integer replicationPort) {
        this.replicationPort = replicationPort;
        return this;
    }

    /**
     * Get the allowedAuthenticationType property: A value indicating the authentication type.
     * 
     * @return the allowedAuthenticationType value.
     */
    public Integer allowedAuthenticationType() {
        return this.allowedAuthenticationType;
    }

    /**
     * Set the allowedAuthenticationType property: A value indicating the authentication type.
     * 
     * @param allowedAuthenticationType the allowedAuthenticationType value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withAllowedAuthenticationType(Integer allowedAuthenticationType) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        return this;
    }

    /**
     * Get the replicaDeletion property: A value indicating whether the VM has to be auto deleted.
     * 
     * @return the replicaDeletion value.
     */
    public String replicaDeletion() {
        return this.replicaDeletion;
    }

    /**
     * Set the replicaDeletion property: A value indicating whether the VM has to be auto deleted.
     * 
     * @param replicaDeletion the replicaDeletion value to set.
     * @return the HyperVReplicaPolicyInput object itself.
     */
    public HyperVReplicaPolicyInput withReplicaDeletion(String replicaDeletion) {
        this.replicaDeletion = replicaDeletion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
