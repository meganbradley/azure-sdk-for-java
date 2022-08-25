// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;

/** Samples for AutomationAccount List. */
public final class AutomationAccountListSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2021-06-22/examples/listAutomationAccountsBySubscription.json
     */
    /**
     * Sample code: List automation accounts by resource group.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listAutomationAccountsByResourceGroup(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.automationAccounts().list(Context.NONE);
    }
}
