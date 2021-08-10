// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ORC dataset properties. */
@Fluent
public final class OrcDatasetTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrcDatasetTypeProperties.class);

    /*
     * The location of the ORC data storage.
     */
    @JsonProperty(value = "location", required = true)
    private DatasetLocation location;

    /*
     * The data orcCompressionCodec. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "orcCompressionCodec")
    private Object orcCompressionCodec;

    /**
     * Get the location property: The location of the ORC data storage.
     *
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the ORC data storage.
     *
     * @param location the location value to set.
     * @return the OrcDatasetTypeProperties object itself.
     */
    public OrcDatasetTypeProperties withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the orcCompressionCodec property: The data orcCompressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @return the orcCompressionCodec value.
     */
    public Object orcCompressionCodec() {
        return this.orcCompressionCodec;
    }

    /**
     * Set the orcCompressionCodec property: The data orcCompressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @param orcCompressionCodec the orcCompressionCodec value to set.
     * @return the OrcDatasetTypeProperties object itself.
     */
    public OrcDatasetTypeProperties withOrcCompressionCodec(Object orcCompressionCodec) {
        this.orcCompressionCodec = orcCompressionCodec;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model OrcDatasetTypeProperties"));
        } else {
            location().validate();
        }
    }
}
