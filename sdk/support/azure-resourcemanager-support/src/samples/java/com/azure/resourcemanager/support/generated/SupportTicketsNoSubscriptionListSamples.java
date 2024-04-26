// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

/**
 * Samples for SupportTicketsNoSubscription List.
 */
public final class SupportTicketsNoSubscriptionListSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/ListSupportTicketsCreatedOnOrAfterAndInUpdatingState.json
     */
    /**
     * Sample code: List support tickets created on or after a certain date and in updating state.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsCreatedOnOrAfterACertainDateAndInUpdatingState(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions()
            .list(null, "createdDate ge 2020-03-10T22:08:51Z and status eq 'Updating'",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/ListSupportTicketsInOpenState.json
     */
    /**
     * Sample code: List support tickets in open state.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsInOpenState(com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions().list(null, "status eq 'Open'", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/ListSupportTickets.json
     */
    /**
     * Sample code: List support tickets.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTickets(com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions().list(null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/ListSupportTicketsInUpdatingState.json
     */
    /**
     * Sample code: List support tickets in updating state.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsInUpdatingState(com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions().list(null, "status eq 'Updating'", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/ListSupportTicketsCreatedOnOrAfterAndInOpenState.json
     */
    /**
     * Sample code: List support tickets created on or after a certain date and in open state.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsCreatedOnOrAfterACertainDateAndInOpenState(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions()
            .list(null, "createdDate ge 2020-03-10T22:08:51Z and status eq 'Open'", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/ListSupportTicketsServiceIdEquals.json
     */
    /**
     * Sample code: List support tickets with a certain service id.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void
        listSupportTicketsWithACertainServiceId(com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions()
            .list(null, "ServiceId eq 'vm_windows_service_guid'", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/ListSupportTicketsProblemClassificationIdEquals.json
     */
    /**
     * Sample code: List support tickets with a certain problem classification id.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsWithACertainProblemClassificationId(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTicketsNoSubscriptions()
            .list(null, "ProblemClassificationId eq 'compute_vm_problemClassification_guid'",
                com.azure.core.util.Context.NONE);
    }
}
