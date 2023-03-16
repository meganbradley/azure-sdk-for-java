// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The Path model. */
@JacksonXmlRootElement(localName = "Path")
@Fluent
public final class Path {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The isDirectory property.
     */
    @JsonProperty(value = "isDirectory")
    private Boolean isDirectory;

    /*
     * The lastModified property.
     */
    @JsonProperty(value = "lastModified")
    private String lastModified;

    /*
     * The contentLength property.
     */
    @JsonProperty(value = "contentLength")
    private Long contentLength;

    /*
     * The owner property.
     */
    @JsonProperty(value = "owner")
    private String owner;

    /*
     * The group property.
     */
    @JsonProperty(value = "group")
    private String group;

    /*
     * The permissions property.
     */
    @JsonProperty(value = "permissions")
    private String permissions;

    /*
     * The name of the encryption scope under which the blob is encrypted.
     */
    @JsonProperty(value = "EncryptionScope")
    private String encryptionScope;

    /*
     * The creationTime property.
     */
    @JsonProperty(value = "creationTime")
    private String creationTime;

    /*
     * The expiryTime property.
     */
    @JsonProperty(value = "expiryTime")
    private String expiryTime;

    /*
     * The etag property.
     */
    @JsonProperty(value = "etag")
    private String eTag;

    /** Creates an instance of Path class. */
    public Path() {}

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the Path object itself.
     */
    public Path setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDirectory property: The isDirectory property.
     *
     * @return the isDirectory value.
     */
    public Boolean isDirectory() {
        return this.isDirectory;
    }

    /**
     * Set the isDirectory property: The isDirectory property.
     *
     * @param isDirectory the isDirectory value to set.
     * @return the Path object itself.
     */
    public Path setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
        return this;
    }

    /**
     * Get the lastModified property: The lastModified property.
     *
     * @return the lastModified value.
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified property: The lastModified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the Path object itself.
     */
    public Path setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the contentLength property: The contentLength property.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The contentLength property.
     *
     * @param contentLength the contentLength value to set.
     * @return the Path object itself.
     */
    public Path setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the owner property: The owner property.
     *
     * @return the owner value.
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Set the owner property: The owner property.
     *
     * @param owner the owner value to set.
     * @return the Path object itself.
     */
    public Path setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the group property: The group property.
     *
     * @return the group value.
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * Set the group property: The group property.
     *
     * @param group the group value to set.
     * @return the Path object itself.
     */
    public Path setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get the permissions property: The permissions property.
     *
     * @return the permissions value.
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The permissions property.
     *
     * @param permissions the permissions value to set.
     * @return the Path object itself.
     */
    public Path setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the encryptionScope property: The name of the encryption scope under which the blob is encrypted.
     *
     * @return the encryptionScope value.
     */
    public String getEncryptionScope() {
        return this.encryptionScope;
    }

    /**
     * Set the encryptionScope property: The name of the encryption scope under which the blob is encrypted.
     *
     * @param encryptionScope the encryptionScope value to set.
     * @return the Path object itself.
     */
    public Path setEncryptionScope(String encryptionScope) {
        this.encryptionScope = encryptionScope;
        return this;
    }

    /**
     * Get the creationTime property: The creationTime property.
     *
     * @return the creationTime value.
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: The creationTime property.
     *
     * @param creationTime the creationTime value to set.
     * @return the Path object itself.
     */
    public Path setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the expiryTime property: The expiryTime property.
     *
     * @return the expiryTime value.
     */
    public String getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: The expiryTime property.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the Path object itself.
     */
    public Path setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the eTag property: The etag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The etag property.
     *
     * @param eTag the eTag value to set.
     * @return the Path object itself.
     */
    public Path setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }
}
