// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreState;
import org.junit.jupiter.api.Assertions;

public final class CrossRegionRestoreSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CrossRegionRestoreSettings model =
            BinaryData.fromString("{\"state\":\"Enabled\"}").toObject(CrossRegionRestoreSettings.class);
        Assertions.assertEquals(CrossRegionRestoreState.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CrossRegionRestoreSettings model = new CrossRegionRestoreSettings().withState(CrossRegionRestoreState.ENABLED);
        model = BinaryData.fromObject(model).toObject(CrossRegionRestoreSettings.class);
        Assertions.assertEquals(CrossRegionRestoreState.ENABLED, model.state());
    }
}
