// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.KustomizationPatchDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.PostBuildDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.SubstituteFromDefinition;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class KustomizationPatchDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KustomizationPatchDefinition model =
            BinaryData
                .fromString(
                    "{\"path\":\"ncghkje\",\"dependsOn\":[\"hbijhtxfvgxb\",\"smx\",\"eh\"],\"timeoutInSeconds\":5279138530813051963,\"syncIntervalInSeconds\":6726437827425904455,\"retryIntervalInSeconds\":8488647462806528566,\"prune\":false,\"force\":false,\"wait\":true,\"postBuild\":{\"substitute\":{\"flz\":\"ukgri\",\"qzahmgkbrp\":\"fbxzpuzycisp\",\"hibnuqqkpika\":\"y\",\"buynhijggm\":\"rgvtqag\"},\"substituteFrom\":[{\"kind\":\"iarbutrcvpna\",\"name\":\"mhjrunmpxttdbhr\",\"optional\":false},{\"kind\":\"nkxmyskpbhenbtk\",\"name\":\"ywn\",\"optional\":false},{\"kind\":\"synlqidybyxczfc\",\"name\":\"aaxdbabphlwrq\",\"optional\":true}]}}")
                .toObject(KustomizationPatchDefinition.class);
        Assertions.assertEquals("ncghkje", model.path());
        Assertions.assertEquals("hbijhtxfvgxb", model.dependsOn().get(0));
        Assertions.assertEquals(5279138530813051963L, model.timeoutInSeconds());
        Assertions.assertEquals(6726437827425904455L, model.syncIntervalInSeconds());
        Assertions.assertEquals(8488647462806528566L, model.retryIntervalInSeconds());
        Assertions.assertEquals(false, model.prune());
        Assertions.assertEquals(false, model.force());
        Assertions.assertEquals(true, model.enableWait());
        Assertions.assertEquals("ukgri", model.postBuild().substitute().get("flz"));
        Assertions.assertEquals("iarbutrcvpna", model.postBuild().substituteFrom().get(0).kind());
        Assertions.assertEquals("mhjrunmpxttdbhr", model.postBuild().substituteFrom().get(0).name());
        Assertions.assertEquals(false, model.postBuild().substituteFrom().get(0).optional());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KustomizationPatchDefinition model =
            new KustomizationPatchDefinition()
                .withPath("ncghkje")
                .withDependsOn(Arrays.asList("hbijhtxfvgxb", "smx", "eh"))
                .withTimeoutInSeconds(5279138530813051963L)
                .withSyncIntervalInSeconds(6726437827425904455L)
                .withRetryIntervalInSeconds(8488647462806528566L)
                .withPrune(false)
                .withForce(false)
                .withEnableWait(true)
                .withPostBuild(
                    new PostBuildDefinition()
                        .withSubstitute(
                            mapOf(
                                "flz",
                                "ukgri",
                                "qzahmgkbrp",
                                "fbxzpuzycisp",
                                "hibnuqqkpika",
                                "y",
                                "buynhijggm",
                                "rgvtqag"))
                        .withSubstituteFrom(
                            Arrays
                                .asList(
                                    new SubstituteFromDefinition()
                                        .withKind("iarbutrcvpna")
                                        .withName("mhjrunmpxttdbhr")
                                        .withOptional(false),
                                    new SubstituteFromDefinition()
                                        .withKind("nkxmyskpbhenbtk")
                                        .withName("ywn")
                                        .withOptional(false),
                                    new SubstituteFromDefinition()
                                        .withKind("synlqidybyxczfc")
                                        .withName("aaxdbabphlwrq")
                                        .withOptional(true))));
        model = BinaryData.fromObject(model).toObject(KustomizationPatchDefinition.class);
        Assertions.assertEquals("ncghkje", model.path());
        Assertions.assertEquals("hbijhtxfvgxb", model.dependsOn().get(0));
        Assertions.assertEquals(5279138530813051963L, model.timeoutInSeconds());
        Assertions.assertEquals(6726437827425904455L, model.syncIntervalInSeconds());
        Assertions.assertEquals(8488647462806528566L, model.retryIntervalInSeconds());
        Assertions.assertEquals(false, model.prune());
        Assertions.assertEquals(false, model.force());
        Assertions.assertEquals(true, model.enableWait());
        Assertions.assertEquals("ukgri", model.postBuild().substitute().get("flz"));
        Assertions.assertEquals("iarbutrcvpna", model.postBuild().substituteFrom().get(0).kind());
        Assertions.assertEquals("mhjrunmpxttdbhr", model.postBuild().substituteFrom().get(0).name());
        Assertions.assertEquals(false, model.postBuild().substituteFrom().get(0).optional());
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
