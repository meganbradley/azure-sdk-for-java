// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

/**
 * Samples for Inputs Test.
 */
public final class InputsTestSamples {
    /*
     * x-ms-original-file:
     * specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/preview/2021-10-01-preview/examples/
     * Input_Test.json
     */
    /**
     * Sample code: Test the connection for an input.
     * 
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void
        testTheConnectionForAnInput(com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.inputs().test("sjrg8440", "sj9597", "input7225", null, com.azure.core.util.Context.NONE);
    }
}
