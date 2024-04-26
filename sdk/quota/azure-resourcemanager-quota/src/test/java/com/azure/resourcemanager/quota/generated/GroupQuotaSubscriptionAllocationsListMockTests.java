// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.quota.QuotaManager;
import com.azure.resourcemanager.quota.models.SubscriptionQuotaAllocations;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GroupQuotaSubscriptionAllocationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"region\":\"enwash\",\"limit\":7707312982236790783,\"shareableQuota\":5267748012493523201,\"name\":{\"value\":\"wbpokulpiujwaasi\",\"localizedValue\":\"i\"}},\"id\":\"byuqerpqlp\",\"name\":\"wcciuqgbdbu\",\"type\":\"auvfbtkuwhhmhyk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        QuotaManager manager = QuotaManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SubscriptionQuotaAllocations> response = manager.groupQuotaSubscriptionAllocations()
            .list("ibahwflus", "dtmhrkwofyyvoqa", "piexpbtgiw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("enwash", response.iterator().next().properties().region());
        Assertions.assertEquals(7707312982236790783L, response.iterator().next().properties().limit());
    }
}
