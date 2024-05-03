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
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeListResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TopicEventSubscriptionsGetDeliveryAttributesWithResponseMockTests {
    @Test
    public void testGetDeliveryAttributesWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"type\":\"DeliveryAttributeMapping\",\"name\":\"emtm\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"rf\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"pinkzp\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"qtdiswxspvckoj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DeliveryAttributeListResult response = manager.topicEventSubscriptions()
            .getDeliveryAttributesWithResponse("zfkiceevsaaxwsp", "axikhfjqebglcxk", "gzzromv",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("emtm", response.value().get(0).name());
    }
}
