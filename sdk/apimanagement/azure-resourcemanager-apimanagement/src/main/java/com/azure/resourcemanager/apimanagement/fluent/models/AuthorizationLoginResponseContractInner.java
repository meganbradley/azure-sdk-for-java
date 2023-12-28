// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorization login response contract. */
@Fluent
public final class AuthorizationLoginResponseContractInner {
    /*
     * The login link
     */
    @JsonProperty(value = "loginLink")
    private String loginLink;

    /** Creates an instance of AuthorizationLoginResponseContractInner class. */
    public AuthorizationLoginResponseContractInner() {
    }

    /**
     * Get the loginLink property: The login link.
     *
     * @return the loginLink value.
     */
    public String loginLink() {
        return this.loginLink;
    }

    /**
     * Set the loginLink property: The login link.
     *
     * @param loginLink the loginLink value to set.
     * @return the AuthorizationLoginResponseContractInner object itself.
     */
    public AuthorizationLoginResponseContractInner withLoginLink(String loginLink) {
        this.loginLink = loginLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
