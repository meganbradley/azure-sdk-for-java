// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.ChannelProperties;
import com.azure.resourcemanager.eventgrid.models.ChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.models.ChannelType;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationInfo;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicInfo;
import com.azure.resourcemanager.eventgrid.models.ReadinessState;
import com.azure.resourcemanager.eventgrid.models.ResourceMoveChangeHistory;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChannelPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChannelProperties model = BinaryData.fromString(
            "{\"channelType\":\"PartnerTopic\",\"partnerTopicInfo\":{\"azureSubscriptionId\":\"rqobmtuk\",\"resourceGroupName\":\"ryrtihfxtijbpzv\",\"name\":\"wzsymglzufcy\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"ivyqniwbybrkxvd\":{\"description\":\"hanufhfcbjysagi\",\"displayName\":\"xqhabi\",\"documentationUrl\":\"ikxwc\",\"dataSchemaUrl\":\"yscnpqxu\"},\"mkkvnip\":{\"description\":\"jgrtfwvukxga\",\"displayName\":\"ccsnhsjc\",\"documentationUrl\":\"ejhkry\",\"dataSchemaUrl\":\"napczwlokjy\"}}},\"source\":\"xzjnchgejs\"},\"partnerDestinationInfo\":{\"endpointType\":\"PartnerDestinationInfo\",\"azureSubscriptionId\":\"mailzydehojw\",\"resourceGroupName\":\"huxinpmqnj\",\"name\":\"wixjsprozvcp\",\"endpointServiceContext\":\"eg\",\"resourceMoveChangeHistory\":[{\"azureSubscriptionId\":\"fdatsc\",\"resourceGroupName\":\"vpjhulsuuv\",\"changedTimeUtc\":\"2021-07-02T09:33:18Z\"},{\"azureSubscriptionId\":\"zkrwfn\",\"resourceGroupName\":\"odjpslwejd\",\"changedTimeUtc\":\"2021-02-19T06:09:33Z\"},{\"azureSubscriptionId\":\"yoqpsoaccta\",\"resourceGroupName\":\"kljla\",\"changedTimeUtc\":\"2021-06-15T07:28:27Z\"},{\"azureSubscriptionId\":\"yffdfdos\",\"resourceGroupName\":\"expa\",\"changedTimeUtc\":\"2021-04-29T11:27:29Z\"}]},\"messageForActivation\":\"hmsbzjhcrzevdp\",\"provisioningState\":\"Deleting\",\"readinessState\":\"Activated\",\"expirationTimeIfNotActivatedUtc\":\"2021-08-21T16:25:47Z\"}")
            .toObject(ChannelProperties.class);
        Assertions.assertEquals(ChannelType.PARTNER_TOPIC, model.channelType());
        Assertions.assertEquals("rqobmtuk", model.partnerTopicInfo().azureSubscriptionId());
        Assertions.assertEquals("ryrtihfxtijbpzv", model.partnerTopicInfo().resourceGroupName());
        Assertions.assertEquals("wzsymglzufcy", model.partnerTopicInfo().name());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("hanufhfcbjysagi",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").description());
        Assertions.assertEquals("xqhabi",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").displayName());
        Assertions.assertEquals("ikxwc",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").documentationUrl());
        Assertions.assertEquals("yscnpqxu",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").dataSchemaUrl());
        Assertions.assertEquals("xzjnchgejs", model.partnerTopicInfo().source());
        Assertions.assertEquals("mailzydehojw", model.partnerDestinationInfo().azureSubscriptionId());
        Assertions.assertEquals("huxinpmqnj", model.partnerDestinationInfo().resourceGroupName());
        Assertions.assertEquals("wixjsprozvcp", model.partnerDestinationInfo().name());
        Assertions.assertEquals("eg", model.partnerDestinationInfo().endpointServiceContext());
        Assertions.assertEquals("fdatsc",
            model.partnerDestinationInfo().resourceMoveChangeHistory().get(0).azureSubscriptionId());
        Assertions.assertEquals("vpjhulsuuv",
            model.partnerDestinationInfo().resourceMoveChangeHistory().get(0).resourceGroupName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T09:33:18Z"),
            model.partnerDestinationInfo().resourceMoveChangeHistory().get(0).changedTimeUtc());
        Assertions.assertEquals("hmsbzjhcrzevdp", model.messageForActivation());
        Assertions.assertEquals(ChannelProvisioningState.DELETING, model.provisioningState());
        Assertions.assertEquals(ReadinessState.ACTIVATED, model.readinessState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-21T16:25:47Z"), model.expirationTimeIfNotActivatedUtc());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChannelProperties model = new ChannelProperties().withChannelType(ChannelType.PARTNER_TOPIC)
            .withPartnerTopicInfo(new PartnerTopicInfo().withAzureSubscriptionId("rqobmtuk")
                .withResourceGroupName("ryrtihfxtijbpzv").withName("wzsymglzufcy")
                .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                    .withInlineEventTypes(mapOf(
                        "ivyqniwbybrkxvd", new InlineEventProperties().withDescription("hanufhfcbjysagi")
                            .withDisplayName("xqhabi").withDocumentationUrl("ikxwc").withDataSchemaUrl("yscnpqxu"),
                        "mkkvnip",
                        new InlineEventProperties().withDescription("jgrtfwvukxga").withDisplayName("ccsnhsjc")
                            .withDocumentationUrl("ejhkry").withDataSchemaUrl("napczwlokjy"))))
                .withSource("xzjnchgejs"))
            .withPartnerDestinationInfo(new PartnerDestinationInfo().withAzureSubscriptionId("mailzydehojw")
                .withResourceGroupName("huxinpmqnj").withName("wixjsprozvcp").withEndpointServiceContext("eg")
                .withResourceMoveChangeHistory(Arrays.asList(
                    new ResourceMoveChangeHistory().withAzureSubscriptionId("fdatsc")
                        .withResourceGroupName("vpjhulsuuv")
                        .withChangedTimeUtc(OffsetDateTime.parse("2021-07-02T09:33:18Z")),
                    new ResourceMoveChangeHistory().withAzureSubscriptionId("zkrwfn")
                        .withResourceGroupName("odjpslwejd")
                        .withChangedTimeUtc(OffsetDateTime.parse("2021-02-19T06:09:33Z")),
                    new ResourceMoveChangeHistory().withAzureSubscriptionId("yoqpsoaccta")
                        .withResourceGroupName("kljla")
                        .withChangedTimeUtc(OffsetDateTime.parse("2021-06-15T07:28:27Z")),
                    new ResourceMoveChangeHistory().withAzureSubscriptionId("yffdfdos").withResourceGroupName("expa")
                        .withChangedTimeUtc(OffsetDateTime.parse("2021-04-29T11:27:29Z")))))
            .withMessageForActivation("hmsbzjhcrzevdp").withProvisioningState(ChannelProvisioningState.DELETING)
            .withReadinessState(ReadinessState.ACTIVATED)
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-08-21T16:25:47Z"));
        model = BinaryData.fromObject(model).toObject(ChannelProperties.class);
        Assertions.assertEquals(ChannelType.PARTNER_TOPIC, model.channelType());
        Assertions.assertEquals("rqobmtuk", model.partnerTopicInfo().azureSubscriptionId());
        Assertions.assertEquals("ryrtihfxtijbpzv", model.partnerTopicInfo().resourceGroupName());
        Assertions.assertEquals("wzsymglzufcy", model.partnerTopicInfo().name());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("hanufhfcbjysagi",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").description());
        Assertions.assertEquals("xqhabi",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").displayName());
        Assertions.assertEquals("ikxwc",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").documentationUrl());
        Assertions.assertEquals("yscnpqxu",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("ivyqniwbybrkxvd").dataSchemaUrl());
        Assertions.assertEquals("xzjnchgejs", model.partnerTopicInfo().source());
        Assertions.assertEquals("mailzydehojw", model.partnerDestinationInfo().azureSubscriptionId());
        Assertions.assertEquals("huxinpmqnj", model.partnerDestinationInfo().resourceGroupName());
        Assertions.assertEquals("wixjsprozvcp", model.partnerDestinationInfo().name());
        Assertions.assertEquals("eg", model.partnerDestinationInfo().endpointServiceContext());
        Assertions.assertEquals("fdatsc",
            model.partnerDestinationInfo().resourceMoveChangeHistory().get(0).azureSubscriptionId());
        Assertions.assertEquals("vpjhulsuuv",
            model.partnerDestinationInfo().resourceMoveChangeHistory().get(0).resourceGroupName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T09:33:18Z"),
            model.partnerDestinationInfo().resourceMoveChangeHistory().get(0).changedTimeUtc());
        Assertions.assertEquals("hmsbzjhcrzevdp", model.messageForActivation());
        Assertions.assertEquals(ChannelProvisioningState.DELETING, model.provisioningState());
        Assertions.assertEquals(ReadinessState.ACTIVATED, model.readinessState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-21T16:25:47Z"), model.expirationTimeIfNotActivatedUtc());
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
