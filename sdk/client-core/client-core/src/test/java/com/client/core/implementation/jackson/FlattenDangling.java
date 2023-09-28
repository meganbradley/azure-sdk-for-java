// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.implementation.jackson;

import com.client.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for testing serialization.
 */
public class FlattenDangling {
    @JsonProperty("a.flattened.property")
    @JsonFlatten
    private String flattenedProperty;

    public String getFlattenedProperty() {
        return flattenedProperty;
    }

    public FlattenDangling setFlattenedProperty(String flattenedProperty) {
        this.flattenedProperty = flattenedProperty;
        return this;
    }
}
