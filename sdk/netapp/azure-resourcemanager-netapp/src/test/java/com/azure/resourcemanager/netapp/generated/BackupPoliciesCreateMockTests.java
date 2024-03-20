// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.BackupPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupPoliciesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"etag\":\"zinkfkbgbzbowxeq\",\"properties\":{\"backupPolicyId\":\"ljmygvkzqkjjeokb\",\"provisioningState\":\"Succeeded\",\"dailyBackupsToKeep\":1829804009,\"weeklyBackupsToKeep\":1049990644,\"monthlyBackupsToKeep\":1442604370,\"volumesAssigned\":1208921361,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"wvz\",\"backupsCount\":765217570,\"policyEnabled\":true},{\"volumeName\":\"bzdixzmq\",\"backupsCount\":1928163279,\"policyEnabled\":false}]},\"location\":\"opqhewjptmc\",\"tags\":{\"mzlbiojlvfhrb\":\"ostzelndlatu\",\"qvcww\":\"pn\"},\"id\":\"yurmochpprprs\",\"name\":\"mo\",\"type\":\"ayzejnhlbkpbz\"}";

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

        NetAppFilesManager manager = NetAppFilesManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        BackupPolicy response = manager.backupPolicies().define("asiibmiybnnust").withRegion("nzcyjtotp")
            .withExistingNetAppAccount("ciqdsme", "iitdfuxt")
            .withTags(mapOf("ihed", "vpbdbzqgq", "mkyi", "vqwt", "qcwdhoh", "cysihs", "sufco", "dtmcd"))
            .withDailyBackupsToKeep(677853893).withWeeklyBackupsToKeep(915134983).withMonthlyBackupsToKeep(1400929714)
            .withEnabled(true).create();

        Assertions.assertEquals("opqhewjptmc", response.location());
        Assertions.assertEquals("ostzelndlatu", response.tags().get("mzlbiojlvfhrb"));
        Assertions.assertEquals(1829804009, response.dailyBackupsToKeep());
        Assertions.assertEquals(1049990644, response.weeklyBackupsToKeep());
        Assertions.assertEquals(1442604370, response.monthlyBackupsToKeep());
        Assertions.assertEquals(false, response.enabled());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
