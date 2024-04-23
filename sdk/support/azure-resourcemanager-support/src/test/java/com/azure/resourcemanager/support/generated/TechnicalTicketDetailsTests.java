// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import org.junit.jupiter.api.Assertions;

public final class TechnicalTicketDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TechnicalTicketDetails model
            = BinaryData.fromString("{\"resourceId\":\"dhmdua\"}").toObject(TechnicalTicketDetails.class);
        Assertions.assertEquals("dhmdua", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TechnicalTicketDetails model = new TechnicalTicketDetails().withResourceId("dhmdua");
        model = BinaryData.fromObject(model).toObject(TechnicalTicketDetails.class);
        Assertions.assertEquals("dhmdua", model.resourceId());
    }
}
