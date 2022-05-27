// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Customized setup scripts. */
@Fluent
public final class ScriptsToExecute {
    /*
     * Script that's run every time the machine starts.
     */
    @JsonProperty(value = "startupScript")
    private ScriptReference startupScript;

    /*
     * Script that's run only once during provision of the compute.
     */
    @JsonProperty(value = "creationScript")
    private ScriptReference creationScript;

    /**
     * Get the startupScript property: Script that's run every time the machine starts.
     *
     * @return the startupScript value.
     */
    public ScriptReference startupScript() {
        return this.startupScript;
    }

    /**
     * Set the startupScript property: Script that's run every time the machine starts.
     *
     * @param startupScript the startupScript value to set.
     * @return the ScriptsToExecute object itself.
     */
    public ScriptsToExecute withStartupScript(ScriptReference startupScript) {
        this.startupScript = startupScript;
        return this;
    }

    /**
     * Get the creationScript property: Script that's run only once during provision of the compute.
     *
     * @return the creationScript value.
     */
    public ScriptReference creationScript() {
        return this.creationScript;
    }

    /**
     * Set the creationScript property: Script that's run only once during provision of the compute.
     *
     * @param creationScript the creationScript value to set.
     * @return the ScriptsToExecute object itself.
     */
    public ScriptsToExecute withCreationScript(ScriptReference creationScript) {
        this.creationScript = creationScript;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startupScript() != null) {
            startupScript().validate();
        }
        if (creationScript() != null) {
            creationScript().validate();
        }
    }
}
