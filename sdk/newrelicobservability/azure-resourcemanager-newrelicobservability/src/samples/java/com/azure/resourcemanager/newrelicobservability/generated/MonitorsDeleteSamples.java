// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

/** Samples for Monitors Delete. */
public final class MonitorsDeleteSamples {
    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/stable/2022-07-01/examples/Monitors_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Monitors_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void monitorsDeleteMinimumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        manager.monitors().delete("rgopenapi", null, "ipxmlcbonyxtolzejcjshkmlron", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/stable/2022-07-01/examples/Monitors_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Monitors_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void monitorsDeleteMaximumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        manager
            .monitors()
            .delete(
                "rgopenapi",
                "ruxvg@xqkmdhrnoo.hlmbpm",
                "ipxmlcbonyxtolzejcjshkmlron",
                com.azure.core.util.Context.NONE);
    }
}
