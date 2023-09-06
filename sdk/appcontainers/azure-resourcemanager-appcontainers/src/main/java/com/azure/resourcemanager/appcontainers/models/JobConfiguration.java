// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Non versioned Container Apps Job configuration properties. */
@Fluent
public final class JobConfiguration {
    /*
     * Collection of secrets used by a Container Apps Job
     */
    @JsonProperty(value = "secrets")
    private List<Secret> secrets;

    /*
     * Trigger type of the job
     */
    @JsonProperty(value = "triggerType", required = true)
    private TriggerType triggerType;

    /*
     * Maximum number of seconds a replica is allowed to run.
     */
    @JsonProperty(value = "replicaTimeout", required = true)
    private int replicaTimeout;

    /*
     * Maximum number of retries before failing the job.
     */
    @JsonProperty(value = "replicaRetryLimit")
    private Integer replicaRetryLimit;

    /*
     * Manual trigger configuration for a single execution job. Properties replicaCompletionCount and parallelism would
     * be set to 1 by default
     */
    @JsonProperty(value = "manualTriggerConfig")
    private JobConfigurationManualTriggerConfig manualTriggerConfig;

    /*
     * Cron formatted repeating trigger schedule ("* * * * *") for cronjobs. Properties completions and parallelism
     * would be set to 1 by default
     */
    @JsonProperty(value = "scheduleTriggerConfig")
    private JobConfigurationScheduleTriggerConfig scheduleTriggerConfig;

    /*
     * Trigger configuration of an event driven job.
     */
    @JsonProperty(value = "eventTriggerConfig")
    private JobConfigurationEventTriggerConfig eventTriggerConfig;

    /*
     * Collection of private container registry credentials used by a Container apps job
     */
    @JsonProperty(value = "registries")
    private List<RegistryCredentials> registries;

    /** Creates an instance of JobConfiguration class. */
    public JobConfiguration() {
    }

    /**
     * Get the secrets property: Collection of secrets used by a Container Apps Job.
     *
     * @return the secrets value.
     */
    public List<Secret> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: Collection of secrets used by a Container Apps Job.
     *
     * @param secrets the secrets value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withSecrets(List<Secret> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the triggerType property: Trigger type of the job.
     *
     * @return the triggerType value.
     */
    public TriggerType triggerType() {
        return this.triggerType;
    }

    /**
     * Set the triggerType property: Trigger type of the job.
     *
     * @param triggerType the triggerType value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Get the replicaTimeout property: Maximum number of seconds a replica is allowed to run.
     *
     * @return the replicaTimeout value.
     */
    public int replicaTimeout() {
        return this.replicaTimeout;
    }

    /**
     * Set the replicaTimeout property: Maximum number of seconds a replica is allowed to run.
     *
     * @param replicaTimeout the replicaTimeout value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withReplicaTimeout(int replicaTimeout) {
        this.replicaTimeout = replicaTimeout;
        return this;
    }

    /**
     * Get the replicaRetryLimit property: Maximum number of retries before failing the job.
     *
     * @return the replicaRetryLimit value.
     */
    public Integer replicaRetryLimit() {
        return this.replicaRetryLimit;
    }

    /**
     * Set the replicaRetryLimit property: Maximum number of retries before failing the job.
     *
     * @param replicaRetryLimit the replicaRetryLimit value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withReplicaRetryLimit(Integer replicaRetryLimit) {
        this.replicaRetryLimit = replicaRetryLimit;
        return this;
    }

    /**
     * Get the manualTriggerConfig property: Manual trigger configuration for a single execution job. Properties
     * replicaCompletionCount and parallelism would be set to 1 by default.
     *
     * @return the manualTriggerConfig value.
     */
    public JobConfigurationManualTriggerConfig manualTriggerConfig() {
        return this.manualTriggerConfig;
    }

    /**
     * Set the manualTriggerConfig property: Manual trigger configuration for a single execution job. Properties
     * replicaCompletionCount and parallelism would be set to 1 by default.
     *
     * @param manualTriggerConfig the manualTriggerConfig value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withManualTriggerConfig(JobConfigurationManualTriggerConfig manualTriggerConfig) {
        this.manualTriggerConfig = manualTriggerConfig;
        return this;
    }

    /**
     * Get the scheduleTriggerConfig property: Cron formatted repeating trigger schedule ("* * * * *") for cronjobs.
     * Properties completions and parallelism would be set to 1 by default.
     *
     * @return the scheduleTriggerConfig value.
     */
    public JobConfigurationScheduleTriggerConfig scheduleTriggerConfig() {
        return this.scheduleTriggerConfig;
    }

    /**
     * Set the scheduleTriggerConfig property: Cron formatted repeating trigger schedule ("* * * * *") for cronjobs.
     * Properties completions and parallelism would be set to 1 by default.
     *
     * @param scheduleTriggerConfig the scheduleTriggerConfig value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withScheduleTriggerConfig(JobConfigurationScheduleTriggerConfig scheduleTriggerConfig) {
        this.scheduleTriggerConfig = scheduleTriggerConfig;
        return this;
    }

    /**
     * Get the eventTriggerConfig property: Trigger configuration of an event driven job.
     *
     * @return the eventTriggerConfig value.
     */
    public JobConfigurationEventTriggerConfig eventTriggerConfig() {
        return this.eventTriggerConfig;
    }

    /**
     * Set the eventTriggerConfig property: Trigger configuration of an event driven job.
     *
     * @param eventTriggerConfig the eventTriggerConfig value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withEventTriggerConfig(JobConfigurationEventTriggerConfig eventTriggerConfig) {
        this.eventTriggerConfig = eventTriggerConfig;
        return this;
    }

    /**
     * Get the registries property: Collection of private container registry credentials used by a Container apps job.
     *
     * @return the registries value.
     */
    public List<RegistryCredentials> registries() {
        return this.registries;
    }

    /**
     * Set the registries property: Collection of private container registry credentials used by a Container apps job.
     *
     * @param registries the registries value to set.
     * @return the JobConfiguration object itself.
     */
    public JobConfiguration withRegistries(List<RegistryCredentials> registries) {
        this.registries = registries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
        if (triggerType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property triggerType in model JobConfiguration"));
        }
        if (manualTriggerConfig() != null) {
            manualTriggerConfig().validate();
        }
        if (scheduleTriggerConfig() != null) {
            scheduleTriggerConfig().validate();
        }
        if (eventTriggerConfig() != null) {
            eventTriggerConfig().validate();
        }
        if (registries() != null) {
            registries().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobConfiguration.class);
}
