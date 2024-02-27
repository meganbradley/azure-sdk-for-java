// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemIdentity;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemIdentityType;
import com.azure.resourcemanager.storagecache.models.UserAssignedIdentitiesValue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AmlFilesystemIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlFilesystemIdentity model = BinaryData.fromString(
            "{\"principalId\":\"rcryuanzwuxzdxta\",\"tenantId\":\"lhmwhfpmrqobm\",\"type\":\"None\",\"userAssignedIdentities\":{\"uf\":{\"principalId\":\"yrtih\",\"clientId\":\"tijbpzvgnwzsymgl\"},\"s\":{\"principalId\":\"zk\",\"clientId\":\"dbihanufhfcbj\"}}}")
            .toObject(AmlFilesystemIdentity.class);
        Assertions.assertEquals(AmlFilesystemIdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlFilesystemIdentity model
            = new AmlFilesystemIdentity().withType(AmlFilesystemIdentityType.NONE).withUserAssignedIdentities(
                mapOf("uf", new UserAssignedIdentitiesValue(), "s", new UserAssignedIdentitiesValue()));
        model = BinaryData.fromObject(model).toObject(AmlFilesystemIdentity.class);
        Assertions.assertEquals(AmlFilesystemIdentityType.NONE, model.type());
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
