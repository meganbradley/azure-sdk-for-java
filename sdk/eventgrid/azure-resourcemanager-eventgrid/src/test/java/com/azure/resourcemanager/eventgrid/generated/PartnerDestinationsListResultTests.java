// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerDestinationInner;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationActivationState;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationsListResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class PartnerDestinationsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerDestinationsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"partnerRegistrationImmutableId\":\"3b510bab-96ed-47b0-8fb5-f48efa1c2f85\",\"endpointServiceContext\":\"rxvxcjzh\",\"expirationTimeIfNotActivatedUtc\":\"2021-05-06T06:52:32Z\",\"provisioningState\":\"Succeeded\",\"activationState\":\"Activated\",\"endpointBaseUrl\":\"gqscj\",\"messageForActivation\":\"ftjuh\"},\"location\":\"azkmtgguwp\",\"tags\":{\"vmmghfcfiwrxgk\":\"ajc\"},\"id\":\"euvyinzqodfvpgs\",\"name\":\"oxgsgbpfgzdjtx\",\"type\":\"zflbqvg\"},{\"properties\":{\"partnerRegistrationImmutableId\":\"72c1d23a-dfc0-465f-a9b6-c4d4382e6e56\",\"endpointServiceContext\":\"gafcqu\",\"expirationTimeIfNotActivatedUtc\":\"2021-03-05T03:27:21Z\",\"provisioningState\":\"Updating\",\"activationState\":\"Activated\",\"endpointBaseUrl\":\"sdtutnwlduyc\",\"messageForActivation\":\"zhyrmewipmve\"},\"location\":\"xukuqgsj\",\"tags\":{\"xgketwz\":\"n\",\"mhv\":\"hzjhf\",\"uneqsxvmhf\":\"muvgp\"},\"id\":\"uzjyihsasbhudypo\",\"name\":\"yue\",\"type\":\"slynsqyrpfoo\"},{\"properties\":{\"partnerRegistrationImmutableId\":\"dd8d9f21-e6d2-4a68-87e7-9a638b40591f\",\"endpointServiceContext\":\"tyms\",\"expirationTimeIfNotActivatedUtc\":\"2021-07-18T21:06:13Z\",\"provisioningState\":\"Succeeded\",\"activationState\":\"Activated\",\"endpointBaseUrl\":\"wqzdzgtilaxhnfhq\",\"messageForActivation\":\"vi\"},\"location\":\"uwivkxoy\",\"tags\":{\"kvcpwpgclr\":\"bixxrt\",\"yefrpmpdnqqska\":\"ivtsoxfrkenxpm\"},\"id\":\"ao\",\"name\":\"vmm\",\"type\":\"npqfrtqlkzmeg\"},{\"properties\":{\"partnerRegistrationImmutableId\":\"a234244a-3a4c-4ee3-ae77-d8c6dd2eac8f\",\"endpointServiceContext\":\"vkxlz\",\"expirationTimeIfNotActivatedUtc\":\"2021-04-18T23:17Z\",\"provisioningState\":\"IdleDueToMirroredChannelResourceDeletion\",\"activationState\":\"Activated\",\"endpointBaseUrl\":\"ealzxwhcansymoyq\",\"messageForActivation\":\"wigdi\"},\"location\":\"kbxgom\",\"tags\":{\"e\":\"uwasqvd\",\"uxakjsqzhzbezk\":\"y\",\"kgfmocwahpq\":\"imsidxasicddyvvj\",\"jhhn\":\"atjeaahh\"},\"id\":\"kzyb\",\"name\":\"jjidjk\",\"type\":\"yxkyxvx\"}],\"nextLink\":\"blbjedn\"}")
            .toObject(PartnerDestinationsListResult.class);
        Assertions.assertEquals("azkmtgguwp", model.value().get(0).location());
        Assertions.assertEquals("ajc", model.value().get(0).tags().get("vmmghfcfiwrxgk"));
        Assertions.assertEquals(UUID.fromString("3b510bab-96ed-47b0-8fb5-f48efa1c2f85"),
            model.value().get(0).partnerRegistrationImmutableId());
        Assertions.assertEquals("rxvxcjzh", model.value().get(0).endpointServiceContext());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T06:52:32Z"),
            model.value().get(0).expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerDestinationActivationState.ACTIVATED, model.value().get(0).activationState());
        Assertions.assertEquals("gqscj", model.value().get(0).endpointBaseUrl());
        Assertions.assertEquals("ftjuh", model.value().get(0).messageForActivation());
        Assertions.assertEquals("blbjedn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerDestinationsListResult model = new PartnerDestinationsListResult().withValue(Arrays.asList(
            new PartnerDestinationInner().withLocation("azkmtgguwp")
                .withTags(mapOf("vmmghfcfiwrxgk", "ajc"))
                .withPartnerRegistrationImmutableId(UUID.fromString("3b510bab-96ed-47b0-8fb5-f48efa1c2f85"))
                .withEndpointServiceContext("rxvxcjzh")
                .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-05-06T06:52:32Z"))
                .withActivationState(PartnerDestinationActivationState.ACTIVATED)
                .withEndpointBaseUrl("gqscj")
                .withMessageForActivation("ftjuh"),
            new PartnerDestinationInner().withLocation("xukuqgsj")
                .withTags(mapOf("xgketwz", "n", "mhv", "hzjhf", "uneqsxvmhf", "muvgp"))
                .withPartnerRegistrationImmutableId(UUID.fromString("72c1d23a-dfc0-465f-a9b6-c4d4382e6e56"))
                .withEndpointServiceContext("gafcqu")
                .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-03-05T03:27:21Z"))
                .withActivationState(PartnerDestinationActivationState.ACTIVATED)
                .withEndpointBaseUrl("sdtutnwlduyc")
                .withMessageForActivation("zhyrmewipmve"),
            new PartnerDestinationInner().withLocation("uwivkxoy")
                .withTags(mapOf("kvcpwpgclr", "bixxrt", "yefrpmpdnqqska", "ivtsoxfrkenxpm"))
                .withPartnerRegistrationImmutableId(UUID.fromString("dd8d9f21-e6d2-4a68-87e7-9a638b40591f"))
                .withEndpointServiceContext("tyms")
                .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-07-18T21:06:13Z"))
                .withActivationState(PartnerDestinationActivationState.ACTIVATED)
                .withEndpointBaseUrl("wqzdzgtilaxhnfhq")
                .withMessageForActivation("vi"),
            new PartnerDestinationInner().withLocation("kbxgom")
                .withTags(
                    mapOf("e", "uwasqvd", "uxakjsqzhzbezk", "y", "kgfmocwahpq", "imsidxasicddyvvj", "jhhn", "atjeaahh"))
                .withPartnerRegistrationImmutableId(UUID.fromString("a234244a-3a4c-4ee3-ae77-d8c6dd2eac8f"))
                .withEndpointServiceContext("vkxlz")
                .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-04-18T23:17Z"))
                .withActivationState(PartnerDestinationActivationState.ACTIVATED)
                .withEndpointBaseUrl("ealzxwhcansymoyq")
                .withMessageForActivation("wigdi")))
            .withNextLink("blbjedn");
        model = BinaryData.fromObject(model).toObject(PartnerDestinationsListResult.class);
        Assertions.assertEquals("azkmtgguwp", model.value().get(0).location());
        Assertions.assertEquals("ajc", model.value().get(0).tags().get("vmmghfcfiwrxgk"));
        Assertions.assertEquals(UUID.fromString("3b510bab-96ed-47b0-8fb5-f48efa1c2f85"),
            model.value().get(0).partnerRegistrationImmutableId());
        Assertions.assertEquals("rxvxcjzh", model.value().get(0).endpointServiceContext());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T06:52:32Z"),
            model.value().get(0).expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerDestinationActivationState.ACTIVATED, model.value().get(0).activationState());
        Assertions.assertEquals("gqscj", model.value().get(0).endpointBaseUrl());
        Assertions.assertEquals("ftjuh", model.value().get(0).messageForActivation());
        Assertions.assertEquals("blbjedn", model.nextLink());
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
