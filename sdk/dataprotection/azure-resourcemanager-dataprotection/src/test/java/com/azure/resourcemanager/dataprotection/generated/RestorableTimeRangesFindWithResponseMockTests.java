// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequest;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesResponseResource;
import com.azure.resourcemanager.dataprotection.models.RestoreSourceDataStoreType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class RestorableTimeRangesFindWithResponseMockTests {
    @Test
    public void testFindWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"restorableTimeRanges\":[{\"startTime\":\"ilrmcaykggnox\",\"endTime\":\"ztrksxwpndf\",\"objectType\":\"fnznth\"}],\"objectType\":\"wkjaos\"},\"id\":\"uzvoamktcqiosm\",\"name\":\"bzahgxqd\",\"type\":\"yrtltlaprltzkat\"}";

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

        DataProtectionManager manager =
            DataProtectionManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AzureBackupFindRestorableTimeRangesResponseResource response =
            manager
                .restorableTimeRanges()
                .findWithResponse(
                    "ltsxoatf",
                    "g",
                    "pnpbswveflocc",
                    new AzureBackupFindRestorableTimeRangesRequest()
                        .withSourceDataStoreType(RestoreSourceDataStoreType.OPERATIONAL_STORE)
                        .withStartTime("ozihmipgawt")
                        .withEndTime("pkyjcxcjxgrytfm"),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("ilrmcaykggnox", response.properties().restorableTimeRanges().get(0).startTime());
        Assertions.assertEquals("ztrksxwpndf", response.properties().restorableTimeRanges().get(0).endTime());
        Assertions.assertEquals("fnznth", response.properties().restorableTimeRanges().get(0).objectType());
        Assertions.assertEquals("wkjaos", response.properties().objectType());
    }
}
