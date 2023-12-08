// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceCertificateOrders GetCertificate.
 */
public final class AppServiceCertificateOrdersGetCertificateSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2023-01-01/examples/
     * GetAppServiceCertificate.json
     */
    /**
     * Sample code: Get App Service Certificate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppServiceCertificate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getAppServiceCertificateOrders().getCertificateWithResponse(
            "testrg123", "SampleCertificateOrderName", "SampleCertName1", com.azure.core.util.Context.NONE);
    }
}
