// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.PacketCapture;
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

public final class PacketCapturesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"status\":\"NotStarted\",\"reason\":\"ubqmamh\",\"captureStartTime\":\"2021-08-24T12:41:38Z\",\"networkInterfaces\":[\"xz\",\"azttaboidvmfq\"],\"bytesToCapturePerPacket\":3132194827411846414,\"totalBytesPerSession\":8140031450715324589,\"timeLimitInSeconds\":1380428673},\"id\":\"pdfgkmtdherngbt\",\"name\":\"juahokqto\",\"type\":\"kauxof\"}";

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

        PacketCapture response =
            manager
                .packetCaptures()
                .define("ujqlafcbahh")
                .withExistingPacketCoreControlPlane("oxoebqi", "jipnwj")
                .withNetworkInterfaces(Arrays.asList("viauogphua", "tvt"))
                .withBytesToCapturePerPacket(8179260768876663444L)
                .withTotalBytesPerSession(8804652635806499294L)
                .withTimeLimitInSeconds(1995364399)
                .create();

        Assertions.assertEquals("xz", response.networkInterfaces().get(0));
        Assertions.assertEquals(3132194827411846414L, response.bytesToCapturePerPacket());
        Assertions.assertEquals(8140031450715324589L, response.totalBytesPerSession());
        Assertions.assertEquals(1380428673, response.timeLimitInSeconds());
    }
}
