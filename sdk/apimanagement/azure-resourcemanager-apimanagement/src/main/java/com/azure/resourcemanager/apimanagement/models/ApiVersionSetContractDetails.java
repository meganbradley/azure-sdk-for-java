// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An API Version Set contains the common configuration for a set of API Versions relating. */
@Fluent
public final class ApiVersionSetContractDetails {
    /*
     * Identifier for existing API Version Set. Omit this value to create a new Version Set.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The display Name of the API Version Set.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of API Version Set.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * An value that determines where the API Version identifier will be located in a HTTP request.
     */
    @JsonProperty(value = "versioningScheme")
    private VersioningScheme versioningScheme;

    /*
     * Name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     */
    @JsonProperty(value = "versionQueryName")
    private String versionQueryName;

    /*
     * Name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     */
    @JsonProperty(value = "versionHeaderName")
    private String versionHeaderName;

    /** Creates an instance of ApiVersionSetContractDetails class. */
    public ApiVersionSetContractDetails() {
    }

    /**
     * Get the id property: Identifier for existing API Version Set. Omit this value to create a new Version Set.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Identifier for existing API Version Set. Omit this value to create a new Version Set.
     *
     * @param id the id value to set.
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The display Name of the API Version Set.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The display Name of the API Version Set.
     *
     * @param name the name value to set.
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of API Version Set.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of API Version Set.
     *
     * @param description the description value to set.
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the versioningScheme property: An value that determines where the API Version identifier will be located in a
     * HTTP request.
     *
     * @return the versioningScheme value.
     */
    public VersioningScheme versioningScheme() {
        return this.versioningScheme;
    }

    /**
     * Set the versioningScheme property: An value that determines where the API Version identifier will be located in a
     * HTTP request.
     *
     * @param versioningScheme the versioningScheme value to set.
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withVersioningScheme(VersioningScheme versioningScheme) {
        this.versioningScheme = versioningScheme;
        return this;
    }

    /**
     * Get the versionQueryName property: Name of query parameter that indicates the API Version if versioningScheme is
     * set to `query`.
     *
     * @return the versionQueryName value.
     */
    public String versionQueryName() {
        return this.versionQueryName;
    }

    /**
     * Set the versionQueryName property: Name of query parameter that indicates the API Version if versioningScheme is
     * set to `query`.
     *
     * @param versionQueryName the versionQueryName value to set.
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withVersionQueryName(String versionQueryName) {
        this.versionQueryName = versionQueryName;
        return this;
    }

    /**
     * Get the versionHeaderName property: Name of HTTP header parameter that indicates the API Version if
     * versioningScheme is set to `header`.
     *
     * @return the versionHeaderName value.
     */
    public String versionHeaderName() {
        return this.versionHeaderName;
    }

    /**
     * Set the versionHeaderName property: Name of HTTP header parameter that indicates the API Version if
     * versioningScheme is set to `header`.
     *
     * @param versionHeaderName the versionHeaderName value to set.
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withVersionHeaderName(String versionHeaderName) {
        this.versionHeaderName = versionHeaderName;
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
