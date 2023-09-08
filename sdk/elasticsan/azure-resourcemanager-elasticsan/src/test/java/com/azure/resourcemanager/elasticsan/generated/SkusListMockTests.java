// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.SkuInformation;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SkusListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"name\":\"Premium_ZRS\",\"tier\":\"Premium\",\"resourceType\":\"fbjfdtwssotftpvj\",\"locations\":[\"xilzznf\",\"q\",\"vwpm\",\"taruoujmkcj\"],\"locationInfo\":[{\"location\":\"tjrybnwjewgdr\",\"zones\":[\"vnaenqpehindoyg\",\"ifthnz\",\"ndslgnayqigynduh\"]},{\"location\":\"hqlkthumaqo\",\"zones\":[\"ycduier\",\"gccymvaolpssl\"]},{\"location\":\"fmmdnbbg\",\"zones\":[\"swiydmcwyhzdx\",\"sadbz\",\"nvdfznuda\"]},{\"location\":\"vxzbncb\",\"zones\":[\"pstdbhhxsrzd\",\"ucerscdntnevfi\",\"jmygtdsslswtmwer\",\"ofz\"]}],\"capabilities\":[{\"name\":\"emwabnet\",\"value\":\"hszhedplvwiwu\"},{\"name\":\"wmbesldnkw\",\"value\":\"pp\"},{\"name\":\"lcxog\",\"value\":\"konzmnsik\"}]}]}";

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

        ElasticSanManager manager =
            ElasticSanManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SkuInformation> response = manager.skus().list("ubcgjbirxb", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(SkuName.PREMIUM_ZRS, response.iterator().next().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.iterator().next().tier());
    }
}
