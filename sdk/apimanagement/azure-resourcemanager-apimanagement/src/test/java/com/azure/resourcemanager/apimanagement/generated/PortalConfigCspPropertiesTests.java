// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.PortalConfigCspProperties;
import com.azure.resourcemanager.apimanagement.models.PortalSettingsCspMode;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PortalConfigCspPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortalConfigCspProperties model =
            BinaryData
                .fromString(
                    "{\"mode\":\"reportOnly\",\"reportUri\":[\"qncfvdscnhe\",\"vwfnqqwypvn\",\"r\"],\"allowedSources\":[\"od\",\"ggrssgwjfkain\"]}")
                .toObject(PortalConfigCspProperties.class);
        Assertions.assertEquals(PortalSettingsCspMode.REPORT_ONLY, model.mode());
        Assertions.assertEquals("qncfvdscnhe", model.reportUri().get(0));
        Assertions.assertEquals("od", model.allowedSources().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortalConfigCspProperties model =
            new PortalConfigCspProperties()
                .withMode(PortalSettingsCspMode.REPORT_ONLY)
                .withReportUri(Arrays.asList("qncfvdscnhe", "vwfnqqwypvn", "r"))
                .withAllowedSources(Arrays.asList("od", "ggrssgwjfkain"));
        model = BinaryData.fromObject(model).toObject(PortalConfigCspProperties.class);
        Assertions.assertEquals(PortalSettingsCspMode.REPORT_ONLY, model.mode());
        Assertions.assertEquals("qncfvdscnhe", model.reportUri().get(0));
        Assertions.assertEquals("od", model.allowedSources().get(0));
    }
}
