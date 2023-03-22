// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.EndOfSupportStatus;
import com.azure.resourcemanager.security.models.Software;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SoftwareInventoriesListByExtendedResourceMockTests {
    @Test
    public void testListByExtendedResource() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"deviceId\":\"adhfztlray\",\"osPlatform\":\"kg\",\"vendor\":\"yh\",\"softwareName\":\"bkuwpzqxlc\",\"version\":\"akfe\",\"endOfSupportStatus\":\"noLongerSupported\",\"endOfSupportDate\":\"faqufqizjv\",\"numberOfKnownVulnerabilities\":297815263,\"firstSeenAt\":\"oajeyyjmjjxizx\"},\"id\":\"xhnzlslekcttgzkj\",\"name\":\"yqpdwadeghztld\",\"type\":\"vczdjiahuqymjzu\"}]}";

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

        SecurityManager manager =
            SecurityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Software> response =
            manager
                .softwareInventories()
                .listByExtendedResource("ulpodkaxpf", "bkzhmhjd", "lt", "eluqr", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("adhfztlray", response.iterator().next().deviceId());
        Assertions.assertEquals("kg", response.iterator().next().osPlatform());
        Assertions.assertEquals("yh", response.iterator().next().vendor());
        Assertions.assertEquals("bkuwpzqxlc", response.iterator().next().softwareName());
        Assertions.assertEquals("akfe", response.iterator().next().version());
        Assertions
            .assertEquals(EndOfSupportStatus.NO_LONGER_SUPPORTED, response.iterator().next().endOfSupportStatus());
        Assertions.assertEquals("faqufqizjv", response.iterator().next().endOfSupportDate());
        Assertions.assertEquals(297815263, response.iterator().next().numberOfKnownVulnerabilities());
        Assertions.assertEquals("oajeyyjmjjxizx", response.iterator().next().firstSeenAt());
    }
}
