// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreDataPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreDataPlaneListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreDataPlaneListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreDataPlaneListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"userPlaneAccessInterface\":{\"name\":\"tibqdxbxwakb\",\"ipv4Address\":\"qxn\",\"ipv4Subnet\":\"kzgxhurip\",\"ipv4Gateway\":\"podxunkb\"},\"userPlaneAccessVirtualIpv4Addresses\":[\"mubyynt\",\"lrb\",\"tkoievseotgq\",\"l\"]},\"location\":\"muwlauwzizxbm\",\"tags\":{\"p\":\"jefuzmuvpbttdumo\",\"mnzb\":\"xe\"},\"id\":\"bhjpglkfgohdne\",\"name\":\"el\",\"type\":\"phsdyhto\"},{\"properties\":{\"provisioningState\":\"Accepted\",\"userPlaneAccessInterface\":{\"name\":\"dowwquuvxzxclvit\",\"ipv4Address\":\"qzonosggbhcohf\",\"ipv4Subnet\":\"sjnkal\",\"ipv4Gateway\":\"tiiswacffg\"},\"userPlaneAccessVirtualIpv4Addresses\":[\"zewk\",\"vhqcrail\",\"pnppfuf\",\"rwdmhdlxyjrxsa\"]},\"location\":\"fcnihgwq\",\"tags\":{\"pkeqdcvdrhvoo\":\"edgfbcvkcvq\",\"dopcjwvnh\":\"sotbob\"},\"id\":\"ld\",\"name\":\"mgxcxrslpm\",\"type\":\"twuoegrpkhjwni\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"userPlaneAccessInterface\":{\"name\":\"uicpd\",\"ipv4Address\":\"kzzlvmbmpaxmodf\",\"ipv4Subnet\":\"efyw\",\"ipv4Gateway\":\"pfvmwyhrfou\"},\"userPlaneAccessVirtualIpv4Addresses\":[\"aakc\",\"wiyzvqtmnubexkp\"]},\"location\":\"smond\",\"tags\":{\"jvp\":\"uxvypomgkopkwh\",\"ysmocmbqfqvmkcxo\":\"jqg\",\"tddckcb\":\"apvhelxprgly\"},\"id\":\"uejrjxgc\",\"name\":\"qibrhosxsdqrhzoy\",\"type\":\"i\"}],\"nextLink\":\"rq\"}")
            .toObject(PacketCoreDataPlaneListResult.class);
        Assertions.assertEquals("muwlauwzizxbm", model.value().get(0).location());
        Assertions.assertEquals("jefuzmuvpbttdumo", model.value().get(0).tags().get("p"));
        Assertions.assertEquals("tibqdxbxwakb", model.value().get(0).userPlaneAccessInterface().name());
        Assertions.assertEquals("qxn", model.value().get(0).userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("kzgxhurip", model.value().get(0).userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("podxunkb", model.value().get(0).userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals("mubyynt", model.value().get(0).userPlaneAccessVirtualIpv4Addresses().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreDataPlaneListResult model = new PacketCoreDataPlaneListResult().withValue(Arrays.asList(
            new PacketCoreDataPlaneInner().withLocation("muwlauwzizxbm")
                .withTags(mapOf("p", "jefuzmuvpbttdumo", "mnzb", "xe"))
                .withUserPlaneAccessInterface(new InterfaceProperties().withName("tibqdxbxwakb").withIpv4Address("qxn")
                    .withIpv4Subnet("kzgxhurip").withIpv4Gateway("podxunkb"))
                .withUserPlaneAccessVirtualIpv4Addresses(Arrays.asList("mubyynt", "lrb", "tkoievseotgq", "l")),
            new PacketCoreDataPlaneInner().withLocation("fcnihgwq")
                .withTags(mapOf("pkeqdcvdrhvoo", "edgfbcvkcvq", "dopcjwvnh", "sotbob"))
                .withUserPlaneAccessInterface(new InterfaceProperties().withName("dowwquuvxzxclvit")
                    .withIpv4Address("qzonosggbhcohf").withIpv4Subnet("sjnkal").withIpv4Gateway("tiiswacffg"))
                .withUserPlaneAccessVirtualIpv4Addresses(
                    Arrays.asList("zewk", "vhqcrail", "pnppfuf", "rwdmhdlxyjrxsa")),
            new PacketCoreDataPlaneInner().withLocation("smond")
                .withTags(mapOf("jvp", "uxvypomgkopkwh", "ysmocmbqfqvmkcxo", "jqg", "tddckcb", "apvhelxprgly"))
                .withUserPlaneAccessInterface(new InterfaceProperties().withName("uicpd")
                    .withIpv4Address("kzzlvmbmpaxmodf").withIpv4Subnet("efyw").withIpv4Gateway("pfvmwyhrfou"))
                .withUserPlaneAccessVirtualIpv4Addresses(Arrays.asList("aakc", "wiyzvqtmnubexkp"))));
        model = BinaryData.fromObject(model).toObject(PacketCoreDataPlaneListResult.class);
        Assertions.assertEquals("muwlauwzizxbm", model.value().get(0).location());
        Assertions.assertEquals("jefuzmuvpbttdumo", model.value().get(0).tags().get("p"));
        Assertions.assertEquals("tibqdxbxwakb", model.value().get(0).userPlaneAccessInterface().name());
        Assertions.assertEquals("qxn", model.value().get(0).userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("kzgxhurip", model.value().get(0).userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("podxunkb", model.value().get(0).userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals("mubyynt", model.value().get(0).userPlaneAccessVirtualIpv4Addresses().get(0));
    }

    // Use "Map.of" if available
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
