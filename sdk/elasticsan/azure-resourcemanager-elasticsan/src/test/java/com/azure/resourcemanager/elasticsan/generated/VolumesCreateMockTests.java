// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.ManagedByInfo;
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import com.azure.resourcemanager.elasticsan.models.Volume;
import com.azure.resourcemanager.elasticsan.models.VolumeCreateOption;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VolumesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"volumeId\":\"cslfaoqzpiyylha\",\"creationData\":{\"createSource\":\"Disk\",\"sourceId\":\"ccsphkaivwi\"},\"sizeGiB\":6296560984353845801,\"storageTarget\":{\"targetIqn\":\"wuggwolu\",\"targetPortalHostname\":\"zbwemh\",\"targetPortalPort\":200585156,\"provisioningState\":\"Succeeded\",\"status\":\"Unknown\"},\"managedBy\":{\"resourceId\":\"wmsweypqwd\"},\"provisioningState\":\"Succeeded\"},\"id\":\"cccnxqhuexmktt\",\"name\":\"stvlzywemhzrnc\",\"type\":\"dtclusiypb\"}";

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

        ElasticSanManager manager =
            ElasticSanManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Volume response =
            manager
                .volumes()
                .define("tdlmkkzevd")
                .withExistingVolumegroup("yznkby", "utwpfhp", "gmhrskdsnfdsdoak")
                .withSizeGiB(549663298591756993L)
                .withCreationData(
                    new SourceCreationData()
                        .withCreateSource(VolumeCreateOption.DISK_SNAPSHOT)
                        .withSourceId("ngqqmoakuf"))
                .withManagedBy(new ManagedByInfo().withResourceId("oyuhhziui"))
                .create();

        Assertions.assertEquals(VolumeCreateOption.DISK, response.creationData().createSource());
        Assertions.assertEquals("ccsphkaivwi", response.creationData().sourceId());
        Assertions.assertEquals(6296560984353845801L, response.sizeGiB());
        Assertions.assertEquals("wmsweypqwd", response.managedBy().resourceId());
    }
}
