// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * The compute resource properties for managed integration runtime.
 */
@Fluent
public final class IntegrationRuntimeComputeProperties {
    /*
     * The location for managed integration runtime. The supported regions could be found on https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The node size requirement to managed integration runtime.
     */
    @JsonProperty(value = "nodeSize")
    private String nodeSize;

    /*
     * The required number of nodes for managed integration runtime.
     */
    @JsonProperty(value = "numberOfNodes")
    private Integer numberOfNodes;

    /*
     * Maximum parallel executions count per node for managed integration runtime.
     */
    @JsonProperty(value = "maxParallelExecutionsPerNode")
    private Integer maxParallelExecutionsPerNode;

    /*
     * Data flow properties for managed integration runtime.
     */
    @JsonProperty(value = "dataFlowProperties")
    private IntegrationRuntimeDataFlowProperties dataFlowProperties;

    /*
     * VNet properties for managed integration runtime.
     */
    @JsonProperty(value = "vNetProperties")
    private IntegrationRuntimeVNetProperties vNetProperties;

    /*
     * CopyComputeScale properties for managed integration runtime.
     */
    @JsonProperty(value = "copyComputeScaleProperties")
    private CopyComputeScaleProperties copyComputeScaleProperties;

    /*
     * PipelineExternalComputeScale properties for managed integration runtime.
     */
    @JsonProperty(value = "pipelineExternalComputeScaleProperties")
    private PipelineExternalComputeScaleProperties pipelineExternalComputeScaleProperties;

    /*
     * The compute resource properties for managed integration runtime.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of IntegrationRuntimeComputeProperties class.
     */
    public IntegrationRuntimeComputeProperties() {
    }

    /**
     * Get the location property: The location for managed integration runtime. The supported regions could be found on
     * https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location for managed integration runtime. The supported regions could be found on
     * https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities.
     * 
     * @param location the location value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the nodeSize property: The node size requirement to managed integration runtime.
     * 
     * @return the nodeSize value.
     */
    public String nodeSize() {
        return this.nodeSize;
    }

    /**
     * Set the nodeSize property: The node size requirement to managed integration runtime.
     * 
     * @param nodeSize the nodeSize value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    /**
     * Get the numberOfNodes property: The required number of nodes for managed integration runtime.
     * 
     * @return the numberOfNodes value.
     */
    public Integer numberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * Set the numberOfNodes property: The required number of nodes for managed integration runtime.
     * 
     * @param numberOfNodes the numberOfNodes value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * Get the maxParallelExecutionsPerNode property: Maximum parallel executions count per node for managed integration
     * runtime.
     * 
     * @return the maxParallelExecutionsPerNode value.
     */
    public Integer maxParallelExecutionsPerNode() {
        return this.maxParallelExecutionsPerNode;
    }

    /**
     * Set the maxParallelExecutionsPerNode property: Maximum parallel executions count per node for managed integration
     * runtime.
     * 
     * @param maxParallelExecutionsPerNode the maxParallelExecutionsPerNode value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withMaxParallelExecutionsPerNode(Integer maxParallelExecutionsPerNode) {
        this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
        return this;
    }

    /**
     * Get the dataFlowProperties property: Data flow properties for managed integration runtime.
     * 
     * @return the dataFlowProperties value.
     */
    public IntegrationRuntimeDataFlowProperties dataFlowProperties() {
        return this.dataFlowProperties;
    }

    /**
     * Set the dataFlowProperties property: Data flow properties for managed integration runtime.
     * 
     * @param dataFlowProperties the dataFlowProperties value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties
        withDataFlowProperties(IntegrationRuntimeDataFlowProperties dataFlowProperties) {
        this.dataFlowProperties = dataFlowProperties;
        return this;
    }

    /**
     * Get the vNetProperties property: VNet properties for managed integration runtime.
     * 
     * @return the vNetProperties value.
     */
    public IntegrationRuntimeVNetProperties vNetProperties() {
        return this.vNetProperties;
    }

    /**
     * Set the vNetProperties property: VNet properties for managed integration runtime.
     * 
     * @param vNetProperties the vNetProperties value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withVNetProperties(IntegrationRuntimeVNetProperties vNetProperties) {
        this.vNetProperties = vNetProperties;
        return this;
    }

    /**
     * Get the copyComputeScaleProperties property: CopyComputeScale properties for managed integration runtime.
     * 
     * @return the copyComputeScaleProperties value.
     */
    public CopyComputeScaleProperties copyComputeScaleProperties() {
        return this.copyComputeScaleProperties;
    }

    /**
     * Set the copyComputeScaleProperties property: CopyComputeScale properties for managed integration runtime.
     * 
     * @param copyComputeScaleProperties the copyComputeScaleProperties value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties
        withCopyComputeScaleProperties(CopyComputeScaleProperties copyComputeScaleProperties) {
        this.copyComputeScaleProperties = copyComputeScaleProperties;
        return this;
    }

    /**
     * Get the pipelineExternalComputeScaleProperties property: PipelineExternalComputeScale properties for managed
     * integration runtime.
     * 
     * @return the pipelineExternalComputeScaleProperties value.
     */
    public PipelineExternalComputeScaleProperties pipelineExternalComputeScaleProperties() {
        return this.pipelineExternalComputeScaleProperties;
    }

    /**
     * Set the pipelineExternalComputeScaleProperties property: PipelineExternalComputeScale properties for managed
     * integration runtime.
     * 
     * @param pipelineExternalComputeScaleProperties the pipelineExternalComputeScaleProperties value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withPipelineExternalComputeScaleProperties(
        PipelineExternalComputeScaleProperties pipelineExternalComputeScaleProperties) {
        this.pipelineExternalComputeScaleProperties = pipelineExternalComputeScaleProperties;
        return this;
    }

    /**
     * Get the additionalProperties property: The compute resource properties for managed integration runtime.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The compute resource properties for managed integration runtime.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataFlowProperties() != null) {
            dataFlowProperties().validate();
        }
        if (vNetProperties() != null) {
            vNetProperties().validate();
        }
        if (copyComputeScaleProperties() != null) {
            copyComputeScaleProperties().validate();
        }
        if (pipelineExternalComputeScaleProperties() != null) {
            pipelineExternalComputeScaleProperties().validate();
        }
    }
}
