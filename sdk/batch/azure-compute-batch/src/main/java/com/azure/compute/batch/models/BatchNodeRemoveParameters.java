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

/**
 * Parameters for removing nodes from an Azure Batch Pool.
 */
@Fluent
public final class BatchNodeRemoveParameters {

    /*
     * A list containing the IDs of the Compute Nodes to be removed from the specified Pool. A maximum of 100 nodes may
     * be removed per request.
     */
    @Generated
    @JsonProperty(value = "nodeList")
    private List<String> nodeList;

    /*
     * The timeout for removal of Compute Nodes to the Pool. The default value is 15 minutes. The minimum value is 5
     * minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the
     * REST API directly, the HTTP status code is 400 (Bad Request).
     */
    @Generated
    @JsonProperty(value = "resizeTimeout")
    private Duration resizeTimeout;

    /*
     * Determines what to do with a Compute Node and its running task(s) after it has been selected for deallocation.
     * The default value is requeue.
     */
    @Generated
    @JsonProperty(value = "nodeDeallocationOption")
    private BatchNodeDeallocationOption nodeDeallocationOption;

    /**
     * Creates an instance of BatchNodeRemoveParameters class.
     *
     * @param nodeList the nodeList value to set.
     */
    @Generated
    @JsonCreator
    public BatchNodeRemoveParameters(@JsonProperty(value = "nodeList") List<String> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Get the nodeList property: A list containing the IDs of the Compute Nodes to be removed from the specified Pool.
     * A maximum of 100 nodes may be removed per request.
     *
     * @return the nodeList value.
     */
    @Generated
    public List<String> getNodeList() {
        return this.nodeList;
    }

    /**
     * Get the resizeTimeout property: The timeout for removal of Compute Nodes to the Pool. The default value is 15
     * minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns
     * an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value.
     */
    @Generated
    public Duration getResizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the resizeTimeout property: The timeout for removal of Compute Nodes to the Pool. The default value is 15
     * minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns
     * an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set.
     * @return the BatchNodeRemoveParameters object itself.
     */
    @Generated
    public BatchNodeRemoveParameters setResizeTimeout(Duration resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the nodeDeallocationOption property: Determines what to do with a Compute Node and its running task(s) after
     * it has been selected for deallocation. The default value is requeue.
     *
     * @return the nodeDeallocationOption value.
     */
    @Generated
    public BatchNodeDeallocationOption getNodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the nodeDeallocationOption property: Determines what to do with a Compute Node and its running task(s) after
     * it has been selected for deallocation. The default value is requeue.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set.
     * @return the BatchNodeRemoveParameters object itself.
     */
    @Generated
    public BatchNodeRemoveParameters setNodeDeallocationOption(BatchNodeDeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        return this;
    }
}
