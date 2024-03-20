// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models.SapAvailabilityZoneDetailsResultInner;
import java.util.List;

/**
 * An immutable client-side representation of SapAvailabilityZoneDetailsResult.
 */
public interface SapAvailabilityZoneDetailsResult {
    /**
     * Gets the availabilityZonePairs property: Gets the list of availability zone pairs.
     * 
     * @return the availabilityZonePairs value.
     */
    List<SapAvailabilityZonePair> availabilityZonePairs();

    /**
     * Gets the inner
     * com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models.SapAvailabilityZoneDetailsResultInner object.
     * 
     * @return the inner object.
     */
    SapAvailabilityZoneDetailsResultInner innerModel();
}
