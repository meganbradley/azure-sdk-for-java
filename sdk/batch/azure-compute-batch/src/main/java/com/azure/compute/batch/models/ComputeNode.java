// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A Compute Node in the Batch service. */
@Immutable
public final class ComputeNode {
    /*
     * Every Compute Node that is added to a Pool is assigned a unique ID. Whenever a
     * Compute Node is removed from a Pool, all of its local files are deleted, and
     * the ID is reclaimed and could be reused for new Compute Nodes.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The URL of the Compute Node.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * The Spot/Low-priority Compute Node has been preempted. Tasks which were running
     * on the Compute Node when it was preempted will be rescheduled when another
     * Compute Node becomes available.
     */
    @JsonProperty(value = "state")
    private ComputeNodeState state;

    /*
     * Whether the Compute Node is available for Task scheduling.
     */
    @JsonProperty(value = "schedulingState")
    private SchedulingState schedulingState;

    /*
     * The time at which the Compute Node entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private OffsetDateTime stateTransitionTime;

    /*
     * This property may not be present if the Compute Node state is unusable.
     */
    @JsonProperty(value = "lastBootTime")
    private OffsetDateTime lastBootTime;

    /*
     * This is the time when the Compute Node was initially allocated and doesn't
     * change once set. It is not updated when the Compute Node is service healed or
     * preempted.
     */
    @JsonProperty(value = "allocationTime")
    private OffsetDateTime allocationTime;

    /*
     * Every Compute Node that is added to a Pool is assigned a unique IP address.
     * Whenever a Compute Node is removed from a Pool, all of its local files are
     * deleted, and the IP address is reclaimed and could be reused for new Compute
     * Nodes.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Note that this is just a soft affinity. If the target Compute Node is busy or
     * unavailable at the time the Task is scheduled, then the Task will be scheduled
     * elsewhere.
     */
    @JsonProperty(value = "affinityId")
    private String affinityId;

    /*
     * For information about available sizes of virtual machines in Pools, see Choose
     * a VM size for Compute Nodes in an Azure Batch Pool
     * (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * The total number of Job Tasks completed on the Compute Node. This includes Job
     * Manager Tasks and normal Tasks, but not Job Preparation, Job Release or Start
     * Tasks.
     */
    @JsonProperty(value = "totalTasksRun")
    private Integer totalTasksRun;

    /*
     * The total number of currently running Job Tasks on the Compute Node. This
     * includes Job Manager Tasks and normal Tasks, but not Job Preparation, Job
     * Release or Start Tasks.
     */
    @JsonProperty(value = "runningTasksCount")
    private Integer runningTasksCount;

    /*
     * The total number of scheduling slots used by currently running Job Tasks on the
     * Compute Node. This includes Job Manager Tasks and normal Tasks, but not Job
     * Preparation, Job Release or Start Tasks.
     */
    @JsonProperty(value = "runningTaskSlotsCount")
    private Integer runningTaskSlotsCount;

    /*
     * The total number of Job Tasks which completed successfully (with exitCode 0) on
     * the Compute Node. This includes Job Manager Tasks and normal Tasks, but not Job
     * Preparation, Job Release or Start Tasks.
     */
    @JsonProperty(value = "totalTasksSucceeded")
    private Integer totalTasksSucceeded;

    /*
     * This property is present only if at least one Task has run on this Compute Node
     * since it was assigned to the Pool.
     */
    @JsonProperty(value = "recentTasks")
    private List<TaskInformation> recentTasks;

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
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /*
     * Information about a StartTask running on a Compute Node.
     */
    @JsonProperty(value = "startTaskInfo")
    private StartTaskInformation startTaskInfo;

    /*
     * For Windows Nodes, the Batch service installs the Certificates to the specified
     * Certificate store and location. For Linux Compute Nodes, the Certificates are
     * stored in a directory inside the Task working directory and an environment
     * variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this
     * location. For Certificates with visibility of 'remoteUser', a 'certs' directory
     * is created in the user's home directory (e.g., /home/{user-name}/certs) and
     * Certificates are placed in that directory.
     */
    @JsonProperty(value = "certificateReferences")
    private List<CertificateReference> certificateReferences;

    /*
     * The list of errors that are currently being encountered by the Compute Node.
     */
    @JsonProperty(value = "errors")
    private List<ComputeNodeError> errors;

    /*
     * Whether this Compute Node is a dedicated Compute Node. If false, the Compute
     * Node is a Spot/Low-priority Compute Node.
     */
    @JsonProperty(value = "isDedicated")
    private Boolean isDedicated;

    /*
     * The endpoint configuration for the Compute Node.
     */
    @JsonProperty(value = "endpointConfiguration")
    private ComputeNodeEndpointConfiguration endpointConfiguration;

    /*
     * The Batch Compute Node agent is a program that runs on each Compute Node in the
     * Pool and provides Batch capability on the Compute Node.
     */
    @JsonProperty(value = "nodeAgentInfo")
    private NodeAgentInformation nodeAgentInfo;

    /*
     * Info about the current state of the virtual machine.
     */
    @JsonProperty(value = "virtualMachineInfo")
    private VirtualMachineInfo virtualMachineInfo;

    /** Creates an instance of ComputeNode class. */
    private ComputeNode() {}

    /**
     * Get the id property: Every Compute Node that is added to a Pool is assigned a unique ID. Whenever a Compute Node
     * is removed from a Pool, all of its local files are deleted, and the ID is reclaimed and could be reused for new
     * Compute Nodes.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the url property: The URL of the Compute Node.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the state property: The Spot/Low-priority Compute Node has been preempted. Tasks which were running on the
     * Compute Node when it was preempted will be rescheduled when another Compute Node becomes available.
     *
     * @return the state value.
     */
    public ComputeNodeState getState() {
        return this.state;
    }

    /**
     * Get the schedulingState property: Whether the Compute Node is available for Task scheduling.
     *
     * @return the schedulingState value.
     */
    public SchedulingState getSchedulingState() {
        return this.schedulingState;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Compute Node entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the lastBootTime property: This property may not be present if the Compute Node state is unusable.
     *
     * @return the lastBootTime value.
     */
    public OffsetDateTime getLastBootTime() {
        return this.lastBootTime;
    }

    /**
     * Get the allocationTime property: This is the time when the Compute Node was initially allocated and doesn't
     * change once set. It is not updated when the Compute Node is service healed or preempted.
     *
     * @return the allocationTime value.
     */
    public OffsetDateTime getAllocationTime() {
        return this.allocationTime;
    }

    /**
     * Get the ipAddress property: Every Compute Node that is added to a Pool is assigned a unique IP address. Whenever
     * a Compute Node is removed from a Pool, all of its local files are deleted, and the IP address is reclaimed and
     * could be reused for new Compute Nodes.
     *
     * @return the ipAddress value.
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Get the affinityId property: Note that this is just a soft affinity. If the target Compute Node is busy or
     * unavailable at the time the Task is scheduled, then the Task will be scheduled elsewhere.
     *
     * @return the affinityId value.
     */
    public String getAffinityId() {
        return this.affinityId;
    }

    /**
     * Get the vmSize property: For information about available sizes of virtual machines in Pools, see Choose a VM size
     * for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @return the vmSize value.
     */
    public String getVmSize() {
        return this.vmSize;
    }

    /**
     * Get the totalTasksRun property: The total number of Job Tasks completed on the Compute Node. This includes Job
     * Manager Tasks and normal Tasks, but not Job Preparation, Job Release or Start Tasks.
     *
     * @return the totalTasksRun value.
     */
    public Integer getTotalTasksRun() {
        return this.totalTasksRun;
    }

    /**
     * Get the runningTasksCount property: The total number of currently running Job Tasks on the Compute Node. This
     * includes Job Manager Tasks and normal Tasks, but not Job Preparation, Job Release or Start Tasks.
     *
     * @return the runningTasksCount value.
     */
    public Integer getRunningTasksCount() {
        return this.runningTasksCount;
    }

    /**
     * Get the runningTaskSlotsCount property: The total number of scheduling slots used by currently running Job Tasks
     * on the Compute Node. This includes Job Manager Tasks and normal Tasks, but not Job Preparation, Job Release or
     * Start Tasks.
     *
     * @return the runningTaskSlotsCount value.
     */
    public Integer getRunningTaskSlotsCount() {
        return this.runningTaskSlotsCount;
    }

    /**
     * Get the totalTasksSucceeded property: The total number of Job Tasks which completed successfully (with exitCode
     * 0) on the Compute Node. This includes Job Manager Tasks and normal Tasks, but not Job Preparation, Job Release or
     * Start Tasks.
     *
     * @return the totalTasksSucceeded value.
     */
    public Integer getTotalTasksSucceeded() {
        return this.totalTasksSucceeded;
    }

    /**
     * Get the recentTasks property: This property is present only if at least one Task has run on this Compute Node
     * since it was assigned to the Pool.
     *
     * @return the recentTasks value.
     */
    public List<TaskInformation> getRecentTasks() {
        return this.recentTasks;
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
    public StartTask getStartTask() {
        return this.startTask;
    }

    /**
     * Get the startTaskInfo property: Information about a StartTask running on a Compute Node.
     *
     * @return the startTaskInfo value.
     */
    public StartTaskInformation getStartTaskInfo() {
        return this.startTaskInfo;
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
    public List<CertificateReference> getCertificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Get the errors property: The list of errors that are currently being encountered by the Compute Node.
     *
     * @return the errors value.
     */
    public List<ComputeNodeError> getErrors() {
        return this.errors;
    }

    /**
     * Get the isDedicated property: Whether this Compute Node is a dedicated Compute Node. If false, the Compute Node
     * is a Spot/Low-priority Compute Node.
     *
     * @return the isDedicated value.
     */
    public Boolean isDedicated() {
        return this.isDedicated;
    }

    /**
     * Get the endpointConfiguration property: The endpoint configuration for the Compute Node.
     *
     * @return the endpointConfiguration value.
     */
    public ComputeNodeEndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * Get the nodeAgentInfo property: The Batch Compute Node agent is a program that runs on each Compute Node in the
     * Pool and provides Batch capability on the Compute Node.
     *
     * @return the nodeAgentInfo value.
     */
    public NodeAgentInformation getNodeAgentInfo() {
        return this.nodeAgentInfo;
    }

    /**
     * Get the virtualMachineInfo property: Info about the current state of the virtual machine.
     *
     * @return the virtualMachineInfo value.
     */
    public VirtualMachineInfo getVirtualMachineInfo() {
        return this.virtualMachineInfo;
    }
}
