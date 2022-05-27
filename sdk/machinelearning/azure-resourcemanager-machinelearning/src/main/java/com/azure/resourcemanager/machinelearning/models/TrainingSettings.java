// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Training related configuration. */
@Fluent
public final class TrainingSettings {
    /*
     * Enable recommendation of DNN models.
     */
    @JsonProperty(value = "enableDnnTraining")
    private Boolean enableDnnTraining;

    /*
     * Flag to turn on explainability on best model.
     */
    @JsonProperty(value = "enableModelExplainability")
    private Boolean enableModelExplainability;

    /*
     * Flag for enabling onnx compatible models.
     */
    @JsonProperty(value = "enableOnnxCompatibleModels")
    private Boolean enableOnnxCompatibleModels;

    /*
     * Enable stack ensemble run.
     */
    @JsonProperty(value = "enableStackEnsemble")
    private Boolean enableStackEnsemble;

    /*
     * Enable voting ensemble run.
     */
    @JsonProperty(value = "enableVoteEnsemble")
    private Boolean enableVoteEnsemble;

    /*
     * During VotingEnsemble and StackEnsemble model generation, multiple
     * fitted models from the previous child runs are downloaded.
     * Configure this parameter with a higher value than 300 secs, if more time
     * is needed.
     */
    @JsonProperty(value = "ensembleModelDownloadTimeout")
    private Duration ensembleModelDownloadTimeout;

    /*
     * Stack ensemble settings for stack ensemble run.
     */
    @JsonProperty(value = "stackEnsembleSettings")
    private StackEnsembleSettings stackEnsembleSettings;

    /**
     * Get the enableDnnTraining property: Enable recommendation of DNN models.
     *
     * @return the enableDnnTraining value.
     */
    public Boolean enableDnnTraining() {
        return this.enableDnnTraining;
    }

    /**
     * Set the enableDnnTraining property: Enable recommendation of DNN models.
     *
     * @param enableDnnTraining the enableDnnTraining value to set.
     * @return the TrainingSettings object itself.
     */
    public TrainingSettings withEnableDnnTraining(Boolean enableDnnTraining) {
        this.enableDnnTraining = enableDnnTraining;
        return this;
    }

    /**
     * Get the enableModelExplainability property: Flag to turn on explainability on best model.
     *
     * @return the enableModelExplainability value.
     */
    public Boolean enableModelExplainability() {
        return this.enableModelExplainability;
    }

    /**
     * Set the enableModelExplainability property: Flag to turn on explainability on best model.
     *
     * @param enableModelExplainability the enableModelExplainability value to set.
     * @return the TrainingSettings object itself.
     */
    public TrainingSettings withEnableModelExplainability(Boolean enableModelExplainability) {
        this.enableModelExplainability = enableModelExplainability;
        return this;
    }

    /**
     * Get the enableOnnxCompatibleModels property: Flag for enabling onnx compatible models.
     *
     * @return the enableOnnxCompatibleModels value.
     */
    public Boolean enableOnnxCompatibleModels() {
        return this.enableOnnxCompatibleModels;
    }

    /**
     * Set the enableOnnxCompatibleModels property: Flag for enabling onnx compatible models.
     *
     * @param enableOnnxCompatibleModels the enableOnnxCompatibleModels value to set.
     * @return the TrainingSettings object itself.
     */
    public TrainingSettings withEnableOnnxCompatibleModels(Boolean enableOnnxCompatibleModels) {
        this.enableOnnxCompatibleModels = enableOnnxCompatibleModels;
        return this;
    }

    /**
     * Get the enableStackEnsemble property: Enable stack ensemble run.
     *
     * @return the enableStackEnsemble value.
     */
    public Boolean enableStackEnsemble() {
        return this.enableStackEnsemble;
    }

    /**
     * Set the enableStackEnsemble property: Enable stack ensemble run.
     *
     * @param enableStackEnsemble the enableStackEnsemble value to set.
     * @return the TrainingSettings object itself.
     */
    public TrainingSettings withEnableStackEnsemble(Boolean enableStackEnsemble) {
        this.enableStackEnsemble = enableStackEnsemble;
        return this;
    }

    /**
     * Get the enableVoteEnsemble property: Enable voting ensemble run.
     *
     * @return the enableVoteEnsemble value.
     */
    public Boolean enableVoteEnsemble() {
        return this.enableVoteEnsemble;
    }

    /**
     * Set the enableVoteEnsemble property: Enable voting ensemble run.
     *
     * @param enableVoteEnsemble the enableVoteEnsemble value to set.
     * @return the TrainingSettings object itself.
     */
    public TrainingSettings withEnableVoteEnsemble(Boolean enableVoteEnsemble) {
        this.enableVoteEnsemble = enableVoteEnsemble;
        return this;
    }

    /**
     * Get the ensembleModelDownloadTimeout property: During VotingEnsemble and StackEnsemble model generation, multiple
     * fitted models from the previous child runs are downloaded. Configure this parameter with a higher value than 300
     * secs, if more time is needed.
     *
     * @return the ensembleModelDownloadTimeout value.
     */
    public Duration ensembleModelDownloadTimeout() {
        return this.ensembleModelDownloadTimeout;
    }

    /**
     * Set the ensembleModelDownloadTimeout property: During VotingEnsemble and StackEnsemble model generation, multiple
     * fitted models from the previous child runs are downloaded. Configure this parameter with a higher value than 300
     * secs, if more time is needed.
     *
     * @param ensembleModelDownloadTimeout the ensembleModelDownloadTimeout value to set.
     * @return the TrainingSettings object itself.
     */
    public TrainingSettings withEnsembleModelDownloadTimeout(Duration ensembleModelDownloadTimeout) {
        this.ensembleModelDownloadTimeout = ensembleModelDownloadTimeout;
        return this;
    }

    /**
     * Get the stackEnsembleSettings property: Stack ensemble settings for stack ensemble run.
     *
     * @return the stackEnsembleSettings value.
     */
    public StackEnsembleSettings stackEnsembleSettings() {
        return this.stackEnsembleSettings;
    }

    /**
     * Set the stackEnsembleSettings property: Stack ensemble settings for stack ensemble run.
     *
     * @param stackEnsembleSettings the stackEnsembleSettings value to set.
     * @return the TrainingSettings object itself.
     */
    public TrainingSettings withStackEnsembleSettings(StackEnsembleSettings stackEnsembleSettings) {
        this.stackEnsembleSettings = stackEnsembleSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stackEnsembleSettings() != null) {
            stackEnsembleSettings().validate();
        }
    }
}
