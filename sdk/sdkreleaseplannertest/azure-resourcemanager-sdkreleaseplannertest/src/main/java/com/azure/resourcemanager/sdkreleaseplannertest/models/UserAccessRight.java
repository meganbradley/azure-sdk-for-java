// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The mapping between a particular user and the access type on the SMB share. */
@Fluent
public final class UserAccessRight {
    /*
     * User ID (already existing in the device).
     */
    @JsonProperty(value = "userId", required = true)
    private String userId;

    /*
     * Type of access to be allowed for the user.
     */
    @JsonProperty(value = "accessType", required = true)
    private ShareAccessType accessType;

    /** Creates an instance of UserAccessRight class. */
    public UserAccessRight() {
    }

    /**
     * Get the userId property: User ID (already existing in the device).
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId property: User ID (already existing in the device).
     *
     * @param userId the userId value to set.
     * @return the UserAccessRight object itself.
     */
    public UserAccessRight withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the accessType property: Type of access to be allowed for the user.
     *
     * @return the accessType value.
     */
    public ShareAccessType accessType() {
        return this.accessType;
    }

    /**
     * Set the accessType property: Type of access to be allowed for the user.
     *
     * @param accessType the accessType value to set.
     * @return the UserAccessRight object itself.
     */
    public UserAccessRight withAccessType(ShareAccessType accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property userId in model UserAccessRight"));
        }
        if (accessType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property accessType in model UserAccessRight"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserAccessRight.class);
}
