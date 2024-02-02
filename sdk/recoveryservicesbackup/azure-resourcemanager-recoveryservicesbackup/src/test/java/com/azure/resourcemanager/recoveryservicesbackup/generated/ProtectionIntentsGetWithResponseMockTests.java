// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntentResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProtectionIntentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"protectionIntentItemType\":\"ProtectionIntent\",\"backupManagementType\":\"DefaultBackup\",\"sourceResourceId\":\"qxucycijoc\",\"itemId\":\"iutgj\",\"policyId\":\"z\",\"protectionState\":\"ProtectionFailed\"},\"eTag\":\"nrqjbtxjea\",\"location\":\"qaqbz\",\"tags\":{\"e\":\"fwwvuatbwbqam\"},\"id\":\"liys\",\"name\":\"pkcvmwf\",\"type\":\"uxx\"}";

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

        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProtectionIntentResource response = manager.protectionIntents().getWithResponse("mtbdrvcqgu", "fzhompheq",
            "urelyujlfyoump", "kyeclcdigpta", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("qaqbz", response.location());
        Assertions.assertEquals("fwwvuatbwbqam", response.tags().get("e"));
        Assertions.assertEquals(BackupManagementType.DEFAULT_BACKUP, response.properties().backupManagementType());
        Assertions.assertEquals("qxucycijoc", response.properties().sourceResourceId());
        Assertions.assertEquals("iutgj", response.properties().itemId());
        Assertions.assertEquals("z", response.properties().policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, response.properties().protectionState());
        Assertions.assertEquals("nrqjbtxjea", response.etag());
    }
}
