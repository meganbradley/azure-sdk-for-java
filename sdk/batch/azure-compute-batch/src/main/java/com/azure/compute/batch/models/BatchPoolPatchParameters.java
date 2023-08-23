// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A Pool in the Azure Batch service. */
@Fluent
public final class BatchPoolPatchParameters {

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
     * If this element is present, it replaces any existing Certificate references configured on the Pool.
     * If omitted, any existing Certificate references are left unchanged.
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
    private List<CertificateReference> certificateReferences;

    /*
     * Changes to Package references affect all new Nodes joining the Pool, but do not
     * affect Compute Nodes that are already in the Pool until they are rebooted or
     * reimaged. There is a maximum of 10 Package references on any given Pool.
     */
    @Generated
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /*
     * A list of name-value pairs associated with the Pool as metadata.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /*
     * If omitted, the default value is Default.
     */
    @Generated
    @JsonProperty(value = "targetNodeCommunicationMode")
    private NodeCommunicationMode targetNodeCommunicationMode;

    /** Creates an instance of BatchPoolPatchParameters class. */
    @Generated
    public BatchPoolPatchParameters() {}

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
     * Set the startTask property: Batch will retry Tasks when a recovery operation is triggered on a Node. Examples of
     * recovery operations include (but are not limited to) when an unhealthy Node is rebooted or a Compute Node
     * disappeared due to host failure. Retries due to recovery operations are independent of and are not counted
     * against the maxTaskRetryCount. Even if the maxTaskRetryCount is 0, an internal retry due to a recovery operation
     * may occur. Because of this, all Tasks should be idempotent. This means Tasks need to tolerate being interrupted
     * and restarted without causing any corruption or duplicate data. The best practice for long running Tasks is to
     * use some form of checkpointing. In some cases the StartTask may be re-run even though the Compute Node was not
     * rebooted. Special care should be taken to avoid StartTasks which create breakaway process or install/launch
     * services from the StartTask working directory, as this will block Batch from being able to re-run the StartTask.
     *
     * @param startTask the startTask value to set.
     * @return the BatchPoolPatchParameters object itself.
     */
    @Generated
    public BatchPoolPatchParameters setStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get the certificateReferences property: If this element is present, it replaces any existing Certificate
     * references configured on the Pool. If omitted, any existing Certificate references are left unchanged. For
     * Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For
     * Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an
     * environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For
     * Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and Certificates are placed in that directory. Warning: This property is deprecated and
     * will be removed after February, 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     *
     * @return the certificateReferences value.
     */
    @Generated
    public List<CertificateReference> getCertificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set the certificateReferences property: If this element is present, it replaces any existing Certificate
     * references configured on the Pool. If omitted, any existing Certificate references are left unchanged. For
     * Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For
     * Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an
     * environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For
     * Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and Certificates are placed in that directory. Warning: This property is deprecated and
     * will be removed after February, 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     *
     * @param certificateReferences the certificateReferences value to set.
     * @return the BatchPoolPatchParameters object itself.
     */
    @Generated
    public BatchPoolPatchParameters setCertificateReferences(List<CertificateReference> certificateReferences) {
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
     * Set the applicationPackageReferences property: Changes to Package references affect all new Nodes joining the
     * Pool, but do not affect Compute Nodes that are already in the Pool until they are rebooted or reimaged. There is
     * a maximum of 10 Package references on any given Pool.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set.
     * @return the BatchPoolPatchParameters object itself.
     */
    @Generated
    public BatchPoolPatchParameters setApplicationPackageReferences(
            List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
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
     * Set the metadata property: A list of name-value pairs associated with the Pool as metadata.
     *
     * @param metadata the metadata value to set.
     * @return the BatchPoolPatchParameters object itself.
     */
    @Generated
    public BatchPoolPatchParameters setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
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
     * Set the targetNodeCommunicationMode property: If omitted, the default value is Default.
     *
     * @param targetNodeCommunicationMode the targetNodeCommunicationMode value to set.
     * @return the BatchPoolPatchParameters object itself.
     */
    @Generated
    public BatchPoolPatchParameters setTargetNodeCommunicationMode(NodeCommunicationMode targetNodeCommunicationMode) {
        this.targetNodeCommunicationMode = targetNodeCommunicationMode;
        return this;
    }
}
