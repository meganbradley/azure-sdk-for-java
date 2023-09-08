// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborAddress;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BgpConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BgpConfiguration model =
            BinaryData
                .fromString(
                    "{\"bfdConfiguration\":{\"administrativeState\":\"Enabled\",\"intervalInMilliSeconds\":101641984,\"multiplier\":719655788},\"defaultRouteOriginate\":\"True\",\"allowAS\":191759687,\"allowASOverride\":\"Disable\",\"fabricASN\":505239500038837458,\"peerASN\":5939846871013452726,\"ipv4ListenRangePrefixes\":[\"jzgdyrc\",\"uqbsgzlrqhb\"],\"ipv6ListenRangePrefixes\":[\"ogdxwbsfpyxxtjlf\",\"ecominxojjluxxd\"],\"ipv4NeighborAddress\":[{\"address\":\"zd\",\"configurationState\":\"Accepted\"},{\"address\":\"mueza\",\"configurationState\":\"ErrorDeprovisioning\"}],\"ipv6NeighborAddress\":[{\"address\":\"qloto\",\"configurationState\":\"ErrorProvisioning\"},{\"address\":\"wtaznkcqw\",\"configurationState\":\"Accepted\"},{\"address\":\"yofgwhnkbtlwljss\",\"configurationState\":\"Rejected\"},{\"address\":\"nldkp\",\"configurationState\":\"ErrorDeprovisioning\"}],\"annotation\":\"isubxbteog\"}")
                .toObject(BgpConfiguration.class);
        Assertions.assertEquals("isubxbteog", model.annotation());
        Assertions.assertEquals(101641984, model.bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(719655788, model.bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, model.defaultRouteOriginate());
        Assertions.assertEquals(191759687, model.allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, model.allowASOverride());
        Assertions.assertEquals(5939846871013452726L, model.peerAsn());
        Assertions.assertEquals("jzgdyrc", model.ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("ogdxwbsfpyxxtjlf", model.ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("zd", model.ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("qloto", model.ipv6NeighborAddress().get(0).address());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BgpConfiguration model =
            new BgpConfiguration()
                .withAnnotation("isubxbteog")
                .withBfdConfiguration(
                    new BfdConfiguration().withIntervalInMilliSeconds(101641984).withMultiplier(719655788))
                .withDefaultRouteOriginate(BooleanEnumProperty.TRUE)
                .withAllowAS(191759687)
                .withAllowASOverride(AllowASOverride.DISABLE)
                .withPeerAsn(5939846871013452726L)
                .withIpv4ListenRangePrefixes(Arrays.asList("jzgdyrc", "uqbsgzlrqhb"))
                .withIpv6ListenRangePrefixes(Arrays.asList("ogdxwbsfpyxxtjlf", "ecominxojjluxxd"))
                .withIpv4NeighborAddress(
                    Arrays.asList(new NeighborAddress().withAddress("zd"), new NeighborAddress().withAddress("mueza")))
                .withIpv6NeighborAddress(
                    Arrays
                        .asList(
                            new NeighborAddress().withAddress("qloto"),
                            new NeighborAddress().withAddress("wtaznkcqw"),
                            new NeighborAddress().withAddress("yofgwhnkbtlwljss"),
                            new NeighborAddress().withAddress("nldkp")));
        model = BinaryData.fromObject(model).toObject(BgpConfiguration.class);
        Assertions.assertEquals("isubxbteog", model.annotation());
        Assertions.assertEquals(101641984, model.bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(719655788, model.bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, model.defaultRouteOriginate());
        Assertions.assertEquals(191759687, model.allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, model.allowASOverride());
        Assertions.assertEquals(5939846871013452726L, model.peerAsn());
        Assertions.assertEquals("jzgdyrc", model.ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("ogdxwbsfpyxxtjlf", model.ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("zd", model.ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("qloto", model.ipv6NeighborAddress().get(0).address());
    }
}
