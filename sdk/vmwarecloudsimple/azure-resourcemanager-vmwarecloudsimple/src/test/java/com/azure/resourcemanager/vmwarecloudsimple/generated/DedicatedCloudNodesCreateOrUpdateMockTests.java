// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager;
import com.azure.resourcemanager.vmwarecloudsimple.models.DedicatedCloudNode;
import com.azure.resourcemanager.vmwarecloudsimple.models.Sku;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DedicatedCloudNodesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"availabilityZoneId\":\"mrsreuzvxurisjnh\",\"availabilityZoneName\":\"txifqj\",\"cloudRackName\":\"xmrhu\",\"created\":\"2021-07-06T09:24:09Z\",\"nodesCount\":1892822249,\"placementGroupId\":\"cesutrgjupauut\",\"placementGroupName\":\"oqh\",\"privateCloudId\":\"ejqgw\",\"privateCloudName\":\"nfqn\",\"provisioningState\":\"Succeeded\",\"purchaseId\":\"79ead826-9daa-4fee-91d8-a0aa2c95978f\",\"skuDescription\":{\"id\":\"slirciz\",\"name\":\"xvydfceacvlhvygd\"},\"status\":\"unused\",\"vmwareClusterName\":\"mrtwna\"},\"sku\":{\"capacity\":\"lbiw\",\"description\":\"jgcyztsfmznba\",\"family\":\"ph\",\"name\":\"hqnrn\",\"tier\":\"x\"},\"location\":\"huwrykqgaifm\",\"tags\":{\"dvk\":\"lb\",\"srhnjivo\":\"bejdznxcv\"},\"id\":\"v\",\"name\":\"novqfzge\",\"type\":\"jdftuljltd\"}";

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

        VMwareCloudSimpleManager manager =
            VMwareCloudSimpleManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DedicatedCloudNode response =
            manager
                .dedicatedCloudNodes()
                .define("rghxjb")
                .withRegion("qvpn")
                .withExistingResourceGroup("sxkkg")
                .withTags(mapOf("n", "jviylwdshfs", "rymsgaojfmw", "bgye", "hirctymoxoftpipi", "cotmr"))
                .withSku(
                    new Sku()
                        .withCapacity("rvk")
                        .withDescription("ovjzhpjbibgjmfx")
                        .withFamily("vfcluyovwxnbkfe")
                        .withName("zxscyhwzdgirujb")
                        .withTier("omvzzbtd"))
                .withAvailabilityZoneId("qxvcxgfrpdsofb")
                .withNodesCount(412423571)
                .withPlacementGroupId("jsrtk")
                .withPurchaseId(UUID.fromString("d8795052-f497-48ad-a2ea-332417ff1fcb"))
                .withIdPropertiesId("tqmieox")
                .withNamePropertiesName("rgguf")
                .withReferer("h")
                .create();

        Assertions.assertEquals("huwrykqgaifm", response.location());
        Assertions.assertEquals("lb", response.tags().get("dvk"));
        Assertions.assertEquals("lbiw", response.sku().capacity());
        Assertions.assertEquals("jgcyztsfmznba", response.sku().description());
        Assertions.assertEquals("ph", response.sku().family());
        Assertions.assertEquals("hqnrn", response.sku().name());
        Assertions.assertEquals("x", response.sku().tier());
        Assertions.assertEquals("mrsreuzvxurisjnh", response.availabilityZoneId());
        Assertions.assertEquals(1892822249, response.nodesCount());
        Assertions.assertEquals("cesutrgjupauut", response.placementGroupId());
        Assertions.assertEquals(UUID.fromString("79ead826-9daa-4fee-91d8-a0aa2c95978f"), response.purchaseId());
        Assertions.assertEquals("slirciz", response.idPropertiesId());
        Assertions.assertEquals("xvydfceacvlhvygd", response.namePropertiesName());
    }

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
