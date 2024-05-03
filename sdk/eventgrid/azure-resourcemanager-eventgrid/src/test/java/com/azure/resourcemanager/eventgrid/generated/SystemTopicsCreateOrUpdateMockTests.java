// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.SystemTopic;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SystemTopicsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"source\":\"mtsjkyj\",\"topicType\":\"xwdonbexftedau\",\"metricResourceId\":\"eeggzgrn\"},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"uumrt\",\"tenantId\":\"qgacantnsyxzxjmk\",\"userAssignedIdentities\":{\"nydscdkx\":{\"principalId\":\"lazof\",\"clientId\":\"xvtemaspm\"}}},\"location\":\"dpwjcbhaahntof\",\"tags\":{\"vsujybsrwz\":\"hpfixoskkzdf\"},\"id\":\"mr\",\"name\":\"t\",\"type\":\"dhmfppinm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SystemTopic response = manager.systemTopics()
            .define("bepgcmahiwfry")
            .withRegion("atmdmn")
            .withExistingResourceGroup("gyweo")
            .withTags(mapOf("dmiplois", "nxoirxy", "ntwgkvyo", "kzsoxz", "zwwy", "psapzu"))
            .withIdentity(new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withPrincipalId("gbggcjx")
                .withTenantId("blivw")
                .withUserAssignedIdentities(mapOf("gxzduvxdmxe",
                    new UserIdentityProperties().withPrincipalId("dymy").withClientId("hdosmbngkq"))))
            .withSource("kapitskshfyftt")
            .withTopicType("j")
            .create();

        Assertions.assertEquals("dpwjcbhaahntof", response.location());
        Assertions.assertEquals("hpfixoskkzdf", response.tags().get("vsujybsrwz"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("uumrt", response.identity().principalId());
        Assertions.assertEquals("qgacantnsyxzxjmk", response.identity().tenantId());
        Assertions.assertEquals("lazof", response.identity().userAssignedIdentities().get("nydscdkx").principalId());
        Assertions.assertEquals("xvtemaspm", response.identity().userAssignedIdentities().get("nydscdkx").clientId());
        Assertions.assertEquals("mtsjkyj", response.source());
        Assertions.assertEquals("xwdonbexftedau", response.topicType());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
