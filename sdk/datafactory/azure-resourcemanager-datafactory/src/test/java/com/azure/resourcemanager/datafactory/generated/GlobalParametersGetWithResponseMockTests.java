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
import com.azure.resourcemanager.datafactory.models.GlobalParameterResource;
import com.azure.resourcemanager.datafactory.models.GlobalParameterType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GlobalParametersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"bdzmk\":{\"type\":\"String\",\"value\":\"dataggcphcu\"},\"kmtjd\":{\"type\":\"String\",\"value\":\"dataydbgyb\"},\"qqxmmzwdplru\":{\"type\":\"String\",\"value\":\"databbrtkeejju\"}},\"name\":\"xzearscwfocvvdse\",\"type\":\"qllpb\",\"etag\":\"cezbfgokeboaa\",\"id\":\"uoqafhvvbqyk\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        GlobalParameterResource response = manager.globalParameters()
            .getWithResponse("jbkcyppagvyioixa", "geclaxcgdybi", "mgrbjgmnoczbxekz", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("uoqafhvvbqyk", response.id());
        Assertions.assertEquals(GlobalParameterType.STRING, response.properties().get("bdzmk").type());
    }
}
