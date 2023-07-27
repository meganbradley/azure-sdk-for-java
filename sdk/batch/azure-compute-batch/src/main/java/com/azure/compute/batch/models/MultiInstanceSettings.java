// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Multi-instance Tasks are commonly used to support MPI Tasks. In the MPI case, if any of the subtasks fail (for
 * example due to exiting with a non-zero exit code) the entire multi-instance Task fails. The multi-instance Task is
 * then terminated and retried, up to its retry limit.
 */
@Fluent
public final class MultiInstanceSettings {

    /*
     * If omitted, the default is 1.
     */
    @Generated
    @JsonProperty(value = "numberOfInstances")
    private Integer numberOfInstances;

    /*
     * A typical coordination command line launches a background service and verifies
     * that the service is ready to process inter-node messages.
     */
    @Generated
    @JsonProperty(value = "coordinationCommandLine")
    private String coordinationCommandLine;

    /*
     * The difference between common resource files and Task resource files is that
     * common resource files are downloaded for all subtasks including the primary,
     * whereas Task resource files are downloaded only for the primary. Also note that
     * these resource files are not downloaded to the Task working directory, but
     * instead are downloaded to the Task root directory (one directory above the
     * working directory).  There is a maximum size for the list of resource files.
     * When the max size is exceeded, the request will fail and the response error
     * code will be RequestEntityTooLarge. If this occurs, the collection of
     * ResourceFiles must be reduced in size. This can be achieved using .zip files,
     * Application Packages, or Docker Containers.
     */
    @Generated
    @JsonProperty(value = "commonResourceFiles")
    private List<ResourceFile> commonResourceFiles;

    /**
     * Creates an instance of MultiInstanceSettings class.
     *
     * @param coordinationCommandLine the coordinationCommandLine value to set.
     */
    @Generated
    @JsonCreator
    public MultiInstanceSettings(@JsonProperty(value = "coordinationCommandLine") String coordinationCommandLine) {
        this.coordinationCommandLine = coordinationCommandLine;
    }

    /**
     * Get the numberOfInstances property: If omitted, the default is 1.
     *
     * @return the numberOfInstances value.
     */
    @Generated
    public Integer getNumberOfInstances() {
        return this.numberOfInstances;
    }

    /**
     * Set the numberOfInstances property: If omitted, the default is 1.
     *
     * @param numberOfInstances the numberOfInstances value to set.
     * @return the MultiInstanceSettings object itself.
     */
    @Generated
    public MultiInstanceSettings setNumberOfInstances(Integer numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
        return this;
    }

    /**
     * Get the coordinationCommandLine property: A typical coordination command line launches a background service and
     * verifies that the service is ready to process inter-node messages.
     *
     * @return the coordinationCommandLine value.
     */
    @Generated
    public String getCoordinationCommandLine() {
        return this.coordinationCommandLine;
    }

    /**
     * Get the commonResourceFiles property: The difference between common resource files and Task resource files is
     * that common resource files are downloaded for all subtasks including the primary, whereas Task resource files are
     * downloaded only for the primary. Also note that these resource files are not downloaded to the Task working
     * directory, but instead are downloaded to the Task root directory (one directory above the working directory).
     * There is a maximum size for the list of resource files. When the max size is exceeded, the request will fail and
     * the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be
     * reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @return the commonResourceFiles value.
     */
    @Generated
    public List<ResourceFile> getCommonResourceFiles() {
        return this.commonResourceFiles;
    }

    /**
     * Set the commonResourceFiles property: The difference between common resource files and Task resource files is
     * that common resource files are downloaded for all subtasks including the primary, whereas Task resource files are
     * downloaded only for the primary. Also note that these resource files are not downloaded to the Task working
     * directory, but instead are downloaded to the Task root directory (one directory above the working directory).
     * There is a maximum size for the list of resource files. When the max size is exceeded, the request will fail and
     * the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be
     * reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @param commonResourceFiles the commonResourceFiles value to set.
     * @return the MultiInstanceSettings object itself.
     */
    @Generated
    public MultiInstanceSettings setCommonResourceFiles(List<ResourceFile> commonResourceFiles) {
        this.commonResourceFiles = commonResourceFiles;
        return this;
    }
}
