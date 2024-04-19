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
import com.azure.resourcemanager.standbypool.models.RefillPolicy;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPoolResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StandbyContainerGroupPoolsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":8016442937915577150,\"refillPolicy\":\"always\"},\"containerGroupProperties\":{\"containerGroupProfile\":{\"id\":\"ukgjnpiucgygevq\",\"revision\":8593387531235795839},\"subnetIds\":[{\"id\":\"rbpizc\"},{\"id\":\"r\"},{\"id\":\"j\"}]},\"provisioningState\":\"Succeeded\"},\"location\":\"dnfyhxdeoejzicwi\",\"tags\":{\"cbkhajdeyeamdph\":\"ttgzfbis\",\"lpbuxwgipwhonowk\":\"g\"},\"id\":\"shwankixzbinje\",\"name\":\"uttmrywnuzoqft\",\"type\":\"yqzrnkcqvyxlw\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StandbyPoolManager manager = StandbyPoolManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<StandbyContainerGroupPoolResource> response
            = manager.standbyContainerGroupPools().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dnfyhxdeoejzicwi", response.iterator().next().location());
        Assertions.assertEquals("ttgzfbis", response.iterator().next().tags().get("cbkhajdeyeamdph"));
        Assertions.assertEquals(8016442937915577150L,
            response.iterator().next().properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(RefillPolicy.ALWAYS,
            response.iterator().next().properties().elasticityProfile().refillPolicy());
        Assertions.assertEquals("ukgjnpiucgygevq",
            response.iterator().next().properties().containerGroupProperties().containerGroupProfile().id());
        Assertions.assertEquals(8593387531235795839L,
            response.iterator().next().properties().containerGroupProperties().containerGroupProfile().revision());
        Assertions.assertEquals("rbpizc",
            response.iterator().next().properties().containerGroupProperties().subnetIds().get(0).id());
    }
}
