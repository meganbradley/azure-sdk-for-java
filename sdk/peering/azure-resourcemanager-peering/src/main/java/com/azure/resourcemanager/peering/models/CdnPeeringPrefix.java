// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.resourcemanager.peering.fluent.models.CdnPeeringPrefixInner;

/** An immutable client-side representation of CdnPeeringPrefix. */
public interface CdnPeeringPrefix {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the prefix property: The prefix.
     *
     * @return the prefix value.
     */
    String prefix();

    /**
     * Gets the azureRegion property: The Azure region.
     *
     * @return the azureRegion value.
     */
    String azureRegion();

    /**
     * Gets the azureService property: The Azure service.
     *
     * @return the azureService value.
     */
    String azureService();

    /**
     * Gets the isPrimaryRegion property: The flag that indicates whether or not this is the primary region.
     *
     * @return the isPrimaryRegion value.
     */
    Boolean isPrimaryRegion();

    /**
     * Gets the bgpCommunity property: The BGP Community.
     *
     * @return the bgpCommunity value.
     */
    String bgpCommunity();

    /**
     * Gets the inner com.azure.resourcemanager.peering.fluent.models.CdnPeeringPrefixInner object.
     *
     * @return the inner object.
     */
    CdnPeeringPrefixInner innerModel();
}
