// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyContainerGroupPoolResourceInner;
import com.azure.resourcemanager.standbypool.models.ContainerGroupProfile;
import com.azure.resourcemanager.standbypool.models.ContainerGroupProperties;
import com.azure.resourcemanager.standbypool.models.RefillPolicy;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPoolElasticityProfile;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPoolResourceProperties;
import com.azure.resourcemanager.standbypool.models.Subnet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StandbyContainerGroupPoolResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyContainerGroupPoolResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":5709229519327126665,\"refillPolicy\":\"always\"},\"containerGroupProperties\":{\"containerGroupProfile\":{\"id\":\"fkgiawxk\",\"revision\":3283985932829658956},\"subnetIds\":[{\"id\":\"ckbasyypndd\"},{\"id\":\"sgcbac\"},{\"id\":\"hejkotynqgou\"}]},\"provisioningState\":\"Failed\"},\"location\":\"likwyqkgfgib\",\"tags\":{\"yb\":\"gakeqsr\"},\"id\":\"qqedqytbciqfou\",\"name\":\"lmmnkzsmodmglo\",\"type\":\"gpbkwtmut\"}")
            .toObject(StandbyContainerGroupPoolResourceInner.class);
        Assertions.assertEquals("likwyqkgfgib", model.location());
        Assertions.assertEquals("gakeqsr", model.tags().get("yb"));
        Assertions.assertEquals(5709229519327126665L, model.properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(RefillPolicy.ALWAYS, model.properties().elasticityProfile().refillPolicy());
        Assertions.assertEquals("fkgiawxk", model.properties().containerGroupProperties().containerGroupProfile().id());
        Assertions.assertEquals(3283985932829658956L,
            model.properties().containerGroupProperties().containerGroupProfile().revision());
        Assertions.assertEquals("ckbasyypndd", model.properties().containerGroupProperties().subnetIds().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyContainerGroupPoolResourceInner model
            = new StandbyContainerGroupPoolResourceInner().withLocation("likwyqkgfgib")
                .withTags(mapOf("yb", "gakeqsr"))
                .withProperties(new StandbyContainerGroupPoolResourceProperties()
                    .withElasticityProfile(
                        new StandbyContainerGroupPoolElasticityProfile().withMaxReadyCapacity(5709229519327126665L)
                            .withRefillPolicy(RefillPolicy.ALWAYS))
                    .withContainerGroupProperties(new ContainerGroupProperties()
                        .withContainerGroupProfile(
                            new ContainerGroupProfile().withId("fkgiawxk").withRevision(3283985932829658956L))
                        .withSubnetIds(Arrays.asList(new Subnet().withId("ckbasyypndd"), new Subnet().withId("sgcbac"),
                            new Subnet().withId("hejkotynqgou")))));
        model = BinaryData.fromObject(model).toObject(StandbyContainerGroupPoolResourceInner.class);
        Assertions.assertEquals("likwyqkgfgib", model.location());
        Assertions.assertEquals("gakeqsr", model.tags().get("yb"));
        Assertions.assertEquals(5709229519327126665L, model.properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(RefillPolicy.ALWAYS, model.properties().elasticityProfile().refillPolicy());
        Assertions.assertEquals("fkgiawxk", model.properties().containerGroupProperties().containerGroupProfile().id());
        Assertions.assertEquals(3283985932829658956L,
            model.properties().containerGroupProperties().containerGroupProfile().revision());
        Assertions.assertEquals("ckbasyypndd", model.properties().containerGroupProperties().subnetIds().get(0).id());
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
