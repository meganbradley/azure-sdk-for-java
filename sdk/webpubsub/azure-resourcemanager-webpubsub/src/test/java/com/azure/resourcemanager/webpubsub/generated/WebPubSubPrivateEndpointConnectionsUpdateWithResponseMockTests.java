// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpoint;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointConnection;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WebPubSubPrivateEndpointConnectionsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Unknown\",\"privateEndpoint\":{\"id\":\"pugmehqe\"},\"groupIds\":[\"fhbzehewhoqhn\"],\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"ldxea\",\"actionsRequired\":\"gschorimkrsrr\"}},\"id\":\"ucsofldpuviyf\",\"name\":\"aabeolhbhlvbmxuq\",\"type\":\"bsxtkcudfbsfarfs\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        WebPubSubManager manager =
            WebPubSubManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response =
            manager
                .webPubSubPrivateEndpointConnections()
                .updateWithResponse(
                    "wwgbdv",
                    "bid",
                    "hmwffplfmuv",
                    new PrivateEndpointConnectionInner()
                        .withPrivateEndpoint(new PrivateEndpoint().withId("rrvwey"))
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkServiceConnectionState()
                                .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                                .withDescription("oshbragapyy")
                                .withActionsRequired("fsv")),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("pugmehqe", response.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.DISCONNECTED, response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ldxea", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("gschorimkrsrr", response.privateLinkServiceConnectionState().actionsRequired());
    }
}
