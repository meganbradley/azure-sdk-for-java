// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InnerErrorCode. */
public final class InnerErrorCode extends ExpandableStringEnum<InnerErrorCode> {
    /** Static value InvalidRequest for InnerErrorCode. */
    public static final InnerErrorCode INVALID_REQUEST = fromString("InvalidRequest");

    /** Static value InvalidParameterValue for InnerErrorCode. */
    public static final InnerErrorCode INVALID_PARAMETER_VALUE = fromString("InvalidParameterValue");

    /** Static value KnowledgeBaseNotFound for InnerErrorCode. */
    public static final InnerErrorCode KNOWLEDGE_BASE_NOT_FOUND = fromString("KnowledgeBaseNotFound");

    /** Static value AzureCognitiveSearchNotFound for InnerErrorCode. */
    public static final InnerErrorCode AZURE_COGNITIVE_SEARCH_NOT_FOUND = fromString("AzureCognitiveSearchNotFound");

    /** Static value AzureCognitiveSearchThrottling for InnerErrorCode. */
    public static final InnerErrorCode AZURE_COGNITIVE_SEARCH_THROTTLING = fromString("AzureCognitiveSearchThrottling");

    /** Static value ExtractionFailure for InnerErrorCode. */
    public static final InnerErrorCode EXTRACTION_FAILURE = fromString("ExtractionFailure");

    /** Static value InvalidRequestBodyFormat for InnerErrorCode. */
    public static final InnerErrorCode INVALID_REQUEST_BODY_FORMAT = fromString("InvalidRequestBodyFormat");

    /** Static value EmptyRequest for InnerErrorCode. */
    public static final InnerErrorCode EMPTY_REQUEST = fromString("EmptyRequest");

    /** Static value MissingInputDocuments for InnerErrorCode. */
    public static final InnerErrorCode MISSING_INPUT_DOCUMENTS = fromString("MissingInputDocuments");

    /** Static value InvalidDocument for InnerErrorCode. */
    public static final InnerErrorCode INVALID_DOCUMENT = fromString("InvalidDocument");

    /** Static value ModelVersionIncorrect for InnerErrorCode. */
    public static final InnerErrorCode MODEL_VERSION_INCORRECT = fromString("ModelVersionIncorrect");

    /** Static value InvalidDocumentBatch for InnerErrorCode. */
    public static final InnerErrorCode INVALID_DOCUMENT_BATCH = fromString("InvalidDocumentBatch");

    /** Static value UnsupportedLanguageCode for InnerErrorCode. */
    public static final InnerErrorCode UNSUPPORTED_LANGUAGE_CODE = fromString("UnsupportedLanguageCode");

    /** Static value InvalidCountryHint for InnerErrorCode. */
    public static final InnerErrorCode INVALID_COUNTRY_HINT = fromString("InvalidCountryHint");

    /**
     * Creates or finds a InnerErrorCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InnerErrorCode.
     */
    @JsonCreator
    public static InnerErrorCode fromString(String name) {
        return fromString(name, InnerErrorCode.class);
    }

    /** @return known InnerErrorCode values. */
    public static Collection<InnerErrorCode> values() {
        return values(InnerErrorCode.class);
    }
}
