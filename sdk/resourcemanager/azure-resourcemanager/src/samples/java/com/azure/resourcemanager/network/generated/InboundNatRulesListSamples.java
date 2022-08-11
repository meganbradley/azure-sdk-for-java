// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for InboundNatRules List. */
public final class InboundNatRulesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/InboundNatRuleList.json
     */
    /**
     * Sample code: InboundNatRuleList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void inboundNatRuleList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getInboundNatRules().list("testrg", "lb1", Context.NONE);
    }
}
