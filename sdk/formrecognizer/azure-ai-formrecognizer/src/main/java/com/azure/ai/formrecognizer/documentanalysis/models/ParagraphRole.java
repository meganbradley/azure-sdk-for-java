// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Semantic role of the paragraph.
 */
public final class ParagraphRole extends ExpandableStringEnum<ParagraphRole> {
    /**
     * Text near the top edge of the page.
     */
    public static final ParagraphRole PAGE_HEADER = fromString("pageHeader");

    /**
     * Text near the bottom edge of the page.
     */
    public static final ParagraphRole PAGE_FOOTER = fromString("pageFooter");

    /**
     * Page number.
     */
    public static final ParagraphRole PAGE_NUMBER = fromString("pageNumber");

    /**
     * Top-level title describing the entire document.
     */
    public static final ParagraphRole TITLE = fromString("title");

    /**
     * Sub heading describing a section of the document.
     */
    public static final ParagraphRole SECTION_HEADING = fromString("sectionHeading");

    /**
     * A note usually placed after the main content on a page.
     */
    public static final ParagraphRole FOOTNOTE = fromString("footnote");

    /**
     * A block of formulas, often with shared alignment.
     */
    public static final ParagraphRole FORMULA_BLOCK = fromString("formulaBlock");

    /**
     * Creates a new instance of ParagraphRole value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ParagraphRole() {
    }

    /**
     * Creates or finds a ParagraphRole from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ParagraphRole.
     */
    public static ParagraphRole fromString(String name) {
        return fromString(name, ParagraphRole.class);
    }

    /**
     * Gets known ParagraphRole values.
     * 
     * @return known ParagraphRole values.
     */
    public static Collection<ParagraphRole> values() {
        return values(ParagraphRole.class);
    }
}
