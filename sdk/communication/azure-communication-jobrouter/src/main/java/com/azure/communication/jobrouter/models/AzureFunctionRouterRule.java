// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing a binding to an HTTP Triggered Azure Function. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("azure-function-rule")
@Fluent
public final class AzureFunctionRouterRule extends RouterRule {
    /*
     * URL for Azure Function
     */
    @JsonProperty(value = "functionUrl", required = true)
    private String functionUrl;

    /*
     * Credentials used to access Azure function rule
     */
    @JsonProperty(value = "credential")
    private AzureFunctionRouterRuleCredential credential;

    /**
     * Get the functionUrl property: URL for Azure Function.
     *
     * @return the functionUrl value.
     */
    public String getFunctionUrl() {
        return this.functionUrl;
    }

    /**
     * Set the functionUrl property: URL for Azure Function.
     *
     * @param functionUrl the functionUrl value to set.
     * @return the AzureFunctionRule object itself.
     */
    public AzureFunctionRouterRule setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
        return this;
    }

    /**
     * Get the credential property: Credentials used to access Azure function rule.
     *
     * @return the credential value.
     */
    public AzureFunctionRouterRuleCredential getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: Credentials used to access Azure function rule.
     *
     * @param credential the credential value to set.
     * @return the AzureFunctionRule object itself.
     */
    public AzureFunctionRouterRule setCredential(AzureFunctionRouterRuleCredential credential) {
        this.credential = credential;
        return this;
    }
}
