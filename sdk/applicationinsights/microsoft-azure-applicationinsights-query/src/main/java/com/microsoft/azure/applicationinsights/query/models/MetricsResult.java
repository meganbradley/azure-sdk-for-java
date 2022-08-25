/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metric result.
 */
public class MetricsResult {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private MetricsResultInfo value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public MetricsResultInfo value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the MetricsResult object itself.
     */
    public MetricsResult withValue(MetricsResultInfo value) {
        this.value = value;
        return this;
    }

}
