// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.resourcemanager.mobilenetwork.models.SimPolicy;
import java.util.HashMap;
import java.util.Map;

/** Samples for SimPolicies UpdateTags. */
public final class SimPoliciesUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2023-06-01/examples/SimPolicyUpdateTags.json
     */
    /**
     * Sample code: Update SIM policy tags.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void updateSIMPolicyTags(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        SimPolicy resource =
            manager
                .simPolicies()
                .getWithResponse("rg1", "testMobileNetwork", "testPolicy", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
