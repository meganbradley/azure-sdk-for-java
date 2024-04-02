// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Access ListInvitations.
 */
public final class AccessListInvitationsSamples {
    /*
     * x-ms-original-file:
     * specification/confluent/resource-manager/Microsoft.Confluent/stable/2024-02-13/examples/Access_InvitationsList.
     * json
     */
    /**
     * Sample code: Access_InvitationsList.
     * 
     * @param manager Entry point to ConfluentManager.
     */
    public static void accessInvitationsList(com.azure.resourcemanager.confluent.ConfluentManager manager) {
        manager.access().listInvitationsWithResponse("myResourceGroup", "myOrganization",
            new ListAccessRequestModel().withSearchFilters(
                mapOf("pageSize", "10", "pageToken", "fakeTokenPlaceholder", "status", "INVITE_STATUS_SENT")),
            com.azure.core.util.Context.NONE);
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
