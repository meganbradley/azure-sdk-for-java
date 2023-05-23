// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for Pricings Get. */
public final class PricingsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2023-01-01/examples/Pricings/GetPricingByNameCloudPosture_example.json
     */
    /**
     * Sample code: Get pricings on subscription - CloudPosture plan.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getPricingsOnSubscriptionCloudPosturePlan(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings().getWithResponse("CloudPosture", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2023-01-01/examples/Pricings/GetPricingByNameDns_example.json
     */
    /**
     * Sample code: Get pricings on subscription - Dns plan.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getPricingsOnSubscriptionDnsPlan(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings().getWithResponse("Dns", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2023-01-01/examples/Pricings/GetPricingByNameContainers_example.json
     */
    /**
     * Sample code: Get pricings on subscription - Containers plan.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getPricingsOnSubscriptionContainersPlan(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings().getWithResponse("Containers", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2023-01-01/examples/Pricings/GetPricingByNameStorageAccounts_example.json
     */
    /**
     * Sample code: Get pricings on subscription - StorageAccounts plan.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getPricingsOnSubscriptionStorageAccountsPlan(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings().getWithResponse("StorageAccounts", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2023-01-01/examples/Pricings/GetPricingByNameVirtualMachines_example.json
     */
    /**
     * Sample code: Get pricings on subscription - VirtualMachines plan.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getPricingsOnSubscriptionVirtualMachinesPlan(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings().getWithResponse("VirtualMachines", com.azure.core.util.Context.NONE);
    }
}
