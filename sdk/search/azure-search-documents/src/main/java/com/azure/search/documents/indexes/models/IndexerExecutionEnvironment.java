// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IndexerExecutionEnvironment. */
public final class IndexerExecutionEnvironment extends ExpandableStringEnum<IndexerExecutionEnvironment> {
    /** Static value standard for IndexerExecutionEnvironment. */
    public static final IndexerExecutionEnvironment STANDARD = fromString("standard");

    /** Static value private for IndexerExecutionEnvironment. */
    public static final IndexerExecutionEnvironment PRIVATE = fromString("private");

    /**
     * Creates or finds a IndexerExecutionEnvironment from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IndexerExecutionEnvironment.
     */
    @JsonCreator
    public static IndexerExecutionEnvironment fromString(String name) {
        return fromString(name, IndexerExecutionEnvironment.class);
    }

    /**
     * Gets known IndexerExecutionEnvironment values.
     *
     * @return known IndexerExecutionEnvironment values.
     */
    public static Collection<IndexerExecutionEnvironment> values() {
        return values(IndexerExecutionEnvironment.class);
    }
}
