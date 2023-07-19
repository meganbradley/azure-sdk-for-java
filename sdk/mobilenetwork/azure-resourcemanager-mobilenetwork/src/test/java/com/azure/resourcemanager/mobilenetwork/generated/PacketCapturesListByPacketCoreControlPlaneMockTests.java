// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.PacketCapture;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PacketCapturesListByPacketCoreControlPlaneMockTests {
    @Test
    public void testListByPacketCoreControlPlane() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"status\":\"Error\",\"reason\":\"qhibtozipqwjedm\",\"captureStartTime\":\"2021-01-18T06:45:43Z\",\"networkInterfaces\":[\"g\"],\"bytesToCapturePerPacket\":3365280671327791435,\"totalBytesPerSession\":5181301429444209355,\"timeLimitInSeconds\":538601125},\"id\":\"kmqp\",\"name\":\"o\",\"type\":\"hlfbcgwgc\"}]}";

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

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PacketCapture> response =
            manager.packetCaptures().listByPacketCoreControlPlane("phdu", "neiknpg", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("g", response.iterator().next().networkInterfaces().get(0));
        Assertions.assertEquals(3365280671327791435L, response.iterator().next().bytesToCapturePerPacket());
        Assertions.assertEquals(5181301429444209355L, response.iterator().next().totalBytesPerSession());
        Assertions.assertEquals(538601125, response.iterator().next().timeLimitInSeconds());
    }
}
