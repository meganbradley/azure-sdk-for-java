// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of uploading Batch service log files from a specific Compute Node.
 */
@Immutable
public final class UploadBatchServiceLogsResult {

    /*
     * The virtual directory within Azure Blob Storage container to which the Batch Service log file(s) will be
     * uploaded. The virtual directory name is part of the blob name for each log file uploaded, and it is built based
     * poolId, nodeId and a unique identifier.
     */
    @Generated
    @JsonProperty(value = "virtualDirectoryName")
    private String virtualDirectoryName;

    /*
     * The number of log files which will be uploaded.
     */
    @Generated
    @JsonProperty(value = "numberOfFilesUploaded")
    private int numberOfFilesUploaded;

    /**
     * Creates an instance of UploadBatchServiceLogsResult class.
     *
     * @param virtualDirectoryName the virtualDirectoryName value to set.
     * @param numberOfFilesUploaded the numberOfFilesUploaded value to set.
     */
    @Generated
    @JsonCreator
    private UploadBatchServiceLogsResult(@JsonProperty(value = "virtualDirectoryName") String virtualDirectoryName,
        @JsonProperty(value = "numberOfFilesUploaded") int numberOfFilesUploaded) {
        this.virtualDirectoryName = virtualDirectoryName;
        this.numberOfFilesUploaded = numberOfFilesUploaded;
    }

    /**
     * Get the virtualDirectoryName property: The virtual directory within Azure Blob Storage container to which the
     * Batch Service log file(s) will be uploaded. The virtual directory name is part of the blob name for each log
     * file uploaded, and it is built based poolId, nodeId and a unique identifier.
     *
     * @return the virtualDirectoryName value.
     */
    @Generated
    public String getVirtualDirectoryName() {
        return this.virtualDirectoryName;
    }

    /**
     * Get the numberOfFilesUploaded property: The number of log files which will be uploaded.
     *
     * @return the numberOfFilesUploaded value.
     */
    @Generated
    public int getNumberOfFilesUploaded() {
        return this.numberOfFilesUploaded;
    }
}
