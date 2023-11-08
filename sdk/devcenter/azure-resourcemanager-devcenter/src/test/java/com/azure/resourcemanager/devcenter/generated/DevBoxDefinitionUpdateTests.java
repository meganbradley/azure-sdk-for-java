// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.DevBoxDefinitionUpdate;
import com.azure.resourcemanager.devcenter.models.HibernateSupport;
import com.azure.resourcemanager.devcenter.models.ImageReference;
import com.azure.resourcemanager.devcenter.models.Sku;
import com.azure.resourcemanager.devcenter.models.SkuTier;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DevBoxDefinitionUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DevBoxDefinitionUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"imageReference\":{\"id\":\"keqdcvdrhvoods\",\"exactVersion\":\"bobzdopcjwvnhd\"},\"sku\":{\"name\":\"wmgxcxrsl\",\"tier\":\"Free\",\"size\":\"wuoegrpk\",\"family\":\"wniyqsluicpd\",\"capacity\":1810528552},\"osStorageType\":\"zl\",\"hibernateSupport\":\"Enabled\"},\"tags\":{\"wsbpfvm\":\"axmodfvuef\",\"yzvqt\":\"yhrfouyftaakcpw\",\"zksmondj\":\"nubexk\",\"whojvp\":\"quxvypomgkop\"},\"location\":\"qgxy\"}")
                .toObject(DevBoxDefinitionUpdate.class);
        Assertions.assertEquals("axmodfvuef", model.tags().get("wsbpfvm"));
        Assertions.assertEquals("qgxy", model.location());
        Assertions.assertEquals("keqdcvdrhvoods", model.imageReference().id());
        Assertions.assertEquals("wmgxcxrsl", model.sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.sku().tier());
        Assertions.assertEquals("wuoegrpk", model.sku().size());
        Assertions.assertEquals("wniyqsluicpd", model.sku().family());
        Assertions.assertEquals(1810528552, model.sku().capacity());
        Assertions.assertEquals("zl", model.osStorageType());
        Assertions.assertEquals(HibernateSupport.ENABLED, model.hibernateSupport());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DevBoxDefinitionUpdate model =
            new DevBoxDefinitionUpdate()
                .withTags(
                    mapOf(
                        "wsbpfvm",
                        "axmodfvuef",
                        "yzvqt",
                        "yhrfouyftaakcpw",
                        "zksmondj",
                        "nubexk",
                        "whojvp",
                        "quxvypomgkop"))
                .withLocation("qgxy")
                .withImageReference(new ImageReference().withId("keqdcvdrhvoods"))
                .withSku(
                    new Sku()
                        .withName("wmgxcxrsl")
                        .withTier(SkuTier.FREE)
                        .withSize("wuoegrpk")
                        .withFamily("wniyqsluicpd")
                        .withCapacity(1810528552))
                .withOsStorageType("zl")
                .withHibernateSupport(HibernateSupport.ENABLED);
        model = BinaryData.fromObject(model).toObject(DevBoxDefinitionUpdate.class);
        Assertions.assertEquals("axmodfvuef", model.tags().get("wsbpfvm"));
        Assertions.assertEquals("qgxy", model.location());
        Assertions.assertEquals("keqdcvdrhvoods", model.imageReference().id());
        Assertions.assertEquals("wmgxcxrsl", model.sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.sku().tier());
        Assertions.assertEquals("wuoegrpk", model.sku().size());
        Assertions.assertEquals("wniyqsluicpd", model.sku().family());
        Assertions.assertEquals(1810528552, model.sku().capacity());
        Assertions.assertEquals("zl", model.osStorageType());
        Assertions.assertEquals(HibernateSupport.ENABLED, model.hibernateSupport());
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
