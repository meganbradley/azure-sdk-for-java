// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dynatrace.fluent.models.DynatraceSingleSignOnProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the Dynatrace environment. */
@Fluent
public final class DynatraceEnvironmentProperties {
    /*
     * User id
     */
    @JsonProperty(value = "userId")
    private String userId;

    /*
     * Dynatrace Account Information
     */
    @JsonProperty(value = "accountInfo")
    private AccountInfo accountInfo;

    /*
     * Dynatrace Environment Information
     */
    @JsonProperty(value = "environmentInfo")
    private EnvironmentInfo environmentInfo;

    /*
     * The details of a Dynatrace single sign-on.
     */
    @JsonProperty(value = "singleSignOnProperties")
    private DynatraceSingleSignOnProperties singleSignOnProperties;

    /** Creates an instance of DynatraceEnvironmentProperties class. */
    public DynatraceEnvironmentProperties() {
    }

    /**
     * Get the userId property: User id.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId property: User id.
     *
     * @param userId the userId value to set.
     * @return the DynatraceEnvironmentProperties object itself.
     */
    public DynatraceEnvironmentProperties withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the accountInfo property: Dynatrace Account Information.
     *
     * @return the accountInfo value.
     */
    public AccountInfo accountInfo() {
        return this.accountInfo;
    }

    /**
     * Set the accountInfo property: Dynatrace Account Information.
     *
     * @param accountInfo the accountInfo value to set.
     * @return the DynatraceEnvironmentProperties object itself.
     */
    public DynatraceEnvironmentProperties withAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }

    /**
     * Get the environmentInfo property: Dynatrace Environment Information.
     *
     * @return the environmentInfo value.
     */
    public EnvironmentInfo environmentInfo() {
        return this.environmentInfo;
    }

    /**
     * Set the environmentInfo property: Dynatrace Environment Information.
     *
     * @param environmentInfo the environmentInfo value to set.
     * @return the DynatraceEnvironmentProperties object itself.
     */
    public DynatraceEnvironmentProperties withEnvironmentInfo(EnvironmentInfo environmentInfo) {
        this.environmentInfo = environmentInfo;
        return this;
    }

    /**
     * Get the singleSignOnProperties property: The details of a Dynatrace single sign-on.
     *
     * @return the singleSignOnProperties value.
     */
    public DynatraceSingleSignOnProperties singleSignOnProperties() {
        return this.singleSignOnProperties;
    }

    /**
     * Set the singleSignOnProperties property: The details of a Dynatrace single sign-on.
     *
     * @param singleSignOnProperties the singleSignOnProperties value to set.
     * @return the DynatraceEnvironmentProperties object itself.
     */
    public DynatraceEnvironmentProperties withSingleSignOnProperties(
        DynatraceSingleSignOnProperties singleSignOnProperties) {
        this.singleSignOnProperties = singleSignOnProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountInfo() != null) {
            accountInfo().validate();
        }
        if (environmentInfo() != null) {
            environmentInfo().validate();
        }
        if (singleSignOnProperties() != null) {
            singleSignOnProperties().validate();
        }
    }
}
