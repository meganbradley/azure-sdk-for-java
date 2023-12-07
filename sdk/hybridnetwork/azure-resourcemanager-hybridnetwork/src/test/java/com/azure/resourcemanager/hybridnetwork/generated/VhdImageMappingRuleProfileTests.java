// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.VhdImageMappingRuleProfile;
import org.junit.jupiter.api.Assertions;

public final class VhdImageMappingRuleProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VhdImageMappingRuleProfile model
            = BinaryData.fromString("{\"userConfiguration\":\"xqnrkcxk\"}").toObject(VhdImageMappingRuleProfile.class);
        Assertions.assertEquals("xqnrkcxk", model.userConfiguration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VhdImageMappingRuleProfile model = new VhdImageMappingRuleProfile().withUserConfiguration("xqnrkcxk");
        model = BinaryData.fromObject(model).toObject(VhdImageMappingRuleProfile.class);
        Assertions.assertEquals("xqnrkcxk", model.userConfiguration());
    }
}
