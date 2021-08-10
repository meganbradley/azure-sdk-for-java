// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for Settings List. */
public final class SettingsListSamples {
    /**
     * Sample code: SettingList.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void settingList(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager.settings().list(Context.NONE);
    }
}
