// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.CommonDynamicMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationType;
import com.azure.resourcemanager.managednetworkfabric.models.IpAddressType;
import com.azure.resourcemanager.managednetworkfabric.models.IpGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRule;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleAction;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleMatchCondition;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.PollingIntervalInSeconds;
import com.azure.resourcemanager.managednetworkfabric.models.PortGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VlanGroupProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkTapRulesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"networkTapId\":\"lbhkij\",\"pollingIntervalInSeconds\":30,\"lastSyncedTime\":\"2021-09-19T16:32:15Z\",\"configurationState\":\"ErrorDeprovisioning\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"Disabled\",\"configurationType\":\"File\",\"tapRulesUrl\":\"ppuhk\",\"matchConfigurations\":[{\"matchConfigurationName\":\"kzvjyvobevfbmxz\",\"sequenceNumber\":8738446998224680215,\"ipAddressType\":\"IPv4\",\"matchConditions\":[{},{}],\"actions\":[{},{},{},{}]},{\"matchConfigurationName\":\"jioby\",\"sequenceNumber\":8837962596253650169,\"ipAddressType\":\"IPv4\",\"matchConditions\":[{}],\"actions\":[{},{},{}]},{\"matchConfigurationName\":\"uyxhcwubtego\",\"sequenceNumber\":1449814886318601810,\"ipAddressType\":\"IPv4\",\"matchConditions\":[{},{},{}],\"actions\":[{}]},{\"matchConfigurationName\":\"frgiplxrifbsbk\",\"sequenceNumber\":102468891735930069,\"ipAddressType\":\"IPv4\",\"matchConditions\":[{},{},{},{}],\"actions\":[{},{},{}]}],\"dynamicMatchConfigurations\":[{\"ipGroups\":[{},{},{},{}],\"vlanGroups\":[{},{}],\"portGroups\":[{},{}]}],\"annotation\":\"tuufknarscxn\"},\"location\":\"pjinz\",\"tags\":{\"nn\":\"rsm\",\"wwqchxowppvux\":\"wnwoxve\"},\"id\":\"actoqqehn\",\"name\":\"ir\",\"type\":\"gnvuolv\"}";

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

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkTapRule response =
            manager
                .networkTapRules()
                .define("exnpoaeruywfh")
                .withRegion("wpv")
                .withExistingResourceGroup("ektnhyylipvqpqu")
                .withTags(mapOf("snu", "fcstucmiqs"))
                .withPollingIntervalInSeconds(PollingIntervalInSeconds.ONE_TWO_ZERO)
                .withConfigurationType(ConfigurationType.FILE)
                .withTapRulesUrl("usmk")
                .withMatchConfigurations(
                    Arrays
                        .asList(
                            new NetworkTapRuleMatchConfiguration()
                                .withMatchConfigurationName("pwpbnjc")
                                .withSequenceNumber(1103251243591374149L)
                                .withIpAddressType(IpAddressType.IPV4)
                                .withMatchConditions(Arrays.asList(new NetworkTapRuleMatchCondition()))
                                .withActions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleAction(),
                                            new NetworkTapRuleAction(),
                                            new NetworkTapRuleAction(),
                                            new NetworkTapRuleAction())),
                            new NetworkTapRuleMatchConfiguration()
                                .withMatchConfigurationName("vnddllbwnmv")
                                .withSequenceNumber(7195752086688648646L)
                                .withIpAddressType(IpAddressType.IPV6)
                                .withMatchConditions(Arrays.asList(new NetworkTapRuleMatchCondition()))
                                .withActions(Arrays.asList(new NetworkTapRuleAction())),
                            new NetworkTapRuleMatchConfiguration()
                                .withMatchConfigurationName("sdouzohihqlwy")
                                .withSequenceNumber(7450751315453937711L)
                                .withIpAddressType(IpAddressType.IPV6)
                                .withMatchConditions(Arrays.asList(new NetworkTapRuleMatchCondition()))
                                .withActions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleAction(),
                                            new NetworkTapRuleAction(),
                                            new NetworkTapRuleAction(),
                                            new NetworkTapRuleAction()))))
                .withDynamicMatchConfigurations(
                    Arrays
                        .asList(
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(Arrays.asList(new IpGroupProperties(), new IpGroupProperties()))
                                .withVlanGroups(
                                    Arrays
                                        .asList(
                                            new VlanGroupProperties(),
                                            new VlanGroupProperties(),
                                            new VlanGroupProperties(),
                                            new VlanGroupProperties()))
                                .withPortGroups(Arrays.asList(new PortGroupProperties()))))
                .withAnnotation("uepgqztakovs")
                .create();

        Assertions.assertEquals("pjinz", response.location());
        Assertions.assertEquals("rsm", response.tags().get("nn"));
        Assertions.assertEquals(PollingIntervalInSeconds.THREE_ZERO, response.pollingIntervalInSeconds());
        Assertions.assertEquals(ConfigurationType.FILE, response.configurationType());
        Assertions.assertEquals("ppuhk", response.tapRulesUrl());
        Assertions.assertEquals("kzvjyvobevfbmxz", response.matchConfigurations().get(0).matchConfigurationName());
        Assertions.assertEquals(8738446998224680215L, response.matchConfigurations().get(0).sequenceNumber());
        Assertions.assertEquals(IpAddressType.IPV4, response.matchConfigurations().get(0).ipAddressType());
        Assertions.assertEquals("tuufknarscxn", response.annotation());
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
