// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enumeration of supported Text Analysis tasks. */
public final class AnalyzeTextTaskKind extends ExpandableStringEnum<AnalyzeTextTaskKind> {
    /** Static value SentimentAnalysis for AnalyzeTextTaskKind. */
    public static final AnalyzeTextTaskKind SENTIMENT_ANALYSIS = fromString("SentimentAnalysis");

    /** Static value EntityRecognition for AnalyzeTextTaskKind. */
    public static final AnalyzeTextTaskKind ENTITY_RECOGNITION = fromString("EntityRecognition");

    /** Static value PiiEntityRecognition for AnalyzeTextTaskKind. */
    public static final AnalyzeTextTaskKind PII_ENTITY_RECOGNITION = fromString("PiiEntityRecognition");

    /** Static value KeyPhraseExtraction for AnalyzeTextTaskKind. */
    public static final AnalyzeTextTaskKind KEY_PHRASE_EXTRACTION = fromString("KeyPhraseExtraction");

    /** Static value LanguageDetection for AnalyzeTextTaskKind. */
    public static final AnalyzeTextTaskKind LANGUAGE_DETECTION = fromString("LanguageDetection");

    /** Static value EntityLinking for AnalyzeTextTaskKind. */
    public static final AnalyzeTextTaskKind ENTITY_LINKING = fromString("EntityLinking");

    /**
     * Creates a new instance of AnalyzeTextTaskKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AnalyzeTextTaskKind() {}

    /**
     * Creates or finds a AnalyzeTextTaskKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnalyzeTextTaskKind.
     */
    @JsonCreator
    public static AnalyzeTextTaskKind fromString(String name) {
        return fromString(name, AnalyzeTextTaskKind.class);
    }

    /**
     * Gets known AnalyzeTextTaskKind values.
     *
     * @return known AnalyzeTextTaskKind values.
     */
    public static Collection<AnalyzeTextTaskKind> values() {
        return values(AnalyzeTextTaskKind.class);
    }
}
