// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DiagnosticRemoteSupportSettingsInner;
import java.util.List;

/** An immutable client-side representation of DiagnosticRemoteSupportSettings. */
public interface DiagnosticRemoteSupportSettings {
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
     * Gets the systemData property: Represents resource creation and updation time.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the remoteSupportSettingsList property: Remote support settings list according to the RemoteApplicationType.
     *
     * @return the remoteSupportSettingsList value.
     */
    List<RemoteSupportSettings> remoteSupportSettingsList();

    /**
     * Gets the inner com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DiagnosticRemoteSupportSettingsInner
     * object.
     *
     * @return the inner object.
     */
    DiagnosticRemoteSupportSettingsInner innerModel();
}
