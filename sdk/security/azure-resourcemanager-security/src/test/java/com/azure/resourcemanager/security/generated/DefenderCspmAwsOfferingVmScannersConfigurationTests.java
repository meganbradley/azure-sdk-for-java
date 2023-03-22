// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderCspmAwsOfferingVmScannersConfiguration;
import com.azure.resourcemanager.security.models.ScanningMode;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderCspmAwsOfferingVmScannersConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderCspmAwsOfferingVmScannersConfiguration model =
            BinaryData
                .fromString(
                    "{\"cloudRoleArn\":\"djxyxgbkkqvjcteo\",\"scanningMode\":\"Default\",\"exclusionTags\":{\"zdpv\":\"lskkzpxvj\",\"fsnggytexvzilm\":\"cojhpcnabx\"}}")
                .toObject(DefenderCspmAwsOfferingVmScannersConfiguration.class);
        Assertions.assertEquals("djxyxgbkkqvjcteo", model.cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("lskkzpxvj", model.exclusionTags().get("zdpv"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderCspmAwsOfferingVmScannersConfiguration model =
            new DefenderCspmAwsOfferingVmScannersConfiguration()
                .withCloudRoleArn("djxyxgbkkqvjcteo")
                .withScanningMode(ScanningMode.DEFAULT)
                .withExclusionTags(mapOf("zdpv", "lskkzpxvj", "fsnggytexvzilm", "cojhpcnabx"));
        model = BinaryData.fromObject(model).toObject(DefenderCspmAwsOfferingVmScannersConfiguration.class);
        Assertions.assertEquals("djxyxgbkkqvjcteo", model.cloudRoleArn());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("lskkzpxvj", model.exclusionTags().get("zdpv"));
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
