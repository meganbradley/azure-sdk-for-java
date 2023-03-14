// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager;
import com.azure.resourcemanager.redisenterprise.models.Cluster;
import com.azure.resourcemanager.redisenterprise.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.redisenterprise.models.SkuName;
import com.azure.resourcemanager.redisenterprise.models.TlsVersion;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class RedisEnterprisesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"Enterprise_E10\",\"capacity\":68854326},\"zones\":[\"qkkrb\",\"pukgriwflzlfb\"],\"identity\":{\"principalId\":\"683484b8-3815-4216-b15f-8cc6b7d760ea\",\"tenantId\":\"71074008-1763-479c-99f8-60b7331876a2\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"minimumTlsVersion\":\"1.2\",\"encryption\":{},\"hostName\":\"ahmgkbrp\",\"provisioningState\":\"Canceled\",\"resourceState\":\"Enabling\",\"redisVersion\":\"nuqqkpikadrgvt\",\"privateEndpointConnections\":[]},\"location\":\"buynhijggm\",\"tags\":{\"zzmhjrunmpxttd\":\"siarbutrcvpn\",\"nbtkcxywnytnr\":\"hrbnlankxmyskpbh\",\"qidybyx\":\"yn\"},\"id\":\"zfcl\",\"name\":\"aaxdbabphlwrq\",\"type\":\"fkts\"}";

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

        RedisEnterpriseManager manager =
            RedisEnterpriseManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Cluster response =
            manager
                .redisEnterprises()
                .getByResourceGroupWithResponse("fsm", "nehmpvecx", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("buynhijggm", response.location());
        Assertions.assertEquals("siarbutrcvpn", response.tags().get("zzmhjrunmpxttd"));
        Assertions.assertEquals(SkuName.ENTERPRISE_E10, response.sku().name());
        Assertions.assertEquals(68854326, response.sku().capacity());
        Assertions.assertEquals("qkkrb", response.zones().get(0));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(TlsVersion.ONE_TWO, response.minimumTlsVersion());
    }
}
