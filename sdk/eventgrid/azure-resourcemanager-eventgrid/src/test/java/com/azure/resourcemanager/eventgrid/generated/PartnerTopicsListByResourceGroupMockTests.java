// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopic;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PartnerTopicsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"partnerRegistrationImmutableId\":\"a9ba2314-f9ff-4a17-a611-6639836f5646\",\"source\":\"mzrqraz\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"gbsfsgsaenwldf\":{\"description\":\"laslksk\",\"displayName\":\"qj\",\"documentationUrl\":\"baihxjtgzg\",\"dataSchemaUrl\":\"iywbqgro\"},\"yckhefrbhseue\":{\"description\":\"ljql\",\"displayName\":\"pmrjctryl\",\"documentationUrl\":\"xebuhsxrznmg\",\"dataSchemaUrl\":\"al\"},\"s\":{\"description\":\"gpxebjludcayt\",\"displayName\":\"raxdt\",\"documentationUrl\":\"yjmgtnsewo\",\"dataSchemaUrl\":\"ly\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-09-28T10:44:47Z\",\"provisioningState\":\"Deleting\",\"activationState\":\"Activated\",\"partnerTopicFriendlyDescription\":\"e\",\"messageForActivation\":\"sehq\"},\"identity\":{\"type\":\"SystemAssigned, UserAssigned\",\"principalId\":\"twjwdsdlzm\",\"tenantId\":\"erxxxoteehkhowgo\",\"userAssignedIdentities\":{\"wbmpspfeylqloc\":{\"principalId\":\"xowpcbapn\",\"clientId\":\"raq\"},\"avxjfiuofpiei\":{\"principalId\":\"ujexayglxrk\",\"clientId\":\"nmzpas\"},\"yhydvikmfn\":{\"principalId\":\"lvs\",\"clientId\":\"ywjopac\"},\"ydyeuy\":{\"principalId\":\"millxgjs\",\"clientId\":\"zwgsoriobije\"}}},\"location\":\"hbo\",\"tags\":{\"wybriopdwe\":\"r\",\"norwaigsio\":\"f\"},\"id\":\"tqkmvjanxvzf\",\"name\":\"f\",\"type\":\"tj\"}]}";

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

        PagedIterable<PartnerTopic> response = manager.partnerTopics().listByResourceGroup("mcxqqxmyzklao", "n",
            1551780859, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hbo", response.iterator().next().location());
        Assertions.assertEquals("r", response.iterator().next().tags().get("wybriopdwe"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED,
            response.iterator().next().identity().type());
        Assertions.assertEquals("twjwdsdlzm", response.iterator().next().identity().principalId());
        Assertions.assertEquals("erxxxoteehkhowgo", response.iterator().next().identity().tenantId());
        Assertions.assertEquals("xowpcbapn",
            response.iterator().next().identity().userAssignedIdentities().get("wbmpspfeylqloc").principalId());
        Assertions.assertEquals("raq",
            response.iterator().next().identity().userAssignedIdentities().get("wbmpspfeylqloc").clientId());
        Assertions.assertEquals(UUID.fromString("a9ba2314-f9ff-4a17-a611-6639836f5646"),
            response.iterator().next().partnerRegistrationImmutableId());
        Assertions.assertEquals("mzrqraz", response.iterator().next().source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, response.iterator().next().eventTypeInfo().kind());
        Assertions.assertEquals("laslksk",
            response.iterator().next().eventTypeInfo().inlineEventTypes().get("gbsfsgsaenwldf").description());
        Assertions.assertEquals("qj",
            response.iterator().next().eventTypeInfo().inlineEventTypes().get("gbsfsgsaenwldf").displayName());
        Assertions.assertEquals("baihxjtgzg",
            response.iterator().next().eventTypeInfo().inlineEventTypes().get("gbsfsgsaenwldf").documentationUrl());
        Assertions.assertEquals("iywbqgro",
            response.iterator().next().eventTypeInfo().inlineEventTypes().get("gbsfsgsaenwldf").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-28T10:44:47Z"),
            response.iterator().next().expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.ACTIVATED, response.iterator().next().activationState());
        Assertions.assertEquals("e", response.iterator().next().partnerTopicFriendlyDescription());
        Assertions.assertEquals("sehq", response.iterator().next().messageForActivation());
    }
}
