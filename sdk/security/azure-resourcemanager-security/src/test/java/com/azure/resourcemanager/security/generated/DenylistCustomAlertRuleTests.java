// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DenylistCustomAlertRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DenylistCustomAlertRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DenylistCustomAlertRule model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"DenylistCustomAlertRule\",\"denylistValues\":[\"okeyyienj\",\"dlwtgrhpdj\"],\"valueType\":\"String\",\"displayName\":\"asxazjpqyegualhb\",\"description\":\"hejjz\",\"isEnabled\":false}")
                .toObject(DenylistCustomAlertRule.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("okeyyienj", model.denylistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DenylistCustomAlertRule model =
            new DenylistCustomAlertRule()
                .withIsEnabled(false)
                .withDenylistValues(Arrays.asList("okeyyienj", "dlwtgrhpdj"));
        model = BinaryData.fromObject(model).toObject(DenylistCustomAlertRule.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals("okeyyienj", model.denylistValues().get(0));
    }
}
