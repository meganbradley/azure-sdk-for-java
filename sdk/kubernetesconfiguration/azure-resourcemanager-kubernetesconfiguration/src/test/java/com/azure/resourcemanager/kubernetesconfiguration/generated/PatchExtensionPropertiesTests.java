// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.PatchExtensionProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PatchExtensionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchExtensionProperties model =
            BinaryData
                .fromString(
                    "{\"autoUpgradeMinorVersion\":true,\"releaseTrain\":\"rtfw\",\"version\":\"k\",\"configurationSettings\":{\"yejhk\":\"udccsnhsjc\",\"kkvnipjox\":\"yhtnapczwlokjye\",\"podmailzydehojwy\":\"jnchgej\"},\"configurationProtectedSettings\":{\"ixjsprozvcputeg\":\"xinpmqnjaq\",\"atscmd\":\"vwmf\",\"zkrwfn\":\"pjhulsuuvmkj\"}}")
                .toObject(PatchExtensionProperties.class);
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
        Assertions.assertEquals("rtfw", model.releaseTrain());
        Assertions.assertEquals("k", model.version());
        Assertions.assertEquals("udccsnhsjc", model.configurationSettings().get("yejhk"));
        Assertions.assertEquals("xinpmqnjaq", model.configurationProtectedSettings().get("ixjsprozvcputeg"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchExtensionProperties model =
            new PatchExtensionProperties()
                .withAutoUpgradeMinorVersion(true)
                .withReleaseTrain("rtfw")
                .withVersion("k")
                .withConfigurationSettings(
                    mapOf("yejhk", "udccsnhsjc", "kkvnipjox", "yhtnapczwlokjye", "podmailzydehojwy", "jnchgej"))
                .withConfigurationProtectedSettings(
                    mapOf("ixjsprozvcputeg", "xinpmqnjaq", "atscmd", "vwmf", "zkrwfn", "pjhulsuuvmkj"));
        model = BinaryData.fromObject(model).toObject(PatchExtensionProperties.class);
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
        Assertions.assertEquals("rtfw", model.releaseTrain());
        Assertions.assertEquals("k", model.version());
        Assertions.assertEquals("udccsnhsjc", model.configurationSettings().get("yejhk"));
        Assertions.assertEquals("xinpmqnjaq", model.configurationProtectedSettings().get("ixjsprozvcputeg"));
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
