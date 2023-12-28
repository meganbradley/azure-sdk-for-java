// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.DiagnosticContract;
import com.azure.resourcemanager.apimanagement.models.HttpCorrelationProtocol;
import com.azure.resourcemanager.apimanagement.models.OperationNameFormat;
import com.azure.resourcemanager.apimanagement.models.SamplingType;
import com.azure.resourcemanager.apimanagement.models.Verbosity;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ApiDiagnosticsListByServiceMockTests {
    @Test
    public void testListByService() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"alwaysLog\":\"allErrors\",\"loggerId\":\"tvudeylpbybki\",\"sampling\":{\"samplingType\":\"fixed\",\"percentage\":16.235122034861682},\"frontend\":{\"request\":{\"headers\":[\"dj\",\"au\",\"fshznu\",\"ttuhaaax\"],\"body\":{\"bytes\":487545221},\"dataMasking\":{\"queryParams\":[{},{},{}],\"headers\":[{}]}},\"response\":{\"headers\":[\"rmbecx\",\"towagehxu\",\"hwesrtja\"],\"body\":{\"bytes\":1206184930},\"dataMasking\":{\"queryParams\":[{},{},{}],\"headers\":[{},{}]}}},\"backend\":{\"request\":{\"headers\":[\"vspsaneyvae\",\"piobnhrfbrjokjwq\",\"mraqnilppqcaig\"],\"body\":{\"bytes\":1770516064},\"dataMasking\":{\"queryParams\":[{}],\"headers\":[{},{},{},{}]}},\"response\":{\"headers\":[\"zseodtqfdrslzymq\"],\"body\":{\"bytes\":1075713452},\"dataMasking\":{\"queryParams\":[{},{}],\"headers\":[{},{},{}]}}},\"logClientIp\":true,\"httpCorrelationProtocol\":\"Legacy\",\"verbosity\":\"verbose\",\"operationNameFormat\":\"Url\",\"metrics\":false},\"id\":\"wneqjxzizebjr\",\"name\":\"hgd\",\"type\":\"tubwggxzsshxli\"}]}";

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

        ApiManagementManager manager =
            ApiManagementManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DiagnosticContract> response =
            manager
                .apiDiagnostics()
                .listByService(
                    "uzjd",
                    "rgyzcslazp",
                    "kqoyimxpggk",
                    "teagbgac",
                    491443006,
                    1845023161,
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals(AlwaysLog.ALL_ERRORS, response.iterator().next().alwaysLog());
        Assertions.assertEquals("tvudeylpbybki", response.iterator().next().loggerId());
        Assertions.assertEquals(SamplingType.FIXED, response.iterator().next().sampling().samplingType());
        Assertions.assertEquals(16.235122034861682D, response.iterator().next().sampling().percentage());
        Assertions.assertEquals("dj", response.iterator().next().frontend().request().headers().get(0));
        Assertions.assertEquals(487545221, response.iterator().next().frontend().request().body().bytes());
        Assertions.assertEquals("rmbecx", response.iterator().next().frontend().response().headers().get(0));
        Assertions.assertEquals(1206184930, response.iterator().next().frontend().response().body().bytes());
        Assertions.assertEquals("vspsaneyvae", response.iterator().next().backend().request().headers().get(0));
        Assertions.assertEquals(1770516064, response.iterator().next().backend().request().body().bytes());
        Assertions.assertEquals("zseodtqfdrslzymq", response.iterator().next().backend().response().headers().get(0));
        Assertions.assertEquals(1075713452, response.iterator().next().backend().response().body().bytes());
        Assertions.assertEquals(true, response.iterator().next().logClientIp());
        Assertions.assertEquals(HttpCorrelationProtocol.LEGACY, response.iterator().next().httpCorrelationProtocol());
        Assertions.assertEquals(Verbosity.VERBOSE, response.iterator().next().verbosity());
        Assertions.assertEquals(OperationNameFormat.URL, response.iterator().next().operationNameFormat());
        Assertions.assertEquals(false, response.iterator().next().metrics());
    }
}
