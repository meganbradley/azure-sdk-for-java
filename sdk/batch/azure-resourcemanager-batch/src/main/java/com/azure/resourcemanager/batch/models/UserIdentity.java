// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of the user identity under which the task is run.
 *
 * <p>Specify either the userName or autoUser property, but not both.
 */
@Fluent
public final class UserIdentity {
    /*
     * The name of the user identity under which the task is run.
     *
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     */
    @JsonProperty(value = "userName")
    private String username;

    /*
     * Specifies the parameters for the auto user that runs a task on the Batch service.
     *
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     */
    @JsonProperty(value = "autoUser")
    private AutoUserSpecification autoUser;

    /** Creates an instance of UserIdentity class. */
    public UserIdentity() {
    }

    /**
     * Get the username property: The name of the user identity under which the task is run.
     *
     * <p>The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The name of the user identity under which the task is run.
     *
     * <p>The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @param username the username value to set.
     * @return the UserIdentity object itself.
     */
    public UserIdentity withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the autoUser property: Specifies the parameters for the auto user that runs a task on the Batch service.
     *
     * <p>The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @return the autoUser value.
     */
    public AutoUserSpecification autoUser() {
        return this.autoUser;
    }

    /**
     * Set the autoUser property: Specifies the parameters for the auto user that runs a task on the Batch service.
     *
     * <p>The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @param autoUser the autoUser value to set.
     * @return the UserIdentity object itself.
     */
    public UserIdentity withAutoUser(AutoUserSpecification autoUser) {
        this.autoUser = autoUser;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoUser() != null) {
            autoUser().validate();
        }
    }
}
