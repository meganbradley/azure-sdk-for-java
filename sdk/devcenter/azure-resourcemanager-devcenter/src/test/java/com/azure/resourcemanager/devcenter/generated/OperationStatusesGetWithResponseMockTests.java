// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.OperationStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OperationStatusesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"resourceId\":\"swpchwahfbousn\",\"properties\":\"datapgfewetwlyx\",\"id\":\"cxy\",\"name\":\"hdjhlimmbcx\",\"status\":\"h\",\"percentComplete\":7.7078342,\"startTime\":\"2021-08-24T02:48:56Z\",\"endTime\":\"2021-10-20T00:41:29Z\",\"operations\":[{\"id\":\"zhqizxf\",\"name\":\"tgqscjavftjuh\",\"status\":\"qaz\",\"percentComplete\":94.31064,\"startTime\":\"2021-04-10T06:17:10Z\",\"endTime\":\"2021-04-29T03:21:08Z\",\"operations\":[]},{\"id\":\"ajc\",\"name\":\"m\",\"status\":\"ghfcfiwrxgkneuvy\",\"percentComplete\":68.88862,\"startTime\":\"2020-12-31T19:00:58Z\",\"endTime\":\"2021-01-06T09:47:23Z\",\"operations\":[]}]}";

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

        DevCenterManager manager =
            DevCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatus response =
            manager.operationStatuses().getWithResponse("wwnpj", "l", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("cxy", response.id());
        Assertions.assertEquals("hdjhlimmbcx", response.name());
        Assertions.assertEquals("h", response.status());
        Assertions.assertEquals(7.7078342F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-24T02:48:56Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-20T00:41:29Z"), response.endTime());
        Assertions.assertEquals("zhqizxf", response.operations().get(0).id());
        Assertions.assertEquals("tgqscjavftjuh", response.operations().get(0).name());
        Assertions.assertEquals("qaz", response.operations().get(0).status());
        Assertions.assertEquals(94.31064F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-10T06:17:10Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-29T03:21:08Z"), response.operations().get(0).endTime());
    }
}
