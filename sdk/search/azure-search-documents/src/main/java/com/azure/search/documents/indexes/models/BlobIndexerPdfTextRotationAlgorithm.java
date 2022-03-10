// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobIndexerPdfTextRotationAlgorithm. */
public final class BlobIndexerPdfTextRotationAlgorithm
        extends ExpandableStringEnum<BlobIndexerPdfTextRotationAlgorithm> {
    /** Static value none for BlobIndexerPdfTextRotationAlgorithm. */
    public static final BlobIndexerPdfTextRotationAlgorithm NONE = fromString("none");

    /** Static value detectAngles for BlobIndexerPdfTextRotationAlgorithm. */
    public static final BlobIndexerPdfTextRotationAlgorithm DETECT_ANGLES = fromString("detectAngles");

    /**
     * Creates or finds a BlobIndexerPdfTextRotationAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobIndexerPdfTextRotationAlgorithm.
     */
    @JsonCreator
    public static BlobIndexerPdfTextRotationAlgorithm fromString(String name) {
        return fromString(name, BlobIndexerPdfTextRotationAlgorithm.class);
    }

    /** @return known BlobIndexerPdfTextRotationAlgorithm values. */
    public static Collection<BlobIndexerPdfTextRotationAlgorithm> values() {
        return values(BlobIndexerPdfTextRotationAlgorithm.class);
    }
}
