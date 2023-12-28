// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager;
import com.azure.resourcemanager.connectedvmware.models.VirtualNetwork;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualNetworksGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"uuid\":\"jselpkpbafvafh\",\"vCenterId\":\"ylcc\",\"moRefId\":\"vxrh\",\"inventoryItemId\":\"d\",\"moName\":\"rsofpltdbmairrh\",\"customResourceName\":\"fnrac\",\"statuses\":[{\"type\":\"igtuu\",\"status\":\"ouhdawsigrb\",\"reason\":\"xsjybvitvqk\",\"message\":\"az\",\"severity\":\"mtggmu\",\"lastUpdatedAt\":\"2021-05-02T12:21:31Z\"},{\"type\":\"ozfnkfexlvx\",\"status\":\"akizvoaikna\",\"reason\":\"nuwiguyxlykwph\",\"message\":\"zc\",\"severity\":\"hmpejtlkexaonw\",\"lastUpdatedAt\":\"2021-08-12T17:38:45Z\"},{\"type\":\"qhr\",\"status\":\"xk\",\"reason\":\"ccrmmk\",\"message\":\"pijubyq\",\"severity\":\"kakfqfr\",\"lastUpdatedAt\":\"2021-10-05T02:02:46Z\"},{\"type\":\"il\",\"status\":\"dxjascowvfdj\",\"reason\":\"dxphlk\",\"message\":\"nmgzvyfijdkzuqnw\",\"severity\":\"thuqolyahluq\",\"lastUpdatedAt\":\"2021-09-29T05:28Z\"}],\"provisioningState\":\"Created\"},\"extendedLocation\":{\"type\":\"rjb\",\"name\":\"ykfhyqezvqqugdrf\"},\"kind\":\"ve\",\"location\":\"reuquowtljvf\",\"tags\":{\"yxvrqtvbczsul\":\"eagk\",\"ykgsangpszng\":\"dgglmepjpfs\",\"jujcngoad\":\"fpgylkve\"},\"id\":\"edmzrgjfoknub\",\"name\":\"oitpkpztrgdgx\",\"type\":\"coqra\"}";

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

        ConnectedVMwareManager manager =
            ConnectedVMwareManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        VirtualNetwork response =
            manager
                .virtualNetworks()
                .getByResourceGroupWithResponse("dynojpziuwfb", "kkdtnhqsy", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("reuquowtljvf", response.location());
        Assertions.assertEquals("eagk", response.tags().get("yxvrqtvbczsul"));
        Assertions.assertEquals("rjb", response.extendedLocation().type());
        Assertions.assertEquals("ykfhyqezvqqugdrf", response.extendedLocation().name());
        Assertions.assertEquals("ve", response.kind());
        Assertions.assertEquals("ylcc", response.vCenterId());
        Assertions.assertEquals("vxrh", response.moRefId());
        Assertions.assertEquals("d", response.inventoryItemId());
    }
}
