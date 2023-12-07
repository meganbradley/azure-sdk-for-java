// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerTopic;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PartnerTopicsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"c62830cd-c44a-48f0-a094-918926e3eb80\",\"source\":\"gtkihonikzsr\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"lykhkg\":{\"description\":\"z\",\"displayName\":\"pntogkensckh\",\"documentationUrl\":\"carmoyfx\",\"dataSchemaUrl\":\"wykuqdnd\"},\"qmlfv\":{\"description\":\"pvd\",\"displayName\":\"fpeerscdxrnr\",\"documentationUrl\":\"rcufmbgacnrgfdtn\",\"dataSchemaUrl\":\"spsanmameubkq\"},\"e\":{\"description\":\"qcs\",\"displayName\":\"qjmxpt\",\"documentationUrl\":\"ipuugkwdrqmr\",\"dataSchemaUrl\":\"huuonjkkxukg\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-11-04T15:53:15Z\",\"provisioningState\":\"Canceled\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"gcjojlleui\",\"messageForActivation\":\"mt\"},\"identity\":{\"type\":\"SystemAssigned, UserAssigned\",\"principalId\":\"htmep\",\"tenantId\":\"bpjbapm\",\"userAssignedIdentities\":{\"mnuf\":{\"principalId\":\"kvavucgj\",\"clientId\":\"aiq\"},\"scotyx\":{\"principalId\":\"rchxwwuzdmhvwl\",\"clientId\":\"vjmxmlitqdsjipdv\"}}},\"location\":\"riifefn\",\"tags\":{\"eailwdqmqf\":\"vrqoemwsi\",\"kd\":\"deotmfx\"},\"id\":\"g\",\"name\":\"gnamkuuyiu\",\"type\":\"uafixlxicwgp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        EventGridManager manager = EventGridManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PartnerTopic response = manager.partnerTopics().define("b").withRegion("svbxxyjisskob")
            .withExistingResourceGroup("fwkztsms").withTags(mapOf("rkdpsqeqfb", "lflioewyhxessm", "ses", "xm"))
            .withIdentity(new IdentityInfo().withType(IdentityType.USER_ASSIGNED).withPrincipalId("gnuywezygva")
                .withTenantId("aaqwvkg").withUserAssignedIdentities(
                    mapOf("ortbnukkfax", new UserIdentityProperties().withPrincipalId("pmpv").withClientId("ogehluf"))))
            .withPartnerRegistrationImmutableId(UUID.fromString("79187893-1ce3-4248-a027-11bad6b932fc"))
            .withSource(
                "lznfhkqytkztado")
            .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                .withInlineEventTypes(mapOf("pnfdbgsosciene",
                    new InlineEventProperties().withDescription("fcycrsvlo").withDisplayName("h")
                        .withDocumentationUrl("qkzjuqwqaj").withDataSchemaUrl("zxpixhyo"),
                    "urz",
                    new InlineEventProperties().withDescription("vbennmfkbpjnrt").withDisplayName("w")
                        .withDocumentationUrl("thr").withDataSchemaUrl("mdudsy"),
                    "yehhfdyldhg",
                    new InlineEventProperties().withDescription("ktjhffe").withDisplayName("koqyouer")
                        .withDocumentationUrl("g").withDataSchemaUrl("uzxk"),
                    "zwhpjlwyxedz",
                    new InlineEventProperties().withDescription("d").withDisplayName("zqiyuqhtder")
                        .withDocumentationUrl("n").withDataSchemaUrl("a"))))
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-07-11T01:48:14Z"))
            .withActivationState(PartnerTopicActivationState.ACTIVATED)
            .withPartnerTopicFriendlyDescription("kewvmyifopxfj").withMessageForActivation("pdyzoutx").create();

        Assertions.assertEquals("riifefn", response.location());
        Assertions.assertEquals("vrqoemwsi", response.tags().get("eailwdqmqf"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("htmep", response.identity().principalId());
        Assertions.assertEquals("bpjbapm", response.identity().tenantId());
        Assertions.assertEquals("kvavucgj", response.identity().userAssignedIdentities().get("mnuf").principalId());
        Assertions.assertEquals("aiq", response.identity().userAssignedIdentities().get("mnuf").clientId());
        Assertions.assertEquals(UUID.fromString("c62830cd-c44a-48f0-a094-918926e3eb80"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("gtkihonikzsr", response.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, response.eventTypeInfo().kind());
        Assertions.assertEquals("z", response.eventTypeInfo().inlineEventTypes().get("lykhkg").description());
        Assertions.assertEquals("pntogkensckh",
            response.eventTypeInfo().inlineEventTypes().get("lykhkg").displayName());
        Assertions.assertEquals("carmoyfx",
            response.eventTypeInfo().inlineEventTypes().get("lykhkg").documentationUrl());
        Assertions.assertEquals("wykuqdnd", response.eventTypeInfo().inlineEventTypes().get("lykhkg").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-04T15:53:15Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, response.activationState());
        Assertions.assertEquals("gcjojlleui", response.partnerTopicFriendlyDescription());
        Assertions.assertEquals("mt", response.messageForActivation());
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
