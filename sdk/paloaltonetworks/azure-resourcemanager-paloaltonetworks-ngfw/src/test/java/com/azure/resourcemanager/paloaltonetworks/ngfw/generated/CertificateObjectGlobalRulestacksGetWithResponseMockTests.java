// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.CertificateObjectGlobalRulestackResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CertificateObjectGlobalRulestacksGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"certificateSignerResourceId\":\"ebnfxofvc\",\"certificateSelfSigned\":\"TRUE\",\"auditComment\":\"dirazf\",\"description\":\"ejwabmdujtmvco\",\"etag\":\"xcmjurbu\",\"provisioningState\":\"Deleting\"},\"id\":\"yqltqsro\",\"name\":\"tuwkffdj\",\"type\":\"tsysi\"}";

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

        PaloAltoNetworksNgfwManager manager = PaloAltoNetworksNgfwManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CertificateObjectGlobalRulestackResource response = manager.certificateObjectGlobalRulestacks()
            .getWithResponse("eiookjbsah", "tdtpdelqacslmo", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("ebnfxofvc", response.certificateSignerResourceId());
        Assertions.assertEquals(BooleanEnum.TRUE, response.certificateSelfSigned());
        Assertions.assertEquals("dirazf", response.auditComment());
        Assertions.assertEquals("ejwabmdujtmvco", response.description());
        Assertions.assertEquals("xcmjurbu", response.etag());
    }
}
