// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing inline expression rules. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("expression-rule")
@Fluent
public final class ExpressionRule extends RouterRule {
    /*
     * The expression language to compile to and execute
     */
    @JsonProperty(value = "language", required = true)
    private String language = "powerFx";

    /*
     * The string containing the expression to evaluate. Should contain return
     * statement with calculated values.
     */
    @JsonProperty(value = "expression", required = true)
    private String expression;

    /** Creates an instance of ExpressionRule class. */
    public ExpressionRule() {
        language = "powerFx";
    }

    /**
     * Get the language property: The expression language to compile to and execute.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The expression language to compile to and execute.
     *
     * @param language the language value to set.
     * @return the ExpressionRule object itself.
     */
    public ExpressionRule setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the expression property: The string containing the expression to evaluate. Should contain return statement
     * with calculated values.
     *
     * @return the expression value.
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * Set the expression property: The string containing the expression to evaluate. Should contain return statement
     * with calculated values.
     *
     * @param expression the expression value to set.
     * @return the ExpressionRule object itself.
     */
    public ExpressionRule setExpression(String expression) {
        this.expression = expression;
        return this;
    }
}
