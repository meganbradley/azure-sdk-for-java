// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The container settings for a Task.
 */
@Fluent
public final class BatchTaskContainerSettings {

    /*
     * Additional options to the container create command. These additional options are supplied as arguments to the
     * "docker create" command, in addition to those controlled by the Batch Service.
     */
    @Generated
    @JsonProperty(value = "containerRunOptions")
    private String containerRunOptions;

    /*
     * The Image to use to create the container in which the Task will run. This is the full Image reference, as would
     * be specified to "docker pull". If no tag is provided as part of the Image name, the tag ":latest" is used as a
     * default.
     */
    @Generated
    @JsonProperty(value = "imageName")
    private String imageName;

    /*
     * The private registry which contains the container Image. This setting can be omitted if was already provided at
     * Pool creation.
     */
    @Generated
    @JsonProperty(value = "registry")
    private ContainerRegistry registry;

    /*
     * The location of the container Task working directory. The default is 'taskWorkingDirectory'.
     */
    @Generated
    @JsonProperty(value = "workingDirectory")
    private ContainerWorkingDirectory workingDirectory;

    /**
     * Creates an instance of BatchTaskContainerSettings class.
     *
     * @param imageName the imageName value to set.
     */
    @Generated
    @JsonCreator
    public BatchTaskContainerSettings(@JsonProperty(value = "imageName") String imageName) {
        this.imageName = imageName;
    }

    /**
     * Get the containerRunOptions property: Additional options to the container create command. These additional
     * options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch
     * Service.
     *
     * @return the containerRunOptions value.
     */
    @Generated
    public String getContainerRunOptions() {
        return this.containerRunOptions;
    }

    /**
     * Set the containerRunOptions property: Additional options to the container create command. These additional
     * options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch
     * Service.
     *
     * @param containerRunOptions the containerRunOptions value to set.
     * @return the BatchTaskContainerSettings object itself.
     */
    @Generated
    public BatchTaskContainerSettings setContainerRunOptions(String containerRunOptions) {
        this.containerRunOptions = containerRunOptions;
        return this;
    }

    /**
     * Get the imageName property: The Image to use to create the container in which the Task will run. This is the
     * full Image reference, as would be specified to "docker pull". If no tag is provided as part of the Image name,
     * the tag ":latest" is used as a default.
     *
     * @return the imageName value.
     */
    @Generated
    public String getImageName() {
        return this.imageName;
    }

    /**
     * Get the registry property: The private registry which contains the container Image. This setting can be omitted
     * if was already provided at Pool creation.
     *
     * @return the registry value.
     */
    @Generated
    public ContainerRegistry getRegistry() {
        return this.registry;
    }

    /**
     * Set the registry property: The private registry which contains the container Image. This setting can be omitted
     * if was already provided at Pool creation.
     *
     * @param registry the registry value to set.
     * @return the BatchTaskContainerSettings object itself.
     */
    @Generated
    public BatchTaskContainerSettings setRegistry(ContainerRegistry registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get the workingDirectory property: The location of the container Task working directory. The default is
     * 'taskWorkingDirectory'.
     *
     * @return the workingDirectory value.
     */
    @Generated
    public ContainerWorkingDirectory getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * Set the workingDirectory property: The location of the container Task working directory. The default is
     * 'taskWorkingDirectory'.
     *
     * @param workingDirectory the workingDirectory value to set.
     * @return the BatchTaskContainerSettings object itself.
     */
    @Generated
    public BatchTaskContainerSettings setWorkingDirectory(ContainerWorkingDirectory workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }
}
