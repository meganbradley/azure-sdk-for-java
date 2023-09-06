// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.defendereasm.models.ResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Task details. */
@Fluent
public final class TaskResourceInner extends ProxyResource {
    /*
     * Task properties
     */
    @JsonProperty(value = "properties")
    private TaskResourceProperties innerProperties;

    /** Creates an instance of TaskResourceInner class. */
    public TaskResourceInner() {
    }

    /**
     * Get the innerProperties property: Task properties.
     *
     * @return the innerProperties value.
     */
    private TaskResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the startedAt property: The time the task started.
     *
     * @return the startedAt value.
     */
    public String startedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().startedAt();
    }

    /**
     * Set the startedAt property: The time the task started.
     *
     * @param startedAt the startedAt value to set.
     * @return the TaskResourceInner object itself.
     */
    public TaskResourceInner withStartedAt(String startedAt) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskResourceProperties();
        }
        this.innerProperties().withStartedAt(startedAt);
        return this;
    }

    /**
     * Get the completedAt property: The time the task completed.
     *
     * @return the completedAt value.
     */
    public String completedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().completedAt();
    }

    /**
     * Set the completedAt property: The time the task completed.
     *
     * @param completedAt the completedAt value to set.
     * @return the TaskResourceInner object itself.
     */
    public TaskResourceInner withCompletedAt(String completedAt) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskResourceProperties();
        }
        this.innerProperties().withCompletedAt(completedAt);
        return this;
    }

    /**
     * Get the lastPolledAt property: The last time the task was polled.
     *
     * @return the lastPolledAt value.
     */
    public String lastPolledAt() {
        return this.innerProperties() == null ? null : this.innerProperties().lastPolledAt();
    }

    /**
     * Set the lastPolledAt property: The last time the task was polled.
     *
     * @param lastPolledAt the lastPolledAt value to set.
     * @return the TaskResourceInner object itself.
     */
    public TaskResourceInner withLastPolledAt(String lastPolledAt) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskResourceProperties();
        }
        this.innerProperties().withLastPolledAt(lastPolledAt);
        return this;
    }

    /**
     * Get the state property: the state the task is in.
     *
     * @return the state value.
     */
    public String state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: the state the task is in.
     *
     * @param state the state value to set.
     * @return the TaskResourceInner object itself.
     */
    public TaskResourceInner withState(String state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskResourceProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the phase property: the phase the task is in.
     *
     * @return the phase value.
     */
    public String phase() {
        return this.innerProperties() == null ? null : this.innerProperties().phase();
    }

    /**
     * Set the phase property: the phase the task is in.
     *
     * @param phase the phase value to set.
     * @return the TaskResourceInner object itself.
     */
    public TaskResourceInner withPhase(String phase) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskResourceProperties();
        }
        this.innerProperties().withPhase(phase);
        return this;
    }

    /**
     * Get the reason property: The reason the task was moved into its current state, if the task wasn't completed.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.innerProperties() == null ? null : this.innerProperties().reason();
    }

    /**
     * Set the reason property: The reason the task was moved into its current state, if the task wasn't completed.
     *
     * @param reason the reason value to set.
     * @return the TaskResourceInner object itself.
     */
    public TaskResourceInner withReason(String reason) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskResourceProperties();
        }
        this.innerProperties().withReason(reason);
        return this;
    }

    /**
     * Get the metadata property: The reason the task was moved into its current state, if the task wasn't completed.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The reason the task was moved into its current state, if the task wasn't completed.
     *
     * @param metadata the metadata value to set.
     * @return the TaskResourceInner object itself.
     */
    public TaskResourceInner withMetadata(Object metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskResourceProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public ResourceState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
