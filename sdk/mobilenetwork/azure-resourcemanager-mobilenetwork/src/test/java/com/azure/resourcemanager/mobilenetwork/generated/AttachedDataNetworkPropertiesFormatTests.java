// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AttachedDataNetworkPropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.NaptConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.NaptEnabled;
import com.azure.resourcemanager.mobilenetwork.models.PinholeTimeouts;
import com.azure.resourcemanager.mobilenetwork.models.PortRange;
import com.azure.resourcemanager.mobilenetwork.models.PortReuseHoldTimes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AttachedDataNetworkPropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AttachedDataNetworkPropertiesFormat model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Failed\",\"userPlaneDataInterface\":{\"name\":\"lusarh\",\"ipv4Address\":\"fcqhsmyurkd\",\"ipv4Subnet\":\"lx\",\"ipv4Gateway\":\"kuksjtxukcdm\"},\"dnsAddresses\":[\"rcryuanzwuxzdxta\",\"rlhm\",\"hfpmrqobmtukknr\",\"rtihfxtijbpz\"],\"naptConfiguration\":{\"enabled\":\"Disabled\",\"portRange\":{\"minPort\":477742160,\"maxPort\":1531004720},\"portReuseHoldTime\":{\"tcp\":271043498,\"udp\":1526885086},\"pinholeLimits\":504117688,\"pinholeTimeouts\":{\"tcp\":1760407196,\"udp\":1757371466,\"icmp\":1730607260}},\"userEquipmentAddressPoolPrefix\":[\"ufhfcbjysa\",\"ithxqhabifpi\"],\"userEquipmentStaticAddressPoolPrefix\":[\"czbysc\",\"pqxu\"]}")
                .toObject(AttachedDataNetworkPropertiesFormat.class);
        Assertions.assertEquals("lusarh", model.userPlaneDataInterface().name());
        Assertions.assertEquals("fcqhsmyurkd", model.userPlaneDataInterface().ipv4Address());
        Assertions.assertEquals("lx", model.userPlaneDataInterface().ipv4Subnet());
        Assertions.assertEquals("kuksjtxukcdm", model.userPlaneDataInterface().ipv4Gateway());
        Assertions.assertEquals("rcryuanzwuxzdxta", model.dnsAddresses().get(0));
        Assertions.assertEquals(NaptEnabled.DISABLED, model.naptConfiguration().enabled());
        Assertions.assertEquals(477742160, model.naptConfiguration().portRange().minPort());
        Assertions.assertEquals(1531004720, model.naptConfiguration().portRange().maxPort());
        Assertions.assertEquals(271043498, model.naptConfiguration().portReuseHoldTime().tcp());
        Assertions.assertEquals(1526885086, model.naptConfiguration().portReuseHoldTime().udp());
        Assertions.assertEquals(504117688, model.naptConfiguration().pinholeLimits());
        Assertions.assertEquals(1760407196, model.naptConfiguration().pinholeTimeouts().tcp());
        Assertions.assertEquals(1757371466, model.naptConfiguration().pinholeTimeouts().udp());
        Assertions.assertEquals(1730607260, model.naptConfiguration().pinholeTimeouts().icmp());
        Assertions.assertEquals("ufhfcbjysa", model.userEquipmentAddressPoolPrefix().get(0));
        Assertions.assertEquals("czbysc", model.userEquipmentStaticAddressPoolPrefix().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AttachedDataNetworkPropertiesFormat model =
            new AttachedDataNetworkPropertiesFormat()
                .withUserPlaneDataInterface(
                    new InterfaceProperties()
                        .withName("lusarh")
                        .withIpv4Address("fcqhsmyurkd")
                        .withIpv4Subnet("lx")
                        .withIpv4Gateway("kuksjtxukcdm"))
                .withDnsAddresses(Arrays.asList("rcryuanzwuxzdxta", "rlhm", "hfpmrqobmtukknr", "rtihfxtijbpz"))
                .withNaptConfiguration(
                    new NaptConfiguration()
                        .withEnabled(NaptEnabled.DISABLED)
                        .withPortRange(new PortRange().withMinPort(477742160).withMaxPort(1531004720))
                        .withPortReuseHoldTime(new PortReuseHoldTimes().withTcp(271043498).withUdp(1526885086))
                        .withPinholeLimits(504117688)
                        .withPinholeTimeouts(
                            new PinholeTimeouts().withTcp(1760407196).withUdp(1757371466).withIcmp(1730607260)))
                .withUserEquipmentAddressPoolPrefix(Arrays.asList("ufhfcbjysa", "ithxqhabifpi"))
                .withUserEquipmentStaticAddressPoolPrefix(Arrays.asList("czbysc", "pqxu"));
        model = BinaryData.fromObject(model).toObject(AttachedDataNetworkPropertiesFormat.class);
        Assertions.assertEquals("lusarh", model.userPlaneDataInterface().name());
        Assertions.assertEquals("fcqhsmyurkd", model.userPlaneDataInterface().ipv4Address());
        Assertions.assertEquals("lx", model.userPlaneDataInterface().ipv4Subnet());
        Assertions.assertEquals("kuksjtxukcdm", model.userPlaneDataInterface().ipv4Gateway());
        Assertions.assertEquals("rcryuanzwuxzdxta", model.dnsAddresses().get(0));
        Assertions.assertEquals(NaptEnabled.DISABLED, model.naptConfiguration().enabled());
        Assertions.assertEquals(477742160, model.naptConfiguration().portRange().minPort());
        Assertions.assertEquals(1531004720, model.naptConfiguration().portRange().maxPort());
        Assertions.assertEquals(271043498, model.naptConfiguration().portReuseHoldTime().tcp());
        Assertions.assertEquals(1526885086, model.naptConfiguration().portReuseHoldTime().udp());
        Assertions.assertEquals(504117688, model.naptConfiguration().pinholeLimits());
        Assertions.assertEquals(1760407196, model.naptConfiguration().pinholeTimeouts().tcp());
        Assertions.assertEquals(1757371466, model.naptConfiguration().pinholeTimeouts().udp());
        Assertions.assertEquals(1730607260, model.naptConfiguration().pinholeTimeouts().icmp());
        Assertions.assertEquals("ufhfcbjysa", model.userEquipmentAddressPoolPrefix().get(0));
        Assertions.assertEquals("czbysc", model.userEquipmentStaticAddressPoolPrefix().get(0));
    }
}
