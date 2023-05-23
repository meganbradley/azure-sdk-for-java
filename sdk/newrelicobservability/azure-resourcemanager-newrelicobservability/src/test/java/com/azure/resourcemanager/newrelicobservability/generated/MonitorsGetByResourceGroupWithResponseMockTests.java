// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager;
import com.azure.resourcemanager.newrelicobservability.models.AccountCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.BillingCycle;
import com.azure.resourcemanager.newrelicobservability.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicMonitorResource;
import com.azure.resourcemanager.newrelicobservability.models.OrgCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.UsageType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MonitorsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Creating\",\"monitoringStatus\":\"Disabled\",\"marketplaceSubscriptionStatus\":\"Active\",\"marketplaceSubscriptionId\":\"melmqkrha\",\"newRelicAccountProperties\":{\"userId\":\"juahaquhcdhmdual\"},\"userInfo\":{\"firstName\":\"fadmws\",\"lastName\":\"r\",\"emailAddress\":\"xpvgo\",\"phoneNumber\":\"lf\",\"country\":\"sgwbnbbeld\"},\"planData\":{\"usageType\":\"COMMITTED\",\"billingCycle\":\"WEEKLY\",\"planDetails\":\"io\",\"effectiveDate\":\"2021-05-06T22:54:03Z\"},\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":391809232,\"orgCreationSource\":\"NEWRELIC\",\"accountCreationSource\":\"NEWRELIC\"},\"identity\":{\"principalId\":\"f8829299-fc95-4144-aef6-fe4aa2d30e0b\",\"tenantId\":\"8d57248d-6b81-42fe-abf1-13066e5741ee\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"owzxcu\",\"tags\":{\"ucww\":\"jooxdjebw\",\"bvmeuecivy\":\"vo\",\"ueiotwmcdyt\":\"zceuojgjrw\",\"it\":\"x\"},\"id\":\"nrjawgqwg\",\"name\":\"hniskxfbkpyc\",\"type\":\"klwndnhjdauwhv\"}";

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

        NewRelicObservabilityManager manager =
            NewRelicObservabilityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        NewRelicMonitorResource response =
            manager
                .monitors()
                .getByResourceGroupWithResponse("ehhseyvjusrts", "hspkdeemao", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("owzxcu", response.location());
        Assertions.assertEquals("jooxdjebw", response.tags().get("ucww"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("juahaquhcdhmdual", response.newRelicAccountProperties().userId());
        Assertions.assertEquals("fadmws", response.userInfo().firstName());
        Assertions.assertEquals("r", response.userInfo().lastName());
        Assertions.assertEquals("xpvgo", response.userInfo().emailAddress());
        Assertions.assertEquals("lf", response.userInfo().phoneNumber());
        Assertions.assertEquals("sgwbnbbeld", response.userInfo().country());
        Assertions.assertEquals(UsageType.COMMITTED, response.planData().usageType());
        Assertions.assertEquals(BillingCycle.WEEKLY, response.planData().billingCycle());
        Assertions.assertEquals("io", response.planData().planDetails());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T22:54:03Z"), response.planData().effectiveDate());
        Assertions.assertEquals(OrgCreationSource.NEWRELIC, response.orgCreationSource());
        Assertions.assertEquals(AccountCreationSource.NEWRELIC, response.accountCreationSource());
    }
}
