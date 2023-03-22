// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardeningEnforceRequest;
import com.azure.resourcemanager.security.models.Direction;
import com.azure.resourcemanager.security.models.Rule;
import com.azure.resourcemanager.security.models.TransportProtocol;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AdaptiveNetworkHardeningsEnforceMockTests {
    @Test
    public void testEnforce() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr = "{}";

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

        manager
            .adaptiveNetworkHardenings()
            .enforce(
                "mgm",
                "dorgmynltw",
                "p",
                "tmfoeajogsyxwet",
                "mfd",
                new AdaptiveNetworkHardeningEnforceRequest()
                    .withRules(
                        Arrays
                            .asList(
                                new Rule()
                                    .withName("lkpzwbhnrecchd")
                                    .withDirection(Direction.OUTBOUND)
                                    .withDestinationPort(1565024992)
                                    .withProtocols(
                                        Arrays
                                            .asList(
                                                TransportProtocol.UDP,
                                                TransportProtocol.UDP,
                                                TransportProtocol.TCP,
                                                TransportProtocol.TCP))
                                    .withIpAddresses(Arrays.asList("biuc", "khhwmj", "jbweunxcqr", "ihufoihp")),
                                new Rule()
                                    .withName("ybxvgn")
                                    .withDirection(Direction.INBOUND)
                                    .withDestinationPort(588866023)
                                    .withProtocols(
                                        Arrays
                                            .asList(
                                                TransportProtocol.TCP,
                                                TransportProtocol.UDP,
                                                TransportProtocol.TCP,
                                                TransportProtocol.TCP))
                                    .withIpAddresses(Arrays.asList("uzvkunhdimjuk", "irzkaugpucdo", "fq", "lwgofm")),
                                new Rule()
                                    .withName("wrjlvzkl")
                                    .withDirection(Direction.OUTBOUND)
                                    .withDestinationPort(679903472)
                                    .withProtocols(
                                        Arrays
                                            .asList(
                                                TransportProtocol.TCP, TransportProtocol.TCP, TransportProtocol.UDP))
                                    .withIpAddresses(
                                        Arrays.asList("vlbishjvpzapt", "oskaoizji", "wfgcdiykkcxwn", "jvqynvavitmdm")),
                                new Rule()
                                    .withName("ohhihraxqud")
                                    .withDirection(Direction.INBOUND)
                                    .withDestinationPort(1198903362)
                                    .withProtocols(
                                        Arrays
                                            .asList(
                                                TransportProtocol.UDP,
                                                TransportProtocol.UDP,
                                                TransportProtocol.UDP,
                                                TransportProtocol.TCP))
                                    .withIpAddresses(Arrays.asList("vzadbwenn"))))
                    .withNetworkSecurityGroups(Arrays.asList("afhxrzfrmvztiuc", "viqlluk", "krcqx")),
                com.azure.core.util.Context.NONE);
    }
}
