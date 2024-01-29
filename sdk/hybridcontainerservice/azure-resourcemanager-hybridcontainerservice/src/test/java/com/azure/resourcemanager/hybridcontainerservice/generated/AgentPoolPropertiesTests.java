// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolUpdateProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.azure.resourcemanager.hybridcontainerservice.models.Ossku;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AgentPoolPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentPoolProperties model = BinaryData.fromString(
            "{\"count\":1785230840,\"vmSize\":\"ckyfih\",\"kubernetesVersion\":\"idf\",\"provisioningState\":\"Deleting\",\"status\":{\"currentState\":\"Updating\",\"errorMessage\":\"tymw\",\"readyReplicas\":[{\"count\":1072165585,\"vmSize\":\"hwxmnteiwa\",\"kubernetesVersion\":\"vkmijcmmxdcuf\"},{\"count\":763181495,\"vmSize\":\"pymzidnsezcxtbzs\",\"kubernetesVersion\":\"yc\"},{\"count\":1827996208,\"vmSize\":\"wmdwzjeiachboo\",\"kubernetesVersion\":\"lnrosfqp\"}]},\"osType\":\"Linux\",\"osSKU\":\"CBLMariner\",\"nodeLabels\":{\"swjdkirso\":\"ypyqrimzinp\",\"soifiyipjxsqw\":\"dqxhcrmnohjtckwh\",\"bznorcjxvsnby\":\"gr\",\"cyshurzafbljjgp\":\"qabnmoc\"},\"nodeTaints\":[\"qcjm\"],\"maxCount\":897001974,\"minCount\":1217713745,\"enableAutoScaling\":true,\"maxPods\":1581174340}")
            .toObject(AgentPoolProperties.class);
        Assertions.assertEquals(OsType.LINUX, model.osType());
        Assertions.assertEquals(Ossku.CBLMARINER, model.osSku());
        Assertions.assertEquals("ypyqrimzinp", model.nodeLabels().get("swjdkirso"));
        Assertions.assertEquals("qcjm", model.nodeTaints().get(0));
        Assertions.assertEquals(897001974, model.maxCount());
        Assertions.assertEquals(1217713745, model.minCount());
        Assertions.assertEquals(true, model.enableAutoScaling());
        Assertions.assertEquals(1581174340, model.maxPods());
        Assertions.assertEquals(1785230840, model.count());
        Assertions.assertEquals("ckyfih", model.vmSize());
        Assertions.assertEquals("tymw", model.status().errorMessage());
        Assertions.assertEquals(1072165585, model.status().readyReplicas().get(0).count());
        Assertions.assertEquals("hwxmnteiwa", model.status().readyReplicas().get(0).vmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentPoolProperties model = new AgentPoolProperties().withOsType(OsType.LINUX).withOsSku(Ossku.CBLMARINER)
            .withNodeLabels(mapOf("swjdkirso", "ypyqrimzinp", "soifiyipjxsqw", "dqxhcrmnohjtckwh", "bznorcjxvsnby",
                "gr", "cyshurzafbljjgp", "qabnmoc"))
            .withNodeTaints(Arrays.asList("qcjm")).withMaxCount(897001974).withMinCount(1217713745)
            .withEnableAutoScaling(true).withMaxPods(1581174340).withCount(1785230840).withVmSize("ckyfih")
            .withStatus(new AgentPoolProvisioningStatusStatus().withErrorMessage("tymw").withReadyReplicas(
                Arrays.asList(new AgentPoolUpdateProfile().withCount(1072165585).withVmSize("hwxmnteiwa"),
                    new AgentPoolUpdateProfile().withCount(763181495).withVmSize("pymzidnsezcxtbzs"),
                    new AgentPoolUpdateProfile().withCount(1827996208).withVmSize("wmdwzjeiachboo"))));
        model = BinaryData.fromObject(model).toObject(AgentPoolProperties.class);
        Assertions.assertEquals(OsType.LINUX, model.osType());
        Assertions.assertEquals(Ossku.CBLMARINER, model.osSku());
        Assertions.assertEquals("ypyqrimzinp", model.nodeLabels().get("swjdkirso"));
        Assertions.assertEquals("qcjm", model.nodeTaints().get(0));
        Assertions.assertEquals(897001974, model.maxCount());
        Assertions.assertEquals(1217713745, model.minCount());
        Assertions.assertEquals(true, model.enableAutoScaling());
        Assertions.assertEquals(1581174340, model.maxPods());
        Assertions.assertEquals(1785230840, model.count());
        Assertions.assertEquals("ckyfih", model.vmSize());
        Assertions.assertEquals("tymw", model.status().errorMessage());
        Assertions.assertEquals(1072165585, model.status().readyReplicas().get(0).count());
        Assertions.assertEquals("hwxmnteiwa", model.status().readyReplicas().get(0).vmSize());
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
