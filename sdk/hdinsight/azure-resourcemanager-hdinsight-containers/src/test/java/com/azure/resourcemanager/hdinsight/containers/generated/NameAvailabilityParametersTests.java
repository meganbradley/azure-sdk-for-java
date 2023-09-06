// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.NameAvailabilityParameters;
import org.junit.jupiter.api.Assertions;

public final class NameAvailabilityParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityParameters model =
            BinaryData
                .fromString("{\"name\":\"dy\",\"type\":\"rwyhqmibzyhwitsm\"}")
                .toObject(NameAvailabilityParameters.class);
        Assertions.assertEquals("dy", model.name());
        Assertions.assertEquals("rwyhqmibzyhwitsm", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityParameters model = new NameAvailabilityParameters().withName("dy").withType("rwyhqmibzyhwitsm");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityParameters.class);
        Assertions.assertEquals("dy", model.name());
        Assertions.assertEquals("rwyhqmibzyhwitsm", model.type());
    }
}
