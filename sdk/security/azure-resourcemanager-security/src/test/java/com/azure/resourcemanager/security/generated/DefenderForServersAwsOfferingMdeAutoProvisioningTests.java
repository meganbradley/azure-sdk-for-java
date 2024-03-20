// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingMdeAutoProvisioning;
import org.junit.jupiter.api.Assertions;

public final class DefenderForServersAwsOfferingMdeAutoProvisioningTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForServersAwsOfferingMdeAutoProvisioning model
            = BinaryData.fromString("{\"enabled\":false,\"configuration\":\"dataaiywbqgroigb\"}")
                .toObject(DefenderForServersAwsOfferingMdeAutoProvisioning.class);
        Assertions.assertEquals(false, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForServersAwsOfferingMdeAutoProvisioning model = new DefenderForServersAwsOfferingMdeAutoProvisioning()
            .withEnabled(false).withConfiguration("dataaiywbqgroigb");
        model = BinaryData.fromObject(model).toObject(DefenderForServersAwsOfferingMdeAutoProvisioning.class);
        Assertions.assertEquals(false, model.enabled());
    }
}
