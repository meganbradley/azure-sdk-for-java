// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.models.Encoding;
import com.azure.resourcemanager.streamanalytics.models.JsonOutputSerializationFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that are associated with the JSON serialization type.
 */
@Fluent
public final class JsonSerializationProperties {
    /*
     * Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case
     * of output. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "encoding")
    private Encoding encoding;

    /*
     * This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property
     * specifies the format of the JSON the output will be written in. The currently supported values are
     * 'lineSeparated' indicating the output will be formatted by having each JSON object separated by a new line and
     * 'array' indicating the output will be formatted as an array of JSON objects. Default value is 'lineSeparated' if
     * left null.
     */
    @JsonProperty(value = "format")
    private JsonOutputSerializationFormat format;

    /**
     * Creates an instance of JsonSerializationProperties class.
     */
    public JsonSerializationProperties() {
    }

    /**
     * Get the encoding property: Specifies the encoding of the incoming data in the case of input and the encoding of
     * outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the encoding value.
     */
    public Encoding encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding property: Specifies the encoding of the incoming data in the case of input and the encoding of
     * outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     * @param encoding the encoding value to set.
     * @return the JsonSerializationProperties object itself.
     */
    public JsonSerializationProperties withEncoding(Encoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the format property: This property only applies to JSON serialization of outputs only. It is not applicable
     * to inputs. This property specifies the format of the JSON the output will be written in. The currently supported
     * values are 'lineSeparated' indicating the output will be formatted by having each JSON object separated by a new
     * line and 'array' indicating the output will be formatted as an array of JSON objects. Default value is
     * 'lineSeparated' if left null.
     * 
     * @return the format value.
     */
    public JsonOutputSerializationFormat format() {
        return this.format;
    }

    /**
     * Set the format property: This property only applies to JSON serialization of outputs only. It is not applicable
     * to inputs. This property specifies the format of the JSON the output will be written in. The currently supported
     * values are 'lineSeparated' indicating the output will be formatted by having each JSON object separated by a new
     * line and 'array' indicating the output will be formatted as an array of JSON objects. Default value is
     * 'lineSeparated' if left null.
     * 
     * @param format the format value to set.
     * @return the JsonSerializationProperties object itself.
     */
    public JsonSerializationProperties withFormat(JsonOutputSerializationFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
