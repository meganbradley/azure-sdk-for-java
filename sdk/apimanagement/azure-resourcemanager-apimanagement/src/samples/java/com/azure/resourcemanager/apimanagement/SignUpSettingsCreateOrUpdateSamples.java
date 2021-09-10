// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalSignupSettingsInner;
import com.azure.resourcemanager.apimanagement.models.TermsOfServiceProperties;

/** Samples for SignUpSettings CreateOrUpdate. */
public final class SignUpSettingsCreateOrUpdateSamples {
    /*
     * operationId: SignUpSettings_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementPortalSettingsUpdateSignUp
     */
    /**
     * Sample code: ApiManagementPortalSettingsUpdateSignUp.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementPortalSettingsUpdateSignUp(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .signUpSettings()
            .createOrUpdateWithResponse(
                "rg1",
                "apimService1",
                new PortalSignupSettingsInner()
                    .withEnabled(true)
                    .withTermsOfService(
                        new TermsOfServiceProperties()
                            .withText("Terms of service text.")
                            .withEnabled(true)
                            .withConsentRequired(true)),
                "*",
                Context.NONE);
    }
}
