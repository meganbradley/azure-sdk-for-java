// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.AccountSku;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import org.junit.jupiter.api.Assertions;

public final class AccountSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountSku model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"wdslfhotwmcy\",\"sku\":{\"name\":\"wlbjnpgacftade\",\"tier\":\"Basic\",\"size\":\"tyfsoppusuesn\",\"family\":\"dejbavo\",\"capacity\":669466066}}")
                .toObject(AccountSku.class);
        Assertions.assertEquals("wdslfhotwmcy", model.resourceType());
        Assertions.assertEquals("wlbjnpgacftade", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals("tyfsoppusuesn", model.sku().size());
        Assertions.assertEquals("dejbavo", model.sku().family());
        Assertions.assertEquals(669466066, model.sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountSku model =
            new AccountSku()
                .withResourceType("wdslfhotwmcy")
                .withSku(
                    new Sku()
                        .withName("wlbjnpgacftade")
                        .withTier(SkuTier.BASIC)
                        .withSize("tyfsoppusuesn")
                        .withFamily("dejbavo")
                        .withCapacity(669466066));
        model = BinaryData.fromObject(model).toObject(AccountSku.class);
        Assertions.assertEquals("wdslfhotwmcy", model.resourceType());
        Assertions.assertEquals("wlbjnpgacftade", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals("tyfsoppusuesn", model.sku().size());
        Assertions.assertEquals("dejbavo", model.sku().family());
        Assertions.assertEquals(669466066, model.sku().capacity());
    }
}
