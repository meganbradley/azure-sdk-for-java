// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Scaling rule.
 */
@Fluent
public final class JobScaleRule {
    /*
     * Scale Rule Name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Type of the scale rule
     * eg: azure-servicebus, redis etc.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Metadata properties to describe the scale rule.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /*
     * Authentication secrets for the scale rule.
     */
    @JsonProperty(value = "auth")
    private List<ScaleRuleAuth> auth;

    /**
     * Creates an instance of JobScaleRule class.
     */
    public JobScaleRule() {
    }

    /**
     * Get the name property: Scale Rule Name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Scale Rule Name.
     * 
     * @param name the name value to set.
     * @return the JobScaleRule object itself.
     */
    public JobScaleRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the scale rule
     * eg: azure-servicebus, redis etc.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the scale rule
     * eg: azure-servicebus, redis etc.
     * 
     * @param type the type value to set.
     * @return the JobScaleRule object itself.
     */
    public JobScaleRule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the metadata property: Metadata properties to describe the scale rule.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata properties to describe the scale rule.
     * 
     * @param metadata the metadata value to set.
     * @return the JobScaleRule object itself.
     */
    public JobScaleRule withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the auth property: Authentication secrets for the scale rule.
     * 
     * @return the auth value.
     */
    public List<ScaleRuleAuth> auth() {
        return this.auth;
    }

    /**
     * Set the auth property: Authentication secrets for the scale rule.
     * 
     * @param auth the auth value to set.
     * @return the JobScaleRule object itself.
     */
    public JobScaleRule withAuth(List<ScaleRuleAuth> auth) {
        this.auth = auth;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (auth() != null) {
            auth().forEach(e -> e.validate());
        }
    }
}
