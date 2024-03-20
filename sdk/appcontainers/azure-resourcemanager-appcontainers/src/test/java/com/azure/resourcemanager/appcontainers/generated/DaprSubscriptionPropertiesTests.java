// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprSubscriptionProperties;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionBulkSubscribeOptions;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionRouteRule;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionRoutes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DaprSubscriptionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprSubscriptionProperties model = BinaryData.fromString(
            "{\"pubsubName\":\"ksjcitdigs\",\"topic\":\"dglj\",\"deadLetterTopic\":\"keuachtomf\",\"routes\":{\"rules\":[{\"match\":\"wfpfmdgycx\",\"path\":\"skw\"},{\"match\":\"jjyslurlps\",\"path\":\"kvp\"},{\"match\":\"wqslsrhmpqvw\",\"path\":\"kondcb\"},{\"match\":\"imuvqejosovyrrl\",\"path\":\"esi\"}],\"default\":\"qtljqobbpihehc\"},\"scopes\":[\"bmrqbrjbbmp\",\"dlvykfrex\",\"rseqwjksghudgz\"],\"metadata\":{\"u\":\"gjggsv\",\"kmdyomkxfbvfbh\":\"kxibdafh\",\"rhpw\":\"y\",\"o\":\"gddeimaw\"},\"bulkSubscribe\":{\"enabled\":true,\"maxMessagesCount\":1582308433,\"maxAwaitDurationMs\":166613008}}")
            .toObject(DaprSubscriptionProperties.class);
        Assertions.assertEquals("ksjcitdigs", model.pubsubName());
        Assertions.assertEquals("dglj", model.topic());
        Assertions.assertEquals("keuachtomf", model.deadLetterTopic());
        Assertions.assertEquals("wfpfmdgycx", model.routes().rules().get(0).match());
        Assertions.assertEquals("skw", model.routes().rules().get(0).path());
        Assertions.assertEquals("qtljqobbpihehc", model.routes().defaultProperty());
        Assertions.assertEquals("bmrqbrjbbmp", model.scopes().get(0));
        Assertions.assertEquals("gjggsv", model.metadata().get("u"));
        Assertions.assertEquals(true, model.bulkSubscribe().enabled());
        Assertions.assertEquals(1582308433, model.bulkSubscribe().maxMessagesCount());
        Assertions.assertEquals(166613008, model.bulkSubscribe().maxAwaitDurationMs());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprSubscriptionProperties model = new DaprSubscriptionProperties().withPubsubName("ksjcitdigs")
            .withTopic("dglj").withDeadLetterTopic("keuachtomf")
            .withRoutes(new DaprSubscriptionRoutes()
                .withRules(Arrays.asList(new DaprSubscriptionRouteRule().withMatch("wfpfmdgycx").withPath("skw"),
                    new DaprSubscriptionRouteRule().withMatch("jjyslurlps").withPath("kvp"),
                    new DaprSubscriptionRouteRule().withMatch("wqslsrhmpqvw").withPath("kondcb"),
                    new DaprSubscriptionRouteRule().withMatch("imuvqejosovyrrl").withPath("esi")))
                .withDefaultProperty("qtljqobbpihehc"))
            .withScopes(Arrays.asList("bmrqbrjbbmp", "dlvykfrex", "rseqwjksghudgz"))
            .withMetadata(mapOf("u", "gjggsv", "kmdyomkxfbvfbh", "kxibdafh", "rhpw", "y", "o", "gddeimaw"))
            .withBulkSubscribe(new DaprSubscriptionBulkSubscribeOptions().withEnabled(true)
                .withMaxMessagesCount(1582308433).withMaxAwaitDurationMs(166613008));
        model = BinaryData.fromObject(model).toObject(DaprSubscriptionProperties.class);
        Assertions.assertEquals("ksjcitdigs", model.pubsubName());
        Assertions.assertEquals("dglj", model.topic());
        Assertions.assertEquals("keuachtomf", model.deadLetterTopic());
        Assertions.assertEquals("wfpfmdgycx", model.routes().rules().get(0).match());
        Assertions.assertEquals("skw", model.routes().rules().get(0).path());
        Assertions.assertEquals("qtljqobbpihehc", model.routes().defaultProperty());
        Assertions.assertEquals("bmrqbrjbbmp", model.scopes().get(0));
        Assertions.assertEquals("gjggsv", model.metadata().get("u"));
        Assertions.assertEquals(true, model.bulkSubscribe().enabled());
        Assertions.assertEquals(1582308433, model.bulkSubscribe().maxMessagesCount());
        Assertions.assertEquals(166613008, model.bulkSubscribe().maxAwaitDurationMs());
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
