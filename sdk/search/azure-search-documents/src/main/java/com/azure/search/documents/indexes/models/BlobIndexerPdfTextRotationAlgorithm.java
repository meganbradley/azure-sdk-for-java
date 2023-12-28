// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Determines algorithm for text extraction from PDF files in Azure blob storage.
 */
public final class BlobIndexerPdfTextRotationAlgorithm
    extends ExpandableStringEnum<BlobIndexerPdfTextRotationAlgorithm> {
    /**
     * Leverages normal text extraction. This is the default.
     */
    public static final BlobIndexerPdfTextRotationAlgorithm NONE = fromString("none");

    /**
     * May produce better and more readable text extraction from PDF files that have rotated text within them. Note that
     * there may be a small performance speed impact when this parameter is used. This parameter only applies to PDF
     * files, and only to PDFs with embedded text. If the rotated text appears within an embedded image in the PDF, this
     * parameter does not apply.
     */
    public static final BlobIndexerPdfTextRotationAlgorithm DETECT_ANGLES = fromString("detectAngles");

    /**
     * Creates a new instance of BlobIndexerPdfTextRotationAlgorithm value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BlobIndexerPdfTextRotationAlgorithm() {
    }

    /**
     * Creates or finds a BlobIndexerPdfTextRotationAlgorithm from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BlobIndexerPdfTextRotationAlgorithm.
     */
    public static BlobIndexerPdfTextRotationAlgorithm fromString(String name) {
        return fromString(name, BlobIndexerPdfTextRotationAlgorithm.class);
    }

    /**
     * Gets known BlobIndexerPdfTextRotationAlgorithm values.
     * 
     * @return known BlobIndexerPdfTextRotationAlgorithm values.
     */
    public static Collection<BlobIndexerPdfTextRotationAlgorithm> values() {
        return values(BlobIndexerPdfTextRotationAlgorithm.class);
    }
}
