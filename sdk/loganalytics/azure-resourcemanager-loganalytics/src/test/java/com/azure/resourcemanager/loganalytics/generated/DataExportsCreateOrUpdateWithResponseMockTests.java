// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.DataExport;
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

public final class DataExportsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"dataExportId\":\"p\",\"tableNames\":[\"mxelnwcltyjed\",\"xxmlfmkqscazua\",\"xtzx\",\"uamwabzxrvxc\"],\"destination\":{\"resourceId\":\"hsphaivmxyas\",\"type\":\"EventHub\",\"metaData\":{\"eventHubName\":\"gzwywak\"}},\"enable\":false,\"createdDate\":\"nsmjbl\",\"lastModifiedDate\":\"jhlnymzotqyryu\"},\"id\":\"cbm\",\"name\":\"qvx\",\"type\":\"vwf\"}";

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

        LogAnalyticsManager manager =
            LogAnalyticsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DataExport response =
            manager
                .dataExports()
                .define("hv")
                .withExistingWorkspace("nzrdpsovwxz", "ptgoeiybbabp")
                .withDataExportId("kvntjlrigjkskyri")
                .withTableNames(Arrays.asList("vzidsxwaab", "mifrygznmma"))
                .withEnable(true)
                .withCreatedDate("wcrojphslhcaw")
                .withLastModifiedDate("tifdwfmvi")
                .withResourceId("izkzobgo")
                .withEventHubName("lnelxieixynl")
                .create();

        Assertions.assertEquals("p", response.dataExportId());
        Assertions.assertEquals("mxelnwcltyjed", response.tableNames().get(0));
        Assertions.assertEquals(false, response.enable());
        Assertions.assertEquals("nsmjbl", response.createdDate());
        Assertions.assertEquals("jhlnymzotqyryu", response.lastModifiedDate());
        Assertions.assertEquals("hsphaivmxyas", response.resourceId());
        Assertions.assertEquals("gzwywak", response.eventHubName());
    }
}
