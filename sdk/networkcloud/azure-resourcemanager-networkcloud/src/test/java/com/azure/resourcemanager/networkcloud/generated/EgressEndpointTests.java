// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.EgressEndpoint;
import com.azure.resourcemanager.networkcloud.models.EndpointDependency;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EgressEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EgressEndpoint model =
            BinaryData
                .fromString(
                    "{\"category\":\"ynpwlbj\",\"endpoints\":[{\"domainName\":\"gacftadeh\",\"port\":7028050140215699790},{\"domainName\":\"yfsoppu\",\"port\":7161125881545295821},{\"domainName\":\"nzwdejba\",\"port\":8576241637170958939},{\"domainName\":\"zdmohctbqvu\",\"port\":2681919302417118526}]}")
                .toObject(EgressEndpoint.class);
        Assertions.assertEquals("ynpwlbj", model.category());
        Assertions.assertEquals("gacftadeh", model.endpoints().get(0).domainName());
        Assertions.assertEquals(7028050140215699790L, model.endpoints().get(0).port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EgressEndpoint model =
            new EgressEndpoint()
                .withCategory("ynpwlbj")
                .withEndpoints(
                    Arrays
                        .asList(
                            new EndpointDependency().withDomainName("gacftadeh").withPort(7028050140215699790L),
                            new EndpointDependency().withDomainName("yfsoppu").withPort(7161125881545295821L),
                            new EndpointDependency().withDomainName("nzwdejba").withPort(8576241637170958939L),
                            new EndpointDependency().withDomainName("zdmohctbqvu").withPort(2681919302417118526L)));
        model = BinaryData.fromObject(model).toObject(EgressEndpoint.class);
        Assertions.assertEquals("ynpwlbj", model.category());
        Assertions.assertEquals("gacftadeh", model.endpoints().get(0).domainName());
        Assertions.assertEquals(7028050140215699790L, model.endpoints().get(0).port());
    }
}
