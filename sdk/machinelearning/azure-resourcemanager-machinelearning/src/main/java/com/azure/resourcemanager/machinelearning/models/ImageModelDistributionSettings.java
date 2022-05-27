// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Distribution expressions to sweep over values of model settings. &lt;example&gt; Some examples are: &lt;code&gt;
 * ModelName = "choice('seresnext', 'resnest50')"; LearningRate = "uniform(0.001, 0.01)"; LayersToFreeze = "choice(0,
 * 2)"; &lt;/code&gt;&lt;/example&gt; All distributions can be specified as distribution_name(min, max) or choice(val1,
 * val2, ..., valn) where distribution name can be: uniform, quniform, loguniform, etc For more details on how to
 * compose distribution expressions please check the documentation:
 * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-tune-hyperparameters For more information on the
 * available settings please visit the official documentation:
 * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
 */
@Fluent
public class ImageModelDistributionSettings {
    /*
     * Enable AMSGrad when optimizer is 'adam' or 'adamw'.
     */
    @JsonProperty(value = "amsGradient")
    private String amsGradient;

    /*
     * Settings for using Augmentations.
     */
    @JsonProperty(value = "augmentations")
    private String augmentations;

    /*
     * Value of 'beta1' when optimizer is 'adam' or 'adamw'. Must be a float in
     * the range [0, 1].
     */
    @JsonProperty(value = "beta1")
    private String beta1;

    /*
     * Value of 'beta2' when optimizer is 'adam' or 'adamw'. Must be a float in
     * the range [0, 1].
     */
    @JsonProperty(value = "beta2")
    private String beta2;

    /*
     * Whether to use distributer training.
     */
    @JsonProperty(value = "distributed")
    private String distributed;

    /*
     * Enable early stopping logic during training.
     */
    @JsonProperty(value = "earlyStopping")
    private String earlyStopping;

    /*
     * Minimum number of epochs or validation evaluations to wait before
     * primary metric improvement
     * is tracked for early stopping. Must be a positive integer.
     */
    @JsonProperty(value = "earlyStoppingDelay")
    private String earlyStoppingDelay;

    /*
     * Minimum number of epochs or validation evaluations with no primary
     * metric improvement before
     * the run is stopped. Must be a positive integer.
     */
    @JsonProperty(value = "earlyStoppingPatience")
    private String earlyStoppingPatience;

    /*
     * Enable normalization when exporting ONNX model.
     */
    @JsonProperty(value = "enableOnnxNormalization")
    private String enableOnnxNormalization;

    /*
     * Frequency to evaluate validation dataset to get metric scores. Must be a
     * positive integer.
     */
    @JsonProperty(value = "evaluationFrequency")
    private String evaluationFrequency;

    /*
     * Gradient accumulation means running a configured number of
     * "GradAccumulationStep"\  steps without
     * updating the model weights while accumulating the gradients of those
     * steps, and then using
     * the accumulated gradients to compute the weight updates. Must be a
     * positive integer.
     */
    @JsonProperty(value = "gradientAccumulationStep")
    private String gradientAccumulationStep;

    /*
     * Number of layers to freeze for the model. Must be a positive integer.
     * For instance, passing 2 as value for 'seresnext' means
     * freezing layer0 and layer1. For a full list of models supported and
     * details on layer freeze, please
     * see:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     */
    @JsonProperty(value = "layersToFreeze")
    private String layersToFreeze;

    /*
     * Initial learning rate. Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "learningRate")
    private String learningRate;

    /*
     * Type of learning rate scheduler. Must be 'warmup_cosine' or 'step'.
     */
    @JsonProperty(value = "learningRateScheduler")
    private String learningRateScheduler;

    /*
     * Name of the model to use for training.
     * For more information on the available models please visit the official
     * documentation:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     */
    @JsonProperty(value = "modelName")
    private String modelName;

    /*
     * Value of momentum when optimizer is 'sgd'. Must be a float in the range
     * [0, 1].
     */
    @JsonProperty(value = "momentum")
    private String momentum;

    /*
     * Enable nesterov when optimizer is 'sgd'.
     */
    @JsonProperty(value = "nesterov")
    private String nesterov;

    /*
     * Number of training epochs. Must be a positive integer.
     */
    @JsonProperty(value = "numberOfEpochs")
    private String numberOfEpochs;

    /*
     * Number of data loader workers. Must be a non-negative integer.
     */
    @JsonProperty(value = "numberOfWorkers")
    private String numberOfWorkers;

    /*
     * Type of optimizer. Must be either 'sgd', 'adam', or 'adamw'.
     */
    @JsonProperty(value = "optimizer")
    private String optimizer;

    /*
     * Random seed to be used when using deterministic training.
     */
    @JsonProperty(value = "randomSeed")
    private String randomSeed;

    /*
     * If validation data is not defined, this specifies the split ratio for
     * splitting
     * train data into random train and validation subsets. Must be a float in
     * the range [0, 1].
     */
    @JsonProperty(value = "splitRatio")
    private String splitRatio;

    /*
     * Value of gamma when learning rate scheduler is 'step'. Must be a float
     * in the range [0, 1].
     */
    @JsonProperty(value = "stepLRGamma")
    private String stepLRGamma;

    /*
     * Value of step size when learning rate scheduler is 'step'. Must be a
     * positive integer.
     */
    @JsonProperty(value = "stepLRStepSize")
    private String stepLRStepSize;

    /*
     * Training batch size. Must be a positive integer.
     */
    @JsonProperty(value = "trainingBatchSize")
    private String trainingBatchSize;

    /*
     * Validation batch size. Must be a positive integer.
     */
    @JsonProperty(value = "validationBatchSize")
    private String validationBatchSize;

    /*
     * Value of cosine cycle when learning rate scheduler is 'warmup_cosine'.
     * Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "warmupCosineLRCycles")
    private String warmupCosineLRCycles;

    /*
     * Value of warmup epochs when learning rate scheduler is 'warmup_cosine'.
     * Must be a positive integer.
     */
    @JsonProperty(value = "warmupCosineLRWarmupEpochs")
    private String warmupCosineLRWarmupEpochs;

    /*
     * Value of weight decay when optimizer is 'sgd', 'adam', or 'adamw'. Must
     * be a float in the range[0, 1].
     */
    @JsonProperty(value = "weightDecay")
    private String weightDecay;

    /**
     * Get the amsGradient property: Enable AMSGrad when optimizer is 'adam' or 'adamw'.
     *
     * @return the amsGradient value.
     */
    public String amsGradient() {
        return this.amsGradient;
    }

    /**
     * Set the amsGradient property: Enable AMSGrad when optimizer is 'adam' or 'adamw'.
     *
     * @param amsGradient the amsGradient value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withAmsGradient(String amsGradient) {
        this.amsGradient = amsGradient;
        return this;
    }

    /**
     * Get the augmentations property: Settings for using Augmentations.
     *
     * @return the augmentations value.
     */
    public String augmentations() {
        return this.augmentations;
    }

    /**
     * Set the augmentations property: Settings for using Augmentations.
     *
     * @param augmentations the augmentations value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withAugmentations(String augmentations) {
        this.augmentations = augmentations;
        return this;
    }

    /**
     * Get the beta1 property: Value of 'beta1' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @return the beta1 value.
     */
    public String beta1() {
        return this.beta1;
    }

    /**
     * Set the beta1 property: Value of 'beta1' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @param beta1 the beta1 value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withBeta1(String beta1) {
        this.beta1 = beta1;
        return this;
    }

    /**
     * Get the beta2 property: Value of 'beta2' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @return the beta2 value.
     */
    public String beta2() {
        return this.beta2;
    }

    /**
     * Set the beta2 property: Value of 'beta2' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @param beta2 the beta2 value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withBeta2(String beta2) {
        this.beta2 = beta2;
        return this;
    }

    /**
     * Get the distributed property: Whether to use distributer training.
     *
     * @return the distributed value.
     */
    public String distributed() {
        return this.distributed;
    }

    /**
     * Set the distributed property: Whether to use distributer training.
     *
     * @param distributed the distributed value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withDistributed(String distributed) {
        this.distributed = distributed;
        return this;
    }

    /**
     * Get the earlyStopping property: Enable early stopping logic during training.
     *
     * @return the earlyStopping value.
     */
    public String earlyStopping() {
        return this.earlyStopping;
    }

    /**
     * Set the earlyStopping property: Enable early stopping logic during training.
     *
     * @param earlyStopping the earlyStopping value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withEarlyStopping(String earlyStopping) {
        this.earlyStopping = earlyStopping;
        return this;
    }

    /**
     * Get the earlyStoppingDelay property: Minimum number of epochs or validation evaluations to wait before primary
     * metric improvement is tracked for early stopping. Must be a positive integer.
     *
     * @return the earlyStoppingDelay value.
     */
    public String earlyStoppingDelay() {
        return this.earlyStoppingDelay;
    }

    /**
     * Set the earlyStoppingDelay property: Minimum number of epochs or validation evaluations to wait before primary
     * metric improvement is tracked for early stopping. Must be a positive integer.
     *
     * @param earlyStoppingDelay the earlyStoppingDelay value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withEarlyStoppingDelay(String earlyStoppingDelay) {
        this.earlyStoppingDelay = earlyStoppingDelay;
        return this;
    }

    /**
     * Get the earlyStoppingPatience property: Minimum number of epochs or validation evaluations with no primary metric
     * improvement before the run is stopped. Must be a positive integer.
     *
     * @return the earlyStoppingPatience value.
     */
    public String earlyStoppingPatience() {
        return this.earlyStoppingPatience;
    }

    /**
     * Set the earlyStoppingPatience property: Minimum number of epochs or validation evaluations with no primary metric
     * improvement before the run is stopped. Must be a positive integer.
     *
     * @param earlyStoppingPatience the earlyStoppingPatience value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withEarlyStoppingPatience(String earlyStoppingPatience) {
        this.earlyStoppingPatience = earlyStoppingPatience;
        return this;
    }

    /**
     * Get the enableOnnxNormalization property: Enable normalization when exporting ONNX model.
     *
     * @return the enableOnnxNormalization value.
     */
    public String enableOnnxNormalization() {
        return this.enableOnnxNormalization;
    }

    /**
     * Set the enableOnnxNormalization property: Enable normalization when exporting ONNX model.
     *
     * @param enableOnnxNormalization the enableOnnxNormalization value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withEnableOnnxNormalization(String enableOnnxNormalization) {
        this.enableOnnxNormalization = enableOnnxNormalization;
        return this;
    }

    /**
     * Get the evaluationFrequency property: Frequency to evaluate validation dataset to get metric scores. Must be a
     * positive integer.
     *
     * @return the evaluationFrequency value.
     */
    public String evaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * Set the evaluationFrequency property: Frequency to evaluate validation dataset to get metric scores. Must be a
     * positive integer.
     *
     * @param evaluationFrequency the evaluationFrequency value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withEvaluationFrequency(String evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
        return this;
    }

    /**
     * Get the gradientAccumulationStep property: Gradient accumulation means running a configured number of
     * "GradAccumulationStep"\ steps without updating the model weights while accumulating the gradients of those steps,
     * and then using the accumulated gradients to compute the weight updates. Must be a positive integer.
     *
     * @return the gradientAccumulationStep value.
     */
    public String gradientAccumulationStep() {
        return this.gradientAccumulationStep;
    }

    /**
     * Set the gradientAccumulationStep property: Gradient accumulation means running a configured number of
     * "GradAccumulationStep"\ steps without updating the model weights while accumulating the gradients of those steps,
     * and then using the accumulated gradients to compute the weight updates. Must be a positive integer.
     *
     * @param gradientAccumulationStep the gradientAccumulationStep value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withGradientAccumulationStep(String gradientAccumulationStep) {
        this.gradientAccumulationStep = gradientAccumulationStep;
        return this;
    }

    /**
     * Get the layersToFreeze property: Number of layers to freeze for the model. Must be a positive integer. For
     * instance, passing 2 as value for 'seresnext' means freezing layer0 and layer1. For a full list of models
     * supported and details on layer freeze, please see:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @return the layersToFreeze value.
     */
    public String layersToFreeze() {
        return this.layersToFreeze;
    }

    /**
     * Set the layersToFreeze property: Number of layers to freeze for the model. Must be a positive integer. For
     * instance, passing 2 as value for 'seresnext' means freezing layer0 and layer1. For a full list of models
     * supported and details on layer freeze, please see:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @param layersToFreeze the layersToFreeze value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withLayersToFreeze(String layersToFreeze) {
        this.layersToFreeze = layersToFreeze;
        return this;
    }

    /**
     * Get the learningRate property: Initial learning rate. Must be a float in the range [0, 1].
     *
     * @return the learningRate value.
     */
    public String learningRate() {
        return this.learningRate;
    }

    /**
     * Set the learningRate property: Initial learning rate. Must be a float in the range [0, 1].
     *
     * @param learningRate the learningRate value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withLearningRate(String learningRate) {
        this.learningRate = learningRate;
        return this;
    }

    /**
     * Get the learningRateScheduler property: Type of learning rate scheduler. Must be 'warmup_cosine' or 'step'.
     *
     * @return the learningRateScheduler value.
     */
    public String learningRateScheduler() {
        return this.learningRateScheduler;
    }

    /**
     * Set the learningRateScheduler property: Type of learning rate scheduler. Must be 'warmup_cosine' or 'step'.
     *
     * @param learningRateScheduler the learningRateScheduler value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withLearningRateScheduler(String learningRateScheduler) {
        this.learningRateScheduler = learningRateScheduler;
        return this;
    }

    /**
     * Get the modelName property: Name of the model to use for training. For more information on the available models
     * please visit the official documentation:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @return the modelName value.
     */
    public String modelName() {
        return this.modelName;
    }

    /**
     * Set the modelName property: Name of the model to use for training. For more information on the available models
     * please visit the official documentation:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @param modelName the modelName value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Get the momentum property: Value of momentum when optimizer is 'sgd'. Must be a float in the range [0, 1].
     *
     * @return the momentum value.
     */
    public String momentum() {
        return this.momentum;
    }

    /**
     * Set the momentum property: Value of momentum when optimizer is 'sgd'. Must be a float in the range [0, 1].
     *
     * @param momentum the momentum value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withMomentum(String momentum) {
        this.momentum = momentum;
        return this;
    }

    /**
     * Get the nesterov property: Enable nesterov when optimizer is 'sgd'.
     *
     * @return the nesterov value.
     */
    public String nesterov() {
        return this.nesterov;
    }

    /**
     * Set the nesterov property: Enable nesterov when optimizer is 'sgd'.
     *
     * @param nesterov the nesterov value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withNesterov(String nesterov) {
        this.nesterov = nesterov;
        return this;
    }

    /**
     * Get the numberOfEpochs property: Number of training epochs. Must be a positive integer.
     *
     * @return the numberOfEpochs value.
     */
    public String numberOfEpochs() {
        return this.numberOfEpochs;
    }

    /**
     * Set the numberOfEpochs property: Number of training epochs. Must be a positive integer.
     *
     * @param numberOfEpochs the numberOfEpochs value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withNumberOfEpochs(String numberOfEpochs) {
        this.numberOfEpochs = numberOfEpochs;
        return this;
    }

    /**
     * Get the numberOfWorkers property: Number of data loader workers. Must be a non-negative integer.
     *
     * @return the numberOfWorkers value.
     */
    public String numberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * Set the numberOfWorkers property: Number of data loader workers. Must be a non-negative integer.
     *
     * @param numberOfWorkers the numberOfWorkers value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withNumberOfWorkers(String numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * Get the optimizer property: Type of optimizer. Must be either 'sgd', 'adam', or 'adamw'.
     *
     * @return the optimizer value.
     */
    public String optimizer() {
        return this.optimizer;
    }

    /**
     * Set the optimizer property: Type of optimizer. Must be either 'sgd', 'adam', or 'adamw'.
     *
     * @param optimizer the optimizer value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withOptimizer(String optimizer) {
        this.optimizer = optimizer;
        return this;
    }

    /**
     * Get the randomSeed property: Random seed to be used when using deterministic training.
     *
     * @return the randomSeed value.
     */
    public String randomSeed() {
        return this.randomSeed;
    }

    /**
     * Set the randomSeed property: Random seed to be used when using deterministic training.
     *
     * @param randomSeed the randomSeed value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withRandomSeed(String randomSeed) {
        this.randomSeed = randomSeed;
        return this;
    }

    /**
     * Get the splitRatio property: If validation data is not defined, this specifies the split ratio for splitting
     * train data into random train and validation subsets. Must be a float in the range [0, 1].
     *
     * @return the splitRatio value.
     */
    public String splitRatio() {
        return this.splitRatio;
    }

    /**
     * Set the splitRatio property: If validation data is not defined, this specifies the split ratio for splitting
     * train data into random train and validation subsets. Must be a float in the range [0, 1].
     *
     * @param splitRatio the splitRatio value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withSplitRatio(String splitRatio) {
        this.splitRatio = splitRatio;
        return this;
    }

    /**
     * Get the stepLRGamma property: Value of gamma when learning rate scheduler is 'step'. Must be a float in the range
     * [0, 1].
     *
     * @return the stepLRGamma value.
     */
    public String stepLRGamma() {
        return this.stepLRGamma;
    }

    /**
     * Set the stepLRGamma property: Value of gamma when learning rate scheduler is 'step'. Must be a float in the range
     * [0, 1].
     *
     * @param stepLRGamma the stepLRGamma value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withStepLRGamma(String stepLRGamma) {
        this.stepLRGamma = stepLRGamma;
        return this;
    }

    /**
     * Get the stepLRStepSize property: Value of step size when learning rate scheduler is 'step'. Must be a positive
     * integer.
     *
     * @return the stepLRStepSize value.
     */
    public String stepLRStepSize() {
        return this.stepLRStepSize;
    }

    /**
     * Set the stepLRStepSize property: Value of step size when learning rate scheduler is 'step'. Must be a positive
     * integer.
     *
     * @param stepLRStepSize the stepLRStepSize value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withStepLRStepSize(String stepLRStepSize) {
        this.stepLRStepSize = stepLRStepSize;
        return this;
    }

    /**
     * Get the trainingBatchSize property: Training batch size. Must be a positive integer.
     *
     * @return the trainingBatchSize value.
     */
    public String trainingBatchSize() {
        return this.trainingBatchSize;
    }

    /**
     * Set the trainingBatchSize property: Training batch size. Must be a positive integer.
     *
     * @param trainingBatchSize the trainingBatchSize value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withTrainingBatchSize(String trainingBatchSize) {
        this.trainingBatchSize = trainingBatchSize;
        return this;
    }

    /**
     * Get the validationBatchSize property: Validation batch size. Must be a positive integer.
     *
     * @return the validationBatchSize value.
     */
    public String validationBatchSize() {
        return this.validationBatchSize;
    }

    /**
     * Set the validationBatchSize property: Validation batch size. Must be a positive integer.
     *
     * @param validationBatchSize the validationBatchSize value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withValidationBatchSize(String validationBatchSize) {
        this.validationBatchSize = validationBatchSize;
        return this;
    }

    /**
     * Get the warmupCosineLRCycles property: Value of cosine cycle when learning rate scheduler is 'warmup_cosine'.
     * Must be a float in the range [0, 1].
     *
     * @return the warmupCosineLRCycles value.
     */
    public String warmupCosineLRCycles() {
        return this.warmupCosineLRCycles;
    }

    /**
     * Set the warmupCosineLRCycles property: Value of cosine cycle when learning rate scheduler is 'warmup_cosine'.
     * Must be a float in the range [0, 1].
     *
     * @param warmupCosineLRCycles the warmupCosineLRCycles value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withWarmupCosineLRCycles(String warmupCosineLRCycles) {
        this.warmupCosineLRCycles = warmupCosineLRCycles;
        return this;
    }

    /**
     * Get the warmupCosineLRWarmupEpochs property: Value of warmup epochs when learning rate scheduler is
     * 'warmup_cosine'. Must be a positive integer.
     *
     * @return the warmupCosineLRWarmupEpochs value.
     */
    public String warmupCosineLRWarmupEpochs() {
        return this.warmupCosineLRWarmupEpochs;
    }

    /**
     * Set the warmupCosineLRWarmupEpochs property: Value of warmup epochs when learning rate scheduler is
     * 'warmup_cosine'. Must be a positive integer.
     *
     * @param warmupCosineLRWarmupEpochs the warmupCosineLRWarmupEpochs value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withWarmupCosineLRWarmupEpochs(String warmupCosineLRWarmupEpochs) {
        this.warmupCosineLRWarmupEpochs = warmupCosineLRWarmupEpochs;
        return this;
    }

    /**
     * Get the weightDecay property: Value of weight decay when optimizer is 'sgd', 'adam', or 'adamw'. Must be a float
     * in the range[0, 1].
     *
     * @return the weightDecay value.
     */
    public String weightDecay() {
        return this.weightDecay;
    }

    /**
     * Set the weightDecay property: Value of weight decay when optimizer is 'sgd', 'adam', or 'adamw'. Must be a float
     * in the range[0, 1].
     *
     * @param weightDecay the weightDecay value to set.
     * @return the ImageModelDistributionSettings object itself.
     */
    public ImageModelDistributionSettings withWeightDecay(String weightDecay) {
        this.weightDecay = weightDecay;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
