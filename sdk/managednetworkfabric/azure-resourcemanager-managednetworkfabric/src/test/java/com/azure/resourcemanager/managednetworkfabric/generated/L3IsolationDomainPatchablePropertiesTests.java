// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRoute;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnetRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.L3ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.L3IsolationDomainPatchableProperties;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeConnectedSubnets;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeStaticRoutes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class L3IsolationDomainPatchablePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L3IsolationDomainPatchableProperties model =
            BinaryData
                .fromString(
                    "{\"redistributeConnectedSubnets\":\"False\",\"redistributeStaticRoutes\":\"True\",\"aggregateRouteConfiguration\":{\"ipv4Routes\":[{\"prefix\":\"dpkawnsnl\"},{\"prefix\":\"imouxwksqmudmfco\"},{\"prefix\":\"bicziuswswj\"}],\"ipv6Routes\":[{\"prefix\":\"qsj\"}]},\"connectedSubnetRoutePolicy\":{\"exportRoutePolicyId\":\"qqvyfscyrfw\",\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"qvogfuyz\",\"exportIpv6RoutePolicyId\":\"bhli\"}}}")
                .toObject(L3IsolationDomainPatchableProperties.class);
        Assertions.assertEquals(RedistributeConnectedSubnets.FALSE, model.redistributeConnectedSubnets());
        Assertions.assertEquals(RedistributeStaticRoutes.TRUE, model.redistributeStaticRoutes());
        Assertions.assertEquals("dpkawnsnl", model.aggregateRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("qsj", model.aggregateRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("qqvyfscyrfw", model.connectedSubnetRoutePolicy().exportRoutePolicyId());
        Assertions
            .assertEquals("qvogfuyz", model.connectedSubnetRoutePolicy().exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions
            .assertEquals("bhli", model.connectedSubnetRoutePolicy().exportRoutePolicy().exportIpv6RoutePolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L3IsolationDomainPatchableProperties model =
            new L3IsolationDomainPatchableProperties()
                .withRedistributeConnectedSubnets(RedistributeConnectedSubnets.FALSE)
                .withRedistributeStaticRoutes(RedistributeStaticRoutes.TRUE)
                .withAggregateRouteConfiguration(
                    new AggregateRouteConfiguration()
                        .withIpv4Routes(
                            Arrays
                                .asList(
                                    new AggregateRoute().withPrefix("dpkawnsnl"),
                                    new AggregateRoute().withPrefix("imouxwksqmudmfco"),
                                    new AggregateRoute().withPrefix("bicziuswswj")))
                        .withIpv6Routes(Arrays.asList(new AggregateRoute().withPrefix("qsj"))))
                .withConnectedSubnetRoutePolicy(
                    new ConnectedSubnetRoutePolicy()
                        .withExportRoutePolicyId("qqvyfscyrfw")
                        .withExportRoutePolicy(
                            new L3ExportRoutePolicy()
                                .withExportIpv4RoutePolicyId("qvogfuyz")
                                .withExportIpv6RoutePolicyId("bhli")));
        model = BinaryData.fromObject(model).toObject(L3IsolationDomainPatchableProperties.class);
        Assertions.assertEquals(RedistributeConnectedSubnets.FALSE, model.redistributeConnectedSubnets());
        Assertions.assertEquals(RedistributeStaticRoutes.TRUE, model.redistributeStaticRoutes());
        Assertions.assertEquals("dpkawnsnl", model.aggregateRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("qsj", model.aggregateRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("qqvyfscyrfw", model.connectedSubnetRoutePolicy().exportRoutePolicyId());
        Assertions
            .assertEquals("qvogfuyz", model.connectedSubnetRoutePolicy().exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions
            .assertEquals("bhli", model.connectedSubnetRoutePolicy().exportRoutePolicy().exportIpv6RoutePolicyId());
    }
}
