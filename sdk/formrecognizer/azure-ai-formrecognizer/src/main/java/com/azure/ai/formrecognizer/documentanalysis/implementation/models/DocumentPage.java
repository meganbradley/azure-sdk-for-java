// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Content and layout elements extracted from a page from the input. */
@Fluent
public final class DocumentPage {
    /*
     * 1-based page number in the input document.
     */
    @JsonProperty(value = "pageNumber", required = true)
    private int pageNumber;

    /*
     * The general orientation of the content in clockwise direction, measured
     * in degrees between (-180, 180].
     */
    @JsonProperty(value = "angle")
    private Float angle;

    /*
     * The width of the image/PDF in pixels/inches, respectively.
     */
    @JsonProperty(value = "width")
    private Float width;

    /*
     * The height of the image/PDF in pixels/inches, respectively.
     */
    @JsonProperty(value = "height")
    private Float height;

    /*
     * The unit used by the width, height, and polygon properties. For images,
     * the unit is "pixel". For PDF, the unit is "inch".
     */
    @JsonProperty(value = "unit")
    private LengthUnit unit;

    /*
     * Location of the page in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /*
     * Extracted words from the page.
     */
    @JsonProperty(value = "words")
    private List<DocumentWord> words;

    /*
     * Extracted selection marks from the page.
     */
    @JsonProperty(value = "selectionMarks")
    private List<DocumentSelectionMark> selectionMarks;

    /*
     * Extracted lines from the page, potentially containing both textual and
     * visual elements.
     */
    @JsonProperty(value = "lines")
    private List<DocumentLine> lines;

    /**
     * Get the pageNumber property: 1-based page number in the input document.
     *
     * @return the pageNumber value.
     */
    public int getPageNumber() {
        return this.pageNumber;
    }

    /**
     * Set the pageNumber property: 1-based page number in the input document.
     *
     * @param pageNumber the pageNumber value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Get the angle property: The general orientation of the content in clockwise direction, measured in degrees
     * between (-180, 180].
     *
     * @return the angle value.
     */
    public Float getAngle() {
        return this.angle;
    }

    /**
     * Set the angle property: The general orientation of the content in clockwise direction, measured in degrees
     * between (-180, 180].
     *
     * @param angle the angle value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setAngle(Float angle) {
        this.angle = angle;
        return this;
    }

    /**
     * Get the width property: The width of the image/PDF in pixels/inches, respectively.
     *
     * @return the width value.
     */
    public Float getWidth() {
        return this.width;
    }

    /**
     * Set the width property: The width of the image/PDF in pixels/inches, respectively.
     *
     * @param width the width value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setWidth(Float width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height property: The height of the image/PDF in pixels/inches, respectively.
     *
     * @return the height value.
     */
    public Float getHeight() {
        return this.height;
    }

    /**
     * Set the height property: The height of the image/PDF in pixels/inches, respectively.
     *
     * @param height the height value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setHeight(Float height) {
        this.height = height;
        return this;
    }

    /**
     * Get the unit property: The unit used by the width, height, and polygon properties. For images, the unit is
     * "pixel". For PDF, the unit is "inch".
     *
     * @return the unit value.
     */
    public LengthUnit getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit used by the width, height, and polygon properties. For images, the unit is
     * "pixel". For PDF, the unit is "inch".
     *
     * @param unit the unit value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setUnit(LengthUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the spans property: Location of the page in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the page in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }

    /**
     * Get the words property: Extracted words from the page.
     *
     * @return the words value.
     */
    public List<DocumentWord> getWords() {
        return this.words;
    }

    /**
     * Set the words property: Extracted words from the page.
     *
     * @param words the words value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setWords(List<DocumentWord> words) {
        this.words = words;
        return this;
    }

    /**
     * Get the selectionMarks property: Extracted selection marks from the page.
     *
     * @return the selectionMarks value.
     */
    public List<DocumentSelectionMark> getSelectionMarks() {
        return this.selectionMarks;
    }

    /**
     * Set the selectionMarks property: Extracted selection marks from the page.
     *
     * @param selectionMarks the selectionMarks value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setSelectionMarks(List<DocumentSelectionMark> selectionMarks) {
        this.selectionMarks = selectionMarks;
        return this;
    }

    /**
     * Get the lines property: Extracted lines from the page, potentially containing both textual and visual elements.
     *
     * @return the lines value.
     */
    public List<DocumentLine> getLines() {
        return this.lines;
    }

    /**
     * Set the lines property: Extracted lines from the page, potentially containing both textual and visual elements.
     *
     * @param lines the lines value to set.
     * @return the DocumentPage object itself.
     */
    public DocumentPage setLines(List<DocumentLine> lines) {
        this.lines = lines;
        return this;
    }
}
