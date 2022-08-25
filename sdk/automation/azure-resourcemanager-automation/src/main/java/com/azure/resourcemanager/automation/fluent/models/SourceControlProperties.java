// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.SourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the source control properties. */
@Fluent
public final class SourceControlProperties {
    /*
     * The repo url of the source control.
     */
    @JsonProperty(value = "repoUrl")
    private String repoUrl;

    /*
     * The repo branch of the source control. Include branch as empty string for VsoTfvc.
     */
    @JsonProperty(value = "branch")
    private String branch;

    /*
     * The folder path of the source control.
     */
    @JsonProperty(value = "folderPath")
    private String folderPath;

    /*
     * The auto sync of the source control. Default is false.
     */
    @JsonProperty(value = "autoSync")
    private Boolean autoSync;

    /*
     * The auto publish of the source control. Default is true.
     */
    @JsonProperty(value = "publishRunbook")
    private Boolean publishRunbook;

    /*
     * The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     */
    @JsonProperty(value = "sourceType")
    private SourceType sourceType;

    /*
     * The description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The creation time.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * The last modified time.
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /**
     * Get the repoUrl property: The repo url of the source control.
     *
     * @return the repoUrl value.
     */
    public String repoUrl() {
        return this.repoUrl;
    }

    /**
     * Set the repoUrl property: The repo url of the source control.
     *
     * @param repoUrl the repoUrl value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * Get the branch property: The repo branch of the source control. Include branch as empty string for VsoTfvc.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The repo branch of the source control. Include branch as empty string for VsoTfvc.
     *
     * @param branch the branch value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the folderPath property: The folder path of the source control.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The folder path of the source control.
     *
     * @param folderPath the folderPath value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the autoSync property: The auto sync of the source control. Default is false.
     *
     * @return the autoSync value.
     */
    public Boolean autoSync() {
        return this.autoSync;
    }

    /**
     * Set the autoSync property: The auto sync of the source control. Default is false.
     *
     * @param autoSync the autoSync value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withAutoSync(Boolean autoSync) {
        this.autoSync = autoSync;
        return this;
    }

    /**
     * Get the publishRunbook property: The auto publish of the source control. Default is true.
     *
     * @return the publishRunbook value.
     */
    public Boolean publishRunbook() {
        return this.publishRunbook;
    }

    /**
     * Set the publishRunbook property: The auto publish of the source control. Default is true.
     *
     * @param publishRunbook the publishRunbook value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withPublishRunbook(Boolean publishRunbook) {
        this.publishRunbook = publishRunbook;
        return this;
    }

    /**
     * Get the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     *
     * @return the sourceType value.
     */
    public SourceType sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     *
     * @param sourceType the sourceType value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the description property: The description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description.
     *
     * @param description the description value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the creationTime property: The creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: The creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the lastModifiedTime property: The last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: The last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the SourceControlProperties object itself.
     */
    public SourceControlProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
