// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigureAlertRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigureAlertRequestProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConfigureAlertRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigureAlertRequest model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"sendToOwners\":\"evdphlxaol\",\"customEmailAddresses\":[\"trg\",\"jbp\",\"zfsinzgvf\",\"jrwzox\"],\"locale\":\"tfell\"}}")
                .toObject(ConfigureAlertRequest.class);
        Assertions.assertEquals("evdphlxaol", model.properties().sendToOwners());
        Assertions.assertEquals("trg", model.properties().customEmailAddresses().get(0));
        Assertions.assertEquals("tfell", model.properties().locale());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigureAlertRequest model =
            new ConfigureAlertRequest()
                .withProperties(
                    new ConfigureAlertRequestProperties()
                        .withSendToOwners("evdphlxaol")
                        .withCustomEmailAddresses(Arrays.asList("trg", "jbp", "zfsinzgvf", "jrwzox"))
                        .withLocale("tfell"));
        model = BinaryData.fromObject(model).toObject(ConfigureAlertRequest.class);
        Assertions.assertEquals("evdphlxaol", model.properties().sendToOwners());
        Assertions.assertEquals("trg", model.properties().customEmailAddresses().get(0));
        Assertions.assertEquals("tfell", model.properties().locale());
    }
}
