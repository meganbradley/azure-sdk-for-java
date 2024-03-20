// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.resourcemanager.support.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.support.models.Type;

/**
 * Samples for SupportTicketsNoSubscription CheckNameAvailability.
 */
public final class SupportTicketsNoSubscriptionCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/
     * CheckNameAvailability.json
     */
    /**
     * Sample code: Checks whether name is available for SupportTicket resource.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void
        checksWhetherNameIsAvailableForSupportTicketResource(com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions().checkNameAvailabilityWithResponse(
            new CheckNameAvailabilityInput().withName("sampleName").withType(Type.MICROSOFT_SUPPORT_SUPPORT_TICKETS),
            com.azure.core.util.Context.NONE);
    }
}
