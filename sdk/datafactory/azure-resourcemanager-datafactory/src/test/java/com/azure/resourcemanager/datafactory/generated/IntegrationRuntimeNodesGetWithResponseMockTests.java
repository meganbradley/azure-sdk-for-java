// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeNode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimeNodesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"nodeName\":\"jxtzy\",\"machineName\":\"qmp\",\"hostServiceUri\":\"xiioasvykt\",\"status\":\"Limited\",\"capabilities\":{\"egqzqdcohsqufsy\":\"wjwl\",\"z\":\"hsnzsjoxuogyakex\",\"nbmngstvnkshaul\":\"lh\",\"oqyin\":\"tvlyl\"},\"versionStatus\":\"gxncoaiyflvvmd\",\"version\":\"ytaocxak\",\"registerTime\":\"2021-02-13T13:27:18Z\",\"lastConnectTime\":\"2021-11-19T07:48:54Z\",\"expiryTime\":\"2021-11-08T15:41:18Z\",\"lastStartTime\":\"2021-10-24T21:52:16Z\",\"lastStopTime\":\"2021-04-19T16:57:35Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-06-01T19:59:49Z\",\"lastEndUpdateTime\":\"2021-06-04T07:00:41Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":482006335,\"maxConcurrentJobs\":2014408540,\"\":{\"vgusfrkjfrtauf\":\"datalrwwmukx\",\"qmjodvknxj\":\"dataxxvzqin\",\"fqodc\":\"datattkhmhquca\"}}";

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

        DataFactoryManager manager = DataFactoryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        SelfHostedIntegrationRuntimeNode response = manager.integrationRuntimeNodes()
            .getWithResponse("dsygdzzufr", "ewqwdglmfsjpl", "dhzltmywy", "fuovkgqtzg", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
