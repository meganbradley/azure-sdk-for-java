// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.resourcemanager.eventgrid.models.PartnerRegistration;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PartnerRegistrations Update.
 */
public final class PartnerRegistrationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * PartnerRegistrations_Update.json
     */
    /**
     * Sample code: PartnerRegistrations_Update.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerRegistrationsUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        PartnerRegistration resource = manager.partnerRegistrations().getByResourceGroupWithResponse("examplerg",
            "examplePartnerRegistrationName1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("NewKey", "fakeTokenPlaceholder")).apply();
    }

    // Use "Map.of" if available
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
