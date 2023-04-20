// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingVmScanners;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingVmScannersConfiguration;
import com.azure.resourcemanager.security.models.ScanningMode;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderCspmAwsOfferingVmScannersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderCspmAwsOfferingVmScanners model =
            BinaryData
                .fromString(
                    "{\"enabled\":false,\"configuration\":{\"cloudRoleArn\":\"jch\",\"scanningMode\":\"Default\",\"exclusionTags\":{\"rfgdrwj\":\"ctofldseacdhztxk\",\"xet\":\"yewhfjsrwq\",\"thvmaxgnuyeamcmh\":\"gcwvrrmdqntycna\",\"wcpqtwl\":\"dfjeceho\"}}}")
                .toObject(DefenderCspmAwsOfferingVmScanners.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("jch", model.configuration().cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.configuration().scanningMode());
        Assertions.assertEquals("ctofldseacdhztxk", model.configuration().exclusionTags().get("rfgdrwj"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderCspmAwsOfferingVmScanners model =
            new DefenderCspmAwsOfferingVmScanners()
                .withEnabled(false)
                .withConfiguration(
                    new DefenderCspmAwsOfferingVmScannersConfiguration()
                        .withCloudRoleArn("jch")
                        .withScanningMode(ScanningMode.DEFAULT)
                        .withExclusionTags(
                            mapOf(
                                "rfgdrwj",
                                "ctofldseacdhztxk",
                                "xet",
                                "yewhfjsrwq",
                                "thvmaxgnuyeamcmh",
                                "gcwvrrmdqntycna",
                                "wcpqtwl",
                                "dfjeceho")));
        model = BinaryData.fromObject(model).toObject(DefenderCspmAwsOfferingVmScanners.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("jch", model.configuration().cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.configuration().scanningMode());
        Assertions.assertEquals("ctofldseacdhztxk", model.configuration().exclusionTags().get("rfgdrwj"));
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
