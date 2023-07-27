// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.models.Autoscale;
import com.azure.resourcemanager.hdinsight.models.AutoscaleCapacity;
import com.azure.resourcemanager.hdinsight.models.AutoscaleConfigurationUpdateParameter;
import com.azure.resourcemanager.hdinsight.models.AutoscaleRecurrence;
import com.azure.resourcemanager.hdinsight.models.AutoscaleSchedule;
import com.azure.resourcemanager.hdinsight.models.AutoscaleTimeAndCapacity;
import com.azure.resourcemanager.hdinsight.models.DaysOfWeek;
import com.azure.resourcemanager.hdinsight.models.RoleName;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClustersUpdateAutoScaleConfigurationMockTests {
    @Test
    public void testUpdateAutoScaleConfiguration() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr = "{}";

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

        HDInsightManager manager =
            HDInsightManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        manager
            .clusters()
            .updateAutoScaleConfiguration(
                "dtvqe",
                "rqctmxxdtdd",
                RoleName.WORKERNODE,
                new AutoscaleConfigurationUpdateParameter()
                    .withAutoscale(
                        new Autoscale()
                            .withCapacity(
                                new AutoscaleCapacity()
                                    .withMinInstanceCount(1948227960)
                                    .withMaxInstanceCount(1691518178))
                            .withRecurrence(
                                new AutoscaleRecurrence()
                                    .withTimeZone("tznapxbannovv")
                                    .withSchedule(
                                        Arrays
                                            .asList(
                                                new AutoscaleSchedule()
                                                    .withDays(
                                                        Arrays
                                                            .asList(
                                                                DaysOfWeek.FRIDAY,
                                                                DaysOfWeek.SATURDAY,
                                                                DaysOfWeek.SATURDAY))
                                                    .withTimeAndCapacity(new AutoscaleTimeAndCapacity()),
                                                new AutoscaleSchedule()
                                                    .withDays(
                                                        Arrays
                                                            .asList(
                                                                DaysOfWeek.WEDNESDAY,
                                                                DaysOfWeek.SUNDAY,
                                                                DaysOfWeek.MONDAY,
                                                                DaysOfWeek.SATURDAY))
                                                    .withTimeAndCapacity(new AutoscaleTimeAndCapacity()))))),
                com.azure.core.util.Context.NONE);
    }
}
