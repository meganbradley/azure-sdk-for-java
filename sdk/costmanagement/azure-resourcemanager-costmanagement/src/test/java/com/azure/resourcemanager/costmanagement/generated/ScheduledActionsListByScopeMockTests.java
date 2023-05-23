// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.models.ScheduleFrequency;
import com.azure.resourcemanager.costmanagement.models.ScheduledAction;
import com.azure.resourcemanager.costmanagement.models.ScheduledActionKind;
import com.azure.resourcemanager.costmanagement.models.ScheduledActionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ScheduledActionsListByScopeMockTests {
    @Test
    public void testListByScope() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"displayName\":\"riypoqeyhlqhyk\",\"fileDestination\":{\"fileFormats\":[]},\"notification\":{\"to\":[],\"language\":\"yznuciqd\",\"message\":\"ex\",\"regionalFormat\":\"tdfuxt\",\"subject\":\"asiibmiybnnust\"},\"notificationEmail\":\"ljhnmgixhcmav\",\"schedule\":{\"frequency\":\"Daily\",\"hourOfDay\":657372547,\"daysOfWeek\":[],\"weeksOfMonth\":[],\"dayOfMonth\":710073444,\"startDate\":\"2021-01-01T14:05:45Z\",\"endDate\":\"2021-04-26T01:10:25Z\"},\"scope\":\"yyprotwyp\",\"status\":\"Expired\",\"viewId\":\"d\"},\"eTag\":\"xhugcm\",\"kind\":\"Email\",\"id\":\"lgorb\",\"name\":\"ftpmdtzfjltfv\",\"type\":\"zcyjtot\"}]}";

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

        CostManagementManager manager =
            CostManagementManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ScheduledAction> response =
            manager.scheduledActions().listByScope("aoqltfaey", "inmfgvxirp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(ScheduledActionKind.EMAIL, response.iterator().next().kind());
        Assertions.assertEquals("riypoqeyhlqhyk", response.iterator().next().displayName());
        Assertions.assertEquals("yznuciqd", response.iterator().next().notification().language());
        Assertions.assertEquals("ex", response.iterator().next().notification().message());
        Assertions.assertEquals("tdfuxt", response.iterator().next().notification().regionalFormat());
        Assertions.assertEquals("asiibmiybnnust", response.iterator().next().notification().subject());
        Assertions.assertEquals("ljhnmgixhcmav", response.iterator().next().notificationEmail());
        Assertions.assertEquals(ScheduleFrequency.DAILY, response.iterator().next().schedule().frequency());
        Assertions.assertEquals(657372547, response.iterator().next().schedule().hourOfDay());
        Assertions.assertEquals(710073444, response.iterator().next().schedule().dayOfMonth());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-01T14:05:45Z"), response.iterator().next().schedule().startDate());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-26T01:10:25Z"), response.iterator().next().schedule().endDate());
        Assertions.assertEquals("yyprotwyp", response.iterator().next().scope());
        Assertions.assertEquals(ScheduledActionStatus.EXPIRED, response.iterator().next().status());
        Assertions.assertEquals("d", response.iterator().next().viewId());
    }
}
