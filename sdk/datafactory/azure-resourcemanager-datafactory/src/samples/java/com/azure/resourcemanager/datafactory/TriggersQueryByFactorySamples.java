// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.TriggerFilterParameters;

/** Samples for Triggers QueryByFactory. */
public final class TriggersQueryByFactorySamples {
    /**
     * Sample code: Triggers_QueryByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void triggersQueryByFactory(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .triggers()
            .queryByFactoryWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                new TriggerFilterParameters().withParentTriggerName("exampleTrigger"),
                Context.NONE);
    }
}
