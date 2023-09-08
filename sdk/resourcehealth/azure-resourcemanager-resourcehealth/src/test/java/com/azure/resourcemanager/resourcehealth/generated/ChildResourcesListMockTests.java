// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.resourcehealth.ResourceHealthManager;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStateValues;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatus;
import com.azure.resourcemanager.resourcehealth.models.ReasonChronicityTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ChildResourcesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"id\":\"psvuoymgc\",\"name\":\"lvez\",\"type\":\"pqlmfe\",\"location\":\"erqwkyhkobopg\",\"properties\":{\"availabilityState\":\"Available\",\"title\":\"wep\",\"summary\":\"pc\",\"detailedStatus\":\"kbwcc\",\"reasonType\":\"jvcdwxlpqekf\",\"context\":\"khtj\",\"category\":\"i\",\"articleId\":\"wfqatmtd\",\"rootCauseAttributionTime\":\"2021-01-16T13:50:23Z\",\"healthEventType\":\"vypgikdg\",\"healthEventCause\":\"ywkbirryuzhlhkjo\",\"healthEventCategory\":\"vqqaatjinrvgo\",\"healthEventId\":\"mfiibfggj\",\"resolutionETA\":\"2021-04-08T04:20:38Z\",\"occuredTime\":\"2021-04-15T19:39:33Z\",\"reasonChronicity\":\"Persistent\",\"reportedTime\":\"2021-01-31T00:57:49Z\",\"recentlyResolved\":{\"unavailableOccuredTime\":\"2021-07-25T08:46:43Z\",\"resolvedTime\":\"2021-04-24T02:16:24Z\",\"unavailableSummary\":\"lqwjygvjayvblm\"},\"recommendedActions\":[],\"serviceImpactingEvents\":[]}}]}";

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

        ResourceHealthManager manager =
            ResourceHealthManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AvailabilityStatus> response =
            manager.childResources().list("kfxu", "emdwzrmuhapfc", "dpsqx", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("psvuoymgc", response.iterator().next().id());
        Assertions.assertEquals("lvez", response.iterator().next().name());
        Assertions.assertEquals("pqlmfe", response.iterator().next().type());
        Assertions.assertEquals("erqwkyhkobopg", response.iterator().next().location());
        Assertions
            .assertEquals(
                AvailabilityStateValues.AVAILABLE, response.iterator().next().properties().availabilityState());
        Assertions.assertEquals("wep", response.iterator().next().properties().title());
        Assertions.assertEquals("pc", response.iterator().next().properties().summary());
        Assertions.assertEquals("kbwcc", response.iterator().next().properties().detailedStatus());
        Assertions.assertEquals("jvcdwxlpqekf", response.iterator().next().properties().reasonType());
        Assertions.assertEquals("khtj", response.iterator().next().properties().context());
        Assertions.assertEquals("i", response.iterator().next().properties().category());
        Assertions.assertEquals("wfqatmtd", response.iterator().next().properties().articleId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-16T13:50:23Z"),
                response.iterator().next().properties().rootCauseAttributionTime());
        Assertions.assertEquals("vypgikdg", response.iterator().next().properties().healthEventType());
        Assertions.assertEquals("ywkbirryuzhlhkjo", response.iterator().next().properties().healthEventCause());
        Assertions.assertEquals("vqqaatjinrvgo", response.iterator().next().properties().healthEventCategory());
        Assertions.assertEquals("mfiibfggj", response.iterator().next().properties().healthEventId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-08T04:20:38Z"), response.iterator().next().properties().resolutionEta());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-15T19:39:33Z"), response.iterator().next().properties().occuredTime());
        Assertions
            .assertEquals(ReasonChronicityTypes.PERSISTENT, response.iterator().next().properties().reasonChronicity());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-31T00:57:49Z"), response.iterator().next().properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-25T08:46:43Z"),
                response.iterator().next().properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-24T02:16:24Z"),
                response.iterator().next().properties().recentlyResolved().resolvedTime());
        Assertions
            .assertEquals(
                "lqwjygvjayvblm", response.iterator().next().properties().recentlyResolved().unavailableSummary());
    }
}
