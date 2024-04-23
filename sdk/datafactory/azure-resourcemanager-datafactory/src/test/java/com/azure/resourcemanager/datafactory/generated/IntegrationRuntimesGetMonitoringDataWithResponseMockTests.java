// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeMonitoringData;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesGetMonitoringDataWithResponseMockTests {
    @Test
    public void testGetMonitoringDataWithResponse() throws Exception {
        String responseStr
            = "{\"name\":\"biszyi\",\"nodes\":[{\"nodeName\":\"jrirg\",\"availableMemoryInMB\":2026881904,\"cpuUtilization\":748969341,\"concurrentJobsLimit\":1141664737,\"concurrentJobsRunning\":216624483,\"maxConcurrentJobs\":1622921552,\"sentBytes\":36.65986,\"receivedBytes\":54.669308,\"\":{\"znuyczlyl\":\"datard\",\"uhkhnzsrgi\":\"datadrziaxigeos\",\"rlyscnbrwhsqtzg\":\"datavzepgljtuzqreprn\",\"x\":\"datafybryexhdigmgszz\"}},{\"nodeName\":\"unuus\",\"availableMemoryInMB\":1333665930,\"cpuUtilization\":536516435,\"concurrentJobsLimit\":872194362,\"concurrentJobsRunning\":158792225,\"maxConcurrentJobs\":460583114,\"sentBytes\":94.75602,\"receivedBytes\":89.53062,\"\":{\"sbzu\":\"datat\",\"rtsnclzyun\":\"datafranngwldymuehvv\",\"pxfhixaagvkwe\":\"dataoogagtjcmly\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationRuntimeMonitoringData response = manager.integrationRuntimes()
            .getMonitoringDataWithResponse("uiiorbtfarb", "arxyh", "ukc", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("biszyi", response.name());
    }
}
