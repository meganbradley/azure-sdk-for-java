// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.standbypool.StandbyPoolManager;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachineResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StandbyVirtualMachinesListByStandbyVirtualMachinePoolResourceMockTests {
    @Test
    public void testListByStandbyVirtualMachinePoolResource() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"virtualMachineResourceId\":\"nysounqe\",\"provisioningState\":\"Succeeded\"},\"id\":\"ae\",\"name\":\"pfhyhl\",\"type\":\"rpmopjmc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StandbyPoolManager manager = StandbyPoolManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<StandbyVirtualMachineResource> response = manager.standbyVirtualMachines()
            .listByStandbyVirtualMachinePoolResource("yyvxyqjpkcattpn", "jcrcczsqpjhvmda",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("nysounqe", response.iterator().next().properties().virtualMachineResourceId());
    }
}
