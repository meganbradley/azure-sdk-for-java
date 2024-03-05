// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The context.
 */
@Immutable
public final class TermSearchResultValue {
    /*
     * The name of the term.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The name of the glossary which contains the term.
     */
    @Generated
    @JsonProperty(value = "glossaryName")
    private String glossaryName;

    /*
     * The GUID of the term.
     */
    @Generated
    @JsonProperty(value = "guid")
    private String guid;

    /**
     * Creates an instance of TermSearchResultValue class.
     */
    @Generated
    private TermSearchResultValue() {
    }

    /**
     * Get the name property: The name of the term.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the glossaryName property: The name of the glossary which contains the term.
     * 
     * @return the glossaryName value.
     */
    @Generated
    public String getGlossaryName() {
        return this.glossaryName;
    }

    /**
     * Get the guid property: The GUID of the term.
     * 
     * @return the guid value.
     */
    @Generated
    public String getGuid() {
        return this.guid;
    }
}
