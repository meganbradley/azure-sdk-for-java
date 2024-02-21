// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPointExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlRecoveryPointExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlRecoveryPointExtendedInfo model = BinaryData.fromString(
            "{\"dataDirectoryTimeInUTC\":\"2021-06-26T08:39:03Z\",\"dataDirectoryPaths\":[{\"type\":\"Invalid\",\"path\":\"vbmqzbqq\",\"logicalName\":\"aj\"}]}")
            .toObject(AzureWorkloadSqlRecoveryPointExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-26T08:39:03Z"), model.dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("vbmqzbqq", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("aj", model.dataDirectoryPaths().get(0).logicalName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlRecoveryPointExtendedInfo model = new AzureWorkloadSqlRecoveryPointExtendedInfo()
            .withDataDirectoryTimeInUtc(OffsetDateTime.parse("2021-06-26T08:39:03Z"))
            .withDataDirectoryPaths(Arrays.asList(new SqlDataDirectory().withType(SqlDataDirectoryType.INVALID)
                .withPath("vbmqzbqq").withLogicalName("aj")));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRecoveryPointExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-26T08:39:03Z"), model.dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("vbmqzbqq", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("aj", model.dataDirectoryPaths().get(0).logicalName());
    }
}
