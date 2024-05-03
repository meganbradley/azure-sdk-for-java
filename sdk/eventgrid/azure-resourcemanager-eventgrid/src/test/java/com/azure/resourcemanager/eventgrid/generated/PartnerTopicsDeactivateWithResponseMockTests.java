// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopic;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PartnerTopicsDeactivateWithResponseMockTests {
    @Test
    public void testDeactivateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"1078f12b-b946-45d2-bbd1-f679590f2038\",\"source\":\"jexayglxrkgjnmzp\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"izwgsoriobijeiyd\":{\"description\":\"fiuofpieid\",\"displayName\":\"vssqywjopackyhy\",\"documentationUrl\":\"ikmfn\",\"dataSchemaUrl\":\"millxgjs\"},\"zfffhtjnwo\":{\"description\":\"uynhbokayrgwybr\",\"displayName\":\"pdweoft\",\"documentationUrl\":\"rwaigsioctqkmv\",\"dataSchemaUrl\":\"nx\"},\"db\":{\"description\":\"tfjxtvlx\",\"displayName\":\"qfcwr\",\"documentationUrl\":\"omxeezwyhjmb\",\"dataSchemaUrl\":\"qegm\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-03-19T21:15:08Z\",\"provisioningState\":\"Deleting\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"vd\",\"messageForActivation\":\"detsz\"},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"jekwuyckyvne\",\"tenantId\":\"muffiwjbctvbpzu\",\"userAssignedIdentities\":{\"h\":{\"principalId\":\"otdxpo\",\"clientId\":\"slhwuusieckty\"},\"d\":{\"principalId\":\"xidhhxomil\",\"clientId\":\"xj\"},\"ateptwujjzg\":{\"principalId\":\"xwjwilm\",\"clientId\":\"sl\"}}},\"location\":\"qgq\",\"tags\":{\"qqy\":\"rhgtvhv\"},\"id\":\"bkkteo\",\"name\":\"ejogmkor\",\"type\":\"vmvm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PartnerTopic response = manager.partnerTopics()
            .deactivateWithResponse("owpcbapnpxraqawb", "pspfeylqlo", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("qgq", response.location());
        Assertions.assertEquals("rhgtvhv", response.tags().get("qqy"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("jekwuyckyvne", response.identity().principalId());
        Assertions.assertEquals("muffiwjbctvbpzu", response.identity().tenantId());
        Assertions.assertEquals("otdxpo", response.identity().userAssignedIdentities().get("h").principalId());
        Assertions.assertEquals("slhwuusieckty", response.identity().userAssignedIdentities().get("h").clientId());
        Assertions.assertEquals(UUID.fromString("1078f12b-b946-45d2-bbd1-f679590f2038"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("jexayglxrkgjnmzp", response.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, response.eventTypeInfo().kind());
        Assertions.assertEquals("fiuofpieid",
            response.eventTypeInfo().inlineEventTypes().get("izwgsoriobijeiyd").description());
        Assertions.assertEquals("vssqywjopackyhy",
            response.eventTypeInfo().inlineEventTypes().get("izwgsoriobijeiyd").displayName());
        Assertions.assertEquals("ikmfn",
            response.eventTypeInfo().inlineEventTypes().get("izwgsoriobijeiyd").documentationUrl());
        Assertions.assertEquals("millxgjs",
            response.eventTypeInfo().inlineEventTypes().get("izwgsoriobijeiyd").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-19T21:15:08Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, response.activationState());
        Assertions.assertEquals("vd", response.partnerTopicFriendlyDescription());
        Assertions.assertEquals("detsz", response.messageForActivation());
    }
}
