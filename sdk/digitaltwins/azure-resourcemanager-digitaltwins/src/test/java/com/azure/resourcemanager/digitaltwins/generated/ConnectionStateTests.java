// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.models.ConnectionState;
import com.azure.resourcemanager.digitaltwins.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class ConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectionState model =
            BinaryData
                .fromString("{\"status\":\"Disconnected\",\"description\":\"tazak\",\"actionsRequired\":\"lahbcryff\"}")
                .toObject(ConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("tazak", model.description());
        Assertions.assertEquals("lahbcryff", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectionState model =
            new ConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                .withDescription("tazak")
                .withActionsRequired("lahbcryff");
        model = BinaryData.fromObject(model).toObject(ConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("tazak", model.description());
        Assertions.assertEquals("lahbcryff", model.actionsRequired());
    }
}
