// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.OutboundNetworkDependenciesEndpointInner;
import com.azure.resourcemanager.kusto.models.EndpointDependency;
import com.azure.resourcemanager.kusto.models.EndpointDetail;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OutboundNetworkDependenciesEndpointInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundNetworkDependenciesEndpointInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"category\":\"ewzsyyceuzsoib\",\"endpoints\":[{\"domainName\":\"frxtrthzvaytdwk\",\"endpointDetails\":[{\"port\":1729344688},{\"port\":965192802},{\"port\":1150856748},{\"port\":1389326915}]},{\"domainName\":\"iilivpdtiirqtd\",\"endpointDetails\":[{\"port\":1693357038},{\"port\":725255215},{\"port\":1201300359}]},{\"domainName\":\"squyfxrxxlep\",\"endpointDetails\":[{\"port\":699446772},{\"port\":767638110},{\"port\":576385447}]},{\"domainName\":\"wnwxuqlcvyd\",\"endpointDetails\":[{\"port\":1248229075},{\"port\":350928008},{\"port\":1607416981},{\"port\":1080524607}]}],\"provisioningState\":\"Deleting\"},\"etag\":\"dkooebwnu\",\"id\":\"hemms\",\"name\":\"vdkcrodtj\",\"type\":\"nfwjlfltkacjvefk\"}")
                .toObject(OutboundNetworkDependenciesEndpointInner.class);
        Assertions.assertEquals("ewzsyyceuzsoib", model.category());
        Assertions.assertEquals("frxtrthzvaytdwk", model.endpoints().get(0).domainName());
        Assertions.assertEquals(1729344688, model.endpoints().get(0).endpointDetails().get(0).port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundNetworkDependenciesEndpointInner model =
            new OutboundNetworkDependenciesEndpointInner()
                .withCategory("ewzsyyceuzsoib")
                .withEndpoints(
                    Arrays
                        .asList(
                            new EndpointDependency()
                                .withDomainName("frxtrthzvaytdwk")
                                .withEndpointDetails(
                                    Arrays
                                        .asList(
                                            new EndpointDetail().withPort(1729344688),
                                            new EndpointDetail().withPort(965192802),
                                            new EndpointDetail().withPort(1150856748),
                                            new EndpointDetail().withPort(1389326915))),
                            new EndpointDependency()
                                .withDomainName("iilivpdtiirqtd")
                                .withEndpointDetails(
                                    Arrays
                                        .asList(
                                            new EndpointDetail().withPort(1693357038),
                                            new EndpointDetail().withPort(725255215),
                                            new EndpointDetail().withPort(1201300359))),
                            new EndpointDependency()
                                .withDomainName("squyfxrxxlep")
                                .withEndpointDetails(
                                    Arrays
                                        .asList(
                                            new EndpointDetail().withPort(699446772),
                                            new EndpointDetail().withPort(767638110),
                                            new EndpointDetail().withPort(576385447))),
                            new EndpointDependency()
                                .withDomainName("wnwxuqlcvyd")
                                .withEndpointDetails(
                                    Arrays
                                        .asList(
                                            new EndpointDetail().withPort(1248229075),
                                            new EndpointDetail().withPort(350928008),
                                            new EndpointDetail().withPort(1607416981),
                                            new EndpointDetail().withPort(1080524607)))));
        model = BinaryData.fromObject(model).toObject(OutboundNetworkDependenciesEndpointInner.class);
        Assertions.assertEquals("ewzsyyceuzsoib", model.category());
        Assertions.assertEquals("frxtrthzvaytdwk", model.endpoints().get(0).domainName());
        Assertions.assertEquals(1729344688, model.endpoints().get(0).endpointDetails().get(0).port());
    }
}
