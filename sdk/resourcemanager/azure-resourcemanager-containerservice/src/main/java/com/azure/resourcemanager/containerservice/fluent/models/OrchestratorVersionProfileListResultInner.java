// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.OrchestratorVersionProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of versions for supported orchestrators.
 */
@Fluent
public final class OrchestratorVersionProfileListResultInner {
    /*
     * Id of the orchestrator version profile list result.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the orchestrator version profile list result.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Type of the orchestrator version profile list result.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The properties of an orchestrator version profile.
     */
    @JsonProperty(value = "properties", required = true)
    private OrchestratorVersionProfileProperties innerProperties = new OrchestratorVersionProfileProperties();

    /**
     * Creates an instance of OrchestratorVersionProfileListResultInner class.
     */
    public OrchestratorVersionProfileListResultInner() {
    }

    /**
     * Get the id property: Id of the orchestrator version profile list result.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of the orchestrator version profile list result.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Type of the orchestrator version profile list result.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The properties of an orchestrator version profile.
     *
     * @return the innerProperties value.
     */
    private OrchestratorVersionProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the orchestrators property: List of orchestrator version profiles.
     *
     * @return the orchestrators value.
     */
    public List<OrchestratorVersionProfile> orchestrators() {
        return this.innerProperties() == null ? null : this.innerProperties().orchestrators();
    }

    /**
     * Set the orchestrators property: List of orchestrator version profiles.
     *
     * @param orchestrators the orchestrators value to set.
     * @return the OrchestratorVersionProfileListResultInner object itself.
     */
    public OrchestratorVersionProfileListResultInner withOrchestrators(List<OrchestratorVersionProfile> orchestrators) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OrchestratorVersionProfileProperties();
        }
        this.innerProperties().withOrchestrators(orchestrators);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model OrchestratorVersionProfileListResultInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OrchestratorVersionProfileListResultInner.class);
}
