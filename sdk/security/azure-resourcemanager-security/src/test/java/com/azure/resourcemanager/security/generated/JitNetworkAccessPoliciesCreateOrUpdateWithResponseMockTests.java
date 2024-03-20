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
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicy;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyVirtualMachine;
import com.azure.resourcemanager.security.models.JitNetworkAccessPortRule;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestVirtualMachine;
import com.azure.resourcemanager.security.models.Protocol;
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

public final class JitNetworkAccessPoliciesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"virtualMachines\":[{\"id\":\"owxhyvdbrdv\",\"ports\":[{\"number\":818358311,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"btycvl\"},{\"number\":1366549492,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"giikhrct\"},{\"number\":690212706,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"epxshmrdisc\"}],\"publicIpAddress\":\"vkymktcwmivoxgze\"},{\"id\":\"nglafnfgazagh\",\"ports\":[{\"number\":159379774,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"zwxuxorrutuhvem\"},{\"number\":664034009,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"ssolqy\"}],\"publicIpAddress\":\"wxlxohvr\"},{\"id\":\"qv\",\"ports\":[{\"number\":401426055,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"ojcvzfc\"},{\"number\":1395786313,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"jpj\"},{\"number\":734255653,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"dtuodocgq\"},{\"number\":1507075612,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"nyxpmqd\"}],\"publicIpAddress\":\"niiontqikdipkxs\"},{\"id\":\"kuzabrsoih\",\"ports\":[{\"number\":2034347915,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"dtacvs\"}],\"publicIpAddress\":\"ssxylsu\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"ohsjy\",\"ports\":[]},{\"id\":\"ehkxgfuzq\",\"ports\":[]},{\"id\":\"nzkwlxqdsxipdnl\",\"ports\":[]},{\"id\":\"yitfz\",\"ports\":[]}],\"startTimeUtc\":\"2021-05-13T20:51:59Z\",\"requestor\":\"wgzeylzpiimxa\",\"justification\":\"ktjoygynsixgzb\"},{\"virtualMachines\":[{\"id\":\"uglquarbruv\",\"ports\":[]},{\"id\":\"beyxwrmupzpexzbh\",\"ports\":[]},{\"id\":\"jajkvwkocxfbdzl\",\"ports\":[]},{\"id\":\"vnatbgvlpgf\",\"ports\":[]}],\"startTimeUtc\":\"2021-10-20T00:21Z\",\"requestor\":\"enfakybep\",\"justification\":\"hzq\"}],\"provisioningState\":\"oym\"},\"kind\":\"gl\",\"location\":\"sfgb\",\"id\":\"ytsazlycxlubr\",\"name\":\"khqbuoyrbdkgqd\",\"type\":\"vvvjmfjjfexuv\"}";

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

        JitNetworkAccessPolicy response
            = manager.jitNetworkAccessPolicies().define("quoqhqrcsk").withExistingLocation("y", "xuxc")
                .withVirtualMachines(Arrays.asList(
                    new JitNetworkAccessPolicyVirtualMachine().withId("qfhlrvuvd")
                        .withPorts(Arrays.asList(new JitNetworkAccessPortRule().withNumber(1879732701)
                            .withProtocol(Protocol.UDP).withMaxRequestAccessDuration("jcdpncvfyeqyo")))
                        .withPublicIpAddress("ijcsapqhipajs"),
                    new JitNetworkAccessPolicyVirtualMachine().withId("ivnmev")
                        .withPorts(Arrays.asList(new JitNetworkAccessPortRule().withNumber(721151203)
                            .withProtocol(Protocol.ASTERISK).withMaxRequestAccessDuration("uwrfgpjfvqwk")))
                        .withPublicIpAddress("odvlmdzgvcykzz")))
                .withKind("zadzglmuu")
                .withRequests(
                    Arrays.asList(new JitNetworkAccessRequestInner()
                        .withVirtualMachines(Arrays.asList(
                            new JitNetworkAccessRequestVirtualMachine().withId("yg").withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("bmum").withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("jvvcrsmwojm")
                                .withPorts(Arrays.asList()),
                            new JitNetworkAccessRequestVirtualMachine().withId("wcvumnrut").withPorts(Arrays.asList())))
                        .withStartTimeUtc(OffsetDateTime.parse("2021-11-01T06:31:34Z")).withRequestor("keqjftvltjop")
                        .withJustification("vpkbz")))
                .create();

        Assertions.assertEquals("gl", response.kind());
        Assertions.assertEquals("owxhyvdbrdv", response.virtualMachines().get(0).id());
        Assertions.assertEquals(818358311, response.virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.UDP, response.virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("btycvl", response.virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("vkymktcwmivoxgze", response.virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("ohsjy", response.requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-13T20:51:59Z"),
            response.requests().get(0).startTimeUtc());
        Assertions.assertEquals("wgzeylzpiimxa", response.requests().get(0).requestor());
        Assertions.assertEquals("ktjoygynsixgzb", response.requests().get(0).justification());
    }
}
