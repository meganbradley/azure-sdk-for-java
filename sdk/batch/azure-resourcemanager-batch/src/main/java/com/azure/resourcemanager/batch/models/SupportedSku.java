// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.resourcemanager.batch.fluent.models.SupportedSkuInner;
import java.util.List;

/**
 * An immutable client-side representation of SupportedSku.
 */
public interface SupportedSku {
    /**
     * Gets the name property: The name of the SKU.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the familyName property: The family name of the SKU.
     * 
     * @return the familyName value.
     */
    String familyName();

    /**
     * Gets the capabilities property: A collection of capabilities which this SKU supports.
     * 
     * @return the capabilities value.
     */
    List<SkuCapability> capabilities();

    /**
     * Gets the inner com.azure.resourcemanager.batch.fluent.models.SupportedSkuInner object.
     * 
     * @return the inner object.
     */
    SupportedSkuInner innerModel();
}
