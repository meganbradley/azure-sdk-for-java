// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.SqlServerResourceSettings;
import org.junit.jupiter.api.Assertions;

public final class SqlServerResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlServerResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.Sql/servers\",\"targetResourceName\":\"gdtpnapnyiro\",\"targetResourceGroupName\":\"hpigv\"}")
                .toObject(SqlServerResourceSettings.class);
        Assertions.assertEquals("gdtpnapnyiro", model.targetResourceName());
        Assertions.assertEquals("hpigv", model.targetResourceGroupName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlServerResourceSettings model =
            new SqlServerResourceSettings().withTargetResourceName("gdtpnapnyiro").withTargetResourceGroupName("hpigv");
        model = BinaryData.fromObject(model).toObject(SqlServerResourceSettings.class);
        Assertions.assertEquals("gdtpnapnyiro", model.targetResourceName());
        Assertions.assertEquals("hpigv", model.targetResourceGroupName());
    }
}
