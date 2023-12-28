// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.resourcemanager.devcenter.fluent.models.UsageInner;

/** An immutable client-side representation of Usage. */
public interface Usage {
    /**
     * Gets the currentValue property: The current usage.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the limit property: The limit integer.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the unit property: The unit details.
     *
     * @return the unit value.
     */
    UsageUnit unit();

    /**
     * Gets the name property: The name.
     *
     * @return the name value.
     */
    UsageName name();

    /**
     * Gets the id property: The fully qualified arm resource id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.UsageInner object.
     *
     * @return the inner object.
     */
    UsageInner innerModel();
}
