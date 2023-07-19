// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyPropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworkConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworkResourceId;
import com.azure.resourcemanager.mobilenetwork.models.PduSessionType;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionCapability;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionVulnerability;
import com.azure.resourcemanager.mobilenetwork.models.ServiceResourceId;
import com.azure.resourcemanager.mobilenetwork.models.SliceConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.SliceResourceId;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SimPolicyPropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimPolicyPropertiesFormat model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Unknown\",\"siteProvisioningState\":{\"ovibrxkp\":\"Updating\",\"oaz\":\"Provisioned\"},\"ueAmbr\":{\"uplink\":\"ruocbgo\",\"downlink\":\"rb\"},\"defaultSlice\":{\"id\":\"eoybfhjxakvvjgs\"},\"rfspIndex\":36886384,\"registrationTimer\":417144058,\"sliceConfigurations\":[{\"slice\":{\"id\":\"mywwtkgkxnyed\"},\"defaultDataNetwork\":{\"id\":\"b\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"vudtjuewbcihx\"},\"sessionAmbr\":{\"uplink\":\"uwhcjyxccybv\",\"downlink\":\"ayakkudzpx\"},\"5qi\":431593989,\"allocationAndRetentionPriorityLevel\":710163355,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv6\",\"IPv4\",\"IPv4\"],\"allowedServices\":[{\"id\":\"rkdbdgiogsjkmnwq\"},{\"id\":\"nobaiyhddviacegf\"},{\"id\":\"m\"},{\"id\":\"tfpmvmemfnczdw\"}],\"maximumNumberOfBufferedPackets\":201856710},{\"dataNetwork\":{\"id\":\"alxlllchp\"},\"sessionAmbr\":{\"uplink\":\"db\",\"downlink\":\"evwrdnhfuk\"},\"5qi\":1934709471,\"allocationAndRetentionPriorityLevel\":437386763,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv6\"],\"allowedServices\":[{\"id\":\"ypfcvlerchpqbmf\"},{\"id\":\"jbabwidf\"}],\"maximumNumberOfBufferedPackets\":1264081959},{\"dataNetwork\":{\"id\":\"spuunnoxyhkxgq\"},\"sessionAmbr\":{\"uplink\":\"drihpfhoqcaaewda\",\"downlink\":\"mdjvlpj\"},\"5qi\":1119660278,\"allocationAndRetentionPriorityLevel\":785056478,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv6\",\"IPv6\",\"IPv4\"],\"allowedServices\":[{\"id\":\"dncj\"},{\"id\":\"xonbzoggculapz\"}],\"maximumNumberOfBufferedPackets\":350819792}]},{\"slice\":{\"id\":\"pgogtqxepny\"},\"defaultDataNetwork\":{\"id\":\"b\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"ajlyjtlvofqzhv\"},\"sessionAmbr\":{\"uplink\":\"cib\",\"downlink\":\"fmo\"},\"5qi\":1885560912,\"allocationAndRetentionPriorityLevel\":2073572107,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv6\",\"IPv6\",\"IPv4\"],\"allowedServices\":[{\"id\":\"zjb\"},{\"id\":\"yzsxjrkambtrne\"}],\"maximumNumberOfBufferedPackets\":1525920075},{\"dataNetwork\":{\"id\":\"nvuqeqvldspa\"},\"sessionAmbr\":{\"uplink\":\"tjb\",\"downlink\":\"kdmflvestmjlx\"},\"5qi\":1811256055,\"allocationAndRetentionPriorityLevel\":1713301534,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv6\",\"IPv6\",\"IPv6\"],\"allowedServices\":[{\"id\":\"wk\"},{\"id\":\"ziycslevufuztck\"},{\"id\":\"yhjtqedcgzu\"}],\"maximumNumberOfBufferedPackets\":1160577956}]},{\"slice\":{\"id\":\"mrqzzrrjvpgl\"},\"defaultDataNetwork\":{\"id\":\"dzgkr\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"eevt\"},\"sessionAmbr\":{\"uplink\":\"epr\",\"downlink\":\"utnwytpzdmovzvf\"},\"5qi\":1925116648,\"allocationAndRetentionPriorityLevel\":1341644400,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv4\"],\"allowedServices\":[{\"id\":\"glae\"},{\"id\":\"xndticokpvzmlqtm\"}],\"maximumNumberOfBufferedPackets\":763019330},{\"dataNetwork\":{\"id\":\"x\"},\"sessionAmbr\":{\"uplink\":\"bf\",\"downlink\":\"rclnpkc\"},\"5qi\":1931804941,\"allocationAndRetentionPriorityLevel\":1808660907,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv6\",\"IPv4\",\"IPv6\",\"IPv4\"],\"allowedServices\":[{\"id\":\"xqvkjlmxhomdyn\"},{\"id\":\"dwdigumb\"},{\"id\":\"raauzzpt\"},{\"id\":\"a\"}],\"maximumNumberOfBufferedPackets\":2034990044}]},{\"slice\":{\"id\":\"dz\"},\"defaultDataNetwork\":{\"id\":\"ezwwv\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"qyuvvfonkp\"},\"sessionAmbr\":{\"uplink\":\"hqyikvy\",\"downlink\":\"auy\"},\"5qi\":2048419194,\"allocationAndRetentionPriorityLevel\":712290061,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"defaultSessionType\":\"IPv4\",\"additionalAllowedSessionTypes\":[\"IPv4\",\"IPv4\",\"IPv6\",\"IPv4\"],\"allowedServices\":[{\"id\":\"o\"},{\"id\":\"krsgsgb\"},{\"id\":\"huzqgn\"}],\"maximumNumberOfBufferedPackets\":308026039},{\"dataNetwork\":{\"id\":\"kynscliqhzv\"},\"sessionAmbr\":{\"uplink\":\"xnkomtkubo\",\"downlink\":\"ppnvdxz\"},\"5qi\":685064266,\"allocationAndRetentionPriorityLevel\":1207165403,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"defaultSessionType\":\"IPv6\",\"additionalAllowedSessionTypes\":[\"IPv4\",\"IPv6\",\"IPv4\",\"IPv4\"],\"allowedServices\":[{\"id\":\"hlfkqojpy\"},{\"id\":\"vgtrdcnifmzzs\"},{\"id\":\"ymbrnysuxmpraf\"},{\"id\":\"g\"}],\"maximumNumberOfBufferedPackets\":1986449760}]}]}")
                .toObject(SimPolicyPropertiesFormat.class);
        Assertions.assertEquals("ruocbgo", model.ueAmbr().uplink());
        Assertions.assertEquals("rb", model.ueAmbr().downlink());
        Assertions.assertEquals("eoybfhjxakvvjgs", model.defaultSlice().id());
        Assertions.assertEquals(36886384, model.rfspIndex());
        Assertions.assertEquals(417144058, model.registrationTimer());
        Assertions.assertEquals("mywwtkgkxnyed", model.sliceConfigurations().get(0).slice().id());
        Assertions.assertEquals("b", model.sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions
            .assertEquals(
                "vudtjuewbcihx",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).dataNetwork().id());
        Assertions
            .assertEquals(
                "uwhcjyxccybv",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().uplink());
        Assertions
            .assertEquals(
                "ayakkudzpx",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().downlink());
        Assertions
            .assertEquals(431593989, model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).fiveQi());
        Assertions
            .assertEquals(
                710163355,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.NOT_PREEMPT,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.PREEMPTABLE,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionVulnerability());
        Assertions
            .assertEquals(
                PduSessionType.IPV6,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).defaultSessionType());
        Assertions
            .assertEquals(
                PduSessionType.IPV6,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .additionalAllowedSessionTypes()
                    .get(0));
        Assertions
            .assertEquals(
                "rkdbdgiogsjkmnwq",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).allowedServices().get(0).id());
        Assertions
            .assertEquals(
                201856710,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).maximumNumberOfBufferedPackets());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimPolicyPropertiesFormat model =
            new SimPolicyPropertiesFormat()
                .withUeAmbr(new Ambr().withUplink("ruocbgo").withDownlink("rb"))
                .withDefaultSlice(new SliceResourceId().withId("eoybfhjxakvvjgs"))
                .withRfspIndex(36886384)
                .withRegistrationTimer(417144058)
                .withSliceConfigurations(
                    Arrays
                        .asList(
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("mywwtkgkxnyed"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("b"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("vudtjuewbcihx"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("uwhcjyxccybv").withDownlink("ayakkudzpx"))
                                                .withFiveQi(431593989)
                                                .withAllocationAndRetentionPriorityLevel(710163355)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("rkdbdgiogsjkmnwq"),
                                                            new ServiceResourceId().withId("nobaiyhddviacegf"),
                                                            new ServiceResourceId().withId("m"),
                                                            new ServiceResourceId().withId("tfpmvmemfnczdw")))
                                                .withMaximumNumberOfBufferedPackets(201856710),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("alxlllchp"))
                                                .withSessionAmbr(new Ambr().withUplink("db").withDownlink("evwrdnhfuk"))
                                                .withFiveQi(1934709471)
                                                .withAllocationAndRetentionPriorityLevel(437386763)
                                                .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays.asList(PduSessionType.IPV6, PduSessionType.IPV6))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("ypfcvlerchpqbmf"),
                                                            new ServiceResourceId().withId("jbabwidf")))
                                                .withMaximumNumberOfBufferedPackets(1264081959),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("spuunnoxyhkxgq"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("drihpfhoqcaaewda").withDownlink("mdjvlpj"))
                                                .withFiveQi(1119660278)
                                                .withAllocationAndRetentionPriorityLevel(785056478)
                                                .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("dncj"),
                                                            new ServiceResourceId().withId("xonbzoggculapz")))
                                                .withMaximumNumberOfBufferedPackets(350819792))),
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("pgogtqxepny"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("b"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("ajlyjtlvofqzhv"))
                                                .withSessionAmbr(new Ambr().withUplink("cib").withDownlink("fmo"))
                                                .withFiveQi(1885560912)
                                                .withAllocationAndRetentionPriorityLevel(2073572107)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("zjb"),
                                                            new ServiceResourceId().withId("yzsxjrkambtrne")))
                                                .withMaximumNumberOfBufferedPackets(1525920075),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("nvuqeqvldspa"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("tjb").withDownlink("kdmflvestmjlx"))
                                                .withFiveQi(1811256055)
                                                .withAllocationAndRetentionPriorityLevel(1713301534)
                                                .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV6))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("wk"),
                                                            new ServiceResourceId().withId("ziycslevufuztck"),
                                                            new ServiceResourceId().withId("yhjtqedcgzu")))
                                                .withMaximumNumberOfBufferedPackets(1160577956))),
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("mrqzzrrjvpgl"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("dzgkr"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("eevt"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("epr").withDownlink("utnwytpzdmovzvf"))
                                                .withFiveQi(1925116648)
                                                .withAllocationAndRetentionPriorityLevel(1341644400)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(Arrays.asList(PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("glae"),
                                                            new ServiceResourceId().withId("xndticokpvzmlqtm")))
                                                .withMaximumNumberOfBufferedPackets(763019330),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("x"))
                                                .withSessionAmbr(new Ambr().withUplink("bf").withDownlink("rclnpkc"))
                                                .withFiveQi(1931804941)
                                                .withAllocationAndRetentionPriorityLevel(1808660907)
                                                .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("xqvkjlmxhomdyn"),
                                                            new ServiceResourceId().withId("dwdigumb"),
                                                            new ServiceResourceId().withId("raauzzpt"),
                                                            new ServiceResourceId().withId("a")))
                                                .withMaximumNumberOfBufferedPackets(2034990044))),
                            new SliceConfiguration()
                                .withSlice(new SliceResourceId().withId("dz"))
                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("ezwwv"))
                                .withDataNetworkConfigurations(
                                    Arrays
                                        .asList(
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("qyuvvfonkp"))
                                                .withSessionAmbr(new Ambr().withUplink("hqyikvy").withDownlink("auy"))
                                                .withFiveQi(2048419194)
                                                .withAllocationAndRetentionPriorityLevel(712290061)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV4)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("o"),
                                                            new ServiceResourceId().withId("krsgsgb"),
                                                            new ServiceResourceId().withId("huzqgn")))
                                                .withMaximumNumberOfBufferedPackets(308026039),
                                            new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("kynscliqhzv"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("xnkomtkubo").withDownlink("ppnvdxz"))
                                                .withFiveQi(685064266)
                                                .withAllocationAndRetentionPriorityLevel(1207165403)
                                                .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                                .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                                .withDefaultSessionType(PduSessionType.IPV6)
                                                .withAdditionalAllowedSessionTypes(
                                                    Arrays
                                                        .asList(
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV6,
                                                            PduSessionType.IPV4,
                                                            PduSessionType.IPV4))
                                                .withAllowedServices(
                                                    Arrays
                                                        .asList(
                                                            new ServiceResourceId().withId("hlfkqojpy"),
                                                            new ServiceResourceId().withId("vgtrdcnifmzzs"),
                                                            new ServiceResourceId().withId("ymbrnysuxmpraf"),
                                                            new ServiceResourceId().withId("g")))
                                                .withMaximumNumberOfBufferedPackets(1986449760)))));
        model = BinaryData.fromObject(model).toObject(SimPolicyPropertiesFormat.class);
        Assertions.assertEquals("ruocbgo", model.ueAmbr().uplink());
        Assertions.assertEquals("rb", model.ueAmbr().downlink());
        Assertions.assertEquals("eoybfhjxakvvjgs", model.defaultSlice().id());
        Assertions.assertEquals(36886384, model.rfspIndex());
        Assertions.assertEquals(417144058, model.registrationTimer());
        Assertions.assertEquals("mywwtkgkxnyed", model.sliceConfigurations().get(0).slice().id());
        Assertions.assertEquals("b", model.sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions
            .assertEquals(
                "vudtjuewbcihx",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).dataNetwork().id());
        Assertions
            .assertEquals(
                "uwhcjyxccybv",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().uplink());
        Assertions
            .assertEquals(
                "ayakkudzpx",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().downlink());
        Assertions
            .assertEquals(431593989, model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).fiveQi());
        Assertions
            .assertEquals(
                710163355,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.NOT_PREEMPT,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.PREEMPTABLE,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).preemptionVulnerability());
        Assertions
            .assertEquals(
                PduSessionType.IPV6,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).defaultSessionType());
        Assertions
            .assertEquals(
                PduSessionType.IPV6,
                model
                    .sliceConfigurations()
                    .get(0)
                    .dataNetworkConfigurations()
                    .get(0)
                    .additionalAllowedSessionTypes()
                    .get(0));
        Assertions
            .assertEquals(
                "rkdbdgiogsjkmnwq",
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).allowedServices().get(0).id());
        Assertions
            .assertEquals(
                201856710,
                model.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).maximumNumberOfBufferedPackets());
    }
}
