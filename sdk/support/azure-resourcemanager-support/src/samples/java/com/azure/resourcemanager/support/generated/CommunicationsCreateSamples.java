// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

/**
 * Samples for Communications Create.
 */
public final class CommunicationsCreateSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/CreateSupportTicketCommunication.json
     */
    /**
     * Sample code: AddCommunicationToSubscriptionTicket.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void addCommunicationToSubscriptionTicket(com.azure.resourcemanager.support.SupportManager manager) {
        manager.communications()
            .define("testcommunication")
            .withExistingSupportTicket("testticket")
            .withSubject("This is a test message from a customer!")
            .withBody("This is a test message from a customer!")
            .withSender("user@contoso.com")
            .create();
    }
}
