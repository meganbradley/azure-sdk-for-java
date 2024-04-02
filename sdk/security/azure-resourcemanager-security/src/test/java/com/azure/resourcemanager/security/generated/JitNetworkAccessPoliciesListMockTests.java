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
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicy;
import com.azure.resourcemanager.security.models.Protocol;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JitNetworkAccessPoliciesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"virtualMachines\":[{\"id\":\"aisf\",\"ports\":[{\"number\":1533666666,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"mrkm\"},{\"number\":1369846517,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"myzbu\"},{\"number\":1317019406,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"hhcmtslptbdponh\"}],\"publicIpAddress\":\"qivcnuqfpzjzzb\"},{\"id\":\"cwtwtrchk\",\"ports\":[{\"number\":1351136981,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"awqesqsqmiekx\"},{\"number\":1372297,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"qchf\"},{\"number\":416071663,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"kkvjjl\"},{\"number\":1136681315,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"cu\"}],\"publicIpAddress\":\"yqokbgumuejxxpx\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"hmbuz\",\"ports\":[]}],\"startTimeUtc\":\"2021-09-15T20:05:06Z\",\"requestor\":\"nrkjkng\",\"justification\":\"sulaybhozls\"}],\"provisioningState\":\"fnhbvcntpoe\"},\"kind\":\"trsljzmzuic\",\"location\":\"gsxzn\",\"id\":\"p\",\"name\":\"mkqbylbbnjldicq\",\"type\":\"ma\"}]}";

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

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JitNetworkAccessPolicy> response
            = manager.jitNetworkAccessPolicies().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("trsljzmzuic", response.iterator().next().kind());
        Assertions.assertEquals("aisf", response.iterator().next().virtualMachines().get(0).id());
        Assertions.assertEquals(1533666666,
            response.iterator().next().virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.TCP,
            response.iterator().next().virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("mrkm",
            response.iterator().next().virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("qivcnuqfpzjzzb",
            response.iterator().next().virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("hmbuz", response.iterator().next().requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-15T20:05:06Z"),
            response.iterator().next().requests().get(0).startTimeUtc());
        Assertions.assertEquals("nrkjkng", response.iterator().next().requests().get(0).requestor());
        Assertions.assertEquals("sulaybhozls", response.iterator().next().requests().get(0).justification());
    }
}
