// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpoint;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnection;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkServiceConnectionState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"privateEndpoint\":{\"id\":\"taugzxnfaa\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"tnkdmkqj\",\"actionsRequired\":\"wuenvr\"},\"provisioningState\":\"Succeeded\",\"groupIds\":[\"aibrebqaaysjkixq\",\"nqttezl\",\"fffiak\",\"jpqqmted\"]},\"location\":\"mjihyeozphv\",\"etag\":\"uyqncygupkvipmd\",\"id\":\"cwxqu\",\"name\":\"evzhfsto\",\"type\":\"xhojuj\"}";

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

        CognitiveServicesManager manager =
            CognitiveServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response =
            manager
                .privateEndpointConnections()
                .define("gfipnsxk")
                .withExistingAccount("t", "jqppyostronzmy")
                .withRegion("znoigbrn")
                .withProperties(
                    new PrivateEndpointConnectionProperties()
                        .withPrivateEndpoint(new PrivateEndpoint())
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkServiceConnectionState()
                                .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                                .withDescription("tsgumhj")
                                .withActionsRequired("ikkx"))
                        .withGroupIds(Arrays.asList("bq", "vuzlm", "felfktg", "lcrpw")))
                .create();

        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.PENDING,
                response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("tnkdmkqj", response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("wuenvr", response.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("aibrebqaaysjkixq", response.properties().groupIds().get(0));
        Assertions.assertEquals("mjihyeozphv", response.location());
    }
}
