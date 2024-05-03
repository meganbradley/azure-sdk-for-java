// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.models.DomainUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.ResourceSku;
import com.azure.resourcemanager.eventgrid.models.Sku;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DomainUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DomainUpdateParameters model = BinaryData.fromString(
            "{\"tags\":{\"bbtdzumvee\":\"uaejxdultsk\",\"zuhkfpbsjyof\":\"gpw\"},\"properties\":{\"publicNetworkAccess\":\"SecuredByPerimeter\",\"inboundIpRules\":[{\"ipMask\":\"ttouwaboekqvkel\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.0\",\"disableLocalAuth\":true,\"autoCreateTopicWithFirstSubscription\":true,\"autoDeleteTopicWithLastSubscription\":false,\"dataResidencyBoundary\":\"WithinGeopair\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"aulppggd\":{\"description\":\"jixisxyawjoyaqcs\",\"displayName\":\"jpkiidzyexznelix\",\"documentationUrl\":\"rzt\",\"dataSchemaUrl\":\"lhbnxkna\"},\"trmgucnapkte\":{\"description\":\"napnyiropuhpigv\",\"displayName\":\"ylgqgitxmedjvcsl\",\"documentationUrl\":\"qwwncw\",\"dataSchemaUrl\":\"hxg\"},\"lzdahzxctobgbkdm\":{\"description\":\"llwptfdy\",\"displayName\":\"fqbuaceopzf\",\"documentationUrl\":\"hhuao\",\"dataSchemaUrl\":\"pcqeqx\"}}}},\"identity\":{\"type\":\"SystemAssigned, UserAssigned\",\"principalId\":\"stmgrcfbunrmfqjh\",\"tenantId\":\"xbpvjymjhx\",\"userAssignedIdentities\":{\"uvjfdxxive\":{\"principalId\":\"gudivkrtswbxqz\",\"clientId\":\"zjf\"},\"wvxysl\":{\"principalId\":\"t\",\"clientId\":\"aqtdoqmcbx\"}}},\"sku\":{\"name\":\"Basic\"}}")
            .toObject(DomainUpdateParameters.class);
        Assertions.assertEquals("uaejxdultsk", model.tags().get("bbtdzumvee"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("stmgrcfbunrmfqjh", model.identity().principalId());
        Assertions.assertEquals("xbpvjymjhx", model.identity().tenantId());
        Assertions.assertEquals("gudivkrtswbxqz",
            model.identity().userAssignedIdentities().get("uvjfdxxive").principalId());
        Assertions.assertEquals("zjf", model.identity().userAssignedIdentities().get("uvjfdxxive").clientId());
        Assertions.assertEquals(Sku.BASIC, model.sku().name());
        Assertions.assertEquals(PublicNetworkAccess.SECURED_BY_PERIMETER, model.publicNetworkAccess());
        Assertions.assertEquals("ttouwaboekqvkel", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(true, model.disableLocalAuth());
        Assertions.assertEquals(true, model.autoCreateTopicWithFirstSubscription());
        Assertions.assertEquals(false, model.autoDeleteTopicWithLastSubscription());
        Assertions.assertEquals(DataResidencyBoundary.WITHIN_GEOPAIR, model.dataResidencyBoundary());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("jixisxyawjoyaqcs",
            model.eventTypeInfo().inlineEventTypes().get("aulppggd").description());
        Assertions.assertEquals("jpkiidzyexznelix",
            model.eventTypeInfo().inlineEventTypes().get("aulppggd").displayName());
        Assertions.assertEquals("rzt", model.eventTypeInfo().inlineEventTypes().get("aulppggd").documentationUrl());
        Assertions.assertEquals("lhbnxkna", model.eventTypeInfo().inlineEventTypes().get("aulppggd").dataSchemaUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DomainUpdateParameters model
            = new DomainUpdateParameters().withTags(mapOf("bbtdzumvee", "uaejxdultsk", "zuhkfpbsjyof", "gpw"))
                .withIdentity(new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withPrincipalId("stmgrcfbunrmfqjh")
                    .withTenantId("xbpvjymjhx")
                    .withUserAssignedIdentities(mapOf("uvjfdxxive",
                        new UserIdentityProperties().withPrincipalId("gudivkrtswbxqz").withClientId("zjf"), "wvxysl",
                        new UserIdentityProperties().withPrincipalId("t").withClientId("aqtdoqmcbx"))))
                .withSku(new ResourceSku().withName(Sku.BASIC))
                .withPublicNetworkAccess(PublicNetworkAccess.SECURED_BY_PERIMETER)
                .withInboundIpRules(
                    Arrays.asList(new InboundIpRule().withIpMask("ttouwaboekqvkel").withAction(IpActionType.ALLOW)))
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO)
                .withDisableLocalAuth(true)
                .withAutoCreateTopicWithFirstSubscription(true)
                .withAutoDeleteTopicWithLastSubscription(false)
                .withDataResidencyBoundary(DataResidencyBoundary.WITHIN_GEOPAIR)
                .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                    .withInlineEventTypes(mapOf("aulppggd",
                        new InlineEventProperties().withDescription("jixisxyawjoyaqcs")
                            .withDisplayName("jpkiidzyexznelix")
                            .withDocumentationUrl("rzt")
                            .withDataSchemaUrl("lhbnxkna"),
                        "trmgucnapkte",
                        new InlineEventProperties().withDescription("napnyiropuhpigv")
                            .withDisplayName("ylgqgitxmedjvcsl")
                            .withDocumentationUrl("qwwncw")
                            .withDataSchemaUrl("hxg"),
                        "lzdahzxctobgbkdm",
                        new InlineEventProperties().withDescription("llwptfdy")
                            .withDisplayName("fqbuaceopzf")
                            .withDocumentationUrl("hhuao")
                            .withDataSchemaUrl("pcqeqx"))));
        model = BinaryData.fromObject(model).toObject(DomainUpdateParameters.class);
        Assertions.assertEquals("uaejxdultsk", model.tags().get("bbtdzumvee"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("stmgrcfbunrmfqjh", model.identity().principalId());
        Assertions.assertEquals("xbpvjymjhx", model.identity().tenantId());
        Assertions.assertEquals("gudivkrtswbxqz",
            model.identity().userAssignedIdentities().get("uvjfdxxive").principalId());
        Assertions.assertEquals("zjf", model.identity().userAssignedIdentities().get("uvjfdxxive").clientId());
        Assertions.assertEquals(Sku.BASIC, model.sku().name());
        Assertions.assertEquals(PublicNetworkAccess.SECURED_BY_PERIMETER, model.publicNetworkAccess());
        Assertions.assertEquals("ttouwaboekqvkel", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(true, model.disableLocalAuth());
        Assertions.assertEquals(true, model.autoCreateTopicWithFirstSubscription());
        Assertions.assertEquals(false, model.autoDeleteTopicWithLastSubscription());
        Assertions.assertEquals(DataResidencyBoundary.WITHIN_GEOPAIR, model.dataResidencyBoundary());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("jixisxyawjoyaqcs",
            model.eventTypeInfo().inlineEventTypes().get("aulppggd").description());
        Assertions.assertEquals("jpkiidzyexznelix",
            model.eventTypeInfo().inlineEventTypes().get("aulppggd").displayName());
        Assertions.assertEquals("rzt", model.eventTypeInfo().inlineEventTypes().get("aulppggd").documentationUrl());
        Assertions.assertEquals("lhbnxkna", model.eventTypeInfo().inlineEventTypes().get("aulppggd").dataSchemaUrl());
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
