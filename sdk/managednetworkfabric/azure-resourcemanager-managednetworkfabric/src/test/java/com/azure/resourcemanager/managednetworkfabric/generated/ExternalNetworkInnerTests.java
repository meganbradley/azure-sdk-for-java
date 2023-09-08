// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ExternalNetworkInner;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworkPropertiesOptionAProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.L3OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import com.azure.resourcemanager.managednetworkfabric.models.RouteTargetInformation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExternalNetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalNetworkInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"networkToNetworkInterconnectId\":\"bmsgycqsxrmdv\",\"peeringOption\":\"OptionA\",\"optionBProperties\":{\"importRouteTargets\":[\"aeohpjhgejkbvhh\"],\"exportRouteTargets\":[\"rgh\",\"oxae\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"xjxjoe\",\"lqxr\",\"dknkobe\",\"tmbozomtzamicbig\"],\"importIpv6RouteTargets\":[\"gzseznuxkeua\",\"raabmdlqjb\"],\"exportIpv4RouteTargets\":[\"f\",\"xlhupmomihzbdnp\",\"pkcdpreyxely\"],\"exportIpv6RouteTargets\":[\"hflrufssjyghsfx\",\"kb\",\"ammgmqfmefgv\",\"cpdwjgquxwey\"]}},\"optionAProperties\":{\"mtu\":623314328,\"vlanId\":632132991,\"fabricASN\":8484596339350627164,\"peerASN\":3718211800072849399,\"bfdConfiguration\":{\"administrativeState\":\"MAT\",\"intervalInMilliSeconds\":615370227,\"multiplier\":1611420396},\"ingressAclId\":\"nrrnquoxsoti\",\"egressAclId\":\"imseobf\",\"primaryIpv4Prefix\":\"stcyilbvzmmxcjz\",\"primaryIpv6Prefix\":\"uzexokjxebjvbzin\",\"secondaryIpv4Prefix\":\"bwmvogljsvl\",\"secondaryIpv6Prefix\":\"idnwceha\"},\"configurationState\":\"Rejected\",\"provisioningState\":\"Accepted\",\"administrativeState\":\"Enabled\",\"importRoutePolicyId\":\"giomqo\",\"exportRoutePolicyId\":\"epiaeapfsergd\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"qnacyheq\",\"importIpv6RoutePolicyId\":\"pqqncju\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"jozfym\",\"exportIpv6RoutePolicyId\":\"m\"},\"annotation\":\"pyvqy\"},\"id\":\"li\",\"name\":\"iipsejbsvsiaies\",\"type\":\"hddzydisnuepy\"}")
                .toObject(ExternalNetworkInner.class);
        Assertions.assertEquals(PeeringOption.OPTIONA, model.peeringOption());
        Assertions.assertEquals("aeohpjhgejkbvhh", model.optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("rgh", model.optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("xjxjoe", model.optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions
            .assertEquals("gzseznuxkeua", model.optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("f", model.optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions
            .assertEquals("hflrufssjyghsfx", model.optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals("stcyilbvzmmxcjz", model.optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("uzexokjxebjvbzin", model.optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("bwmvogljsvl", model.optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("idnwceha", model.optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(623314328, model.optionAProperties().mtu());
        Assertions.assertEquals(632132991, model.optionAProperties().vlanId());
        Assertions.assertEquals(3718211800072849399L, model.optionAProperties().peerAsn());
        Assertions.assertEquals(615370227, model.optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1611420396, model.optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("nrrnquoxsoti", model.optionAProperties().ingressAclId());
        Assertions.assertEquals("imseobf", model.optionAProperties().egressAclId());
        Assertions.assertEquals("giomqo", model.importRoutePolicyId());
        Assertions.assertEquals("epiaeapfsergd", model.exportRoutePolicyId());
        Assertions.assertEquals("qnacyheq", model.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("pqqncju", model.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("jozfym", model.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("m", model.exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("pyvqy", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalNetworkInner model =
            new ExternalNetworkInner()
                .withPeeringOption(PeeringOption.OPTIONA)
                .withOptionBProperties(
                    new L3OptionBProperties()
                        .withImportRouteTargets(Arrays.asList("aeohpjhgejkbvhh"))
                        .withExportRouteTargets(Arrays.asList("rgh", "oxae"))
                        .withRouteTargets(
                            new RouteTargetInformation()
                                .withImportIpv4RouteTargets(
                                    Arrays.asList("xjxjoe", "lqxr", "dknkobe", "tmbozomtzamicbig"))
                                .withImportIpv6RouteTargets(Arrays.asList("gzseznuxkeua", "raabmdlqjb"))
                                .withExportIpv4RouteTargets(Arrays.asList("f", "xlhupmomihzbdnp", "pkcdpreyxely"))
                                .withExportIpv6RouteTargets(
                                    Arrays.asList("hflrufssjyghsfx", "kb", "ammgmqfmefgv", "cpdwjgquxwey"))))
                .withOptionAProperties(
                    new ExternalNetworkPropertiesOptionAProperties()
                        .withPrimaryIpv4Prefix("stcyilbvzmmxcjz")
                        .withPrimaryIpv6Prefix("uzexokjxebjvbzin")
                        .withSecondaryIpv4Prefix("bwmvogljsvl")
                        .withSecondaryIpv6Prefix("idnwceha")
                        .withMtu(623314328)
                        .withVlanId(632132991)
                        .withPeerAsn(3718211800072849399L)
                        .withBfdConfiguration(
                            new BfdConfiguration().withIntervalInMilliSeconds(615370227).withMultiplier(1611420396))
                        .withIngressAclId("nrrnquoxsoti")
                        .withEgressAclId("imseobf"))
                .withImportRoutePolicyId("giomqo")
                .withExportRoutePolicyId("epiaeapfsergd")
                .withImportRoutePolicy(
                    new ImportRoutePolicy()
                        .withImportIpv4RoutePolicyId("qnacyheq")
                        .withImportIpv6RoutePolicyId("pqqncju"))
                .withExportRoutePolicy(
                    new ExportRoutePolicy().withExportIpv4RoutePolicyId("jozfym").withExportIpv6RoutePolicyId("m"))
                .withAnnotation("pyvqy");
        model = BinaryData.fromObject(model).toObject(ExternalNetworkInner.class);
        Assertions.assertEquals(PeeringOption.OPTIONA, model.peeringOption());
        Assertions.assertEquals("aeohpjhgejkbvhh", model.optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("rgh", model.optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("xjxjoe", model.optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions
            .assertEquals("gzseznuxkeua", model.optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("f", model.optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions
            .assertEquals("hflrufssjyghsfx", model.optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals("stcyilbvzmmxcjz", model.optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("uzexokjxebjvbzin", model.optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("bwmvogljsvl", model.optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("idnwceha", model.optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(623314328, model.optionAProperties().mtu());
        Assertions.assertEquals(632132991, model.optionAProperties().vlanId());
        Assertions.assertEquals(3718211800072849399L, model.optionAProperties().peerAsn());
        Assertions.assertEquals(615370227, model.optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1611420396, model.optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("nrrnquoxsoti", model.optionAProperties().ingressAclId());
        Assertions.assertEquals("imseobf", model.optionAProperties().egressAclId());
        Assertions.assertEquals("giomqo", model.importRoutePolicyId());
        Assertions.assertEquals("epiaeapfsergd", model.exportRoutePolicyId());
        Assertions.assertEquals("qnacyheq", model.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("pqqncju", model.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("jozfym", model.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("m", model.exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("pyvqy", model.annotation());
    }
}
