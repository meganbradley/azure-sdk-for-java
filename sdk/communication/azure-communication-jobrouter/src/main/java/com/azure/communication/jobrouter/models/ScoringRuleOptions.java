// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Encapsulates all options that can be passed as parameters for scoring rule with BestWorkerMode.
 */
@Fluent
public final class ScoringRuleOptions {

    /*
     * Set batch size when 'isBatchScoringEnabled' is set to true. Defaults to 20 if not configured.
     */
    @JsonProperty(value = "batchSize")
    private Integer batchSize;

    /*
     * List of extra parameters from a job that will be sent as part of the payload to scoring rule. If not set, a job's labels (sent in the payload as `job`) and a job's worker selectors (sent in the payload as `selectors`) are added to the payload of the scoring rule by default. Note: Worker labels are always sent with scoring payload.
     */
    @JsonProperty(value = "scoringParameters")
    private List<ScoringRuleParameterSelector> scoringParameters;

    /*
     * If false, will sort scores by ascending order. By default, set to true.
     */
    @JsonProperty(value = "descendingOrder")
    private Boolean descendingOrder;

    /**
     * Creates an instance of ScoringRuleOptions class.
     */
    public ScoringRuleOptions() {
    }

    /**
     * Get the batchSize property: Set batch size when 'isBatchScoringEnabled' is set to true. Defaults to 20 if not
     * configured.
     *
     * @return the batchSize value.
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: Set batch size when 'isBatchScoringEnabled' is set to true. Defaults to 20 if not
     * configured.
     *
     * @param batchSize the batchSize value to set.
     * @return the ScoringRuleOptions object itself.
     */
    public ScoringRuleOptions setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the scoringParameters property: List of extra parameters from a job that will be sent as part of the payload
     * to scoring rule. If not set, a job's labels (sent in the payload as `job`) and a job's worker selectors (sent in
     * the payload as `selectors`) are added to the payload of the scoring rule by default. Note: Worker labels are
     * always sent with scoring payload.
     *
     * @return the scoringParameters value.
     */
    public List<ScoringRuleParameterSelector> getScoringParameters() {
        return this.scoringParameters;
    }

    /**
     * Set the scoringParameters property: List of extra parameters from a job that will be sent as part of the payload
     * to scoring rule. If not set, a job's labels (sent in the payload as `job`) and a job's worker selectors (sent in
     * the payload as `selectors`) are added to the payload of the scoring rule by default. Note: Worker labels are
     * always sent with scoring payload.
     *
     * @param scoringParameters the scoringParameters value to set.
     * @return the ScoringRuleOptions object itself.
     */
    public ScoringRuleOptions setScoringParameters(List<ScoringRuleParameterSelector> scoringParameters) {
        this.scoringParameters = scoringParameters;
        return this;
    }

    /**
     * Get the descendingOrder property: If false, will sort scores by ascending order. By default, set to true.
     *
     * @return the descendingOrder value.
     */
    public Boolean isDescendingOrder() {
        return this.descendingOrder;
    }

    /**
     * Set the descendingOrder property: If false, will sort scores by ascending order. By default, set to true.
     *
     * @param descendingOrder the descendingOrder value to set.
     * @return the ScoringRuleOptions object itself.
     */
    public ScoringRuleOptions setDescendingOrder(Boolean descendingOrder) {
        this.descendingOrder = descendingOrder;
        return this;
    }

    /*
     * If set to true, will score workers in batches, and the parameter name of the worker labels will be sent as `workers`. By default, set to false and the parameter name for the worker labels will be sent as `worker`. Note: If enabled, use 'batchSize' to set batch size.
     */
    @JsonProperty(value = "isBatchScoringEnabled")
    private Boolean isBatchScoringEnabled;

    /**
     * Get the isBatchScoringEnabled property: If set to true, will score workers in batches, and the parameter name of
     * the worker labels will be sent as `workers`. By default, set to false and the parameter name for the worker
     * labels will be sent as `worker`. Note: If enabled, use 'batchSize' to set batch size.
     *
     * @return the isBatchScoringEnabled value.
     */
    public Boolean isBatchScoringEnabled() {
        return this.isBatchScoringEnabled;
    }

    /**
     * Set the isBatchScoringEnabled property: If set to true, will score workers in batches, and the parameter name of
     * the worker labels will be sent as `workers`. By default, set to false and the parameter name for the worker
     * labels will be sent as `worker`. Note: If enabled, use 'batchSize' to set batch size.
     *
     * @param isBatchScoringEnabled the isBatchScoringEnabled value to set.
     * @return the ScoringRuleOptions object itself.
     */
    public ScoringRuleOptions setBatchScoringEnabled(Boolean isBatchScoringEnabled) {
        this.isBatchScoringEnabled = isBatchScoringEnabled;
        return this;
    }

    /**
     * Set the isBatchScoringEnabled property: If set to true, will score workers in batches, and the parameter name of
     * the worker labels will be sent as `workers`. By default, set to false and the parameter name for the worker
     * labels will be sent as `worker`. Note: If enabled, use 'batchSize' to set batch size.
     *
     * @param isBatchScoringEnabled the isBatchScoringEnabled value to set.
     * @return the ScoringRuleOptions object itself.
     */
    public ScoringRuleOptions setIsBatchScoringEnabled(Boolean isBatchScoringEnabled) {
        this.isBatchScoringEnabled = isBatchScoringEnabled;
        return this;
    }
}
