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
import com.azure.resourcemanager.loganalytics.models.SearchGetSchemaResponse;
import com.azure.resourcemanager.loganalytics.models.SearchSortEnum;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SchemasGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"metadata\":{\"requestId\":\"lg\",\"resultType\":\"txd\",\"total\":7982443333722102241,\"top\":2221953429879798985,\"id\":\"zvlnsnnjz\",\"coreSummaries\":[{\"status\":\"olpy\",\"numberOfDocuments\":117086894031994632},{\"status\":\"xqzragp\",\"numberOfDocuments\":5124334742263421163},{\"status\":\"t\",\"numberOfDocuments\":5064204054792112038},{\"status\":\"a\",\"numberOfDocuments\":1817616718311848555}],\"status\":\"jchcsrlzknmzla\",\"startTime\":\"2021-01-20T21:47:05Z\",\"lastUpdated\":\"2021-11-08T10:57:25Z\",\"eTag\":\"vnphc\",\"sort\":[{\"name\":\"pjhmqrhvthl\",\"order\":\"desc\"}],\"requestTime\":1106480050332233961,\"aggregatedValueField\":\"mlzzhzdtxetlgyd\",\"aggregatedGroupingFields\":\"qvlnnpxybafiqgea\",\"sum\":3246800772078835427,\"max\":7730272397217059241,\"schema\":{\"name\":\"klbyulidwcw\",\"version\":1795651624}},\"value\":[{\"name\":\"o\",\"displayName\":\"hj\",\"type\":\"wgdnqzbr\",\"indexed\":true,\"stored\":true,\"facet\":false,\"ownerType\":[\"zmtksjci\",\"digsxcdgl\"]}]}";

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

        SearchGetSchemaResponse response =
            manager.schemas().getWithResponse("cdxfzzzwyjafitl", "guyn", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("lg", response.metadata().searchId());
        Assertions.assertEquals("txd", response.metadata().resultType());
        Assertions.assertEquals(7982443333722102241L, response.metadata().total());
        Assertions.assertEquals(2221953429879798985L, response.metadata().top());
        Assertions.assertEquals("zvlnsnnjz", response.metadata().id());
        Assertions.assertEquals("olpy", response.metadata().coreSummaries().get(0).status());
        Assertions.assertEquals(117086894031994632L, response.metadata().coreSummaries().get(0).numberOfDocuments());
        Assertions.assertEquals("jchcsrlzknmzla", response.metadata().status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-20T21:47:05Z"), response.metadata().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-08T10:57:25Z"), response.metadata().lastUpdated());
        Assertions.assertEquals("vnphc", response.metadata().etag());
        Assertions.assertEquals("pjhmqrhvthl", response.metadata().sort().get(0).name());
        Assertions.assertEquals(SearchSortEnum.DESC, response.metadata().sort().get(0).order());
        Assertions.assertEquals(1106480050332233961L, response.metadata().requestTime());
        Assertions.assertEquals("mlzzhzdtxetlgyd", response.metadata().aggregatedValueField());
        Assertions.assertEquals("qvlnnpxybafiqgea", response.metadata().aggregatedGroupingFields());
        Assertions.assertEquals(3246800772078835427L, response.metadata().sum());
        Assertions.assertEquals(7730272397217059241L, response.metadata().max());
        Assertions.assertEquals("klbyulidwcw", response.metadata().schema().name());
        Assertions.assertEquals(1795651624, response.metadata().schema().version());
        Assertions.assertEquals("o", response.value().get(0).name());
        Assertions.assertEquals("hj", response.value().get(0).displayName());
        Assertions.assertEquals("wgdnqzbr", response.value().get(0).type());
        Assertions.assertEquals(true, response.value().get(0).indexed());
        Assertions.assertEquals(true, response.value().get(0).stored());
        Assertions.assertEquals(false, response.value().get(0).facet());
        Assertions.assertEquals("zmtksjci", response.value().get(0).ownerType().get(0));
    }
}
