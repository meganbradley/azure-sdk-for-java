// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceResourceInner;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.communication.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CommunicationServiceResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationServiceResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Updating\",\"hostName\":\"ljfmppee\",\"dataLocation\":\"vmgxsab\",\"notificationHubId\":\"qduujitcjczdz\",\"version\":\"ndhkrw\",\"immutableResourceId\":\"appd\",\"linkedDomains\":[\"kvwrwjfeu\",\"nhutjeltmrldhugj\",\"zdatqxhocdg\"]},\"identity\":{\"principalId\":\"3364eec9-ade1-40e9-a6b6-c1ebdbb90729\",\"tenantId\":\"4d6900be-a481-4fe4-8f6c-0f9ac88c28f4\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"icndvkaozwyifty\":{\"principalId\":\"3e6b52c5-3b05-4ff7-8a7a-68fa15023315\",\"clientId\":\"c61c00e7-4756-49b4-b899-415d17db5edf\"},\"urokft\":{\"principalId\":\"e977beae-b8a5-426d-9b27-894420e6ba02\",\"clientId\":\"5e81e17e-fe2c-4cf3-822a-3776dc7075d2\"},\"lniwpwcukjfkgiaw\":{\"principalId\":\"b0400f16-b86f-47bf-be2c-2902a6ecefc9\",\"clientId\":\"5c4ab0f5-66b3-4383-bdd3-221551430340\"}}},\"location\":\"lryplwckbasyy\",\"tags\":{\"phejkotynqgoulz\":\"dhsgcba\",\"gakeqsr\":\"dlikwyqkgfgibma\",\"qqedqytbciqfou\":\"yb\"},\"id\":\"lmmnkzsmodmglo\",\"name\":\"gpbkwtmut\",\"type\":\"uqktap\"}")
            .toObject(CommunicationServiceResourceInner.class);
        Assertions.assertEquals("lryplwckbasyy", model.location());
        Assertions.assertEquals("dhsgcba", model.tags().get("phejkotynqgoulz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("vmgxsab", model.dataLocation());
        Assertions.assertEquals("kvwrwjfeu", model.linkedDomains().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationServiceResourceInner model = new CommunicationServiceResourceInner().withLocation("lryplwckbasyy")
            .withTags(mapOf("phejkotynqgoulz", "dhsgcba", "gakeqsr", "dlikwyqkgfgibma", "qqedqytbciqfou", "yb"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("icndvkaozwyifty", new UserAssignedIdentity(), "urokft",
                    new UserAssignedIdentity(), "lniwpwcukjfkgiaw", new UserAssignedIdentity())))
            .withDataLocation("vmgxsab")
            .withLinkedDomains(Arrays.asList("kvwrwjfeu", "nhutjeltmrldhugj", "zdatqxhocdg"));
        model = BinaryData.fromObject(model).toObject(CommunicationServiceResourceInner.class);
        Assertions.assertEquals("lryplwckbasyy", model.location());
        Assertions.assertEquals("dhsgcba", model.tags().get("phejkotynqgoulz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("vmgxsab", model.dataLocation());
        Assertions.assertEquals("kvwrwjfeu", model.linkedDomains().get(0));
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
