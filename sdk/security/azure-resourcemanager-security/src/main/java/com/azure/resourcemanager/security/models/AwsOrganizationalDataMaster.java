// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The awsOrganization data for the master account. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "organizationMembershipType")
@JsonTypeName("Organization")
@Fluent
public final class AwsOrganizationalDataMaster extends AwsOrganizationalData {
    /*
     * If the multi cloud account is of membership type organization, this will be the name of the onboarding stackset
     */
    @JsonProperty(value = "stacksetName")
    private String stacksetName;

    /*
     * If the multi cloud account is of membership type organization, list of accounts excluded from offering
     */
    @JsonProperty(value = "excludedAccountIds")
    private List<String> excludedAccountIds;

    /** Creates an instance of AwsOrganizationalDataMaster class. */
    public AwsOrganizationalDataMaster() {
    }

    /**
     * Get the stacksetName property: If the multi cloud account is of membership type organization, this will be the
     * name of the onboarding stackset.
     *
     * @return the stacksetName value.
     */
    public String stacksetName() {
        return this.stacksetName;
    }

    /**
     * Set the stacksetName property: If the multi cloud account is of membership type organization, this will be the
     * name of the onboarding stackset.
     *
     * @param stacksetName the stacksetName value to set.
     * @return the AwsOrganizationalDataMaster object itself.
     */
    public AwsOrganizationalDataMaster withStacksetName(String stacksetName) {
        this.stacksetName = stacksetName;
        return this;
    }

    /**
     * Get the excludedAccountIds property: If the multi cloud account is of membership type organization, list of
     * accounts excluded from offering.
     *
     * @return the excludedAccountIds value.
     */
    public List<String> excludedAccountIds() {
        return this.excludedAccountIds;
    }

    /**
     * Set the excludedAccountIds property: If the multi cloud account is of membership type organization, list of
     * accounts excluded from offering.
     *
     * @param excludedAccountIds the excludedAccountIds value to set.
     * @return the AwsOrganizationalDataMaster object itself.
     */
    public AwsOrganizationalDataMaster withExcludedAccountIds(List<String> excludedAccountIds) {
        this.excludedAccountIds = excludedAccountIds;
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
