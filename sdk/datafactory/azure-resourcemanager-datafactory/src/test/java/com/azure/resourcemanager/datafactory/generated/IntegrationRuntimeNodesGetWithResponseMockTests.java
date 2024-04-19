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
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeNode;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimeNodesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"nodeName\":\"nwafjibaq\",\"machineName\":\"tdije\",\"hostServiceUri\":\"xrrmnoxjwl\",\"status\":\"NeedRegistration\",\"capabilities\":{\"l\":\"zvvidokvzqeadk\",\"tvtpw\":\"rcxvoltjyzolnqk\",\"qpl\":\"mmyaoegh\",\"hewcevpmt\":\"y\"},\"versionStatus\":\"dfpgsoje\",\"version\":\"jnlvcgar\",\"registerTime\":\"2021-02-19T07:29:51Z\",\"lastConnectTime\":\"2021-07-10T06:20:08Z\",\"expiryTime\":\"2021-02-04T14:24:28Z\",\"lastStartTime\":\"2021-01-08T18:44:26Z\",\"lastStopTime\":\"2021-09-02T20:47:22Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-12-03T17:37:13Z\",\"lastEndUpdateTime\":\"2021-06-09T07:55:39Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":671274453,\"maxConcurrentJobs\":684366978,\"\":{\"d\":\"datatonovveouwixte\",\"qtpbb\":\"dataqprhzsaquha\",\"jlynlrjoydzmbvs\":\"dataicteq\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SelfHostedIntegrationRuntimeNode response = manager.integrationRuntimeNodes()
            .getWithResponse("ii", "jkiajokjuehcryww", "ns", "rcj", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
