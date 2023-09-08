// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentModel;
import com.azure.resourcemanager.cognitiveservices.models.ModelDeprecationInfo;
import com.azure.resourcemanager.cognitiveservices.models.ModelLifecycleStatus;
import com.azure.resourcemanager.cognitiveservices.models.ModelSku;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Cognitive Services account Model. */
@Fluent
public final class AccountModelInner extends DeploymentModel {
    /*
     * Base Model Identifier.
     */
    @JsonProperty(value = "baseModel")
    private DeploymentModel baseModel;

    /*
     * If the model is default version.
     */
    @JsonProperty(value = "isDefaultVersion")
    private Boolean isDefaultVersion;

    /*
     * The list of Model Sku.
     */
    @JsonProperty(value = "skus")
    private List<ModelSku> skus;

    /*
     * The max capacity.
     */
    @JsonProperty(value = "maxCapacity")
    private Integer maxCapacity;

    /*
     * The capabilities.
     */
    @JsonProperty(value = "capabilities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> capabilities;

    /*
     * The capabilities for finetune models.
     */
    @JsonProperty(value = "finetuneCapabilities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> finetuneCapabilities;

    /*
     * Cognitive Services account ModelDeprecationInfo.
     */
    @JsonProperty(value = "deprecation")
    private ModelDeprecationInfo deprecation;

    /*
     * Model lifecycle status.
     */
    @JsonProperty(value = "lifecycleStatus")
    private ModelLifecycleStatus lifecycleStatus;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AccountModelInner class. */
    public AccountModelInner() {
    }

    /**
     * Get the baseModel property: Base Model Identifier.
     *
     * @return the baseModel value.
     */
    public DeploymentModel baseModel() {
        return this.baseModel;
    }

    /**
     * Set the baseModel property: Base Model Identifier.
     *
     * @param baseModel the baseModel value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withBaseModel(DeploymentModel baseModel) {
        this.baseModel = baseModel;
        return this;
    }

    /**
     * Get the isDefaultVersion property: If the model is default version.
     *
     * @return the isDefaultVersion value.
     */
    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * Set the isDefaultVersion property: If the model is default version.
     *
     * @param isDefaultVersion the isDefaultVersion value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * Get the skus property: The list of Model Sku.
     *
     * @return the skus value.
     */
    public List<ModelSku> skus() {
        return this.skus;
    }

    /**
     * Set the skus property: The list of Model Sku.
     *
     * @param skus the skus value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withSkus(List<ModelSku> skus) {
        this.skus = skus;
        return this;
    }

    /**
     * Get the maxCapacity property: The max capacity.
     *
     * @return the maxCapacity value.
     */
    public Integer maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Set the maxCapacity property: The max capacity.
     *
     * @param maxCapacity the maxCapacity value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * Get the capabilities property: The capabilities.
     *
     * @return the capabilities value.
     */
    public Map<String, String> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The capabilities.
     *
     * @param capabilities the capabilities value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withCapabilities(Map<String, String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the finetuneCapabilities property: The capabilities for finetune models.
     *
     * @return the finetuneCapabilities value.
     */
    public Map<String, String> finetuneCapabilities() {
        return this.finetuneCapabilities;
    }

    /**
     * Set the finetuneCapabilities property: The capabilities for finetune models.
     *
     * @param finetuneCapabilities the finetuneCapabilities value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withFinetuneCapabilities(Map<String, String> finetuneCapabilities) {
        this.finetuneCapabilities = finetuneCapabilities;
        return this;
    }

    /**
     * Get the deprecation property: Cognitive Services account ModelDeprecationInfo.
     *
     * @return the deprecation value.
     */
    public ModelDeprecationInfo deprecation() {
        return this.deprecation;
    }

    /**
     * Set the deprecation property: Cognitive Services account ModelDeprecationInfo.
     *
     * @param deprecation the deprecation value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withDeprecation(ModelDeprecationInfo deprecation) {
        this.deprecation = deprecation;
        return this;
    }

    /**
     * Get the lifecycleStatus property: Model lifecycle status.
     *
     * @return the lifecycleStatus value.
     */
    public ModelLifecycleStatus lifecycleStatus() {
        return this.lifecycleStatus;
    }

    /**
     * Set the lifecycleStatus property: Model lifecycle status.
     *
     * @param lifecycleStatus the lifecycleStatus value to set.
     * @return the AccountModelInner object itself.
     */
    public AccountModelInner withLifecycleStatus(ModelLifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AccountModelInner withFormat(String format) {
        super.withFormat(format);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountModelInner withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountModelInner withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountModelInner withSource(String source) {
        super.withSource(source);
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
        if (baseModel() != null) {
            baseModel().validate();
        }
        if (skus() != null) {
            skus().forEach(e -> e.validate());
        }
        if (deprecation() != null) {
            deprecation().validate();
        }
    }
}
