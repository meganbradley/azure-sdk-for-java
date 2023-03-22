// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.models.PrivateLinkConnectionApprovalRequestResource;
import com.azure.resourcemanager.appservice.models.PrivateLinkConnectionState;

/** Samples for WebApps ApproveOrRejectPrivateEndpointConnectionSlot. */
public final class WebAppsApproveOrRejectPrivateEndpointConnectionSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/ApproveRejectSitePrivateEndpointConnectionSlot.json
     */
    /**
     * Sample code: Approves or rejects a private endpoint connection for a site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void approvesOrRejectsAPrivateEndpointConnectionForASite(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .approveOrRejectPrivateEndpointConnectionSlot(
                "rg",
                "testSite",
                "connection",
                "stage",
                new PrivateLinkConnectionApprovalRequestResource()
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkConnectionState()
                            .withStatus("Approved")
                            .withDescription("Approved by admin.")
                            .withActionsRequired("")),
                com.azure.core.util.Context.NONE);
    }
}
