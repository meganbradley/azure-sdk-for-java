// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.AgConfiguration;
import com.azure.resourcemanager.sqlvirtualmachine.models.AgReplica;
import com.azure.resourcemanager.sqlvirtualmachine.models.Commit;
import com.azure.resourcemanager.sqlvirtualmachine.models.Failover;
import com.azure.resourcemanager.sqlvirtualmachine.models.ReadableSecondary;
import com.azure.resourcemanager.sqlvirtualmachine.models.Role;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AgConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgConfiguration model =
            BinaryData
                .fromString(
                    "{\"replicas\":[{\"sqlVirtualMachineInstanceId\":\"bcryffdfd\",\"role\":\"SECONDARY\",\"commit\":\"SYNCHRONOUS_COMMIT\",\"failover\":\"MANUAL\",\"readableSecondary\":\"ALL\"}]}")
                .toObject(AgConfiguration.class);
        Assertions.assertEquals("bcryffdfd", model.replicas().get(0).sqlVirtualMachineInstanceId());
        Assertions.assertEquals(Role.SECONDARY, model.replicas().get(0).role());
        Assertions.assertEquals(Commit.SYNCHRONOUS_COMMIT, model.replicas().get(0).commit());
        Assertions.assertEquals(Failover.MANUAL, model.replicas().get(0).failover());
        Assertions.assertEquals(ReadableSecondary.ALL, model.replicas().get(0).readableSecondary());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgConfiguration model =
            new AgConfiguration()
                .withReplicas(
                    Arrays
                        .asList(
                            new AgReplica()
                                .withSqlVirtualMachineInstanceId("bcryffdfd")
                                .withRole(Role.SECONDARY)
                                .withCommit(Commit.SYNCHRONOUS_COMMIT)
                                .withFailover(Failover.MANUAL)
                                .withReadableSecondary(ReadableSecondary.ALL)));
        model = BinaryData.fromObject(model).toObject(AgConfiguration.class);
        Assertions.assertEquals("bcryffdfd", model.replicas().get(0).sqlVirtualMachineInstanceId());
        Assertions.assertEquals(Role.SECONDARY, model.replicas().get(0).role());
        Assertions.assertEquals(Commit.SYNCHRONOUS_COMMIT, model.replicas().get(0).commit());
        Assertions.assertEquals(Failover.MANUAL, model.replicas().get(0).failover());
        Assertions.assertEquals(ReadableSecondary.ALL, model.replicas().get(0).readableSecondary());
    }
}
