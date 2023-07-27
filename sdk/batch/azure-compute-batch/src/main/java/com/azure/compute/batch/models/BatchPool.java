// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/** A Pool in the Azure Batch service. */
@Immutable
public final class BatchPool {

    /*
     * The ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot
     * contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two
     * IDs within an Account that differ only by case).
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The display name need not be unique and can contain any Unicode characters up
     * to a maximum length of 1024.
     */
    @Generated
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The URL of the Pool.
     */
    @Generated
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * This is an opaque string. You can use it to detect whether the Pool has changed
     * between requests. In particular, you can be pass the ETag when updating a Pool
     * to specify that your changes should take effect only if nobody else has
     * modified the Pool in the meantime.
     */
    @Generated
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String eTag;

    /*
     * This is the last time at which the Pool level data, such as the
     * targetDedicatedNodes or enableAutoscale settings, changed. It does not factor
     * in node-level changes such as a Compute Node changing state.
     */
    @Generated
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The creation time of the Pool.
     */
    @Generated
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The current state of the Pool.
     */
    @Generated
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private PoolState state;

    /*
     * The time at which the Pool entered its current state.
     */
    @Generated
    @JsonProperty(value = "stateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime stateTransitionTime;

    /*
     * Whether the Pool is resizing.
     */
    @Generated
    @JsonProperty(value = "allocationState", access = JsonProperty.Access.WRITE_ONLY)
    private AllocationState allocationState;

    /*
     * The time at which the Pool entered its current allocation state.
     */
    @Generated
    @JsonProperty(value = "allocationStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime allocationStateTransitionTime;

    /*
     * For information about available sizes of virtual machines in Pools, see Choose
     * a VM size for Compute Nodes in an Azure Batch Pool
     * (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     */
    @Generated
    @JsonProperty(value = "vmSize", access = JsonProperty.Access.WRITE_ONLY)
    private String vmSize;

    /*
     * This property and virtualMachineConfiguration are mutually exclusive and one of the properties must be
     * specified. This property cannot be specified if the Batch Account was created with its poolAllocationMode
     * property set to 'UserSubscription'.
     */
    @Generated
    @JsonProperty(value = "cloudServiceConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private CloudServiceConfiguration cloudServiceConfiguration;

    /*
     * This property and cloudServiceConfiguration are mutually exclusive and one of
     * the properties must be specified.
     */
    @Generated
    @JsonProperty(value = "virtualMachineConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /*
     * This is the timeout for the most recent resize operation. (The initial sizing
     * when the Pool is created counts as a resize.) The default value is 15 minutes.
     */
    @Generated
    @JsonProperty(value = "resizeTimeout", access = JsonProperty.Access.WRITE_ONLY)
    private Duration resizeTimeout;

    /*
     * This property is set only if one or more errors occurred during the last Pool
     * resize, and only when the Pool allocationState is Steady.
     */
    @Generated
    @JsonProperty(value = "resizeErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResizeError> resizeErrors;

    /*
     * The number of dedicated Compute Nodes currently in the Pool.
     */
    @Generated
    @JsonProperty(value = "currentDedicatedNodes", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentDedicatedNodes;

    /*
     * Spot/Low-priority Compute Nodes which have been preempted are included in this
     * count.
     */
    @Generated
    @JsonProperty(value = "currentLowPriorityNodes", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentLowPriorityNodes;

    /*
     * The desired number of dedicated Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "targetDedicatedNodes", access = JsonProperty.Access.WRITE_ONLY)
    private Integer targetDedicatedNodes;

    /*
     * The desired number of Spot/Low-priority Compute Nodes in the Pool.
     */
    @Generated
    @JsonProperty(value = "targetLowPriorityNodes", access = JsonProperty.Access.WRITE_ONLY)
    private Integer targetLowPriorityNodes;

    /*
     * If false, at least one of targetDedicatedNodes and targetLowPriorityNodes must
     * be specified. If true, the autoScaleFormula property is required and the Pool
     * automatically resizes according to the formula. The default value is false.
     */
    @Generated
    @JsonProperty(value = "enableAutoScale", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enableAutoScale;

    /*
     * This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @Generated
    @JsonProperty(value = "autoScaleFormula", access = JsonProperty.Access.WRITE_ONLY)
    private String autoScaleFormula;

    /*
     * This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @Generated
    @JsonProperty(value = "autoScaleEvaluationInterval", access = JsonProperty.Access.WRITE_ONLY)
    private Duration autoScaleEvaluationInterval;

    /*
     * This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @Generated
    @JsonProperty(value = "autoScaleRun", access = JsonProperty.Access.WRITE_ONLY)
    private AutoScaleRun autoScaleRun;

    /*
     * This imposes restrictions on which Compute Nodes can be assigned to the Pool.
     * Specifying this value can reduce the chance of the requested number of Compute
     * Nodes to be allocated in the Pool.
     */
    @Generated
    @JsonProperty(value = "enableInterNodeCommunication", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enableInterNodeCommunication;

    /*
     * The network configuration for a Pool.
     */
    @Generated
    @JsonProperty(value = "networkConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkConfiguration networkConfiguration;

    /*
     * Batch will retry Tasks when a recovery operation is triggered on a Node.
     * Examples of recovery operations include (but are not limited to) when an
     * unhealthy Node is rebooted or a Compute Node disappeared due to host failure.
     * Retries due to recovery operations are independent of and are not counted
     * against the maxTaskRetryCount. Even if the maxTaskRetryCount is 0, an internal
     * retry due to a recovery operation may occur. Because of this, all Tasks should
     * be idempotent. This means Tasks need to tolerate being interrupted and
     * restarted without causing any corruption or duplicate data. The best practice
     * for long running Tasks is to use some form of checkpointing. In some cases the
     * StartTask may be re-run even though the Compute Node was not rebooted. Special
     * care should be taken to avoid StartTasks which create breakaway process or
     * install/launch services from the StartTask working directory, as this will
     * block Batch from being able to re-run the StartTask.
     */
    @Generated
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /*
     * For Windows Nodes, the Batch service installs the Certificates to the specified
     * Certificate store and location. For Linux Compute Nodes, the Certificates are
     * stored in a directory inside the Task working directory and an environment
     * variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this
     * location. For Certificates with visibility of 'remoteUser', a 'certs' directory
     * is created in the user's home directory (e.g., /home/{user-name}/certs) and
     * Certificates are placed in that directory.
     */
    @Generated
    @JsonProperty(value = "certificateReferences", access = JsonProperty.Access.WRITE_ONLY)
    private List<CertificateReference> certificateReferences;

    /*
     * Changes to Package references affect all new Nodes joining the Pool, but do not
     * affect Compute Nodes that are already in the Pool until they are rebooted or
     * reimaged. There is a maximum of 10 Package references on any given Pool.
     */
    @Generated
    @JsonProperty(value = "applicationPackageReferences", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationPackageReference> applicationPackageReferences;

    /*
     * The list of application licenses must be a subset of available Batch service application licenses. If a license
     * is requested which is not supported, Pool creation will fail.
     */
    @Generated
    @JsonProperty(value = "applicationLicenses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> applicationLicenses;

    /*
     * The default value is 1. The maximum value is the smaller of 4 times the number
     * of cores of the vmSize of the pool or 256.
     */
    @Generated
    @JsonProperty(value = "taskSlotsPerNode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer taskSlotsPerNode;

    /*
     * If not specified, the default is spread.
     */
    @Generated
    @JsonProperty(value = "taskSchedulingPolicy", access = JsonProperty.Access.WRITE_ONLY)
    private TaskSchedulingPolicy taskSchedulingPolicy;

    /*
     * The list of user Accounts to be created on each Compute Node in the Pool.
     */
    @Generated
    @JsonProperty(value = "userAccounts", access = JsonProperty.Access.WRITE_ONLY)
    private List<UserAccount> userAccounts;

    /*
     * A list of name-value pairs associated with the Pool as metadata.
     */
    @Generated
    @JsonProperty(value = "metadata", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetadataItem> metadata;

    /*
     * This property is populated only if the CloudPool was retrieved with an expand
     * clause including the 'stats' attribute; otherwise it is null. The statistics
     * may not be immediately available. The Batch service performs periodic roll-up
     * of statistics. The typical delay is about 30 minutes.
     */
    @Generated
    @JsonProperty(value = "stats", access = JsonProperty.Access.WRITE_ONLY)
    private PoolStatistics stats;

    /*
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     */
    @Generated
    @JsonProperty(value = "mountConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private List<MountConfiguration> mountConfiguration;

    /*
     * The list of user identities associated with the Batch pool. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @Generated
    @JsonProperty(value = "identity", access = JsonProperty.Access.WRITE_ONLY)
    private BatchPoolIdentity identity;

    /*
     * If omitted, the default value is Default.
     */
    @Generated
    @JsonProperty(value = "targetNodeCommunicationMode")
    private NodeCommunicationMode targetNodeCommunicationMode;

    /*
     * The current state of the pool communication mode.
     */
    @Generated
    @JsonProperty(value = "currentNodeCommunicationMode", access = JsonProperty.Access.WRITE_ONLY)
    private NodeCommunicationMode currentNodeCommunicationMode;

    /**
     * Get the id property: The ID can contain any combination of alphanumeric characters including hyphens and
     * underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is,
     * you may not have two IDs within an Account that differ only by case).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name need not be unique and can contain any Unicode characters up to a
     * maximum length of 1024.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the url property: The URL of the Pool.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the eTag property: This is an opaque string. You can use it to detect whether the Pool has changed between
     * requests. In particular, you can be pass the ETag when updating a Pool to specify that your changes should take
     * effect only if nobody else has modified the Pool in the meantime.
     *
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Get the lastModified property: This is the last time at which the Pool level data, such as the
     * targetDedicatedNodes or enableAutoscale settings, changed. It does not factor in node-level changes such as a
     * Compute Node changing state.
     *
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    /**
     * Get the creationTime property: The creation time of the Pool.
     *
     * @return the creationTime value.
     */
    @Generated
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the state property: The current state of the Pool.
     *
     * @return the state value.
     */
    @Generated
    public PoolState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Pool entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the allocationState property: Whether the Pool is resizing.
     *
     * @return the allocationState value.
     */
    @Generated
    public AllocationState getAllocationState() {
        return this.allocationState;
    }

    /**
     * Get the allocationStateTransitionTime property: The time at which the Pool entered its current allocation state.
     *
     * @return the allocationStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getAllocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }

    /**
     * Get the vmSize property: For information about available sizes of virtual machines in Pools, see Choose a VM size
     * for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @return the vmSize value.
     */
    @Generated
    public String getVmSize() {
        return this.vmSize;
    }

    /**
     * Get the cloudServiceConfiguration property: This property and virtualMachineConfiguration are mutually exclusive
     * and one of the properties must be specified. This property cannot be specified if the Batch Account was created
     * with its poolAllocationMode property set to 'UserSubscription'.
     *
     * @return the cloudServiceConfiguration value.
     */
    @Generated
    public CloudServiceConfiguration getCloudServiceConfiguration() {
        return this.cloudServiceConfiguration;
    }

    /**
     * Get the virtualMachineConfiguration property: This property and cloudServiceConfiguration are mutually exclusive
     * and one of the properties must be specified.
     *
     * @return the virtualMachineConfiguration value.
     */
    @Generated
    public VirtualMachineConfiguration getVirtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Get the resizeTimeout property: This is the timeout for the most recent resize operation. (The initial sizing
     * when the Pool is created counts as a resize.) The default value is 15 minutes.
     *
     * @return the resizeTimeout value.
     */
    @Generated
    public Duration getResizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Get the resizeErrors property: This property is set only if one or more errors occurred during the last Pool
     * resize, and only when the Pool allocationState is Steady.
     *
     * @return the resizeErrors value.
     */
    @Generated
    public List<ResizeError> getResizeErrors() {
        return this.resizeErrors;
    }

    /**
     * Get the currentDedicatedNodes property: The number of dedicated Compute Nodes currently in the Pool.
     *
     * @return the currentDedicatedNodes value.
     */
    @Generated
    public Integer getCurrentDedicatedNodes() {
        return this.currentDedicatedNodes;
    }

    /**
     * Get the currentLowPriorityNodes property: Spot/Low-priority Compute Nodes which have been preempted are included
     * in this count.
     *
     * @return the currentLowPriorityNodes value.
     */
    @Generated
    public Integer getCurrentLowPriorityNodes() {
        return this.currentLowPriorityNodes;
    }

    /**
     * Get the targetDedicatedNodes property: The desired number of dedicated Compute Nodes in the Pool.
     *
     * @return the targetDedicatedNodes value.
     */
    @Generated
    public Integer getTargetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Get the targetLowPriorityNodes property: The desired number of Spot/Low-priority Compute Nodes in the Pool.
     *
     * @return the targetLowPriorityNodes value.
     */
    @Generated
    public Integer getTargetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Get the enableAutoScale property: If false, at least one of targetDedicatedNodes and targetLowPriorityNodes must
     * be specified. If true, the autoScaleFormula property is required and the Pool automatically resizes according to
     * the formula. The default value is false.
     *
     * @return the enableAutoScale value.
     */
    @Generated
    public Boolean isEnableAutoScale() {
        return this.enableAutoScale;
    }

    /**
     * Get the autoScaleFormula property: This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     *
     * @return the autoScaleFormula value.
     */
    @Generated
    public String getAutoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Get the autoScaleEvaluationInterval property: This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     *
     * @return the autoScaleEvaluationInterval value.
     */
    @Generated
    public Duration getAutoScaleEvaluationInterval() {
        return this.autoScaleEvaluationInterval;
    }

    /**
     * Get the autoScaleRun property: This property is set only if the Pool automatically scales, i.e. enableAutoScale
     * is true.
     *
     * @return the autoScaleRun value.
     */
    @Generated
    public AutoScaleRun getAutoScaleRun() {
        return this.autoScaleRun;
    }

    /**
     * Get the enableInterNodeCommunication property: This imposes restrictions on which Compute Nodes can be assigned
     * to the Pool. Specifying this value can reduce the chance of the requested number of Compute Nodes to be allocated
     * in the Pool.
     *
     * @return the enableInterNodeCommunication value.
     */
    @Generated
    public Boolean isEnableInterNodeCommunication() {
        return this.enableInterNodeCommunication;
    }

    /**
     * Get the networkConfiguration property: The network configuration for a Pool.
     *
     * @return the networkConfiguration value.
     */
    @Generated
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Get the startTask property: Batch will retry Tasks when a recovery operation is triggered on a Node. Examples of
     * recovery operations include (but are not limited to) when an unhealthy Node is rebooted or a Compute Node
     * disappeared due to host failure. Retries due to recovery operations are independent of and are not counted
     * against the maxTaskRetryCount. Even if the maxTaskRetryCount is 0, an internal retry due to a recovery operation
     * may occur. Because of this, all Tasks should be idempotent. This means Tasks need to tolerate being interrupted
     * and restarted without causing any corruption or duplicate data. The best practice for long running Tasks is to
     * use some form of checkpointing. In some cases the StartTask may be re-run even though the Compute Node was not
     * rebooted. Special care should be taken to avoid StartTasks which create breakaway process or install/launch
     * services from the StartTask working directory, as this will block Batch from being able to re-run the StartTask.
     *
     * @return the startTask value.
     */
    @Generated
    public StartTask getStartTask() {
        return this.startTask;
    }

    /**
     * Get the certificateReferences property: For Windows Nodes, the Batch service installs the Certificates to the
     * specified Certificate store and location. For Linux Compute Nodes, the Certificates are stored in a directory
     * inside the Task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task
     * to query for this location. For Certificates with visibility of 'remoteUser', a 'certs' directory is created in
     * the user's home directory (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     *
     * @return the certificateReferences value.
     */
    @Generated
    public List<CertificateReference> getCertificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set for Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and
     * location. For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory
     * and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For
     * Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and Certificates are placed in that directory.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the BatchPool object itself.
     */
    public BatchPool setCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the applicationPackageReferences property: Changes to Package references affect all new Nodes joining the
     * Pool, but do not affect Compute Nodes that are already in the Pool until they are rebooted or reimaged. There is
     * a maximum of 10 Package references on any given Pool.
     *
     * @return the applicationPackageReferences value.
     */
    @Generated
    public List<ApplicationPackageReference> getApplicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are
     * already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any given
     * Pool.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the BatchPool object itself.
     */
    public BatchPool setApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the applicationLicenses property: The list of application licenses must be a subset of available Batch
     * service application licenses. If a license is requested which is not supported, Pool creation will fail.
     *
     * @return the applicationLicenses value.
     */
    @Generated
    public List<String> getApplicationLicenses() {
        return this.applicationLicenses;
    }

    /**
     * Get the taskSlotsPerNode property: The default value is 1. The maximum value is the smaller of 4 times the number
     * of cores of the vmSize of the pool or 256.
     *
     * @return the taskSlotsPerNode value.
     */
    @Generated
    public Integer getTaskSlotsPerNode() {
        return this.taskSlotsPerNode;
    }

    /**
     * Get the taskSchedulingPolicy property: If not specified, the default is spread.
     *
     * @return the taskSchedulingPolicy value.
     */
    @Generated
    public TaskSchedulingPolicy getTaskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }

    /**
     * Get the userAccounts property: The list of user Accounts to be created on each Compute Node in the Pool.
     *
     * @return the userAccounts value.
     */
    @Generated
    public List<UserAccount> getUserAccounts() {
        return this.userAccounts;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the Pool as metadata.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the BatchPool object itself.
     */
    public BatchPool setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the stats property: This property is populated only if the CloudPool was retrieved with an expand clause
     * including the 'stats' attribute; otherwise it is null. The statistics may not be immediately available. The Batch
     * service performs periodic roll-up of statistics. The typical delay is about 30 minutes.
     *
     * @return the stats value.
     */
    @Generated
    public PoolStatistics getStats() {
        return this.stats;
    }

    /**
     * Get the mountConfiguration property: This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     *
     * @return the mountConfiguration value.
     */
    @Generated
    public List<MountConfiguration> getMountConfiguration() {
        return this.mountConfiguration;
    }

    /**
     * Get the identity property: The list of user identities associated with the Batch pool. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the identity value.
     */
    @Generated
    public BatchPoolIdentity getIdentity() {
        return this.identity;
    }

    /**
     * Get the targetNodeCommunicationMode property: If omitted, the default value is Default.
     *
     * @return the targetNodeCommunicationMode value.
     */
    @Generated
    public NodeCommunicationMode getTargetNodeCommunicationMode() {
        return this.targetNodeCommunicationMode;
    }

    /**
     * Get the currentNodeCommunicationMode property: The current state of the pool communication mode.
     *
     * @return the currentNodeCommunicationMode value.
     */
    @Generated
    public NodeCommunicationMode getCurrentNodeCommunicationMode() {
        return this.currentNodeCommunicationMode;
    }

    /** Creates an instance of BatchPool class. */
    @Generated
    private BatchPool() {}
}
