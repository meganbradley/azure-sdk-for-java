// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleSetDefinition;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagedRuleSetsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"sttex\",\"ruleSetId\":\"qpwcyyufmh\",\"ruleSetType\":\"nc\",\"ruleSetVersion\":\"mqspkcdqzhlctdd\",\"ruleGroups\":[{\"ruleGroupName\":\"dyfpchrqbnj\",\"description\":\"cgegydcwbo\",\"rules\":[{}]}]},\"location\":\"mvqqolih\",\"tags\":{\"oq\":\"iouaubrjt\",\"rzpasccbiuimzdly\":\"fuojrngif\",\"fdvruz\":\"dfqwmkyoq\"},\"id\":\"lzo\",\"name\":\"hpc\",\"type\":\"fnmdxotn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FrontDoorManager manager = FrontDoorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ManagedRuleSetDefinition> response
            = manager.managedRuleSets().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mvqqolih", response.iterator().next().location());
        Assertions.assertEquals("iouaubrjt", response.iterator().next().tags().get("oq"));
    }
}
