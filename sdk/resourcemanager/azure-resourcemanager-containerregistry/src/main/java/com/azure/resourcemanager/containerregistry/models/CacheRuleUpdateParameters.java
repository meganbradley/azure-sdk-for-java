// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.fluent.models.CacheRuleUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters for updating a cache rule.
 */
@Fluent
public final class CacheRuleUpdateParameters {
    /*
     * The properties of the cache rule update parameters.
     */
    @JsonProperty(value = "properties")
    private CacheRuleUpdateProperties innerProperties;

    /**
     * Creates an instance of CacheRuleUpdateParameters class.
     */
    public CacheRuleUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The properties of the cache rule update parameters.
     * 
     * @return the innerProperties value.
     */
    private CacheRuleUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the credentialSetResourceId property: The ARM resource ID of the credential store which is associated with
     * the Cache rule.
     * 
     * @return the credentialSetResourceId value.
     */
    public String credentialSetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().credentialSetResourceId();
    }

    /**
     * Set the credentialSetResourceId property: The ARM resource ID of the credential store which is associated with
     * the Cache rule.
     * 
     * @param credentialSetResourceId the credentialSetResourceId value to set.
     * @return the CacheRuleUpdateParameters object itself.
     */
    public CacheRuleUpdateParameters withCredentialSetResourceId(String credentialSetResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheRuleUpdateProperties();
        }
        this.innerProperties().withCredentialSetResourceId(credentialSetResourceId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
