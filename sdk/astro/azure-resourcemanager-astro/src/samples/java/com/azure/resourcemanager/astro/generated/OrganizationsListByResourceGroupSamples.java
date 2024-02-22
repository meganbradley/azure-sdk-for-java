// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.generated;

/**
 * Samples for Organizations ListByResourceGroup.
 */
public final class OrganizationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/liftrastronomer/resource-manager/Astronomer.Astro/stable/2023-08-01/examples/
     * Organizations_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsListByResourceGroupGeneratedByMaximumSetRule(
        com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations().listByResourceGroup("rgastronomer", com.azure.core.util.Context.NONE);
    }
}
