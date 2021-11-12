// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.Context;

/** Samples for Namespaces ListAuthorizationRules. */
public final class NamespacesListAuthorizationRulesSamples {
    /*
     * x-ms-original-file: specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/stable/2017-04-01/examples/Namespaces/NHNameSpaceAuthorizationRuleListAll.json
     */
    /**
     * Sample code: NameSpaceAuthorizationRuleListAll.
     *
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void nameSpaceAuthorizationRuleListAll(
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        manager.namespaces().listAuthorizationRules("5ktrial", "nh-sdk-ns", Context.NONE);
    }
}
