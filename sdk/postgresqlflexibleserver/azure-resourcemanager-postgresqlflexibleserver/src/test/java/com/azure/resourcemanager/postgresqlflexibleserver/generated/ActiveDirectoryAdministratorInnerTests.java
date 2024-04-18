// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ActiveDirectoryAdministratorInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrincipalType;
import org.junit.jupiter.api.Assertions;

public final class ActiveDirectoryAdministratorInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActiveDirectoryAdministratorInner model = BinaryData.fromString(
            "{\"properties\":{\"principalType\":\"Unknown\",\"principalName\":\"msxaobhd\",\"objectId\":\"mtqio\",\"tenantId\":\"zehtbmu\"},\"id\":\"ownoizhw\",\"name\":\"rxybqsoq\",\"type\":\"jgkdmbpazlobcu\"}")
            .toObject(ActiveDirectoryAdministratorInner.class);
        Assertions.assertEquals(PrincipalType.UNKNOWN, model.principalType());
        Assertions.assertEquals("msxaobhd", model.principalName());
        Assertions.assertEquals("mtqio", model.objectId());
        Assertions.assertEquals("zehtbmu", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActiveDirectoryAdministratorInner model
            = new ActiveDirectoryAdministratorInner().withPrincipalType(PrincipalType.UNKNOWN)
                .withPrincipalName("msxaobhd")
                .withObjectId("mtqio")
                .withTenantId("zehtbmu");
        model = BinaryData.fromObject(model).toObject(ActiveDirectoryAdministratorInner.class);
        Assertions.assertEquals(PrincipalType.UNKNOWN, model.principalType());
        Assertions.assertEquals("msxaobhd", model.principalName());
        Assertions.assertEquals("mtqio", model.objectId());
        Assertions.assertEquals("zehtbmu", model.tenantId());
    }
}
