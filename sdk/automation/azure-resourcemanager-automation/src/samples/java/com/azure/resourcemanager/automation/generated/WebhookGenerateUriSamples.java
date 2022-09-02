// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;

/** Samples for Webhook GenerateUri. */
public final class WebhookGenerateUriSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2015-10-31/examples/webhookGenerateUri.json
     */
    /**
     * Sample code: Generate webhook uri.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void generateWebhookUri(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.webhooks().generateUriWithResponse("rg", "myAutomationAccount33", Context.NONE);
    }
}
