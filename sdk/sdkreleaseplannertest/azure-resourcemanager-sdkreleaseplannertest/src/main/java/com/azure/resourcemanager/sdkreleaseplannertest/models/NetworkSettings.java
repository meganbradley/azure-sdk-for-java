// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.NetworkSettingsInner;
import java.util.List;

/** An immutable client-side representation of NetworkSettings. */
public interface NetworkSettings {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of NetworkSettings.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the networkAdapters property: The network adapter list on the device.
     *
     * @return the networkAdapters value.
     */
    List<NetworkAdapter> networkAdapters();

    /**
     * Gets the inner com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.NetworkSettingsInner object.
     *
     * @return the inner object.
     */
    NetworkSettingsInner innerModel();
}
