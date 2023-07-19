// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkToNetworkInterconnectInner;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.IsManagementType;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnectsList;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;
import com.azure.resourcemanager.managednetworkfabric.models.NpbStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkToNetworkInterconnectsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkToNetworkInterconnectsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"nniType\":\"NPB\",\"isManagementType\":\"False\",\"useOptionB\":\"True\",\"layer2Configuration\":{\"mtu\":1585075235,\"interfaces\":[\"qliwkmzojf\",\"tyalh\",\"gmknazgbjbh\"]},\"optionBLayer3Configuration\":{\"peerASN\":5190256841350116865,\"vlanId\":1926341544,\"fabricASN\":6522593639815273596,\"primaryIpv4Prefix\":\"rcmmaixpqj\",\"primaryIpv6Prefix\":\"ifhb\",\"secondaryIpv4Prefix\":\"ldtt\",\"secondaryIpv6Prefix\":\"qclnaihtg\"},\"npbStaticRouteConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":490136887,\"multiplier\":1889026122},\"ipv4Routes\":[{\"prefix\":\"p\",\"nextHop\":[]},{\"prefix\":\"glxkoikmtrawrqk\",\"nextHop\":[]},{\"prefix\":\"awbunmpaklw\",\"nextHop\":[]},{\"prefix\":\"lweeprne\",\"nextHop\":[]}],\"ipv6Routes\":[{\"prefix\":\"tkaszfjsxscbdu\",\"nextHop\":[]}]},\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"grcqebmvrdj\",\"importIpv6RoutePolicyId\":\"lnwsbvvdlsf\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"qe\",\"exportIpv6RoutePolicyId\":\"fedsbgz\"},\"egressAclId\":\"coinmphymcqi\",\"ingressAclId\":\"ltvdhqnufbx\",\"configurationState\":\"Rejected\",\"provisioningState\":\"Failed\",\"administrativeState\":\"Enabled\"},\"id\":\"ojovfnybydh\",\"name\":\"ihaouwudhua\",\"type\":\"rhjkehw\"}],\"nextLink\":\"mosqircamqprlob\"}")
                .toObject(NetworkToNetworkInterconnectsList.class);
        Assertions.assertEquals(NniType.NPB, model.value().get(0).nniType());
        Assertions.assertEquals(IsManagementType.FALSE, model.value().get(0).isManagementType());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, model.value().get(0).useOptionB());
        Assertions.assertEquals(1585075235, model.value().get(0).layer2Configuration().mtu());
        Assertions.assertEquals("qliwkmzojf", model.value().get(0).layer2Configuration().interfaces().get(0));
        Assertions.assertEquals("rcmmaixpqj", model.value().get(0).optionBLayer3Configuration().primaryIpv4Prefix());
        Assertions.assertEquals("ifhb", model.value().get(0).optionBLayer3Configuration().primaryIpv6Prefix());
        Assertions.assertEquals("ldtt", model.value().get(0).optionBLayer3Configuration().secondaryIpv4Prefix());
        Assertions.assertEquals("qclnaihtg", model.value().get(0).optionBLayer3Configuration().secondaryIpv6Prefix());
        Assertions.assertEquals(5190256841350116865L, model.value().get(0).optionBLayer3Configuration().peerAsn());
        Assertions.assertEquals(1926341544, model.value().get(0).optionBLayer3Configuration().vlanId());
        Assertions
            .assertEquals(
                490136887,
                model.value().get(0).npbStaticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions
            .assertEquals(
                1889026122, model.value().get(0).npbStaticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("p", model.value().get(0).npbStaticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions
            .assertEquals(
                "tkaszfjsxscbdu", model.value().get(0).npbStaticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("grcqebmvrdj", model.value().get(0).importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("lnwsbvvdlsf", model.value().get(0).importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("qe", model.value().get(0).exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("fedsbgz", model.value().get(0).exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("coinmphymcqi", model.value().get(0).egressAclId());
        Assertions.assertEquals("ltvdhqnufbx", model.value().get(0).ingressAclId());
        Assertions.assertEquals("mosqircamqprlob", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkToNetworkInterconnectsList model =
            new NetworkToNetworkInterconnectsList()
                .withValue(
                    Arrays
                        .asList(
                            new NetworkToNetworkInterconnectInner()
                                .withNniType(NniType.NPB)
                                .withIsManagementType(IsManagementType.FALSE)
                                .withUseOptionB(BooleanEnumProperty.TRUE)
                                .withLayer2Configuration(
                                    new Layer2Configuration()
                                        .withMtu(1585075235)
                                        .withInterfaces(Arrays.asList("qliwkmzojf", "tyalh", "gmknazgbjbh")))
                                .withOptionBLayer3Configuration(
                                    new NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration()
                                        .withPrimaryIpv4Prefix("rcmmaixpqj")
                                        .withPrimaryIpv6Prefix("ifhb")
                                        .withSecondaryIpv4Prefix("ldtt")
                                        .withSecondaryIpv6Prefix("qclnaihtg")
                                        .withPeerAsn(5190256841350116865L)
                                        .withVlanId(1926341544))
                                .withNpbStaticRouteConfiguration(
                                    new NpbStaticRouteConfiguration()
                                        .withBfdConfiguration(
                                            new BfdConfiguration()
                                                .withIntervalInMilliSeconds(490136887)
                                                .withMultiplier(1889026122))
                                        .withIpv4Routes(
                                            Arrays
                                                .asList(
                                                    new StaticRouteProperties()
                                                        .withPrefix("p")
                                                        .withNextHop(Arrays.asList()),
                                                    new StaticRouteProperties()
                                                        .withPrefix("glxkoikmtrawrqk")
                                                        .withNextHop(Arrays.asList()),
                                                    new StaticRouteProperties()
                                                        .withPrefix("awbunmpaklw")
                                                        .withNextHop(Arrays.asList()),
                                                    new StaticRouteProperties()
                                                        .withPrefix("lweeprne")
                                                        .withNextHop(Arrays.asList())))
                                        .withIpv6Routes(
                                            Arrays
                                                .asList(
                                                    new StaticRouteProperties()
                                                        .withPrefix("tkaszfjsxscbdu")
                                                        .withNextHop(Arrays.asList()))))
                                .withImportRoutePolicy(
                                    new ImportRoutePolicyInformation()
                                        .withImportIpv4RoutePolicyId("grcqebmvrdj")
                                        .withImportIpv6RoutePolicyId("lnwsbvvdlsf"))
                                .withExportRoutePolicy(
                                    new ExportRoutePolicyInformation()
                                        .withExportIpv4RoutePolicyId("qe")
                                        .withExportIpv6RoutePolicyId("fedsbgz"))
                                .withEgressAclId("coinmphymcqi")
                                .withIngressAclId("ltvdhqnufbx")))
                .withNextLink("mosqircamqprlob");
        model = BinaryData.fromObject(model).toObject(NetworkToNetworkInterconnectsList.class);
        Assertions.assertEquals(NniType.NPB, model.value().get(0).nniType());
        Assertions.assertEquals(IsManagementType.FALSE, model.value().get(0).isManagementType());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, model.value().get(0).useOptionB());
        Assertions.assertEquals(1585075235, model.value().get(0).layer2Configuration().mtu());
        Assertions.assertEquals("qliwkmzojf", model.value().get(0).layer2Configuration().interfaces().get(0));
        Assertions.assertEquals("rcmmaixpqj", model.value().get(0).optionBLayer3Configuration().primaryIpv4Prefix());
        Assertions.assertEquals("ifhb", model.value().get(0).optionBLayer3Configuration().primaryIpv6Prefix());
        Assertions.assertEquals("ldtt", model.value().get(0).optionBLayer3Configuration().secondaryIpv4Prefix());
        Assertions.assertEquals("qclnaihtg", model.value().get(0).optionBLayer3Configuration().secondaryIpv6Prefix());
        Assertions.assertEquals(5190256841350116865L, model.value().get(0).optionBLayer3Configuration().peerAsn());
        Assertions.assertEquals(1926341544, model.value().get(0).optionBLayer3Configuration().vlanId());
        Assertions
            .assertEquals(
                490136887,
                model.value().get(0).npbStaticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions
            .assertEquals(
                1889026122, model.value().get(0).npbStaticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("p", model.value().get(0).npbStaticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions
            .assertEquals(
                "tkaszfjsxscbdu", model.value().get(0).npbStaticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("grcqebmvrdj", model.value().get(0).importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("lnwsbvvdlsf", model.value().get(0).importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("qe", model.value().get(0).exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("fedsbgz", model.value().get(0).exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("coinmphymcqi", model.value().get(0).egressAclId());
        Assertions.assertEquals("ltvdhqnufbx", model.value().get(0).ingressAclId());
        Assertions.assertEquals("mosqircamqprlob", model.nextLink());
    }
}
