// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.implementation.models.jsonflatten;

import com.client.core.annotation.Fluent;
import com.client.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Model used for testing {@link JsonFlatten}.
 */
@Fluent
public final class JsonFlattenOnCollectionType {
    @JsonFlatten
    @JsonProperty("jsonflatten.collection")
    private List<String> jsonFlattenCollection;

    public JsonFlattenOnCollectionType setJsonFlattenCollection(List<String> jsonFlattenCollection) {
        this.jsonFlattenCollection = jsonFlattenCollection;
        return this;
    }

    public List<String> getJsonFlattenCollection() {
        return jsonFlattenCollection;
    }
}
