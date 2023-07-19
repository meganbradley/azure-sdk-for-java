// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.CommonDynamicMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationType;
import com.azure.resourcemanager.managednetworkfabric.models.EncapsulationType;
import com.azure.resourcemanager.managednetworkfabric.models.IpAddressType;
import com.azure.resourcemanager.managednetworkfabric.models.IpGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.IpMatchCondition;
import com.azure.resourcemanager.managednetworkfabric.models.Layer4Protocol;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleAction;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleMatchCondition;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRulePatch;
import com.azure.resourcemanager.managednetworkfabric.models.PortCondition;
import com.azure.resourcemanager.managednetworkfabric.models.PortGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.TapRuleActionType;
import com.azure.resourcemanager.managednetworkfabric.models.VlanGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VlanMatchCondition;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapRulePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapRulePatch model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"configurationType\":\"Inline\",\"tapRulesUrl\":\"sgw\",\"matchConfigurations\":[{\"matchConfigurationName\":\"er\",\"sequenceNumber\":7850362678518268102,\"ipAddressType\":\"IPv6\",\"matchConditions\":[{\"encapsulationType\":\"GTPv1\",\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"f\",\"qcooplfpohimgcky\"],\"vlanMatchCondition\":{},\"ipCondition\":{}},{\"encapsulationType\":\"GTPv1\",\"portCondition\":{\"layer4Protocol\":\"UDP\"},\"protocolTypes\":[\"znxsuloutnpbm\",\"ooqohgp\",\"cdmwk\",\"upf\"],\"vlanMatchCondition\":{},\"ipCondition\":{}}],\"actions\":[{\"type\":\"Replicate\",\"truncate\":\"uiunyevdyzdsyt\",\"isTimestampEnabled\":\"False\",\"destinationId\":\"whcamwuynfxkc\",\"matchConfigurationName\":\"fcmvhadrpb\"}]},{\"matchConfigurationName\":\"vyrkljqkq\",\"sequenceNumber\":4996287303866483560,\"ipAddressType\":\"IPv6\",\"matchConditions\":[{\"encapsulationType\":\"None\",\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"wwdmbyp\",\"kteiidlbovwbclpr\",\"eganihk\",\"cnerekyjul\"],\"vlanMatchCondition\":{},\"ipCondition\":{}}],\"actions\":[{\"type\":\"Redirect\",\"truncate\":\"lqgpwxtvceba\",\"isTimestampEnabled\":\"False\",\"destinationId\":\"xwvegenlrj\",\"matchConfigurationName\":\"mwevguyflnxel\"}]}],\"dynamicMatchConfigurations\":[{\"ipGroups\":[{\"name\":\"detowwezhyfkdilb\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"csfqbirtybce\",\"fjnxodnjyhzfaxs\"]},{\"name\":\"vuelumodpegqxso\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"rqoxzyhlbeqvhskb\",\"pwxslaj\",\"gf\",\"gaef\"]}],\"vlanGroups\":[{\"name\":\"mibuyd\",\"vlans\":[\"rnicupdyttqmi\"]},{\"name\":\"jplosebmh\",\"vlans\":[\"qmtxynoflqobf\",\"xngxebihexhnkin\",\"iqcdolrpg\"]},{\"name\":\"sjlbsmndaf\",\"vlans\":[\"uyje\",\"kcnhpplzhc\",\"zxjziuu\",\"rlnewnuwkkfzzetl\"]}],\"portGroups\":[{\"name\":\"xzlv\",\"ports\":[\"j\",\"rlgqp\",\"w\",\"zpddarcbcdwhs\"]},{\"name\":\"ebajadknms\",\"ports\":[\"oprwkampyh\",\"pbldz\",\"iudrcycmwhuzym\"]},{\"name\":\"hihqknlvkmnbzko\",\"ports\":[\"ildcpudkhqu\",\"syjo\"]}]},{\"ipGroups\":[{\"name\":\"edrobujnjgybuxm\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"du\",\"l\",\"jgcpskgrhnytslg\",\"az\"]},{\"name\":\"znghxhk\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"dkpvnrvzw\",\"ffxsfybntmveh\",\"hflyuvbgtz\"]},{\"name\":\"qweuydyb\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"hpq\",\"vbzeogeat\",\"cnqnvncpr\",\"csjvjnkoiznzsqbi\"]}],\"vlanGroups\":[{\"name\":\"gicovjt\",\"vlans\":[\"rmjxyvuodnxc\"]},{\"name\":\"assqfy\",\"vlans\":[\"ppeygkbzbloasy\",\"xhqvovdpmht\"]},{\"name\":\"vsqjs\",\"vlans\":[\"nqt\",\"qgxqbfkc\"]},{\"name\":\"ncnr\",\"vlans\":[\"biywevs\"]}],\"portGroups\":[{\"name\":\"mnszdosmjsqsvzvm\",\"ports\":[\"wghndaevhgs\",\"lwvgseufigv\",\"jjuzk\",\"lmciwuhyzeky\"]},{\"name\":\"ovljlbzdlbybpaxh\",\"ports\":[\"s\",\"v\"]},{\"name\":\"wbh\",\"ports\":[\"gesfhshagpahn\"]},{\"name\":\"pbyfyvynpmggq\",\"ports\":[\"envqbugihcd\"]}]},{\"ipGroups\":[{\"name\":\"zorbloejzsax\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"vde\",\"p\",\"naphifkfrpmpl\",\"bpebrmj\"]},{\"name\":\"fpghtbttpkim\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"khbykrsmhrcme\",\"ycpgokuthrvyb\",\"zbnv\"]},{\"name\":\"hfuzzlapyixlvz\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"ebxiauqsuptessj\"]}],\"vlanGroups\":[{\"name\":\"atpvbl\",\"vlans\":[\"gxqaygaslkvcvwpv\",\"cj\"]},{\"name\":\"yezj\",\"vlans\":[\"qonbwhiieyoz\"]},{\"name\":\"cwf\",\"vlans\":[\"wnbcgqefgzjvbx\",\"cbgoarxtuuciagv\",\"dlhuduklbjo\",\"fmjfexulv\"]},{\"name\":\"pknarse\",\"vlans\":[\"csqoacbuqdgs\",\"pleqfgkxenvszglv\",\"akeszsuuvul\"]}],\"portGroups\":[{\"name\":\"ggchxvlqgf\",\"ports\":[\"ecicaovph\",\"rlzbipi\"]}]},{\"ipGroups\":[{\"name\":\"pkwzzzkueruwcj\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"wkau\",\"ttwyk\",\"xv\"]}],\"vlanGroups\":[{\"name\":\"xxdplrelfkvga\",\"vlans\":[\"tuxlbpxrhrfjen\",\"azwef\",\"ktlhqash\",\"ostjixyz\"]},{\"name\":\"cigz\",\"vlans\":[\"j\",\"acfvvtdpcbpzf\"]},{\"name\":\"csaugbrhfiwltkfy\",\"vlans\":[\"te\",\"hkl\",\"whcv\"]}],\"portGroups\":[{\"name\":\"hgqok\",\"ports\":[\"srkixy\",\"xhwr\",\"qomaqsyilpzzbrw\",\"rzozsxagyso\"]},{\"name\":\"iiksybvrrbnhyl\",\"ports\":[\"ujcy\"]},{\"name\":\"llmxvpstiz\",\"ports\":[\"agq\"]}]}],\"annotation\":\"cbrvaidylkyhtrr\"},\"tags\":{\"rnogyk\":\"yybptmj\",\"thkslgeuufkb\":\"gdlavsav\",\"lajybdnb\":\"bfbxj\"}}")
                .toObject(NetworkTapRulePatch.class);
        Assertions.assertEquals("yybptmj", model.tags().get("rnogyk"));
        Assertions.assertEquals(ConfigurationType.INLINE, model.configurationType());
        Assertions.assertEquals("sgw", model.tapRulesUrl());
        Assertions.assertEquals("er", model.matchConfigurations().get(0).matchConfigurationName());
        Assertions.assertEquals(7850362678518268102L, model.matchConfigurations().get(0).sequenceNumber());
        Assertions.assertEquals(IpAddressType.IPV6, model.matchConfigurations().get(0).ipAddressType());
        Assertions
            .assertEquals("f", model.matchConfigurations().get(0).matchConditions().get(0).protocolTypes().get(0));
        Assertions
            .assertEquals(
                EncapsulationType.GTPV1,
                model.matchConfigurations().get(0).matchConditions().get(0).encapsulationType());
        Assertions
            .assertEquals(
                Layer4Protocol.TCP,
                model.matchConfigurations().get(0).matchConditions().get(0).portCondition().layer4Protocol());
        Assertions
            .assertEquals(TapRuleActionType.REPLICATE, model.matchConfigurations().get(0).actions().get(0).type());
        Assertions.assertEquals("uiunyevdyzdsyt", model.matchConfigurations().get(0).actions().get(0).truncate());
        Assertions
            .assertEquals(
                BooleanEnumProperty.FALSE, model.matchConfigurations().get(0).actions().get(0).isTimestampEnabled());
        Assertions.assertEquals("whcamwuynfxkc", model.matchConfigurations().get(0).actions().get(0).destinationId());
        Assertions
            .assertEquals("fcmvhadrpb", model.matchConfigurations().get(0).actions().get(0).matchConfigurationName());
        Assertions.assertEquals("detowwezhyfkdilb", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).name());
        Assertions
            .assertEquals(
                IpAddressType.IPV6, model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipAddressType());
        Assertions
            .assertEquals(
                "csfqbirtybce", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("mibuyd", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).name());
        Assertions
            .assertEquals(
                "rnicupdyttqmi", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("xzlv", model.dynamicMatchConfigurations().get(0).portGroups().get(0).name());
        Assertions.assertEquals("j", model.dynamicMatchConfigurations().get(0).portGroups().get(0).ports().get(0));
        Assertions.assertEquals("cbrvaidylkyhtrr", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapRulePatch model =
            new NetworkTapRulePatch()
                .withTags(mapOf("rnogyk", "yybptmj", "thkslgeuufkb", "gdlavsav", "lajybdnb", "bfbxj"))
                .withConfigurationType(ConfigurationType.INLINE)
                .withTapRulesUrl("sgw")
                .withMatchConfigurations(
                    Arrays
                        .asList(
                            new NetworkTapRuleMatchConfiguration()
                                .withMatchConfigurationName("er")
                                .withSequenceNumber(7850362678518268102L)
                                .withIpAddressType(IpAddressType.IPV6)
                                .withMatchConditions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleMatchCondition()
                                                .withProtocolTypes(Arrays.asList("f", "qcooplfpohimgcky"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEncapsulationType(EncapsulationType.GTPV1)
                                                .withPortCondition(
                                                    new PortCondition().withLayer4Protocol(Layer4Protocol.TCP)),
                                            new NetworkTapRuleMatchCondition()
                                                .withProtocolTypes(
                                                    Arrays.asList("znxsuloutnpbm", "ooqohgp", "cdmwk", "upf"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEncapsulationType(EncapsulationType.GTPV1)
                                                .withPortCondition(
                                                    new PortCondition().withLayer4Protocol(Layer4Protocol.UDP))))
                                .withActions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleAction()
                                                .withType(TapRuleActionType.REPLICATE)
                                                .withTruncate("uiunyevdyzdsyt")
                                                .withIsTimestampEnabled(BooleanEnumProperty.FALSE)
                                                .withDestinationId("whcamwuynfxkc")
                                                .withMatchConfigurationName("fcmvhadrpb"))),
                            new NetworkTapRuleMatchConfiguration()
                                .withMatchConfigurationName("vyrkljqkq")
                                .withSequenceNumber(4996287303866483560L)
                                .withIpAddressType(IpAddressType.IPV6)
                                .withMatchConditions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleMatchCondition()
                                                .withProtocolTypes(
                                                    Arrays
                                                        .asList("wwdmbyp", "kteiidlbovwbclpr", "eganihk", "cnerekyjul"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEncapsulationType(EncapsulationType.NONE)
                                                .withPortCondition(
                                                    new PortCondition().withLayer4Protocol(Layer4Protocol.TCP))))
                                .withActions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleAction()
                                                .withType(TapRuleActionType.REDIRECT)
                                                .withTruncate("lqgpwxtvceba")
                                                .withIsTimestampEnabled(BooleanEnumProperty.FALSE)
                                                .withDestinationId("xwvegenlrj")
                                                .withMatchConfigurationName("mwevguyflnxel")))))
                .withDynamicMatchConfigurations(
                    Arrays
                        .asList(
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(
                                    Arrays
                                        .asList(
                                            new IpGroupProperties()
                                                .withName("detowwezhyfkdilb")
                                                .withIpAddressType(IpAddressType.IPV6)
                                                .withIpPrefixes(Arrays.asList("csfqbirtybce", "fjnxodnjyhzfaxs")),
                                            new IpGroupProperties()
                                                .withName("vuelumodpegqxso")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(
                                                    Arrays.asList("rqoxzyhlbeqvhskb", "pwxslaj", "gf", "gaef"))))
                                .withVlanGroups(
                                    Arrays
                                        .asList(
                                            new VlanGroupProperties()
                                                .withName("mibuyd")
                                                .withVlans(Arrays.asList("rnicupdyttqmi")),
                                            new VlanGroupProperties()
                                                .withName("jplosebmh")
                                                .withVlans(
                                                    Arrays.asList("qmtxynoflqobf", "xngxebihexhnkin", "iqcdolrpg")),
                                            new VlanGroupProperties()
                                                .withName("sjlbsmndaf")
                                                .withVlans(
                                                    Arrays
                                                        .asList("uyje", "kcnhpplzhc", "zxjziuu", "rlnewnuwkkfzzetl"))))
                                .withPortGroups(
                                    Arrays
                                        .asList(
                                            new PortGroupProperties()
                                                .withName("xzlv")
                                                .withPorts(Arrays.asList("j", "rlgqp", "w", "zpddarcbcdwhs")),
                                            new PortGroupProperties()
                                                .withName("ebajadknms")
                                                .withPorts(Arrays.asList("oprwkampyh", "pbldz", "iudrcycmwhuzym")),
                                            new PortGroupProperties()
                                                .withName("hihqknlvkmnbzko")
                                                .withPorts(Arrays.asList("ildcpudkhqu", "syjo")))),
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(
                                    Arrays
                                        .asList(
                                            new IpGroupProperties()
                                                .withName("edrobujnjgybuxm")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(Arrays.asList("du", "l", "jgcpskgrhnytslg", "az")),
                                            new IpGroupProperties()
                                                .withName("znghxhk")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(
                                                    Arrays.asList("dkpvnrvzw", "ffxsfybntmveh", "hflyuvbgtz")),
                                            new IpGroupProperties()
                                                .withName("qweuydyb")
                                                .withIpAddressType(IpAddressType.IPV6)
                                                .withIpPrefixes(
                                                    Arrays
                                                        .asList("hpq", "vbzeogeat", "cnqnvncpr", "csjvjnkoiznzsqbi"))))
                                .withVlanGroups(
                                    Arrays
                                        .asList(
                                            new VlanGroupProperties()
                                                .withName("gicovjt")
                                                .withVlans(Arrays.asList("rmjxyvuodnxc")),
                                            new VlanGroupProperties()
                                                .withName("assqfy")
                                                .withVlans(Arrays.asList("ppeygkbzbloasy", "xhqvovdpmht")),
                                            new VlanGroupProperties()
                                                .withName("vsqjs")
                                                .withVlans(Arrays.asList("nqt", "qgxqbfkc")),
                                            new VlanGroupProperties()
                                                .withName("ncnr")
                                                .withVlans(Arrays.asList("biywevs"))))
                                .withPortGroups(
                                    Arrays
                                        .asList(
                                            new PortGroupProperties()
                                                .withName("mnszdosmjsqsvzvm")
                                                .withPorts(
                                                    Arrays
                                                        .asList("wghndaevhgs", "lwvgseufigv", "jjuzk", "lmciwuhyzeky")),
                                            new PortGroupProperties()
                                                .withName("ovljlbzdlbybpaxh")
                                                .withPorts(Arrays.asList("s", "v")),
                                            new PortGroupProperties()
                                                .withName("wbh")
                                                .withPorts(Arrays.asList("gesfhshagpahn")),
                                            new PortGroupProperties()
                                                .withName("pbyfyvynpmggq")
                                                .withPorts(Arrays.asList("envqbugihcd")))),
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(
                                    Arrays
                                        .asList(
                                            new IpGroupProperties()
                                                .withName("zorbloejzsax")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(Arrays.asList("vde", "p", "naphifkfrpmpl", "bpebrmj")),
                                            new IpGroupProperties()
                                                .withName("fpghtbttpkim")
                                                .withIpAddressType(IpAddressType.IPV6)
                                                .withIpPrefixes(
                                                    Arrays.asList("khbykrsmhrcme", "ycpgokuthrvyb", "zbnv")),
                                            new IpGroupProperties()
                                                .withName("hfuzzlapyixlvz")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(Arrays.asList("ebxiauqsuptessj"))))
                                .withVlanGroups(
                                    Arrays
                                        .asList(
                                            new VlanGroupProperties()
                                                .withName("atpvbl")
                                                .withVlans(Arrays.asList("gxqaygaslkvcvwpv", "cj")),
                                            new VlanGroupProperties()
                                                .withName("yezj")
                                                .withVlans(Arrays.asList("qonbwhiieyoz")),
                                            new VlanGroupProperties()
                                                .withName("cwf")
                                                .withVlans(
                                                    Arrays
                                                        .asList(
                                                            "wnbcgqefgzjvbx",
                                                            "cbgoarxtuuciagv",
                                                            "dlhuduklbjo",
                                                            "fmjfexulv")),
                                            new VlanGroupProperties()
                                                .withName("pknarse")
                                                .withVlans(
                                                    Arrays.asList("csqoacbuqdgs", "pleqfgkxenvszglv", "akeszsuuvul"))))
                                .withPortGroups(
                                    Arrays
                                        .asList(
                                            new PortGroupProperties()
                                                .withName("ggchxvlqgf")
                                                .withPorts(Arrays.asList("ecicaovph", "rlzbipi")))),
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(
                                    Arrays
                                        .asList(
                                            new IpGroupProperties()
                                                .withName("pkwzzzkueruwcj")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(Arrays.asList("wkau", "ttwyk", "xv"))))
                                .withVlanGroups(
                                    Arrays
                                        .asList(
                                            new VlanGroupProperties()
                                                .withName("xxdplrelfkvga")
                                                .withVlans(
                                                    Arrays.asList("tuxlbpxrhrfjen", "azwef", "ktlhqash", "ostjixyz")),
                                            new VlanGroupProperties()
                                                .withName("cigz")
                                                .withVlans(Arrays.asList("j", "acfvvtdpcbpzf")),
                                            new VlanGroupProperties()
                                                .withName("csaugbrhfiwltkfy")
                                                .withVlans(Arrays.asList("te", "hkl", "whcv"))))
                                .withPortGroups(
                                    Arrays
                                        .asList(
                                            new PortGroupProperties()
                                                .withName("hgqok")
                                                .withPorts(
                                                    Arrays.asList("srkixy", "xhwr", "qomaqsyilpzzbrw", "rzozsxagyso")),
                                            new PortGroupProperties()
                                                .withName("iiksybvrrbnhyl")
                                                .withPorts(Arrays.asList("ujcy")),
                                            new PortGroupProperties()
                                                .withName("llmxvpstiz")
                                                .withPorts(Arrays.asList("agq"))))))
                .withAnnotation("cbrvaidylkyhtrr");
        model = BinaryData.fromObject(model).toObject(NetworkTapRulePatch.class);
        Assertions.assertEquals("yybptmj", model.tags().get("rnogyk"));
        Assertions.assertEquals(ConfigurationType.INLINE, model.configurationType());
        Assertions.assertEquals("sgw", model.tapRulesUrl());
        Assertions.assertEquals("er", model.matchConfigurations().get(0).matchConfigurationName());
        Assertions.assertEquals(7850362678518268102L, model.matchConfigurations().get(0).sequenceNumber());
        Assertions.assertEquals(IpAddressType.IPV6, model.matchConfigurations().get(0).ipAddressType());
        Assertions
            .assertEquals("f", model.matchConfigurations().get(0).matchConditions().get(0).protocolTypes().get(0));
        Assertions
            .assertEquals(
                EncapsulationType.GTPV1,
                model.matchConfigurations().get(0).matchConditions().get(0).encapsulationType());
        Assertions
            .assertEquals(
                Layer4Protocol.TCP,
                model.matchConfigurations().get(0).matchConditions().get(0).portCondition().layer4Protocol());
        Assertions
            .assertEquals(TapRuleActionType.REPLICATE, model.matchConfigurations().get(0).actions().get(0).type());
        Assertions.assertEquals("uiunyevdyzdsyt", model.matchConfigurations().get(0).actions().get(0).truncate());
        Assertions
            .assertEquals(
                BooleanEnumProperty.FALSE, model.matchConfigurations().get(0).actions().get(0).isTimestampEnabled());
        Assertions.assertEquals("whcamwuynfxkc", model.matchConfigurations().get(0).actions().get(0).destinationId());
        Assertions
            .assertEquals("fcmvhadrpb", model.matchConfigurations().get(0).actions().get(0).matchConfigurationName());
        Assertions.assertEquals("detowwezhyfkdilb", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).name());
        Assertions
            .assertEquals(
                IpAddressType.IPV6, model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipAddressType());
        Assertions
            .assertEquals(
                "csfqbirtybce", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("mibuyd", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).name());
        Assertions
            .assertEquals(
                "rnicupdyttqmi", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("xzlv", model.dynamicMatchConfigurations().get(0).portGroups().get(0).name());
        Assertions.assertEquals("j", model.dynamicMatchConfigurations().get(0).portGroups().get(0).ports().get(0));
        Assertions.assertEquals("cbrvaidylkyhtrr", model.annotation());
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
