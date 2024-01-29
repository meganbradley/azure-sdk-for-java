// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogFile;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LogFilesListByServerMockTests {
    @Test
    public void testListByServer() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"createdTime\":\"2021-01-27T17:32:35Z\",\"lastModifiedTime\":\"2021-06-20T11:11:29Z\",\"sizeInKb\":9045199994794616944,\"type\":\"llndnpd\",\"url\":\"pqafgfugsnnfhy\"},\"id\":\"efy\",\"name\":\"oc\",\"type\":\"ctfjgtixr\"}]}";

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

        PostgreSqlManager manager = PostgreSqlManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LogFile> response
            = manager.logFiles().listByServer("obkauxofsh", "phwpnulaiywzej", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-01-27T17:32:35Z"), response.iterator().next().createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T11:11:29Z"),
            response.iterator().next().lastModifiedTime());
        Assertions.assertEquals(9045199994794616944L, response.iterator().next().sizeInKb());
        Assertions.assertEquals("llndnpd", response.iterator().next().typePropertiesType());
        Assertions.assertEquals("pqafgfugsnnfhy", response.iterator().next().url());
    }
}
