// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ActiveConnectionsNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class ActiveConnectionsNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActiveConnectionsNotInAllowedRange model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"ActiveConnectionsNotInAllowedRange\",\"timeWindowSize\":\"PT80H24M54S\",\"minThreshold\":1003409215,\"maxThreshold\":1392264110,\"displayName\":\"zykmktpvwxqcse\",\"description\":\"hkhufm\",\"isEnabled\":false}")
                .toObject(ActiveConnectionsNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1003409215, model.minThreshold());
        Assertions.assertEquals(1392264110, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT80H24M54S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActiveConnectionsNotInAllowedRange model =
            new ActiveConnectionsNotInAllowedRange()
                .withIsEnabled(false)
                .withMinThreshold(1003409215)
                .withMaxThreshold(1392264110)
                .withTimeWindowSize(Duration.parse("PT80H24M54S"));
        model = BinaryData.fromObject(model).toObject(ActiveConnectionsNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1003409215, model.minThreshold());
        Assertions.assertEquals(1392264110, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT80H24M54S"), model.timeWindowSize());
    }
}
