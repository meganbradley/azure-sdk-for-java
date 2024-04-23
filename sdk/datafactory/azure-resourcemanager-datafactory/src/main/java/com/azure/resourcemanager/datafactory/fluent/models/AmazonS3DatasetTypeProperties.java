// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Amazon S3 dataset properties.
 */
@Fluent
public final class AmazonS3DatasetTypeProperties {
    /*
     * The name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "bucketName", required = true)
    private Object bucketName;

    /*
     * The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "key")
    private Object key;

    /*
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "prefix")
    private Object prefix;

    /*
     * The version for the S3 object. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "version")
    private Object version;

    /*
     * The start of S3 object's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of S3 object's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /*
     * The format of files.
     */
    @JsonProperty(value = "format")
    private DatasetStorageFormat format;

    /*
     * The data compression method used for the Amazon S3 object.
     */
    @JsonProperty(value = "compression")
    private DatasetCompression compression;

    /**
     * Creates an instance of AmazonS3DatasetTypeProperties class.
     */
    public AmazonS3DatasetTypeProperties() {
    }

    /**
     * Get the bucketName property: The name of the Amazon S3 bucket. Type: string (or Expression with resultType
     * string).
     * 
     * @return the bucketName value.
     */
    public Object bucketName() {
        return this.bucketName;
    }

    /**
     * Set the bucketName property: The name of the Amazon S3 bucket. Type: string (or Expression with resultType
     * string).
     * 
     * @param bucketName the bucketName value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withBucketName(Object bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Get the key property: The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
     * @return the key value.
     */
    public Object key() {
        return this.key;
    }

    /**
     * Set the key property: The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
     * @param key the key value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withKey(Object key) {
        this.key = key;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     * 
     * @return the prefix value.
     */
    public Object prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     * 
     * @param prefix the prefix value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the version property: The version for the S3 object. Type: string (or Expression with resultType string).
     * 
     * @return the version value.
     */
    public Object version() {
        return this.version;
    }

    /**
     * Set the version property: The version for the S3 object. Type: string (or Expression with resultType string).
     * 
     * @param version the version value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of S3 object's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of S3 object's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of S3 object's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of S3 object's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the format property: The format of files.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The format of files.
     * 
     * @param format the format value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the Amazon S3 object.
     * 
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the Amazon S3 object.
     * 
     * @param compression the compression value to set.
     * @return the AmazonS3DatasetTypeProperties object itself.
     */
    public AmazonS3DatasetTypeProperties withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bucketName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property bucketName in model AmazonS3DatasetTypeProperties"));
        }
        if (format() != null) {
            format().validate();
        }
        if (compression() != null) {
            compression().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmazonS3DatasetTypeProperties.class);
}
