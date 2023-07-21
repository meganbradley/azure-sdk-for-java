// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.models.ActionType;
import com.azure.resourcemanager.appplatform.models.OperationDisplay;
import com.azure.resourcemanager.appplatform.models.OperationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation detail payload. */
@Fluent
public final class OperationDetailInner {
    /*
     * Name of the operation
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Indicates whether the operation is a data action
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Display of the operation
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Enum. Indicates the action type. "Internal" refers to actions that are for internal only APIs.
     */
    @JsonProperty(value = "actionType", access = JsonProperty.Access.WRITE_ONLY)
    private ActionType actionType;

    /*
     * Origin of the operation
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Properties of the operation
     */
    @JsonProperty(value = "properties")
    private OperationProperties properties;

    /** Creates an instance of OperationDetailInner class. */
    public OperationDetailInner() {
    }

    /**
     * Get the name property: Name of the operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the operation.
     *
     * @param name the name value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation is a data action.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the display property: Display of the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Display of the operation.
     *
     * @param display the display value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the actionType property: Enum. Indicates the action type. "Internal" refers to actions that are for internal
     * only APIs.
     *
     * @return the actionType value.
     */
    public ActionType actionType() {
        return this.actionType;
    }

    /**
     * Get the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Properties of the operation.
     *
     * @return the properties value.
     */
    public OperationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the operation.
     *
     * @param properties the properties value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withProperties(OperationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
