// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AExtendedLocationDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocation;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocationType;
import org.junit.jupiter.api.Assertions;

public final class A2AExtendedLocationDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2AExtendedLocationDetails model = BinaryData.fromString(
            "{\"primaryExtendedLocation\":{\"name\":\"it\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"zvbrzcdbanfzndsc\",\"type\":\"EdgeZone\"}}")
            .toObject(A2AExtendedLocationDetails.class);
        Assertions.assertEquals("it", model.primaryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.primaryExtendedLocation().type());
        Assertions.assertEquals("zvbrzcdbanfzndsc", model.recoveryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.recoveryExtendedLocation().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2AExtendedLocationDetails model = new A2AExtendedLocationDetails()
            .withPrimaryExtendedLocation(new ExtendedLocation().withName("it").withType(ExtendedLocationType.EDGE_ZONE))
            .withRecoveryExtendedLocation(
                new ExtendedLocation().withName("zvbrzcdbanfzndsc").withType(ExtendedLocationType.EDGE_ZONE));
        model = BinaryData.fromObject(model).toObject(A2AExtendedLocationDetails.class);
        Assertions.assertEquals("it", model.primaryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.primaryExtendedLocation().type());
        Assertions.assertEquals("zvbrzcdbanfzndsc", model.recoveryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.recoveryExtendedLocation().type());
    }
}
