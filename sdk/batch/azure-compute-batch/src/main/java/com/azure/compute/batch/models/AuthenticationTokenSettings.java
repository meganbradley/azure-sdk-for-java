// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The settings for an authentication token that the Task can use to perform Batch service operations. */
@Fluent
public final class AuthenticationTokenSettings {

    /*
     * The Batch resources to which the token grants access. The authentication token grants access to a limited set of
     * Batch service operations. Currently the only supported value for the access property is 'job', which grants
     * access to all operations related to the Job which contains the Task.
     */
    @Generated
    @JsonProperty(value = "access")
    private List<AccessScope> access;

    /** Creates an instance of AuthenticationTokenSettings class. */
    @Generated
    public AuthenticationTokenSettings() {}

    /**
     * Get the access property: The Batch resources to which the token grants access. The authentication token grants
     * access to a limited set of Batch service operations. Currently the only supported value for the access property
     * is 'job', which grants access to all operations related to the Job which contains the Task.
     *
     * @return the access value.
     */
    @Generated
    public List<AccessScope> getAccess() {
        return this.access;
    }

    /**
     * Set the access property: The Batch resources to which the token grants access. The authentication token grants
     * access to a limited set of Batch service operations. Currently the only supported value for the access property
     * is 'job', which grants access to all operations related to the Job which contains the Task.
     *
     * @param access the access value to set.
     * @return the AuthenticationTokenSettings object itself.
     */
    @Generated
    public AuthenticationTokenSettings setAccess(List<AccessScope> access) {
        this.access = access;
        return this;
    }
}
