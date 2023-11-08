// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.Identity;
import com.azure.resourcemanager.elasticsan.models.IdentityType;
import com.azure.resourcemanager.elasticsan.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Identity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"csonpclhoco\",\"tenantId\":\"lkevle\",\"type\":\"None\",\"userAssignedIdentities\":{\"vmezy\":{\"principalId\":\"u\",\"clientId\":\"mvfaxkffeiith\"},\"oenkouknvudwti\":{\"principalId\":\"hxmzsbbzoggig\",\"clientId\":\"wburvjxxjnspydpt\"},\"npiucgygevqznty\":{\"principalId\":\"bldngkpoc\",\"clientId\":\"azyxoegukg\"},\"jzicwifsjt\":{\"principalId\":\"rbpizc\",\"clientId\":\"qjsdpydnfyhxdeo\"}}}")
                .toObject(Identity.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Identity model =
            new Identity()
                .withType(IdentityType.NONE)
                .withUserAssignedIdentities(
                    mapOf(
                        "vmezy",
                        new UserAssignedIdentity(),
                        "oenkouknvudwti",
                        new UserAssignedIdentity(),
                        "npiucgygevqznty",
                        new UserAssignedIdentity(),
                        "jzicwifsjt",
                        new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(Identity.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
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
