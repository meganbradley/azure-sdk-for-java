// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/**
 * Parameters for creating an Azure Batch Pool.
 */
@Fluent
public final class BatchPoolCreateParameters {

    /*
     * A string that uniquely identifies the Pool within the Account. The ID can contain any combination of
     * alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is
     * case-preserving and case-insensitive (that is, you may not have two Pool IDs within an Account that differ only
     * by case).
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The display name for the Pool. The display name need not be unique and can contain any Unicode characters up to
     * a maximum length of 1024.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The size of virtual machines in the Pool. All virtual machines in a Pool are the same size. For information
     * about available sizes of virtual machines for Cloud Services Pools (pools created with
     * cloudServiceConfiguration), see Sizes for Cloud Services
     * (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud
     * Services VM sizes except ExtraSmall, A1V2 and A2V2. For information about available VM sizes for Pools using
     * Images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for
     * Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or
     * Sizes for Virtual Machines (Windows)
     * (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure
     * VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     */
    @Generated
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * The cloud service configuration for the Pool. This property and virtualMachineConfiguration are mutually
     * exclusive and one of the properties must be specified. This property cannot be specified if the Batch Account
     * was created with its poolAllocationMode property set to 'UserSubscription'.
     */
    @Generated
    @JsonProperty(value = "cloudServiceConfiguration")
    private CloudServiceConfiguration cloudServiceConfiguration;

    /*
     * The virtual machine configuration for the Pool. This property and cloudServiceConfiguration are mutually
     * exclusive and one of the properties must be specified.
     */
    @Generated
    @JsonProperty(value = "virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /*
     * The timeout for allocation of Compute Nodes to the Pool. This timeout applies only to manual scaling; it has no
     * effect when enableAutoScale is set to true. The default value is 15 minutes. The minimum value is 5 minutes. If
     * you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API
     * directly, the HTTP status code is 400 (Bad Request).
     */
    @Generated
    @JsonProperty(value = "resizeTimeout")
    private Duration resizeTimeout;

    /*
     * The desired number of dedicated Compute Nodes in the Pool. This property must not be specified if
     * enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either
     * targetDedicatedNodes, targetLowPriorityNodes, or both.
     */
    @Generated
    @JsonProperty(value = "targetDedicatedNodes")
    private Integer targetDedicatedNodes;

    /*
     * The desired number of Spot/Low-priority Compute Nodes in the Pool. This property must not be specified if
     * enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either
     * targetDedicatedNodes, targetLowPriorityNodes, or both.
     */
    @Generated
    @JsonProperty(value = "targetLowPriorityNodes")
    private Integer targetLowPriorityNodes;

    /*
     * Whether the Pool size should automatically adjust over time. If false, at least one of targetDedicatedNodes and
     * targetLowPriorityNodes must be specified. If true, the autoScaleFormula property is required and the Pool
     * automatically resizes according to the formula. The default value is false.
     */
    @Generated
    @JsonProperty(value = "enableAutoScale")
    private Boolean enableAutoScale;

    /*
     * A formula for the desired number of Compute Nodes in the Pool. This property must not be specified if
     * enableAutoScale is set to false. It is required if enableAutoScale is set to true. The formula is checked for
     * validity before the Pool is created. If the formula is not valid, the Batch service rejects the request with
     * detailed error information. For more information about specifying this formula, see 'Automatically scale Compute
     * Nodes in an Azure Batch Pool' (https://azure.microsoft.com/documentation/articles/batch-automatic-scaling/).
     */
    @Generated
    @JsonProperty(value = "autoScaleFormula")
    private String autoScaleFormula;

    /*
     * The time interval at which to automatically adjust the Pool size according to the autoscale formula. The default
     * value is 15 minutes. The minimum and maximum value are 5 minutes and 168 hours respectively. If you specify a
     * value less than 5 minutes or greater than 168 hours, the Batch service returns an error; if you are calling the
     * REST API directly, the HTTP status code is 400 (Bad Request).
     */
    @Generated
    @JsonProperty(value = "autoScaleEvaluationInterval")
    private Duration autoScaleEvaluationInterval;

    /*
     * Whether the Pool permits direct communication between Compute Nodes. Enabling inter-node communication limits
     * the maximum size of the Pool due to deployment restrictions on the Compute Nodes of the Pool. This may result in
     * the Pool not reaching its desired size. The default value is false.
     */
    @Generated
    @JsonProperty(value = "enableInterNodeCommunication")
    private Boolean enableInterNodeCommunication;

    /*
     * The network configuration for the Pool.
     */
    @Generated
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /*
     * A Task specified to run on each Compute Node as it joins the Pool. The Task runs when the Compute Node is added
     * to the Pool or when the Compute Node is restarted.
     */
    @Generated
    @JsonProperty(value = "startTask")
    private BatchStartTask startTask;

    /*
     * For Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location.
     * For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an
     * environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location.
     * For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory
     * (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     * Warning: This property is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     */
    @Generated
    @JsonProperty(value = "certificateReferences")
    private List<BatchCertificateReference> certificateReferences;

    /*
     * The list of Packages to be installed on each Compute Node in the Pool. When creating a pool, the package's
     * application ID must be fully qualified
     * (/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Batch/batchAccounts/{
     * accountName}/applications/{applicationName}).
     * Changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are
     * already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any
     * given Pool.
     */
    @Generated
    @JsonProperty(value = "applicationPackageReferences")
    private List<BatchApplicationPackageReference> applicationPackageReferences;

    /*
     * The list of application licenses the Batch service will make available on each Compute Node in the Pool. The
     * list of application licenses must be a subset of available Batch service application licenses. If a license is
     * requested which is not supported, Pool creation will fail.
     */
    @Generated
    @JsonProperty(value = "applicationLicenses")
    private List<String> applicationLicenses;

    /*
     * The number of task slots that can be used to run concurrent tasks on a single compute node in the pool. The
     * default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or
     * 256.
     */
    @Generated
    @JsonProperty(value = "taskSlotsPerNode")
    private Integer taskSlotsPerNode;

    /*
     * How Tasks are distributed across Compute Nodes in a Pool. If not specified, the default is spread.
     */
    @Generated
    @JsonProperty(value = "taskSchedulingPolicy")
    private BatchTaskSchedulingPolicy taskSchedulingPolicy;

    /*
     * The list of user Accounts to be created on each Compute Node in the Pool.
     */
    @Generated
    @JsonProperty(value = "userAccounts")
    private List<UserAccount> userAccounts;

    /*
     * A list of name-value pairs associated with the Pool as metadata. The Batch service does not assign any meaning
     * to metadata; it is solely for the use of user code.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /*
     * Mount storage using specified file system for the entire lifetime of the pool. Mount the storage using Azure
     * fileshare, NFS, CIFS or Blobfuse based file system.
     */
    @Generated
    @JsonProperty(value = "mountConfiguration")
    private List<MountConfiguration> mountConfiguration;

    /*
     * The desired node communication mode for the pool. If omitted, the default value is Default.
     */
    @Generated
    @JsonProperty(value = "targetNodeCommunicationMode")
    private BatchNodeCommunicationMode targetNodeCommunicationMode;

    /**
     * Creates an instance of BatchPoolCreateParameters class.
     *
     * @param id the id value to set.
     * @param vmSize the vmSize value to set.
     */
    @Generated
    @JsonCreator
    public BatchPoolCreateParameters(@JsonProperty(value = "id") String id,
        @JsonProperty(value = "vmSize") String vmSize) {
        this.id = id;
        this.vmSize = vmSize;
    }

    /**
     * Get the id property: A string that uniquely identifies the Pool within the Account. The ID can contain any
     * combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64
     * characters. The ID is case-preserving and case-insensitive (that is, you may not have two Pool IDs within an
     * Account that differ only by case).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name for the Pool. The display name need not be unique and can contain
     * any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the Pool. The display name need not be unique and can contain
     * any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the vmSize property: The size of virtual machines in the Pool. All virtual machines in a Pool are the same
     * size. For information about available sizes of virtual machines for Cloud Services Pools (pools created with
     * cloudServiceConfiguration), see Sizes for Cloud Services
     * (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud
     * Services VM sizes except ExtraSmall, A1V2 and A2V2. For information about available VM sizes for Pools using
     * Images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for
     * Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or
     * Sizes for Virtual Machines (Windows)
     * (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure
     * VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     *
     * @return the vmSize value.
     */
    @Generated
    public String getVmSize() {
        return this.vmSize;
    }

    /**
     * Get the cloudServiceConfiguration property: The cloud service configuration for the Pool. This property and
     * virtualMachineConfiguration are mutually exclusive and one of the properties must be specified. This property
     * cannot be specified if the Batch Account was created with its poolAllocationMode property set to
     * 'UserSubscription'.
     *
     * @return the cloudServiceConfiguration value.
     */
    @Generated
    public CloudServiceConfiguration getCloudServiceConfiguration() {
        return this.cloudServiceConfiguration;
    }

    /**
     * Set the cloudServiceConfiguration property: The cloud service configuration for the Pool. This property and
     * virtualMachineConfiguration are mutually exclusive and one of the properties must be specified. This property
     * cannot be specified if the Batch Account was created with its poolAllocationMode property set to
     * 'UserSubscription'.
     *
     * @param cloudServiceConfiguration the cloudServiceConfiguration value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setCloudServiceConfiguration(CloudServiceConfiguration cloudServiceConfiguration) {
        this.cloudServiceConfiguration = cloudServiceConfiguration;
        return this;
    }

    /**
     * Get the virtualMachineConfiguration property: The virtual machine configuration for the Pool. This property and
     * cloudServiceConfiguration are mutually exclusive and one of the properties must be specified.
     *
     * @return the virtualMachineConfiguration value.
     */
    @Generated
    public VirtualMachineConfiguration getVirtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtualMachineConfiguration property: The virtual machine configuration for the Pool. This property and
     * cloudServiceConfiguration are mutually exclusive and one of the properties must be specified.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters
        setVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the resizeTimeout property: The timeout for allocation of Compute Nodes to the Pool. This timeout applies
     * only to manual scaling; it has no effect when enableAutoScale is set to true. The default value is 15 minutes.
     * The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error;
     * if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value.
     */
    @Generated
    public Duration getResizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the resizeTimeout property: The timeout for allocation of Compute Nodes to the Pool. This timeout applies
     * only to manual scaling; it has no effect when enableAutoScale is set to true. The default value is 15 minutes.
     * The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error;
     * if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setResizeTimeout(Duration resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the targetDedicatedNodes property: The desired number of dedicated Compute Nodes in the Pool. This property
     * must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set
     * either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @return the targetDedicatedNodes value.
     */
    @Generated
    public Integer getTargetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Set the targetDedicatedNodes property: The desired number of dedicated Compute Nodes in the Pool. This property
     * must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set
     * either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @param targetDedicatedNodes the targetDedicatedNodes value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setTargetDedicatedNodes(Integer targetDedicatedNodes) {
        this.targetDedicatedNodes = targetDedicatedNodes;
        return this;
    }

    /**
     * Get the targetLowPriorityNodes property: The desired number of Spot/Low-priority Compute Nodes in the Pool. This
     * property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you
     * must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @return the targetLowPriorityNodes value.
     */
    @Generated
    public Integer getTargetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Set the targetLowPriorityNodes property: The desired number of Spot/Low-priority Compute Nodes in the Pool. This
     * property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you
     * must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @param targetLowPriorityNodes the targetLowPriorityNodes value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setTargetLowPriorityNodes(Integer targetLowPriorityNodes) {
        this.targetLowPriorityNodes = targetLowPriorityNodes;
        return this;
    }

    /**
     * Get the enableAutoScale property: Whether the Pool size should automatically adjust over time. If false, at
     * least one of targetDedicatedNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula
     * property is required and the Pool automatically resizes according to the formula. The default value is false.
     *
     * @return the enableAutoScale value.
     */
    @Generated
    public Boolean isEnableAutoScale() {
        return this.enableAutoScale;
    }

    /**
     * Set the enableAutoScale property: Whether the Pool size should automatically adjust over time. If false, at
     * least one of targetDedicatedNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula
     * property is required and the Pool automatically resizes according to the formula. The default value is false.
     *
     * @param enableAutoScale the enableAutoScale value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setEnableAutoScale(Boolean enableAutoScale) {
        this.enableAutoScale = enableAutoScale;
        return this;
    }

    /**
     * Get the autoScaleFormula property: A formula for the desired number of Compute Nodes in the Pool. This property
     * must not be specified if enableAutoScale is set to false. It is required if enableAutoScale is set to true. The
     * formula is checked for validity before the Pool is created. If the formula is not valid, the Batch service
     * rejects the request with detailed error information. For more information about specifying this formula, see
     * 'Automatically scale Compute Nodes in an Azure Batch Pool'
     * (https://azure.microsoft.com/documentation/articles/batch-automatic-scaling/).
     *
     * @return the autoScaleFormula value.
     */
    @Generated
    public String getAutoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Set the autoScaleFormula property: A formula for the desired number of Compute Nodes in the Pool. This property
     * must not be specified if enableAutoScale is set to false. It is required if enableAutoScale is set to true. The
     * formula is checked for validity before the Pool is created. If the formula is not valid, the Batch service
     * rejects the request with detailed error information. For more information about specifying this formula, see
     * 'Automatically scale Compute Nodes in an Azure Batch Pool'
     * (https://azure.microsoft.com/documentation/articles/batch-automatic-scaling/).
     *
     * @param autoScaleFormula the autoScaleFormula value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setAutoScaleFormula(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
        return this;
    }

    /**
     * Get the autoScaleEvaluationInterval property: The time interval at which to automatically adjust the Pool size
     * according to the autoscale formula. The default value is 15 minutes. The minimum and maximum value are 5 minutes
     * and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch
     * service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the autoScaleEvaluationInterval value.
     */
    @Generated
    public Duration getAutoScaleEvaluationInterval() {
        return this.autoScaleEvaluationInterval;
    }

    /**
     * Set the autoScaleEvaluationInterval property: The time interval at which to automatically adjust the Pool size
     * according to the autoscale formula. The default value is 15 minutes. The minimum and maximum value are 5 minutes
     * and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch
     * service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param autoScaleEvaluationInterval the autoScaleEvaluationInterval value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setAutoScaleEvaluationInterval(Duration autoScaleEvaluationInterval) {
        this.autoScaleEvaluationInterval = autoScaleEvaluationInterval;
        return this;
    }

    /**
     * Get the enableInterNodeCommunication property: Whether the Pool permits direct communication between Compute
     * Nodes. Enabling inter-node communication limits the maximum size of the Pool due to deployment restrictions on
     * the Compute Nodes of the Pool. This may result in the Pool not reaching its desired size. The default value is
     * false.
     *
     * @return the enableInterNodeCommunication value.
     */
    @Generated
    public Boolean isEnableInterNodeCommunication() {
        return this.enableInterNodeCommunication;
    }

    /**
     * Set the enableInterNodeCommunication property: Whether the Pool permits direct communication between Compute
     * Nodes. Enabling inter-node communication limits the maximum size of the Pool due to deployment restrictions on
     * the Compute Nodes of the Pool. This may result in the Pool not reaching its desired size. The default value is
     * false.
     *
     * @param enableInterNodeCommunication the enableInterNodeCommunication value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setEnableInterNodeCommunication(Boolean enableInterNodeCommunication) {
        this.enableInterNodeCommunication = enableInterNodeCommunication;
        return this;
    }

    /**
     * Get the networkConfiguration property: The network configuration for the Pool.
     *
     * @return the networkConfiguration value.
     */
    @Generated
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration property: The network configuration for the Pool.
     *
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the startTask property: A Task specified to run on each Compute Node as it joins the Pool. The Task runs
     * when the Compute Node is added to the Pool or when the Compute Node is restarted.
     *
     * @return the startTask value.
     */
    @Generated
    public BatchStartTask getStartTask() {
        return this.startTask;
    }

    /**
     * Set the startTask property: A Task specified to run on each Compute Node as it joins the Pool. The Task runs
     * when the Compute Node is added to the Pool or when the Compute Node is restarted.
     *
     * @param startTask the startTask value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setStartTask(BatchStartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get the certificateReferences property: For Windows Nodes, the Batch service installs the Certificates to the
     * specified Certificate store and location.
     * For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an
     * environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location.
     * For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory
     * (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     * Warning: This property is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     *
     * @return the certificateReferences value.
     */
    @Generated
    public List<BatchCertificateReference> getCertificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set the certificateReferences property: For Windows Nodes, the Batch service installs the Certificates to the
     * specified Certificate store and location.
     * For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an
     * environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location.
     * For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory
     * (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     * Warning: This property is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     *
     * @param certificateReferences the certificateReferences value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setCertificateReferences(List<BatchCertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the applicationPackageReferences property: The list of Packages to be installed on each Compute Node in the
     * Pool. When creating a pool, the package's application ID must be fully qualified
     * (/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Batch/batchAccounts/{accountName}/applications/{applicationName}).
     * Changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are
     * already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any
     * given Pool.
     *
     * @return the applicationPackageReferences value.
     */
    @Generated
    public List<BatchApplicationPackageReference> getApplicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set the applicationPackageReferences property: The list of Packages to be installed on each Compute Node in the
     * Pool. When creating a pool, the package's application ID must be fully qualified
     * (/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Batch/batchAccounts/{accountName}/applications/{applicationName}).
     * Changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are
     * already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any
     * given Pool.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters
        setApplicationPackageReferences(List<BatchApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the applicationLicenses property: The list of application licenses the Batch service will make available on
     * each Compute Node in the Pool. The list of application licenses must be a subset of available Batch service
     * application licenses. If a license is requested which is not supported, Pool creation will fail.
     *
     * @return the applicationLicenses value.
     */
    @Generated
    public List<String> getApplicationLicenses() {
        return this.applicationLicenses;
    }

    /**
     * Set the applicationLicenses property: The list of application licenses the Batch service will make available on
     * each Compute Node in the Pool. The list of application licenses must be a subset of available Batch service
     * application licenses. If a license is requested which is not supported, Pool creation will fail.
     *
     * @param applicationLicenses the applicationLicenses value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setApplicationLicenses(List<String> applicationLicenses) {
        this.applicationLicenses = applicationLicenses;
        return this;
    }

    /**
     * Get the taskSlotsPerNode property: The number of task slots that can be used to run concurrent tasks on a single
     * compute node in the pool. The default value is 1. The maximum value is the smaller of 4 times the number of
     * cores of the vmSize of the pool or 256.
     *
     * @return the taskSlotsPerNode value.
     */
    @Generated
    public Integer getTaskSlotsPerNode() {
        return this.taskSlotsPerNode;
    }

    /**
     * Set the taskSlotsPerNode property: The number of task slots that can be used to run concurrent tasks on a single
     * compute node in the pool. The default value is 1. The maximum value is the smaller of 4 times the number of
     * cores of the vmSize of the pool or 256.
     *
     * @param taskSlotsPerNode the taskSlotsPerNode value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setTaskSlotsPerNode(Integer taskSlotsPerNode) {
        this.taskSlotsPerNode = taskSlotsPerNode;
        return this;
    }

    /**
     * Get the taskSchedulingPolicy property: How Tasks are distributed across Compute Nodes in a Pool. If not
     * specified, the default is spread.
     *
     * @return the taskSchedulingPolicy value.
     */
    @Generated
    public BatchTaskSchedulingPolicy getTaskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }

    /**
     * Set the taskSchedulingPolicy property: How Tasks are distributed across Compute Nodes in a Pool. If not
     * specified, the default is spread.
     *
     * @param taskSchedulingPolicy the taskSchedulingPolicy value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setTaskSchedulingPolicy(BatchTaskSchedulingPolicy taskSchedulingPolicy) {
        this.taskSchedulingPolicy = taskSchedulingPolicy;
        return this;
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
     * Set the userAccounts property: The list of user Accounts to be created on each Compute Node in the Pool.
     *
     * @param userAccounts the userAccounts value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setUserAccounts(List<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
        return this;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the Pool as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the Pool as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the mountConfiguration property: Mount storage using specified file system for the entire lifetime of the
     * pool. Mount the storage using Azure fileshare, NFS, CIFS or Blobfuse based file system.
     *
     * @return the mountConfiguration value.
     */
    @Generated
    public List<MountConfiguration> getMountConfiguration() {
        return this.mountConfiguration;
    }

    /**
     * Set the mountConfiguration property: Mount storage using specified file system for the entire lifetime of the
     * pool. Mount the storage using Azure fileshare, NFS, CIFS or Blobfuse based file system.
     *
     * @param mountConfiguration the mountConfiguration value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setMountConfiguration(List<MountConfiguration> mountConfiguration) {
        this.mountConfiguration = mountConfiguration;
        return this;
    }

    /**
     * Get the targetNodeCommunicationMode property: The desired node communication mode for the pool. If omitted, the
     * default value is Default.
     *
     * @return the targetNodeCommunicationMode value.
     */
    @Generated
    public BatchNodeCommunicationMode getTargetNodeCommunicationMode() {
        return this.targetNodeCommunicationMode;
    }

    /**
     * Set the targetNodeCommunicationMode property: The desired node communication mode for the pool. If omitted, the
     * default value is Default.
     *
     * @param targetNodeCommunicationMode the targetNodeCommunicationMode value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters
        setTargetNodeCommunicationMode(BatchNodeCommunicationMode targetNodeCommunicationMode) {
        this.targetNodeCommunicationMode = targetNodeCommunicationMode;
        return this;
    }

    /*
     * The user-specified tags associated with the pool. The user-defined tags to be associated with the Azure Batch
     * Pool. When specified, these tags are propagated to the backing Azure resources associated with the pool. This
     * property can only be specified when the Batch account was created with the poolAllocationMode property set to
     * 'UserSubscription'.
     */
    @Generated
    @JsonProperty(value = "resourceTags")
    private Map<String, String> resourceTags;

    /**
     * Get the resourceTags property: The user-specified tags associated with the pool. The user-defined tags to be
     * associated with the Azure Batch Pool. When specified, these tags are propagated to the backing Azure resources
     * associated with the pool. This property can only be specified when the Batch account was created with the
     * poolAllocationMode property set to 'UserSubscription'.
     *
     * @return the resourceTags value.
     */
    @Generated
    public Map<String, String> getResourceTags() {
        return this.resourceTags;
    }

    /**
     * Set the resourceTags property: The user-specified tags associated with the pool. The user-defined tags to be
     * associated with the Azure Batch Pool. When specified, these tags are propagated to the backing Azure resources
     * associated with the pool. This property can only be specified when the Batch account was created with the
     * poolAllocationMode property set to 'UserSubscription'.
     *
     * @param resourceTags the resourceTags value to set.
     * @return the BatchPoolCreateParameters object itself.
     */
    @Generated
    public BatchPoolCreateParameters setResourceTags(Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
}
