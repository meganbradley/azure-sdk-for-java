// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A footnote object describing a table or figure.
 */
@Immutable
public final class DocumentFootnote {
    /*
     * Content of the footnote.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /*
     * Bounding regions covering the footnote.
     */
    @Generated
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the footnote in the reading order concatenated content.
     */
    @Generated
    @JsonProperty(value = "spans")
    private List<DocumentSpan> spans;

    /*
     * Child elements of the footnote.
     */
    @Generated
    @JsonProperty(value = "elements")
    private List<String> elements;

    /**
     * Creates an instance of DocumentFootnote class.
     * 
     * @param content the content value to set.
     * @param spans the spans value to set.
     */
    @Generated
    @JsonCreator
    private DocumentFootnote(@JsonProperty(value = "content") String content,
        @JsonProperty(value = "spans") List<DocumentSpan> spans) {
        this.content = content;
        this.spans = spans;
    }

    /**
     * Get the content property: Content of the footnote.
     * 
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the footnote.
     * 
     * @return the boundingRegions value.
     */
    @Generated
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the footnote in the reading order concatenated content.
     * 
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the elements property: Child elements of the footnote.
     * 
     * @return the elements value.
     */
    @Generated
    public List<String> getElements() {
        return this.elements;
    }
}
