// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Power query source. */
@Fluent
public final class PowerQuerySource extends DataFlowSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PowerQuerySource.class);

    /*
     * source script.
     */
    @JsonProperty(value = "script")
    private String script;

    /**
     * Get the script property: source script.
     *
     * @return the script value.
     */
    public String script() {
        return this.script;
    }

    /**
     * Set the script property: source script.
     *
     * @param script the script value to set.
     * @return the PowerQuerySource object itself.
     */
    public PowerQuerySource withScript(String script) {
        this.script = script;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerQuerySource withDataset(DatasetReference dataset) {
        super.withDataset(dataset);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerQuerySource withLinkedService(LinkedServiceReference linkedService) {
        super.withLinkedService(linkedService);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerQuerySource withSchemaLinkedService(LinkedServiceReference schemaLinkedService) {
        super.withSchemaLinkedService(schemaLinkedService);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerQuerySource withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerQuerySource withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
