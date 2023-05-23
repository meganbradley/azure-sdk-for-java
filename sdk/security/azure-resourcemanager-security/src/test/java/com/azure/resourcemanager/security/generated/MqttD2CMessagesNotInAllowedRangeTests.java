// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.MqttD2CMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class MqttD2CMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MqttD2CMessagesNotInAllowedRange model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"MqttD2CMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT217H45M3S\",\"minThreshold\":1518371143,\"maxThreshold\":1402835309,\"displayName\":\"gryfqiuasig\",\"description\":\"wsocnequygdjbo\",\"isEnabled\":false}")
                .toObject(MqttD2CMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1518371143, model.minThreshold());
        Assertions.assertEquals(1402835309, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT217H45M3S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MqttD2CMessagesNotInAllowedRange model =
            new MqttD2CMessagesNotInAllowedRange()
                .withIsEnabled(false)
                .withMinThreshold(1518371143)
                .withMaxThreshold(1402835309)
                .withTimeWindowSize(Duration.parse("PT217H45M3S"));
        model = BinaryData.fromObject(model).toObject(MqttD2CMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1518371143, model.minThreshold());
        Assertions.assertEquals(1402835309, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT217H45M3S"), model.timeWindowSize());
    }
}
