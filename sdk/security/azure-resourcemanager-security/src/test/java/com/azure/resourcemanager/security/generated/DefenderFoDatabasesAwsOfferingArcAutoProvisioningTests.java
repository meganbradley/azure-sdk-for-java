// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderFoDatabasesAwsOfferingArcAutoProvisioning;
import com.azure.resourcemanager.security.models.DefenderFoDatabasesAwsOfferingArcAutoProvisioningConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DefenderFoDatabasesAwsOfferingArcAutoProvisioningTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderFoDatabasesAwsOfferingArcAutoProvisioning model = BinaryData.fromString(
            "{\"enabled\":true,\"cloudRoleArn\":\"lvs\",\"configuration\":{\"proxy\":\"wjopackyhydvik\",\"privateLinkScope\":\"ngpmillxgjsci\"}}")
            .toObject(DefenderFoDatabasesAwsOfferingArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("lvs", model.cloudRoleArn());
        Assertions.assertEquals("wjopackyhydvik", model.configuration().proxy());
        Assertions.assertEquals("ngpmillxgjsci", model.configuration().privateLinkScope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderFoDatabasesAwsOfferingArcAutoProvisioning model
            = new DefenderFoDatabasesAwsOfferingArcAutoProvisioning().withEnabled(true).withCloudRoleArn("lvs")
                .withConfiguration(new DefenderFoDatabasesAwsOfferingArcAutoProvisioningConfiguration()
                    .withProxy("wjopackyhydvik").withPrivateLinkScope("ngpmillxgjsci"));
        model = BinaryData.fromObject(model).toObject(DefenderFoDatabasesAwsOfferingArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("lvs", model.cloudRoleArn());
        Assertions.assertEquals("wjopackyhydvik", model.configuration().proxy());
        Assertions.assertEquals("ngpmillxgjsci", model.configuration().privateLinkScope());
    }
}
