// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookTemplateInner;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateGallery;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateLocalizedGallery;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkbookTemplateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkbookTemplateInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"priority\":871472535,\"author\":\"rp\",\"templateData\":\"dataxepcyvahfn\",\"galleries\":[{\"name\":\"yq\",\"category\":\"vuujq\",\"type\":\"dokgjl\",\"order\":1769769453,\"resourceType\":\"gvcl\"}],\"localized\":{\"vecxgodebfqkk\":[{\"templateData\":\"datac\",\"galleries\":[{},{}]},{\"templateData\":\"dataesz\",\"galleries\":[{},{},{}]},{\"templateData\":\"datajhtxfvgxbfsmxne\",\"galleries\":[{},{},{}]}],\"kpikadrgvt\":[{\"templateData\":\"datapukgriwflzlfb\",\"galleries\":[{}]},{\"templateData\":\"datazycispn\",\"galleries\":[{},{}]},{\"templateData\":\"datamgkbrpyydhibn\",\"galleries\":[{},{},{},{}]}],\"nhijggmebfsi\":[{\"templateData\":\"datan\",\"galleries\":[{},{},{}]}]}},\"location\":\"rbu\",\"tags\":{\"jrunmpxtt\":\"vpnazzm\",\"bnlankxmyskpb\":\"bh\",\"nrs\":\"enbtkcxywny\",\"lhaaxdbabp\":\"nlqidybyxczf\"},\"id\":\"lwrq\",\"name\":\"fkts\",\"type\":\"hsucoc\"}")
                .toObject(WorkbookTemplateInner.class);
        Assertions.assertEquals("rbu", model.location());
        Assertions.assertEquals("vpnazzm", model.tags().get("jrunmpxtt"));
        Assertions.assertEquals(871472535, model.priority());
        Assertions.assertEquals("rp", model.author());
        Assertions.assertEquals("yq", model.galleries().get(0).name());
        Assertions.assertEquals("vuujq", model.galleries().get(0).category());
        Assertions.assertEquals("dokgjl", model.galleries().get(0).type());
        Assertions.assertEquals(1769769453, model.galleries().get(0).order());
        Assertions.assertEquals("gvcl", model.galleries().get(0).resourceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkbookTemplateInner model =
            new WorkbookTemplateInner()
                .withLocation("rbu")
                .withTags(
                    mapOf(
                        "jrunmpxtt",
                        "vpnazzm",
                        "bnlankxmyskpb",
                        "bh",
                        "nrs",
                        "enbtkcxywny",
                        "lhaaxdbabp",
                        "nlqidybyxczf"))
                .withPriority(871472535)
                .withAuthor("rp")
                .withTemplateData("dataxepcyvahfn")
                .withGalleries(
                    Arrays
                        .asList(
                            new WorkbookTemplateGallery()
                                .withName("yq")
                                .withCategory("vuujq")
                                .withType("dokgjl")
                                .withOrder(1769769453)
                                .withResourceType("gvcl")))
                .withLocalized(
                    mapOf(
                        "vecxgodebfqkk",
                        Arrays
                            .asList(
                                new WorkbookTemplateLocalizedGallery()
                                    .withTemplateData("datac")
                                    .withGalleries(
                                        Arrays.asList(new WorkbookTemplateGallery(), new WorkbookTemplateGallery())),
                                new WorkbookTemplateLocalizedGallery()
                                    .withTemplateData("dataesz")
                                    .withGalleries(
                                        Arrays
                                            .asList(
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery())),
                                new WorkbookTemplateLocalizedGallery()
                                    .withTemplateData("datajhtxfvgxbfsmxne")
                                    .withGalleries(
                                        Arrays
                                            .asList(
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery()))),
                        "kpikadrgvt",
                        Arrays
                            .asList(
                                new WorkbookTemplateLocalizedGallery()
                                    .withTemplateData("datapukgriwflzlfb")
                                    .withGalleries(Arrays.asList(new WorkbookTemplateGallery())),
                                new WorkbookTemplateLocalizedGallery()
                                    .withTemplateData("datazycispn")
                                    .withGalleries(
                                        Arrays.asList(new WorkbookTemplateGallery(), new WorkbookTemplateGallery())),
                                new WorkbookTemplateLocalizedGallery()
                                    .withTemplateData("datamgkbrpyydhibn")
                                    .withGalleries(
                                        Arrays
                                            .asList(
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery()))),
                        "nhijggmebfsi",
                        Arrays
                            .asList(
                                new WorkbookTemplateLocalizedGallery()
                                    .withTemplateData("datan")
                                    .withGalleries(
                                        Arrays
                                            .asList(
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery(),
                                                new WorkbookTemplateGallery())))));
        model = BinaryData.fromObject(model).toObject(WorkbookTemplateInner.class);
        Assertions.assertEquals("rbu", model.location());
        Assertions.assertEquals("vpnazzm", model.tags().get("jrunmpxtt"));
        Assertions.assertEquals(871472535, model.priority());
        Assertions.assertEquals("rp", model.author());
        Assertions.assertEquals("yq", model.galleries().get(0).name());
        Assertions.assertEquals("vuujq", model.galleries().get(0).category());
        Assertions.assertEquals("dokgjl", model.galleries().get(0).type());
        Assertions.assertEquals(1769769453, model.galleries().get(0).order());
        Assertions.assertEquals("gvcl", model.galleries().get(0).resourceType());
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
