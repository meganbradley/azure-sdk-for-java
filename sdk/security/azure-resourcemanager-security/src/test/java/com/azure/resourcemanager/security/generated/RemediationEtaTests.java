// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.RemediationEta;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class RemediationEtaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RemediationEta model =
            BinaryData
                .fromString("{\"eta\":\"2021-03-27T00:38:49Z\",\"justification\":\"dbztjhqtfbov\"}")
                .toObject(RemediationEta.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-27T00:38:49Z"), model.eta());
        Assertions.assertEquals("dbztjhqtfbov", model.justification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RemediationEta model =
            new RemediationEta()
                .withEta(OffsetDateTime.parse("2021-03-27T00:38:49Z"))
                .withJustification("dbztjhqtfbov");
        model = BinaryData.fromObject(model).toObject(RemediationEta.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-27T00:38:49Z"), model.eta());
        Assertions.assertEquals("dbztjhqtfbov", model.justification());
    }
}
