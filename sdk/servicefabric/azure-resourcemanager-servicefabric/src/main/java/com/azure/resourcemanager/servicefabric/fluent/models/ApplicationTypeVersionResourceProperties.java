// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The properties of the application type version resource.
 */
@Fluent
public final class ApplicationTypeVersionResourceProperties {
    /*
     * The current deployment or provisioning state, which only appears in the response
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The URL to the application package
     */
    @JsonProperty(value = "appPackageUrl", required = true)
    private String appPackageUrl;

    /*
     * List of application type parameters that can be overridden when creating or updating the application.
     */
    @JsonProperty(value = "defaultParameterList", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> defaultParameterList;

    /**
     * Creates an instance of ApplicationTypeVersionResourceProperties class.
     */
    public ApplicationTypeVersionResourceProperties() {
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the appPackageUrl property: The URL to the application package.
     * 
     * @return the appPackageUrl value.
     */
    public String appPackageUrl() {
        return this.appPackageUrl;
    }

    /**
     * Set the appPackageUrl property: The URL to the application package.
     * 
     * @param appPackageUrl the appPackageUrl value to set.
     * @return the ApplicationTypeVersionResourceProperties object itself.
     */
    public ApplicationTypeVersionResourceProperties withAppPackageUrl(String appPackageUrl) {
        this.appPackageUrl = appPackageUrl;
        return this;
    }

    /**
     * Get the defaultParameterList property: List of application type parameters that can be overridden when creating
     * or updating the application.
     * 
     * @return the defaultParameterList value.
     */
    public Map<String, String> defaultParameterList() {
        return this.defaultParameterList;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appPackageUrl() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property appPackageUrl in model ApplicationTypeVersionResourceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationTypeVersionResourceProperties.class);
}
