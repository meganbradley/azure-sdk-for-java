// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The role management policy expiration rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("RoleManagementPolicyExpirationRule")
@Fluent
public final class RoleManagementPolicyExpirationRule extends RoleManagementPolicyRule {
    /*
     * The value indicating whether expiration is required.
     */
    @JsonProperty(value = "isExpirationRequired")
    private Boolean isExpirationRequired;

    /*
     * The maximum duration of expiration in timespan.
     */
    @JsonProperty(value = "maximumDuration")
    private String maximumDuration;

    /** Creates an instance of RoleManagementPolicyExpirationRule class. */
    public RoleManagementPolicyExpirationRule() {
    }

    /**
     * Get the isExpirationRequired property: The value indicating whether expiration is required.
     *
     * @return the isExpirationRequired value.
     */
    public Boolean isExpirationRequired() {
        return this.isExpirationRequired;
    }

    /**
     * Set the isExpirationRequired property: The value indicating whether expiration is required.
     *
     * @param isExpirationRequired the isExpirationRequired value to set.
     * @return the RoleManagementPolicyExpirationRule object itself.
     */
    public RoleManagementPolicyExpirationRule withIsExpirationRequired(Boolean isExpirationRequired) {
        this.isExpirationRequired = isExpirationRequired;
        return this;
    }

    /**
     * Get the maximumDuration property: The maximum duration of expiration in timespan.
     *
     * @return the maximumDuration value.
     */
    public String maximumDuration() {
        return this.maximumDuration;
    }

    /**
     * Set the maximumDuration property: The maximum duration of expiration in timespan.
     *
     * @param maximumDuration the maximumDuration value to set.
     * @return the RoleManagementPolicyExpirationRule object itself.
     */
    public RoleManagementPolicyExpirationRule withMaximumDuration(String maximumDuration) {
        this.maximumDuration = maximumDuration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyExpirationRule withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyExpirationRule withTarget(RoleManagementPolicyRuleTarget target) {
        super.withTarget(target);
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
    }
}
