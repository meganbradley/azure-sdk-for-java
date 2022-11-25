// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.AccountModel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AccountsListModelsMockTests {
    @Test
    public void testListModels() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"baseModel\":{\"format\":\"ramxjezwlwnw\",\"name\":\"qlcvydy\",\"version\":\"tdooaoj\",\"callRateLimit\":{\"count\":20.04649,\"renewalPeriod\":45.65934,\"rules\":[]}},\"maxCapacity\":2101936696,\"capabilities\":{\"emmsbvdkc\":\"nuj\",\"fw\":\"odtji\",\"jvefkdlfoakggkfp\":\"lfltka\",\"qjnsjervtia\":\"gaowpulpqblylsyx\"},\"deprecation\":{\"fineTune\":\"dszue\",\"inference\":\"sbzkf\"},\"format\":\"yvpnqicvinvkjj\",\"name\":\"xrbuukzclew\",\"version\":\"mlwpazt\",\"callRateLimit\":{\"count\":10.191661,\"renewalPeriod\":83.19924,\"rules\":[]}}]}";

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

        PagedIterable<AccountModel> response = manager.accounts().listModels("xoruzfgsquyfxrx", "l", Context.NONE);

        Assertions.assertEquals("yvpnqicvinvkjj", response.iterator().next().format());
        Assertions.assertEquals("xrbuukzclew", response.iterator().next().name());
        Assertions.assertEquals("mlwpazt", response.iterator().next().version());
        Assertions.assertEquals("ramxjezwlwnw", response.iterator().next().baseModel().format());
        Assertions.assertEquals("qlcvydy", response.iterator().next().baseModel().name());
        Assertions.assertEquals("tdooaoj", response.iterator().next().baseModel().version());
        Assertions.assertEquals(2101936696, response.iterator().next().maxCapacity());
        Assertions.assertEquals("nuj", response.iterator().next().capabilities().get("emmsbvdkc"));
        Assertions.assertEquals("dszue", response.iterator().next().deprecation().fineTune());
        Assertions.assertEquals("sbzkf", response.iterator().next().deprecation().inference());
    }
}
