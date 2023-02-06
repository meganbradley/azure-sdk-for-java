// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The resource-names input to specify custom names for underlying azure resources that are part of a three tier SAP
 * system.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "namingPatternType",
    defaultImpl = ThreeTierCustomResourceNames.class)
@JsonTypeName("ThreeTierCustomResourceNames")
@JsonSubTypes({@JsonSubTypes.Type(name = "FullResourceName", value = ThreeTierFullResourceNames.class)})
@Immutable
public class ThreeTierCustomResourceNames {
    /** Creates an instance of ThreeTierCustomResourceNames class. */
    public ThreeTierCustomResourceNames() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
