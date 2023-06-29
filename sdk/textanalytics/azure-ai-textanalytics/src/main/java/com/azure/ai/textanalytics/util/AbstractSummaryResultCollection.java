// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.util;

import com.azure.ai.textanalytics.implementation.AbstractSummaryResultCollectionPropertiesHelper;
import com.azure.ai.textanalytics.models.AbstractSummaryResult;
import com.azure.ai.textanalytics.models.TextDocumentBatchStatistics;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.IterableStream;

/**
 * A collection model that contains a list of {@link AbstractSummaryResult} along with model version and
 * batch's statistics.
 */
@Immutable
public final class AbstractSummaryResultCollection extends IterableStream<AbstractSummaryResult> {
    private String modelVersion;
    private TextDocumentBatchStatistics statistics;

    static {
        AbstractSummaryResultCollectionPropertiesHelper.setAccessor(
            new AbstractSummaryResultCollectionPropertiesHelper.AbstractSummaryResultCollectionAccessor() {
                @Override
                public void setModelVersion(AbstractSummaryResultCollection resultCollection,
                    String modelVersion) {
                    resultCollection.setModelVersion(modelVersion);
                }

                @Override
                public void setStatistics(AbstractSummaryResultCollection resultCollection,
                    TextDocumentBatchStatistics statistics) {
                    resultCollection.setStatistics(statistics);
                }
            });
    }

    /**
     * Create a {@link AbstractSummaryResultCollection} model that maintains a list of
     * {@link AbstractSummaryResult} along with model version and batch's statistics.
     *
     * @param documentResults A list of {@link AbstractSummaryResult}.
     */
    public AbstractSummaryResultCollection(Iterable<AbstractSummaryResult> documentResults) {
        super(documentResults);
    }

    /**
     * Gets the version of the text analytics model used by this operation.
     *
     * @return The model version.
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Get the batch statistics of response.
     *
     * @return The batch statistics of response.
     */
    public TextDocumentBatchStatistics getStatistics() {
        return statistics;
    }

    private void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    private void setStatistics(TextDocumentBatchStatistics statistics) {
        this.statistics = statistics;
    }
}