// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.WorkerSelectorAttachmentKind;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes a set of worker selectors that will be attached if the given condition resolves to true.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = ConditionalWorkerSelectorAttachmentInternal.class,
    visible = true)
@JsonTypeName("conditional")
@Immutable
public final class ConditionalWorkerSelectorAttachmentInternal extends WorkerSelectorAttachmentInternal {

    /*
     * The condition that must be true for the worker selectors to be attached.
     */
    @Generated
    @JsonProperty(value = "condition")
    private final RouterRuleInternal condition;

    /*
     * The worker selectors to attach.
     */
    @Generated
    @JsonProperty(value = "workerSelectors")
    private final List<RouterWorkerSelectorInternal> workerSelectors;

    /**
     * Creates an instance of ConditionalWorkerSelectorAttachmentInternal class.
     *
     * @param condition the condition value to set.
     * @param workerSelectors the workerSelectors value to set.
     */
    @Generated
    @JsonCreator
    public ConditionalWorkerSelectorAttachmentInternal(@JsonProperty(value = "condition") RouterRuleInternal condition,
        @JsonProperty(value = "workerSelectors") List<RouterWorkerSelectorInternal> workerSelectors) {
        this.condition = condition;
        this.workerSelectors = workerSelectors;
    }

    /**
     * Get the condition property: The condition that must be true for the worker selectors to be attached.
     *
     * @return the condition value.
     */
    @Generated
    public RouterRuleInternal getCondition() {
        return this.condition;
    }

    /**
     * Get the workerSelectors property: The worker selectors to attach.
     *
     * @return the workerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelectorInternal> getWorkerSelectors() {
        return this.workerSelectors;
    }

    /*
     * The type discriminator describing a sub-type of WorkerSelectorAttachment.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private WorkerSelectorAttachmentKind kind = WorkerSelectorAttachmentKind.CONDITIONAL;

    /**
     * Get the kind property: The type discriminator describing a sub-type of WorkerSelectorAttachment.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public WorkerSelectorAttachmentKind getKind() {
        return this.kind;
    }
}
