// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The container settings for a Task. */
@Fluent
public final class TaskContainerSettings {

    /*
     * These additional options are supplied as arguments to the "docker create"
     * command, in addition to those controlled by the Batch Service.
     */
    @JsonProperty(value = "containerRunOptions")
    private String containerRunOptions;

    /*
     * This is the full Image reference, as would be specified to "docker pull". If
     * no tag is provided as part of the Image name, the tag ":latest" is used as a
     * default.
     */
    @JsonProperty(value = "imageName", required = true)
    private String imageName;

    /*
     * This setting can be omitted if was already provided at Pool creation.
     */
    @JsonProperty(value = "registry")
    private ContainerRegistry registry;

    /*
     * The default is 'taskWorkingDirectory'.
     */
    @JsonProperty(value = "workingDirectory")
    private ContainerWorkingDirectory workingDirectory;

    /**
     * Creates an instance of TaskContainerSettings class.
     *
     * @param imageName the imageName value to set.
     */
    @JsonCreator
    public TaskContainerSettings(@JsonProperty(value = "imageName", required = true) String imageName) {
        this.imageName = imageName;
    }

    /**
     * Get the containerRunOptions property: These additional options are supplied as arguments to the "docker create"
     * command, in addition to those controlled by the Batch Service.
     *
     * @return the containerRunOptions value.
     */
    public String getContainerRunOptions() {
        return this.containerRunOptions;
    }

    /**
     * Set the containerRunOptions property: These additional options are supplied as arguments to the "docker create"
     * command, in addition to those controlled by the Batch Service.
     *
     * @param containerRunOptions the containerRunOptions value to set.
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings setContainerRunOptions(String containerRunOptions) {
        this.containerRunOptions = containerRunOptions;
        return this;
    }

    /**
     * Get the imageName property: This is the full Image reference, as would be specified to "docker pull". If no tag
     * is provided as part of the Image name, the tag ":latest" is used as a default.
     *
     * @return the imageName value.
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * Get the registry property: This setting can be omitted if was already provided at Pool creation.
     *
     * @return the registry value.
     */
    public ContainerRegistry getRegistry() {
        return this.registry;
    }

    /**
     * Set the registry property: This setting can be omitted if was already provided at Pool creation.
     *
     * @param registry the registry value to set.
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings setRegistry(ContainerRegistry registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get the workingDirectory property: The default is 'taskWorkingDirectory'.
     *
     * @return the workingDirectory value.
     */
    public ContainerWorkingDirectory getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * Set the workingDirectory property: The default is 'taskWorkingDirectory'.
     *
     * @param workingDirectory the workingDirectory value to set.
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings setWorkingDirectory(ContainerWorkingDirectory workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }
}
