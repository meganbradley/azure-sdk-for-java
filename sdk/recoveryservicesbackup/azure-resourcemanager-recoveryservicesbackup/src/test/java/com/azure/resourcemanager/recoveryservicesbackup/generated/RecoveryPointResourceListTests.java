// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.RecoveryPointResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointResourceList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"mzsb\",\"location\":\"zoggigrxwburvjxx\",\"tags\":{\"nkoukn\":\"pydptko\"},\"id\":\"udwtiukbl\",\"name\":\"ngkpocipazy\",\"type\":\"o\"},{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"kgjn\",\"location\":\"iucgygevqzn\",\"tags\":{\"dpydn\":\"mrbpizcdrqj\"},\"id\":\"yhxdeoejzicwi\",\"name\":\"sjttgzfbish\",\"type\":\"bkh\"},{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"eyeam\",\"location\":\"p\",\"tags\":{\"wkgshwa\":\"alpbuxwgipwhon\"},\"id\":\"kix\",\"name\":\"bin\",\"type\":\"eputtmrywnuzoqf\"},{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"qzrnkcqvyxlwhz\",\"location\":\"sicohoqqnwvlry\",\"tags\":{\"konocu\":\"hheunmmqhgyx\"},\"id\":\"oklyaxuconuq\",\"name\":\"zf\",\"type\":\"beypewrmjmw\"}],\"nextLink\":\"jektcxsenh\"}")
                .toObject(RecoveryPointResourceList.class);
        Assertions.assertEquals("jektcxsenh", model.nextLink());
        Assertions.assertEquals("zoggigrxwburvjxx", model.value().get(0).location());
        Assertions.assertEquals("pydptko", model.value().get(0).tags().get("nkoukn"));
        Assertions.assertEquals("mzsb", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointResourceList model =
            new RecoveryPointResourceList()
                .withNextLink("jektcxsenh")
                .withValue(
                    Arrays
                        .asList(
                            new RecoveryPointResourceInner()
                                .withLocation("zoggigrxwburvjxx")
                                .withTags(mapOf("nkoukn", "pydptko"))
                                .withProperties(new RecoveryPoint())
                                .withEtag("mzsb"),
                            new RecoveryPointResourceInner()
                                .withLocation("iucgygevqzn")
                                .withTags(mapOf("dpydn", "mrbpizcdrqj"))
                                .withProperties(new RecoveryPoint())
                                .withEtag("kgjn"),
                            new RecoveryPointResourceInner()
                                .withLocation("p")
                                .withTags(mapOf("wkgshwa", "alpbuxwgipwhon"))
                                .withProperties(new RecoveryPoint())
                                .withEtag("eyeam"),
                            new RecoveryPointResourceInner()
                                .withLocation("sicohoqqnwvlry")
                                .withTags(mapOf("konocu", "hheunmmqhgyx"))
                                .withProperties(new RecoveryPoint())
                                .withEtag("qzrnkcqvyxlwhz")));
        model = BinaryData.fromObject(model).toObject(RecoveryPointResourceList.class);
        Assertions.assertEquals("jektcxsenh", model.nextLink());
        Assertions.assertEquals("zoggigrxwburvjxx", model.value().get(0).location());
        Assertions.assertEquals("pydptko", model.value().get(0).tags().get("nkoukn"));
        Assertions.assertEquals("mzsb", model.value().get(0).etag());
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
