// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Captions are the most representative passages from the document relatively to the search query. They are often used
 * as document summary. Captions are only returned for queries of type 'semantic'..
 */
@Fluent
public final class CaptionResult {
    /*
     * A representative text passage extracted from the document most relevant to the search query.
     */
    @JsonProperty(value = "text", access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    /*
     * Same text passage as in the Text property with highlighted phrases most relevant to the query.
     */
    @JsonProperty(value = "highlights", access = JsonProperty.Access.WRITE_ONLY)
    private String highlights;

    /*
     * Captions are the most representative passages from the document relatively to the search query. They are often
     * used as document summary. Captions are only returned for queries of type 'semantic'..
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the text property: A representative text passage extracted from the document most relevant to the search
     * query.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the highlights property: Same text passage as in the Text property with highlighted phrases most relevant to
     * the query.
     *
     * @return the highlights value.
     */
    public String getHighlights() {
        return this.highlights;
    }

    /**
     * Get the additionalProperties property: Captions are the most representative passages from the document relatively
     * to the search query. They are often used as document summary. Captions are only returned for queries of type
     * 'semantic'..
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Captions are the most representative passages from the document relatively
     * to the search query. They are often used as document summary. Captions are only returned for queries of type
     * 'semantic'..
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CaptionResult object itself.
     */
    public CaptionResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
