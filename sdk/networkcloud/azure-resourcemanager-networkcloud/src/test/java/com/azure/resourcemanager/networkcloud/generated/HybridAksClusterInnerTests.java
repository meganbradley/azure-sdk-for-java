// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.HybridAksClusterInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HybridAksClusterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HybridAksClusterInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"rp\",\"type\":\"xe\"},\"properties\":{\"associatedNetworkIds\":[\"nzbtbhj\"],\"cloudServicesNetworkId\":\"lkfg\",\"clusterId\":\"dneu\",\"controlPlaneCount\":7022736295865930419,\"controlPlaneNodes\":[{\"agentPoolId\":\"dyhtozfikdowwquu\",\"agentPoolName\":\"zx\",\"cpuCores\":5570761026718933034,\"diskSizeGB\":2045084080849688226,\"memorySizeGB\":7005518236104417042,\"nodePoolName\":\"osggbhc\",\"nodes\":[],\"vmCount\":2069679092860032516,\"vmSize\":\"jnkaljutiiswacff\"}],\"defaultCniNetworkId\":\"k\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"kfvhqcrailvpn\",\"hybridAksProvisionedClusterId\":\"pfuflrw\",\"provisioningState\":\"Succeeded\",\"volumes\":[\"xyjrxsagafcnih\",\"wqapnedgfbcvk\"],\"workerCount\":2287811005784307506,\"workerNodes\":[{\"agentPoolId\":\"eqdcv\",\"agentPoolName\":\"hvoodsotbobzd\",\"cpuCores\":4925429058781882288,\"diskSizeGB\":5687165155098120323,\"memorySizeGB\":8637599636999601474,\"nodePoolName\":\"wmgxcxrsl\",\"nodes\":[],\"vmCount\":6715322214265854823,\"vmSize\":\"oegrpkhjwn\"},{\"agentPoolId\":\"qsluicp\",\"agentPoolName\":\"gk\",\"cpuCores\":9204832734398806931,\"diskSizeGB\":2377355799268639179,\"memorySizeGB\":1390680046285193953,\"nodePoolName\":\"odfvuefywsbp\",\"nodes\":[],\"vmCount\":6406434103685186945,\"vmSize\":\"rfouyftaakcpw\"},{\"agentPoolId\":\"zvqtmnubexkp\",\"agentPoolName\":\"smond\",\"cpuCores\":4327896689449869677,\"diskSizeGB\":4652181983896123622,\"memorySizeGB\":1447049296384703440,\"nodePoolName\":\"kopkwhojvpajqgx\",\"nodes\":[],\"vmCount\":7500274521983784453,\"vmSize\":\"bq\"},{\"agentPoolId\":\"vmkcx\",\"agentPoolName\":\"apvhelxprgly\",\"cpuCores\":1729923694834862702,\"diskSizeGB\":6814865152361254049,\"memorySizeGB\":1605920653761823709,\"nodePoolName\":\"jrjxgciqibrhosx\",\"nodes\":[],\"vmCount\":4262007788493519907,\"vmSize\":\"o\"}]},\"location\":\"i\",\"tags\":{\"hwflu\":\"qyib\"},\"id\":\"zdtmhrkwofy\",\"name\":\"voqacpiexpbt\",\"type\":\"iwbwoenwashrtdtk\"}")
                .toObject(HybridAksClusterInner.class);
        Assertions.assertEquals("i", model.location());
        Assertions.assertEquals("qyib", model.tags().get("hwflu"));
        Assertions.assertEquals("rp", model.extendedLocation().name());
        Assertions.assertEquals("xe", model.extendedLocation().type());
        Assertions.assertEquals("nzbtbhj", model.associatedNetworkIds().get(0));
        Assertions.assertEquals(7022736295865930419L, model.controlPlaneCount());
        Assertions.assertEquals("pfuflrw", model.hybridAksProvisionedClusterId());
        Assertions.assertEquals(2287811005784307506L, model.workerCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HybridAksClusterInner model =
            new HybridAksClusterInner()
                .withLocation("i")
                .withTags(mapOf("hwflu", "qyib"))
                .withExtendedLocation(new ExtendedLocation().withName("rp").withType("xe"))
                .withAssociatedNetworkIds(Arrays.asList("nzbtbhj"))
                .withControlPlaneCount(7022736295865930419L)
                .withHybridAksProvisionedClusterId("pfuflrw")
                .withWorkerCount(2287811005784307506L);
        model = BinaryData.fromObject(model).toObject(HybridAksClusterInner.class);
        Assertions.assertEquals("i", model.location());
        Assertions.assertEquals("qyib", model.tags().get("hwflu"));
        Assertions.assertEquals("rp", model.extendedLocation().name());
        Assertions.assertEquals("xe", model.extendedLocation().type());
        Assertions.assertEquals("nzbtbhj", model.associatedNetworkIds().get(0));
        Assertions.assertEquals(7022736295865930419L, model.controlPlaneCount());
        Assertions.assertEquals("pfuflrw", model.hybridAksProvisionedClusterId());
        Assertions.assertEquals(2287811005784307506L, model.workerCount());
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
