// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupAndExportRequest;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupAndExportResponse;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupFormat;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupSettings;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupStoreDetails;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupAndExportsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"status\":\"Failed\",\"startTime\":\"2021-05-12T14:09:32Z\",\"endTime\":\"2021-06-10T19:37:21Z\",\"percentComplete\":85.74714071493332,\"properties\":{\"datasourceSizeInBytes\":6987699562222584934,\"dataTransferredInBytes\":4063358469478582470,\"backupMetadata\":\"bpbewtghfgb\"},\"id\":\"gw\",\"name\":\"zvlvqhjkbegib\",\"type\":\"nmxiebwwaloayqc\"}";

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

        MySqlManager manager =
            MySqlManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        BackupAndExportResponse response =
            manager
                .backupAndExports()
                .create(
                    "xujznbmpowu",
                    "przqlveu",
                    new BackupAndExportRequest()
                        .withBackupSettings(
                            new BackupSettings().withBackupName("lupj").withBackupFormat(BackupFormat.COLLATED_FORMAT))
                        .withTargetDetails(new BackupStoreDetails()),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals(OperationStatus.FAILED, response.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-12T14:09:32Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-10T19:37:21Z"), response.endTime());
        Assertions.assertEquals(85.74714071493332D, response.percentComplete());
        Assertions.assertEquals(6987699562222584934L, response.datasourceSizeInBytes());
        Assertions.assertEquals(4063358469478582470L, response.dataTransferredInBytes());
        Assertions.assertEquals("bpbewtghfgb", response.backupMetadata());
    }
}
