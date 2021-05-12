// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KPI extract. */
@Fluent
public final class KpiExtract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KpiExtract.class);

    /*
     * KPI extract name.
     */
    @JsonProperty(value = "extractName", required = true)
    private String extractName;

    /*
     * The expression.
     */
    @JsonProperty(value = "expression", required = true)
    private String expression;

    /**
     * Get the extractName property: KPI extract name.
     *
     * @return the extractName value.
     */
    public String extractName() {
        return this.extractName;
    }

    /**
     * Set the extractName property: KPI extract name.
     *
     * @param extractName the extractName value to set.
     * @return the KpiExtract object itself.
     */
    public KpiExtract withExtractName(String extractName) {
        this.extractName = extractName;
        return this;
    }

    /**
     * Get the expression property: The expression.
     *
     * @return the expression value.
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression property: The expression.
     *
     * @param expression the expression value to set.
     * @return the KpiExtract object itself.
     */
    public KpiExtract withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extractName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property extractName in model KpiExtract"));
        }
        if (expression() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property expression in model KpiExtract"));
        }
    }
}
