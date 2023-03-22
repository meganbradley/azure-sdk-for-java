// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.CsmPublishingCredentialsPoliciesEntityInner;

/** Samples for WebApps UpdateFtpAllowedSlot. */
public final class WebAppsUpdateFtpAllowedSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/UpdatePublishingCredentialsPolicySlot.json
     */
    /**
     * Sample code: Update FTP Allowed.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateFTPAllowed(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .updateFtpAllowedSlotWithResponse(
                "rg",
                "testSite",
                "stage",
                new CsmPublishingCredentialsPoliciesEntityInner().withAllow(true),
                com.azure.core.util.Context.NONE);
    }
}
