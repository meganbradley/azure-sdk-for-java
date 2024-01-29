// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectableContainer;
import org.junit.jupiter.api.Assertions;

public final class ProtectableContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectableContainer model = BinaryData.fromString(
            "{\"protectableContainerType\":\"ProtectableContainer\",\"friendlyName\":\"n\",\"backupManagementType\":\"MAB\",\"healthStatus\":\"xwczelpcire\",\"containerId\":\"feaenwab\"}")
            .toObject(ProtectableContainer.class);
        Assertions.assertEquals("n", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("xwczelpcire", model.healthStatus());
        Assertions.assertEquals("feaenwab", model.containerId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectableContainer model
            = new ProtectableContainer().withFriendlyName("n").withBackupManagementType(BackupManagementType.MAB)
                .withHealthStatus("xwczelpcire").withContainerId("feaenwab");
        model = BinaryData.fromObject(model).toObject(ProtectableContainer.class);
        Assertions.assertEquals("n", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("xwczelpcire", model.healthStatus());
        Assertions.assertEquals("feaenwab", model.containerId());
    }
}
