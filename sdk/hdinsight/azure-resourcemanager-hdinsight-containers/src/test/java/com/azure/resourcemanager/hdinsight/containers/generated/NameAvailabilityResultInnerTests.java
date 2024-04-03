// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.NameAvailabilityResultInner;
import org.junit.jupiter.api.Assertions;

public final class NameAvailabilityResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityResultInner model
            = BinaryData.fromString("{\"nameAvailable\":false,\"reason\":\"hlyfjhdgqgg\",\"message\":\"dunyg\"}")
                .toObject(NameAvailabilityResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("hlyfjhdgqgg", model.reason());
        Assertions.assertEquals("dunyg", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityResultInner model
            = new NameAvailabilityResultInner().withNameAvailable(false).withReason("hlyfjhdgqgg").withMessage("dunyg");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("hlyfjhdgqgg", model.reason());
        Assertions.assertEquals("dunyg", model.message());
    }
}
