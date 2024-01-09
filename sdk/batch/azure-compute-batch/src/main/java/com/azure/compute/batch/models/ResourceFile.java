// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single file or multiple files to be downloaded to a Compute Node.
 */
@Fluent
public final class ResourceFile {

    /*
     * The storage container name in the auto storage Account. The autoStorageContainerName, storageContainerUrl and
     * httpUrl properties are mutually exclusive and one of them must be specified.
     */
    @Generated
    @JsonProperty(value = "autoStorageContainerName")
    private String autoStorageContainerName;

    /*
     * The URL of the blob container within Azure Blob Storage. The autoStorageContainerName, storageContainerUrl and
     * httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and
     * listable from compute nodes. There are three ways to get such a URL for a container in Azure storage: include a
     * Shared Access Signature (SAS) granting read and list permissions on the container, use a managed identity with
     * read and list permissions, or set the ACL for the container to allow public access.
     */
    @Generated
    @JsonProperty(value = "storageContainerUrl")
    private String storageContainerUrl;

    /*
     * The URL of the file to download. The autoStorageContainerName, storageContainerUrl and httpUrl properties are
     * mutually exclusive and one of them must be specified. If the URL points to Azure Blob Storage, it must be
     * readable from compute nodes. There are three ways to get such a URL for a blob in Azure storage: include a
     * Shared Access Signature (SAS) granting read permissions on the blob, use a managed identity with read
     * permission, or set the ACL for the blob or its container to allow public access.
     */
    @Generated
    @JsonProperty(value = "httpUrl")
    private String httpUrl;

    /*
     * The blob prefix to use when downloading blobs from an Azure Storage container. Only the blobs whose names begin
     * with the specified prefix will be downloaded. The property is valid only when autoStorageContainerName or
     * storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not
     * specified, all the files in the container will be downloaded.
     */
    @Generated
    @JsonProperty(value = "blobPrefix")
    private String blobPrefix;

    /*
     * The location on the Compute Node to which to download the file(s), relative to the Task's working directory. If
     * the httpUrl property is specified, the filePath is required and describes the path which the file will be
     * downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl
     * property is specified, filePath is optional and is the directory to download the files to. In the case where
     * filePath is used as a directory, any directory structure already associated with the input data will be retained
     * in full and appended to the specified filePath directory. The specified relative path cannot break out of the
     * Task's working directory (for example by using '..').
     */
    @Generated
    @JsonProperty(value = "filePath")
    private String filePath;

    /*
     * The file permission mode attribute in octal format. This property applies only to files being downloaded to
     * Linux Compute Nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a
     * Windows Compute Node. If this property is not specified for a Linux Compute Node, then a default value of 0770
     * is applied to the file.
     */
    @Generated
    @JsonProperty(value = "fileMode")
    private String fileMode;

    /*
     * The reference to the user assigned identity to use to access Azure Blob Storage specified by storageContainerUrl
     * or httpUrl.
     */
    @Generated
    @JsonProperty(value = "identityReference")
    private BatchNodeIdentityReference identityReference;

    /**
     * Creates an instance of ResourceFile class.
     */
    @Generated
    public ResourceFile() {
    }

    /**
     * Get the autoStorageContainerName property: The storage container name in the auto storage Account. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified.
     *
     * @return the autoStorageContainerName value.
     */
    @Generated
    public String getAutoStorageContainerName() {
        return this.autoStorageContainerName;
    }

    /**
     * Set the autoStorageContainerName property: The storage container name in the auto storage Account. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified.
     *
     * @param autoStorageContainerName the autoStorageContainerName value to set.
     * @return the ResourceFile object itself.
     */
    @Generated
    public ResourceFile setAutoStorageContainerName(String autoStorageContainerName) {
        this.autoStorageContainerName = autoStorageContainerName;
        return this;
    }

    /**
     * Get the storageContainerUrl property: The URL of the blob container within Azure Blob Storage. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified. This URL must be readable and listable from compute nodes. There are three ways to get such a URL
     * for a container in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on
     * the container, use a managed identity with read and list permissions, or set the ACL for the container to allow
     * public access.
     *
     * @return the storageContainerUrl value.
     */
    @Generated
    public String getStorageContainerUrl() {
        return this.storageContainerUrl;
    }

    /**
     * Set the storageContainerUrl property: The URL of the blob container within Azure Blob Storage. The
     * autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must
     * be specified. This URL must be readable and listable from compute nodes. There are three ways to get such a URL
     * for a container in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on
     * the container, use a managed identity with read and list permissions, or set the ACL for the container to allow
     * public access.
     *
     * @param storageContainerUrl the storageContainerUrl value to set.
     * @return the ResourceFile object itself.
     */
    @Generated
    public ResourceFile setStorageContainerUrl(String storageContainerUrl) {
        this.storageContainerUrl = storageContainerUrl;
        return this;
    }

    /**
     * Get the httpUrl property: The URL of the file to download. The autoStorageContainerName, storageContainerUrl and
     * httpUrl properties are mutually exclusive and one of them must be specified. If the URL points to Azure Blob
     * Storage, it must be readable from compute nodes. There are three ways to get such a URL for a blob in Azure
     * storage: include a Shared Access Signature (SAS) granting read permissions on the blob, use a managed identity
     * with read permission, or set the ACL for the blob or its container to allow public access.
     *
     * @return the httpUrl value.
     */
    @Generated
    public String getHttpUrl() {
        return this.httpUrl;
    }

    /**
     * Set the httpUrl property: The URL of the file to download. The autoStorageContainerName, storageContainerUrl and
     * httpUrl properties are mutually exclusive and one of them must be specified. If the URL points to Azure Blob
     * Storage, it must be readable from compute nodes. There are three ways to get such a URL for a blob in Azure
     * storage: include a Shared Access Signature (SAS) granting read permissions on the blob, use a managed identity
     * with read permission, or set the ACL for the blob or its container to allow public access.
     *
     * @param httpUrl the httpUrl value to set.
     * @return the ResourceFile object itself.
     */
    @Generated
    public ResourceFile setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }

    /**
     * Get the blobPrefix property: The blob prefix to use when downloading blobs from an Azure Storage container. Only
     * the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when
     * autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a
     * subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     *
     * @return the blobPrefix value.
     */
    @Generated
    public String getBlobPrefix() {
        return this.blobPrefix;
    }

    /**
     * Set the blobPrefix property: The blob prefix to use when downloading blobs from an Azure Storage container. Only
     * the blobs whose names begin with the specified prefix will be downloaded. The property is valid only when
     * autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a
     * subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     *
     * @param blobPrefix the blobPrefix value to set.
     * @return the ResourceFile object itself.
     */
    @Generated
    public ResourceFile setBlobPrefix(String blobPrefix) {
        this.blobPrefix = blobPrefix;
        return this;
    }

    /**
     * Get the filePath property: The location on the Compute Node to which to download the file(s), relative to the
     * Task's working directory. If the httpUrl property is specified, the filePath is required and describes the path
     * which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or
     * storageContainerUrl property is specified, filePath is optional and is the directory to download the files to.
     * In the case where filePath is used as a directory, any directory structure already associated with the input
     * data will be retained in full and appended to the specified filePath directory. The specified relative path
     * cannot break out of the Task's working directory (for example by using '..').
     *
     * @return the filePath value.
     */
    @Generated
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * Set the filePath property: The location on the Compute Node to which to download the file(s), relative to the
     * Task's working directory. If the httpUrl property is specified, the filePath is required and describes the path
     * which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or
     * storageContainerUrl property is specified, filePath is optional and is the directory to download the files to.
     * In the case where filePath is used as a directory, any directory structure already associated with the input
     * data will be retained in full and appended to the specified filePath directory. The specified relative path
     * cannot break out of the Task's working directory (for example by using '..').
     *
     * @param filePath the filePath value to set.
     * @return the ResourceFile object itself.
     */
    @Generated
    public ResourceFile setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get the fileMode property: The file permission mode attribute in octal format. This property applies only to
     * files being downloaded to Linux Compute Nodes. It will be ignored if it is specified for a resourceFile which
     * will be downloaded to a Windows Compute Node. If this property is not specified for a Linux Compute Node, then a
     * default value of 0770 is applied to the file.
     *
     * @return the fileMode value.
     */
    @Generated
    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * Set the fileMode property: The file permission mode attribute in octal format. This property applies only to
     * files being downloaded to Linux Compute Nodes. It will be ignored if it is specified for a resourceFile which
     * will be downloaded to a Windows Compute Node. If this property is not specified for a Linux Compute Node, then a
     * default value of 0770 is applied to the file.
     *
     * @param fileMode the fileMode value to set.
     * @return the ResourceFile object itself.
     */
    @Generated
    public ResourceFile setFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * Get the identityReference property: The reference to the user assigned identity to use to access Azure Blob
     * Storage specified by storageContainerUrl or httpUrl.
     *
     * @return the identityReference value.
     */
    @Generated
    public BatchNodeIdentityReference getIdentityReference() {
        return this.identityReference;
    }

    /**
     * Set the identityReference property: The reference to the user assigned identity to use to access Azure Blob
     * Storage specified by storageContainerUrl or httpUrl.
     *
     * @param identityReference the identityReference value to set.
     * @return the ResourceFile object itself.
     */
    @Generated
    public ResourceFile setIdentityReference(BatchNodeIdentityReference identityReference) {
        this.identityReference = identityReference;
        return this;
    }
}
