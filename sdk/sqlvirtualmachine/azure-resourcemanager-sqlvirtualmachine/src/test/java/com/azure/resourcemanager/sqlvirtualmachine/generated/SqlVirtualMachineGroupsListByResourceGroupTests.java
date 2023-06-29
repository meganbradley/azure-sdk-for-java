// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager;
import com.azure.resourcemanager.sqlvirtualmachine.models.ClusterSubnetType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachineGroup;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVmGroupImageSku;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SqlVirtualMachineGroupsListByResourceGroupTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"rmclfplphoxu\",\"sqlImageOffer\":\"rpabg\",\"sqlImageSku\":\"Developer\",\"scaleType\":\"HA\",\"clusterManagerType\":\"WSFC\",\"clusterConfiguration\":\"Domainful\",\"wsfcDomainProfile\":{\"domainFqdn\":\"gxywpmue\",\"ouPath\":\"jzwf\",\"clusterBootstrapAccount\":\"q\",\"clusterOperatorAccount\":\"ids\",\"sqlServiceAccount\":\"onobglaocqx\",\"fileShareWitnessPath\":\"cmgyud\",\"storageAccountUrl\":\"tlmoyrx\",\"storageAccountPrimaryKey\":\"fakeStorageAccountPrimaryKeyPlaceholder\",\"clusterSubnetType\":\"SingleSubnet\"}},\"location\":\"hl\",\"tags\":{\"kfrlhrxsbky\":\"bh\",\"afkuwb\":\"pycanuzbpz\",\"ehhseyvjusrts\":\"rnwb\"},\"id\":\"hspkdeemao\",\"name\":\"mx\",\"type\":\"gkvtmelmqkrhah\"}]}";

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

        SqlVirtualMachineManager manager =
            SqlVirtualMachineManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SqlVirtualMachineGroup> response =
            manager.sqlVirtualMachineGroups().listByResourceGroup("kphywpnvjto", Context.NONE);

        Assertions.assertEquals("hl", response.iterator().next().location());
        Assertions.assertEquals("bh", response.iterator().next().tags().get("kfrlhrxsbky"));
        Assertions.assertEquals("rpabg", response.iterator().next().sqlImageOffer());
        Assertions.assertEquals(SqlVmGroupImageSku.DEVELOPER, response.iterator().next().sqlImageSku());
        Assertions.assertEquals("gxywpmue", response.iterator().next().wsfcDomainProfile().domainFqdn());
        Assertions.assertEquals("jzwf", response.iterator().next().wsfcDomainProfile().ouPath());
        Assertions.assertEquals("q", response.iterator().next().wsfcDomainProfile().clusterBootstrapAccount());
        Assertions.assertEquals("ids", response.iterator().next().wsfcDomainProfile().clusterOperatorAccount());
        Assertions.assertEquals("onobglaocqx", response.iterator().next().wsfcDomainProfile().sqlServiceAccount());
        Assertions.assertEquals("cmgyud", response.iterator().next().wsfcDomainProfile().fileShareWitnessPath());
        Assertions.assertEquals("tlmoyrx", response.iterator().next().wsfcDomainProfile().storageAccountUrl());
        Assertions.assertEquals("fakeStorageAccountPrimaryKeyPlaceholder", response.iterator().next().wsfcDomainProfile().storageAccountPrimaryKey());
        Assertions
            .assertEquals(
                ClusterSubnetType.SINGLE_SUBNET, response.iterator().next().wsfcDomainProfile().clusterSubnetType());
    }
}