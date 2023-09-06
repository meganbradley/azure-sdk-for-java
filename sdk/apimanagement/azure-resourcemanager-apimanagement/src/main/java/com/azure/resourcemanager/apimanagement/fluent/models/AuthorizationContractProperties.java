// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.AuthorizationError;
import com.azure.resourcemanager.apimanagement.models.AuthorizationType;
import com.azure.resourcemanager.apimanagement.models.OAuth2GrantType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Authorization details. */
@Fluent
public final class AuthorizationContractProperties {
    /*
     * Authorization type options
     */
    @JsonProperty(value = "authorizationType")
    private AuthorizationType authorizationType;

    /*
     * OAuth2 grant type options
     */
    @JsonProperty(value = "oauth2grantType")
    private OAuth2GrantType oAuth2GrantType;

    /*
     * Authorization parameters
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * Authorization error details.
     */
    @JsonProperty(value = "error")
    private AuthorizationError error;

    /*
     * Status of the Authorization
     */
    @JsonProperty(value = "status")
    private String status;

    /** Creates an instance of AuthorizationContractProperties class. */
    public AuthorizationContractProperties() {
    }

    /**
     * Get the authorizationType property: Authorization type options.
     *
     * @return the authorizationType value.
     */
    public AuthorizationType authorizationType() {
        return this.authorizationType;
    }

    /**
     * Set the authorizationType property: Authorization type options.
     *
     * @param authorizationType the authorizationType value to set.
     * @return the AuthorizationContractProperties object itself.
     */
    public AuthorizationContractProperties withAuthorizationType(AuthorizationType authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * Get the oAuth2GrantType property: OAuth2 grant type options.
     *
     * @return the oAuth2GrantType value.
     */
    public OAuth2GrantType oAuth2GrantType() {
        return this.oAuth2GrantType;
    }

    /**
     * Set the oAuth2GrantType property: OAuth2 grant type options.
     *
     * @param oAuth2GrantType the oAuth2GrantType value to set.
     * @return the AuthorizationContractProperties object itself.
     */
    public AuthorizationContractProperties withOAuth2GrantType(OAuth2GrantType oAuth2GrantType) {
        this.oAuth2GrantType = oAuth2GrantType;
        return this;
    }

    /**
     * Get the parameters property: Authorization parameters.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Authorization parameters.
     *
     * @param parameters the parameters value to set.
     * @return the AuthorizationContractProperties object itself.
     */
    public AuthorizationContractProperties withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the error property: Authorization error details.
     *
     * @return the error value.
     */
    public AuthorizationError error() {
        return this.error;
    }

    /**
     * Set the error property: Authorization error details.
     *
     * @param error the error value to set.
     * @return the AuthorizationContractProperties object itself.
     */
    public AuthorizationContractProperties withError(AuthorizationError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the status property: Status of the Authorization.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the Authorization.
     *
     * @param status the status value to set.
     * @return the AuthorizationContractProperties object itself.
     */
    public AuthorizationContractProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}
