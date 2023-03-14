// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.ClusterPropertiesEncryption;
import com.azure.resourcemanager.redisenterprise.models.ClusterUpdate;
import com.azure.resourcemanager.redisenterprise.models.ManagedServiceIdentity;
import com.azure.resourcemanager.redisenterprise.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.redisenterprise.models.Sku;
import com.azure.resourcemanager.redisenterprise.models.SkuName;
import com.azure.resourcemanager.redisenterprise.models.TlsVersion;
import com.azure.resourcemanager.redisenterprise.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpdate model =
            BinaryData
                .fromString(
                    "{\"sku\":{\"name\":\"EnterpriseFlash_F300\",\"capacity\":422670277},\"properties\":{\"minimumTlsVersion\":\"1.0\",\"encryption\":{},\"hostName\":\"tnhxbn\",\"provisioningState\":\"Creating\",\"resourceState\":\"EnableFailed\",\"redisVersion\":\"rglssainqpj\",\"privateEndpointConnections\":[{\"id\":\"jfm\",\"name\":\"pee\",\"type\":\"vmgxsab\"},{\"id\":\"duuji\",\"name\":\"c\",\"type\":\"czdzev\"},{\"id\":\"krwpdap\",\"name\":\"dsbdkvwrwjf\",\"type\":\"usnhutje\"},{\"id\":\"rl\",\"name\":\"hugjzzdatqxhoc\",\"type\":\"geablgphuticndvk\"}]},\"identity\":{\"principalId\":\"d5f6f6d7-8077-4676-af17-a64fddba6e5b\",\"tenantId\":\"16d70fc0-155f-42ed-8fde-4493b28379d9\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"hxh\":{\"principalId\":\"c0a965f4-680a-4f60-b4e8-b8a009d19953\",\"clientId\":\"b62d2ff2-6cab-47d1-8bd0-3f164b075a64\"},\"k\":{\"principalId\":\"b5e8118f-935d-45fc-9993-aba8653de6b5\",\"clientId\":\"cb8875af-2235-47ef-a04a-c698740d9367\"},\"xolniwpwcukjfk\":{\"principalId\":\"0be7067e-a0b6-48b2-b22c-8df3a1efb3f2\",\"clientId\":\"4a994955-6c2b-4f39-8a60-8f3eb4a1f73b\"}}},\"tags\":{\"klryplwck\":\"w\",\"pnddhsgcbacphejk\":\"asy\"}}")
                .toObject(ClusterUpdate.class);
        Assertions.assertEquals(SkuName.ENTERPRISE_FLASH_F300, model.sku().name());
        Assertions.assertEquals(422670277, model.sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("w", model.tags().get("klryplwck"));
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpdate model =
            new ClusterUpdate()
                .withSku(new Sku().withName(SkuName.ENTERPRISE_FLASH_F300).withCapacity(422670277))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "hxh",
                                new UserAssignedIdentity(),
                                "k",
                                new UserAssignedIdentity(),
                                "xolniwpwcukjfk",
                                new UserAssignedIdentity())))
                .withTags(mapOf("klryplwck", "w", "pnddhsgcbacphejk", "asy"))
                .withMinimumTlsVersion(TlsVersion.ONE_ZERO)
                .withEncryption(new ClusterPropertiesEncryption());
        model = BinaryData.fromObject(model).toObject(ClusterUpdate.class);
        Assertions.assertEquals(SkuName.ENTERPRISE_FLASH_F300, model.sku().name());
        Assertions.assertEquals(422670277, model.sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("w", model.tags().get("klryplwck"));
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersion());
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
