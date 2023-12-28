// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.resourcemanager.batch.fluent.models.OperationInner;

/**
 * An immutable client-side representation of Operation.
 */
public interface Operation {
    /**
     * Gets the name property: The operation name.
     * 
     * This is of the format {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation is a data action.
     * 
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: The object that describes the operation.
     * 
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: The intended executor of the operation.
     * 
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the properties property: Properties of the operation.
     * 
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the inner com.azure.resourcemanager.batch.fluent.models.OperationInner object.
     * 
     * @return the inner object.
     */
    OperationInner innerModel();
}
