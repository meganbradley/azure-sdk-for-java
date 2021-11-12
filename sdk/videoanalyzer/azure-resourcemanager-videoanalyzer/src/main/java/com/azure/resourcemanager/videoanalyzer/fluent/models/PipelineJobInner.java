// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.models.ParameterDefinition;
import com.azure.resourcemanager.videoanalyzer.models.PipelineJobError;
import com.azure.resourcemanager.videoanalyzer.models.PipelineJobState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Pipeline job represents a unique instance of a batch topology, used for offline processing of selected portions of
 * archived content.
 */
@Fluent
public final class PipelineJobInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelineJobInner.class);

    /*
     * The resource properties.
     */
    @JsonProperty(value = "properties")
    private PipelineJobProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The resource properties.
     *
     * @return the innerProperties value.
     */
    private PipelineJobProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the topologyName property: Reference to an existing pipeline topology. When activated, this pipeline job will
     * process content according to the pipeline topology definition.
     *
     * @return the topologyName value.
     */
    public String topologyName() {
        return this.innerProperties() == null ? null : this.innerProperties().topologyName();
    }

    /**
     * Set the topologyName property: Reference to an existing pipeline topology. When activated, this pipeline job will
     * process content according to the pipeline topology definition.
     *
     * @param topologyName the topologyName value to set.
     * @return the PipelineJobInner object itself.
     */
    public PipelineJobInner withTopologyName(String topologyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PipelineJobProperties();
        }
        this.innerProperties().withTopologyName(topologyName);
        return this;
    }

    /**
     * Get the description property: An optional description for the pipeline.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: An optional description for the pipeline.
     *
     * @param description the description value to set.
     * @return the PipelineJobInner object itself.
     */
    public PipelineJobInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PipelineJobProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the state property: Current state of the pipeline (read-only).
     *
     * @return the state value.
     */
    public PipelineJobState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the expiration property: The date-time by when this pipeline job will be automatically deleted from your
     * account.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.innerProperties() == null ? null : this.innerProperties().expiration();
    }

    /**
     * Get the error property: Details about the error, in case the pipeline job fails.
     *
     * @return the error value.
     */
    public PipelineJobError error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Get the parameters property: List of the instance level parameter values for the user-defined topology
     * parameters. A pipeline can only define or override parameters values for parameters which have been declared in
     * the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a
     * default value can be optionally be overridden.
     *
     * @return the parameters value.
     */
    public List<ParameterDefinition> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: List of the instance level parameter values for the user-defined topology
     * parameters. A pipeline can only define or override parameters values for parameters which have been declared in
     * the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a
     * default value can be optionally be overridden.
     *
     * @param parameters the parameters value to set.
     * @return the PipelineJobInner object itself.
     */
    public PipelineJobInner withParameters(List<ParameterDefinition> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PipelineJobProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
