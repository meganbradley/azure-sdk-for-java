// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.astro.AstroManager;
import com.azure.resourcemanager.astro.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.astro.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.astro.models.OrganizationResource;
import com.azure.resourcemanager.astro.models.SingleSignOnStates;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OrganizationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"marketplace\":{\"subscriptionId\":\"cibvyvdcsitynn\",\"subscriptionStatus\":\"Unsubscribed\",\"offerDetails\":{\"publisherId\":\"dectehfiqsc\",\"offerId\":\"eypvhezrkg\",\"planId\":\"hcjrefovgmk\",\"planName\":\"leyyvx\",\"termUnit\":\"jpkcattpng\",\"termId\":\"rcczsqpjhvmd\"}},\"user\":{\"firstName\":\"jvnysounqe\",\"lastName\":\"a\",\"emailAddress\":\"oaeupfhyhltrpmo\",\"upn\":\"mcmatuokthfuiu\",\"phoneNumber\":\"dsfcpkvxodpuoz\"},\"provisioningState\":\"Failed\",\"partnerOrganizationProperties\":{\"organizationId\":\"agfuaxbezyiu\",\"workspaceId\":\"ktwh\",\"organizationName\":\"dxwzywqsmbsurexi\",\"workspaceName\":\"ryocfsfksymdd\",\"singleSignOnProperties\":{\"singleSignOnState\":\"Disable\",\"enterpriseAppId\":\"iuxhqyudxorr\",\"singleSignOnUrl\":\"b\",\"aadDomains\":[\"zvyifqrvkdvj\",\"llr\"],\"provisioningState\":\"Canceled\"}}},\"identity\":{\"principalId\":\"df62dde2-7fd5-4220-9ad9-3e31becb278e\",\"tenantId\":\"2033f9e8-4945-4ea4-acec-aa16be17e8d6\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"pulexxbczw\":{\"principalId\":\"3af2e207-5f30-47fc-84f8-4e62e83f5855\",\"clientId\":\"9613cc8a-b06f-4b62-9a84-cc3b4af72bda\"},\"wiqzbqjvsovmyo\":{\"principalId\":\"a32499ba-1e48-443d-9dbc-81d7f2ce2e6f\",\"clientId\":\"aa7e207d-a3ed-4290-9ecc-a2a4bc4341a4\"},\"spkwlhzdobpxjm\":{\"principalId\":\"157df892-7a9f-4a55-9a57-b6393db7c013\",\"clientId\":\"407a9cce-2283-4ff7-a4d4-c09c9f875c4e\"},\"vvnchrkcc\":{\"principalId\":\"631179ce-e327-4d99-b258-0919aa4ce089\",\"clientId\":\"36a6c1e6-2798-4ebf-a07c-bb5143f66ed8\"}}},\"location\":\"wzjuqk\",\"tags\":{\"oskg\":\"ajiwkuo\"},\"id\":\"sauuimj\",\"name\":\"vxieduugidyj\",\"type\":\"rfbyaosvexcso\"}]}";

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

        AstroManager manager = AstroManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<OrganizationResource> response = manager.organizations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("wzjuqk", response.iterator().next().location());
        Assertions.assertEquals("ajiwkuo", response.iterator().next().tags().get("oskg"));
        Assertions.assertEquals("cibvyvdcsitynn",
            response.iterator().next().properties().marketplace().subscriptionId());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.UNSUBSCRIBED,
            response.iterator().next().properties().marketplace().subscriptionStatus());
        Assertions.assertEquals("dectehfiqsc",
            response.iterator().next().properties().marketplace().offerDetails().publisherId());
        Assertions.assertEquals("eypvhezrkg",
            response.iterator().next().properties().marketplace().offerDetails().offerId());
        Assertions.assertEquals("hcjrefovgmk",
            response.iterator().next().properties().marketplace().offerDetails().planId());
        Assertions.assertEquals("leyyvx",
            response.iterator().next().properties().marketplace().offerDetails().planName());
        Assertions.assertEquals("jpkcattpng",
            response.iterator().next().properties().marketplace().offerDetails().termUnit());
        Assertions.assertEquals("rcczsqpjhvmd",
            response.iterator().next().properties().marketplace().offerDetails().termId());
        Assertions.assertEquals("jvnysounqe", response.iterator().next().properties().user().firstName());
        Assertions.assertEquals("a", response.iterator().next().properties().user().lastName());
        Assertions.assertEquals("oaeupfhyhltrpmo", response.iterator().next().properties().user().emailAddress());
        Assertions.assertEquals("mcmatuokthfuiu", response.iterator().next().properties().user().upn());
        Assertions.assertEquals("dsfcpkvxodpuoz", response.iterator().next().properties().user().phoneNumber());
        Assertions.assertEquals("agfuaxbezyiu",
            response.iterator().next().properties().partnerOrganizationProperties().organizationId());
        Assertions.assertEquals("ktwh",
            response.iterator().next().properties().partnerOrganizationProperties().workspaceId());
        Assertions.assertEquals("dxwzywqsmbsurexi",
            response.iterator().next().properties().partnerOrganizationProperties().organizationName());
        Assertions.assertEquals("ryocfsfksymdd",
            response.iterator().next().properties().partnerOrganizationProperties().workspaceName());
        Assertions.assertEquals(SingleSignOnStates.DISABLE, response.iterator().next().properties()
            .partnerOrganizationProperties().singleSignOnProperties().singleSignOnState());
        Assertions.assertEquals("iuxhqyudxorr", response.iterator().next().properties().partnerOrganizationProperties()
            .singleSignOnProperties().enterpriseAppId());
        Assertions.assertEquals("b", response.iterator().next().properties().partnerOrganizationProperties()
            .singleSignOnProperties().singleSignOnUrl());
        Assertions.assertEquals("zvyifqrvkdvj", response.iterator().next().properties().partnerOrganizationProperties()
            .singleSignOnProperties().aadDomains().get(0));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED,
            response.iterator().next().identity().type());
    }
}
