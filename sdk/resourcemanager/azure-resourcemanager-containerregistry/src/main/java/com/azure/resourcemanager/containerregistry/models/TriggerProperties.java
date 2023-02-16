// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of a trigger. */
@Fluent
public final class TriggerProperties {
    /*
     * The collection of timer triggers.
     */
    @JsonProperty(value = "timerTriggers")
    private List<TimerTrigger> timerTriggers;

    /*
     * The collection of triggers based on source code repository.
     */
    @JsonProperty(value = "sourceTriggers")
    private List<SourceTrigger> sourceTriggers;

    /*
     * The trigger based on base image dependencies.
     */
    @JsonProperty(value = "baseImageTrigger")
    private BaseImageTrigger baseImageTrigger;

    /** Creates an instance of TriggerProperties class. */
    public TriggerProperties() {
    }

    /**
     * Get the timerTriggers property: The collection of timer triggers.
     *
     * @return the timerTriggers value.
     */
    public List<TimerTrigger> timerTriggers() {
        return this.timerTriggers;
    }

    /**
     * Set the timerTriggers property: The collection of timer triggers.
     *
     * @param timerTriggers the timerTriggers value to set.
     * @return the TriggerProperties object itself.
     */
    public TriggerProperties withTimerTriggers(List<TimerTrigger> timerTriggers) {
        this.timerTriggers = timerTriggers;
        return this;
    }

    /**
     * Get the sourceTriggers property: The collection of triggers based on source code repository.
     *
     * @return the sourceTriggers value.
     */
    public List<SourceTrigger> sourceTriggers() {
        return this.sourceTriggers;
    }

    /**
     * Set the sourceTriggers property: The collection of triggers based on source code repository.
     *
     * @param sourceTriggers the sourceTriggers value to set.
     * @return the TriggerProperties object itself.
     */
    public TriggerProperties withSourceTriggers(List<SourceTrigger> sourceTriggers) {
        this.sourceTriggers = sourceTriggers;
        return this;
    }

    /**
     * Get the baseImageTrigger property: The trigger based on base image dependencies.
     *
     * @return the baseImageTrigger value.
     */
    public BaseImageTrigger baseImageTrigger() {
        return this.baseImageTrigger;
    }

    /**
     * Set the baseImageTrigger property: The trigger based on base image dependencies.
     *
     * @param baseImageTrigger the baseImageTrigger value to set.
     * @return the TriggerProperties object itself.
     */
    public TriggerProperties withBaseImageTrigger(BaseImageTrigger baseImageTrigger) {
        this.baseImageTrigger = baseImageTrigger;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timerTriggers() != null) {
            timerTriggers().forEach(e -> e.validate());
        }
        if (sourceTriggers() != null) {
            sourceTriggers().forEach(e -> e.validate());
        }
        if (baseImageTrigger() != null) {
            baseImageTrigger().validate();
        }
    }
}
