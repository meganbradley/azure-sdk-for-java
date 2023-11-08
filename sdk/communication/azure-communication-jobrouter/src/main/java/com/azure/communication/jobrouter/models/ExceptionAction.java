// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The action to take when the exception is triggered. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = ExceptionAction.class)
@JsonTypeName("ExceptionAction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "cancel", value = CancelExceptionAction.class),
    @JsonSubTypes.Type(name = "manual-reclassify", value = ManualReclassifyExceptionAction.class),
    @JsonSubTypes.Type(name = "reclassify", value = ReclassifyExceptionAction.class)
})
@Immutable
public class ExceptionAction {

    /** Creates an instance of ExceptionAction class. */
    @Generated
    public ExceptionAction() {}

    /*
     * Unique Id of the exception action
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: Unique Id of the exception action.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }
}
